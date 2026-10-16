package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class sow extends snw {
    public sow(Context context, Looper looper, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, 449, snrVar, slzVar, smuVar);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 253600000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof soy ? (soy) iInterfaceQueryLocalInterface : new soy(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
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
