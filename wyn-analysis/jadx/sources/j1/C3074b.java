package j1;

import j$.util.Objects;
import org.apache.tika.utils.StringUtils;

/* renamed from: j1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3074b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f38572a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f38573b;

    public C3074b(Object obj, Object obj2) {
        this.f38572a = obj;
        this.f38573b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3074b)) {
            return false;
        }
        C3074b c3074b = (C3074b) obj;
        return Objects.equals(c3074b.f38572a, this.f38572a) && Objects.equals(c3074b.f38573b, this.f38573b);
    }

    public final int hashCode() {
        Object obj = this.f38572a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f38573b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f38572a + StringUtils.SPACE + this.f38573b + "}";
    }
}
