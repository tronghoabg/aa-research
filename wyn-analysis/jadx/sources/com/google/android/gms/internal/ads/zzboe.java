package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import q7.BinderC3877b;
import q7.C3878c;

/* loaded from: classes3.dex */
public final class zzboe extends q7.d {
    public zzboe() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // q7.d
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof zzbms ? (zzbms) iInterfaceQueryLocalInterface : new zzbmq(iBinder);
    }

    public final zzbmp zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderZze = ((zzbms) getRemoteCreatorInstance(context)).zze(new BinderC3877b(context), new BinderC3877b(frameLayout), new BinderC3877b(frameLayout2), 261710000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof zzbmp ? (zzbmp) iInterfaceQueryLocalInterface : new zzbmn(iBinderZze);
        } catch (RemoteException e7) {
            e = e7;
            H6.l.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (C3878c e10) {
            e = e10;
            H6.l.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
