package com.google.android.datatransport.runtime.scheduling;

import android.support.v4.app.ad;
import com.google.android.datatransport.i;
import com.google.android.datatransport.runtime.ac;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.n;
import com.google.android.datatransport.runtime.scheduling.a.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.k;
import com.google.android.datatransport.runtime.x;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f4229a = Logger.getLogger(ac.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4230b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.backends.b f4231c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.a f4232d;

    /* renamed from: e, reason: collision with root package name */
    private final r f4233e;

    /* renamed from: f, reason: collision with root package name */
    private final r f4234f;

    public a(Executor executor, com.google.android.datatransport.runtime.backends.b bVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.a aVar, r rVar, r rVar2) {
        this.f4230b = executor;
        this.f4231c = bVar;
        this.f4232d = aVar;
        this.f4233e = rVar;
        this.f4234f = rVar2;
    }

    public static /* synthetic */ void a(a aVar, x xVar, i iVar, n nVar) {
        try {
            l lVarA = aVar.f4231c.a(xVar.e());
            int i2 = 1;
            if (lVarA != null) {
                aVar.f4234f.k(new k(aVar, xVar, lVarA.a(nVar), i2));
                iVar.a(null);
            } else {
                String str = String.format("Transport backend '%s' is not registered", xVar.e());
                f4229a.logp(Level.WARNING, "com.google.android.datatransport.runtime.scheduling.DefaultScheduler", "schedule", str);
                iVar.a(new IllegalArgumentException(str));
            }
        } catch (Exception e2) {
            f4229a.logp(Level.WARNING, "com.google.android.datatransport.runtime.scheduling.DefaultScheduler", "schedule", "Error scheduling event ".concat(String.valueOf(e2.getMessage())));
            iVar.a(e2);
        }
    }

    public static /* synthetic */ void c(a aVar, x xVar, n nVar) {
        aVar.f4233e.v(xVar, nVar);
        aVar.f4232d.a(xVar, 1);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.c
    public final void b(x xVar, n nVar, i iVar) {
        this.f4230b.execute(new ad(this, xVar, iVar, nVar, 1));
    }
}
