package androidx.fragment.app;

/* renamed from: androidx.fragment.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1433w implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f18557b;

    public /* synthetic */ RunnableC1433w(F f10, int i5) {
        this.f18556a = i5;
        this.f18557b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18556a) {
            case 0:
                this.f18557b.startPostponedEnterTransition();
                break;
            default:
                this.f18557b.callStartTransitionListener(false);
                break;
        }
    }
}
