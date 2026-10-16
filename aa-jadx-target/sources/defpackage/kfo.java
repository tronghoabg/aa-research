package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kfo extends defpackage.erx {
    private final java.lang.Class a;
    private final defpackage.afer b;

    public kfo(java.lang.Class cls, defpackage.afer aferVar) {
        aferVar.getClass();
        this.a = cls;
        this.b = aferVar;
    }

    @Override // defpackage.erx, defpackage.erw
    public final defpackage.ers a(java.lang.Class cls) {
        if (!this.a.isAssignableFrom(cls)) {
            return defpackage.ebl.k(cls);
        }
        java.lang.Object objInvoke = this.b.invoke();
        objInvoke.getClass();
        return (defpackage.ers) objInvoke;
    }
}
