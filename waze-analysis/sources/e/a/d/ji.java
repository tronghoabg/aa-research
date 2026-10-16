package e.a.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ji extends jg {
    @Override // e.a.d.jg
    public final boolean a(jj jjVar) {
        synchronized (jjVar) {
            if (jjVar.f47230e != 0) {
                return false;
            }
            jjVar.f47230e = -1;
            return true;
        }
    }

    @Override // e.a.d.jg
    public final void b(jj jjVar) {
        synchronized (jjVar) {
            jjVar.f47230e = 0;
        }
    }
}
