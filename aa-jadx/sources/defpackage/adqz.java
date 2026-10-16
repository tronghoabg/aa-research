package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adqz extends defpackage.adrb {
    private final defpackage.adzr d;

    public adqz(android.os.IBinder iBinder, java.util.concurrent.Executor executor) {
        super(iBinder);
        this.d = new defpackage.adzr(executor);
    }

    @Override // defpackage.adrb
    public final void a(int i, defpackage.adrf adrfVar) {
        this.d.execute(new defpackage.adqy(this, i, adrfVar.a(), 0));
        adrfVar.b();
    }
}
