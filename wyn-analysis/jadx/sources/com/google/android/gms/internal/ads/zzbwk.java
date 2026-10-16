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
import android.view.View;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import j$.util.Objects;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ka.AbstractC3256n;
import org.json.JSONException;
import org.json.JSONObject;
import q7.BinderC3877b;
import q7.InterfaceC3876a;
import x6.C4470a;

/* loaded from: classes3.dex */
public final class zzbwk extends zzbvl {
    private final Object zza;
    private zzbwm zzb;
    private zzcch zzc;
    private InterfaceC3876a zzd;
    private View zze;
    private J6.k zzf;
    private J6.t zzg;
    private J6.r zzh;
    private J6.p zzi;
    private J6.j zzj;
    private J6.f zzk;
    private final String zzl = "";

    public zzbwk(J6.a aVar) {
        this.zza = aVar;
    }

    private final Bundle zzV(String str, v1 v1Var, String str2) throws RemoteException {
        H6.l.a("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.zza instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (v1Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", v1Var.f2510g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            H6.l.d("", th);
            throw new RemoteException();
        }
    }

    private final Bundle zzW(v1 v1Var) {
        Bundle bundle;
        Bundle bundle2 = v1Var.f2515m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final boolean zzX(v1 v1Var) {
        if (v1Var.f2509f) {
            return true;
        }
        H6.f fVar = C0392q.f2477g.f2478a;
        return H6.f.t();
    }

    private static final String zzY(String str, v1 v1Var) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return v1Var.f2523u;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzA(boolean z2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                ((AbstractAdViewAdapter) obj).onImmersiveModeUpdated(z2);
                return;
            } catch (Throwable th) {
                H6.l.d("", th);
                return;
            }
        }
        String canonicalName = AbstractAdViewAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.a(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final L0 zzB() {
        Object obj = this.zza;
        if (obj instanceof AbstractAdViewAdapter) {
            try {
                return ((AbstractAdViewAdapter) obj).getVideoController();
            } catch (Throwable th) {
                H6.l.d("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvy zzC() {
        J6.t tVar;
        J6.t tVarZzb;
        Object obj = this.zza;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof J6.a) || (tVar = this.zzg) == null) {
                return null;
            }
            return new zzbwq(tVar);
        }
        zzbwm zzbwmVar = this.zzb;
        if (zzbwmVar == null || (tVarZzb = zzbwmVar.zzb()) == null) {
            return null;
        }
        return new zzbwq(tVarZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzD(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof J6.a)) {
            String canonicalName = J6.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting rewarded ad from adapter.");
        try {
            zzbwi zzbwiVar = new zzbwi(this, zzbvpVar);
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzV(str, v1Var, null);
            zzW(v1Var);
            zzX(v1Var);
            Location location = v1Var.k;
            zzY(str, v1Var);
            ((J6.a) obj).loadRewardedAd(new J6.q(context), zzbwiVar);
        } catch (Exception e7) {
            H6.l.d("", e7);
            zzbvg.zza(interfaceC3876a, e7, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzE(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            H6.l.a("Show rewarded ad from adapter.");
            H6.l.c("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.zzbvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzF(q7.InterfaceC3876a r7, com.google.android.gms.internal.ads.zzbsa r8, java.util.List r9) throws android.os.RemoteException {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zza
            boolean r1 = r0 instanceof J6.a
            if (r1 == 0) goto Lc1
            com.google.android.gms.internal.ads.zzbwd r1 = new com.google.android.gms.internal.ads.zzbwd     // Catch: java.lang.Throwable -> L8c
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L8c
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8c
            r8.<init>()     // Catch: java.lang.Throwable -> L8c
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L8c
        L14:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto Laa
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbsg r2 = (com.google.android.gms.internal.ads.zzbsg) r2     // Catch: java.lang.Throwable -> L8c
            java.lang.String r2 = r2.zza     // Catch: java.lang.Throwable -> L8c
            int r3 = r2.hashCode()     // Catch: java.lang.Throwable -> L8c
            switch(r3) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 3
            goto L71
        L34:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 6
            goto L71
        L3e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 5
            goto L71
        L48:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 1
            goto L71
        L52:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 2
            goto L71
        L5c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 4
            goto L71
        L66:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 0
            goto L71
        L70:
            r2 = -1
        L71:
            x6.b r3 = x6.EnumC4471b.APP_OPEN_AD
            r4 = 0
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L9c;
                case 6: goto L79;
                default: goto L77;
            }
        L77:
            r3 = r4
            goto L9c
        L79:
            com.google.android.gms.internal.ads.zzbio r2 = com.google.android.gms.internal.ads.zzbix.zznz     // Catch: java.lang.Throwable -> L8c
            D6.s r5 = D6.C0395s.f2489e     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbiv r5 = r5.f2492c     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r2 = r5.zzd(r2)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L8c
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 == 0) goto L77
            goto L9c
        L8c:
            r8 = move-exception
            goto Lb6
        L8e:
            x6.b r3 = x6.EnumC4471b.NATIVE     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L91:
            x6.b r3 = x6.EnumC4471b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L94:
            x6.b r3 = x6.EnumC4471b.REWARDED     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L97:
            x6.b r3 = x6.EnumC4471b.INTERSTITIAL     // Catch: java.lang.Throwable -> L8c
            goto L9c
        L9a:
            x6.b r3 = x6.EnumC4471b.BANNER     // Catch: java.lang.Throwable -> L8c
        L9c:
            if (r3 == 0) goto L14
            wa.a r2 = new wa.a     // Catch: java.lang.Throwable -> L8c
            r3 = 20
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            r8.add(r2)     // Catch: java.lang.Throwable -> L8c
            goto L14
        Laa:
            J6.a r0 = (J6.a) r0     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r9 = q7.BinderC3877b.S(r7)     // Catch: java.lang.Throwable -> L8c
            android.content.Context r9 = (android.content.Context) r9     // Catch: java.lang.Throwable -> L8c
            r0.initialize(r9, r1, r8)     // Catch: java.lang.Throwable -> L8c
            return
        Lb6:
            java.lang.String r9 = "adapter.initialize"
            com.google.android.gms.internal.ads.zzbvg.zza(r7, r8, r9)
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        Lc1:
            android.os.RemoteException r7 = new android.os.RemoteException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbwk.zzF(q7.a, com.google.android.gms.internal.ads.zzbsa, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzG(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof J6.a)) {
            String canonicalName = J6.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting rewarded interstitial ad from adapter.");
        try {
            zzbwi zzbwiVar = new zzbwi(this, zzbvpVar);
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzV(str, v1Var, null);
            zzW(v1Var);
            zzX(v1Var);
            Location location = v1Var.k;
            zzY(str, v1Var);
            ((J6.a) obj).loadRewardedInterstitialAd(new J6.q(context), zzbwiVar);
        } catch (Exception e7) {
            zzbvg.zza(interfaceC3876a, e7, "adapter.loadRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzH() {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            return zzbxx.zza(((J6.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbxx zzI() {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            return zzbxx.zza(((J6.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzJ(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof J6.a)) {
            String canonicalName = J6.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting interscroller ad from adapter.");
        try {
            J6.a aVar = (J6.a) obj;
            zzbwc zzbwcVar = new zzbwc(this, zzbvpVar, aVar);
            zzV(str, v1Var, str2);
            zzW(v1Var);
            zzX(v1Var);
            Location location = v1Var.k;
            zzY(str, v1Var);
            int i5 = x1Var.f2534e;
            int i10 = x1Var.f2531b;
            AdSize adSize = new AdSize(i5, i10);
            adSize.f26299g = true;
            adSize.f26300h = i10;
            zzbwcVar.onFailure(new C4470a(7, aVar.getClass().getSimpleName().concat(" does not support interscroller ads."), MobileAds.ERROR_DOMAIN, null));
        } catch (Exception e7) {
            H6.l.d("", e7);
            zzbvg.zza(interfaceC3876a, e7, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvs zzK() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzL(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof J6.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                zzh();
                return;
            } else {
                H6.l.a("Show interstitial ad from adapter.");
                H6.l.c("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = J6.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC3256n.p(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzM(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        Object obj = this.zza;
        if (!(obj instanceof J6.a)) {
            String canonicalName = J6.a.class.getCanonicalName();
            String canonicalName2 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting app open ad from adapter.");
        try {
            zzbwj zzbwjVar = new zzbwj(this, zzbvpVar);
            Context context = (Context) BinderC3877b.S(interfaceC3876a);
            zzV(str, v1Var, null);
            zzW(v1Var);
            zzX(v1Var);
            Location location = v1Var.k;
            zzY(str, v1Var);
            ((J6.a) obj).loadAppOpenAd(new J6.g(context), zzbwjVar);
        } catch (Exception e7) {
            H6.l.d("", e7);
            zzbvg.zza(interfaceC3876a, e7, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzN(InterfaceC3876a interfaceC3876a) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            H6.l.a("Show app open ad from adapter.");
            H6.l.c("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvu zzO() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbvv zzP() {
        return null;
    }

    public final /* synthetic */ void zzQ(J6.t tVar) {
        this.zzg = tVar;
    }

    public final /* synthetic */ Object zzb() {
        return this.zza;
    }

    public final /* synthetic */ void zzc(View view) {
        this.zze = view;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zze(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        zzj(interfaceC3876a, x1Var, v1Var, str, null, zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final InterfaceC3876a zzf() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new BinderC3877b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                H6.l.d("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof J6.a) {
            return new BinderC3877b(this.zze);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = J6.a.class.getCanonicalName();
        String canonicalName3 = obj.getClass().getCanonicalName();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb2 = new StringBuilder(length + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
        AbstractC3256n.p(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb2.append(canonicalName3);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzg(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzbvp zzbvpVar) throws RemoteException {
        zzk(interfaceC3876a, v1Var, str, null, zzbvpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzh() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof MediationInterstitialAdapter) {
            H6.l.a("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) obj).showInterstitial();
                return;
            } catch (Throwable th) {
                H6.l.d("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzi() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.e) {
            try {
                ((J6.e) obj).onDestroy();
            } catch (Throwable th) {
                H6.l.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzj(InterfaceC3876a interfaceC3876a, x1 x1Var, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        AdSize adSize;
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationBannerAdapter;
        if (!z2 && !(obj instanceof J6.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = J6.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC3256n.p(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting banner ad from adapter.");
        boolean z10 = x1Var.f2542n;
        int i5 = x1Var.f2531b;
        int i10 = x1Var.f2534e;
        if (z10) {
            AdSize adSize2 = new AdSize(i10, i5);
            adSize2.f26297e = true;
            adSize2.f26298f = i5;
            adSize = adSize2;
        } else {
            adSize = new AdSize(i10, i5, x1Var.f2530a);
        }
        if (z2) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj;
                List list = v1Var.f2508e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j8 = v1Var.f2505b;
                zzbwb zzbwbVar = new zzbwb(j8 == -1 ? null : new Date(j8), v1Var.f2507d, hashSet, v1Var.k, zzX(v1Var), v1Var.f2510g, v1Var.f2520r, v1Var.f2522t, zzY(str, v1Var));
                Bundle bundle = v1Var.f2515m;
                mediationBannerAdapter.requestBannerAd((Context) BinderC3877b.S(interfaceC3876a), new zzbwm(zzbvpVar), zzV(str, v1Var, str2), adSize, zzbwbVar, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                H6.l.d("", th);
                zzbvg.zza(interfaceC3876a, th, "adapter.requestBannerAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof J6.a) {
            try {
                zzbwe zzbweVar = new zzbwe(this, zzbvpVar);
                Context context = (Context) BinderC3877b.S(interfaceC3876a);
                zzV(str, v1Var, str2);
                zzW(v1Var);
                zzX(v1Var);
                Location location = v1Var.k;
                zzY(str, v1Var);
                ((J6.a) obj2).loadBannerAd(new J6.h(context), zzbweVar);
            } catch (Throwable th2) {
                H6.l.d("", th2);
                zzbvg.zza(interfaceC3876a, th2, "adapter.loadBannerAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzk(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, String str2, zzbvp zzbvpVar) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationInterstitialAdapter;
        if (!z2 && !(obj instanceof J6.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = J6.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC3256n.p(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting interstitial ad from adapter.");
        if (z2) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj;
                List list = v1Var.f2508e;
                HashSet hashSet = list != null ? new HashSet(list) : null;
                long j8 = v1Var.f2505b;
                zzbwb zzbwbVar = new zzbwb(j8 == -1 ? null : new Date(j8), v1Var.f2507d, hashSet, v1Var.k, zzX(v1Var), v1Var.f2510g, v1Var.f2520r, v1Var.f2522t, zzY(str, v1Var));
                Bundle bundle = v1Var.f2515m;
                mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC3877b.S(interfaceC3876a), new zzbwm(zzbvpVar), zzV(str, v1Var, str2), zzbwbVar, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                H6.l.d("", th);
                zzbvg.zza(interfaceC3876a, th, "adapter.requestInterstitialAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof J6.a) {
            try {
                zzbwf zzbwfVar = new zzbwf(this, zzbvpVar);
                Context context = (Context) BinderC3877b.S(interfaceC3876a);
                zzV(str, v1Var, str2);
                zzW(v1Var);
                zzX(v1Var);
                Location location = v1Var.k;
                zzY(str, v1Var);
                ((J6.a) obj2).loadInterstitialAd(new J6.l(context), zzbwfVar);
            } catch (Throwable th2) {
                H6.l.d("", th2);
                zzbvg.zza(interfaceC3876a, th2, "adapter.loadInterstitialAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzl() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.e) {
            try {
                ((J6.e) obj).onPause();
            } catch (Throwable th) {
                H6.l.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzm() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.e) {
            try {
                ((J6.e) obj).onResume();
            } catch (Throwable th) {
                H6.l.d("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzn(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, zzcch zzcchVar, String str2) throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof J6.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.zzd = interfaceC3876a;
            this.zzc = zzcchVar;
            zzcchVar.zze(new BinderC3877b(obj));
            return;
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzo(v1 v1Var, String str) throws RemoteException {
        zzv(v1Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzp() throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            H6.l.c("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzq() throws RemoteException {
        Object obj = this.zza;
        if ((obj instanceof J6.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.zzc != null;
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzr(InterfaceC3876a interfaceC3876a, v1 v1Var, String str, String str2, zzbvp zzbvpVar, zzbma zzbmaVar, List list) throws RemoteException {
        Object obj = this.zza;
        boolean z2 = obj instanceof MediationNativeAdapter;
        if (!z2 && !(obj instanceof J6.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = J6.a.class.getCanonicalName();
            String canonicalName3 = obj.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 4 + String.valueOf(canonicalName2).length() + 22 + String.valueOf(canonicalName3).length());
            AbstractC3256n.p(sb2, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb2.append(canonicalName3);
            H6.l.f(sb2.toString());
            throw new RemoteException();
        }
        H6.l.a("Requesting native ad from adapter.");
        if (z2) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                List list2 = v1Var.f2508e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j8 = v1Var.f2505b;
                zzbwp zzbwpVar = new zzbwp(j8 == -1 ? null : new Date(j8), v1Var.f2507d, hashSet, v1Var.k, zzX(v1Var), v1Var.f2510g, zzbmaVar, list, v1Var.f2520r, v1Var.f2522t, zzY(str, v1Var));
                Bundle bundle = v1Var.f2515m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.zzb = new zzbwm(zzbvpVar);
                mediationNativeAdapter.requestNativeAd((Context) BinderC3877b.S(interfaceC3876a), this.zzb, zzV(str, v1Var, str2), zzbwpVar, bundle2);
                return;
            } catch (Throwable th) {
                H6.l.d("", th);
                zzbvg.zza(interfaceC3876a, th, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        Object obj2 = this.zza;
        if (obj2 instanceof J6.a) {
            try {
                zzbwh zzbwhVar = new zzbwh(this, zzbvpVar);
                Context context = (Context) BinderC3877b.S(interfaceC3876a);
                zzV(str, v1Var, str2);
                zzW(v1Var);
                zzX(v1Var);
                Location location = v1Var.k;
                zzY(str, v1Var);
                ((J6.a) obj2).loadNativeAdMapper(new J6.n(context), zzbwhVar);
            } catch (Throwable th2) {
                H6.l.d("", th2);
                zzbvg.zza(interfaceC3876a, th2, "adapter.loadNativeAdMapper");
                String message = th2.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    J6.a aVar = (J6.a) this.zza;
                    zzbwg zzbwgVar = new zzbwg(this, zzbvpVar);
                    Context context2 = (Context) BinderC3877b.S(interfaceC3876a);
                    zzV(str, v1Var, str2);
                    zzW(v1Var);
                    zzX(v1Var);
                    Location location2 = v1Var.k;
                    zzY(str, v1Var);
                    aVar.loadNativeAd(new J6.n(context2), zzbwgVar);
                } catch (Throwable th3) {
                    H6.l.d("", th3);
                    zzbvg.zza(interfaceC3876a, th3, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzs() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzt() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final Bundle zzu() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzv(v1 v1Var, String str, String str2) throws RemoteException {
        Object obj = this.zza;
        if (obj instanceof J6.a) {
            zzD(this.zzd, v1Var, str, new zzbwn((J6.a) obj, this.zzc));
            return;
        }
        String canonicalName = J6.a.class.getCanonicalName();
        String canonicalName2 = obj.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        H6.l.f(sb2.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzw(InterfaceC3876a interfaceC3876a) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final boolean zzx() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final void zzy(InterfaceC3876a interfaceC3876a, zzcch zzcchVar, List list) throws RemoteException {
        H6.l.f("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final zzbnc zzz() {
        zzbwm zzbwmVar = this.zzb;
        if (zzbwmVar == null) {
            return null;
        }
        zzbnd zzbndVarZze = zzbwmVar.zze();
        if (zzbndVarZze instanceof zzbnd) {
            return zzbndVarZze.zza();
        }
        return null;
    }

    public zzbwk(J6.e eVar) {
        this.zza = eVar;
    }

    public final /* synthetic */ void zzR(J6.r rVar) {
    }

    public final /* synthetic */ void zzS(J6.p pVar) {
    }

    public final /* synthetic */ void zzT(J6.j jVar) {
    }

    public final /* synthetic */ void zzU(J6.f fVar) {
    }

    public final /* synthetic */ void zzd(J6.k kVar) {
    }
}
