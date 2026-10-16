package B4;

import android.text.TextUtils;
import x9.C4504d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final C4504d f1584e = new C4504d(14);

    /* renamed from: a, reason: collision with root package name */
    public final Object f1585a;

    /* renamed from: b, reason: collision with root package name */
    public final e f1586b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1587c;

    /* renamed from: d, reason: collision with root package name */
    public volatile byte[] f1588d;

    public f(String str, Object obj, e eVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f1587c = str;
        this.f1585a = obj;
        this.f1586b = eVar;
    }

    public static f a(Object obj, String str) {
        return new f(str, obj, f1584e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f1587c.equals(((f) obj).f1587c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1587c.hashCode();
    }

    public final String toString() {
        return wg.b.c(new StringBuilder("Option{key='"), this.f1587c, "'}");
    }
}
