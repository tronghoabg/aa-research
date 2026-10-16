package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class sph extends snw {
    private final sou a;

    public sph(Context context, Looper looper, snr snrVar, sou souVar, slz slzVar, smu smuVar) {
        super(context, looper, 270, snrVar, slzVar, smuVar);
        this.a = souVar;
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 203400000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof soz ? (soz) iInterfaceQueryLocalInterface : new soz(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.snp
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return sjq.d;
    }

    @Override // defpackage.snp
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        String str = this.a.b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }
}
