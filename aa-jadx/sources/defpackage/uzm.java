package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uzm implements defpackage.aclw {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public uzm(defpackage.aclw aclwVar, int i, int[] iArr) {
        this.b = i;
        aclwVar.getClass();
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        int i = this.b;
        if (i == 0) {
            return b();
        }
        if (i == 1) {
            return b();
        }
        if (i != 2) {
            return i != 3 ? b() : b();
        }
        return b();
    }

    public final defpackage.xyn b() {
        int i = this.b;
        if (i == 0) {
            return defpackage.xyn.h(this.a.a());
        }
        if (i == 1) {
            return defpackage.xyn.h(this.a.a());
        }
        if (i == 2) {
            return defpackage.xyn.h(this.a.a());
        }
        defpackage.aclw aclwVar = this.a;
        return i != 3 ? defpackage.xyn.h(aclwVar) : defpackage.xyn.h(defpackage.acls.b(aclwVar));
    }

    public uzm(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }
}
