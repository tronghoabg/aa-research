package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import q7.BinderC3877b;
import q7.C3878c;

/* loaded from: classes3.dex */
public final class zzbzf extends q7.d {
    public zzbzf() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbzl ? (zzbzl) iInterfaceQueryLocalInterface : new zzbzj(iBinder);
    }

    public final zzbzi zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbzl) getRemoteCreatorInstance(activity)).zze(new BinderC3877b(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbzi ? (zzbzi) iInterfaceQueryLocalInterface : new zzbzg(iBinderZze);
        } catch (RemoteException e7) {
            H6.l.g("Could not create remote AdOverlay.", e7);
            return null;
        } catch (C3878c e10) {
            H6.l.g("Could not create remote AdOverlay.", e10);
            return null;
        }
    }
}
