package com.google.android.gms.internal.auth;

import T6.g;
import U6.d;
import U6.e;
import U6.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;

/* loaded from: classes3.dex */
public final class zzam extends AbstractC1723l {
    public zzam(Context context, Looper looper, C1720i c1720i, m mVar, n nVar) {
        super(context, looper, 120, c1720i, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i5 = e.f12352a;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d7.d[] getApiFeatures() {
        return new d7.d[]{g.f11771d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
