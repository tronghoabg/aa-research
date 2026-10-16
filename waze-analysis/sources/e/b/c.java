package e.b;

import h.g.b.x;
import h.l;
import l.a.tm;
import l.a.wi;
import l.a.wk;
import l.a.zy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    c() {
    }

    public static final Object a(Throwable th) {
        x.f(th, "exception");
        return new l(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof l) {
            throw ((l) obj).f48162a;
        }
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c c(wi wiVar) {
        x.f(wiVar, "builder");
        return new com.waze.shared_infra.s.c(wiVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c d(tm tmVar) {
        x.f(tmVar, "builder");
        return new com.waze.shared_infra.s.c(tmVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b e(zy zyVar) {
        x.f(zyVar, "builder");
        return new com.waze.sharedui.d.a.b(zyVar);
    }

    public static final /* synthetic */ com.waze.sharedui.d.a.b f(wk wkVar) {
        x.f(wkVar, "builder");
        return new com.waze.sharedui.d.a.b(wkVar);
    }
}
