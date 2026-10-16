package L9;

import J9.H;
import Re.C0818m;
import Re.Q;

/* loaded from: classes4.dex */
public final class e implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7046a;

    /* renamed from: b, reason: collision with root package name */
    public final xa.d f7047b;

    public /* synthetic */ e(xa.d dVar, int i5) {
        this.f7046a = i5;
        this.f7047b = dVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        xa.d dVar = this.f7047b;
        switch (this.f7046a) {
            case 0:
                B8.b bVar = new B8.b(dVar, 18);
                int i5 = He.c.f5007a;
                N0.a.n(3, "mode is null");
                Q qC = new C0818m(bVar, 0).c();
                qC.f();
                return qC;
            default:
                return (H) dVar.f47873b;
        }
    }
}
