package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class advo extends adqs {
    final advn a;
    final admr b;
    final /* synthetic */ advv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public advo(advv advvVar, advn advnVar, admr admrVar) {
        super(null, null);
        this.c = advvVar;
        this.a = advnVar;
        admrVar.getClass();
        this.b = admrVar;
    }

    public final void g(adnq adnqVar) {
        Logger logger = advv.a;
        Level level = Level.WARNING;
        advv advvVar = this.c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{advvVar.g, adnqVar});
        advs advsVar = advvVar.H;
        if (advsVar.a.get() == advv.e) {
            advv advvVar2 = advsVar.c;
            adwg adwgVar = advvVar2.J;
            if (adwgVar != null) {
                advsVar.b(adwgVar.a());
                advvVar2.I = adwgVar;
                advvVar2.F.a(4, "Initial Name Resolution error, using default service config");
            } else {
                advsVar.b(null);
            }
        }
        if (advvVar.S != 3) {
            advvVar.F.b(3, "Failed to resolve name: {0}", adnqVar);
            advvVar.S = 3;
        }
        advn advnVar = this.a;
        if (advnVar != advvVar.s) {
            return;
        }
        advnVar.a.b(adnqVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.adqs
    public final adnq u(admp admpVar) {
        adwg adwgVar;
        Object obj;
        advv advvVar = this.c;
        adnw adnwVar = advvVar.m;
        adnwVar.c();
        if (advvVar.q != this.b) {
            return adnq.b;
        }
        adns adnsVar = admpVar.a;
        if (!adnsVar.d()) {
            g(adnsVar.a());
            return adnsVar.a();
        }
        Object objC = adnsVar.c();
        adiy adiyVar = advvVar.F;
        adis adisVar = admpVar.b;
        adiyVar.b(1, "Resolved address: {0}, config={1}", objC, adisVar);
        if (advvVar.S != 2) {
            adiyVar.b(2, "Address resolved: {0}", objC);
            advvVar.S = 2;
        }
        admn admnVar = admpVar.c;
        adkk adkkVar = (adkk) adisVar.a(adkk.a);
        adwg adwgVar2 = (admnVar == null || (obj = admnVar.b) == null) ? null : (adwg) obj;
        adnq adnqVar = admnVar != null ? admnVar.a : null;
        if (advvVar.L) {
            if (adwgVar2 == null) {
                adwgVar2 = advvVar.J;
                if (adwgVar2 != null) {
                    advvVar.H.b(adwgVar2.a());
                    adiyVar.a(2, "Received no service config, using default service config");
                } else if (adnqVar == null) {
                    advs advsVar = advvVar.H;
                    adwgVar2 = advv.d;
                    advsVar.b(null);
                } else {
                    if (!advvVar.K) {
                        adiyVar.a(2, "Fallback to error due to invalid first service config without default config");
                        adnq adnqVar2 = admnVar.a;
                        woy.O(!adnqVar2.g(), "the error status must not be OK");
                        adnwVar.execute(new adsy(this, adnqVar2, 16));
                        return adnqVar2;
                    }
                    adwgVar2 = advvVar.I;
                }
            } else if (adkkVar != null) {
                advvVar.H.b(adkkVar);
                if (adwgVar2.a() != null) {
                    adiyVar.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                }
            } else {
                advvVar.H.b(adwgVar2.a());
            }
            if (!adwgVar2.equals(advvVar.I)) {
                adiyVar.b(2, "Service config changed{0}", adwgVar2 == advv.d ? " to empty" : "");
                advvVar.I = adwgVar2;
                advvVar.Q.a = adwgVar2.a;
            }
            try {
                advvVar.K = true;
            } catch (RuntimeException e) {
                adkn adknVar = this.c.g;
                advv.a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + String.valueOf(adknVar) + "] Unexpected exception from parsing service config", (Throwable) e);
            }
            adwgVar = adwgVar2;
        } else {
            if (adwgVar2 != null) {
                adiyVar.a(2, "Service config from name resolver discarded by channel settings");
            }
            adwgVar = advvVar.J;
            if (adwgVar == null) {
                adwgVar = advv.d;
            }
            if (adkkVar != null) {
                adiyVar.a(2, "Config selector from name resolver discarded by channel settings");
            }
            advvVar.H.b(adwgVar.a());
        }
        adis adisVar2 = admpVar.b;
        advn advnVar = this.a;
        if (advnVar != this.c.s) {
            return adnq.b;
        }
        adqn adqnVar = new adqn(adisVar2);
        adir adirVar = adkk.a;
        Object obj2 = adqnVar.a;
        if (obj2 == null) {
            ((IdentityHashMap) adqnVar.b).remove(adirVar);
        } else if (((adis) obj2).b.containsKey(adirVar)) {
            adqnVar.b(0).remove(adirVar);
        }
        Map map = adwgVar.c;
        if (map != null) {
            adqnVar.c(adli.a, map);
            adqnVar.a();
        }
        return advnVar.a.a(new adle(adnsVar.c(), adqnVar.a(), adwgVar.b));
    }
}
