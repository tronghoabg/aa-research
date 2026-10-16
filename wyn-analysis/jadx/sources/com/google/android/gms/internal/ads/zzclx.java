package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.wynauto.wyn.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import n7.InterfaceC3600e;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzclx extends FrameLayout implements zzclb {
    private final zzclb zza;
    private final zzchj zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzclx(zzclb zzclbVar, zzdzt zzdztVar) {
        super(zzclbVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzclbVar;
        this.zzb = new zzchj(zzclbVar.zzK(), this, this, zzdztVar);
        addView((View) zzclbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void destroy() {
        final zzelt zzeltVarZzV;
        final zzelv zzelvVarZzU = zzU();
        if (zzelvVarZzU != null) {
            G6.M m10 = U.f4562l;
            m10.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclw
                @Override // java.lang.Runnable
                public final void run() {
                    C6.n.f1857D.f1884y.zzf(zzelvVarZzU.zza());
                }
            });
            final zzclb zzclbVar = this.zza;
            Objects.requireNonNull(zzclbVar);
            m10.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclbVar.destroy();
                }
            }, ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgr)).intValue());
            return;
        }
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgt)).booleanValue() || (zzeltVarZzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclu
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzclx zzclxVar = this.zza;
                    zzeltVarZzV.zze(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzclv
                        @Override // com.google.android.gms.internal.ads.zzfvf
                        public final /* synthetic */ void zza(boolean z2) {
                            zzclxVar.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, D6.InterfaceC0358a
    public final void onAdClicked() {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzclb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzA(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzB(int i5) {
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcks
    public final zzfkn zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmw
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzH(int i5) {
        this.zza.zzH(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final F6.l zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final F6.l zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmt
    public final zzcnl zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzcmz zzP() {
        return ((zzcme) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmu
    public final zzbaw zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzflk zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzelv zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzelt zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zza(String str) {
        ((zzcme) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzaA(boolean z2, int i5) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzbC)).booleanValue()) {
            return false;
        }
        zzclb zzclbVar = this.zza;
        if (zzclbVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzclbVar.getParent()).removeView((View) zzclbVar);
        }
        zzclbVar.zzaA(z2, i5);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmi
    public final zzfkq zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaD(zzfkn zzfknVar, zzfkq zzfkqVar) {
        this.zza.zzaD(zzfknVar, zzfkqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaE(boolean z2, int i5) {
        this.zza.zzaE(z2, i5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final p8.p zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaG(boolean z2) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaH(F6.e eVar, boolean z2, boolean z10, String str) {
        this.zza.zzaH(eVar, z2, z10, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaI(boolean z2, int i5, boolean z10) {
        this.zza.zzaI(z2, i5, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaJ(boolean z2, int i5, String str, boolean z10, boolean z11) {
        this.zza.zzaJ(z2, i5, str, z10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaK(boolean z2, int i5, String str, String str2, boolean z10) {
        this.zza.zzaK(z2, i5, str, str2, z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcmr
    public final void zzaL(String str, String str2, int i5) {
        this.zza.zzaL(str, str2, 14);
    }

    public final /* synthetic */ void zzaM(boolean z2) {
        final zzclb zzclbVar = this.zza;
        G6.M m10 = U.f4562l;
        Objects.requireNonNull(zzclbVar);
        m10.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcls
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzclbVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzab(String str, zzbpx zzbpxVar) {
        this.zza.zzab(str, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzac(String str, zzbpx zzbpxVar) {
        this.zza.zzac(str, zzbpxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzad(String str, InterfaceC3600e interfaceC3600e) {
        this.zza.zzad(str, interfaceC3600e);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzae(F6.l lVar) {
        this.zza.zzae(lVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaf(zzcnl zzcnlVar) {
        this.zza.zzaf(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzag(boolean z2) {
        this.zza.zzag(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaj(boolean z2) {
        this.zza.zzaj(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzak(zzelv zzelvVar) {
        this.zza.zzak(zzelvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzal(zzelt zzeltVar) {
        this.zza.zzal(zzeltVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzam(int i5) {
        this.zza.zzam(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzan(F6.l lVar) {
        this.zza.zzan(lVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzao(boolean z2) {
        this.zza.zzao(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaq(zzbly zzblyVar) {
        this.zza.zzaq(zzblyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzbly zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzas(boolean z2) {
        this.zza.zzas(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzav() {
        zzelv zzelvVarZzU;
        zzelt zzeltVarZzV;
        TextView textView = new TextView(getContext());
        C6.n nVar = C6.n.f1857D;
        U u10 = nVar.f1863c;
        Resources resourcesZzg = nVar.f1868h.zzg();
        textView.setText(resourcesZzg != null ? resourcesZzg.getString(R.string.f33917s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        zzbio zzbioVar = zzbix.zzgt;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && (zzeltVarZzV = zzV()) != null) {
            zzeltVarZzV.zzf(textView);
        } else if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgs)).booleanValue() && (zzelvVarZzU = zzU()) != null && zzelvVarZzU.zzb()) {
            nVar.f1884y.zzg(zzelvVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzaw(boolean z2) {
        this.zza.zzaw(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzax(zzblv zzblvVar) {
        this.zza.zzax(zzblvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final void zzay(zzbgk zzbgkVar) {
        this.zza.zzay(zzbgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb
    public final zzbgk zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcme) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdR() {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbex
    public final void zzdj(zzbew zzbewVar) {
        this.zza.zzdj(zzbewVar);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, C6.h
    public final void zzdk() {
        this.zza.zzdk();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, C6.h
    public final void zzdl() {
        this.zza.zzdl();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzchj zzdm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzdn(boolean z2) {
        this.zza.zzdn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zzdu() {
        zzclb zzclbVar = this.zza;
        if (zzclbVar != null) {
            zzclbVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbst
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final zzcmh zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzbjj zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final C6.a zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzo(int i5) {
        this.zza.zzo(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final zzbjk zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final zzcjh zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    public final H6.a zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final void zzt(String str, zzcjh zzcjhVar) {
        this.zza.zzt(str, zzcjhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzu(boolean z2, long j8) {
        this.zza.zzu(z2, j8);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzv(int i5) {
        this.zzb.zzg(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzclb, com.google.android.gms.internal.ads.zzchu
    public final void zzw(zzcmh zzcmhVar) {
        this.zza.zzw(zzcmhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final int zzx() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeT)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final int zzy() {
        return ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzeT)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzchu
    public final void zzz() {
        this.zza.zzz();
    }
}
