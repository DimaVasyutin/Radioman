import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(2);
        radio.nextNumberStation();

        int expected = 3;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(3);
        radio.prevNumberStation();

        int expected = 2;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(9);
        radio.nextNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationSubMin() {
        Radio radio = new Radio();

        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();

        int expected = 9;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionVolume() {
        Radio radio = new Radio();

        radio.setVolume(5);
        radio.reductionVolume();

        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseAboveMaxVolume() {
        Radio radio = new Radio();

        radio.setVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReductionSubMinVolume() {
        Radio radio = new Radio();

        radio.setVolume(0);
        radio.reductionVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxStationAndVolume() {
        Radio radio = new Radio();
        radio.setVolume(15);
        radio.setCurrentNumberStation(15);

        int expected = 0;
        int actualVolume = radio.getVolume();
        int actualStation = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actualVolume);
        Assertions.assertEquals(expected, actualStation);
    }

    @Test
    public void shouldSetSubMaxStationAndVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actualVolume = radio.getVolume();
        int actualStation = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actualVolume);
        Assertions.assertEquals(expected, actualStation);
    }

}
