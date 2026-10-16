package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class rce extends defpackage.stq {
    private final java.lang.ref.WeakReference a;

    public rce(java.lang.Object obj, android.os.Looper looper) {
        super(looper);
        if (getLooper() == android.os.Looper.getMainLooper()) {
            a(getClass());
        }
        this.a = new java.lang.ref.WeakReference(obj);
    }

    private final void a(java.lang.Class cls) {
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && !java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            defpackage.rrx.d(6, "SafeHandler", null, "Handler needs to be a top-level or static class; handler: %s", cls.getCanonicalName());
        }
        java.lang.Class superclass = cls.getSuperclass();
        if (superclass != null) {
            a(superclass);
        }
    }

    public final java.lang.Object v() {
        return this.a.get();
    }
}
