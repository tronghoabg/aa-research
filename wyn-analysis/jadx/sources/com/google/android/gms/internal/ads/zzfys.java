package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC1713b;
import com.google.android.gms.common.internal.InterfaceC1714c;

/* loaded from: classes3.dex */
public final class zzfys extends C6.c {
    private final int zze;

    public zzfys(Context context, Looper looper, InterfaceC1713b interfaceC1713b, InterfaceC1714c interfaceC1714c, int i5) {
        super(context, looper, interfaceC1713b, interfaceC1714c, 116);
        this.zze = i5;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof zzfyx ? (zzfyx) iInterfaceQueryLocalInterface : new zzfyx(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final int getMinApkVersion() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC1717f
    public final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public final zzfyx zzp() throws DeadObjectException {
        return (zzfyx) getService();
    }
}
