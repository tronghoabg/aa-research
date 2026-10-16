package A7;

import android.os.RemoteException;

/* renamed from: A7.l1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC0268l1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f947a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C0271m1 f948b;

    public /* synthetic */ RunnableC0268l1(int i5) {
        this.f947a = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f947a) {
            case 0:
                C0271m1 c0271m1 = this.f948b;
                F f10 = c0271m1.f954d;
                if (f10 == null) {
                    c0271m1.zzj().f605f.c("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        f10.Q(c0271m1.w0(false));
                        c0271m1.v0();
                        break;
                    } catch (RemoteException e7) {
                        c0271m1.zzj().f605f.d("Failed to send storage consent settings to the service", e7);
                        return;
                    }
                }
            default:
                C0271m1 c0271m12 = this.f948b;
                F f11 = c0271m12.f954d;
                if (f11 == null) {
                    c0271m12.zzj().f605f.c("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        f11.M(c0271m12.w0(false));
                        c0271m12.v0();
                        break;
                    } catch (RemoteException e10) {
                        c0271m12.zzj().f605f.d("Failed to send Dma consent settings to the service", e10);
                    }
                }
        }
    }
}
