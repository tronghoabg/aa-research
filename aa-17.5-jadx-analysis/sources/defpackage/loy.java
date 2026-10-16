package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaSessionManager;
import j$.util.Collection;
import j$.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class loy implements lhg {
    public static final yph a = yph.c("GH.MediaServiceConnLDP");
    public final Context b;
    final Map c;
    public final Map d;
    final Map e;
    public final Map f;
    public final tcs g;
    private final eqj h;

    public loy(Context context) {
        Object systemService = context.getSystemService("media_session");
        systemService.getClass();
        eqj eqjVarA = lno.a(context, (MediaSessionManager) systemService);
        this.b = context;
        this.c = new HashMap();
        this.d = new HashMap();
        this.g = new tcs(new LinkedHashMap(), null);
        this.e = new HashMap();
        this.f = new HashMap();
        this.h = eqjVarA;
    }

    public static loy j() {
        return (loy) mki.a.i(loy.class);
    }

    private final eqj k(ComponentName componentName) {
        return tby.v(eqy.a(kiu.a()), new jzi(this, componentName, 19, null));
    }

    public final eqj a(loz lozVar) {
        ((ype) ((ype) a.f()).ai((char) 4108)).y("fetchActiveControllerConnection: session=%s", lozVar);
        return eqy.c(this.h, new jzi(this, lozVar, 18));
    }

    public final eqj b(ComponentName componentName) {
        return this.g.containsKey(componentName) ? new eqm(null) : eqy.c(k(componentName), new lmv(7));
    }

    @Override // defpackage.lhg
    public final void c() {
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.g.clear();
        this.f.clear();
        ((ype) a.l().ai((char) 4129)).u("Cleared cached connections from the last AAP session.");
    }

    public final eqj e(loz lozVar) {
        ((ype) ((ype) a.f()).ai((char) 4109)).y("fetchControllerConnection: session=%s", lozVar);
        return eqy.c(a(lozVar), new jzi(this, lozVar, 16));
    }

    public final eqj f(ComponentName componentName) {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4111)).y("fetchSupportedAppControllerConnection: component=%s", componentName);
        Map map = this.e;
        if (map.containsKey(componentName)) {
            return (eqj) map.get(componentName);
        }
        ((ype) yphVar.l().ai((char) 4112)).u("Checking for external media app");
        qrn qrnVar = (qrn) kiu.a().e();
        if (qrnVar != null) {
            boolean zAnyMatch = Collection.EL.stream(jxg.a().b(qrnVar, nyj.b())).anyMatch(new koh(componentName, 20));
            ((ype) yphVar.l().ai((char) 4114)).y("isExternalMediaApp: %s", Boolean.valueOf(zAnyMatch));
            if (zAnyMatch) {
                ((ype) yphVar.l().ai((char) 4115)).u("Returning active controller for external media app");
                ((ype) yphVar.l().ai((char) 4116)).u("Fetching data from Observable store");
                tcs tcsVar = this.g;
                eqj eqjVarD = tby.d(eqy.a(tcsVar.b), this.h, new guk(this, componentName, 16, null));
                map.put(componentName, eqjVarD);
                return eqjVarD;
            }
        }
        ((ype) yphVar.l().ai((char) 4113)).u("Falling back to MBS based controller");
        return eqy.c(k(componentName), new lmv(6));
    }

    public final ljx g(ComponentName componentName) throws Throwable {
        boolean zE = lmi.a().e();
        Map map = this.c;
        if (!zE) {
            return (ljx) Map.EL.computeIfAbsent(map, componentName, new gjm(this, 18));
        }
        ljx ljxVar = (ljx) map.get(componentName);
        if (ljxVar != null) {
            return ljxVar;
        }
        ljx ljxVarA = new lop(this.b, componentName).a();
        if (!ljxVarA.k) {
            ((ype) ((ype) a.f()).ai((char) 4110)).y("Caching package info for %s", componentName);
            map.put(componentName, ljxVarA);
        }
        return ljxVarA;
    }

    public final lox h(ComponentName componentName) throws Throwable {
        ljx ljxVarG = g(componentName);
        lnl lnlVar = new lnl(this.b, componentName);
        return new lox(eqy.a(tby.v(lnlVar, new llf(ljxVarG, 12))), eqy.a(tby.v(lnlVar, new llf(ljxVarG, 13))));
    }

    public final lox i(ComponentName componentName) {
        return !kmo.b(acsx.j(), componentName) ? h(componentName) : (lox) Map.EL.computeIfAbsent(this.d, componentName, new gjm(this, 17));
    }

    @Override // defpackage.lhg
    public final void d() {
    }
}
