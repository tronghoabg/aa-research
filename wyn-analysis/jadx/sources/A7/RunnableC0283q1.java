package A7;

import android.os.RemoteException;

/* renamed from: A7.q1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0283q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N1 f1031b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0271m1 f1032c;

    public /* synthetic */ RunnableC0283q1(C0271m1 c0271m1, N1 n12, int i5) {
        this.f1030a = i5;
        this.f1031b = n12;
        this.f1032c = c0271m1;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f1030a) {
            case 0:
                N1 n12 = this.f1031b;
                C0271m1 c0271m1 = this.f1032c;
                F f10 = c0271m1.f954d;
                if (f10 != null) {
                    try {
                        f10.g(n12);
                    } catch (RemoteException e7) {
                        c0271m1.zzj().f605f.d("Failed to reset data on the service: remote exception", e7);
                    }
                    c0271m1.v0();
                    break;
                } else {
                    c0271m1.zzj().f605f.c("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                N1 n13 = this.f1031b;
                C0271m1 c0271m12 = this.f1032c;
                F f11 = c0271m12.f954d;
                if (f11 == null) {
                    c0271m12.zzj().f605f.c("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        f11.b(n13);
                        ((C0273n0) c0271m12.f421a).k().n0();
                        c0271m12.l0(f11, null, n13);
                        c0271m12.v0();
                        break;
                    } catch (RemoteException e10) {
                        c0271m12.zzj().f605f.d("Failed to send app launch to the service", e10);
                        return;
                    }
                }
            case 2:
                N1 n14 = this.f1031b;
                C0271m1 c0271m13 = this.f1032c;
                F f12 = c0271m13.f954d;
                if (f12 == null) {
                    c0271m13.zzj().f608i.c("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        f12.c(n14);
                        c0271m13.v0();
                        break;
                    } catch (RemoteException e11) {
                        c0271m13.zzj().f605f.d("Failed to send app backgrounded to the service", e11);
                        return;
                    }
                }
            case 3:
                N1 n15 = this.f1031b;
                C0271m1 c0271m14 = this.f1032c;
                F f13 = c0271m14.f954d;
                if (f13 == null) {
                    c0271m14.zzj().f605f.c("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        f13.H(n15);
                        c0271m14.v0();
                        break;
                    } catch (RemoteException e12) {
                        c0271m14.zzj().f605f.d("Failed to send measurementEnabled to the service", e12);
                        return;
                    }
                }
            default:
                N1 n16 = this.f1031b;
                C0271m1 c0271m15 = this.f1032c;
                F f14 = c0271m15.f954d;
                if (f14 == null) {
                    c0271m15.zzj().f605f.c("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        f14.f(n16);
                        c0271m15.v0();
                        break;
                    } catch (RemoteException e13) {
                        c0271m15.zzj().f605f.d("Failed to send consent settings to the service", e13);
                    }
                }
        }
    }
}
