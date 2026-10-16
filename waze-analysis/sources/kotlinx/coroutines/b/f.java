package kotlinx.coroutines.b;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
class f extends kotlinx.coroutines.b.a.e {

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.p f51679d;

    public f(h.g.a.p pVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        super(jVar, i2, aVar);
        this.f51679d = pVar;
    }

    static /* synthetic */ Object f(f fVar, kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        Object objInvoke = fVar.f51679d.invoke(adVar, eVar);
        return objInvoke == h.c.a.a.f48038a ? objInvoke : h.ab.f48028a;
    }

    @Override // kotlinx.coroutines.b.a.e
    protected Object a(kotlinx.coroutines.a.ad adVar, h.c.e eVar) {
        return f(this, adVar, eVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    protected kotlinx.coroutines.b.a.e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return new f(this.f51679d, jVar, i2, aVar);
    }

    @Override // kotlinx.coroutines.b.a.e
    public final String toString() throws IOException {
        return "block[" + this.f51679d + "] -> " + super.toString();
    }
}
