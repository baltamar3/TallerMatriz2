/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author baltamar3
 */
public class Helper {

    public static void mensaje(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla1.getModel();

        tm.setRowCount(0);
        tm.setColumnCount(0);
    }

    public static void llenadoAutomatico(JTable tabla1) {
        int nf, nc, n;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                n = (int) (Math.random() * 99 + 1);
                tabla1.setValueAt(n, i, j);
            }
        }
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);
        }

    }

    public static void letraB(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || (i == 0 && j < nc - 1) || (i == (nf - 1) / 2 && j < nc - 1) || (i == nf - 1 && j < nc - 1 || (j == nc - 1 && i != 0 && i != (nf - 1) / 2 && i != nf - 1))) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }

    }

    public static void letraM(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || (i == j && i <= nf / 2) || (i + j == nc - 1 && i <= nf / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraQ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i == 0 && j != 0 && j != nc - 1) || (i == nf - 2 && j != 0 && j != nc - 1) || (j == 0 && i > 0 && i < nf - 2) || (j == nc - 1 && i > 0 && i < nf - 2) || (i == nf - 1 && j == nc - 1)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraK(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || (i == (nf - 1) / 2 && j <= (nc - 1) / 2 - 1) || (i + j == (nc - 1) && i <= (nf - 1) / 2) || (i - j == (nc / 2) && i >= (nf - 1) / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraW(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || j == nc - 1 || (i == nf - 1 && j != (nc - 1) / 2) || (j == (nc - 1) / 2 && i != nf - 1 && i >= (nf - 1) / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraJ(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || j == (nc - 1) / 2 || (i == nf - 1 && j <= (nc - 1) / 2) || (j == 0 && i >= (nf - 1) / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraG(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == 0 || i == ((nf - 1) / 2) + 1 || i == nf - 1 || j == 0 || (j == nc - 1 && i > (nf - 1) / 2) || (j == nc - 1 && i != ((nf - 1) / 2))) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void letraR(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (j == 0 || i == 0 || i == (nf - 1) / 2 || (i == j && j >= (nc - 1) / 2) || (j == nc - 1 && i <= (nf - 1) / 2)) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura1(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if ((i <= j && i <= (nc - 1) / 2 && j + i <= (nc - 1)) || (i > j && i >= (nc - 1) / 2 && j + i > (nc - 1))) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura1version2(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = i; j < nc - i; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(aux, i, j);
            }
        }

        for (int i = (nf - 1) / 2; i < nf; i++) {
            for (int j = i; j < nc + i; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                tabla2.setValueAt(aux, i, j);
            }
        }
    }

    public static void figura2(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == (nf - 1) / 2 || i == (nf - 1) / 2 + 1 || j == (nc - 1) / 2 || j == (nc - 1) / 2 + 1) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }

    public static void figura3(JTable tabla1, JTable tabla2) {
        int nf, nc, aux;

        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i + j == (nf - 1) / 2 || i - j == (nf - 1) / 2 || j - i == (nf - 1) / 2 || j + i == ((nf - 1) / 2) * 3) {
                    tabla2.setValueAt(aux, i, j);
                }
            }
        }
    }
    
    public static void figura4(JTable tabla1, JTable tabla2) {
        
        int nf = tabla1.getRowCount();
        int nc = tabla1.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                int aux = (int) tabla1.getValueAt(i, j);

                if (((j >= i && nf - 1 - j <= i)) || (j <= i) && (nf - 1 - j >= i)) {
                    tabla2.setValueAt(aux, i, j);
                }

            }
        }
    }

}
