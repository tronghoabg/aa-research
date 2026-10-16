package md;

import A7.C0237b0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f40637a;

    /* renamed from: b, reason: collision with root package name */
    public final C3534b f40638b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f40639c;

    public e0(List list, C3534b c3534b, d0 d0Var) {
        this.f40637a = DesugarCollections.unmodifiableList(new ArrayList(list));
        Fe.e.t(c3534b, "attributes");
        this.f40638b = c3534b;
        this.f40639c = d0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Fe.b.v(this.f40637a, e0Var.f40637a) && Fe.b.v(this.f40638b, e0Var.f40638b) && Fe.b.v(this.f40639c, e0Var.f40639c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f40637a, this.f40638b, this.f40639c});
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f40637a, "addresses");
        c0237b0S.f(this.f40638b, "attributes");
        c0237b0S.f(this.f40639c, "serviceConfig");
        return c0237b0S.toString();
    }
}
