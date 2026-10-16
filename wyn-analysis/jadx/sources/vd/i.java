package vd;

import md.EnumC3545m;
import md.M;
import od.C3706m1;
import od.C3743z0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final j f47179a;

    /* renamed from: b, reason: collision with root package name */
    public final C4342e f47180b;

    /* renamed from: c, reason: collision with root package name */
    public final C3706m1 f47181c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC3545m f47182d;

    /* renamed from: e, reason: collision with root package name */
    public M f47183e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f47184f = false;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v f47185g;

    public i(v vVar, j jVar, C3706m1 c3706m1, C3743z0 c3743z0) {
        this.f47185g = vVar;
        this.f47179a = jVar;
        this.f47181c = c3706m1;
        this.f47183e = c3743z0;
        C4342e c4342e = new C4342e(new h(this, 1));
        this.f47180b = c4342e;
        this.f47182d = EnumC3545m.f40692a;
        c4342e.i(c3706m1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Address = ");
        sb2.append(this.f47179a);
        sb2.append(", state = ");
        sb2.append(this.f47182d);
        sb2.append(", picker type: ");
        sb2.append(this.f47183e.getClass());
        sb2.append(", lb: ");
        sb2.append(this.f47180b.g().getClass());
        sb2.append(this.f47184f ? ", deactivated" : "");
        return sb2.toString();
    }
}
