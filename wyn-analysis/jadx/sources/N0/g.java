package N0;

/* loaded from: classes.dex */
public final class g extends android.support.v4.media.session.b {
    @Override // android.support.v4.media.session.b
    public final boolean K(i iVar, e eVar, e eVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f8014b != eVar) {
                    return false;
                }
                iVar.f8014b = eVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean L(i iVar, Object obj, Object obj2) {
        synchronized (iVar) {
            try {
                if (iVar.f8013a != obj) {
                    return false;
                }
                iVar.f8013a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final boolean M(i iVar, h hVar, h hVar2) {
        synchronized (iVar) {
            try {
                if (iVar.f8015c != hVar) {
                    return false;
                }
                iVar.f8015c = hVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.support.v4.media.session.b
    public final void n0(h hVar, h hVar2) {
        hVar.f8008b = hVar2;
    }

    @Override // android.support.v4.media.session.b
    public final void o0(h hVar, Thread thread) {
        hVar.f8007a = thread;
    }
}
