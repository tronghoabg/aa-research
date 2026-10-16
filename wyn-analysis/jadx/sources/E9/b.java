package E9;

import D9.k;
import N9.h;
import android.view.LayoutInflater;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class b implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3597a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f3598b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2432a f3599c;

    /* renamed from: d, reason: collision with root package name */
    public final G9.f f3600d;

    public /* synthetic */ b(InterfaceC2432a interfaceC2432a, InterfaceC2432a interfaceC2432a2, G9.f fVar, int i5) {
        this.f3597a = i5;
        this.f3598b = interfaceC2432a;
        this.f3599c = interfaceC2432a2;
        this.f3600d = fVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f3597a) {
            case 0:
                return new a((k) this.f3598b.get(), (LayoutInflater) this.f3599c.get(), (h) this.f3600d.get());
            case 1:
                e eVar = new e((k) this.f3598b.get(), (LayoutInflater) this.f3599c.get(), (h) this.f3600d.get());
                eVar.f3615n = new d(eVar, 0);
                return eVar;
            case 2:
                return new f((k) this.f3598b.get(), (LayoutInflater) this.f3599c.get(), (h) this.f3600d.get());
            default:
                g gVar = new g((k) this.f3598b.get(), (LayoutInflater) this.f3599c.get(), (h) this.f3600d.get());
                gVar.f3628m = new d(gVar, 1);
                return gVar;
        }
    }
}
