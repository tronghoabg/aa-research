package Va;

/* loaded from: classes4.dex */
public final class Fa implements InterfaceC1229za {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13345a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13346b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13347c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Ba f13348d;

    public /* synthetic */ Fa(int i5) {
        this.f13345a = i5;
    }

    @Override // Va.InterfaceC1229za
    public final void a() {
        switch (this.f13345a) {
            case 0:
                Ga ga2 = (Ga) this.f13348d;
                Ha.a((Ha) ga2.f13389h).a().i(this);
                Pa pa2 = (Pa) this.f13346b;
                InterfaceC1217ya interfaceC1217ya = (InterfaceC1217ya) this.f13347c;
                int i5 = Ha.f13416h + 117;
                Ha.f13415g = i5 % 128;
                int i10 = i5 % 2;
                ((Ha) ga2.f13389h).b(pa2, interfaceC1217ya);
                if (i10 != 0) {
                    throw null;
                }
                return;
            default:
                Da da2 = (Da) this.f13348d;
                C1218z.e((C1218z) da2.f13291f).i(this);
                C1218z c1218z = (C1218z) da2.f13291f;
                int i11 = C1218z.f14826h + 25;
                C1218z.f14825g = i11 % 128;
                int i12 = i11 % 2;
                c1218z.b((Ia) this.f13346b, (C0999ha) this.f13347c);
                if (i12 != 0) {
                    throw null;
                }
                return;
        }
    }
}
