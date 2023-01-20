package com.project.Metodos;

/**
 *
 * @author aspxe
 */
public class Metodos {

    public String funcion(double grado6, double grado5, double grado4, double grado3, double grado2, double grado1, double constante) {
        String funcion = "";
        String c6 = "", c5 = "", c4 = "", c3 = "", c2 = "", c1 = "", cons = "";

        if (grado6 == 0) {
            c6 = "";
        } else {
            if (grado6 > 0) {
                c6 = grado6 + "x" + "^" + "6";
            } else if (grado6 < 0) {
                c6 = grado6 + "x" + "^" + "6";
            }

        }
        if (grado5 == 0) {
            c5 = "";
        } else {
            if (grado5 > 0) {
                c5 = "+" + grado5 + "x" + "^" + "5";
            } else if (grado5 < 0) {
                c5 = grado5 + "x" + "^" + "5";
            }

        }
        if (grado4 == 0) {
            c4 = "";
        } else {
            if (grado4 > 0) {
                c4 = "+" + grado4 + "x" + "^" + "4";
            } else if (grado4 < 0) {
                c4 = grado4 + "x" + "^" + "4";
            }

        }
        if (grado3 == 0) {
            c3 = "";
        } else {
            if (grado3 > 0) {
                c3 = "+" + grado3 + "x" + "^" + "3";
            } else if (grado3 < 0) {
                c3 = grado3 + "x" + "^" + "3";
            }

        }
        if (grado2 == 0) {
            c2 = "";
        } else {
            if (grado2 > 0) {
                c2 = "+" + grado2 + "x" + "^" + "2";
            } else if (grado2 < 0) {
                c2 = grado2 + "x" + "^" + "2";
            }

        }
        if (grado1 == 0) {
            c1 = "";
        } else {
            if (grado1 > 0) {
                c1 = "+" + grado1 + "x" + "^" + "1";
            } else if (grado1 < 0) {
                c1 = grado1 + "x" + "^" + "1";
            }

        }
        if (constante == 0) {
            cons = "";
        } else {
            if (constante > 0) {
                cons = "+" + constante;
            } else if (constante < 0) {
                cons = "" + constante;
            }

        }

        funcion = c6 + c5 + c4 + c3 + c2 + c1 + cons;

        return funcion;
    }

    public String derivada(double grado6, double grado5, double grado4, double grado3, double grado2, double grado1, double constante) {
        String derivada = "";
        String c6 = "", c5 = "", c4 = "", c3 = "", c2 = "", c1 = "", cons = "";

        if (grado6 == 0) {
            c6 = "";
        } else {
            if (grado6 > 0) {
                c6 = "+" + (grado6 * 6) + "x" + "^" + "5";
            } else if (grado6 < 0) {
                c6 = (grado6 * 6) + "x" + "^" + "5";
            }

        }
        
        if (grado5 == 0) {
            c5 = "";
        } else {
            if (grado5 > 0) {
                c5 = "+" + (grado5 * 5) + "x" + "^" + "4";
            } else if (grado5 < 0) {
                c5 = (grado5 * 5) + "x" + "^" + "4";
            }

        }
        if (grado4 == 0) {
            c4 = "";
        } else {
            if (grado4 > 0) {
                c4 = "+" + (grado4 * 4) + "x" + "^" + "3";
            } else if (grado4 < 0) {
                c4 = (grado4 * 4) + "x" + "^" + "3";
            }

        }
        if (grado3 == 0) {
            c3 = "";
        } else {
            if (grado3 > 0) {
                c3 = "+" + (grado3 * 3) + "x" + "^" + "2";
            } else if (grado3 < 0) {
                c3 = (grado3 * 3) + "x" + "^" + "2";
            }

        }
        if (grado2 == 0) {
            c2 = "";
        } else {
            if (grado2 > 0) {
                c2 = "+" + (grado2 * 2) + "x";
            } else if (grado2 < 0) {
                c2 = (grado2 * 2) + "x";
            }

        }
        if (grado1 == 0) {
            c1 = "";
        } else {
            if (grado1 > 0) {
                c1 = "+"+grado1;
            } else if (grado1 < 0) {
                c1 = ""+grado1;
            }

        }
        if (constante == 0) {
            cons = "";
        } else {
            if (constante > 0) {
                cons = "";
            } else if (constante < 0) {
                cons = "";
            }

        }
        

        derivada = c6 + c5 + c4 + c3 + c2 + c1 + cons;

        return derivada;
    }

}
