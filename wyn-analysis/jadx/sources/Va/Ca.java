package Va;

import java.util.Iterator;

/* loaded from: classes4.dex */
public final class Ca extends Ba {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13259c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Da f13260d;

    public /* synthetic */ Ca(int i5) {
        this.f13259c = i5;
    }

    @Override // Va.Ba
    public final void c() {
        switch (this.f13259c) {
            case 0:
                Da da2 = this.f13260d;
                ((Ea) da2.f13291f).b();
                Ea.e((Ea) da2.f13291f, false);
                break;
            case 1:
                Da da3 = this.f13260d;
                Ea.e((Ea) da3.f13291f, false);
                ((Ea) da3.f13291f).b();
                break;
            default:
                Da da4 = this.f13260d;
                Ea.e((Ea) da4.f13291f, true);
                Ea ea2 = (Ea) da4.f13291f;
                Ea.f13320g = (Ea.f13319f + 93) % 128;
                Iterator it = ea2.a().iterator();
                while (it.hasNext()) {
                    ((InterfaceC1229za) it.next()).a();
                    Ea.f13319f = (Ea.f13320g + 113) % 128;
                }
                break;
        }
    }
}
