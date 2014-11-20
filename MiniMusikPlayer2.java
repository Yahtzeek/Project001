import javax.sound.midi.*;
public class MiniMusikPlayer2 implements ControllerEventListener {

	static int zaehler = 0;

	public static void main(String[] args) {
		MiniMusikPlayer2 mini = new MiniMusikPlayer2();
		mini.los();
	}


	public void los() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();

			int[] gewuenschteEvents = {127};
			sequencer.addControllerEventListener(this, gewuenschteEvents);

			Sequence seq = new Sequence(Sequence.PPQ, 4);
			Track track = seq.createTrack();

			for (int i = 5; i < 60; i += 4) {
				track.add(eventErzeugen(144,1,i,100,i));
				track.add(eventErzeugen(176,1,127,0,i));
				track.add(eventErzeugen(128,1,i,100,i+2));
			}

			sequencer.setSequence(seq);
			sequencer.setTempoInBPM(220);
			sequencer.start();
			Thread.sleep(5000);
			sequencer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // los


	public void controlChange(ShortMessage event) {
		System.out.println("1a = " + ++zaehler);
	} // controlChange


	public MidiEvent eventErzeugen(int comd, int chan, int one, int two, int tick) {
		MidiEvent event = null;
		try {
			ShortMessage a = new ShortMessage();
			a.setMessage(comd, chan, one, two);
			event = new MidiEvent(a, tick);
		} catch (Exception e) {
		}
		return event;
	}
}
