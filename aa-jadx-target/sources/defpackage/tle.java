package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tle extends defpackage.afdg implements kotlinx.coroutines.CoroutineExceptionHandler {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tle(defpackage.bwp bwpVar, int i, byte[] bArr) {
        super(bwpVar);
        this.a = i;
    }

    public final void handleException(defpackage.afdo afdoVar, java.lang.Throwable th) {
        if (this.a != 0) {
            return;
        }
        ((defpackage.ype) ((defpackage.ype) com.google.android.libraries.auto.template.icons.proxy.ProxyContentProvider.a.h()).p(th).ai(9104)).u("Problem creating icon bitmap");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tle(defpackage.bwp bwpVar, int i) {
        super(bwpVar);
        this.a = i;
    }
}
