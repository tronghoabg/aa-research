package t9;

import java.util.HashSet;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f45947b = new f(new HashSet());

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f45948a;

    public f(HashSet hashSet) {
        this.f45948a = hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        return this.f45948a.equals(((f) obj).f45948a);
    }

    public final int hashCode() {
        return this.f45948a.hashCode();
    }

    public final String toString() {
        return "FieldMask{mask=" + this.f45948a.toString() + "}";
    }
}
