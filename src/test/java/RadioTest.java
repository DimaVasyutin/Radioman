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

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
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
        radio.setVolume(102);
        radio.setCurrentNumberStation(15);

        int expected = 0;
        int actualVolume = radio.getVolume();
        int actualStation = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actualVolume);
        Assertions.assertEquals(expected, actualStation);
    }

    @Test
    public void shouldSetSubMinStationAndVolume() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.setCurrentNumberStation(-1);

        int expected = 0;
        int actualVolume = radio.getVolume();
        int actualStation = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actualVolume);
        Assertions.assertEquals(expected, actualStation);
    }

    @Test
    public void shouldSetSizeAmountStation() {
        Radio radio = new Radio(30);


        int expected = 30;
        int actual = radio.getSizeAmountStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextStationWithNewSize() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberStation(25);
        radio.nextNumberStation();

        int expected = 26;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPrevStationWithNewSize() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberStation(25);
        radio.prevNumberStation();

        int expected = 24;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextAboveMaxStationWithNewSize() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberStation(29);
        radio.nextNumberStation();

        int expected = 0;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextSubMinStationWithNewSize() {
        Radio radio = new Radio(30);
        radio.setCurrentNumberStation(0);
        radio.prevNumberStation();

        int expected = 29;
        int actual = radio.getCurrentNumberStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNegativeSizeAmountStation() {
        Radio radio = new Radio(-5);

        int expected = 10;
        int actual = radio.getSizeAmountStation();

        Assertions.assertEquals(expected, actual);

    }

}
