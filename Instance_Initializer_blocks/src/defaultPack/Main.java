package defaultPack;


     class  Egg {
        public Egg() {
            number = 5;
        }

        public static void main(String[] args) {
            Egg egg1 = new Egg();
            System.out.println(egg1.number);
        }
        private  int number = 1;
         {
             number = 2;
         }
    }
