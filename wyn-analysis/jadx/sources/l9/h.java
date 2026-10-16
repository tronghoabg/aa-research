package L9;

import J9.C0651j;
import J9.C0664x;
import J9.G;
import java.util.concurrent.Executor;
import q5.C3868c;
import q5.InterfaceC3872g;
import t5.C4121p;

/* loaded from: classes4.dex */
public final class h implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final b f7052a;

    /* renamed from: b, reason: collision with root package name */
    public final A9.c f7053b;

    /* renamed from: c, reason: collision with root package name */
    public final K9.a f7054c;

    /* renamed from: d, reason: collision with root package name */
    public final b f7055d;

    /* renamed from: e, reason: collision with root package name */
    public final K9.a f7056e;

    /* renamed from: f, reason: collision with root package name */
    public final K9.a f7057f;

    public h(b bVar, A9.c cVar, K9.a aVar, b bVar2, D9.f fVar, K9.a aVar2, K9.a aVar3) {
        this.f7052a = bVar;
        this.f7053b = cVar;
        this.f7054c = aVar;
        this.f7055d = bVar2;
        this.f7056e = aVar2;
        this.f7057f = aVar3;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        s8.g gVar = (s8.g) this.f7052a.f7041b.f2642b;
        InterfaceC3872g interfaceC3872g = (InterfaceC3872g) this.f7053b.f1246b;
        return new G(new B8.b(((C4121p) interfaceC3872g).a("FIREBASE_INAPPMESSAGING", new C3868c("proto"), new C0664x(8)), 20), (w8.d) this.f7054c.get(), gVar, (P9.d) this.f7055d.get(), new M9.a(), (C0651j) this.f7056e.get(), (Executor) this.f7057f.get());
    }
}
