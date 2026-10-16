package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.C1720i;
import d7.d;

/* loaded from: classes3.dex */
public final class zzw extends AbstractC1723l {
    public zzw(Context context, Looper looper, C1720i c1720i, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        super(context, looper, 126, c1720i, interfaceC1694h, interfaceC1704s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof zzh ? (zzh) iInterfaceQueryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d[] getApiFeatures() {
        return zzac.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
