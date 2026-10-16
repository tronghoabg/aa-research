package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.SystemClock;
import android.webkit.WebView;
import androidx.webkit.ProfileStore;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.InvocationTargetException;
import x3.AbstractC4467j;
import x3.InterfaceC4459b;
import y3.AbstractC4557o;

/* loaded from: classes3.dex */
public final class zzcna {
    private InterfaceC4459b zza = null;

    public final void zza(WebView webView) {
        if (this.zza != null) {
            try {
                boolean z2 = AbstractC4467j.f47677a;
                if (!AbstractC4557o.f48015j.b()) {
                    throw AbstractC4557o.a();
                }
                AbstractC4467j.c(webView).f48020a.setProfile("GMA_WEBVIEW_PROFILE");
                G6.L.k("WebViewCompat Profile is defined");
            } catch (IllegalStateException e7) {
                String strConcat = "WebViewCompat error: ".concat(e7.toString());
                int i5 = G6.L.f4523b;
                H6.l.f(strConcat);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpJ)).booleanValue()) {
                    C6.n.f1857D.f1868h.zzh(e7, "WebViewCompat.setProfile");
                }
            }
        }
    }

    public final void zzb(zzcne zzcneVar) {
        ProfileStore profileStore;
        if (!com.moloco.sdk.internal.publisher.H.b0("MULTI_PROFILE")) {
            int i5 = G6.L.f4523b;
            H6.l.a("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzgbc.zza("androidx.webkit.ProfileStore", Constants.GET_INSTANCE, new zzgbb[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e7) {
            String strValueOf = String.valueOf(e7.getMessage());
            int i10 = G6.L.f4523b;
            H6.l.a("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzgbc.zza("androidx.webkit.ProfileStore$-CC", Constants.GET_INSTANCE, new zzgbb[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e10) {
                H6.l.a("Unable to get ProfileStore instance: ".concat(String.valueOf(e10.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore == null) {
            int i11 = G6.L.f4523b;
            H6.l.f("WebViewCompat failure: No instance");
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpI)).booleanValue()) {
                zzdzs zzdzsVarZza = zzcneVar.zzb.zzd().zza();
                zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_p_f");
                zzdzsVarZza.zzc("webview_p_f", "No instance");
                zzdzsVarZza.zzd();
                return;
            }
            return;
        }
        this.zza = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpI)).booleanValue()) {
            C6.n.f1857D.k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - zzcneVar.zza;
            zzdzs zzdzsVarZza2 = zzcneVar.zzb.zzd().zza();
            zzdzsVarZza2.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "webview_p_l");
            zzdzsVarZza2.zzc("webview_p_l", Long.toString(jElapsedRealtime));
            zzdzsVarZza2.zzd();
        }
    }
}
