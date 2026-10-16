package F7;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;

/* loaded from: classes4.dex */
public final class a extends AbstractC1723l implements com.google.android.gms.common.api.g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4017a;

    /* renamed from: b, reason: collision with root package name */
    public final C1720i f4018b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f4019c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4020d;

    public a(Context context, Looper looper, C1720i c1720i, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c1720i, mVar, nVar);
        this.f4017a = true;
        this.f4018b = c1720i;
        this.f4019c = bundle;
        this.f4020d = c1720i.f26651g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Bundle getGetServiceRequestExtraArgs() {
        C1720i c1720i = this.f4018b;
        boolean zEquals = getContext().getPackageName().equals(c1720i.f26648d);
        Bundle bundle = this.f4019c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c1720i.f26648d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f4017a;
    }
}
