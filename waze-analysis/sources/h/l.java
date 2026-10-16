package h;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f48162a;

    public l(Throwable th) {
        h.g.b.x.f(th, "exception");
        this.f48162a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof l) && h.g.b.x.n(this.f48162a, ((l) obj).f48162a);
    }

    public final int hashCode() {
        return this.f48162a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f48162a + ")";
    }
}
