package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.H0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzfkk extends zzcby {
    private final zzfka zza;
    private final zzfjr zzb;
    private final zzfkz zzc;
    private zzdvu zzd;
    private boolean zze = false;

    public zzfkk(zzfka zzfkaVar, zzfjr zzfjrVar, zzfkz zzfkzVar) {
        this.zza = zzfkaVar;
        this.zzb = zzfjrVar;
        this.zzc = zzfkzVar;
    }

    private final synchronized boolean zzy() {
        zzdvu zzdvuVar = this.zzd;
        if (zzdvuVar != null) {
            if (!zzdvuVar.zze()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) D6.C0395s.f2489e.f2492c.zzd(com.google.android.gms.internal.ads.zzbix.zzgE)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzcbz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzb(com.google.android.gms.internal.ads.zzccd r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.AbstractC1732v.e(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzgC     // Catch: java.lang.Throwable -> L20
            D6.s r2 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zzd(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L62
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            C6.n r2 = C6.n.f1857D     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzcfk r2 = r2.f1868h     // Catch: java.lang.Throwable -> L20
            r2.zzh(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzgE     // Catch: java.lang.Throwable -> L20
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfjt r0 = new com.google.android.gms.internal.ads.zzfjt     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfka r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            D6.v1 r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfki r3 = new com.google.android.gms.internal.ads.zzfki     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zza(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L62:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkk.zzb(com.google.android.gms.internal.ads.zzccd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzc() throws RemoteException {
        zzp(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzd(zzccc zzcccVar) throws RemoteException {
        AbstractC1732v.e("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzn(zzcccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final boolean zze() throws RemoteException {
        AbstractC1732v.e("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzf() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzg() {
        zzj(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzh() throws RemoteException {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzi(InterfaceC3876a interfaceC3876a) {
        AbstractC1732v.e("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zza(interfaceC3876a == null ? null : (Context) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzj(InterfaceC3876a interfaceC3876a) {
        AbstractC1732v.e("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzl().zzb(interfaceC3876a == null ? null : (Context) BinderC3877b.S(interfaceC3876a));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzk(InterfaceC3876a interfaceC3876a) {
        AbstractC1732v.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzk(null);
        if (this.zzd != null) {
            if (interfaceC3876a != null) {
                context = (Context) BinderC3877b.S(interfaceC3876a);
            }
            this.zzd.zzl().zzc(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized String zzl() throws RemoteException {
        zzdvu zzdvuVar = this.zzd;
        if (zzdvuVar == null || zzdvuVar.zzn() == null) {
            return null;
        }
        return zzdvuVar.zzn().zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzm(String str) throws RemoteException {
        AbstractC1732v.e("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzn(D6.O o7) {
        AbstractC1732v.e("setAdMetadataListener can only be called from the UI thread.");
        if (o7 == null) {
            this.zzb.zzk(null);
        } else {
            this.zzb.zzk(new zzfkj(this, o7));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final Bundle zzo() {
        AbstractC1732v.e("getAdMetadata can only be called from the UI thread.");
        zzdvu zzdvuVar = this.zzd;
        return zzdvuVar != null ? zzdvuVar.zzg() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzp(InterfaceC3876a interfaceC3876a) throws RemoteException {
        try {
            AbstractC1732v.e("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (interfaceC3876a != null) {
                    Object objS = BinderC3877b.S(interfaceC3876a);
                    if (objS instanceof Activity) {
                        activity = (Activity) objS;
                    }
                }
                this.zzd.zza(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzq(String str) throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized void zzr(boolean z2) {
        AbstractC1732v.e("setImmersiveMode must be called on the main UI thread.");
        this.zze = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final boolean zzs() {
        zzdvu zzdvuVar = this.zzd;
        return zzdvuVar != null && zzdvuVar.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final synchronized H0 zzt() throws RemoteException {
        zzdvu zzdvuVar;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhO)).booleanValue() && (zzdvuVar = this.zzd) != null) {
            return zzdvuVar.zzn();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzu(zzcbx zzcbxVar) {
        AbstractC1732v.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzq(zzcbxVar);
    }

    public final /* synthetic */ zzfkz zzv() {
        return this.zzc;
    }

    public final /* synthetic */ zzdvu zzw() {
        return this.zzd;
    }

    public final /* synthetic */ void zzx(zzdvu zzdvuVar) {
        this.zzd = zzdvuVar;
    }
}
