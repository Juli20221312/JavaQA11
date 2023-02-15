import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;

public class RadioTest {

    @Test
    public void shouldSetWaveFirst() {
        Radio wave = new Radio();
        wave.setCurrentWave(1);

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveSecond() {
        Radio wave = new Radio();
        wave.setCurrentWave(-1);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveThird() {
        Radio wave = new Radio();
        wave.setCurrentWave(0);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveFourth() {
        Radio wave = new Radio();
        wave.setCurrentWave(8);

        int expected = 8;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveFifth() {
        Radio wave = new Radio();
        wave.setCurrentWave(9);

        int expected = 9;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetWaveSixth() {
        Radio wave = new Radio();
        wave.setCurrentWave(10);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberWaveFirst(){
       Radio wave = new Radio();
       wave.setNumberWave(1);

       int expected = 1;
       int actual = wave.getCurrentWave();

       Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberWaveSecond(){
        Radio wave = new Radio();
        wave.setNumberWave(11);

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveFirst() {
        Radio wave = new Radio();
        wave.setCurrentWave(1);

        wave.setNextWave();

        int expected = 2;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveSecond() {
        Radio wave = new Radio();
        wave.setCurrentWave(9);

        wave.setNextWave();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextWaveThird() {
        Radio wave = new Radio();
        wave.setCurrentWave(0);

        wave.setNextWave();

        int expected = 1;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveFirst() {
        Radio wave = new Radio();
        wave.setCurrentWave(0);

        wave.setPrevWave();

        int expected = 9;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevWaveSecond() {
        Radio wave = new Radio();
        wave.setCurrentWave(1);

        wave.setPrevWave();

        int expected = 0;
        int actual = wave.getCurrentWave();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFirst() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeSecond() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeThird() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFourth() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeFifth() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeSixth() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeFirst() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeSecond() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.increaseVolume();

        int expected = 10;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldincreaseVolumeThird() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.increaseVolume();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeFirst() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeSecond() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);

        volume.decreaseVolume();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shoulddecreaseVolumeThird() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.decreaseVolume();

        int expected = 9;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
