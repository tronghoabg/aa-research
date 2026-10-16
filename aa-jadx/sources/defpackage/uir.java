package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uir extends defpackage.uit {
    public final defpackage.uav a;

    public uir(defpackage.ukp ukpVar, int i, defpackage.uav uavVar) {
        super(ukpVar, i);
        this.a = uavVar;
    }

    @Override // defpackage.uit
    public final boolean equals(java.lang.Object obj) {
        defpackage.uir uirVar;
        return (obj instanceof defpackage.uir) && (uirVar = (defpackage.uir) obj) != null && j$.util.Objects.equals(this.b, uirVar.b) && j$.util.Objects.equals(this.a, uirVar.a);
    }

    @Override // defpackage.uit
    public final int hashCode() {
        return j$.util.Objects.hash(this.b, this.a, java.lang.Integer.valueOf(this.c));
    }
}
