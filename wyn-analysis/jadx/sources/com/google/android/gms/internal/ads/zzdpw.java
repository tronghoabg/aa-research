package com.google.android.gms.internal.ads;

import A7.AbstractC0279p0;
import D6.A0;
import D6.C0395s;
import D6.InterfaceC0391p0;
import D6.InterfaceC0396s0;
import G6.U;
import Va.M6;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x.C4412e;

/* loaded from: classes3.dex */
public final class zzdpw extends zzcya {
    public static final zzgwt zzc = zzgwt.zzn("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdqb zze;
    private final zzdqj zzf;
    private final zzdra zzg;
    private final zzdqg zzh;
    private final zzdql zzi;
    private final zzimt zzj;
    private final zzimt zzk;
    private final zzimt zzl;
    private final zzimt zzm;
    private final zzimt zzn;
    private zzdry zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzced zzt;
    private final zzbaw zzu;
    private final H6.a zzv;
    private final Context zzw;
    private final zzdpy zzx;
    private final zzetn zzy;
    private final Map zzz;

    public zzdpw(zzcxz zzcxzVar, Executor executor, zzdqb zzdqbVar, zzdqj zzdqjVar, zzdra zzdraVar, zzdqg zzdqgVar, zzdql zzdqlVar, zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzimt zzimtVar4, zzimt zzimtVar5, zzced zzcedVar, zzbaw zzbawVar, H6.a aVar, Context context, zzdpy zzdpyVar, zzetn zzetnVar, zzbfa zzbfaVar) {
        super(zzcxzVar);
        this.zzd = executor;
        this.zze = zzdqbVar;
        this.zzf = zzdqjVar;
        this.zzg = zzdraVar;
        this.zzh = zzdqgVar;
        this.zzi = zzdqlVar;
        this.zzj = zzimtVar;
        this.zzk = zzimtVar2;
        this.zzl = zzimtVar3;
        this.zzm = zzimtVar4;
        this.zzn = zzimtVar5;
        this.zzt = zzcedVar;
        this.zzu = zzbawVar;
        this.zzv = aVar;
        this.zzw = context;
        this.zzx = zzdpyVar;
        this.zzy = zzetnVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzI(View view) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmk)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        U u10 = C6.n.f1857D.f1863c;
        long jQ = U.Q(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jQ >= ((Integer) r1.f2492c.zzd(zzbix.zzml)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzac, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzU(zzdry zzdryVar) {
        Iterator<String> itKeys;
        View view;
        zzbar zzbarVarZzb;
        try {
            if (!this.zzp) {
                this.zzo = zzdryVar;
                this.zzg.zza(zzdryVar);
                this.zzf.zza(zzdryVar.zzdF(), zzdryVar.zzj(), zzdryVar.zzk(), zzdryVar, zzdryVar);
                zzbio zzbioVar = zzbix.zzdE;
                C0395s c0395s = C0395s.f2489e;
                if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (zzbarVarZzb = this.zzu.zzb()) != null) {
                    zzbarVarZzb.zzh(zzdryVar.zzdF());
                }
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzcA)).booleanValue()) {
                    zzfkn zzfknVar = this.zzb;
                    if (zzfknVar.zzak && (itKeys = zzfknVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdry zzdryVar2 = this.zzo;
                            WeakReference weakReference = zzdryVar2 == null ? null : (WeakReference) zzdryVar2.zzi().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzbez zzbezVar = new zzbez(this.zzw, view);
                                this.zzA.add(zzbezVar);
                                zzbezVar.zza(new zzdpl(this, next));
                            }
                        }
                    }
                }
                if (zzdryVar.zzg() != null) {
                    zzdryVar.zzg().zza(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzad, reason: merged with bridge method [inline-methods] */
    public final void zzV(zzdry zzdryVar) {
        this.zzf.zzb(zzdryVar.zzdF(), zzdryVar.zzi());
        if (zzdryVar.zzdA() != null) {
            zzdryVar.zzdA().setClickable(false);
            zzdryVar.zzdA().removeAllViews();
        }
        if (zzdryVar.zzg() != null) {
            zzdryVar.zzg().zzb(this.zzt);
        }
        this.zzo = null;
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzc(this.zzo);
        this.zzf.zzw(view, map, map2, zzah());
        this.zzq = true;
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        View viewZzag;
        if (!this.zzr && (viewZzag = zzag(map)) != null) {
            zzbio zzbioVar = zzbix.zzpo;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzag.getGlobalVisibleRect(rect, new Point()) && viewZzag.getHeight() == rect.height() && viewZzag.getWidth() == rect.width()) {
                    this.zzf.zzx(view, map, map2, zzah());
                    this.zzr = true;
                }
            } else if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzpp)).booleanValue()) {
                zzbio zzbioVar2 = zzbix.zzpq;
                if (((Float) c0395s.f2492c.zzd(zzbioVar2)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) c0395s.f2492c.zzd(zzbioVar2)).floatValue();
                    if (viewZzag.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r4.height() * r4.width() >= viewZzag.getHeight() * viewZzag.getWidth() * (dFloatValue / 100.0d)) {
                            this.zzf.zzx(view, map, map2, zzah());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzI(viewZzag)) {
                this.zzf.zzx(view, map, map2, zzah());
                this.zzr = true;
            }
        }
    }

    private final synchronized View zzag(Map map) {
        if (map != null) {
            zzgwt zzgwtVar = zzc;
            int size = zzgwtVar.size();
            int i5 = 0;
            while (i5 < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzgwtVar.get(i5));
                i5++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzah() {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar == null) {
            int i5 = G6.L.f4523b;
            H6.l.a("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        InterfaceC3876a interfaceC3876aZzn = zzdryVar.zzn();
        if (interfaceC3876aZzn != null) {
            return (ImageView.ScaleType) BinderC3877b.S(interfaceC3876aZzn);
        }
        return zzdra.zza;
    }

    private final void zzai(String str, boolean z2) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgx)).booleanValue()) {
            zzL("Google", true);
            return;
        }
        p8.p pVarZzX = this.zze.zzX();
        if (pVarZzX == null) {
            return;
        }
        zzhcf.zzr(pVarZzX, new zzdpm(this, "Google", true), this.zzd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaj, reason: merged with bridge method [inline-methods] */
    public final void zzY(View view, zzelv zzelvVar) {
        zzclb zzclbVarZzW = this.zze.zzW();
        if (!this.zzh.zzd() || zzelvVar == null || zzclbVarZzW == null || view == null) {
            return;
        }
        C6.n.f1857D.f1884y.zzh(zzelvVar.zza(), view);
    }

    public final synchronized void zzA(InterfaceC0396s0 interfaceC0396s0) {
        this.zzf.zzr(interfaceC0396s0);
    }

    public final synchronized void zzB(InterfaceC0391p0 interfaceC0391p0) {
        this.zzf.zzs(interfaceC0391p0);
    }

    public final synchronized void zzC() {
        this.zzf.zzg();
    }

    public final synchronized void zzD() {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar == null) {
            int i5 = G6.L.f4523b;
            H6.l.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z2 = zzdryVar instanceof zzdqu;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzW(z2);
                }
            });
        }
    }

    public final synchronized void zzE(final View view, final int i5) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zznj)).booleanValue()) {
            zzdry zzdryVar = this.zzo;
            if (zzdryVar == null) {
                int i10 = G6.L.f4523b;
                H6.l.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z2 = zzdryVar instanceof zzdqu;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdps
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzX(view, z2, i5);
                    }
                });
            }
        }
    }

    public final synchronized boolean zzF() {
        return this.zzf.zzh();
    }

    public final synchronized int zzG() {
        return this.zzf.zzu();
    }

    public final synchronized boolean zzH() {
        return this.zzf.zzv();
    }

    public final boolean zzJ() {
        return this.zzh.zzc();
    }

    public final String zzK() {
        return this.zzh.zzf();
    }

    public final zzelv zzL(String str, boolean z2) {
        boolean z10;
        boolean z11;
        String str2;
        zzelr zzelrVar;
        zzels zzelsVar;
        zzdqg zzdqgVar = this.zzh;
        if (zzdqgVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdqb zzdqbVar = this.zze;
            zzclb zzclbVarZzW = zzdqbVar.zzW();
            zzclb zzclbVarZzT = zzdqbVar.zzT();
            if (zzclbVarZzW == null && zzclbVarZzT == null) {
                int i5 = G6.L.f4523b;
                H6.l.f("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdqgVar.zzg();
            int iZzc = zzdqgVar.zzg().zzc();
            int i10 = iZzc - 1;
            if (i10 != 0) {
                if (i10 != 1) {
                    String str3 = iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO";
                    String strT = M6.t(new StringBuilder(str3.length() + 49), "Unknown omid media type: ", str3, ". Not initializing Omid.");
                    int i11 = G6.L.f4523b;
                    H6.l.f(strT);
                    return null;
                }
                if (zzclbVarZzW == null) {
                    int i12 = G6.L.f4523b;
                    H6.l.f("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z10 = true;
            } else if (zzclbVarZzT != null) {
                z10 = false;
                z11 = true;
            } else {
                int i13 = G6.L.f4523b;
                H6.l.f("Omid media type was video but there was no video webview.");
            }
            if (z10) {
                str2 = null;
            } else if (z11) {
                str2 = "javascript";
                zzclbVarZzW = zzclbVarZzT;
            } else {
                zzclbVarZzW = null;
                str2 = null;
            }
            if (zzclbVarZzW == null) {
                int i14 = G6.L.f4523b;
                H6.l.f("Webview is null in InternalNativeAd");
                return null;
            }
            Context context = this.zzw;
            C6.n nVar = C6.n.f1857D;
            if (!nVar.f1884y.zza(context)) {
                int i15 = G6.L.f4523b;
                H6.l.f("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            H6.a aVar = this.zzv;
            int i16 = aVar.f4928b;
            int iF = AbstractC0279p0.f(i16, 1);
            int i17 = aVar.f4929c;
            StringBuilder sb2 = new StringBuilder(iF + String.valueOf(i17).length());
            sb2.append(i16);
            sb2.append(".");
            sb2.append(i17);
            String string = sb2.toString();
            if (z11) {
                zzelrVar = zzelr.VIDEO;
                zzelsVar = zzels.DEFINED_BY_JAVASCRIPT;
            } else {
                zzelrVar = zzelr.NATIVE_DISPLAY;
                zzelsVar = zzdqbVar.zzx() == 3 ? zzels.UNSPECIFIED : zzels.ONE_PIXEL;
            }
            zzelv zzelvVarZzd = nVar.f1884y.zzd(string, zzclbVarZzW.zzD(), "", "javascript", str2, str, zzelsVar, zzelrVar, this.zzb.zzal);
            if (zzelvVarZzd == null) {
                int i18 = G6.L.f4523b;
                H6.l.f("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdqbVar.zzq(zzelvVarZzd);
            zzclbVarZzW.zzak(zzelvVarZzd);
            zzelp zzelpVar = nVar.f1884y;
            if (z11) {
                zzfuu zzfuuVarZza = zzelvVarZzd.zza();
                if (zzclbVarZzT != null) {
                    zzelpVar.zzh(zzfuuVarZza, zzclbVarZzT.zzE());
                }
                this.zzs = true;
            }
            if (z2) {
                zzelpVar.zze(zzelvVarZzd.zza());
                zzclbVarZzW.zze("onSdkLoaded", new C4412e(0));
            }
            return zzelvVarZzd;
        }
        return null;
    }

    public final boolean zzM() {
        return this.zzh.zzd();
    }

    public final void zzN(View view) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgx)).booleanValue()) {
            zzdqb zzdqbVar = this.zze;
            if (zzdqbVar.zzx() != 3) {
                zzcgd zzcgdVarZzY = zzdqbVar.zzY();
                if (zzcgdVarZzY == null) {
                    return;
                }
                zzhcf.zzr(zzcgdVarZzY, new zzdpn(this, view), this.zzd);
                return;
            }
        }
        zzY(view, this.zze.zzZ());
    }

    public final void zzO(View view) {
        zzelv zzelvVarZzZ = this.zze.zzZ();
        if (!this.zzh.zzd() || zzelvVarZzZ == null || view == null) {
            return;
        }
        C6.n.f1857D.f1884y.zzg(zzelvVarZzZ.zza(), view);
    }

    public final zzdpy zzP() {
        return this.zzx;
    }

    public final synchronized void zzQ(A0 a02) {
        this.zzy.zza(a02);
    }

    public final void zzR(Bundle bundle) throws JSONException {
        final zzclb zzclbVarZzT = this.zze.zzT();
        if (zzclbVarZzT == null) {
            int i5 = G6.L.f4523b;
            H6.l.c("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzgwt zzgwtVar = zzdpw.zzc;
                    zzclbVarZzT.zzd("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e7) {
            int i10 = G6.L.f4523b;
            H6.l.d("Error reading event signals", e7);
        }
    }

    public final /* synthetic */ void zzS() {
        try {
            zzdqb zzdqbVar = this.zze;
            int iZzx = zzdqbVar.zzx();
            if (iZzx == 1) {
                zzbnj zzbnjVarZza = this.zzi.zza();
                if (zzbnjVarZza != null) {
                    zzai("Google", true);
                    zzbnjVarZza.zze((zzbmz) this.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 2) {
                zzbng zzbngVarZzb = this.zzi.zzb();
                if (zzbngVarZzb != null) {
                    zzai("Google", true);
                    zzbngVarZzb.zze((zzbmx) this.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 3) {
                zzbnp zzbnpVarZzf = this.zzi.zzf(zzdqbVar.zzS());
                if (zzbnpVarZzf != null) {
                    if (zzdqbVar.zzT() != null) {
                        zzL("Google", true);
                    }
                    zzbnpVarZzf.zze((zzbnc) this.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzx == 6) {
                zzbnw zzbnwVarZzc = this.zzi.zzc();
                if (zzbnwVarZzc != null) {
                    zzai("Google", true);
                    zzbnwVarZzc.zze((zzboc) this.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzx != 7) {
                int i5 = G6.L.f4523b;
                H6.l.c("Wrong native template id!");
            } else {
                zzbsr zzbsrVarZze = this.zzi.zze();
                if (zzbsrVarZze != null) {
                    zzbsrVarZze.zze((zzbsl) this.zzm.zzb());
                }
            }
        } catch (RemoteException e7) {
            int i10 = G6.L.f4523b;
            H6.l.d("RemoteException when notifyAdLoad is called", e7);
        }
    }

    public final /* synthetic */ void zzT() {
        this.zzf.zzA();
        this.zze.zzae();
    }

    public final /* synthetic */ void zzW(boolean z2) {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar != null) {
            this.zzf.zzf(null, zzdryVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z2, zzah(), 0);
        } else {
            int i5 = G6.L.f4523b;
            H6.l.a("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public final /* synthetic */ void zzX(View view, boolean z2, int i5) {
        zzdry zzdryVar = this.zzo;
        if (zzdryVar != null) {
            this.zzf.zzf(view, zzdryVar.zzdF(), this.zzo.zzi(), this.zzo.zzj(), z2, zzah(), i5);
        } else {
            int i10 = G6.L.f4523b;
            H6.l.a("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public final /* synthetic */ zzdqb zzZ() {
        return this.zze;
    }

    public final synchronized void zza(String str) {
        this.zzf.zzd(str);
    }

    public final /* synthetic */ zzdry zzaa() {
        return this.zzo;
    }

    public final /* synthetic */ Map zzab() {
        return this.zzz;
    }

    public final synchronized void zzb() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzn();
    }

    public final synchronized void zzc(Bundle bundle) {
        this.zzf.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final synchronized void zzd() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzT();
            }
        });
        super.zzd();
    }

    public final synchronized boolean zze(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzz = this.zzf.zzz(bundle);
        this.zzq = zZzz;
        return zZzz;
    }

    public final synchronized void zzf(Bundle bundle) {
        this.zzf.zzk(bundle);
    }

    public final synchronized void zzg(final zzdry zzdryVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcy)).booleanValue()) {
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpp
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzU(zzdryVar);
                }
            });
        } else {
            zzU(zzdryVar);
        }
    }

    public final synchronized void zzh(final zzdry zzdryVar) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzcy)).booleanValue()) {
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzV(zzdryVar);
                }
            });
        } else {
            zzV(zzdryVar);
        }
    }

    public final synchronized void zzi(View view, View view2, Map map, Map map2, boolean z2) {
        zzclb zzclbVarZzT;
        this.zzg.zzb(this.zzo);
        this.zzf.zzc(view, view2, map, map2, z2, zzah());
        if (this.zzs) {
            zzdqb zzdqbVar = this.zze;
            if (zzdqbVar.zzT() != null && (zzclbVarZzT = zzdqbVar.zzT()) != null) {
                zzclbVarZzT.zze("onSdkAdUserInteractionClick", new C4412e(0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcya
    public final void zzj() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzS();
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzx() != 7) {
            final zzdqj zzdqjVar = this.zzf;
            Objects.requireNonNull(zzdqjVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdpv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzdqjVar.zzy();
                }
            });
        }
        super.zzj();
    }

    public final synchronized void zzk(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzj(view, motionEvent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzu(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbio r0 = com.google.android.gms.internal.ads.zzbix.zzcA     // Catch: java.lang.Throwable -> La
            D6.s r1 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzd(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfkn r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbio r7 = com.google.android.gms.internal.ads.zzbix.zzeU     // Catch: java.lang.Throwable -> La
            D6.s r0 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbiv r0 = r0.f2492c     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzd(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzI(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzaf(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdpw.zzu(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized JSONObject zzv(View view, Map map, Map map2) {
        return this.zzf.zzl(view, map, map2, zzah());
    }

    public final synchronized JSONObject zzw(View view, Map map, Map map2) {
        return this.zzf.zzm(view, map, map2, zzah());
    }

    public final synchronized void zzx(View view) {
        this.zzf.zzo(view);
    }

    public final synchronized void zzy(zzbnz zzbnzVar) {
        this.zzf.zzp(zzbnzVar);
    }

    public final synchronized void zzz() {
        this.zzf.zzq();
    }
}
