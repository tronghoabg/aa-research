package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1396m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C1396m f18242a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1396m f18243b;

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        C1396m c1396m = new C1396m();
        Map map = Collections.EMPTY_MAP;
        f18243b = c1396m;
    }

    public static C1396m a() {
        C1396m c1396m;
        C1396m c1396m2 = f18242a;
        if (c1396m2 != null) {
            return c1396m2;
        }
        synchronized (C1396m.class) {
            try {
                c1396m = f18242a;
                if (c1396m == null) {
                    Class cls = AbstractC1395l.f18240a;
                    if (cls != null) {
                        try {
                            c1396m = (C1396m) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                        f18242a = c1396m;
                    } else {
                        c1396m = f18243b;
                        f18242a = c1396m;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1396m;
    }
}
