import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void shouldSetAmountWaveFirst() {
        Radio radio = new Radio(20);

        Assertions.assertEquals(0, radio.getMinWave());
        Assertions.assertEquals(19, radio.getMaxWave());
        Assertions.assertEquals(0, radio.getCurrentWave());

    }

    @Test
    public void shouldSetAmountWaveSecond() {
        Radio radio = new Radio(99);

        Assertions.assertEquals(0, radio.getMinWave());
        Assertions.assertEquals(98, radio.getMaxWave());
        Assertions.assertEquals(0, radio.getCurrentWave());

    }

    @Test
    public void shouldSetAmountWaveThird() {
        Radio radio = new Radio(2);

        Assertions.assertEquals(0, radio.getMinWave());
        Assertions.assertEquals(1, radio.getMaxWave());
        Assertions.assertEquals(0, radio.getCurrentWave());

    }

    @Test
    public void shouldSetAmountWaveByDefault() {
        Radio radio = new Radio();

        Assertions.assertEquals(0, radio.getMinWave());
        Assertions.assertEquals(9, radio.getMaxWave());
        Assertions.assertEquals(0, radio.getCurrentWave());

    }

    @Test
    public void shouldSetWaveFirst() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(1);

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveSecond() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(-1);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveThird() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(0);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveFourth() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(8);

        int expected = 8;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveFifth() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(9);

        int expected = 9;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveSixth() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(20);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberWaveFirst() {
        Radio wave = new Radio(20);
        wave.setNumberWave(1);

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberWaveSecond() {
        Radio wave = new Radio(20);
        wave.setNumberWave(21);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberWaveThird() {
        Radio wave = new Radio(20);
        wave.setNumberWave(-1);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveFirst() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(1);

        wave.setNextWave();

        int expected = 2;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveSecond() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(19);

        wave.setNextWave();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveThird() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(0);

        wave.setNextWave();

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveFirst() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(0);

        wave.setPrevWave();

        int expected = 19;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveSecond() {
        Radio wave = new Radio(20);
        wave.setCurrentWave(1);

        wave.setPrevWave();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFirst() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(110);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeSecond() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(100);

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeThird() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(99);

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFourth() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFifth() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeSixth() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeFirst() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(100);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeSecond() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(99);

        volume.increaseVolume();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeThird() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeFirst() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeSecond() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(1);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeThird() {
        Radio volume = new Radio(20);
        volume.setCurrentVolume(100);

        volume.decreaseVolume();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
