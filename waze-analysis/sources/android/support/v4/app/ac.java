package android.support.v4.app;

import android.app.job.JobParameters;
import android.content.Context;
import android.os.Bundle;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f97a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f98b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f99c;

    public /* synthetic */ ac(Object obj, Object obj2, int i2) {
        this.f99c = i2;
        this.f97a = obj;
        this.f98b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.common.api.internal.at, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.d.m.a.bm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.google.d.m.a.bm, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f99c) {
            case 0:
                ((ar) this.f97a).m47x22bc4f96((Bundle) this.f98b);
                break;
            case 1:
                ((da) this.f97a).e((cz) this.f98b);
                break;
            case 2:
                ((ar) this.f97a).m35lambda$performActivityCreated$8$androidsupportv4appFragment((Bundle) this.f98b);
                break;
            case 3:
                ((ar) this.f97a).m53lambda$restoreViewState$0$androidsupportv4appFragment((Bundle) this.f98b);
                break;
            case 4:
                ((ar) this.f97a).m52lambda$performViewCreated$7$androidsupportv4appFragment((Bundle) this.f98b);
                break;
            case 5:
                ((ar) this.f97a).m37lambda$performCreate$3$androidsupportv4appFragment((Bundle) this.f98b);
                break;
            case 6:
                ((JobInfoSchedulerService) this.f97a).jobFinished((JobParameters) this.f98b, false);
                break;
            case 7:
                com.google.android.gms.common.api.internal.au.b((com.google.android.gms.common.api.internal.au) this.f97a, this.f98b);
                break;
            case 8:
                com.google.android.libraries.phenotype.client.stable.q.e((com.google.android.libraries.phenotype.client.stable.q) this.f98b, this.f97a);
                break;
            case 9:
                ((com.google.android.libraries.phenotype.client.stable.q) this.f98b).r(this.f97a);
                break;
            case 10:
                ((com.google.firebase.appcheck.a.d) this.f97a).f8848e.b((com.google.firebase.appcheck.b) this.f98b);
                break;
            case 11:
                com.google.firebase.appcheck.a.d.h((com.google.firebase.appcheck.a.d) this.f97a, (com.google.android.gms.o.w) this.f98b);
                break;
            case 12:
                com.google.firebase.messaging.t.c((com.google.firebase.messaging.t) this.f97a, (com.google.android.gms.o.w) this.f98b);
                break;
            case 13:
                com.google.firebase.perf.config.x.f((com.google.firebase.perf.config.x) this.f97a, (Context) this.f98b);
                break;
            case 14:
                ((AppStartTrace) this.f98b).f10489g.k(((com.google.firebase.perf.f.al) this.f97a).build(), com.google.firebase.perf.f.i.FOREGROUND_BACKGROUND);
                break;
            case 15:
                com.google.firebase.perf.session.gauges.a.b((com.google.firebase.perf.session.gauges.a) this.f98b, (com.google.firebase.perf.e.m) this.f97a);
                break;
            case 16:
                com.google.firebase.perf.session.gauges.a.a((com.google.firebase.perf.session.gauges.a) this.f98b, (com.google.firebase.perf.e.m) this.f97a);
                break;
            case 17:
                com.google.firebase.perf.session.gauges.d.b((com.google.firebase.perf.session.gauges.d) this.f98b, (com.google.firebase.perf.e.m) this.f97a);
                break;
            case 18:
                com.google.firebase.perf.session.gauges.d.a((com.google.firebase.perf.session.gauges.d) this.f98b, (com.google.firebase.perf.e.m) this.f97a);
                break;
            case 19:
                ((com.google.firebase.crashlytics.a.f) this.f98b).a((com.google.firebase.remoteconfig.a.a.f) this.f97a);
                break;
            default:
                ((com.google.firebase.crashlytics.a.f) this.f98b).a((com.google.firebase.remoteconfig.a.a.f) this.f97a);
                break;
        }
    }

    public /* synthetic */ ac(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f99c = i2;
        this.f98b = obj;
        this.f97a = obj2;
    }
}
