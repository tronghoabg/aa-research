package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class sss extends Handler {
    public sss(ria riaVar) {
        super(riaVar.getLooper());
    }

    public sss(Looper looper, Handler.Callback callback, byte[] bArr) {
        super(looper, callback);
    }

    public sss(Looper looper, byte[] bArr) {
        super(looper);
    }

    public sss() {
        Looper.getMainLooper();
    }

    public sss(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public sss(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
