package defpackage;

import java.util.Random;

/* loaded from: classes3.dex */
final class vxw extends vym {
    private final Random c;
    private final vyk d;
    private final vxt e;
    private final zeq f;

    public vxw(ajfz ajfzVar, vyk vykVar, Random random, vxt vxtVar, zeq zeqVar) {
        super(vykVar.c > 0, ajfzVar);
        this.c = random;
        this.d = vykVar;
        this.e = vxtVar;
        this.f = zeqVar;
    }

    @Override // defpackage.vym
    public final ajfz b(vyk vykVar) {
        return this.a ? f(vykVar) : e();
    }

    @Override // defpackage.vym
    public final vyk d(String str) {
        vyk vykVar = this.d;
        if (!woy.am(str)) {
            vxt vxtVar = this.e;
            long epochMilli = this.f.a().toEpochMilli() - vxtVar.d;
            if (epochMilli >= 14400000) {
                long j = epochMilli / 14400000;
                long jMin = Math.min(j, 15L);
                for (int i = 0; i < 256; i++) {
                    short[] sArr = vxtVar.a;
                    int i2 = (int) jMin;
                    sArr[i] = (short) (sArr[i] >> i2);
                    short[] sArr2 = vxtVar.b;
                    sArr2[i] = (short) (sArr2[i] >> i2);
                }
                vxtVar.d += j * 14400000;
            }
            int iHashCode = str.hashCode() * vxtVar.c;
            char cCharAt = str.isEmpty() ? (char) 0 : str.charAt(0);
            int i3 = iHashCode >>> 24;
            int length = (iHashCode >>> 16) + str.length();
            short[] sArr3 = vxtVar.a;
            short[] sArr4 = vxtVar.b;
            int i4 = (i3 + cCharAt) & 255;
            int i5 = length & 255;
            int iMin = Math.min((int) sArr3[i4], (int) sArr4[i5]);
            int i6 = iMin + 1;
            short sMin = (short) Math.min(32767, i6);
            if (sArr3[i4] == iMin) {
                sArr3[i4] = sMin;
            }
            if (sArr4[i5] == iMin) {
                sArr4[i5] = sMin;
            }
            vykVar = new vyk((int) (vykVar.c / (i6 < 50 ? Math.sqrt(i6) : i6)), vykVar.d);
        }
        return vykVar.c(this.c.nextDouble()) ? vykVar : vyk.b;
    }

    @Override // defpackage.vym
    public final ajfz f(vyk vykVar) {
        if (vykVar == null || vykVar.equals(this.d)) {
            return this.b;
        }
        abnp abnpVarN = ajfz.a.n();
        int iAt = a.at(this.b.e);
        if (iAt == 0) {
            iAt = 1;
        }
        abnpVarN.t();
        ajfz ajfzVar = (ajfz) abnpVarN.b;
        ajfzVar.e = iAt - 1;
        ajfzVar.b |= 2;
        vykVar.g(abnpVarN);
        return (ajfz) abnpVarN.q();
    }
}
