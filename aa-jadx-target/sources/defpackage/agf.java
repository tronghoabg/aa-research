package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agf implements defpackage.aeg {
    public final java.lang.Object a;
    public final java.lang.Object b;
    private final defpackage.agu c;
    private final defpackage.aep d;
    private final defpackage.aep e;
    private final defpackage.aep f;
    private long g;
    private defpackage.aep h;
    private final defpackage.bil i;

    /* JADX WARN: Type inference failed for: r1v2, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [affc, java.lang.Object] */
    public agf(defpackage.aej aejVar, defpackage.bil bilVar, java.lang.Object obj, java.lang.Object obj2, defpackage.aep aepVar) {
        this.c = aejVar.c(bilVar);
        this.i = bilVar;
        this.a = obj2;
        this.b = obj;
        this.d = (defpackage.aep) bilVar.b.invoke(obj);
        this.e = (defpackage.aep) bilVar.b.invoke(obj2);
        this.f = aepVar != null ? defpackage.ca.A(aepVar) : ((defpackage.aep) bilVar.b.invoke(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.aeg
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.aeg
    public final defpackage.aep b(long j) {
        if (!defpackage.ca.H(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        defpackage.aep aepVar = this.h;
        if (aepVar != null) {
            return aepVar;
        }
        defpackage.aep aepVarB = this.c.b(this.d, this.e, this.f);
        this.h = aepVarB;
        return aepVarB;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [affc, java.lang.Object] */
    @Override // defpackage.aeg
    public final java.lang.Object c(long j) {
        if (defpackage.ca.H(this, j)) {
            return this.a;
        }
        defpackage.aep aepVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = aepVarC.b();
        for (int i = 0; i < iB; i++) {
            if (java.lang.Float.isNaN(aepVarC.a(i))) {
                defpackage.afw.b("AnimationVector cannot contain a NaN. " + aepVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.a.invoke(aepVarC);
    }

    @Override // defpackage.aeg
    public final /* synthetic */ boolean d(long j) {
        return defpackage.ca.H(this, j);
    }

    @Override // defpackage.aeg
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.aeg
    public final defpackage.bil g() {
        return this.i;
    }

    public final java.lang.String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    @Override // defpackage.aeg
    public final void f() {
    }
}
