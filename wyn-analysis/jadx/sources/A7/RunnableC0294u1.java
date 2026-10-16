package A7;

import android.content.ComponentName;

/* renamed from: A7.u1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0294u1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC0291t1 f1079b;

    public /* synthetic */ RunnableC0294u1(ServiceConnectionC0291t1 serviceConnectionC0291t1, int i5) {
        this.f1078a = i5;
        this.f1079b = serviceConnectionC0291t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1078a) {
            case 0:
                C0271m1 c0271m1 = this.f1079b.f1067c;
                c0271m1.f954d = null;
                c0271m1.u0();
                break;
            default:
                ServiceConnectionC0291t1 serviceConnectionC0291t1 = this.f1079b;
                C0271m1 c0271m12 = serviceConnectionC0291t1.f1067c;
                ComponentName componentName = new ComponentName(((C0273n0) serviceConnectionC0291t1.f1067c.f421a).f973a, "com.google.android.gms.measurement.AppMeasurementService");
                c0271m12.c0();
                if (c0271m12.f954d != null) {
                    c0271m12.f954d = null;
                    c0271m12.zzj().f612n.d("Disconnected from device MeasurementService", componentName);
                    c0271m12.c0();
                    c0271m12.p0();
                    break;
                }
                break;
        }
    }
}
