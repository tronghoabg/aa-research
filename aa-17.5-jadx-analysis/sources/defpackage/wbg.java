package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class wbg {
    public static final wbg a = new wbg(ylz.c);
    public final yhc b;

    public wbg(yhc yhcVar) {
        this.b = yhcVar;
    }

    public static wbg a(abmw abmwVar) throws IOException {
        long j;
        String strA;
        wbf wbfVar;
        int iK = abmwVar.k();
        if (iK < 0) {
            throw new abon("Negative number of flags");
        }
        yha yhaVar = new yha(yli.a);
        long j2 = 0;
        for (int i = 0; i < iK; i++) {
            long jV = abmwVar.v();
            int i2 = (int) jV;
            long j3 = jV >>> 3;
            if (j3 == 0) {
                j = 0;
                strA = abmwVar.A();
            } else {
                long j4 = j3 + j2;
                if (j4 > 2305843009213693951L) {
                    throw new abon("Flag name larger than max size");
                }
                j = j4;
                strA = null;
            }
            int i3 = i2 & 7;
            if (i3 == 0 || i3 == 1) {
                wbfVar = new wbf(j, strA, i3, 0L, null);
            } else if (i3 == 2) {
                wbfVar = new wbf(j, strA, i3, abmwVar.v(), null);
            } else if (i3 == 3) {
                wbfVar = new wbf(j, strA, i3, Double.doubleToRawLongBits(abmwVar.b()), null);
            } else if (i3 == 4) {
                wbfVar = new wbf(j, strA, i3, 0L, abmwVar.A());
            } else {
                if (i3 != 5) {
                    throw new abon(a.bp(i3, "Unrecognized flag type "));
                }
                wbfVar = new wbf(j, strA, i3, 0L, abmwVar.I());
            }
            long j5 = wbfVar.a;
            if (j5 != 0) {
                j2 = j5;
            }
            yhaVar.n(wbfVar);
        }
        return new wbg(yhaVar.g());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wbg) {
            return this.b.equals(((wbg) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return yrm.m(this.b);
    }
}
