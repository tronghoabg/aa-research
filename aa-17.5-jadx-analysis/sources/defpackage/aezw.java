package defpackage;

import java.io.Serializable;

@afdo
/* loaded from: classes.dex */
public final class aezw implements Serializable {
    public final Object a;

    public /* synthetic */ aezw(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof aezv) {
            return ((aezv) obj).a;
        }
        return null;
    }

    public static final boolean b(Object obj) {
        return !(obj instanceof aezv);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aezw) && affa.f(this.a, ((aezw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        return obj instanceof aezv ? ((aezv) obj).toString() : a.bm(obj, "Success(", ")");
    }
}
