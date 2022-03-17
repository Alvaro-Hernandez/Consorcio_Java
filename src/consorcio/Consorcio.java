/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consorcio;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Hernandez
 */
public class Consorcio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        String[] Meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Novimbre", "Diciembre"};
        int Consorcio[][][] = new int[3][3][12];
        //Vallejos
        int Vallejo1 = 0;
        int Vallejo2 = 0;
        int Vallejo3 = 0;
        //Lomas
        int Lomas1 = 0;
        int Lomas2 = 0;
        int Lomas3 = 0;
        //Cerritos
        int Cerritos1 = 0;
        int Cerritos2 = 0;
        int Cerritos3 = 0;
        
        //Segun Año
        int BAño;
        
        do {
            N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número según la acción a realizar:"
                    + "\n" + "1. Insertar Datos" + "\n" + "2. Informes" + "\n" + "3. Salir"));
            switch (N) {

                case 1:
                    // 3 Años de Vallejo
                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2019 de Vallejos");
                    for (int i = 0; i < 1; i++) {
                        for (int j = 0; j < 1; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Vallejo1 = Vallejo1 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2020 de Vallejos");
                    for (int i = 0; i < 1; i++) {
                        for (int j = 1; j < 2; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Vallejo2 = Vallejo2 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2021 de Vallejos");
                    for (int i = 0; i < 1; i++) {
                        for (int j = 2; j < 3; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Vallejo3 = Vallejo3 + Consorcio[i][j][k];
                            }
                        }
                    }

                    // 3 años de Lomas
                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2019 de Lomas");
                    for (int i = 1; i < 2; i++) {
                        for (int j = 0; j < 1; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Lomas1 = Lomas1 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2019 de Lomas");
                    for (int i = 1; i < 2; i++) {
                        for (int j = 0; j < 1; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Lomas1 = Lomas1 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2020 de Lomas");
                    for (int i = 1; i < 2; i++) {
                        for (int j = 1; j < 2; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Lomas2 = Lomas2 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2021 de Lomas");
                    for (int i = 1; i < 2; i++) {
                        for (int j = 2; j < 3; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Lomas3 = Lomas3 + Consorcio[i][j][k];
                            }
                        }
                    }

                    // 3 años de Cerritos
                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2019 de Cerritos");
                    for (int i = 2; i < 3; i++) {
                        for (int j = 0; j < 1; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Cerritos1 = Cerritos1 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2020 de Cerritos");
                    for (int i = 2; i < 3; i++) {
                        for (int j = 1; j < 2; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Cerritos2 = Cerritos2 + Consorcio[i][j][k];
                            }
                        }
                    }

                    JOptionPane.showMessageDialog(null, "Ingrese las Ventas del año 2021 de Cerritos");
                    for (int i = 2; i < 3; i++) {
                        for (int j = 2; j < 3; j++) {
                            for (int k = 0; k < 12; k++) {
                                Consorcio[i][j][k] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las ventas del mes de " + Meses[k] + ":"));
                                Cerritos3 = Cerritos3 + Consorcio[i][j][k];
                            }
                        }
                    }

                    break;
                case 2:
                    int Op;
                    do {
                        Op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número según la acción a realizar:"
                                + "\n" + "1. Ventas Totales por Año de la Sucursal Lomas" + "\n" + "2. Sucursal que mas vendio en un año en Particular"
                                + "\n" + "3. La sucursal que menos vendio en un año en Particular" + "\n" + "4. Ventas por Semestre de cada año de las 3 Sucursales"
                                + "\n" + "5. Salir"));
                        switch (Op) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Ventas Totales del Año 2019: " + Lomas1 + "\n" + "Ventas Totales del año 2020: " + Lomas2
                                        + "\n" + "Ventas Totales del Año 2020: " + Lomas3);
                                break;

                            case 2:
                                
                                JOptionPane.showMessageDialog(null, "Tenga en Cuenta que son 3 años: 2019, 2020, 2021");
                                BAño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Año en Particular a Evaluar"));
                                if (BAño == 2019) {
                                    if (Lomas1 > Vallejo1 && Lomas1 > Cerritos1) {
                                        JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio mas, con un monto de: " + Lomas1);
                                    } else {
                                        if (Vallejo1 > Lomas1 && Vallejo1 > Cerritos1) {
                                            JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio mas, con un monto de: " + Vallejo1);
                                        } else {
                                            if (Cerritos1 > Vallejo1 && Cerritos1 > Lomas1) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio mas, con un monto de: " + Cerritos1);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2019_Lomas: " + Lomas1
                                                        + "\n" + "Ventas Totales del año 2019_Vallejo: " + Vallejo1 + "\n" + "Ventas Totales del año 2019_Cerritos: " + Cerritos1);
                                            }
                                        }
                                    }
                                } else {
                                    if (BAño == 2020) {
                                        if (Lomas2 > Vallejo2 && Lomas2 > Cerritos2) {
                                            JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio mas, con un monto de: " + Lomas2);
                                        } else {
                                            if (Vallejo2 > Lomas2 && Vallejo2 > Cerritos2) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio mas, con un monto de: " + Vallejo2);
                                            } else {
                                                if (Cerritos2 > Vallejo2 && Cerritos2 > Lomas2) {
                                                    JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio mas, con un monto de: " + Cerritos2);
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2020_Lomas: " + Lomas2
                                                            + "\n" + "Ventas Totales del año 2020_Vallejo: " + Vallejo2 + "\n" + "Ventas Totales del año 2020_Cerritos: " + Cerritos2);
                                                }
                                            }
                                        }
                                    } else {
                                        if (BAño == 2021) {
                                            if (Lomas3 > Vallejo1 && Lomas3 > Cerritos3) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio mas, con un monto de: " + Lomas3);
                                            } else {
                                                if (Vallejo3 > Lomas3 && Vallejo3 > Cerritos3) {
                                                    JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio mas, con un monto de: " + Vallejo3);
                                                } else {
                                                    if (Cerritos3 > Vallejo3 && Cerritos3 > Lomas3) {
                                                        JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio mas, con un monto de: " + Cerritos3);
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2021_Lomas: " + Lomas3
                                                                + "\n" + "Ventas Totales del año 2021_Vallejo: " + Vallejo3 + "\n" + "Ventas Totales del año 2021_Cerritos: " + Cerritos3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                                
                            case 3:
                                
                                JOptionPane.showMessageDialog(null, "Tenga en Cuenta que son 3 años: 2019, 2020, 2021");
                                BAño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Año en Particular a Evaluar"));
                                if (BAño == 2019) {
                                    if (Lomas1 < Vallejo1 && Lomas1 < Cerritos1) {
                                        JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio menos, con un monto de: " + Lomas1);
                                    } else {
                                        if (Vallejo1 < Lomas1 && Vallejo1 < Cerritos1) {
                                            JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio menos, con un monto de: " + Vallejo1);
                                        } else {
                                            if (Cerritos1 < Vallejo1 && Cerritos1 < Lomas1) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio menos, con un monto de: " + Cerritos1);
                                            } else {
                                                JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2019_Lomas: " + Lomas1
                                                        + "\n" + "Ventas Totales del año 2019_Vallejo: " + Vallejo1 + "\n" + "Ventas Totales del año 2019_Cerritos: " + Cerritos1);
                                            }
                                        }
                                    }
                                } else {
                                    
                                    if (BAño == 2020) {
                                        if (Lomas2 < Vallejo2 && Lomas2 < Cerritos2) {
                                            JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio menos, con un monto de: " + Lomas2);
                                        } else {
                                            if (Vallejo2 < Lomas2 && Vallejo2 < Cerritos2) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio menos, con un monto de: " + Vallejo2);
                                            } else {
                                                if (Cerritos2 < Vallejo2 && Cerritos2 < Lomas2) {
                                                    JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio menos, con un monto de: " + Cerritos2);
                                                } else {
                                                    JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2020_Lomas: " + Lomas2
                                                            + "\n" + "Ventas Totales del año 2020_Vallejo: " + Vallejo2 + "\n" + "Ventas Totales del año 2020_Cerritos: " + Cerritos2);
                                                }
                                            }
                                        }
                                    } else {
                                        if (BAño == 2021) {
                                            if (Lomas3 < Vallejo1 && Lomas3 < Cerritos3) {
                                                JOptionPane.showMessageDialog(null, "La Sucursal de Lomas Vendio menos, con un monto de: " + Lomas3);
                                            } else {
                                                if (Vallejo3 < Lomas3 && Vallejo3 < Cerritos3) {
                                                    JOptionPane.showMessageDialog(null, "La Sucursal de Vallejo Vendio menos, con un monto de: " + Vallejo3);
                                                } else {
                                                    if (Cerritos3 < Vallejo3 && Cerritos3 < Lomas3) {
                                                        JOptionPane.showMessageDialog(null, "La Sucursal de Cerritos Vendio menos, con un monto de: " + Cerritos3);
                                                    } else {
                                                        JOptionPane.showMessageDialog(null, "Los Montos en este año son Iguales: " + "\n" + "Ventas Totales del año 2021_Lomas: " + Lomas3
                                                                + "\n" + "Ventas Totales del año 2021_Vallejo: " + Vallejo3 + "\n" + "Ventas Totales del año 2021_Cerritos: " + Cerritos3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            break;
                            case 4:
                                JOptionPane.showMessageDialog(null, "Tenga en Cuenta que son 3 años: 2019, 2020, 2021");
                                BAño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Año en Particular a Evaluar"));
                                if(BAño ==2019){
                                    for (int i = 0; i < 1; i++) {
                                        for (int j = 0; j < 1; j++) {
                                            for (int k = 0; k < 12; k++) {
                                                if(k==0 && k<6){
                                                    Vallejo1 = Vallejo1 + Consorcio[i][j][k];
                                                    JOptionPane.showMessageDialog(null, "En el Primer Semestre del año 2019 de S.Vallejo Son: "+Vallejo1);
                                                }
                                                if(k==6 && k<12){
                                                    Vallejo1 = Vallejo1 + Consorcio[i][j][k];
                                                    JOptionPane.showMessageDialog(null, "En el Segundo Semestre del año 2019 de S.Vallejo Son: "+Vallejo1);
                                                }
                                            }
                                        }
                                    }
                                }
                            break;

                            case 5:
                                System.exit(0);
                            break;
                        }

                    } while (Op < 5 && Op > 0);
                    JOptionPane.showMessageDialog(null, "No es Una Opcion del Menu", "¡Dato Incorrecto!",
                            JOptionPane.WARNING_MESSAGE);
                    /* Ver Arreglo
                    for (int i = 0; i < Consorcio.length; i++) {
                    for (int j = 0; j < Consorcio[i].length; j++) {
                        for (int k = 0; k < Consorcio[i][j].length; k++) {
                            System.out.println(Arrays.toString(Consorcio[i][j]));
                        }  
                    }
                }
                     */
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        } while (N < 4 && N > 0);
        JOptionPane.showMessageDialog(null, "No es Una Opcion del Menu", "¡Dato Incorrecto!",
                JOptionPane.WARNING_MESSAGE);

    }

}
