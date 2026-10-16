package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.C0395s;
import D6.x1;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import cb.AbstractC1593a;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzdrw {
    private final zzdwq zza;
    private final zzdvf zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdrw(zzdwq zzdwqVar, zzdvf zzdvfVar) {
        this.zza = zzdwqVar;
        this.zzb = zzdvfVar;
    }

    private static final int zzf(Context context, String str, int i5) throws NumberFormatException {
        try {
            i5 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        return H6.f.b(context, i5);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzclq {
        zzclb zzclbVarZza = this.zza.zza(x1.V(), null, null);
        zzclbVarZza.zzE().setVisibility(4);
        zzclbVarZza.zzE().setContentDescription("policy_validator");
        zzclbVarZza.zzab("/sendMessageToSdk", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrv
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzclb) obj, map);
            }
        });
        zzclbVarZza.zzab("/hideValidatorOverlay", new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrq
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzclb) obj, map);
            }
        });
        zzclbVarZza.zzab("/open", new zzbqk(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzclbVarZza);
        zzbpx zzbpxVar = new zzbpx() { // from class: com.google.android.gms.internal.ads.zzdrr
            @Override // com.google.android.gms.internal.ads.zzbpx
            public final /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
                this.zza.zzd(view, windowManager, (zzclb) obj, map);
            }
        };
        zzdvf zzdvfVar = this.zzb;
        zzdvfVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbpxVar);
        zzdvfVar.zzh(new WeakReference(zzclbVarZza), "/showValidatorOverlay", zzdrs.zza);
        return zzclbVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzclb zzclbVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzclb zzclbVar, Map map) {
        int i5 = G6.L.f4523b;
        H6.l.a("Hide native ad policy validator overlay.");
        zzclbVar.zzE().setVisibility(8);
        if (zzclbVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzclbVar.zzE());
        }
        zzclbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final void zzd(final View view, final WindowManager windowManager, final zzclb zzclbVar, final Map map) throws NumberFormatException {
        zzclbVar.zzP().zzG(new zzcmx() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // com.google.android.gms.internal.ads.zzcmx
            public final /* synthetic */ void zza(boolean z2, int i5, String str, String str2) {
                this.zza.zze(map, z2, i5, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        String str = (String) map.get("validator_width");
        zzbio zzbioVar = zzbix.zzjw;
        C0395s c0395s = C0395s.f2489e;
        int iZzf = zzf(context, str, ((Integer) c0395s.f2492c.zzd(zzbioVar)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) c0395s.f2492c.zzd(zzbix.zzjx)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzclbVar.zzaf(zzcnl.zzc(iZzf, iZzf2));
        try {
            zzclbVar.zzD().getSettings().setUseWideViewPort(((Boolean) c0395s.f2492c.zzd(zzbix.zzjy)).booleanValue());
            zzclbVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) c0395s.f2492c.zzd(zzbix.zzjz)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsW = Fe.g.W();
        layoutParamsW.x = iZzf3;
        layoutParamsW.y = iZzf4;
        windowManager.updateViewLayout(zzclbVar.zzE(), layoutParamsW);
        final String str2 = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i5 = ((UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str2) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str2)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdrt
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzclb zzclbVar2 = zzclbVar;
                        if (zzclbVar2.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i10 = i5;
                        WindowManager.LayoutParams layoutParams = layoutParamsW;
                        String str3 = str2;
                        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(str3) || CommonGetHeaderBiddingToken.HB_TOKEN_VERSION.equals(str3)) {
                            layoutParams.y = rect2.bottom - i10;
                        } else {
                            layoutParams.y = rect2.top - i10;
                        }
                        windowManager.updateViewLayout(zzclbVar2.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str3 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        zzclbVar.loadUrl(str3);
    }

    public final /* synthetic */ void zze(Map map, boolean z2, int i5, String str, String str2) {
        HashMap mapL = AbstractC1593a.l("messageType", "validatorHtmlLoaded");
        mapL.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", mapL);
    }
}
