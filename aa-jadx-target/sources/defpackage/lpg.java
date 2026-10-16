package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lpg implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MediaServiceConnLDP");
    public final android.content.Context b;
    final java.util.Map c;
    public final java.util.Map d;
    final java.util.Map e;
    final java.util.Map f;
    public final defpackage.tdo g;
    private final defpackage.eqp h;

    public lpg(android.content.Context context) {
        java.lang.Object systemService = context.getSystemService("media_session");
        systemService.getClass();
        defpackage.eqp eqpVarA = defpackage.lnv.a(context, (android.media.session.MediaSessionManager) systemService);
        this.b = context;
        this.c = new java.util.HashMap();
        this.d = new java.util.HashMap();
        this.g = new defpackage.tdo(new java.util.LinkedHashMap(), null);
        this.e = new java.util.HashMap();
        this.f = new java.util.HashMap();
        this.h = eqpVarA;
    }

    public static defpackage.lpg j() {
        return (defpackage.lpg) defpackage.mkp.a.i(defpackage.lpg.class);
    }

    private final defpackage.eqp k(android.content.ComponentName componentName) {
        return defpackage.tcu.v(defpackage.ebo.e(defpackage.kja.a()), new defpackage.lpc(this, componentName, 2));
    }

    public final defpackage.eqp a(lph lphVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4111)).y("fetchActiveControllerConnection: session=%s", lphVar);
        return defpackage.ebo.g(this.h, new defpackage.lpc(this, lphVar, 0));
    }

    public final defpackage.eqp b(android.content.ComponentName componentName) {
        return this.g.containsKey(componentName) ? new defpackage.eqs(null) : defpackage.ebo.g(k(componentName), new defpackage.lnc(7));
    }

    public final defpackage.eqp e(lph lphVar) {
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4112)).y("fetchControllerConnection: session=%s", lphVar);
        return defpackage.ebo.g(a(lphVar), new defpackage.jxq(this, lphVar, 20));
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.g.clear();
        this.f.clear();
        ((defpackage.yqj) a.l().ai((char) 4132)).u("Cleared cached connections from the last AAP session.");
    }

    public final defpackage.eqp f(android.content.ComponentName componentName) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4114)).y("fetchSupportedAppControllerConnection: component=%s", componentName);
        java.util.Map map = this.e;
        if (map.containsKey(componentName)) {
            return (defpackage.eqp) map.get(componentName);
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4115)).u("Checking for external media app");
        defpackage.qsh qshVar = (defpackage.qsh) defpackage.kja.a().e();
        if (qshVar != null) {
            boolean zAnyMatch = j$.util.Collection.-EL.stream(jxk.a().b(qshVar, defpackage.nze.b())).anyMatch(new defpackage.lpa(componentName, 1));
            ((defpackage.yqj) yqmVar.l().ai((char) 4117)).y("isExternalMediaApp: %s", java.lang.Boolean.valueOf(zAnyMatch));
            if (zAnyMatch) {
                ((defpackage.yqj) yqmVar.l().ai((char) 4118)).u("Returning active controller for external media app");
                ((defpackage.yqj) yqmVar.l().ai((char) 4119)).u("Fetching data from Observable store");
                defpackage.tdo tdoVar = this.g;
                defpackage.eqp eqpVarD = defpackage.tcu.d(defpackage.ebo.e(tdoVar.b), this.h, new guq(this, componentName, 16, (byte[]) null));
                map.put(componentName, eqpVarD);
                return eqpVarD;
            }
        }
        ((defpackage.yqj) yqmVar.l().ai((char) 4116)).u("Falling back to MBS based controller");
        return defpackage.ebo.g(k(componentName), new defpackage.lnc(6));
    }

    public final defpackage.lke g(android.content.ComponentName componentName) {
        boolean zE = defpackage.lmp.a().e();
        java.util.Map map = this.c;
        if (!zE) {
            return (defpackage.lke) j$.util.Map.-EL.computeIfAbsent(map, componentName, new defpackage.gjt(this, 19));
        }
        defpackage.lke lkeVar = (defpackage.lke) map.get(componentName);
        if (lkeVar != null) {
            return lkeVar;
        }
        defpackage.lke lkeVarA = new low(this.b, componentName).a();
        if (!lkeVarA.k) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4113)).y("Caching package info for %s", componentName);
            map.put(componentName, lkeVarA);
        }
        return lkeVarA;
    }

    public final lpf h(android.content.ComponentName componentName) {
        defpackage.lke lkeVarG = g(componentName);
        lns lnsVar = new lns(this.b, componentName);
        return new lpf(defpackage.ebo.e(defpackage.tcu.v(lnsVar, new defpackage.llr(lkeVarG, 8))), defpackage.ebo.e(defpackage.tcu.v(lnsVar, new defpackage.llr(lkeVarG, 9))));
    }

    public final lpf i(android.content.ComponentName componentName) {
        return !defpackage.kmv.b(defpackage.actz.j(), componentName) ? h(componentName) : (lpf) j$.util.Map.-EL.computeIfAbsent(this.d, componentName, new defpackage.gjt(this, 18));
    }

    @Override // defpackage.lhn
    public final void d() {
    }
}
