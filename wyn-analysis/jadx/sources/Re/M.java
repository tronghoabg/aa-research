package Re;

import x9.C4504d;

/* loaded from: classes5.dex */
public final class M extends AbstractC0806a {

    /* renamed from: c, reason: collision with root package name */
    public final int f10677c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10678d;

    /* renamed from: e, reason: collision with root package name */
    public final C4504d f10679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(C0818m c0818m, int i5) {
        super(c0818m);
        C4504d c4504d = Ne.b.f8673c;
        this.f10677c = i5;
        this.f10678d = true;
        this.f10679e = c4504d;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        this.f10702b.d(new L(fVar, this.f10677c, this.f10678d, this.f10679e));
    }
}
