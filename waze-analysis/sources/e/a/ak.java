package e.a;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class ak extends bz {
    protected ak() {
    }

    @Override // e.a.bz
    public bx a() {
        return b().a();
    }

    protected abstract bz b();

    @Override // e.a.bz
    public void c(Map map) {
        b().c(map);
    }

    @Override // e.a.bz
    public void d() {
        b().d();
    }

    @Override // e.a.bz
    public void e(TimeUnit timeUnit) {
        b().e(timeUnit);
    }

    @Override // e.a.bz
    public void f() {
        b().f();
    }

    @Override // e.a.bz
    public final void g(cw cwVar, Object obj) {
        b().g(cwVar, obj);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("delegate", b());
        return zVarH.toString();
    }
}
