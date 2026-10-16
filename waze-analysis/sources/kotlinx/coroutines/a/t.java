package kotlinx.coroutines.a;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes7.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final s f51322a = new s();

    /* renamed from: b, reason: collision with root package name */
    private final Object f51323b;

    private /* synthetic */ t(Object obj) {
        this.f51323b = obj;
    }

    public static final Object a(Object obj) {
        if (obj instanceof s) {
            return null;
        }
        return obj;
    }

    public static String c(Object obj) {
        if (obj instanceof r) {
            return ((r) obj).toString();
        }
        return "Value(" + obj + ")";
    }

    public static final Throwable d(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null) {
            return rVar.f51321a;
        }
        return null;
    }

    public static final /* synthetic */ t f(Object obj) {
        return new t(obj);
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof s);
    }

    public static final void h(Object obj) throws Throwable {
        if (obj instanceof s) {
            if (!(obj instanceof r)) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
            }
            Throwable th = ((r) obj).f51321a;
            if (th == null) {
                throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
            }
            throw th;
        }
    }

    public final /* synthetic */ Object b() {
        return this.f51323b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t) && h.g.b.x.n(this.f51323b, ((t) obj).f51323b);
    }

    public final int hashCode() {
        Object obj = this.f51323b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return c(this.f51323b);
    }
}
