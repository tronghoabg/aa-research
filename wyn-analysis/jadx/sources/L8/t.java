package L8;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Class f7032a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f7033b;

    public t(Class cls, Class cls2) {
        this.f7032a = cls;
        this.f7033b = cls2;
    }

    public static t a(Class cls) {
        return new t(s.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f7033b.equals(tVar.f7033b)) {
            return this.f7032a.equals(tVar.f7032a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7032a.hashCode() + (this.f7033b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f7033b;
        Class cls2 = this.f7032a;
        if (cls2 == s.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + StringUtils.SPACE + cls.getName();
    }
}
