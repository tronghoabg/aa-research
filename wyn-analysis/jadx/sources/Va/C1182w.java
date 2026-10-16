package Va;

/* renamed from: Va.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1182w implements InterfaceC1229za {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ C1194x f14717a;

    @Override // Va.InterfaceC1229za
    public final void a() {
        int i5 = C1194x.f14741r + 87;
        C1194x.f14742s = i5 % 128;
        int i10 = i5 % 2;
        C1194x c1194x = this.f14717a;
        c1194x.getClass();
        if (i10 == 0) {
            int i11 = C1194x.f14742s + 111;
            C1194x.f14741r = i11 % 128;
            int i12 = i11 % 2;
            c1194x.n(false);
            int i13 = 51 / 0;
        } else {
            int i14 = C1194x.f14742s + 111;
            C1194x.f14741r = i14 % 128;
            int i15 = i14 % 2;
            c1194x.n(false);
        }
        C1194x.f14742s = (C1194x.f14741r + 69) % 128;
    }
}
