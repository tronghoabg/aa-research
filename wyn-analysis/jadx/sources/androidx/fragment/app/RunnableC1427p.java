package androidx.fragment.app;

/* renamed from: androidx.fragment.app.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1427p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18520b;

    public /* synthetic */ RunnableC1427p(Object obj, int i5) {
        this.f18519a = i5;
        this.f18520b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18519a) {
            case 0:
                DialogInterfaceOnCancelListenerC1430t dialogInterfaceOnCancelListenerC1430t = (DialogInterfaceOnCancelListenerC1430t) this.f18520b;
                dialogInterfaceOnCancelListenerC1430t.f18536b.onDismiss(dialogInterfaceOnCancelListenerC1430t.f18544j);
                break;
            case 1:
                C1426o c1426o = (C1426o) this.f18520b;
                if (!c1426o.f18513b.isEmpty()) {
                    c1426o.e();
                    break;
                }
                break;
            default:
                ((e0) this.f18520b).z(true);
                break;
        }
    }
}
