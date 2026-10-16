package e.a.d;

import j$.util.Objects;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fd extends e.a.dt {

    /* renamed from: a, reason: collision with root package name */
    final fb f46919a;

    /* renamed from: b, reason: collision with root package name */
    final e.a.dd f46920b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fp f46921c;

    fd(fp fpVar, fb fbVar, e.a.dd ddVar) {
        Objects.requireNonNull(fpVar);
        this.f46921c = fpVar;
        this.f46919a = fbVar;
        com.google.d.b.an.C(ddVar, "resolver");
        this.f46920b = ddVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(e.a.ee eeVar) {
        Logger logger = fp.f46944a;
        Level level = Level.WARNING;
        fp fpVar = this.f46921c;
        logger.logp(level, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "handleErrorInSyncContext", "[{0}] Failed to resolve name. status={1}", new Object[]{fpVar.c(), eeVar});
        fpVar.V.f();
        if (fpVar.ah != 3) {
            fpVar.T.b(3, "Failed to resolve name: {0}", eeVar);
            fpVar.ah = 3;
        }
        fb fbVar = this.f46919a;
        if (fbVar != fpVar.F) {
            return;
        }
        fbVar.f46915a.b(eeVar);
    }

    @Override // e.a.dt
    public final e.a.ee c(e.a.db dbVar) {
        gc gcVar;
        fp fpVar = this.f46921c;
        e.a.el elVar = fpVar.f46951d;
        elVar.d();
        if (fpVar.D != this.f46920b) {
            return e.a.ee.f47401a;
        }
        e.a.eg egVarD = dbVar.d();
        if (!egVarD.e()) {
            t(egVarD.a());
            return egVarD.a();
        }
        List list = (List) egVarD.d();
        fpVar.T.b(1, "Resolved address: {0}, config={1}", list, dbVar.a());
        if (fpVar.ah != 2) {
            fpVar.T.b(2, "Address resolved: {0}", list);
            fpVar.ah = 2;
        }
        e.a.cy cyVarB = dbVar.b();
        e.a.aw awVar = (e.a.aw) dbVar.a().c(e.a.aw.f46295a);
        gc gcVar2 = (cyVarB == null || cyVarB.d() == null) ? null : (gc) cyVarB.d();
        e.a.ee eeVarC = cyVarB != null ? cyVarB.c() : null;
        if (fpVar.Z) {
            if (gcVar2 != null) {
                if (awVar != null) {
                    fpVar.V.g(awVar);
                    if (gcVar2.a() != null) {
                        fpVar.T.a(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                    }
                } else {
                    fpVar.V.g(gcVar2.a());
                }
            } else if (fpVar.X != null) {
                gcVar2 = fpVar.X;
                fpVar.V.g(gcVar2.a());
                fpVar.T.a(2, "Received no service config, using default service config");
            } else if (eeVarC == null) {
                gcVar2 = fp.f46947f;
                fpVar.V.g(null);
            } else {
                if (!fpVar.Y) {
                    fpVar.T.a(2, "Fallback to error due to invalid first service config without default config");
                    e.a.ee eeVarC2 = cyVarB.c();
                    com.google.d.b.an.m(!eeVarC2.l(), "the error status must not be OK");
                    elVar.execute(new fc(this, eeVarC2));
                    return cyVarB.c();
                }
                gcVar2 = fpVar.W;
            }
            if (!gcVar2.equals(fpVar.W)) {
                fpVar.T.b(2, "Service config changed{0}", gcVar2 == fp.f46947f ? " to empty" : "");
                fpVar.W = gcVar2;
                fpVar.ae.f46897a = gcVar2.c();
            }
            try {
                fpVar.Y = true;
            } catch (RuntimeException e2) {
                fp fpVar2 = this.f46921c;
                fp.f46944a.logp(Level.WARNING, "io.grpc.internal.ManagedChannelImpl$NameResolverListener", "onResult2", "[" + String.valueOf(fpVar2.c()) + "] Unexpected exception from parsing service config", (Throwable) e2);
            }
            gcVar = gcVar2;
        } else {
            if (gcVar2 != null) {
                fpVar.T.a(2, "Service config from name resolver discarded by channel settings");
            }
            gcVar = fpVar.X == null ? fp.f46947f : fpVar.X;
            if (awVar != null) {
                fpVar.T.a(2, "Config selector from name resolver discarded by channel settings");
            }
            fpVar.V.g(gcVar.a());
        }
        e.a.c cVarA = dbVar.a();
        fb fbVar = this.f46919a;
        if (fbVar != this.f46921c.F) {
            return e.a.ee.f47401a;
        }
        e.a.a aVarB = cVarA.b();
        aVarB.b(e.a.aw.f46295a);
        Map mapE = gcVar.e();
        if (mapE != null) {
            aVarB.c(e.a.bt.f46503a, mapE);
            aVarB.a();
        }
        e.a.c cVarA2 = aVarB.a();
        e.a.da daVarD = e.a.bp.d();
        daVarD.f((List) egVarD.d());
        daVarD.g(cVarA2);
        daVarD.h(gcVar.d());
        return fbVar.f46915a.a(daVarD.e());
    }
}
