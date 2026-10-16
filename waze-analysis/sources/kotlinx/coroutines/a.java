package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class a extends cf implements br, h.c.e, af {

    /* renamed from: b, reason: collision with root package name */
    private final h.c.j f51270b;

    public a(h.c.j jVar, boolean z) {
        super(z);
        I((br) jVar.get(br.f51766a));
        this.f51270b = jVar.plus(this);
    }

    @Override // kotlinx.coroutines.cf
    protected final String bO() {
        return String.valueOf(getClass().getSimpleName()).concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.cf
    public String bP() {
        String strA;
        String str = null;
        if (ai.b()) {
            h.c.j jVar = this.f51270b;
            ad adVar = (ad) jVar.get(ad.f51338a);
            if (adVar != null) {
                ae aeVar = (ae) jVar.get(ae.f51340a);
                if (aeVar == null || (strA = aeVar.a()) == null) {
                    strA = "coroutine";
                }
                str = strA + "#" + adVar.a();
            }
        }
        if (str == null) {
            return aj.a(this);
        }
        return "\"" + str + "\":" + aj.a(this);
    }

    protected void bQ(Object obj) {
        k(obj);
    }

    public final void bS(ag agVar, Object obj, h.g.a.p pVar) {
        Object objInvoke;
        a aVar = this;
        ag agVar2 = ag.f51342a;
        int iOrdinal = agVar.ordinal();
        if (iOrdinal == 0) {
            kotlinx.coroutines.e.al.i(pVar, obj, aVar);
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                h.g.b.x.f(pVar, "<this>");
                h.g.b.x.f(aVar, "completion");
                h.c.a.h.d(h.c.a.h.c(pVar, obj, aVar)).resumeWith(h.ab.f48028a);
                return;
            }
            if (iOrdinal != 3) {
                throw new h.i();
            }
            h.d.b.d(aVar);
            try {
                h.c.j context = aVar.getContext();
                Object objB = kotlinx.coroutines.e.ap.b(context, null);
                try {
                    h.d.b.b(aVar);
                    if (pVar instanceof h.c.b.a.a) {
                        h.g.b.au.h(pVar, 2);
                        objInvoke = pVar.invoke(obj, aVar);
                    } else {
                        objInvoke = h.c.a.h.a(pVar, obj, aVar);
                    }
                    if (objInvoke != h.c.a.a.f48038a) {
                        aVar.resumeWith(objInvoke);
                    }
                } finally {
                    kotlinx.coroutines.e.ap.c(context, objB);
                }
            } catch (Throwable th) {
                th = th;
                if (th instanceof ar) {
                    th = ((ar) th).getCause();
                }
                aVar.resumeWith(e.b.c.a(th));
            }
        }
    }

    @Override // kotlinx.coroutines.cf
    public final void bU(Throwable th) {
        h.f.s.h(this.f51270b, th);
    }

    @Override // kotlinx.coroutines.cf
    protected final void bV(Object obj) {
        if (!(obj instanceof u)) {
            f(obj);
        } else {
            u uVar = (u) obj;
            bR(uVar.f52067a, uVar.b());
        }
    }

    @Override // h.c.e
    public final h.c.j getContext() {
        return this.f51270b;
    }

    @Override // kotlinx.coroutines.af
    public final h.c.j getCoroutineContext() {
        return this.f51270b;
    }

    @Override // h.c.e
    public final void resumeWith(Object obj) {
        Object objC = C(h.f.s.j(obj));
        if (objC == cg.f51801a) {
            return;
        }
        bQ(objC);
    }

    protected void f(Object obj) {
    }

    protected void bR(Throwable th, boolean z) {
    }
}
