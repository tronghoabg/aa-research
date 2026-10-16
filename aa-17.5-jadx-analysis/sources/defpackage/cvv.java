package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class cvv {
    public final cvw a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private cvw i;
    public boolean b = true;
    public final Map h = new HashMap();

    public cvv(cvw cvwVar) {
        this.a = cvwVar;
    }

    public abstract int a(cyc cycVar, crw crwVar);

    protected abstract long b(cyc cycVar, long j);

    public abstract Map c(cyc cycVar);

    public final void d(crw crwVar, int i, cyc cycVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(cycVar, jB);
                cycVar = cycVar.x;
                cycVar.getClass();
                if (affa.f(cycVar, this.a.k())) {
                    break loop0;
                }
            } while (!c(cycVar).containsKey(crwVar));
            float fA = a(cycVar, crwVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        float fIntBitsToFloat = crwVar instanceof csl ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32));
        Map map = this.h;
        int iRound = Math.round(fIntBitsToFloat);
        if (map.containsKey(crwVar)) {
            iRound = ((Number) crwVar.a.invoke(Integer.valueOf(((Number) woy.aU(map, crwVar)).intValue()), Integer.valueOf(iRound))).intValue();
        }
        map.put(crwVar, Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        cvw cvwVar = this.a;
        cvw cvwVarJ = cvwVar.j();
        if (cvwVarJ == null) {
            return;
        }
        if (this.c) {
            cvwVarJ.o();
        } else if (this.e || this.d) {
            cvwVarJ.n();
        }
        if (this.f) {
            cvwVar.o();
        }
        if (this.g) {
            cvwVar.n();
        }
        cvwVarJ.i().e();
    }

    public final void f() {
        Map map = this.h;
        map.clear();
        chk chkVar = new chk(this, 13);
        cvw cvwVar = this.a;
        cvwVar.l(chkVar);
        map.putAll(c(cvwVar.k()));
        this.b = false;
    }

    public final void g() {
        cvv cvvVarI;
        cvv cvvVarI2;
        boolean zI = i();
        cvw cvwVar = this.a;
        if (!zI) {
            cvw cvwVarJ = cvwVar.j();
            if (cvwVarJ == null) {
                return;
            }
            cvwVar = cvwVarJ.i().i;
            if (cvwVar == null || !cvwVar.i().i()) {
                cvw cvwVar2 = this.i;
                if (cvwVar2 == null || cvwVar2.i().i()) {
                    return;
                }
                cvw cvwVarJ2 = cvwVar2.j();
                if (cvwVarJ2 != null && (cvvVarI2 = cvwVarJ2.i()) != null) {
                    cvvVarI2.g();
                }
                cvw cvwVarJ3 = cvwVar2.j();
                cvwVar = null;
                if (cvwVarJ3 != null && (cvvVarI = cvwVarJ3.i()) != null) {
                    cvwVar = cvvVarI.i;
                }
            }
        }
        this.i = cvwVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
