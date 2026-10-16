package L8;

import J9.C0664x;

/* loaded from: classes4.dex */
public final class r implements O9.b {

    /* renamed from: c, reason: collision with root package name */
    public static final C0664x f7028c = new C0664x(7);

    /* renamed from: d, reason: collision with root package name */
    public static final g f7029d = new g(1);

    /* renamed from: a, reason: collision with root package name */
    public O9.a f7030a;

    /* renamed from: b, reason: collision with root package name */
    public volatile O9.b f7031b;

    public r(C0664x c0664x, O9.b bVar) {
        this.f7030a = c0664x;
        this.f7031b = bVar;
    }

    public final void a(O9.a aVar) {
        O9.b bVar;
        O9.b bVar2;
        O9.b bVar3 = this.f7031b;
        g gVar = f7029d;
        if (bVar3 != gVar) {
            aVar.f(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f7031b;
            if (bVar != gVar) {
                bVar2 = bVar;
            } else {
                this.f7030a = new A5.h(16, this.f7030a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.f(bVar);
        }
    }

    @Override // O9.b
    public final Object get() {
        return this.f7031b.get();
    }
}
