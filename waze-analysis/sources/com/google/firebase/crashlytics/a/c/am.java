package com.google.firebase.crashlytics.a.c;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class am extends b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9131a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ExecutorService f9132b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TimeUnit f9133c;

    am(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.f9131a = str;
        this.f9132b = executorService;
        this.f9133c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.a.c.b
    public final void a() {
        try {
            com.google.firebase.crashlytics.a.i iVarA = com.google.firebase.crashlytics.a.i.a();
            String str = this.f9131a;
            iVarA.b("Executing shutdown hook for " + str);
            ExecutorService executorService = this.f9132b;
            executorService.shutdown();
            if (executorService.awaitTermination(2L, this.f9133c)) {
                return;
            }
            com.google.firebase.crashlytics.a.i.a().b(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            com.google.firebase.crashlytics.a.i.a().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f9131a));
            this.f9132b.shutdownNow();
        }
    }
}
