package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hz implements ig {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f47134a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f47135b;

    hz(iy iyVar, e.a.s sVar, int i2) {
        this.f47135b = i2;
        this.f47134a = sVar;
        Objects.requireNonNull(iyVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [e.a.s, java.lang.Object] */
    @Override // e.a.d.ig
    public final void a(iw iwVar) {
        int i2 = this.f47135b;
        if (i2 == 0) {
            iwVar.f47186a.i((e.a.ad) this.f47134a);
        } else if (i2 != 1) {
            iwVar.f47186a.j((e.a.ag) this.f47134a);
        } else {
            iwVar.f47186a.h(this.f47134a);
        }
    }

    hz(iy iyVar, e.a.ad adVar, int i2) {
        this.f47135b = i2;
        this.f47134a = adVar;
        Objects.requireNonNull(iyVar);
    }

    hz(iy iyVar, e.a.ag agVar, int i2) {
        this.f47135b = i2;
        this.f47134a = agVar;
        Objects.requireNonNull(iyVar);
    }
}
