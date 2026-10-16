package Bb;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.executor.j;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1666b;

    public /* synthetic */ a(j jVar, int i5) {
        this.f1665a = i5;
        this.f1666b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1665a) {
            case 0:
                j.c(this.f1666b);
                break;
            case 1:
                j.a(this.f1666b);
                break;
            case 2:
                j.b(this.f1666b);
                break;
            default:
                AnalyticsClient.a(this.f1666b);
                break;
        }
    }
}
