package r;

import Fe.e;
import android.os.Looper;
import com.applovin.impl.T0;

/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3894a extends e {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C3894a f44283b;

    /* renamed from: c, reason: collision with root package name */
    public static final T0 f44284c = new T0(3);

    /* renamed from: a, reason: collision with root package name */
    public final C3895b f44285a = new C3895b();

    public static C3894a h0() {
        if (f44283b != null) {
            return f44283b;
        }
        synchronized (C3894a.class) {
            try {
                if (f44283b == null) {
                    f44283b = new C3894a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f44283b;
    }

    public final void i0(Runnable runnable) {
        C3895b c3895b = this.f44285a;
        if (c3895b.f44288c == null) {
            synchronized (c3895b.f44286a) {
                try {
                    if (c3895b.f44288c == null) {
                        c3895b.f44288c = C3895b.h0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c3895b.f44288c.post(runnable);
    }
}
