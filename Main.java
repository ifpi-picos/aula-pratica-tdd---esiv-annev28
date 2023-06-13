class Dollar {
    private int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    class Franc {
        private int amount;

        Franc(int amount) {
            this.amount = amount;
        }

        Money times(int multiplier) {
            return new Franc(amount * multiplier);
        }

        public boolean equals(Object object) {
            Franc franc = (Franc) object;
            return amount == franc.amount;
        }
    }

    public boolean equals(Object object) {
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount;
    }
}