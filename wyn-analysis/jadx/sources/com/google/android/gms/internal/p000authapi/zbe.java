package com.google.android.gms.internal.p000authapi;

import S3.c;
import V6.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;

/* loaded from: classes3.dex */
public final class zbe extends AbstractC1723l {
    private final d zba;

    public zbe(Context context, Looper looper, C1720i c1720i, d dVar, m mVar, n nVar) {
        super(context, looper, 68, c1720i, mVar, nVar);
        dVar = dVar == null ? d.f13157c : dVar;
        c cVar = new c(27, false);
        cVar.f10936b = Boolean.FALSE;
        d dVar2 = d.f13157c;
        dVar.getClass();
        cVar.f10936b = Boolean.valueOf(dVar.f13158a);
        cVar.f10937c = dVar.f13159b;
        cVar.f10937c = zbat.zba();
        this.zba = new d(cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbf ? (zbf) iInterfaceQueryLocalInterface : new zbf(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Bundle getGetServiceRequestExtraArgs() {
        d dVar = this.zba;
        dVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", dVar.f13158a);
        bundle.putString("log_session_id", dVar.f13159b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
