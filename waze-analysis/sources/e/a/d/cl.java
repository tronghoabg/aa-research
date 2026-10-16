package e.a.d;

import j$.util.Objects;
import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cl implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ co f46745a;

    /* renamed from: b, reason: collision with root package name */
    private final e.a.dt f46746b;

    cl(co coVar, e.a.dt dtVar) {
        Objects.requireNonNull(coVar);
        this.f46745a = coVar;
        com.google.d.b.an.C(dtVar, "savedListener");
        this.f46746b = dtVar;
    }

    public static /* synthetic */ void b(cl clVar, IOException iOException) {
        co coVar = clVar.f46745a;
        e.a.da daVarC = e.a.db.c();
        daVarC.b(e.a.eg.b(e.a.ee.f47411k.g("Unable to resolve host ".concat(String.valueOf(coVar.r))).f(iOException)));
        clVar.f46746b.c(daVarC.a());
    }

    @Override // java.lang.Runnable
    public final void run() {
        e.a.db dbVarH;
        if (co.f46750h.isLoggable(Level.FINER)) {
            co.f46750h.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Attempting DNS resolution of ".concat(String.valueOf(this.f46745a.r)));
        }
        final e.a.db dbVar = null;
        try {
            try {
                co coVar = this.f46745a;
                e.a.ai aiVarG = co.g(coVar);
                if (aiVarG != null) {
                    if (co.f46750h.isLoggable(Level.FINER)) {
                        co.f46750h.logp(Level.FINER, "io.grpc.internal.DnsNameResolver$Resolve", "run", "Using proxy address " + aiVarG.toString());
                    }
                    e.a.da daVarC = e.a.db.c();
                    daVarC.b(e.a.eg.c(Collections.singletonList(aiVarG)));
                    dbVarH = daVarC.a();
                } else {
                    dbVarH = coVar.h();
                }
                dbVar = dbVarH;
                coVar.v.execute(new Runnable() { // from class: e.a.d.ci
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f46739a.f46746b.c(dbVar);
                    }
                });
            } catch (IOException e2) {
                this.f46745a.v.execute(new Runnable() { // from class: e.a.d.cj
                    @Override // java.lang.Runnable
                    public final void run() {
                        cl.b(this.f46741a, e2);
                    }
                });
                if (dbVar == null || !dbVar.d().e()) {
                }
            }
            if (!dbVar.d().e()) {
                z = false;
            }
            this.f46745a.v.execute(new ck(this, z));
        } catch (Throwable th) {
            this.f46745a.v.execute(new ck(this, dbVar != null && dbVar.d().e()));
            throw th;
        }
    }
}
