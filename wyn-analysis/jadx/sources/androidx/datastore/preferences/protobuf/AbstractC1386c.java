package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1386c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18186a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f18187b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f18186a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f18187b = cls2 != null;
    }

    public static boolean a() {
        return (f18186a == null || f18187b) ? false : true;
    }
}
