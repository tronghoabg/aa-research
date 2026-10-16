package ad;

import j$.util.Objects;
import x6.C4481l;

/* renamed from: ad.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1361f {

    /* renamed from: a, reason: collision with root package name */
    public final int f17577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17578b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17579c;

    /* renamed from: d, reason: collision with root package name */
    public final C1363h f17580d;

    public C1361f(C4481l c4481l) {
        this.f17577a = c4481l.f47720a;
        this.f17578b = c4481l.f47722c;
        this.f17579c = c4481l.f47721b;
        x6.t tVar = c4481l.f47740e;
        if (tVar != null) {
            this.f17580d = new C1363h(tVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1361f)) {
            return false;
        }
        C1361f c1361f = (C1361f) obj;
        if (this.f17577a == c1361f.f17577a && this.f17578b.equals(c1361f.f17578b) && Objects.equals(this.f17580d, c1361f.f17580d)) {
            return this.f17579c.equals(c1361f.f17579c);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17577a), this.f17578b, this.f17579c, this.f17580d);
    }

    public C1361f(int i5, String str, String str2, C1363h c1363h) {
        this.f17577a = i5;
        this.f17578b = str;
        this.f17579c = str2;
        this.f17580d = c1363h;
    }
}
