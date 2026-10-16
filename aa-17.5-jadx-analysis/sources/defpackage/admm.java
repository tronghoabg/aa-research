package defpackage;

import java.util.IdentityHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class admm {
    public final int a;
    public final adnd b;
    public final adnw c;
    public final admq d;
    public final ScheduledExecutorService e;
    public final Executor f;
    private final adiy g;
    private final admh h;
    private final admt i;
    private final IdentityHashMap j;

    public admm(admk admkVar) {
        Integer num = admkVar.a;
        num.getClass();
        num.intValue();
        this.a = 443;
        adnd adndVar = admkVar.b;
        adndVar.getClass();
        this.b = adndVar;
        adnw adnwVar = admkVar.c;
        adnwVar.getClass();
        this.c = adnwVar;
        admq admqVar = admkVar.d;
        admqVar.getClass();
        this.d = admqVar;
        this.e = admkVar.e;
        this.g = admkVar.f;
        this.f = admkVar.g;
        admh admhVar = admkVar.h;
        this.h = admhVar == null ? new admj() : admhVar;
        this.i = admkVar.i;
        IdentityHashMap identityHashMap = admkVar.j;
        this.j = identityHashMap != null ? new IdentityHashMap(identityHashMap) : null;
    }

    public final Object a(adml admlVar) {
        IdentityHashMap identityHashMap = this.j;
        if (identityHashMap != null) {
            return identityHashMap.get(admlVar);
        }
        return null;
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.f("defaultPort", this.a);
        xxgVarAo.b("proxyDetector", this.b);
        xxgVarAo.b("syncContext", this.c);
        xxgVarAo.b("serviceConfigParser", this.d);
        xxgVarAo.b("customArgs", this.j);
        xxgVarAo.b("scheduledExecutorService", this.e);
        xxgVarAo.b("channelLogger", this.g);
        xxgVarAo.b("executor", this.f);
        xxgVarAo.b("overrideAuthority", null);
        xxgVarAo.b("metricRecorder", this.h);
        xxgVarAo.b("nameResolverRegistry", this.i);
        return xxgVarAo.toString();
    }
}
