package e.a.i;

import com.google.d.b.an;
import com.google.d.b.z;
import e.a.bi;
import e.a.bl;
import e.a.bq;
import e.a.br;
import e.a.el;
import e.a.w;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class a extends bl {
    @Override // e.a.bl
    public final bq b(bi biVar) {
        return g().b(biVar);
    }

    @Override // e.a.bl
    public final el c() {
        return g().c();
    }

    @Override // e.a.bl
    public final ScheduledExecutorService d() {
        return g().d();
    }

    @Override // e.a.bl
    public final void e() {
        g().e();
    }

    @Override // e.a.bl
    public void f(w wVar, br brVar) {
        throw null;
    }

    protected abstract bl g();

    public final String toString() {
        z zVarH = an.H(this);
        zVarH.d("delegate", g());
        return zVarH.toString();
    }
}
