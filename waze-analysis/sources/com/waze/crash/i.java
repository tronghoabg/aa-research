package com.waze.crash;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import h.g.b.x;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i implements com.waze.shared_infra.i.b {

    /* renamed from: a, reason: collision with root package name */
    private final FirebaseCrashlytics f23232a;

    /* renamed from: b, reason: collision with root package name */
    private final d f23233b;

    /* renamed from: c, reason: collision with root package name */
    private final String f23234c;

    public i(FirebaseCrashlytics firebaseCrashlytics, d dVar) {
        x.f(firebaseCrashlytics, "firebaseCrashlytics");
        x.f(dVar, "crashManagerConfig");
        this.f23232a = firebaseCrashlytics;
        this.f23233b = dVar;
        this.f23234c = "LOG_TAG";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0012, B:8:0x0019, B:10:0x0020), top: B:16:0x0012 }] */
    @Override // com.waze.shared_infra.i.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Throwable r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "throwable"
            h.g.b.x.f(r3, r0)
            com.waze.crash.d r0 = r2.f23233b
            boolean r0 = r0.f()
            if (r0 != 0) goto Lf
            return
        Lf:
            monitor-enter(r2)
            if (r4 == 0) goto L19
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r2.f23232a     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r2.f23234c     // Catch: java.lang.Throwable -> L29
            r0.setCustomKey(r1, r4)     // Catch: java.lang.Throwable -> L29
        L19:
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = r2.f23232a     // Catch: java.lang.Throwable -> L29
            r0.recordException(r3)     // Catch: java.lang.Throwable -> L29
            if (r4 == 0) goto L27
            java.lang.String r3 = r2.f23234c     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = ""
            r0.setCustomKey(r3, r4)     // Catch: java.lang.Throwable -> L29
        L27:
            monitor-exit(r2)
            return
        L29:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.crash.i.a(java.lang.Throwable, java.lang.String):void");
    }

    @Override // com.waze.shared_infra.i.b
    public final void b(com.waze.shared_infra.i.k kVar) {
        x.f(kVar, "performanceTraces");
        if (this.f23233b.f()) {
            synchronized (this) {
                for (com.waze.shared_infra.i.j jVar : kVar.b()) {
                    Instant instantA = jVar.a();
                    this.f23232a.log("Trace: " + jVar.c() + ", start time: " + jVar.b().getNano() + "ns" + (instantA != null ? ", end time: " + instantA.getNano() + ", time diff: " + ((instantA.getNano() - jVar.b().getNano()) / 1000.0d) + "us" : ""));
                }
                com.waze.shared_infra.i.j jVar2 = (com.waze.shared_infra.i.j) h.a.i.U(kVar.b());
                this.f23232a.log("Performance Traces: time now = " + kVar.a().getNano() + "ns" + (jVar2 != null ? ", time diff since last event start: " + jVar2.b().until(kVar.a(), ChronoUnit.MICROS) + "us" : ""));
            }
        }
    }
}
