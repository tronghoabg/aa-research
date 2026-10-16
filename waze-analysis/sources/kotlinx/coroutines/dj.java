package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class dj extends kotlinx.coroutines.e.ah {

    /* renamed from: b, reason: collision with root package name */
    private final ThreadLocal f51846b;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public dj(h.c.j jVar, h.c.e eVar) {
        dk dkVar = dk.f51847a;
        super(jVar.get(dkVar) == null ? jVar.plus(dkVar) : jVar, eVar);
        this.f51846b = new ThreadLocal();
        if (eVar.getContext().get(h.c.g.f48059a) instanceof ab) {
            return;
        }
        Object objB = kotlinx.coroutines.e.ap.b(jVar, null);
        kotlinx.coroutines.e.ap.c(jVar, objB);
        j(jVar, objB);
    }

    private final void V() {
        if (this.threadLocalIsSet) {
            ThreadLocal threadLocal = this.f51846b;
            h.k kVar = (h.k) threadLocal.get();
            if (kVar != null) {
                kotlinx.coroutines.e.ap.c((h.c.j) kVar.a(), kVar.b());
            }
            threadLocal.remove();
        }
    }

    public final boolean U() {
        boolean z = this.threadLocalIsSet && this.f51846b.get() == null;
        this.f51846b.remove();
        return !z;
    }

    @Override // kotlinx.coroutines.e.ah, kotlinx.coroutines.a
    protected final void bQ(Object obj) {
        V();
        h.c.e eVar = this.f51865c;
        Object objI = h.f.s.i(obj, eVar);
        h.c.j context = eVar.getContext();
        Object objB = kotlinx.coroutines.e.ap.b(context, null);
        dj djVarC = objB != kotlinx.coroutines.e.ap.f51872a ? y.c(eVar, context, objB) : null;
        try {
            eVar.resumeWith(objI);
            if (djVarC == null || djVarC.U()) {
                kotlinx.coroutines.e.ap.c(context, objB);
            }
        } catch (Throwable th) {
            if (djVarC == null || djVarC.U()) {
                kotlinx.coroutines.e.ap.c(context, objB);
            }
            throw th;
        }
    }

    @Override // kotlinx.coroutines.e.ah
    public final void bT() {
        V();
    }

    public final void j(h.c.j jVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f51846b.set(new h.k(jVar, obj));
    }
}
