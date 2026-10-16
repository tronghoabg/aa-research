package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class psl extends android.os.HandlerThread implements defpackage.psv {
    private final defpackage.psw a;

    public psl(defpackage.psw pswVar) {
        super(pswVar.M, pswVar.b());
        this.a = pswVar;
    }

    @Override // defpackage.psv
    public final defpackage.psw a() {
        return this.a;
    }
}
