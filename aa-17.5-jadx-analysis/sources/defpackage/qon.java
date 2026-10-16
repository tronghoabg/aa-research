package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class qon extends snw {
    public qon(Context context, Looper looper, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, 343, snrVar, slzVar, smuVar);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 234200000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.aang.internal.IGoogleAuthAangService");
        return iInterfaceQueryLocalInterface instanceof qop ? (qop) iInterfaceQueryLocalInterface : new qop(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.auth.aang.internal.IGoogleAuthAangService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.auth.aang.events.services.START";
    }

    @Override // defpackage.snp
    protected final boolean e() {
        return true;
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return new Feature[]{new Feature("google_auth_api", -1, 1L, false), qoc.c, qoc.d, qoc.a};
    }
}
