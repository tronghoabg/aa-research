package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class avk extends defpackage.cyc<defpackage.avl> {
    private final float a;
    private final boolean b;

    public avk(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.avl(this.a, this.b);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.avl avlVar = (defpackage.avl) cgeVar;
        avlVar.a = this.a;
        avlVar.b = this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.avk avkVar = obj instanceof defpackage.avk ? (defpackage.avk) obj : null;
        return avkVar != null && this.a == avkVar.a && this.b == avkVar.b;
    }

    public final int hashCode() {
        return (java.lang.Float.floatToIntBits(this.a) * 31) + (true != this.b ? 1237 : 1231);
    }
}
