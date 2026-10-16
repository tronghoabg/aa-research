package androidx.compose.material3.internal.colorUtil;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class HctSolver {
    public static final HctSolver INSTANCE = new HctSolver();
    private static final double[][] SCALED_DISCOUNT_FROM_LINRGB = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    private static final double[][] LINRGB_FROM_SCALED_DISCOUNT = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    private static final double[] Y_FROM_LINRGB = {0.2126d, 0.7152d, 0.0722d};
    private static final double[] CRITICAL_PLANES = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final int $stable = 8;

    private HctSolver() {
    }

    private final boolean areInCyclicOrder(double d2, double d3, double d4) {
        return sanitizeRadians(d3 - d2) < sanitizeRadians(d4 - d2);
    }

    private final int bisectToLimit(double d2, double d3) {
        int iCriticalPlaneAbove;
        int iCriticalPlaneBelow;
        int i2;
        int i3;
        HctSolver hctSolver = this;
        double[][] dArrBisectToSegment = bisectToSegment(d2, d3);
        int i4 = 0;
        double[] dArr = dArrBisectToSegment[0];
        double dHueOf = hctSolver.hueOf(dArr);
        double[] dArr2 = dArrBisectToSegment[1];
        int i5 = 0;
        while (i5 < 3) {
            double d4 = dArr[i5];
            double d5 = dArr2[i5];
            if (d4 == d5) {
                i2 = i5;
                i3 = i4;
            } else {
                if (d4 < d5) {
                    iCriticalPlaneAbove = hctSolver.criticalPlaneBelow(hctSolver.trueDelinearized(d4));
                    iCriticalPlaneBelow = hctSolver.criticalPlaneAbove(hctSolver.trueDelinearized(dArr2[i5]));
                } else {
                    iCriticalPlaneAbove = hctSolver.criticalPlaneAbove(hctSolver.trueDelinearized(d4));
                    iCriticalPlaneBelow = hctSolver.criticalPlaneBelow(hctSolver.trueDelinearized(dArr2[i5]));
                }
                int i6 = iCriticalPlaneAbove;
                int i7 = i4;
                int i8 = iCriticalPlaneBelow;
                double d6 = dHueOf;
                double[] dArr3 = dArr2;
                double[] dArr4 = dArr;
                while (i7 < 8 && Math.abs(i8 - i6) > 1.0d) {
                    int iFloor = (int) Math.floor((i6 + i8) / 2.0d);
                    double[] coordinate = hctSolver.setCoordinate(dArr4, CRITICAL_PLANES[iFloor], dArr3, i5);
                    double[] dArr5 = dArr4;
                    double[] dArr6 = dArr3;
                    int i9 = i5;
                    double dHueOf2 = hctSolver.hueOf(coordinate);
                    int i10 = i4;
                    double[] dArr7 = coordinate;
                    double d7 = d6;
                    boolean zAreInCyclicOrder = hctSolver.areInCyclicOrder(d7, d3, dHueOf2);
                    if (true == zAreInCyclicOrder) {
                        i8 = iFloor;
                    }
                    if (true != zAreInCyclicOrder) {
                        i6 = iFloor;
                    }
                    dArr3 = true == zAreInCyclicOrder ? dArr7 : dArr6;
                    if (true != zAreInCyclicOrder) {
                        d7 = dHueOf2;
                    }
                    if (true == zAreInCyclicOrder) {
                        dArr7 = dArr5;
                    }
                    i7++;
                    double d8 = d7;
                    dArr4 = dArr7;
                    d6 = d8;
                    hctSolver = this;
                    i4 = i10;
                    i5 = i9;
                }
                i2 = i5;
                i3 = i4;
                dHueOf = d6;
                dArr = dArr4;
                dArr2 = dArr3;
            }
            i5 = i2 + 1;
            hctSolver = this;
            i4 = i3;
        }
        int i11 = i4;
        return CamUtils.INSTANCE.argbFromLinrgbComponents((dArr[i11] + dArr2[i11]) / 2.0d, (dArr[1] + dArr2[1]) / 2.0d, (dArr[2] + dArr2[2]) / 2.0d);
    }

    private final double[][] bisectToSegment(double d2, double d3) {
        double d4;
        HctSolver hctSolver = this;
        boolean z = false;
        boolean z2 = true;
        double[] dArr = {-1.0d, -1.0d, -1.0d};
        double[] dArr2 = dArr;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = true;
        double d5 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d6 = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (i2 < 12) {
            boolean z5 = z;
            boolean z6 = z2;
            double[] dArrNthVertex = hctSolver.nthVertex(d2, i2);
            if (dArrNthVertex[z5 ? 1 : 0] >= AudioStats.AUDIO_AMPLITUDE_NONE) {
                boolean z7 = z3;
                double d7 = d5;
                boolean z8 = z4;
                double dHueOf = hctSolver.hueOf(dArrNthVertex);
                if (z7) {
                    if (z8) {
                        d4 = d6;
                    } else {
                        d4 = d6;
                        if (!hctSolver.areInCyclicOrder(d7, dHueOf, d6)) {
                            d5 = d7;
                        }
                        z4 = z5 ? 1 : 0;
                        z3 = z6;
                        d6 = d4;
                    }
                    if (areInCyclicOrder(d7, d3, dHueOf)) {
                        d6 = dHueOf;
                        dArr2 = dArrNthVertex;
                        z4 = z5 ? 1 : 0;
                        d5 = d7;
                        z3 = z6;
                    } else {
                        d5 = dHueOf;
                        dArr = dArrNthVertex;
                        z4 = z5 ? 1 : 0;
                        z3 = z6;
                        d6 = d4;
                    }
                } else {
                    d6 = dHueOf;
                    dArr = dArrNthVertex;
                    dArr2 = dArr;
                    z3 = z6;
                    d5 = d6;
                    z4 = z8;
                }
            }
            i2++;
            hctSolver = this;
            z = z5 ? 1 : 0;
            z2 = z6;
            z4 = z4;
        }
        double[][] dArr3 = new double[2][];
        dArr3[z ? 1 : 0] = dArr;
        dArr3[z2 ? 1 : 0] = dArr2;
        return dArr3;
    }

    private final double chromaticAdaptation(double d2) {
        double dPow = Math.pow(Math.abs(d2), 0.42d);
        return ((CamUtils.INSTANCE.signum(d2) * 400.0d) * dPow) / (dPow + 27.13d);
    }

    private final int criticalPlaneAbove(double d2) {
        return (int) Math.ceil(d2 - 0.5d);
    }

    private final int criticalPlaneBelow(double d2) {
        return (int) Math.floor(d2 - 0.5d);
    }

    private final int findResultByJ(double d2, double d3, double d4) {
        double dSqrt = Math.sqrt(d4) * 11.0d;
        Frame frame = Frame.Companion.getDefault();
        double d5 = 1.0d;
        double dPow = 1.0d / Math.pow(1.64d - Math.pow(0.29d, frame.getN()), 0.73d);
        double dCos = Math.cos(d2 + 2.0d) + 3.8d;
        double nc = frame.getNc();
        double ncb = frame.getNcb();
        double dSin = Math.sin(d2);
        double dCos2 = Math.cos(d2);
        int i2 = 0;
        while (i2 < 5) {
            double d6 = d5;
            double d7 = dSqrt / 100.0d;
            double d8 = dSqrt;
            Frame frame2 = frame;
            double dPow2 = Math.pow(((d3 == AudioStats.AUDIO_AMPLITUDE_NONE || dSqrt == AudioStats.AUDIO_AMPLITUDE_NONE) ? 0.0d : d3 / Math.sqrt(d7)) * dPow, 1.1111111111111112d);
            double aw = (frame2.getAw() * Math.pow(d7, (d6 / frame2.getC()) / frame2.getZ())) / frame2.getNbb();
            double d9 = (((0.305d + aw) * 23.0d) * dPow2) / (((((((0.25d * dCos) * 3846.153846153846d) * nc) * ncb) * 23.0d) + ((dPow2 * 11.0d) * dCos2)) + ((108.0d * dPow2) * dSin));
            double d10 = d9 * dCos2;
            double d11 = d9 * dSin;
            double d12 = aw * 460.0d;
            double dInverseChromaticAdaptation = inverseChromaticAdaptation(((d12 + (451.0d * d10)) + (288.0d * d11)) / 1403.0d);
            double dInverseChromaticAdaptation2 = inverseChromaticAdaptation(((d12 - (891.0d * d10)) - (261.0d * d11)) / 1403.0d);
            double dInverseChromaticAdaptation3 = inverseChromaticAdaptation(((d12 - (d10 * 220.0d)) - (d11 * 6300.0d)) / 1403.0d);
            double[][] dArr = LINRGB_FROM_SCALED_DISCOUNT;
            double[] dArr2 = dArr[0];
            double d13 = dArr2[0] * dInverseChromaticAdaptation;
            double d14 = dArr2[1] * dInverseChromaticAdaptation2;
            double d15 = dArr2[2] * dInverseChromaticAdaptation3;
            double[] dArr3 = dArr[1];
            double d16 = dArr3[0] * dInverseChromaticAdaptation;
            double d17 = dArr3[1] * dInverseChromaticAdaptation2;
            double d18 = dArr3[2] * dInverseChromaticAdaptation3;
            double[] dArr4 = dArr[2];
            double d19 = dInverseChromaticAdaptation * dArr4[0];
            double d20 = dInverseChromaticAdaptation2 * dArr4[1];
            double d21 = dInverseChromaticAdaptation3 * dArr4[2];
            double d22 = d13 + d14 + d15;
            if (d22 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                break;
            }
            double d23 = d16 + d17 + d18;
            if (d23 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                break;
            }
            double d24 = d19 + d20 + d21;
            if (d24 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                break;
            }
            double[] dArr5 = Y_FROM_LINRGB;
            double d25 = (dArr5[0] * d22) + (dArr5[1] * d23) + (dArr5[2] * d24);
            if (d25 <= AudioStats.AUDIO_AMPLITUDE_NONE) {
                break;
            }
            if (i2 != 4) {
                double d26 = d25 - d4;
                if (Math.abs(d26) >= 0.002d) {
                    dSqrt = d8 - ((d26 * d8) / (d25 + d25));
                    i2++;
                    d5 = d6;
                    frame = frame2;
                }
            }
            if (d22 <= 100.01d && d23 <= 100.01d && d24 <= 100.01d) {
                return CamUtils.INSTANCE.argbFromLinrgbComponents(d22, d23, d24);
            }
        }
        return 0;
    }

    private final double hueOf(double[] dArr) {
        double[][] dArr2 = SCALED_DISCOUNT_FROM_LINRGB;
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = dArr3[1] * d4;
        double d6 = dArr[2];
        double d7 = dArr3[2] * d6;
        double[] dArr4 = dArr2[1];
        double d8 = dArr4[0] * d2;
        double d9 = dArr4[1] * d4;
        double d10 = dArr4[2] * d6;
        double[] dArr5 = dArr2[2];
        double d11 = d2 * dArr5[0];
        double d12 = d4 * dArr5[1];
        double d13 = d6 * dArr5[2];
        double dChromaticAdaptation = chromaticAdaptation(d3 + d5 + d7);
        double dChromaticAdaptation2 = chromaticAdaptation(d8 + d9 + d10);
        double dChromaticAdaptation3 = chromaticAdaptation(d11 + d12 + d13);
        return Math.atan2(((dChromaticAdaptation + dChromaticAdaptation2) - (dChromaticAdaptation3 + dChromaticAdaptation3)) / 9.0d, (((dChromaticAdaptation * 11.0d) + ((-12.0d) * dChromaticAdaptation2)) + dChromaticAdaptation3) / 11.0d);
    }

    private final double intercept(double d2, double d3, double d4) {
        return d4 == d2 ? d4 : (d3 - d2) / (d4 - d2);
    }

    private final double inverseChromaticAdaptation(double d2) {
        double dAbs = Math.abs(d2);
        return CamUtils.INSTANCE.signum(d2) * Math.pow(Math.max(AudioStats.AUDIO_AMPLITUDE_NONE, (27.13d * dAbs) / (400.0d - dAbs)), 2.380952380952381d);
    }

    private final boolean isBounded(double d2) {
        return d2 >= AudioStats.AUDIO_AMPLITUDE_NONE && d2 <= 100.0d;
    }

    private final double[] lerpPoint(double[] dArr, double d2, double[] dArr2) {
        double d3 = dArr[0];
        double d4 = d3 + ((dArr2[0] - d3) * d2);
        double d5 = dArr[1];
        double d6 = d5 + ((dArr2[1] - d5) * d2);
        double d7 = dArr[2];
        return new double[]{d4, d6, d7 + ((dArr2[2] - d7) * d2)};
    }

    private final double[] nthVertex(double d2, int i2) {
        double[] dArr = Y_FROM_LINRGB;
        double d3 = dArr[0];
        double d4 = dArr[1];
        double d5 = dArr[2];
        int i3 = i2 % 4;
        double d6 = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d7 = i3 <= 1 ? 0.0d : 100.0d;
        if (i2 % 2 != 0) {
            d6 = 100.0d;
        }
        if (i2 < 4) {
            double d8 = ((d2 - (d4 * d7)) - (d5 * d6)) / d3;
            return isBounded(d8) ? new double[]{d8, d7, d6} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        if (i2 < 8) {
            double d9 = ((d2 - (d3 * d6)) - (d5 * d7)) / d4;
            return isBounded(d9) ? new double[]{d6, d9, d7} : new double[]{-1.0d, -1.0d, -1.0d};
        }
        double d10 = ((d2 - (d3 * d7)) - (d4 * d6)) / d5;
        return isBounded(d10) ? new double[]{d7, d6, d10} : new double[]{-1.0d, -1.0d, -1.0d};
    }

    private final double sanitizeDegreesDouble(double d2) {
        double d3 = d2 % 360.0d;
        return d3 < AudioStats.AUDIO_AMPLITUDE_NONE ? d3 + 360.0d : d3;
    }

    private final double sanitizeRadians(double d2) {
        return (d2 + 25.132741228718345d) % 6.283185307179586d;
    }

    private final double[] setCoordinate(double[] dArr, double d2, double[] dArr2, int i2) {
        return lerpPoint(dArr, intercept(dArr[i2], d2, dArr2[i2]), dArr2);
    }

    private final double trueDelinearized(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public final int solveToInt(double d2, double d3, double d4) {
        if (d3 < 1.0E-4d || d4 < 1.0E-4d || d4 > 99.9999d) {
            return CamUtils.INSTANCE.argbFromLstar(d4);
        }
        double radians = Math.toRadians(sanitizeDegreesDouble(d2));
        double dYFromLstar = CamUtils.INSTANCE.yFromLstar(d4);
        int iFindResultByJ = findResultByJ(radians, d3, dYFromLstar);
        return iFindResultByJ != 0 ? iFindResultByJ : bisectToLimit(dYFromLstar, radians);
    }
}
