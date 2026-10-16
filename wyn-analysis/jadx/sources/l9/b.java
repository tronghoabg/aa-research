package L9;

import J9.Y;

/* loaded from: classes4.dex */
public final class b implements A9.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7040a;

    /* renamed from: b, reason: collision with root package name */
    public final Dd.c f7041b;

    public /* synthetic */ b(int i5, Dd.c cVar) {
        this.f7040a = i5;
        this.f7041b = cVar;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f7040a) {
            case 0:
                return (s8.g) this.f7041b.f2642b;
            case 1:
                P9.d dVar = (P9.d) this.f7041b.f2643c;
                Fe.b.l(dVar);
                return dVar;
            default:
                return new Y((s8.g) this.f7041b.f2642b);
        }
    }
}
