package com.google.android.gms.internal.ads;

import D6.C0392q;
import D6.L0;
import D6.v1;
import D6.x1;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x6.C4470a;

/* loaded from: classes3.dex */
public final class zzbxv extends zzbxh {
    private final RtbAdapter zza;
    private J6.k zzb;
    private J6.p zzc;
    private J6.f zzd;
    private String zze = "";

    public zzbxv(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(v1 v1Var) {
        Bundle bundle;
        Bundle bundle2 = v1Var.f2515m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        H6.l.f("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e7) {
            H6.l.d("", e7);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(v1 v1Var) {
        if (v1Var.f2509f) {
            return true;
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        return H6.f.t();
    }

    private static final String zzy(String str, v1 v1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return v1Var.f2523u;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbxi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(q7.InterfaceC3876a r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, D6.x1 r9, com.google.android.gms.internal.ads.zzbxl r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzbxt r7 = new com.google.android.gms.internal.ads.zzbxt     // Catch: java.lang.Throwable -> L77
            r7.<init>(r4, r10)     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r8 = r4.zza     // Catch: java.lang.Throwable -> L77
            wa.a r10 = new wa.a     // Catch: java.lang.Throwable -> L77
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L77
            switch(r0) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r0 = "rewarded_interstitial"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r0 = "app_open_ad"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r0 = "app_open"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r0 = "interstitial"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r0 = "rewarded"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r0 = "native"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r0 = "banner"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L79;
                case 1: goto L79;
                case 2: goto L79;
                case 3: goto L79;
                case 4: goto L79;
                case 5: goto L79;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6f
        L5c:
            com.google.android.gms.internal.ads.zzbio r6 = com.google.android.gms.internal.ads.zzbix.zznz     // Catch: java.lang.Throwable -> L77
            D6.s r0 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.internal.ads.zzbiv r0 = r0.f2492c     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r0.zzd(r6)     // Catch: java.lang.Throwable -> L77
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L77
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L6f
            goto L79
        L6f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L77
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r6 = move-exception
            goto La0
        L79:
            r6 = 20
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L77
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L77
            r6.<init>()     // Catch: java.lang.Throwable -> L77
            r6.add(r10)     // Catch: java.lang.Throwable -> L77
            L6.a r10 = new L6.a     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = q7.BinderC3877b.S(r5)     // Catch: java.lang.Throwable -> L77
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L77
            int r1 = r9.f2534e     // Catch: java.lang.Throwable -> L77
            int r2 = r9.f2531b     // Catch: java.lang.Throwable -> L77
            java.lang.String r9 = r9.f2530a     // Catch: java.lang.Throwable -> L77
            com.google.android.gms.ads.AdSize r3 = new com.google.android.gms.ads.AdSize     // Catch: java.lang.Throwable -> L77
            r3.<init>(r1, r2, r9)     // Catch: java.lang.Throwable -> L77
            r10.<init>(r0, r6)     // Catch: java.lang.Throwable -> L77
            r8.collectSignals(r10, r7)     // Catch: java.lang.Throwable -> L77
            return
        La0:
            java.lang.String r7 = "Error generating signals for RTB"
            H6.l.d(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.zzbvg.zza(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxv.zze(q7.a, java.lang.String, android.os.Bundle, android.os.Bundle, D6.x1, com.google.android.gms.internal.ads.zzbxl):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzf() throws RemoteException {
        return zzbxx.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final zzbxx zzg() throws RemoteException {
        return zzbxx.zza(this.zza.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final L0 zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzi(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbww zzbwwVar, zzbvp zzbvpVar, x1 x1Var) throws RemoteException {
        try {
            zzbxn zzbxnVar = new zzbxn(this, zzbwwVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            new AdSize(x1Var.f2534e, x1Var.f2531b, x1Var.f2530a);
            rtbAdapter.loadRtbBannerAd(new J6.h(context), zzbxnVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render banner ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzj(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbwz zzbwzVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxp zzbxpVar = new zzbxp(this, zzbwzVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            rtbAdapter.loadRtbInterstitialAd(new J6.l(context), zzbxpVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render interstitial ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzk(InterfaceC3876a interfaceC3876a) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzl(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxu zzbxuVar = new zzbxu(this, zzbxfVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            rtbAdapter.loadRtbRewardedAd(new J6.q(context), zzbxuVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render rewarded ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzm(InterfaceC3876a interfaceC3876a) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzn(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxc zzbxcVar, zzbvp zzbvpVar) throws RemoteException {
        zzr(str, str2, v1Var, interfaceC3876a, zzbxcVar, zzbvpVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzo(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzp(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxf zzbxfVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxu zzbxuVar = new zzbxu(this, zzbxfVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            rtbAdapter.loadRtbRewardedInterstitialAd(new J6.q(context), zzbxuVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render rewarded interstitial ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzq(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbww zzbwwVar, zzbvp zzbvpVar, x1 x1Var) throws RemoteException {
        try {
            zzbxo zzbxoVar = new zzbxo(this, zzbwwVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            new AdSize(x1Var.f2534e, x1Var.f2531b, x1Var.f2530a);
            zzbxoVar.onFailure(new C4470a(7, rtbAdapter.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN, null));
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render interscroller ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzr(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbxc zzbxcVar, zzbvp zzbvpVar, zzbma zzbmaVar) throws RemoteException {
        try {
            zzbxq zzbxqVar = new zzbxq(this, zzbxcVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            rtbAdapter.loadRtbNativeAdMapper(new J6.n(context), zzbxqVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render native ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                zzbxr zzbxrVar = new zzbxr(this, zzbxcVar, zzbvpVar);
                RtbAdapter rtbAdapter2 = this.zza;
                Context context2 = (Context) BinderC3877b.S(interfaceC3876a);
                zzw(str2);
                zzv(v1Var);
                zzx(v1Var);
                Location location2 = v1Var.k;
                zzy(str2, v1Var);
                rtbAdapter2.loadRtbNativeAd(new J6.n(context2), zzbxrVar);
            } catch (Throwable th2) {
                H6.l.d("Adapter failed to render native ad.", th2);
                zzbvg.zza(interfaceC3876a, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final void zzs(String str, String str2, v1 v1Var, InterfaceC3876a interfaceC3876a, zzbwt zzbwtVar, zzbvp zzbvpVar) throws RemoteException {
        try {
            zzbxs zzbxsVar = new zzbxs(this, zzbwtVar, zzbvpVar);
            RtbAdapter rtbAdapter = this.zza;
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzw(str2);
            zzv(v1Var);
            zzx(v1Var);
            Location location = v1Var.k;
            zzy(str2, v1Var);
            rtbAdapter.loadRtbAppOpenAd(new J6.g(context), zzbxsVar);
        } catch (Throwable th) {
            H6.l.d("Adapter failed to render app open ad.", th);
            zzbvg.zza(interfaceC3876a, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxi
    public final boolean zzt(InterfaceC3876a interfaceC3876a) throws RemoteException {
        return false;
    }

    public final /* synthetic */ void zzc(J6.k kVar) {
    }

    public final /* synthetic */ void zzd(J6.p pVar) {
    }

    public final /* synthetic */ void zzu(J6.f fVar) {
    }
}
