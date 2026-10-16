package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class anj extends defpackage.cge implements defpackage.cwm, defpackage.cyb {
    public defpackage.apn a;
    public final defpackage.aqp b;
    public boolean c;
    public defpackage.and d;
    public final defpackage.afer e;
    public boolean f;
    public boolean h;
    public final defpackage.kwv i = new defpackage.kwv((byte[]) null, (byte[]) null, (char[]) null);
    public long g = -1;

    public anj(defpackage.apn apnVar, defpackage.aqp aqpVar, boolean z, defpackage.and andVar, defpackage.afer aferVar) {
        this.a = apnVar;
        this.b = aqpVar;
        this.c = z;
        this.d = andVar;
        this.e = aferVar;
    }

    public static /* synthetic */ boolean i(defpackage.anj anjVar, defpackage.cjj cjjVar, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = anjVar.d();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long jF = anjVar.f(cjjVar, j3, j2);
        return java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jF >> 32))) <= 0.5f && java.lang.Math.abs(java.lang.Float.intBitsToFloat((int) (jF & 4294967295L))) <= 0.5f;
    }

    private final defpackage.and j() {
        defpackage.and andVar = this.d;
        return andVar == null ? (defpackage.and) defpackage.cjv.y(this, defpackage.anf.b) : andVar;
    }

    public final float b(defpackage.and andVar, long j) {
        char c;
        long j2;
        java.lang.Object obj;
        int iCompare;
        long j3 = this.g;
        defpackage.bzc bzcVar = (defpackage.bzc) this.i.a;
        int i = bzcVar.b - 1;
        java.lang.Object[] objArr = bzcVar.a;
        char c2 = ' ';
        if (i < objArr.length) {
            obj = null;
            while (true) {
                if (i < 0) {
                    c = c2;
                    j2 = 4294967295L;
                    break;
                }
                java.lang.Object objInvoke = ((defpackage.ang) objArr[i]).a.invoke();
                if (objInvoke != null) {
                    long jB = ((defpackage.cjj) objInvoke).b();
                    long jF = defpackage.dlv.f(d());
                    int iOrdinal = this.a.ordinal();
                    if (iOrdinal == 0) {
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jB & 4294967295L)), java.lang.Float.intBitsToFloat((int) (jF & 4294967295L)));
                    } else {
                        if (iOrdinal != 1) {
                            throw new defpackage.afas();
                        }
                        c = c2;
                        j2 = 4294967295L;
                        iCompare = java.lang.Float.compare(java.lang.Float.intBitsToFloat((int) (jB >> c2)), java.lang.Float.intBitsToFloat((int) (jF >> c)));
                    }
                    if (iCompare > 0) {
                        if (obj != null) {
                            break;
                        }
                        obj = objInvoke;
                        break;
                    }
                    obj = objInvoke;
                } else {
                    c = c2;
                }
                i--;
                c2 = c;
            }
        } else {
            c = ' ';
            j2 = 4294967295L;
            obj = null;
        }
        if (obj == null) {
            java.lang.Object objInvoke2 = this.f ? this.e.invoke() : null;
            if (objInvoke2 == null) {
                return 0.0f;
            }
            obj = objInvoke2;
        }
        long jF2 = defpackage.dlv.f(j3);
        int iOrdinal2 = this.a.ordinal();
        if (iOrdinal2 == 0) {
            defpackage.cjj cjjVar = (defpackage.cjj) obj;
            float f = cjjVar.c;
            return andVar.a(f - ((int) (j & j2)), cjjVar.e - f, java.lang.Float.intBitsToFloat((int) (jF2 & j2)));
        }
        if (iOrdinal2 != 1) {
            throw new defpackage.afas();
        }
        defpackage.cjj cjjVar2 = (defpackage.cjj) obj;
        float f2 = cjjVar2.b;
        return andVar.a(f2 - ((int) (j >> c)), cjjVar2.d - f2, java.lang.Float.intBitsToFloat((int) (jF2 >> c)));
    }

    public final long d() {
        long j = this.g;
        if (j == -1) {
            return 0L;
        }
        return j;
    }

    @Override // defpackage.cyb
    public final void dB(long j) {
        long j2;
        long j3;
        long j4;
        long jD = d();
        this.g = j;
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            j2 = jD & 4294967295L;
            j3 = j & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new defpackage.afas();
            }
            j2 = jD >> 32;
            j3 = j >> 32;
        }
        if (defpackage.afga.b((int) j3, (int) j2) >= 0) {
            return;
        }
        if (this.c) {
            j4 = 0;
        } else {
            j4 = this.a == defpackage.apn.a ? ((long) (((int) (jD & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L : ((long) (((int) (jD >> 32)) - ((int) (j >> 32)))) << 32;
        }
        long j5 = j4;
        java.lang.Object objInvoke = this.e.invoke();
        if (objInvoke == null || this.h || this.f) {
            return;
        }
        defpackage.cjj cjjVar = (defpackage.cjj) objInvoke;
        if (!i(this, cjjVar, jD, 0L, 2) || i(this, cjjVar, 0L, j5, 1)) {
            return;
        }
        this.f = true;
        h(j5);
    }

    public final long f(defpackage.cjj cjjVar, long j, long j2) {
        long jF = defpackage.dlv.f(j);
        int iOrdinal = this.a.ordinal();
        if (iOrdinal == 0) {
            defpackage.and andVarJ = j();
            float f = cjjVar.c;
            return ((long) java.lang.Float.floatToRawIntBits(andVarJ.a(f - ((int) (j2 & 4294967295L)), cjjVar.e - f, java.lang.Float.intBitsToFloat((int) (jF & 4294967295L))))) & 4294967295L;
        }
        if (iOrdinal != 1) {
            throw new defpackage.afas();
        }
        defpackage.and andVarJ2 = j();
        float f2 = cjjVar.b;
        return ((long) java.lang.Float.floatToRawIntBits(andVarJ2.a(f2 - ((int) (j2 >> 32)), cjjVar.d - f2, java.lang.Float.intBitsToFloat((int) (jF >> 32))))) << 32;
    }

    public final void h(long j) {
        defpackage.and andVarJ = j();
        if (this.h) {
            defpackage.asq.d("launchAnimation called when previous animation was running");
        }
        ahoc.d(N(), (defpackage.afdo) null, 4, new defpackage.ani(this, new defpackage.ark(j().b()), andVarJ, j, null), 1);
    }

    @Override // defpackage.cge
    public final boolean x() {
        return false;
    }
}
