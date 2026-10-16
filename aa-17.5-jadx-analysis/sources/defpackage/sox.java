package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class sox extends snw {
    public sox(Context context, Looper looper, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, 483, snrVar, slzVar, smuVar);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 253600000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService");
        return iInterfaceQueryLocalInterface instanceof spa ? (spa) iInterfaceQueryLocalInterface : new spa(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientThrottlingTelemetryService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.common.telemetry.throttling.service.START";
    }

    @Override // defpackage.snp
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return sjq.d;
    }
}
