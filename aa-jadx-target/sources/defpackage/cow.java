package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cow extends defpackage.cne {
    public final defpackage.coo a;
    public defpackage.bvh b;
    public final defpackage.bwx c;
    private final defpackage.bwx d;
    private final defpackage.bwx e;
    private float f;
    private defpackage.cke g;

    public cow(defpackage.cnl cnlVar) {
        defpackage.cjl cjlVar = new defpackage.cjl(0L);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableState(cjlVar, bxvVar);
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, bxvVar);
        defpackage.coo cooVar = new defpackage.coo(cnlVar);
        cooVar.d = new defpackage.cew(this, 2);
        this.a = cooVar;
        this.c = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.afbk.a, defpackage.bxv.b);
        this.f = 1.0f;
    }

    @Override // defpackage.cne
    public final long a() {
        return ((defpackage.cjl) this.d.a()).a;
    }

    @Override // defpackage.cne
    protected final void b(defpackage.cml cmlVar) {
        defpackage.coo cooVar = this.a;
        defpackage.cke ckeVarD = this.g;
        if (ckeVarD == null) {
            ckeVarD = cooVar.d();
        }
        if (((java.lang.Boolean) this.e.a()).booleanValue() && cmlVar.p() == defpackage.dlz.b) {
            long jN = cmlVar.n();
            defpackage.cmi cmiVarR = cmlVar.r();
            long jA = cmiVarR.a();
            cmiVarR.b().g();
            try {
                cmiVarR.c.k(-1.0f, 1.0f, jN);
                cooVar.e(cmlVar, this.f, ckeVarD);
                cmiVarR.b().e();
                cmiVarR.h(jA);
            } catch (java.lang.Throwable th) {
                cmiVarR.b().e();
                cmiVarR.h(jA);
                throw th;
            }
        } else {
            cooVar.e(cmlVar, this.f, ckeVarD);
        }
        this.c.a();
    }

    @Override // defpackage.cne
    protected final boolean c(float f) {
        this.f = f;
        return true;
    }

    @Override // defpackage.cne
    protected final boolean d(defpackage.cke ckeVar) {
        this.g = ckeVar;
        return true;
    }

    public final void g(boolean z) {
        this.e.b(java.lang.Boolean.valueOf(z));
    }

    public final void h(defpackage.cke ckeVar) {
        this.a.e.b(ckeVar);
    }

    public final void i(java.lang.String str) {
        this.a.b = str;
    }

    public final void j(long j) {
        this.d.b(new defpackage.cjl(j));
    }

    public final void k(long j) {
        this.a.f.b(new defpackage.cjl(j));
    }

    public cow() {
        this((byte[]) null);
    }

    public /* synthetic */ cow(byte[] bArr) {
        this(new defpackage.cnl());
    }
}
