package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xsh extends cxt<xsg> {
    public static final String a = "xsh";
    private final xqq b;
    private final xqp c;
    private final Map d;
    private final afeg f;
    private final Executor g;
    private final xqq h;
    private final afdr i;
    private final Long j = null;
    private final boolean k = false;

    public xsh(xqq xqqVar, xqp xqpVar, Map map, afeg afegVar, Executor executor, xqq xqqVar2, afdr afdrVar) {
        this.b = xqqVar;
        this.c = xqpVar;
        this.d = map;
        this.f = afegVar;
        this.g = executor;
        this.h = xqqVar2;
        this.i = afdrVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        xqq xqqVar = this.b;
        return new xsg(xqqVar, this.c, wpq.M(xqqVar, this.d), this.f, this.i, this.h);
    }

    @Override // defpackage.cxt
    public final /* synthetic */ void e(cfx cfxVar) {
        xsg xsgVar = (xsg) cfxVar;
        xqp xqpVar = xsgVar.a;
        xqp xqpVar2 = this.c;
        if (xqpVar2 != xqpVar) {
            xsgVar.g(xqpVar2);
            xsgVar.a = xqpVar2;
        }
        xqq xqqVar = this.h;
        boolean zF = affa.f(xqqVar, xsgVar.c);
        List listAi = xqqVar != null ? wpq.ai(xqqVar) : null;
        xqq xqqVar2 = xsgVar.c;
        boolean zF2 = affa.f(listAi, xqqVar2 != null ? wpq.ai(xqqVar2) : null);
        if (zF) {
            return;
        }
        xsgVar.c = xqqVar;
        if (!zF2) {
            xsgVar.n = afbf.a;
            xsgVar.g = new xsl(xsgVar.d());
            xsgVar.h = new cjt(xsgVar.g);
            int i = xqs.a;
            xsgVar.i = null;
            aivh aivhVar = xsgVar.f;
            if (aivhVar != null) {
                aivhVar.s(null);
            }
        }
        int i2 = xqs.a;
        xsgVar.i = null;
        xsgVar.j = xsgVar.d().a();
        if (xqqVar != null) {
            xsgVar.b = wpq.M(xqqVar, this.d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsh)) {
            return false;
        }
        xsh xshVar = (xsh) obj;
        if (!affa.f(this.b, xshVar.b) || this.c != xshVar.c || !affa.f(this.d, xshVar.d) || !affa.f(this.f, xshVar.f) || !affa.f(this.g, xshVar.g) || !affa.f(this.h, xshVar.h) || !affa.f(this.i, xshVar.i)) {
            return false;
        }
        Long l = xshVar.j;
        if (!affa.f(null, null)) {
            return false;
        }
        boolean z = xshVar.k;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
        Executor executor = this.g;
        int iHashCode2 = ((iHashCode * 31) + (executor == null ? 0 : executor.hashCode())) * 31;
        xqq xqqVar = this.h;
        return ((((iHashCode2 + (xqqVar != null ? xqqVar.hashCode() : 0)) * 31) + this.i.hashCode()) * 961) + 1237;
    }

    public final String toString() {
        return "EnergyShaderNodeElement(initialConfig=" + this.b + ", state=" + this.c + ", stateMap=" + this.d + ", onStateAnimationFinished=" + this.f + ", mainExecutor=" + this.g + ", debugConfig=" + this.h + ", timeSupplierMs=" + this.i + ", timeOffsetMs=null, updateImmediately=false)";
    }
}
