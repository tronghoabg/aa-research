package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cwe {
    public final defpackage.cwf a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private defpackage.cwf i;
    public boolean b = true;
    public final java.util.Map h = new java.util.HashMap();

    public cwe(defpackage.cwf cwfVar) {
        this.a = cwfVar;
    }

    public abstract int a(defpackage.cyl cylVar, defpackage.csf csfVar);

    protected abstract long b(defpackage.cyl cylVar, long j);

    public abstract java.util.Map c(defpackage.cyl cylVar);

    public final void d(defpackage.csf csfVar, int i, defpackage.cyl cylVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = ((long) java.lang.Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(cylVar, jB);
                cylVar = cylVar.x;
                cylVar.getClass();
                if (defpackage.afga.f(cylVar, this.a.k())) {
                    break loop0;
                }
            } while (!c(cylVar).containsKey(csfVar));
            float fA = a(cylVar, csfVar);
            long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(fA);
            long jFloatToRawIntBits4 = java.lang.Float.floatToRawIntBits(fA);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        float fIntBitsToFloat = csfVar instanceof defpackage.csu ? java.lang.Float.intBitsToFloat((int) (jB & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (jB >> 32));
        java.util.Map map = this.h;
        int iRound = java.lang.Math.round(fIntBitsToFloat);
        if (map.containsKey(csfVar)) {
            iRound = ((java.lang.Number) csfVar.a.invoke(java.lang.Integer.valueOf(((java.lang.Number) defpackage.afga.O(map, csfVar)).intValue()), java.lang.Integer.valueOf(iRound))).intValue();
        }
        map.put(csfVar, java.lang.Integer.valueOf(iRound));
    }

    public final void e() {
        this.b = true;
        defpackage.cwf cwfVar = this.a;
        defpackage.cwf cwfVarJ = cwfVar.j();
        if (cwfVarJ == null) {
            return;
        }
        if (this.c) {
            cwfVarJ.o();
        } else if (this.e || this.d) {
            cwfVarJ.n();
        }
        if (this.f) {
            cwfVar.o();
        }
        if (this.g) {
            cwfVar.n();
        }
        cwfVarJ.i().e();
    }

    public final void f() {
        java.util.Map map = this.h;
        map.clear();
        defpackage.chs chsVar = new defpackage.chs(this, 13);
        defpackage.cwf cwfVar = this.a;
        cwfVar.l(chsVar);
        map.putAll(c(cwfVar.k()));
        this.b = false;
    }

    public final void g() {
        defpackage.cwe cweVarI;
        defpackage.cwe cweVarI2;
        boolean zI = i();
        defpackage.cwf cwfVar = this.a;
        if (!zI) {
            defpackage.cwf cwfVarJ = cwfVar.j();
            if (cwfVarJ == null) {
                return;
            }
            cwfVar = cwfVarJ.i().i;
            if (cwfVar == null || !cwfVar.i().i()) {
                defpackage.cwf cwfVar2 = this.i;
                if (cwfVar2 == null || cwfVar2.i().i()) {
                    return;
                }
                defpackage.cwf cwfVarJ2 = cwfVar2.j();
                if (cwfVarJ2 != null && (cweVarI2 = cwfVarJ2.i()) != null) {
                    cweVarI2.g();
                }
                defpackage.cwf cwfVarJ3 = cwfVar2.j();
                cwfVar = null;
                if (cwfVarJ3 != null && (cweVarI = cwfVarJ3.i()) != null) {
                    cwfVar = cweVarI.i;
                }
            }
        }
        this.i = cwfVar;
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
