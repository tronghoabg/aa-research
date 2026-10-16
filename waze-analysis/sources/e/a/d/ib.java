package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ib implements ig {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f47139a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f47140b;

    ib(iy iyVar, int i2, int i3, byte[] bArr) {
        this.f47140b = i3;
        this.f47139a = i2;
        Objects.requireNonNull(iyVar);
    }

    @Override // e.a.d.ig
    public final void a(iw iwVar) {
        int i2 = this.f47140b;
        if (i2 == 0) {
            iwVar.f47186a.l(this.f47139a);
        } else if (i2 != 1) {
            iwVar.f47186a.g(this.f47139a);
        } else {
            iwVar.f47186a.k(this.f47139a);
        }
    }

    ib(iy iyVar, int i2, int i3) {
        this.f47140b = i3;
        this.f47139a = i2;
        Objects.requireNonNull(iyVar);
    }

    ib(iy iyVar, int i2, int i3, char[] cArr) {
        this.f47140b = i3;
        this.f47139a = i2;
        Objects.requireNonNull(iyVar);
    }
}
