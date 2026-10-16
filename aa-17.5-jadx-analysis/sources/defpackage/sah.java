package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class sah extends saf implements Closeable {
    public sah(Context context) throws sag {
        super(context);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new sag("Cannot instantiate on main thread");
        }
        try {
            a();
            sbq sbqVar = this.b;
            sbqVar.gj(1, sbqVar.gh());
        } catch (RemoteException e) {
            b();
            throw new sag(e.getMessage());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            sbq sbqVar = this.b;
            sbqVar.gj(2, sbqVar.gh());
        } catch (RemoteException unused) {
        }
        b();
    }
}
