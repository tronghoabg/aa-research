package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class chj extends cfx implements cwu, cwk {
    public cmw a;
    public boolean b;
    public cfn c;
    public csi d;
    public float e;
    public cjw f;

    public chj(cmw cmwVar, boolean z, cfn cfnVar, csi csiVar, float f, cjw cjwVar) {
        this.a = cmwVar;
        this.b = z;
        this.c = cfnVar;
        this.d = csiVar;
        this.e = f;
        this.f = cjwVar;
    }

    private final long d(long j) {
        boolean z = dle.h(j) && dle.g(j);
        boolean z2 = dle.j(j) && dle.i(j);
        if ((!f() && z) || z2) {
            return dle.m(j, dle.b(j), 0, dle.a(j), 0, 10);
        }
        long jA = this.a.a();
        int iRound = l(jA) ? Math.round(Float.intBitsToFloat((int) (jA >> 32))) : dle.d(j);
        int iRound2 = g(jA) ? Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))) : dle.c(j);
        int iD = dle.d(j);
        int iB = dle.b(j);
        if (iRound < iD) {
            iRound = iD;
        }
        if (iRound <= iB) {
            iB = iRound;
        }
        int iC = dle.c(j);
        int iA = dle.a(j);
        if (iRound2 < iC) {
            iRound2 = iC;
        }
        if (iRound2 <= iA) {
            iA = iRound2;
        }
        long jFloatToRawIntBits = (Float.floatToRawIntBits(iB) << 32) | (Float.floatToRawIntBits(iA) & 4294967295L);
        if (f()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !l(this.a.a()) ? Float.intBitsToFloat(i) : Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !g(this.a.a()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits2 << 32;
            long j3 = jFloatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) == BitmapDescriptorFactory.HUE_RED) {
                jFloatToRawIntBits = 0;
            } else {
                long j4 = j2 | j3;
                jFloatToRawIntBits = bzi.y(j4, this.d.a(j4, jFloatToRawIntBits));
            }
        }
        int iRound3 = Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)));
        int iD2 = dle.d(j);
        int iB2 = dle.b(j);
        if (iRound3 < iD2) {
            iRound3 = iD2;
        }
        int i2 = iRound3 > iB2 ? iB2 : iRound3;
        int iRound4 = Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
        int iC2 = dle.c(j);
        int iA2 = dle.a(j);
        if (iRound4 < iC2) {
            iRound4 = iC2;
        }
        return dle.m(j, i2, 0, iRound4 > iA2 ? iA2 : iRound4, 0, 10);
    }

    private final boolean f() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean g(long j) {
        return j != 9205357640488583168L && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    private static final boolean l(long j) {
        return j != 9205357640488583168L && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        long jY;
        long jA = this.a.a();
        float fIntBitsToFloat = l(jA) ? Float.intBitsToFloat((int) (jA >> 32)) : Float.intBitsToFloat((int) (cxdVar.o() >> 32));
        float fIntBitsToFloat2 = g(jA) ? Float.intBitsToFloat((int) (jA & 4294967295L)) : Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2);
        long j = jFloatToRawIntBits << 32;
        long j2 = jFloatToRawIntBits2 & 4294967295L;
        if (Float.intBitsToFloat((int) (cxdVar.o() >> 32)) == BitmapDescriptorFactory.HUE_RED || Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L)) == BitmapDescriptorFactory.HUE_RED) {
            jY = 0;
        } else {
            long j3 = j | j2;
            jY = bzi.y(j3, this.d.a(j3, cxdVar.o()));
        }
        long j4 = jY;
        long jA2 = this.c.a((Math.round(Float.intBitsToFloat((int) (j4 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j4 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (cxdVar.o() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L))) & 4294967295L), cxdVar.p());
        float f = (int) (jA2 >> 32);
        float f2 = (int) (jA2 & 4294967295L);
        cxdVar.r().c.l(f, f2);
        float f3 = -f;
        float f4 = -f2;
        try {
            this.a.e(cxdVar, j4, this.e, this.f);
            cxdVar.r().c.l(f3, f4);
            cxdVar.q();
        } catch (Throwable th) {
            cxdVar.r().c.l(f3, f4);
            throw th;
        }
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(d(j));
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new cep(cuoVarV, 2));
    }

    @Override // defpackage.cwu
    public final int h(csq csqVar, csp cspVar, int i) {
        if (!f()) {
            return cspVar.c(i);
        }
        long jD = d(dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY));
        return Math.max(dle.c(jD), cspVar.c(i));
    }

    @Override // defpackage.cwu
    public final int i(csq csqVar, csp cspVar, int i) {
        if (!f()) {
            return cspVar.d(i);
        }
        long jD = d(dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        return Math.max(dle.d(jD), cspVar.d(i));
    }

    @Override // defpackage.cwu
    public final int j(csq csqVar, csp cspVar, int i) {
        if (!f()) {
            return cspVar.e(i);
        }
        long jD = d(dlf.d(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY));
        return Math.max(dle.c(jD), cspVar.e(i));
    }

    @Override // defpackage.cwu
    public final int k(csq csqVar, csp cspVar, int i) {
        if (!f()) {
            return cspVar.f(i);
        }
        long jD = d(dlf.d(0, Alert.DURATION_SHOW_INDEFINITELY, 0, i));
        return Math.max(dle.d(jD), cspVar.f(i));
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ")";
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
