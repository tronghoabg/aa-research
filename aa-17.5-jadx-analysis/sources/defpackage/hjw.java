package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hjw {
    public static final hjw a;
    public static final hjw b;
    public static final hjw c;
    public static final hjw d;
    public final long e;
    public final long f;

    static {
        long j = gux.j();
        wnj wnjVar = hjb.a;
        a = new hjw(j, cjn.i(hjb.a.a(40)));
        b = new hjw(gux.i(), cjn.i(hjb.b.a(40)));
        c = new hjw(gux.h(), cjn.i(hjb.c.a(40)));
        d = new hjw(gux.k(), cjn.i(hjb.d.a(40)));
        cjn.n();
    }

    public hjw(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    public final long a(boolean z, bux buxVar, int i) {
        return (((z ? 1 : 0) | i) ^ (ca.bl(buxVar) ? 1 : 0)) != 0 ? this.f : this.e;
    }

    public final List b(bux buxVar) {
        return ca.bl(buxVar) ? woy.bi(new cjv(this.e), new cjv(this.f)) : woy.bi(new cjv(this.f), new cjv(this.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjw)) {
            return false;
        }
        hjw hjwVar = (hjw) obj;
        return a.j(this.e, hjwVar.e) && a.j(this.f, hjwVar.f);
    }

    public final int hashCode() {
        return (a.g(this.e) * 31) + a.g(this.f);
    }

    public final String toString() {
        long j = this.f;
        return "CarColorUiModel(lightVariant=" + cjv.g(this.e) + ", darkVariant=" + cjv.g(j) + ")";
    }
}
