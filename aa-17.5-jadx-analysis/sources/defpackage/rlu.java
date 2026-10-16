package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class rlu extends snw {
    public rlu(Context context, Looper looper, snr snrVar, slz slzVar, smu smuVar) {
        super(context, looper, 13, snrVar, slzVar, smuVar);
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 202700000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICar");
        return iInterfaceQueryLocalInterface instanceof qup ? (qup) iInterfaceQueryLocalInterface : new qun(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.car.ICar";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.car.service.START";
    }

    @Override // defpackage.snp
    protected final boolean e() {
        return false;
    }

    @Override // defpackage.snp
    public final boolean f() {
        return true;
    }

    @Override // defpackage.snp
    protected final Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", "car-1-0");
        return bundle;
    }
}
