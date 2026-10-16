package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public class rbj extends sss {
    private final WeakReference a;

    public rbj(Object obj, Looper looper) {
        super(looper);
        if (getLooper() == Looper.getMainLooper()) {
            a(getClass());
        }
        this.a = new WeakReference(obj);
    }

    private final void a(Class cls) {
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && !Modifier.isStatic(cls.getModifiers())) {
            rrd.d(6, "SafeHandler", null, "Handler needs to be a top-level or static class; handler: %s", cls.getCanonicalName());
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            a(superclass);
        }
    }

    public final Object v() {
        return this.a.get();
    }
}
