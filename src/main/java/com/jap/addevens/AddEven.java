package com.jap.addevens;

class AddEven {
    public static void main(String[] args) {
        AddEven input = new AddEven();
        long result = input.addEvens(9);
        System.out.println("result = " + result);
    }

    /**
     * It adds all the even numbers from 1 to the number passed in
     *
     * @param number the number to be added
     * @return The sum of all even numbers from 1 to the number given
     */
    public long addEvens(long number) {
        if (number == 1) {
            return 0;
        }
        if (number <= 0) {
            return 0;
        }
        if ((number % 2 == 0)) {
            return number + addEvens(number - 1);
        } else {
            return addEvens((number - 1));
        }
    }
}

