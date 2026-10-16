package od;

import A7.C0237b0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class R1 {

    /* renamed from: a, reason: collision with root package name */
    public final md.P f41795a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41796b;

    public R1(md.P p10, Object obj) {
        this.f41795a = p10;
        this.f41796b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R1.class == obj.getClass()) {
            R1 r12 = (R1) obj;
            if (Fe.b.v(this.f41795a, r12.f41795a) && Fe.b.v(this.f41796b, r12.f41796b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f41795a, this.f41796b});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41795a, "provider");
        c0237b0S.f(this.f41796b, "config");
        return c0237b0S.toString();
    }
}
