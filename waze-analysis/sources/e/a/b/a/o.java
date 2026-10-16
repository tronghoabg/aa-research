package e.a.b.a;

import android.os.Parcel;
import e.a.cm;
import e.a.ee;
import e.a.ef;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends r {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f46422g;

    /* renamed from: h, reason: collision with root package name */
    private ee f46423h;

    /* renamed from: i, reason: collision with root package name */
    private cm f46424i;

    o(e eVar, e.a.c cVar, int i2, boolean z) {
        super(eVar, cVar, i2);
        this.f46422g = z;
    }

    @Override // e.a.b.a.r
    protected final void a(ee eeVar) {
        ((e.a.d.ah) this.f46441f).c(eeVar, e.a.d.ag.f46605a, new cm());
    }

    @Override // e.a.b.a.r
    protected final void b() {
        this.f46440e.d();
        this.f46440e.m();
        l(p.f46430f);
        ((e.a.d.ah) this.f46441f).c(this.f46423h, e.a.d.ag.f46605a, this.f46424i);
        n();
    }

    @Override // e.a.b.a.r
    protected final void c(int i2, Parcel parcel) {
        this.f46423h = at.a(i2, parcel);
        this.f46424i = com.waze.uid.activities.a.g(parcel, this.f46437b);
    }

    @Override // e.a.b.a.r
    final boolean d() {
        return this.f46422g;
    }

    @Override // e.a.b.a.r
    protected final void e(Parcel parcel) throws ef {
        cm cmVarG = com.waze.uid.activities.a.g(parcel, this.f46437b);
        this.f46440e.c();
        ((e.a.d.ah) this.f46441f).d(cmVarG);
    }
}
