package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class xee {
    public static final yfq a = yfq.x(12593, 12594, 12596, 12599, 12600, 12601, 12609, 12610, 12611, 12613, 12614, 12615, 12616, 12617, 12618, 12619, 12620, 12621, 12622);
    public static final yfq b = yfq.x(12623, 12624, 12625, 12626, 12627, 12628, 12629, 12630, 12631, 12632, 12633, 12634, 12635, 12636, 12637, 12638, 12639, 12640, 12641, 12642, 12643);
    private static final yfq f = yfq.x(12593, 12594, 12595, 12596, 12597, 12598, 12599, 12601, 12602, 12603, 12604, 12605, 12606, 12607, 12608, 12609, 12610, 12612, 12613, 12614, 12615, 12616, 12618, 12619, 12620, 12621, 12622);
    public int c = -1;
    public final int[] d = new int[3];
    public int e;

    public xee() {
        f();
    }

    public static int a(int i, int i2) {
        if (i == 12593) {
            return i2 != 12613 ? -1 : 12595;
        }
        if (i == 12596) {
            if (i2 != 12616) {
                return i2 != 12622 ? -1 : 12598;
            }
            return 12597;
        }
        if (i != 12601) {
            return (i == 12610 && i2 == 12613) ? 12612 : -1;
        }
        if (i2 == 12593) {
            return 12602;
        }
        if (i2 == 12613) {
            return 12605;
        }
        if (i2 == 12609) {
            return 12603;
        }
        if (i2 == 12610) {
            return 12604;
        }
        switch (i2) {
            case 12620:
                return 12606;
            case 12621:
                return 12607;
            case 12622:
                return 12608;
            default:
                return -1;
        }
    }

    public static boolean g(int i) {
        if (i == 12595 || i == 12612 || i == 12597 || i == 12598) {
            return true;
        }
        switch (i) {
            case 12602:
            case 12603:
            case 12604:
            case 12605:
            case 12606:
            case 12607:
            case 12608:
                return true;
            default:
                return false;
        }
    }

    public static boolean i(int i) {
        switch (i) {
            case 12632:
            case 12633:
            case 12634:
            case 12637:
            case 12638:
            case 12639:
            case 12642:
                return true;
            case 12635:
            case 12636:
            case 12640:
            case 12641:
            default:
                return false;
        }
    }

    public static int[] j(int i) {
        int[] iArr = new int[2];
        if (i == 12595) {
            iArr[0] = 12593;
            iArr[1] = 12613;
            return iArr;
        }
        if (i == 12612) {
            iArr[0] = 12610;
            iArr[1] = 12613;
            return iArr;
        }
        if (i == 12597) {
            iArr[0] = 12596;
            iArr[1] = 12616;
            return iArr;
        }
        if (i == 12598) {
            iArr[0] = 12596;
            iArr[1] = 12622;
            return iArr;
        }
        switch (i) {
            case 12602:
                iArr[0] = 12601;
                iArr[1] = 12593;
                break;
            case 12603:
                iArr[0] = 12601;
                iArr[1] = 12609;
                break;
            case 12604:
                iArr[0] = 12601;
                iArr[1] = 12610;
                break;
            case 12605:
                iArr[0] = 12601;
                iArr[1] = 12613;
                break;
            case 12606:
                iArr[0] = 12601;
                iArr[1] = 12620;
                break;
            case 12607:
                iArr[0] = 12601;
                iArr[1] = 12621;
                break;
            case 12608:
                iArr[0] = 12601;
                iArr[1] = 12622;
                break;
            default:
                iArr[0] = -1;
                iArr[1] = -1;
                break;
        }
        return iArr;
    }

    public final int b(int i, int i2) {
        if (i == 12631) {
            if (i2 == 12623) {
                return 12632;
            }
            if (i2 != 12624) {
                return i2 != 12643 ? -1 : 12634;
            }
            return 12633;
        }
        if (i != 12636) {
            return (i == 12641 && i2 == 12643) ? 12642 : -1;
        }
        if (i2 == 12627) {
            return 12637;
        }
        if (i2 != 12628) {
            return i2 != 12643 ? -1 : 12639;
        }
        return 12638;
    }

    public final int c() {
        int[] iArr = this.d;
        woy.aa(iArr[0] != -1, "The initial is undefined");
        woy.aa(iArr[1] != -1, "The medial is undefined");
        int iIndexOf = a.indexOf(Integer.valueOf(iArr[0])) * 588;
        int iIndexOf2 = b.indexOf(Integer.valueOf(iArr[1])) * 28;
        int i = iArr[2];
        return iIndexOf + iIndexOf2 + (i != -1 ? f.indexOf(Integer.valueOf(i)) + 1 : 0) + 44032;
    }

    public final String d() {
        int iC;
        int i = this.c;
        if (i == 0) {
            this.c = -1;
            this.d[0] = -1;
            this.e = -1;
        } else if (i == 1) {
            int[] iArr = this.d;
            woy.aa(g(iArr[0]), "The previous two characters are not a consonant pair");
            this.c = 0;
            int i2 = j(iArr[0])[0];
            iArr[0] = i2;
            this.e = i2;
        } else if (i == 2) {
            int[] iArr2 = this.d;
            iArr2[1] = -1;
            iC = iArr2[0];
            if (iC != -1) {
                this.c = 0;
                this.e = iC;
            } else {
                this.c = -1;
                this.e = -1;
            }
        } else if (i == 3) {
            int[] iArr3 = this.d;
            woy.aa(i(iArr3[1]), "The previous two characters are not a vowel pair");
            this.c = 2;
            int[] iArr4 = new int[2];
            switch (iArr3[1]) {
                case 12632:
                    iArr4[0] = 12631;
                    iArr4[1] = 12623;
                    break;
                case 12633:
                    iArr4[0] = 12631;
                    iArr4[1] = 12624;
                    break;
                case 12634:
                    iArr4[0] = 12631;
                    iArr4[1] = 12643;
                    break;
                case 12635:
                case 12636:
                case 12640:
                case 12641:
                default:
                    iArr4[0] = -1;
                    iArr4[1] = -1;
                    break;
                case 12637:
                    iArr4[0] = 12636;
                    iArr4[1] = 12627;
                    break;
                case 12638:
                    iArr4[0] = 12636;
                    iArr4[1] = 12628;
                    break;
                case 12639:
                    iArr4[0] = 12636;
                    iArr4[1] = 12643;
                    break;
                case 12642:
                    iArr4[0] = 12641;
                    iArr4[1] = 12643;
                    break;
            }
            int i3 = iArr4[0];
            iArr3[1] = i3;
            if (iArr3[0] != -1) {
                iC = c();
                this.e = iC;
            } else {
                this.e = i3;
            }
        } else if (i == 4) {
            int[] iArr5 = this.d;
            if (i(iArr5[1])) {
                this.c = 3;
            } else {
                this.c = 2;
            }
            iArr5[2] = -1;
            this.e = c();
        } else if (i == 5) {
            int[] iArr6 = this.d;
            woy.aa(g(iArr6[2]), "The previous two characters are not a consonant pair");
            this.c = 4;
            iArr6[2] = j(iArr6[2])[0];
            this.e = c();
        }
        int i4 = this.e;
        return i4 != -1 ? String.valueOf((char) i4) : "";
    }

    public final String e() {
        int i = this.e;
        if (i != -1) {
            return String.valueOf((char) i);
        }
        return null;
    }

    public final void f() {
        this.c = -1;
        Arrays.fill(this.d, -1);
        this.e = -1;
    }

    public final boolean h() {
        return this.e == -1;
    }
}
