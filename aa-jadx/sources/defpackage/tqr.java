package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tqr {
    private static final defpackage.tqq f = defpackage.tqq.b;
    public final defpackage.tpm a;
    public final defpackage.tqd b;
    public defpackage.tqq c;
    public float d;
    public final defpackage.tpm e;

    public tqr() {
        defpackage.tpm tpmVar = new defpackage.tpm();
        defpackage.tqq tqqVar = f;
        defpackage.tpm tpmVar2 = new defpackage.tpm();
        defpackage.tqd tqdVar = new defpackage.tqd(1.0f, 1.0f);
        this.b = tqdVar;
        this.a = new defpackage.tpm(tpmVar);
        tqdVar.n(1.0f, 1.0f);
        this.c = tqqVar;
        this.d = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.e = new defpackage.tpm(tpmVar2);
    }

    public final void a(defpackage.tqr tqrVar) {
        this.a.A(tqrVar.a);
        this.b.o(tqrVar.b);
        this.c = tqrVar.c;
        this.d = tqrVar.d;
        this.e.A(tqrVar.e);
    }

    public final void b(defpackage.tpm tpmVar) {
        this.a.A(tpmVar);
    }

    public final void c(float f2, defpackage.tpm tpmVar) {
        this.d = f2;
        this.e.A(tpmVar);
    }

    public final void d(float f2, defpackage.tqq tqqVar) {
        this.b.n(f2, f2);
        this.c = tqqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.tqr) {
            defpackage.tqr tqrVar = (defpackage.tqr) obj;
            if (this.a.equals(tqrVar.a) && this.b.equals(tqrVar.b) && this.c.equals(tqrVar.c) && java.lang.Float.compare(this.d, tqrVar.d) == 0 && this.e.equals(tqrVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(this.a, this.b, this.c, java.lang.Float.valueOf(this.d), this.e);
    }

    public final java.lang.String toString() {
        defpackage.xym xymVarBy = defpackage.ysr.by(this);
        xymVarBy.b("position", this.a);
        xymVarBy.b("scale", this.b);
        xymVarBy.b("scaleType", this.c);
        xymVarBy.e("rotationDegrees", this.d);
        xymVarBy.b("rotationOrigin", this.e);
        return xymVarBy.toString();
    }
}
