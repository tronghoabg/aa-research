package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.InterfaceC0391p0;
import D6.InterfaceC0396s0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzdsd implements zzdqj, zzdib {
    private final zzbvy zza;
    private final zzddr zzb;
    private final zzdfs zzc;
    private final zzdcx zzd;
    private final zzdle zze;
    private final Context zzf;
    private final zzfkn zzg;
    private final H6.a zzh;
    private final zzflg zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbvu zzm;
    private final zzbvv zzn;

    public zzdsd(zzbvu zzbvuVar, zzbvv zzbvvVar, zzbvy zzbvyVar, zzddr zzddrVar, zzdfs zzdfsVar, zzdcx zzdcxVar, zzdle zzdleVar, Context context, zzfkn zzfknVar, H6.a aVar, zzflg zzflgVar) {
        this.zzm = zzbvuVar;
        this.zzn = zzbvvVar;
        this.zza = zzbvyVar;
        this.zzb = zzddrVar;
        this.zzc = zzdfsVar;
        this.zzd = zzdcxVar;
        this.zze = zzdleVar;
        this.zzf = context;
        this.zzg = zzfknVar;
        this.zzh = aVar;
        this.zzi = zzflgVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbvy zzbvyVar = this.zza;
            if (zzbvyVar != null && !zzbvyVar.zzu()) {
                zzbvyVar.zzw(new BinderC3877b(view));
                this.zzd.onAdClicked();
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvu zzbvuVar = this.zzm;
            if (zzbvuVar != null && !zzbvuVar.zzq()) {
                zzbvuVar.zzn(new BinderC3877b(view));
                this.zzd.onAdClicked();
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
                    this.zze.zzdu();
                    return;
                }
                return;
            }
            zzbvv zzbvvVar = this.zzn;
            if (zzbvvVar == null || zzbvvVar.zzo()) {
                return;
            }
            zzbvvVar.zzl(new BinderC3877b(view));
            this.zzd.onAdClicked();
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzms)).booleanValue()) {
                this.zze.zzdu();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to call handleClick", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzA() {
        try {
            zzbvy zzbvyVar = this.zza;
            if (zzbvyVar != null) {
                zzbvyVar.zzC();
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to call destroy", e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1 A[Catch: RemoteException -> 0x002c, JSONException -> 0x0048, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x002c, blocks: (B:2:0x0000, B:4:0x001c, B:8:0x0026, B:13:0x0032, B:15:0x0039, B:16:0x0048, B:18:0x004e, B:20:0x005a, B:23:0x0066, B:26:0x006d, B:28:0x0083, B:30:0x008b, B:45:0x00aa, B:35:0x0095, B:39:0x009e, B:48:0x00b1, B:49:0x00b5, B:50:0x00cb, B:52:0x00d1, B:56:0x00e3, B:58:0x00f1, B:59:0x00ff, B:61:0x0103, B:62:0x0114, B:64:0x0118), top: B:71:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzdqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdsd.zza(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzb(View view, Map map) {
        try {
            BinderC3877b binderC3877b = new BinderC3877b(view);
            zzbvy zzbvyVar = this.zza;
            if (zzbvyVar != null) {
                zzbvyVar.zzy(binderC3877b);
                return;
            }
            zzbvu zzbvuVar = this.zzm;
            if (zzbvuVar != null) {
                zzbvuVar.zzs(binderC3877b);
                return;
            }
            zzbvv zzbvvVar = this.zzn;
            if (zzbvvVar != null) {
                zzbvvVar.zzq(binderC3877b);
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to call untrackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzc(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdH() {
        try {
            zzbvy zzbvyVar = this.zza;
            if (zzbvyVar == null || !zzbvyVar.zzt()) {
                return;
            }
            zzfkn zzfknVar = this.zzg;
            if (zzfknVar.zze != 4 && !zzfknVar.zzaD) {
                return;
            }
            zzbvyVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to report impression from an adapter", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdib
    public final void zzdI() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzf(View view, View view2, Map map, Map map2, boolean z2, ImageView.ScaleType scaleType, int i5) {
        if (!this.zzk) {
            int i10 = G6.L.f4523b;
            H6.l.f("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i11 = G6.L.f4523b;
            H6.l.f("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzp(zzbnz zzbnzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzr(InterfaceC0396s0 interfaceC0396s0) {
        int i5 = G6.L.f4523b;
        H6.l.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzs(InterfaceC0391p0 interfaceC0391p0) {
        int i5 = G6.L.f4523b;
        H6.l.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzt() {
        int i5 = G6.L.f4523b;
        H6.l.f("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = C6.n.f1857D.f1874o.d(this.zzf, this.zzh.f4927a, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbvy zzbvyVar = this.zza;
                if (zzbvyVar == null) {
                    zzbvu zzbvuVar = this.zzm;
                    if (zzbvuVar != null && !zzbvuVar.zzp()) {
                        zzbvuVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbvv zzbvvVar = this.zzn;
                    if (zzbvvVar == null || zzbvvVar.zzn()) {
                        return;
                    }
                    zzbvvVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzfkn zzfknVar = this.zzg;
                if (zzfknVar.zzaD) {
                    if (zzbvyVar.zzt()) {
                        return;
                    }
                    zzbvyVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbvyVar.zzt() && zzfknVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbvyVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.g("Failed to call recordImpression", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdqj
    public final boolean zzz(Bundle bundle) {
        return false;
    }
}
