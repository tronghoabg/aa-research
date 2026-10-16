package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tfx implements defpackage.aclw {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public tfx(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.b;
        if (i == 0) {
            return defpackage.xyn.h(this.a);
        }
        if (i == 1) {
            return defpackage.xyn.h(this.a.a());
        }
        defpackage.aclw aclwVar = this.a;
        return i != 2 ? defpackage.acls.b(aclwVar) : defpackage.xyn.h(aclwVar);
    }
}
