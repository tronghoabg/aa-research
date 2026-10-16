package K;

import N.C0718d;
import N.P;
import N.Y;
import e0.C2465q;

/* renamed from: K.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680e {

    /* renamed from: a, reason: collision with root package name */
    public final Y f6239a;

    /* renamed from: b, reason: collision with root package name */
    public final Y f6240b;

    /* renamed from: c, reason: collision with root package name */
    public final Y f6241c;

    /* renamed from: d, reason: collision with root package name */
    public final Y f6242d;

    /* renamed from: e, reason: collision with root package name */
    public final Y f6243e;

    /* renamed from: f, reason: collision with root package name */
    public final Y f6244f;

    /* renamed from: g, reason: collision with root package name */
    public final Y f6245g;

    /* renamed from: h, reason: collision with root package name */
    public final Y f6246h;

    /* renamed from: i, reason: collision with root package name */
    public final Y f6247i;

    /* renamed from: j, reason: collision with root package name */
    public final Y f6248j;
    public final Y k;

    /* renamed from: l, reason: collision with root package name */
    public final Y f6249l;

    /* renamed from: m, reason: collision with root package name */
    public final Y f6250m;

    public C0680e(long j8, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, boolean z2) {
        C2465q c2465q = new C2465q(j8);
        P p10 = P.f7730f;
        this.f6239a = C0718d.G(c2465q, p10);
        this.f6240b = C0718d.G(new C2465q(j10), p10);
        this.f6241c = C0718d.G(new C2465q(j11), p10);
        this.f6242d = C0718d.G(new C2465q(j12), p10);
        this.f6243e = C0718d.G(new C2465q(j13), p10);
        this.f6244f = C0718d.G(new C2465q(j14), p10);
        this.f6245g = C0718d.G(new C2465q(j15), p10);
        this.f6246h = C0718d.G(new C2465q(j16), p10);
        this.f6247i = C0718d.G(new C2465q(j17), p10);
        this.f6248j = C0718d.G(new C2465q(j18), p10);
        this.k = C0718d.G(new C2465q(j19), p10);
        this.f6249l = C0718d.G(new C2465q(j20), p10);
        this.f6250m = C0718d.G(Boolean.valueOf(z2), p10);
    }

    public final long a() {
        return ((C2465q) this.k.getValue()).f34382a;
    }

    public final long b() {
        return ((C2465q) this.f6239a.getValue()).f34382a;
    }

    public final long c() {
        return ((C2465q) this.f6244f.getValue()).f34382a;
    }

    public final boolean d() {
        return ((Boolean) this.f6250m.getValue()).booleanValue();
    }

    public final String toString() {
        return "Colors(primary=" + ((Object) C2465q.h(b())) + ", primaryVariant=" + ((Object) C2465q.h(((C2465q) this.f6240b.getValue()).f34382a)) + ", secondary=" + ((Object) C2465q.h(((C2465q) this.f6241c.getValue()).f34382a)) + ", secondaryVariant=" + ((Object) C2465q.h(((C2465q) this.f6242d.getValue()).f34382a)) + ", background=" + ((Object) C2465q.h(((C2465q) this.f6243e.getValue()).f34382a)) + ", surface=" + ((Object) C2465q.h(c())) + ", error=" + ((Object) C2465q.h(((C2465q) this.f6245g.getValue()).f34382a)) + ", onPrimary=" + ((Object) C2465q.h(((C2465q) this.f6246h.getValue()).f34382a)) + ", onSecondary=" + ((Object) C2465q.h(((C2465q) this.f6247i.getValue()).f34382a)) + ", onBackground=" + ((Object) C2465q.h(((C2465q) this.f6248j.getValue()).f34382a)) + ", onSurface=" + ((Object) C2465q.h(a())) + ", onError=" + ((Object) C2465q.h(((C2465q) this.f6249l.getValue()).f34382a)) + ", isLight=" + d() + ')';
    }
}
