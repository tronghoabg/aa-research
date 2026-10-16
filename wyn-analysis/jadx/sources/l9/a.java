package L9;

import J9.C0644c;
import J9.J;
import android.app.Application;
import df.InterfaceC2432a;

/* loaded from: classes4.dex */
public final class a implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final Dd.c f7036a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2432a f7037b;

    /* renamed from: c, reason: collision with root package name */
    public final K9.a f7038c;

    /* renamed from: d, reason: collision with root package name */
    public final K9.a f7039d;

    public a(Dd.c cVar, InterfaceC2432a interfaceC2432a, K9.a aVar, K9.a aVar2) {
        this.f7036a = cVar;
        this.f7037b = interfaceC2432a;
        this.f7038c = aVar;
        this.f7039d = aVar2;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        Application application = (Application) this.f7038c.get();
        J j8 = (J) this.f7039d.get();
        Dd.c cVar = this.f7036a;
        return new C0644c(this.f7037b, (s8.g) cVar.f2642b, application, (M9.a) cVar.f2644d, j8);
    }
}
