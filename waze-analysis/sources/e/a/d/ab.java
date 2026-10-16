package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends au {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46586a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46587b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f46588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ad adVar, e.a.ee eeVar, e.a.cm cmVar) {
        super(adVar.f46590a.f46599g);
        this.f46586a = eeVar;
        this.f46587b = cmVar;
        Objects.requireNonNull(adVar);
        this.f46588c = adVar;
    }

    @Override // e.a.d.au
    public final void a() {
        int i2 = e.b.b.f47862a;
        ad adVar = this.f46588c;
        adVar.f46590a.f46600h.d();
        e.a.ee eeVar = this.f46586a;
        e.a.cm cmVar = this.f46587b;
        if (adVar.f46591b != null) {
            eeVar = adVar.f46591b;
            cmVar = new e.a.cm();
        }
        try {
            ae.s(adVar.f46592c, eeVar, cmVar);
        } finally {
            this.f46588c.f46590a.f46598f.a(eeVar.l());
        }
    }
}
