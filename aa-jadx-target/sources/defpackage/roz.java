package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class roz {
    public final defpackage.qxw a;
    public volatile defpackage.qss b;
    public final android.os.Handler c;
    public final defpackage.qxy d;
    private final android.os.Handler.Callback e;

    public roz(defpackage.qxw qxwVar, android.os.Looper looper) {
        gmf gmfVar = new gmf(this, 11);
        this.e = gmfVar;
        this.c = new defpackage.stq(looper, (android.os.Handler.Callback) gmfVar);
        this.a = qxwVar;
        this.d = new defpackage.qxy(this);
    }

    public final void a() {
        this.b = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean b(int i) throws java.lang.IllegalStateException, defpackage.qst, rlo, java.lang.IllegalArgumentException {
        try {
            return this.a.k(this.d, i);
        } catch (android.os.RemoteException e) {
            defpackage.oml.I(e);
            return false;
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.G(e2);
            return false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void c(int i, int i2) throws defpackage.qst, rlo, java.lang.SecurityException, java.lang.IllegalArgumentException {
        try {
            this.a.i(this.d, i, 0, i2);
        } catch (android.os.RemoteException e) {
            defpackage.oml.I(e);
        } catch (java.lang.IllegalStateException e2) {
            defpackage.oml.G(e2);
        }
    }
}
