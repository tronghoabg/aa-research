package defpackage;

/* loaded from: classes2.dex */
abstract class akdf extends akdc {
    private static final int[] H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final long[] J = new long[12];
    private static final long[] K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (i < 11) {
            j += H[i] * 86400000;
            int i2 = i + 1;
            J[i2] = j;
            j2 += I[i] * 86400000;
            K[i2] = j2;
            i = i2;
        }
    }

    @Override // defpackage.akdc
    public final int R(int i, int i2) {
        int i3 = i2 - 1;
        return ag(i) ? I[i3] : H[i3];
    }

    @Override // defpackage.akdc
    public final int T(long j, int i) {
        long jAc = j - ac(i);
        boolean zAg = ag(i);
        int i2 = (int) (jAc >> 10);
        if (i2 < (true != zAg ? 15271875 : 15356250)) {
            if (i2 < (true != zAg ? 7593750 : 7678125)) {
                if (i2 < 2615625) {
                    return 1;
                }
                return i2 >= (true != zAg ? 4978125 : 5062500) ? 3 : 2;
            }
            if (i2 < (true != zAg ? 10125000 : 10209375)) {
                return 4;
            }
            return i2 >= (true != zAg ? 12740625 : 12825000) ? 6 : 5;
        }
        if (i2 < (true != zAg ? 23034375 : 23118750)) {
            if (i2 < (true != zAg ? 17887500 : 17971875)) {
                return 7;
            }
            return i2 >= (true != zAg ? 20503125 : 20587500) ? 9 : 8;
        }
        if (i2 < (true != zAg ? 25650000 : 25734375)) {
            return 10;
        }
        return i2 >= (true != zAg ? 28181250 : 28265625) ? 12 : 11;
    }

    @Override // defpackage.akdc
    public final long ab(int i, int i2) {
        int i3 = i2 - 1;
        return ag(i) ? K[i3] : J[i3];
    }

    @Override // defpackage.akdc
    public final long ae(long j, int i) {
        int iY = Y(j);
        int iP = P(j, iY);
        if (iP > 59) {
            if (ag(iY)) {
                if (!ag(i)) {
                    iP--;
                }
            } else if (ag(i)) {
                iP++;
            }
        }
        return ad(i, 1, iP) + S(j);
    }

    @Override // defpackage.akdc
    public final boolean af(long j) {
        return this.k.a(j) == 29 && this.m.t(j);
    }
}
