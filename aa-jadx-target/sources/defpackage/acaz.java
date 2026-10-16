package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acaz {
    static final double[][] a = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    static final double[][] b = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    static final double[] c = {0.2126d, 0.7152d, 0.0722d};
    static final double[] d = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};

    static double a(double[] dArr) {
        double[] dArrR = defpackage.a.r(dArr, a);
        double dE = defpackage.acmj.e(dArrR[0]);
        double dE2 = defpackage.acmj.e(dArrR[1]);
        double dE3 = defpackage.acmj.e(dArrR[2]);
        return java.lang.Math.atan2(((dE + dE2) - (dE3 + dE3)) / 9.0d, (((dE * 11.0d) + ((-12.0d) * dE2)) + dE3) / 11.0d);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:110:0x0344  */
    /* JADX WARN: Code duplicated, block: B:112:0x0347  */
    /* JADX WARN: Code duplicated, block: B:114:0x034a  */
    /* JADX WARN: Code duplicated, block: B:116:0x034d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0351  */
    /* JADX WARN: Code duplicated, block: B:122:0x0358  */
    /* JADX WARN: Code duplicated, block: B:126:0x0366 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x020e  */
    /* JADX WARN: Code duplicated, block: B:64:0x021a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0229  */
    /* JADX WARN: Code duplicated, block: B:69:0x023a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0245  */
    /* JADX WARN: Code duplicated, block: B:71:0x0250  */
    /* JADX WARN: Code duplicated, block: B:73:0x0261  */
    /* JADX WARN: Code duplicated, block: B:74:0x026c  */
    /* JADX WARN: Code duplicated, block: B:77:0x027d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0280  */
    /* JADX WARN: Code duplicated, block: B:80:0x0286  */
    /* JADX WARN: Code duplicated, block: B:82:0x028f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0293  */
    /* JADX WARN: Code duplicated, block: B:86:0x029c  */
    /* JADX WARN: Code duplicated, block: B:87:0x029f  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:92:0x02af  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x02dc  */
    public static int b(double d2, double d3, double d4) {
        int i;
        int iB;
        double[] dArr;
        double d5;
        double[] dArr2;
        boolean z;
        int i2;
        double d6;
        double d7;
        int i3;
        double[] dArr3;
        double dA;
        double[] dArr4;
        int i4;
        double d8;
        double d9;
        int iCeil;
        double dFloor;
        int i5;
        double d10;
        int i6;
        int iFloor;
        double[] dArrX;
        double dA2;
        boolean zG;
        double d11;
        double d12;
        double d13;
        int i7;
        double d14;
        double d15;
        double d16;
        double d17;
        double[] dArr5;
        double d18;
        double[] dArr6;
        double dA3;
        double d19;
        double d20;
        double d21;
        double d22;
        double d23 = d4 + 16.0d;
        if (d3 < 1.0E-4d || d4 < 1.0E-4d || d4 > 99.9999d) {
            double[][] dArr7 = defpackage.acbh.a;
            int iAR = defpackage.a.aR(defpackage.a.t(d23 / 116.0d) * 100.0d);
            return iAR | (iAR << 16) | (-16777216) | (iAR << 8);
        }
        double d24 = d2 % 360.0d;
        double d25 = 0.0d;
        if (d24 < 0.0d) {
            d24 += 360.0d;
        }
        double[][] dArr8 = defpackage.acbh.a;
        double dT = defpackage.a.t(d23 / 116.0d) * 100.0d;
        double dSqrt = java.lang.Math.sqrt(dT) * 11.0d;
        defpackage.acba acbaVar = defpackage.acba.a;
        double dPow = 1.0d / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, acbaVar.f), 0.73d);
        double d26 = (d24 / 180.0d) * 3.141592653589793d;
        double dCos = (java.lang.Math.cos(d26 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * acbaVar.d;
        double dSin = java.lang.Math.sin(d26);
        double dCos2 = java.lang.Math.cos(d26);
        int i8 = 0;
        while (true) {
            double d27 = d25;
            if (i8 < 5) {
                i = 1;
                double d28 = dSqrt / 100.0d;
                double dPow2 = java.lang.Math.pow(((d3 == d27 || dSqrt == d27) ? d27 : d3 / java.lang.Math.sqrt(d28)) * dPow, 1.1111111111111112d);
                double d29 = acbaVar.b;
                double d30 = dPow;
                double d31 = acbaVar.e;
                double d32 = dCos2;
                double dPow3 = (d29 * java.lang.Math.pow(d28, 1.4492753623188408d / acbaVar.j)) / acbaVar.c;
                double d33 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * d32)) + ((dPow2 * 108.0d) * dSin));
                double d34 = d33 * d32;
                double d35 = d33 * dSin;
                double d36 = dPow3 * 460.0d;
                double[] dArrR = defpackage.a.r(new double[]{defpackage.acmj.f((((451.0d * d34) + d36) + (288.0d * d35)) / 1403.0d), defpackage.acmj.f(((d36 - (891.0d * d34)) - (261.0d * d35)) / 1403.0d), defpackage.acmj.f(((d36 - (d34 * 220.0d)) - (d35 * 6300.0d)) / 1403.0d)}, b);
                double d37 = dArrR[0];
                if (d37 >= d27) {
                    double d38 = dArrR[1];
                    if (d38 >= d27) {
                        double d39 = dArrR[2];
                        if (d39 >= d27) {
                            double[] dArr9 = c;
                            double d40 = (dArr9[0] * d37) + (dArr9[1] * d38) + (dArr9[2] * d39);
                            if (d40 > d27) {
                                if (i8 != 4) {
                                    double d41 = d40 - dT;
                                    if (java.lang.Math.abs(d41) >= 0.002d) {
                                        dSqrt -= (d41 * dSqrt) / (d40 + d40);
                                        i8++;
                                        d25 = d27;
                                        dCos = dCos;
                                        dPow = d30;
                                        dCos2 = d32;
                                    }
                                }
                                if (dArrR[0] <= 100.01d && dArrR[1] <= 100.01d && dArrR[2] <= 100.01d) {
                                    iB = defpackage.acbh.b(dArrR);
                                }
                                if (iB == 0) {
                                    return iB;
                                }
                                dArr = new double[3];
                                d5 = -1.0d;
                                dArr[0] = -1.0d;
                                dArr[i] = -1.0d;
                                dArr[2] = -1.0d;
                                dArr2 = dArr;
                                z = false;
                                i2 = 0;
                                d6 = d27;
                                d7 = d6;
                                i3 = i;
                                while (i2 < 12) {
                                    double[] dArr10 = c;
                                    d11 = dArr10[0];
                                    d12 = dArr10[i];
                                    d13 = dArr10[2];
                                    i7 = i2 % 4;
                                    if (i2 % 2 == 0) {
                                        d14 = d27;
                                    } else {
                                        d14 = 100.0d;
                                    }
                                    d15 = d5;
                                    if (i7 <= i) {
                                        d16 = d27;
                                    } else {
                                        d16 = 100.0d;
                                    }
                                    if (i2 < 4) {
                                        d22 = ((dT - (d12 * d16)) - (d13 * d14)) / d11;
                                        if (defpackage.a.w(d22)) {
                                            dArr5 = new double[]{d22, d16, d14};
                                        } else {
                                            dArr5 = new double[]{d15, d15, d15};
                                        }
                                    } else if (i2 < 8) {
                                        d18 = ((dT - (d11 * d14)) - (d13 * d16)) / d12;
                                        if (defpackage.a.w(d18)) {
                                            dArr5 = new double[]{d14, d18, d16};
                                        } else {
                                            dArr5 = new double[]{d15, d15, d15};
                                        }
                                    } else {
                                        d17 = ((dT - (d11 * d16)) - (d12 * d14)) / d13;
                                        if (defpackage.a.w(d17)) {
                                            dArr5 = new double[]{d16, d14, d17};
                                        } else {
                                            dArr5 = new double[]{d15, d15, d15};
                                        }
                                    }
                                    dArr6 = dArr5;
                                    if (dArr6[0] < d27) {
                                        dA3 = a(dArr6);
                                        if (z) {
                                            if (i3 == 0) {
                                                d19 = d7;
                                                if (defpackage.acmj.g(d6, dA3, d7)) {
                                                    dA3 = dA3;
                                                } else {
                                                    d7 = d19;
                                                }
                                                i3 = 0;
                                            } else {
                                                d19 = d7;
                                            }
                                            d20 = d6;
                                            d6 = d20;
                                            d21 = dA3;
                                            if (defpackage.acmj.g(d20, d26, dA3)) {
                                                dArr2 = dArr6;
                                                d7 = d21;
                                            } else {
                                                dArr = dArr6;
                                                d7 = d19;
                                                d6 = d21;
                                            }
                                            i3 = 0;
                                        } else {
                                            dArr = dArr6;
                                            dArr2 = dArr;
                                            d6 = dA3;
                                            d7 = d6;
                                        }
                                        z = true;
                                    }
                                    i2++;
                                    d5 = d15;
                                    i = 1;
                                }
                                double[][] dArr11 = {dArr, dArr2};
                                dArr3 = dArr11[0];
                                dA = a(dArr3);
                                dArr4 = dArr11[1];
                                for (i4 = 0; i4 < 3; i4++) {
                                    d8 = dArr3[i4];
                                    d9 = dArr4[i4];
                                    if (d8 == d9) {
                                        if (d8 < d9) {
                                            iCeil = (int) java.lang.Math.floor(defpackage.a.v(d8) - 0.5d);
                                            dFloor = java.lang.Math.ceil(defpackage.a.v(dArr4[i4]) - 0.5d);
                                        } else {
                                            iCeil = (int) java.lang.Math.ceil(defpackage.a.v(d8) - 0.5d);
                                            dFloor = java.lang.Math.floor(defpackage.a.v(dArr4[i4]) - 0.5d);
                                        }
                                        i5 = (int) dFloor;
                                        d10 = dA;
                                        for (i6 = 0; i6 < 8 && java.lang.Math.abs(i5 - iCeil) > 1; i6++) {
                                            iFloor = (int) java.lang.Math.floor(((double) (iCeil + i5)) / 2.0d);
                                            double d42 = d[iFloor];
                                            double d43 = dArr3[i4];
                                            dArrX = defpackage.a.x(dArr3, (d42 - d43) / (dArr4[i4] - d43), dArr4);
                                            dA2 = a(dArrX);
                                            zG = defpackage.acmj.g(d10, d26, dA2);
                                            if (true == zG) {
                                                i5 = iFloor;
                                            }
                                            if (true != zG) {
                                                iCeil = iFloor;
                                            }
                                            if (true == zG) {
                                                dArr4 = dArrX;
                                            }
                                            if (true != zG) {
                                                d10 = dA2;
                                            }
                                            if (true != zG) {
                                                dArr3 = dArrX;
                                            }
                                        }
                                        dA = d10;
                                    }
                                }
                                return defpackage.acbh.b(defpackage.a.y(dArr3, dArr4));
                            }
                        }
                    }
                }
            } else {
                i = 1;
            }
            iB = 0;
            if (iB == 0) {
                return iB;
            }
            dArr = new double[3];
            d5 = -1.0d;
            dArr[0] = -1.0d;
            dArr[i] = -1.0d;
            dArr[2] = -1.0d;
            dArr2 = dArr;
            z = false;
            i2 = 0;
            d6 = d27;
            d7 = d6;
            i3 = i;
            while (i2 < 12) {
                double[] dArr12 = c;
                d11 = dArr12[0];
                d12 = dArr12[i];
                d13 = dArr12[2];
                i7 = i2 % 4;
                if (i2 % 2 == 0) {
                    d14 = d27;
                } else {
                    d14 = 100.0d;
                }
                d15 = d5;
                if (i7 <= i) {
                    d16 = d27;
                } else {
                    d16 = 100.0d;
                }
                if (i2 < 4) {
                    d22 = ((dT - (d12 * d16)) - (d13 * d14)) / d11;
                    if (defpackage.a.w(d22)) {
                        dArr5 = new double[]{d22, d16, d14};
                    } else {
                        dArr5 = new double[]{d15, d15, d15};
                    }
                } else if (i2 < 8) {
                    d18 = ((dT - (d11 * d14)) - (d13 * d16)) / d12;
                    if (defpackage.a.w(d18)) {
                        dArr5 = new double[]{d14, d18, d16};
                    } else {
                        dArr5 = new double[]{d15, d15, d15};
                    }
                } else {
                    d17 = ((dT - (d11 * d16)) - (d12 * d14)) / d13;
                    if (defpackage.a.w(d17)) {
                        dArr5 = new double[]{d16, d14, d17};
                    } else {
                        dArr5 = new double[]{d15, d15, d15};
                    }
                }
                dArr6 = dArr5;
                if (dArr6[0] < d27) {
                    dA3 = a(dArr6);
                    if (z) {
                        dArr = dArr6;
                        dArr2 = dArr;
                        d6 = dA3;
                        d7 = d6;
                    } else {
                        if (i3 == 0) {
                            d19 = d7;
                            if (defpackage.acmj.g(d6, dA3, d7)) {
                                dA3 = dA3;
                            } else {
                                d7 = d19;
                            }
                            i3 = 0;
                        } else {
                            d19 = d7;
                        }
                        d20 = d6;
                        d6 = d20;
                        d21 = dA3;
                        if (defpackage.acmj.g(d20, d26, dA3)) {
                            dArr2 = dArr6;
                            d7 = d21;
                        } else {
                            dArr = dArr6;
                            d7 = d19;
                            d6 = d21;
                        }
                        i3 = 0;
                    }
                    z = true;
                }
                i2++;
                d5 = d15;
                i = 1;
            }
            double[][] dArr13 = {dArr, dArr2};
            dArr3 = dArr13[0];
            dA = a(dArr3);
            dArr4 = dArr13[1];
            while (i4 < 3) {
                d8 = dArr3[i4];
                d9 = dArr4[i4];
                if (d8 == d9) {
                    if (d8 < d9) {
                        iCeil = (int) java.lang.Math.floor(defpackage.a.v(d8) - 0.5d);
                        dFloor = java.lang.Math.ceil(defpackage.a.v(dArr4[i4]) - 0.5d);
                    } else {
                        iCeil = (int) java.lang.Math.ceil(defpackage.a.v(d8) - 0.5d);
                        dFloor = java.lang.Math.floor(defpackage.a.v(dArr4[i4]) - 0.5d);
                    }
                    i5 = (int) dFloor;
                    d10 = dA;
                    while (i6 < 8) {
                        iFloor = (int) java.lang.Math.floor(((double) (iCeil + i5)) / 2.0d);
                        double d44 = d[iFloor];
                        double d45 = dArr3[i4];
                        dArrX = defpackage.a.x(dArr3, (d44 - d45) / (dArr4[i4] - d45), dArr4);
                        dA2 = a(dArrX);
                        zG = defpackage.acmj.g(d10, d26, dA2);
                        if (true == zG) {
                            i5 = iFloor;
                        }
                        if (true != zG) {
                            iCeil = iFloor;
                        }
                        if (true == zG) {
                            dArr4 = dArrX;
                        }
                        if (true != zG) {
                            d10 = dA2;
                        }
                        if (true != zG) {
                            dArr3 = dArrX;
                        }
                    }
                    dA = d10;
                }
            }
            return defpackage.acbh.b(defpackage.a.y(dArr3, dArr4));
        }
    }
}
