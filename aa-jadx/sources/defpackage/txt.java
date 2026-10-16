package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class txt extends defpackage.tza implements defpackage.trp {
    public final defpackage.abeo a;
    public final boolean b;
    public final boolean c;
    public final defpackage.tpm d;

    public txt(defpackage.trc trcVar, defpackage.abeo abeoVar, boolean z, boolean z2, int i, java.lang.Integer num, defpackage.umw umwVar, defpackage.tpm tpmVar) {
        super(trcVar, i, num, umwVar);
        this.a = abeoVar;
        this.b = z;
        this.c = z2;
        this.d = new defpackage.tpm(tpmVar);
    }

    @Override // defpackage.tza, defpackage.trp
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final defpackage.trc b() {
        return (defpackage.trc) this.e;
    }

    @Override // defpackage.tza
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (obj.getClass() == getClass()) {
                defpackage.txt txtVar = (defpackage.txt) obj;
                if (b().equals(txtVar.b()) && this.f == txtVar.f && j$.util.Objects.equals(this.g, txtVar.g) && this.h.equals(txtVar.h) && this.d.equals(txtVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.tza
    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(super.hashCode()), this.d);
    }
}
