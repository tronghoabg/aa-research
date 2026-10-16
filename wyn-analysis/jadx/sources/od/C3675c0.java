package od;

import A7.C0237b0;
import java.util.Arrays;
import java.util.Set;
import l8.AbstractC3414P;

/* renamed from: od.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3675c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f41928b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC3414P f41929c;

    public C3675c0(int i5, long j8, Set set) {
        this.f41927a = i5;
        this.f41928b = j8;
        this.f41929c = AbstractC3414P.j(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3675c0.class != obj.getClass()) {
            return false;
        }
        C3675c0 c3675c0 = (C3675c0) obj;
        return this.f41927a == c3675c0.f41927a && this.f41928b == c3675c0.f41928b && Fe.b.v(this.f41929c, c3675c0.f41929c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f41927a), Long.valueOf(this.f41928b), this.f41929c});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.h("maxAttempts", String.valueOf(this.f41927a));
        c0237b0S.e(this.f41928b, "hedgingDelayNanos");
        c0237b0S.f(this.f41929c, "nonFatalStatusCodes");
        return c0237b0S.toString();
    }
}
