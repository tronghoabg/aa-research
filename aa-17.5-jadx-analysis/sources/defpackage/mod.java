package defpackage;

import android.content.ComponentName;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes.dex */
public final class mod implements lhg {
    public static final /* synthetic */ int b = 0;
    public final eqm a = new eqm();
    private boolean c;

    static {
        yph.c("GH.GhSugDataManager");
    }

    public static mod a() {
        return (mod) mki.a.b(mod.class, new may(9));
    }

    public final synchronized void b(List list, ComponentName componentName) {
        Stream map = Collection.EL.stream(list).map(new mix(componentName, 2));
        int i = yfq.d;
        this.a.j((List) map.collect(ycm.a));
    }

    @Override // defpackage.lhg
    public final void c() {
        synchronized (this) {
            woy.aa(!this.c, "start() was called when the instance was already started");
            this.c = true;
        }
    }

    @Override // defpackage.lhg
    public final void d() {
        synchronized (this) {
            int i = yfq.d;
            this.a.j(yls.a);
            this.c = false;
        }
    }
}
