package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kxo implements defpackage.kxl {
    private final defpackage.lam c = defpackage.lam.a();
    private final defpackage.kxn d;

    public kxo(android.content.Context context, defpackage.rot rotVar, android.os.Looper looper) {
        this.d = new defpackage.kxn(context, rotVar, looper);
    }

    @Override // defpackage.kxl
    public final android.os.ParcelFileDescriptor a() throws java.io.IOException {
        this.c.h(401, null);
        return this.d.a();
    }

    @Override // defpackage.kxl
    public final void b() {
        this.c.h(405, null);
        this.d.b();
    }

    @Override // defpackage.kxl
    public final void c() {
        b();
        defpackage.kxn kxnVar = this.d;
        kxnVar.getLooper().quitSafely();
        kxnVar.a.shutdown();
    }

    @Override // defpackage.kxl
    public final boolean d() {
        return this.d.b != null;
    }
}
