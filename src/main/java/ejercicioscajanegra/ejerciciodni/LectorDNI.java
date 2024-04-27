package ejercicioscajanegra.ejerciciodni;

public class LectorDNI {

        private String dni;

        public LectorDNI() {
        }

        public void setDni(String dni) {
            this.dni = dni;
        }

        public boolean comprobarLongitud() {
            return dni.length() == 9;
        }

        public boolean comprobarEstrucura(){
            for (int i = 0; i < 8; i++) {
                if (!Character.isDigit(dni.charAt(i))) {
                    return false;
                }
            }
            return true;
        }

        public boolean comprobarLetra() {
            Character letra = dni.charAt(dni.length() - 1);
            if (Character.isLetter(letra)) {
                return true;
            } else {
                return false;
            }
        }

        public boolean letraCorrecta() {
            String dniSinLetra = dni.substring(0,dni.length()-1);
            String letraDni = dni.substring(9);
            int numeroDni = Integer.parseInt(dniSinLetra);
            int resto = numeroDni % 23;

            if (resto == 0 && dni.endsWith("T") || dni.endsWith("t") || resto == 1 && dni.endsWith("R") || dni.endsWith("r") || resto == 2 && dni.endsWith("W") || dni.endsWith("w") ||  resto == 3 && dni.endsWith("A") || dni.endsWith("a") ||  resto == 4 && dni.endsWith("G") || dni.endsWith("g") || resto == 5 && dni.endsWith("M") || dni.endsWith("m") ||  resto == 6 && dni.endsWith("Y") || dni.endsWith("y") || resto == 7 && dni.endsWith("F") || dni.endsWith("f") ||  resto == 8 && dni.endsWith("P") || dni.endsWith("p") || resto == 9 && dni.endsWith("D") || dni.endsWith("d") ||  resto == 10 && dni.endsWith("X") || dni.endsWith("x")  ||  resto == 11 && dni.endsWith("B") || dni.endsWith("b") || resto == 12 && dni.endsWith("N") || dni.endsWith("n") ||  resto == 13 && dni.endsWith("J") || dni.endsWith("j") || resto == 14 && dni.endsWith("Z") || dni.endsWith("z") ||  resto == 15 && dni.endsWith("S") || dni.endsWith("s") || resto == 16 && dni.endsWith("Q") || dni.endsWith("q") ||  resto == 17 && dni.endsWith("V") || dni.endsWith("v") || resto == 18 && dni.endsWith("H") || dni.endsWith("h") ||  resto == 19 && dni.endsWith("L") || dni.endsWith("l") || resto == 20 && dni.endsWith("C") || dni.endsWith("c") ||  resto == 21 && dni.endsWith("K") || dni.endsWith("k") || resto == 22 && dni.endsWith("E") || dni.endsWith("e")){
                return true;
            } else {
                return false;
            }


        }
        public boolean validarDNI(){
            if (comprobarLongitud() && comprobarLetra() && comprobarEstrucura() && letraCorrecta()){
                return true;
            } else {
                return false;
            }
        }



    }


