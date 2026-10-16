package md;

import A7.C0237b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    public final List f40588a;

    /* renamed from: b, reason: collision with root package name */
    public final C3534b f40589b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f40590c;

    public L(List list, C3534b c3534b, Object obj) {
        Fe.e.t(list, "addresses");
        this.f40588a = DesugarCollections.unmodifiableList(new ArrayList(list));
        Fe.e.t(c3534b, "attributes");
        this.f40589b = c3534b;
        this.f40590c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return Fe.b.v(this.f40588a, l10.f40588a) && Fe.b.v(this.f40589b, l10.f40589b) && Fe.b.v(this.f40590c, l10.f40590c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40588a, this.f40589b, this.f40590c});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40588a, "addresses");
        c0237b0S.f(this.f40589b, "attributes");
        c0237b0S.f(this.f40590c, "loadBalancingPolicyConfig");
        return c0237b0S.toString();
    }
}
