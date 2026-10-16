package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class jrx extends defpackage.moz {
    public jrx() {
        super(defpackage.mkt.h, "AppHost");
    }

    protected abstract defpackage.mqi a(android.content.Intent intent);

    @Override // defpackage.moz
    protected final void c(android.content.Intent intent, defpackage.qrh qrhVar) {
        b(intent);
        defpackage.mqi mqiVarA = a(new android.content.Intent(intent));
        g(intent);
        jsg.l(intent, mqiVarA);
        intent.setComponent(defpackage.mkt.h);
    }

    protected void b(android.content.Intent intent) {
    }
}
