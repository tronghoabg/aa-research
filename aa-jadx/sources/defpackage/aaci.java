package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaci implements defpackage.aclw {
    private final defpackage.aclw a;
    private final /* synthetic */ int b;

    public aaci(defpackage.aclw aclwVar, int i) {
        this.b = i;
        this.a = aclwVar;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        return this.b != 0 ? b() : b();
    }

    public final j$.util.Optional b() {
        int i = this.b;
        defpackage.aclw aclwVar = this.a;
        return i != 0 ? j$.util.Optional.of(aclwVar.a()) : j$.util.Optional.of(defpackage.acls.b(aclwVar));
    }
}
