package md;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f40572d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final String f40573a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40574b;

    /* renamed from: c, reason: collision with root package name */
    public final long f40575c;

    public F(String str, String str2, long j8) {
        Fe.e.t(str, "typeName");
        Fe.e.p("empty type", !str.isEmpty());
        this.f40573a = str;
        this.f40574b = str2;
        this.f40575c = j8;
    }

    public static F a(Class cls, String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new F(simpleName, str, f40572d.incrementAndGet());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f40573a + "<" + this.f40575c + ">");
        String str = this.f40574b;
        if (str != null) {
            sb2.append(": (");
            sb2.append(str);
            sb2.append(')');
        }
        return sb2.toString();
    }
}
