package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class duz {
    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(int i) {
        new Handler(Looper.getMainLooper()).post(new ira(this, i, 1));
    }

    public final void d(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new aq(this, typeface, 6));
    }
}
