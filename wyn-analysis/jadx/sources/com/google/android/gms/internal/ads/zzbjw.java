package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import b.C1489b;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzbjw extends u.m {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdzt zzd;
    private u.n zze;
    private u.g zzf;

    private final void zzf(Context context) {
        String strB;
        if (this.zzf != null || context == null || (strB = u.g.b(context, null, false)) == null || strB.equals(context.getPackageName())) {
            return;
        }
        u.g.a(context, strB, this);
    }

    @Override // u.m
    public final void onCustomTabsServiceConnected(ComponentName componentName, u.g gVar) {
        this.zzf = gVar;
        gVar.getClass();
        try {
            ((C1489b) gVar.f46069a).X();
        } catch (RemoteException unused) {
        }
        this.zze = gVar.c(new zzbjt(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdzt zzdztVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdztVar;
        zzf(context);
    }

    public final u.n zzb() {
        if (this.zze == null) {
            zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbjv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i5) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzfH)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcfy.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbju
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i5);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i5) {
        zzdzt zzdztVar = this.zzd;
        if (zzdztVar != null) {
            zzdzs zzdzsVarZza = zzdztVar.zza();
            zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "cct_nav");
            zzdzsVarZza.zzc("cct_navs", String.valueOf(i5));
            zzdzsVarZza.zzd();
        }
    }
}
