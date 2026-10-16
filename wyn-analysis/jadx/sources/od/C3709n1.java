package od;

import java.util.Arrays;
import md.C3535c;

/* renamed from: od.n1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3709n1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3535c f42020a;

    /* renamed from: b, reason: collision with root package name */
    public final md.b0 f42021b;

    /* renamed from: c, reason: collision with root package name */
    public final F6.r f42022c;

    public C3709n1(F6.r rVar, md.b0 b0Var, C3535c c3535c) {
        Fe.e.t(rVar, "method");
        this.f42022c = rVar;
        Fe.e.t(b0Var, "headers");
        this.f42021b = b0Var;
        Fe.e.t(c3535c, "callOptions");
        this.f42020a = c3535c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3709n1.class == obj.getClass()) {
            C3709n1 c3709n1 = (C3709n1) obj;
            if (Fe.b.v(this.f42020a, c3709n1.f42020a) && Fe.b.v(this.f42021b, c3709n1.f42021b) && Fe.b.v(this.f42022c, c3709n1.f42022c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f42020a, this.f42021b, this.f42022c});
    }

    public final String toString() {
        return "[method=" + this.f42022c + " headers=" + this.f42021b + " callOptions=" + this.f42020a + "]";
    }
}
