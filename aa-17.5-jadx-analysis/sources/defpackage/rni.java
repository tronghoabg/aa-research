package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final class rni extends snw {
    public final aat a;

    public rni(Context context, Looper looper, snr snrVar, slb slbVar, slc slcVar) {
        super(context, looper, 13, snrVar, slbVar, slcVar);
        this.a = new aat(0);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 12800000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarCall");
        return iInterfaceQueryLocalInterface instanceof qvx ? (qvx) iInterfaceQueryLocalInterface : new qvv(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.car.ICarCall";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.car.CALL";
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    public final Feature[] g() {
        return qtl.b;
    }

    @Override // defpackage.snp
    protected final int j() {
        return 161;
    }
}
