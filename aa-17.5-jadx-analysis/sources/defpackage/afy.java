package defpackage;

/* loaded from: classes.dex */
public final class afy implements adz {
    public final Object a;
    public final Object b;
    private final agn c;
    private final aei d;
    private final aei e;
    private final aei f;
    private long g;
    private aei h;
    private final bii i;

    /* JADX WARN: Type inference failed for: r1v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [afec, java.lang.Object] */
    public afy(aec aecVar, bii biiVar, Object obj, Object obj2, aei aeiVar) {
        this.c = aecVar.c(biiVar);
        this.i = biiVar;
        this.a = obj2;
        this.b = obj;
        this.d = (aei) biiVar.b.invoke(obj);
        this.e = (aei) biiVar.b.invoke(obj2);
        this.f = aeiVar != null ? ca.A(aeiVar) : ((aei) biiVar.b.invoke(obj)).c();
        this.g = -1L;
    }

    @Override // defpackage.adz
    public final long a() {
        long j = this.g;
        if (j >= 0) {
            return j;
        }
        long jA = this.c.a(this.d, this.e, this.f);
        this.g = jA;
        return jA;
    }

    @Override // defpackage.adz
    public final aei b(long j) {
        if (!ca.H(this, j)) {
            return this.c.d(j, this.d, this.e, this.f);
        }
        aei aeiVar = this.h;
        if (aeiVar != null) {
            return aeiVar;
        }
        aei aeiVarB = this.c.b(this.d, this.e, this.f);
        this.h = aeiVarB;
        return aeiVarB;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [afec, java.lang.Object] */
    @Override // defpackage.adz
    public final Object c(long j) {
        if (ca.H(this, j)) {
            return this.a;
        }
        aei aeiVarC = this.c.c(j, this.d, this.e, this.f);
        int iB = aeiVarC.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(aeiVarC.a(i))) {
                afp.b("AnimationVector cannot contain a NaN. " + aeiVarC + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.i.a.invoke(aeiVarC);
    }

    @Override // defpackage.adz
    public final /* synthetic */ boolean d(long j) {
        return ca.H(this, j);
    }

    @Override // defpackage.adz
    public final boolean e() {
        return this.c.e();
    }

    @Override // defpackage.adz
    public final bii g() {
        return this.i;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.b + " -> " + this.a + ",initial velocity: " + this.f + ", duration: " + (a() / 1000000) + " ms,animationSpec: " + this.c;
    }

    @Override // defpackage.adz
    public final void f() {
    }
}
