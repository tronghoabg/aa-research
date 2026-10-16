package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vva implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;
    private final defpackage.aclw c;
    private final /* synthetic */ int d;

    public vva(defpackage.aclw aclwVar, defpackage.aclw aclwVar2, defpackage.aclw aclwVar3, int i) {
        this.d = i;
        this.a = aclwVar;
        this.b = aclwVar2;
        this.c = aclwVar3;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        if (this.d != 0) {
            return new defpackage.vlt((defpackage.zhw) this.a.a(), (defpackage.vsl) this.b.a(), this.c);
        }
        java.lang.Object obj = ((defpackage.aclu) this.b).b;
        return new vuz(defpackage.acls.b(this.a), (defpackage.xyn) obj, (java.util.concurrent.Executor) this.c.a());
    }
}
