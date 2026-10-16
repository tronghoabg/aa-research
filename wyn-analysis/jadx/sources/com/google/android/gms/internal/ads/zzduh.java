package com.google.android.gms.internal.ads;

import D6.L0;
import G6.U;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.Collections;
import java.util.Map;
import q7.BinderC3877b;
import q7.InterfaceC3876a;

/* loaded from: classes3.dex */
public final class zzduh extends zzbsk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzblv {
    private View zza;
    private L0 zzb;
    private zzdpw zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzduh(zzdpw zzdpwVar, zzdqb zzdqbVar) {
        this.zza = zzdqbVar.zzJ();
        this.zzb = zzdqbVar.zzy();
        this.zzc = zzdpwVar;
        if (zzdqbVar.zzT() != null) {
            zzdqbVar.zzT().zzax(this);
        }
    }

    private final void zzg() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private final void zzh() {
        View view;
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar == null || (view = this.zza) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdpwVar.zzu(view, map, map, zzdpw.zzI(view));
    }

    private static final void zzi(zzbso zzbsoVar, int i5) {
        try {
            zzbsoVar.zzf(i5);
        } catch (RemoteException e7) {
            int i10 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzh();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzblv
    public final void zza() {
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdug
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                try {
                    this.zza.zzc();
                } catch (RemoteException e7) {
                    int i5 = G6.L.f4523b;
                    H6.l.i("#007 Could not call remote method.", e7);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final L0 zzb() throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i5 = G6.L.f4523b;
        H6.l.c("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzc() throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzg();
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar != null) {
            zzdpwVar.zzd();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zzd(InterfaceC3876a interfaceC3876a, zzbso zzbsoVar) throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i5 = G6.L.f4523b;
            H6.l.c("Instream ad can not be shown after destroy().");
            zzi(zzbsoVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i10 = G6.L.f4523b;
            H6.l.c("Instream internal error: ".concat(str));
            zzi(zzbsoVar, 0);
            return;
        }
        if (this.zze) {
            int i11 = G6.L.f4523b;
            H6.l.c("Instream ad should not be used again.");
            zzi(zzbsoVar, 1);
            return;
        }
        this.zze = true;
        zzg();
        ((ViewGroup) BinderC3877b.S(interfaceC3876a)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
        zzcgl zzcglVar = C6.n.f1857D.f1860C;
        zzcgl.zza(this.zza, this);
        zzcgl.zzb(this.zza, this);
        zzh();
        try {
            zzbsoVar.zze();
        } catch (RemoteException e7) {
            int i12 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final void zze(InterfaceC3876a interfaceC3876a) throws RemoteException {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzd(interfaceC3876a, new zzduf(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbsl
    public final zzbmi zzf() {
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i5 = G6.L.f4523b;
            H6.l.c("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdpw zzdpwVar = this.zzc;
        if (zzdpwVar == null || zzdpwVar.zzP() == null) {
            return null;
        }
        return zzdpwVar.zzP().zza();
    }
}
