public class Radio {
    private int currentNumberStation;
    private int currentVolume;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getVolume() {
        return currentVolume;
    }

    public int setCurrentNumberStation(int newCurrentNumberStation) {
        if (newCurrentNumberStation > -1 && newCurrentNumberStation < 10) {
            currentNumberStation = newCurrentNumberStation;
        }
        return currentNumberStation;
    }

    public int setVolume(int newVolume) {
        if (newVolume > -1 && newVolume < 11) {
            currentVolume = newVolume;
        }
        return currentNumberStation;
    }


    public void nextNumberStation() {
        currentNumberStation = currentNumberStation + 1;
        if (currentNumberStation == 10) {
            currentNumberStation = 0;
        }
    }

    public void prevNumberStation() {
        currentNumberStation = currentNumberStation - 1;
        if (currentNumberStation == -1) {
            currentNumberStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reductionVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
