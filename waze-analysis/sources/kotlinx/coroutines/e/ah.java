package kotlinx.coroutines.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ah extends kotlinx.coroutines.a implements h.c.b.a.d {

    /* renamed from: c, reason: collision with root package name */
    public final h.c.e f51865c;

    public ah(h.c.j jVar, h.c.e eVar) {
        super(jVar, true);
        this.f51865c = eVar;
    }

    @Override // kotlinx.coroutines.a
    protected void bQ(Object obj) {
        h.c.e eVar = this.f51865c;
        eVar.resumeWith(h.f.s.i(obj, eVar));
    }

    @Override // h.c.b.a.d
    public final h.c.b.a.d getCallerFrame() {
        h.c.e eVar = this.f51865c;
        if (eVar instanceof h.c.b.a.d) {
            return (h.c.b.a.d) eVar;
        }
        return null;
    }

    @Override // h.c.b.a.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.cf
    protected void k(Object obj) {
        h.c.e eVar = this.f51865c;
        k.b(h.c.a.h.d(eVar), h.f.s.i(obj, eVar));
    }

    @Override // kotlinx.coroutines.cf
    protected final boolean l() {
        return true;
    }

    public void bT() {
    }
}
