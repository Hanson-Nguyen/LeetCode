class ParkingSystem {

    int bigLot;
    int mediumLot;
    int smallLot;
    
    public ParkingSystem(int big, int medium, int small) {
        bigLot = big;
        mediumLot = medium;
        smallLot = small;
        
    }
    
    public boolean addCar(int carType) {
     
        boolean result = false;
        
        if (carType == 1) {
            result = (bigLot > 0);
            bigLot--;
        }
        else if (carType == 2) {
            result = (mediumLot > 0);
            mediumLot--;
        }
        else if (carType == 3) {
            result = (smallLot > 0);
            smallLot--;
        }
        
        return result;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */