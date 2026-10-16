package R;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static e f10013b;

    /* renamed from: a, reason: collision with root package name */
    public Object f10014a;

    public void a() {
        synchronized (this.f10014a) {
        }
    }

    public e() {
        this.f10014a = new Object();
        new Handler(Looper.getMainLooper(), new P4.g(this, 2));
    }
}
