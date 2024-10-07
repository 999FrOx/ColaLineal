 class Cola {
        private String [] elementos;
        private int frente;
        private int fin;
        private int tamanio;

        public Cola(int capacidad) {
            elementos = new String [capacidad];
            frente = 0;
            fin = -1;
            tamanio = 0;
        }

        public void encolar(String elemento) {
            if (estaLlena()) {
                throw new RuntimeException("Citas no diponibles!!!");
            }
            fin = (fin + 1) % elementos.length;
            elementos[fin] = elemento;
            tamanio++;
        }

        public String desencolar() {
            if (estaVacia()) {
                throw new RuntimeException("No hay pacientes en espera.");
            }
            String elemento = elementos[frente];
            frente = (frente + 1) % elementos.length;
            tamanio--;
            return elemento;
        }

        public boolean estaVacia() {
            return tamanio == 0;
        }

        public boolean estaLlena() {
            return tamanio == elementos.length;
        }

        public void mostrarCola() {
            if (estaVacia()) {
                System.out.println("No hay pacientes en espera.");
                return;
            }
            System.out.print("Lista de pacientes en espera: ");
            for (int i = 0; i < tamanio; i++) {
                System.out.print(elementos[(frente + i) % elementos.length] + " ");
            }
            System.out.println();
        }
    }
