package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzchi extends FrameLayout implements zzcgz {
    final zzchw zza;
    private final zzchu zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbjm zze;
    private final long zzf;
    private final zzcha zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzchi(Context context, zzchu zzchuVar, int i5, boolean z2, zzbjm zzbjmVar, zzcht zzchtVar, zzdzt zzdztVar) {
        zzcha zzcgyVar;
        zzbjm zzbjmVar2;
        zzcha zzckqVar;
        super(context);
        this.zzb = zzchuVar;
        this.zze = zzbjmVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        zzbio zzbioVar = zzbix.zzt;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        AbstractC1732v.i(zzchuVar.zzk());
        zzchm zzchmVar = zzchuVar.zzk().f1806a;
        zzchv zzchvVar = new zzchv(context, zzchuVar.zzs(), zzchuVar.zzm(), zzbjmVar, zzchuVar.zzi());
        if (i5 == 3) {
            zzckqVar = new zzckq(context, zzchvVar);
            zzbjmVar2 = zzbjmVar;
        } else {
            if (i5 == 2) {
                zzcgyVar = new zzcim(context, zzchvVar, zzchuVar, z2, zzchb.zza(zzchuVar), zzchtVar, zzdztVar);
                zzbjmVar2 = zzbjmVar;
            } else {
                zzbjmVar2 = zzbjmVar;
                zzcgyVar = new zzcgy(context, zzchuVar, z2, zzchb.zza(zzchuVar), zzchtVar, new zzchv(context, zzchuVar.zzs(), zzchuVar.zzm(), zzbjmVar, zzchuVar.zzi()), zzdztVar);
            }
            zzckqVar = zzcgyVar;
        }
        this.zzg = zzckqVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzckqVar, new FrameLayout.LayoutParams(-1, -1, 17));
        zzbio zzbioVar2 = zzbix.zzay;
        zzbiv zzbivVar = c0395s.f2492c;
        if (((Boolean) zzbivVar.zzd(zzbioVar2)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) zzbivVar.zzd(zzbix.zzav)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) zzbivVar.zzd(zzbix.zzaA)).longValue();
        boolean zBooleanValue = ((Boolean) zzbivVar.zzd(zzbix.zzax)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbjmVar2 != null) {
            zzbjmVar2.zzd("spinner_used", true != zBooleanValue ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
        }
        this.zza = new zzchw(this);
        zzckqVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzchu zzchuVar = this.zzb;
        if (zzchuVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzchuVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcha zzchaVar = this.zzg;
            if (zzchaVar != null) {
                zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzchaVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z2);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgz
    public final void onWindowVisibilityChanged(int i5) {
        boolean z2;
        super.onWindowVisibilityChanged(i5);
        if (i5 == 0) {
            this.zza.zzb();
            z2 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z2 = false;
        }
        U.f4562l.post(new zzche(this, z2));
    }

    public final void zzA(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzB(i5);
    }

    public final void zzB(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzC(i5);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        TextView textView = new TextView(zzchaVar.getContext());
        Resources resourcesZzg = C6.n.f1857D.f1868h.zzg();
        textView.setText(String.valueOf(resourcesZzg == null ? "AdMob - " : resourcesZzg.getString(R.string.watermark_label_prefix)).concat(zzchaVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            zzchaVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        long jZzh = zzchaVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f10 = jZzh / 1000.0f;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcG)).booleanValue()) {
            String strValueOf = String.valueOf(f10);
            String strValueOf2 = String.valueOf(zzchaVar.zzo());
            String strValueOf3 = String.valueOf(zzchaVar.zzn());
            String strValueOf4 = String.valueOf(zzchaVar.zzm());
            String strValueOf5 = String.valueOf(zzchaVar.zzp());
            C6.n.f1857D.k.getClass();
            zzI("timeupdate", "time", strValueOf, "totalBytes", strValueOf2, "qoeCachedBytes", strValueOf3, "qoeLoadedBytes", strValueOf4, "droppedFrames", strValueOf5, "reportTime", String.valueOf(System.currentTimeMillis()));
        } else {
            zzI("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZzh;
    }

    public final /* synthetic */ void zzG(boolean z2) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zza() {
        this.zza.zzb();
        U.f4562l.post(new zzchc(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzb() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzchaVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzchaVar.zzk()), "videoHeight", String.valueOf(zzchaVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzc() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcI)).booleanValue()) {
            this.zza.zzb();
        }
        zzchu zzchuVar = this.zzb;
        if (zzchuVar.zzj() != null && !this.zzi) {
            boolean z2 = (zzchuVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z2;
            if (!z2) {
                zzchuVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zze() {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcI)).booleanValue()) {
            this.zza.zza();
        }
        zzI("ended", new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        U.f4562l.post(new zzchd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null || this.zzp == null) {
            return;
        }
        C6.n nVar = C6.n.f1857D;
        nVar.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (zzchaVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        nVar.k.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (G6.L.m()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb2.append("Spinner frame grab took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            G6.L.k(sb2.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            H6.l.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbjm zzbjmVar = this.zze;
            if (zzbjmVar != null) {
                zzbjmVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzj(int i5, int i10) {
        if (this.zzk) {
            zzbio zzbioVar = zzbix.zzaz;
            C0395s c0395s = C0395s.f2489e;
            int iMax = Math.max(i5 / ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue(), 1);
            int iMax2 = Math.max(i10 / ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgz
    public final void zzk() {
        this.zzd.setVisibility(4);
        U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            return zzchaVar.zzw();
        }
        return null;
    }

    public final void zzm(int i5) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzay)).booleanValue()) {
            this.zzc.setBackgroundColor(i5);
            this.zzd.setBackgroundColor(i5);
        }
    }

    public final void zzn(int i5, int i10, int i11, int i12) {
        if (G6.L.m()) {
            int length = String.valueOf(i5).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i10).length() + 3 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length());
            N0.a.l(i5, i10, "Set video bounds to x:", ";y:", sb2);
            sb2.append(";w:");
            sb2.append(i11);
            sb2.append(";h:");
            sb2.append(i12);
            G6.L.k(sb2.toString());
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i5, i10, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f10, float f11) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar != null) {
            zzchaVar.zzj(f10, f11);
        }
    }

    public final void zzq(Integer num) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzchaVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzf();
    }

    public final void zzs() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zze();
    }

    public final void zzt(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzi(i5);
    }

    public final void zzu() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zza(true);
        zzchaVar.zzq();
    }

    public final void zzv() {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zza(false);
        zzchaVar.zzq();
    }

    public final void zzw(float f10) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzb.zzb(f10);
        zzchaVar.zzq();
    }

    public final void zzx(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzy(i5);
    }

    public final void zzy(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzz(i5);
    }

    public final void zzz(int i5) {
        zzcha zzchaVar = this.zzg;
        if (zzchaVar == null) {
            return;
        }
        zzchaVar.zzA(i5);
    }
}
