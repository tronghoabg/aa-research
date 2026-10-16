package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class stq extends android.os.Handler {
    public stq(defpackage.riw riwVar) {
        super(riwVar.getLooper());
    }

    public stq(android.os.Looper looper, android.os.Handler.Callback callback, byte[] bArr) {
        super(looper, callback);
    }

    public stq(android.os.Looper looper, byte[] bArr) {
        super(looper);
    }

    public stq() {
        android.os.Looper.getMainLooper();
    }

    public stq(android.os.Looper looper) {
        super(looper);
        android.os.Looper.getMainLooper();
    }

    public stq(android.os.Looper looper, android.os.Handler.Callback callback) {
        super(looper, callback);
        android.os.Looper.getMainLooper();
    }
}
