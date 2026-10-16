package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ia implements ig {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47138a;

    ia(iy iyVar, int i2, byte[] bArr) {
        this.f47138a = i2;
        Objects.requireNonNull(iyVar);
    }

    @Override // e.a.d.ig
    public final void a(iw iwVar) {
        int i2 = this.f47138a;
        if (i2 == 0) {
            iwVar.f47186a.e();
        } else if (i2 != 1) {
            iwVar.f47186a.f();
        } else {
            iwVar.f47186a.d();
        }
    }

    ia(iy iyVar, int i2) {
        this.f47138a = i2;
        Objects.requireNonNull(iyVar);
    }

    ia(iy iyVar, int i2, char[] cArr) {
        this.f47138a = i2;
        Objects.requireNonNull(iyVar);
    }
}
