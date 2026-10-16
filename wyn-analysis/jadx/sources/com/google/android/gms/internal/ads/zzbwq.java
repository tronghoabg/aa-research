package com.google.android.gms.internal.ads;

import D6.L0;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzbwq extends zzbvx {
    private final J6.t zza;

    public zzbwq(J6.t tVar) {
        this.zza = tVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzA() {
        this.zza.getClass();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzB() {
        this.zza.getClass();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzC() {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zze() {
        return this.zza.f5706a;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final List zzf() {
        List<A6.b> list = this.zza.f5707b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (A6.b bVar : list) {
                arrayList.add(new zzblw(bVar.getDrawable(), bVar.getUri(), bVar.getScale(), bVar.zza(), bVar.zzb(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzg() {
        return this.zza.f5708c;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbml zzh() {
        A6.b bVar = this.zza.f5709d;
        if (bVar != null) {
            return new zzblw(bVar.getDrawable(), bVar.getUri(), bVar.getScale(), bVar.zza(), bVar.zzb(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzi() {
        return this.zza.f5710e;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzj() {
        return this.zza.f5711f;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final double zzk() {
        Double d3 = this.zza.f5712g;
        if (d3 != null) {
            return d3.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzl() {
        return this.zza.f5713h;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final String zzm() {
        return this.zza.f5714i;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final L0 zzn() {
        L0 l02;
        VideoController videoController = this.zza.f5715j;
        if (videoController == null) {
            return null;
        }
        synchronized (videoController.f26302a) {
            l02 = videoController.f26303b;
        }
        return l02;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final zzbme zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzp() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzq() {
        this.zza.getClass();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final InterfaceC3876a zzr() {
        Object obj = this.zza.k;
        if (obj == null) {
            return null;
        }
        return new BinderC3877b(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final Bundle zzs() {
        return this.zza.f5716l;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final boolean zzt() {
        return this.zza.f5717m;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final boolean zzu() {
        return this.zza.f5718n;
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzv() {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzw(InterfaceC3876a interfaceC3876a) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzx(InterfaceC3876a interfaceC3876a, InterfaceC3876a interfaceC3876a2, InterfaceC3876a interfaceC3876a3) {
        View view = (View) BinderC3877b.S(interfaceC3876a);
        ((com.google.ads.mediation.a) this.zza).getClass();
        if (A6.k.f408a.get(view) != null) {
            throw new ClassCastException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final void zzy(InterfaceC3876a interfaceC3876a) {
        this.zza.getClass();
    }

    @Override // com.google.android.gms.internal.ads.zzbvy
    public final float zzz() {
        this.zza.getClass();
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }
}
