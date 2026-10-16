package A7;

import com.google.android.gms.internal.measurement.zzdo;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: A7.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC0282q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzdo f1028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f1029c;

    public /* synthetic */ RunnableC0282q0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdo zzdoVar, int i5) {
        this.f1027a = i5;
        this.f1028b = zzdoVar;
        this.f1029c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1027a) {
            case 0:
                C0271m1 c0271m1H = AbstractC0279p0.h(this.f1029c.f26746a);
                c0271m1H.m0(new RunnableC0299w0(c0271m1H, c0271m1H.w0(false), (Object) this.f1028b, 6));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f1029c;
                U1 u12 = appMeasurementDynamiteService.f26746a.f983l;
                C0273n0.c(u12);
                C0273n0 c0273n0 = appMeasurementDynamiteService.f26746a;
                u12.C0(this.f1028b, c0273n0.f965A != null && c0273n0.f965A.booleanValue());
                break;
        }
    }
}
