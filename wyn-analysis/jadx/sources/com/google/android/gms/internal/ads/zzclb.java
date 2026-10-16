package com.google.android.gms.internal.ads;

import D6.InterfaceC0358a;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import n7.InterfaceC3600e;

/* loaded from: classes3.dex */
public interface zzclb extends InterfaceC0358a, zzdlg, zzcks, zzbst, zzcmi, zzcmn, zzbtf, zzbex, zzcmr, C6.h, zzcmu, zzcmv, zzchu, zzcmw {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i5, int i10);

    @Override // D6.InterfaceC0358a
    /* synthetic */ void onAdClicked();

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzchu
    void setBackgroundColor(int i5);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcks
    zzfkn zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzcmw
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i5);

    void zzI();

    void zzJ();

    Context zzK();

    F6.l zzL();

    F6.l zzM();

    @Override // com.google.android.gms.internal.ads.zzcmt
    zzcnl zzN();

    String zzO();

    zzcmz zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcmu
    zzbaw zzS();

    zzflk zzT();

    zzelv zzU();

    zzelt zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z2, int i5);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcmi
    zzfkq zzaC();

    void zzaD(zzfkn zzfknVar, zzfkq zzfkqVar);

    void zzaE(boolean z2, int i5);

    p8.p zzaF();

    void zzaG(boolean z2);

    boolean zzaa();

    void zzab(String str, zzbpx zzbpxVar);

    void zzac(String str, zzbpx zzbpxVar);

    void zzad(String str, InterfaceC3600e interfaceC3600e);

    void zzae(F6.l lVar);

    void zzaf(zzcnl zzcnlVar);

    void zzag(boolean z2);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z2);

    void zzak(zzelv zzelvVar);

    void zzal(zzelt zzeltVar);

    void zzam(int i5);

    void zzan(F6.l lVar);

    void zzao(boolean z2);

    void zzap();

    void zzaq(zzbly zzblyVar);

    zzbly zzar();

    void zzas(boolean z2);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z2);

    void zzax(zzblv zzblvVar);

    void zzay(zzbgk zzbgkVar);

    zzbgk zzaz();

    @Override // C6.h
    /* synthetic */ void zzdk();

    @Override // C6.h
    /* synthetic */ void zzdl();

    @Override // com.google.android.gms.internal.ads.zzchu
    zzcmh zzh();

    @Override // com.google.android.gms.internal.ads.zzcmn, com.google.android.gms.internal.ads.zzchu
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzchu
    C6.a zzk();

    @Override // com.google.android.gms.internal.ads.zzchu
    zzbjk zzq();

    @Override // com.google.android.gms.internal.ads.zzcmv, com.google.android.gms.internal.ads.zzchu
    H6.a zzs();

    @Override // com.google.android.gms.internal.ads.zzchu
    void zzt(String str, zzcjh zzcjhVar);

    @Override // com.google.android.gms.internal.ads.zzchu
    void zzw(zzcmh zzcmhVar);
}
