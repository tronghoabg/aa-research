package com.google.firebase.perf;

import android.content.Context;
import com.google.firebase.j;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {
    public b(com.google.firebase.e eVar, j jVar, Executor executor) {
        Context contextA = eVar.a();
        com.google.firebase.perf.config.a.o().r(contextA);
        com.google.firebase.perf.a.c cVarA = com.google.firebase.perf.a.c.a();
        cVarA.d(contextA);
        cVarA.e(new e());
        if (jVar != null) {
            AppStartTrace appStartTraceB = AppStartTrace.b();
            appStartTraceB.k(contextA);
            executor.execute(new com.google.firebase.perf.metrics.b(appStartTraceB));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }

    public b() {
    }
}
