package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sbd extends defpackage.sbb implements java.io.Closeable {
    public sbd(android.content.Context context) throws defpackage.sbc {
        super(context);
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new defpackage.sbc("Cannot instantiate on main thread");
        }
        try {
            a();
            defpackage.scm scmVar = this.b;
            scmVar.fr(1, scmVar.fp());
        } catch (android.os.RemoteException e) {
            b();
            throw new defpackage.sbc(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            defpackage.scm scmVar = this.b;
            scmVar.fr(2, scmVar.fp());
        } catch (android.os.RemoteException unused) {
        }
        b();
    }
}
