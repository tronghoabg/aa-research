package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1694h;
import com.google.android.gms.common.api.internal.InterfaceC1704s;
import com.google.android.gms.common.internal.AbstractC1723l;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.common.internal.C1720i;
import d7.d;
import ka.AbstractC3256n;
import x7.z;

/* loaded from: classes.dex */
public final class zzg extends AbstractC1723l {
    public zzg(Context context, Looper looper, C1720i c1720i, InterfaceC1694h interfaceC1694h, InterfaceC1704s interfaceC1704s) {
        super(context, looper, 23, c1720i, interfaceC1694h, interfaceC1704s);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof zzv ? (zzv) iInterfaceQueryLocalInterface : new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final d[] getApiFeatures() {
        return z.f47848i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final Bundle getGetServiceRequestExtraArgs() {
        return AbstractC3256n.b("client_name", "activity_recognition");
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzp(PendingIntent pendingIntent) throws RemoteException {
        AbstractC1732v.i(pendingIntent);
        ((zzv) getService()).zzl(pendingIntent);
    }
}
