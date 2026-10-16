package Ef;

import java.util.concurrent.ScheduledFuture;

/* renamed from: Ef.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0494j implements InterfaceC0496k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3742a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3743b;

    public /* synthetic */ C0494j(Object obj, int i5) {
        this.f3742a = i5;
        this.f3743b = obj;
    }

    @Override // Ef.InterfaceC0496k
    public final void a(Throwable th) {
        switch (this.f3742a) {
            case 0:
                ((ScheduledFuture) this.f3743b).cancel(false);
                break;
            case 1:
                ((tf.l) this.f3743b).invoke(th);
                break;
            default:
                ((U) this.f3743b).dispose();
                break;
        }
    }

    public final String toString() {
        switch (this.f3742a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f3743b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((tf.l) this.f3743b).getClass().getSimpleName() + '@' + H.t(this) + ']';
            default:
                return "DisposeOnCancel[" + ((U) this.f3743b) + ']';
        }
    }
}
