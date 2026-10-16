package p8;

/* loaded from: classes4.dex */
public final class e extends ic.d {
    @Override // ic.d
    public final void I(l lVar, l lVar2) {
        lVar.f43290b = lVar2;
    }

    @Override // ic.d
    public final void J(l lVar, Thread thread) {
        lVar.f43289a = thread;
    }

    @Override // ic.d
    public final boolean h(m mVar, c cVar, c cVar2) {
        synchronized (mVar) {
            try {
                if (mVar.f43296b != cVar) {
                    return false;
                }
                mVar.f43296b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ic.d
    public final boolean i(m mVar, Object obj, Object obj2) {
        synchronized (mVar) {
            try {
                if (mVar.f43295a != obj) {
                    return false;
                }
                mVar.f43295a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ic.d
    public final boolean j(m mVar, l lVar, l lVar2) {
        synchronized (mVar) {
            try {
                if (mVar.f43297c != lVar) {
                    return false;
                }
                mVar.f43297c = lVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ic.d
    public final c v(m mVar) {
        c cVar;
        c cVar2 = c.f43273d;
        synchronized (mVar) {
            cVar = mVar.f43296b;
            if (cVar != cVar2) {
                mVar.f43296b = cVar2;
            }
        }
        return cVar;
    }

    @Override // ic.d
    public final l w(m mVar) {
        l lVar;
        l lVar2 = l.f43288c;
        synchronized (mVar) {
            lVar = mVar.f43297c;
            if (lVar != lVar2) {
                mVar.f43297c = lVar2;
            }
        }
        return lVar;
    }
}
