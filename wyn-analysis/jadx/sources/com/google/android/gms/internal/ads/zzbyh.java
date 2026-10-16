package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.unity3d.ads.BuildConfig;
import j$.util.DesugarCollections;
import java.util.Collections;
import org.json.JSONException;
import x.C4413f;

/* loaded from: classes3.dex */
public final class zzbyh extends zzbyn {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzclb zzj;
    private final Activity zzk;
    private zzcnl zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbyo zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        C4413f c4413f = new C4413f(7);
        Collections.addAll(c4413f, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        DesugarCollections.unmodifiableSet(c4413f);
    }

    public zzbyh(zzclb zzclbVar, zzbyo zzbyoVar) {
        super(zzclbVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzclbVar;
        this.zzk = zzclbVar.zzj();
        this.zzo = zzbyoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z2) throws JSONException {
        zzbio zzbioVar = zzbix.zzmw;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzmx)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzmy)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzclb zzclbVar = this.zzj;
                    viewGroup2.addView((View) zzclbVar);
                    zzclbVar.zzaf(this.zzl);
                } catch (IllegalStateException e7) {
                    int i5 = G6.L.f4523b;
                    H6.l.d("Unable to add webview back to view hierarchy.", e7);
                    C6.n.f1857D.f1868h.zzh(e7, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzclb zzclbVar2 = this.zzj;
                viewGroup3.addView((View) zzclbVar2);
                zzclbVar2.zzaf(this.zzl);
            }
        }
        if (z2) {
            zzk(BuildConfig.FLAVOR);
            zzbyo zzbyoVar = this.zzo;
            if (zzbyoVar != null) {
                zzbyoVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbyh.zza(java.util.Map):void");
    }

    public final void zzb(final boolean z2) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmv)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z2);
                    } else {
                        zzcfy.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyg
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws JSONException {
                                this.zza.zzf(z2);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(int i5, int i10, boolean z2) {
        synchronized (this.zzi) {
            this.zzc = i5;
            this.zzd = i10;
        }
    }

    public final boolean zzd() {
        boolean z2;
        synchronized (this.zzi) {
            z2 = this.zzp != null;
        }
        return z2;
    }

    public final void zze(int i5, int i10) {
        this.zzc = i5;
        this.zzd = i10;
    }
}
