package com.google.android.gms.internal.appset;

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
public final class zzd extends AbstractC1723l {
    public zzd(Context context, Looper looper, C1720i c1720i, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        super(context, looper, 300, c1720i, interfaceC1694h, interfaceC1704s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return iInterfaceQueryLocalInterface instanceof zzg ? (zzg) iInterfaceQueryLocalInterface : new zzg(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d[] getApiFeatures() {
        return com.google.android.gms.appset.zze.zzb;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 212800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
