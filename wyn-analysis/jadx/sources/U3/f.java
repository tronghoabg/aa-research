package U3;

/* loaded from: classes.dex */
public final class f extends xg.g {
    @Override // xg.g
    public final void J(g gVar, g gVar2) {
        gVar.f12259b = gVar2;
    }

    @Override // xg.g
    public final void K(g gVar, Thread thread) {
        gVar.f12258a = thread;
    }

    @Override // xg.g
    public final boolean m(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f12265b != cVar) {
                    return false;
                }
                hVar.f12265b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xg.g
    public final boolean n(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f12264a != obj) {
                    return false;
                }
                hVar.f12264a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xg.g
    public final boolean o(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f12266c != gVar) {
                    return false;
                }
                hVar.f12266c = gVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
