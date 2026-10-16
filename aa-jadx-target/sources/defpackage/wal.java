package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wal implements defpackage.aclt {
    private final defpackage.aclw a;
    private final defpackage.aclw b;

    public wal(defpackage.aclw aclwVar, defpackage.aclw aclwVar2) {
        this.a = aclwVar;
        this.b = aclwVar2;
    }

    @Override // defpackage.afak, defpackage.afaj
    public final /* synthetic */ java.lang.Object a() {
        java.lang.Object obj = ((defpackage.aclu) this.a).b;
        defpackage.waj wajVarA = ((defpackage.wak) this.b).a();
        return new defpackage.wah(((android.content.Context) obj).getContentResolver(), wajVarA.a, wajVarA.b);
    }
}
