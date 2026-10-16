package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class svt implements swa {
    public final Object a = new Object();
    public final Object b;
    private final Executor c;
    private final /* synthetic */ int d;

    public svt(Executor executor, Object obj, int i) {
        this.d = i;
        this.c = executor;
        this.b = obj;
    }

    @Override // defpackage.swa
    public final void a(svz svzVar) {
        int i = this.d;
        if (i == 0) {
            if (svzVar.g() || ((swe) svzVar).c) {
                return;
            }
            synchronized (this.a) {
            }
            this.c.execute(new jpx(this, svzVar, 17, (char[]) null));
            return;
        }
        if (i == 1) {
            synchronized (this.a) {
            }
            this.c.execute(new jpx(this, svzVar, 16, (char[]) null));
        } else if (svzVar.g()) {
            synchronized (this.a) {
            }
            this.c.execute(new jpx(this, svzVar, 18, (char[]) null));
        }
    }
}
