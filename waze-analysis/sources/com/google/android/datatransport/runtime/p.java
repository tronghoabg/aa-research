package com.google.android.datatransport.runtime;

import androidx.compose.material3.internal.CalendarModelKt;
import androidx.work.WorkRequest;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.waze.navigate.di;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class p implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f4226a;

    public p(int i2) {
        this.f4226a = i2;
    }

    public static final com.google.android.datatransport.runtime.scheduling.jobscheduling.f a() {
        com.google.android.datatransport.runtime.c.a aVarC = c();
        com.google.android.datatransport.runtime.scheduling.jobscheduling.b bVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.b();
        com.google.android.datatransport.c cVar = com.google.android.datatransport.c.f3905a;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarA = com.google.android.datatransport.runtime.scheduling.jobscheduling.d.a();
        cVarA.b(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        cVarA.d();
        bVar.b(cVar, cVarA.a());
        com.google.android.datatransport.c cVar2 = com.google.android.datatransport.c.f3907c;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarA2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.d.a();
        cVarA2.b(1000L);
        cVarA2.d();
        bVar.b(cVar2, cVarA2.a());
        com.google.android.datatransport.c cVar3 = com.google.android.datatransport.c.f3906b;
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVarA3 = com.google.android.datatransport.runtime.scheduling.jobscheduling.d.a();
        cVarA3.b(CalendarModelKt.MillisecondsIn24Hours);
        cVarA3.d();
        cVarA3.c(DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.runtime.scheduling.jobscheduling.e.f4318b))));
        bVar.b(cVar3, cVarA3.a());
        bVar.c(aVarC);
        return bVar.a();
    }

    public static String b() {
        return "com.google.android.datatransport.events";
    }

    public static com.google.android.datatransport.runtime.c.a c() {
        return new com.google.android.datatransport.runtime.c.b(0);
    }

    public static com.google.android.datatransport.runtime.c.a d() {
        return new com.google.android.datatransport.runtime.c.b(1);
    }

    public static final com.google.firebase.perf.config.a e() {
        com.google.firebase.perf.config.a aVarO = com.google.firebase.perf.config.a.o();
        com.waze.web.r.g(aVarO);
        return aVarO;
    }

    public static final RemoteConfigManager f() {
        RemoteConfigManager remoteConfigManager = RemoteConfigManager.getInstance();
        com.waze.web.r.g(remoteConfigManager);
        return remoteConfigManager;
    }

    public static final SessionManager g() {
        SessionManager sessionManager = SessionManager.getInstance();
        com.waze.web.r.g(sessionManager);
        return sessionManager;
    }

    public static p h() {
        return new p(1, null);
    }

    public static p i() {
        return new p(6, null);
    }

    public static p j() {
        return new p(7, null);
    }

    public static p k() {
        return new p(8, null);
    }

    @Override // g.a.a, f.a.a
    public final /* synthetic */ Object get() {
        switch (this.f4226a) {
            case 0:
                return new t(Executors.newSingleThreadExecutor());
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return d();
            case 5:
                return new di("IntegrityService");
            case 6:
                return e();
            case 7:
                return f();
            default:
                return g();
        }
    }

    private p(int i2, byte[] bArr) {
        this.f4226a = i2;
    }
}
