package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class svj extends snw implements skv {
    public final snr a;
    public final Integer x;
    private final boolean y;
    private final Bundle z;

    public svj(Context context, Looper looper, snr snrVar, Bundle bundle, slb slbVar, slc slcVar) {
        super(context, looper, 44, snrVar, slbVar, slcVar);
        this.y = true;
        this.a = snrVar;
        this.z = bundle;
        this.x = snrVar.h;
    }

    @Override // defpackage.snw, defpackage.snp, defpackage.skv
    public final int a() {
        return 12451000;
    }

    @Override // defpackage.snp
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof svi ? (svi) iInterfaceQueryLocalInterface : new svi(iBinder);
    }

    @Override // defpackage.snp
    protected final String c() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.snp
    protected final String d() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // defpackage.snp
    protected final Bundle h() {
        snr snrVar = this.a;
        String packageName = this.b.getPackageName();
        String str = snrVar.e;
        if (!packageName.equals(str)) {
            this.z.putString("com.google.android.gms.signin.internal.realClientPackageName", str);
        }
        return this.z;
    }

    @Override // defpackage.snp, defpackage.skv
    public final boolean i() {
        return this.y;
    }
}
