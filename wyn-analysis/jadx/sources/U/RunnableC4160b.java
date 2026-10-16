package u;

import android.os.Bundle;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC4160b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f46049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f46050c;

    public /* synthetic */ RunnableC4160b(f fVar, Bundle bundle, int i5) {
        this.f46048a = i5;
        this.f46050c = fVar;
        this.f46049b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f46048a) {
            case 0:
                this.f46050c.f46068b.onUnminimized(this.f46049b);
                break;
            case 1:
                this.f46050c.f46068b.onMessageChannelReady(this.f46049b);
                break;
            case 2:
                this.f46050c.f46068b.onWarmupCompleted(this.f46049b);
                break;
            default:
                this.f46050c.f46068b.onMinimized(this.f46049b);
                break;
        }
    }
}
