package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdra {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final G6.N zzb;
    private final zzflg zzc;
    private final zzdqg zzd;
    private final zzdqb zze;
    private final zzdro zzf;
    private final zzdrw zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbma zzj;
    private final zzdpy zzk;

    public zzdra(G6.N n10, zzflg zzflgVar, zzdqg zzdqgVar, zzdqb zzdqbVar, zzdro zzdroVar, zzdrw zzdrwVar, Executor executor, Executor executor2, zzdpy zzdpyVar) {
        this.zzb = n10;
        this.zzc = zzflgVar;
        this.zzj = zzflgVar.zzj;
        this.zzd = zzdqgVar;
        this.zze = zzdqbVar;
        this.zzf = zzdroVar;
        this.zzg = zzdrwVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdpyVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i5) {
        if (i5 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i5 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i5 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z2) {
        View viewZzJ = z2 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeS)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdry zzdryVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdryVar);
            }
        });
    }

    public final void zzb(zzdry zzdryVar) {
        zzdro zzdroVar;
        if (zzdryVar == null || (zzdroVar = this.zzf) == null || zzdryVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdryVar.zzdA().addView(zzdroVar.zza());
        } catch (zzclq e7) {
            G6.L.l("web view can not be obtained", e7);
        }
    }

    public final void zzc(zzdry zzdryVar) {
        if (zzdryVar == null) {
            return;
        }
        Context context = zzdryVar.zzdF().getContext();
        if (Fe.g.U(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i5 = G6.L.f4523b;
                H6.l.a("Activity context is needed for policy validator.");
                return;
            }
            zzdrw zzdrwVar = this.zzg;
            if (zzdrwVar == null || zzdryVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdrwVar.zza(zzdryVar.zzdA(), windowManager), Fe.g.W());
            } catch (zzclq e7) {
                G6.L.l("web view can not be obtained", e7);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzf(com.google.android.gms.internal.ads.zzdry r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdra.zzf(com.google.android.gms.internal.ads.zzdry):void");
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdqb zzdqbVar = this.zze;
        if (zzdqbVar.zzJ() != null) {
            boolean z2 = viewGroup != null;
            if (zzdqbVar.zzx() == 2 || zzdqbVar.zzx() == 1) {
                G6.N n10 = this.zzb;
                G6.O o7 = (G6.O) n10;
                o7.x(this.zzc.zzg, String.valueOf(zzdqbVar.zzx()), z2);
                return;
            }
            if (zzdqbVar.zzx() == 6) {
                G6.N n11 = this.zzb;
                String str = this.zzc.zzg;
                G6.O o10 = (G6.O) n11;
                o10.x(str, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION, z2);
                o10.x(str, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, z2);
            }
        }
    }
}
