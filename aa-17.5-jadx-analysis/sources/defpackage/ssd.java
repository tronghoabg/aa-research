package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class ssd extends snw {
    public final ssb a;

    public ssd(Context context, Looper looper, snr snrVar, slb slbVar, slc slcVar) {
        super(context, looper, 63, snrVar, slbVar, slcVar);
        this.a = new ssb();
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 11925000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        return iInterfaceQueryLocalInterface instanceof ssf ? (ssf) iInterfaceQueryLocalInterface : new ssf(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }
}
