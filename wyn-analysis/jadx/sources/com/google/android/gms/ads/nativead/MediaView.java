package com.google.android.gms.ads.nativead;

import D6.e1;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.zzblx;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbnc;
import q7.BinderC3877b;
import x6.InterfaceC4482m;

/* loaded from: classes3.dex */
public class MediaView extends FrameLayout {
    private InterfaceC4482m zza;
    private boolean zzb;
    private zzblx zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzblz zzf;

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InterfaceC4482m getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzblz zzblzVar = this.zzf;
        if (zzblzVar != null) {
            zzblzVar.zza(scaleType);
        }
    }

    public void setMediaContent(InterfaceC4482m interfaceC4482m) {
        boolean zZzl;
        boolean zZzt;
        this.zzb = true;
        this.zza = interfaceC4482m;
        zzblx zzblxVar = this.zzc;
        if (zzblxVar != null) {
            zzblxVar.zza(interfaceC4482m);
        }
        if (interfaceC4482m == null) {
            return;
        }
        try {
            zzbnc zzbncVar = ((e1) interfaceC4482m).f2421b;
            if (zzbncVar != null) {
                if (!((e1) interfaceC4482m).a()) {
                    try {
                        zZzl = ((e1) interfaceC4482m).f2420a.zzl();
                    } catch (RemoteException e7) {
                        H6.l.d("", e7);
                        zZzl = false;
                    }
                    if (zZzl) {
                        zZzt = zzbncVar.zzt(new BinderC3877b(this));
                    }
                    removeAllViews();
                }
                zZzt = zzbncVar.zzn(new BinderC3877b(this));
                if (zZzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            H6.l.d("", e10);
        }
    }

    public final synchronized void zza(zzblx zzblxVar) {
        this.zzc = zzblxVar;
        if (this.zzb) {
            zzblxVar.zza(this.zza);
        }
    }

    public final synchronized void zzb(zzblz zzblzVar) {
        this.zzf = zzblzVar;
        if (this.zze) {
            zzblzVar.zza(this.zzd);
        }
    }
}
