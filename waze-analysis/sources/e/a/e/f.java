package e.a.e;

import com.waze.sharedui.web.as;
import e.a.cm;
import e.a.cp;
import e.a.cq;
import h.g.b.x;
import java.util.Objects;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import l.a.mx;
import l.a.nf;
import l.a.no;
import l.a.nx;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f {
    public static final k a(e.a.i iVar, cq cqVar, Object obj, e.a.h hVar, cm cmVar) {
        x.f(iVar, "channel");
        x.f(cqVar, "method");
        x.f(hVar, "callOptions");
        x.f(cmVar, "headers");
        if (cqVar.b() == cp.f46546c) {
            return i(iVar, cqVar, hVar, cmVar, new as(obj));
        }
        Objects.toString(cqVar);
        throw new IllegalArgumentException("Expected a server streaming RPC method, but got ".concat(cqVar.toString()));
    }

    public static final Object b(e.a.i iVar, cq cqVar, Object obj, e.a.h hVar, cm cmVar, h.c.e eVar) {
        if (cqVar.b() != cp.f46544a) {
            Objects.toString(cqVar);
            throw new IllegalArgumentException("Expected a unary RPC method, but got ".concat(cqVar.toString()));
        }
        k kVarI = i(iVar, cqVar, hVar, cmVar, new as(obj));
        x.f(kVarI, "<this>");
        x.f("request", "expected");
        x.f(cqVar, "descriptor");
        return ai.l(ai.E(new h(kVarI, cqVar, null)), eVar);
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void d(int i2, String str) {
        if (i2 > 0) {
            return;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i2);
    }

    public static final /* synthetic */ e.a.f.a.e e(nf nfVar) {
        x.f(nfVar, "builder");
        return new e.a.f.a.e(nfVar);
    }

    public static final /* synthetic */ e.a.f.a.e f(mx mxVar) {
        x.f(mxVar, "builder");
        return new e.a.f.a.e(mxVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c g(nx nxVar) {
        x.f(nxVar, "builder");
        return new com.waze.shared_infra.coordinators.c(nxVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c h(no noVar) {
        x.f(noVar, "builder");
        return new com.waze.shared_infra.coordinators.c(noVar);
    }

    private static final k i(e.a.i iVar, cq cqVar, e.a.h hVar, cm cmVar, as asVar) {
        return ai.E(new e(hVar, iVar, cqVar, cmVar, asVar, null));
    }
}
