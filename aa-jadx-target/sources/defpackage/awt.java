package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class awt extends defpackage.cge implements defpackage.cyy {
    public java.lang.Object a;
    private final /* synthetic */ int b;

    public awt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [cft, java.lang.Object] */
    @Override // defpackage.cyy
    public final /* synthetic */ java.lang.Object ds(java.lang.Object obj) {
        if (this.b != 0) {
            defpackage.awa awaVar = obj instanceof defpackage.awa ? (defpackage.awa) obj : null;
            if (awaVar == null) {
                awaVar = new defpackage.awa(null);
            }
            awaVar.c = new defpackage.auc(this.a);
            return awaVar;
        }
        defpackage.awa awaVar2 = obj instanceof defpackage.awa ? (defpackage.awa) obj : null;
        if (awaVar2 == null) {
            awaVar2 = new defpackage.awa(null);
        }
        awaVar2.c = new defpackage.aud((defpackage.cfy) this.a);
        return awaVar2;
    }
}
