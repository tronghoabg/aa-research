package A7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzdp;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: A7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0233a implements J0 {

    /* renamed from: a, reason: collision with root package name */
    public final zzdp f790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f791b;

    public C0233a(AppMeasurementDynamiteService appMeasurementDynamiteService, zzdp zzdpVar) {
        this.f791b = appMeasurementDynamiteService;
        this.f790a = zzdpVar;
    }

    @Override // A7.J0
    public final void a(String str, String str2, Bundle bundle, long j8) {
        try {
            this.f790a.zza(str, str2, bundle, j8);
        } catch (RemoteException e7) {
            C0273n0 c0273n0 = this.f791b.f26746a;
            if (c0273n0 != null) {
                N n10 = c0273n0.f981i;
                C0273n0.d(n10);
                n10.f608i.d("Event listener threw exception", e7);
            }
        }
    }
}
