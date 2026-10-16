package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class avl extends defpackage.cge implements defpackage.cyy {
    public float a;
    public boolean b;

    public avl(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.cyy
    public final /* bridge */ /* synthetic */ java.lang.Object ds(java.lang.Object obj) {
        defpackage.awa awaVar = obj instanceof defpackage.awa ? (defpackage.awa) obj : null;
        if (awaVar == null) {
            awaVar = new defpackage.awa(null);
        }
        awaVar.a = this.a;
        awaVar.b = this.b;
        return awaVar;
    }
}
