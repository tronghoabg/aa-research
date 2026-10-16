package h;

import java.io.Serializable;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class m<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Object f48168a;

    private /* synthetic */ m(Object obj) {
        this.f48168a = obj;
    }

    public static int a(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final Throwable c(Object obj) {
        if (obj instanceof l) {
            return ((l) obj).f48162a;
        }
        return null;
    }

    public static final /* synthetic */ m d(Object obj) {
        return new m(obj);
    }

    public static final boolean e(Object obj) {
        return !(obj instanceof l);
    }

    public final /* synthetic */ Object b() {
        return this.f48168a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m) && h.g.b.x.n(this.f48168a, ((m) obj).f48168a);
    }

    public final int hashCode() {
        return a(this.f48168a);
    }

    public final String toString() {
        Object obj = this.f48168a;
        if (obj instanceof l) {
            return ((l) obj).toString();
        }
        return "Success(" + obj + ")";
    }
}
