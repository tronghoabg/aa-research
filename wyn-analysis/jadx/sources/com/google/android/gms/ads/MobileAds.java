package com.google.android.gms.ads;

import D6.C0395s;
import D6.InterfaceC0385m0;
import D6.U0;
import D6.X0;
import D6.Z0;
import D6.p1;
import H6.f;
import H6.l;
import P6.a;
import P6.b;
import Va.M6;
import a2.C1323c;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbzz;
import com.google.android.gms.internal.ads.zzcet;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgui;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import q7.BinderC3877b;
import tc.g;
import u.AbstractC4159a;
import u.n;
import x6.C4488s;
import x6.EnumC4471b;
import x6.InterfaceC4485p;
import x6.u;
import x6.x;

/* loaded from: classes3.dex */
public class MobileAds {
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(Context context) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            z0D.b(context);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzs();
            } catch (RemoteException unused) {
                l.c("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public static InitializationStatus getInitializationStatus() {
        return Z0.d().f();
    }

    private static String getInternalVersion() {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to getting version string.", z0D.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return "";
            }
            try {
                return zzgui.zza(interfaceC0385m0.zzm());
            } catch (RemoteException e7) {
                l.d("Unable to get internal version.", e7);
                return "";
            }
        }
    }

    public static C4488s getRequestConfiguration() {
        return Z0.d().f2404l;
    }

    public static u getVersion() {
        Z0.d();
        String[] strArrSplit = TextUtils.split("25.3.0", "\\.");
        if (strArrSplit.length != 3) {
            return new u(0, 0, 0);
        }
        try {
            return new u(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new u(0, 0, 0);
        }
    }

    public static void initialize(Context context) {
        Z0.d().e(context, null);
    }

    public static void openAdInspector(Context context, InterfaceC4485p interfaceC4485p) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            try {
                z0D.b(context);
                InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
                if (interfaceC0385m0 == null) {
                    return;
                }
                z0D.k = interfaceC4485p;
                try {
                    interfaceC0385m0.zzt(new X0());
                } catch (RemoteException unused) {
                    l.c("Unable to open the ad inspector.");
                    if (interfaceC4485p != null) {
                        ((g) ((C1323c) interfaceC4485p).f17156b).b(Integer.toString(0), "Ad inspector had an internal error.", ERROR_DOMAIN);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void openDebugMenu(Context context, String str) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to opening debug menu.", z0D.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzi(new BinderC3877b(context), str);
            } catch (RemoteException e7) {
                l.d("Unable to open debug menu.", e7);
            }
        }
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z2) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.", z0D.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return false;
            }
            try {
                interfaceC0385m0.zzu(z2);
                return true;
            } catch (RemoteException e7) {
                String str = z2 ? "enable" : "disable";
                StringBuilder sb2 = new StringBuilder(str.length() + 40);
                sb2.append("Unable to ");
                sb2.append(str);
                sb2.append(" the publisher first-party ID.");
                l.d(sb2.toString(), e7);
                return false;
            }
        }
    }

    public static n registerCustomTabsSession(Context context, u.g gVar, String str, AbstractC4159a abstractC4159a) {
        Z0.d();
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        zzcet zzcetVarZza = zzbzz.zza(context);
        if (zzcetVarZza == null) {
            l.c("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (n) BinderC3877b.S(zzcetVarZza.zzm(new BinderC3877b(context), new BinderC3877b(gVar), str, new BinderC3877b(abstractC4159a)));
        } catch (RemoteException | IllegalArgumentException e7) {
            l.d("Unable to register custom tabs session. Error: ", e7);
            return null;
        }
    }

    public static void registerRtbAdapter(Class<? extends RtbAdapter> cls) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzn(cls.getCanonicalName());
            } catch (RemoteException e7) {
                l.d("Unable to register RtbAdapter", e7);
            }
        }
    }

    public static void registerWebView(WebView webView) {
        Z0.d();
        AbstractC1732v.e("#008 Must be called on the main UI thread.");
        if (webView == null) {
            l.c("The webview to be registered cannot be null.");
            return;
        }
        zzcet zzcetVarZza = zzbzz.zza(webView.getContext());
        if (zzcetVarZza == null) {
            l.c("Internal error, query info generator is null.");
            return;
        }
        try {
            zzcetVarZza.zzj(new BinderC3877b(webView));
        } catch (RemoteException e7) {
            l.d("", e7);
        }
    }

    public static void setAppMuted(boolean z2) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to setting app muted state.", z0D.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzh(z2);
            } catch (RemoteException e7) {
                l.d("Unable to set app mute state.", e7);
            }
        }
    }

    public static void setAppVolume(float f10) {
        Z0 z0D = Z0.d();
        z0D.getClass();
        boolean z2 = true;
        AbstractC1732v.a("The app volume must be a value between 0 and 1 inclusive.", f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= 1.0f);
        synchronized (z0D.f2402i) {
            if (z0D.f2403j == null) {
                z2 = false;
            }
            AbstractC1732v.k("MobileAds.initialize() must be called prior to setting the app volume.", z2);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzf(f10);
            } catch (RemoteException e7) {
                l.d("Unable to set app volume.", e7);
            }
        }
    }

    private static void setPlugin(String str) {
        Z0 z0D = Z0.d();
        synchronized (z0D.f2402i) {
            AbstractC1732v.k("MobileAds.initialize() must be called prior to setting the plugin.", z0D.f2403j != null);
            InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
            if (interfaceC0385m0 == null) {
                return;
            }
            try {
                interfaceC0385m0.zzv(str);
            } catch (RemoteException e7) {
                l.d("Unable to set plugin.", e7);
            }
        }
    }

    public static void setRequestConfiguration(C4488s c4488s) {
        Z0 z0D = Z0.d();
        z0D.getClass();
        AbstractC1732v.a("Null passed to setRequestConfiguration.", c4488s != null);
        synchronized (z0D.f2402i) {
            try {
                C4488s c4488s2 = z0D.f2404l;
                z0D.f2404l = c4488s;
                InterfaceC0385m0 interfaceC0385m0 = z0D.f2403j;
                if (interfaceC0385m0 == null) {
                    return;
                }
                if ((c4488s2.f47742a != c4488s.f47742a || c4488s2.f47743b != c4488s.f47743b) && interfaceC0385m0 != null) {
                    try {
                        interfaceC0385m0.zzr(new p1(c4488s));
                    } catch (RemoteException e7) {
                        l.d("Unable to set request configuration parcel.", e7);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Deprecated
    public static void startPreload(Context context, List<b> list, a aVar) {
        boolean z2;
        Status status;
        Z0 z0D = Z0.d();
        z0D.getClass();
        zzbix.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        for (b bVar : list) {
            String strValueOf = String.valueOf(bVar.a());
            String str = bVar.f9258a;
            String strT = M6.t(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, "#", str);
            Object obj = 0;
            zzgax zzgaxVar = f.f4939b;
            if (map.containsKey(strT)) {
                obj = map.get(strT);
            }
            map.put(strT, Integer.valueOf(((Integer) obj).intValue() + 1));
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((Integer) ((Map.Entry) it.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        HashMap map2 = new HashMap();
        for (b bVar2 : list) {
            EnumC4471b enumC4471bA = bVar2.a();
            if (Z0.f2392m.contains(bVar2.a())) {
                zzgax zzgaxVar2 = f.f4939b;
                map2.put(enumC4471bA, Integer.valueOf(((Integer) (map2.containsKey(enumC4471bA) ? map2.get(enumC4471bA) : 0)).intValue() + 1));
                int i5 = bVar2.f9261d;
                if (i5 > 15) {
                    Locale locale = Locale.US;
                    hashSet.add("Preload configurations' buffer size exceeds the maximum limit 15 for " + enumC4471bA.name());
                } else if (i5 < 0) {
                    Locale locale2 = Locale.US;
                    hashSet.add("Preload configurations' buffer size less than 0 for " + enumC4471bA.name());
                }
            } else {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(bVar2.a())));
            }
            z2 = true;
        }
        EnumMap enumMap = new EnumMap(EnumC4471b.class);
        EnumC4471b enumC4471b = EnumC4471b.APP_OPEN_AD;
        zzbio zzbioVar = zzbix.zzfD;
        C0395s c0395s = C0395s.f2489e;
        enumMap.put((EnumMap) enumC4471b, (EnumC4471b) c0395s.f2492c.zzd(zzbioVar));
        enumMap.put((EnumMap) EnumC4471b.INTERSTITIAL, (EnumC4471b) c0395s.f2492c.zzd(zzbix.zzfB));
        enumMap.put((EnumMap) EnumC4471b.REWARDED, (EnumC4471b) c0395s.f2492c.zzd(zzbix.zzfC));
        for (Map.Entry entry : map2.entrySet()) {
            EnumC4471b enumC4471b2 = (EnumC4471b) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            zzgax zzgaxVar3 = f.f4939b;
            Integer num = (Integer) (enumMap.containsKey(enumC4471b2) ? enumMap.get(enumC4471b2) : 0);
            if (iIntValue > num.intValue()) {
                Locale locale3 = Locale.US;
                hashSet.add("Preload configurations' size exceeds the maximum limit " + num + " for " + enumC4471b2.name());
                z2 = true;
            }
        }
        if (z2) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                sb2.append((String) it2.next());
                if (it2.hasNext()) {
                    sb2.append(", ");
                }
            }
            String string = sb2.toString();
            l.c(string);
            status = new Status(13, string, null, null);
        } else {
            status = Status.f26424e;
        }
        String str2 = status.f26430b;
        if (str2 == null) {
            str2 = "";
        }
        AbstractC1732v.a(str2, status.V());
        synchronized (z0D.f2398e) {
            ArrayList arrayList = new ArrayList();
            Iterator<b> it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(f.r(context, it3.next()));
            }
            try {
                x.a(context).zze(arrayList, new U0("com.google.android.gms.ads.internal.client.IAdPreloadCallback"));
            } catch (RemoteException e7) {
                l.d("Unable to start preload.", e7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:9:0x0015, B:11:0x0019, B:17:0x0025, B:19:0x002c, B:20:0x0031, B:22:0x0035, B:23:0x003a, B:25:0x003e, B:26:0x0043, B:16:0x0020), top: B:33:0x0015, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void stop() {
        /*
            D6.Z0 r0 = D6.Z0.d()
            java.lang.Object r1 = r0.f2397d
            monitor-enter(r1)
            r2 = 0
            r0.f2401h = r2     // Catch: java.lang.Throwable -> L47
            r0.f2400g = r2     // Catch: java.lang.Throwable -> L47
            java.util.ArrayList r2 = r0.f2399f     // Catch: java.lang.Throwable -> L47
            r2.clear()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r2 = r0.f2402i
            monitor-enter(r2)
            D6.m0 r1 = r0.f2403j     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            if (r1 == 0) goto L25
            r1.zzw()     // Catch: java.lang.Throwable -> L1d android.os.RemoteException -> L1f
            goto L25
        L1d:
            r0 = move-exception
            goto L45
        L1f:
            r1 = move-exception
            java.lang.String r3 = "Unable to stop the SDK."
            H6.l.d(r3, r1)     // Catch: java.lang.Throwable -> L1d
        L25:
            r1 = 0
            r0.f2403j = r1     // Catch: java.lang.Throwable -> L1d
            D6.T0 r3 = r0.f2394a     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L31
            r3.v()     // Catch: java.lang.Throwable -> L1d
            r0.f2394a = r1     // Catch: java.lang.Throwable -> L1d
        L31:
            D6.T0 r3 = r0.f2395b     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L3a
            r3.v()     // Catch: java.lang.Throwable -> L1d
            r0.f2395b = r1     // Catch: java.lang.Throwable -> L1d
        L3a:
            D6.T0 r3 = r0.f2396c     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L43
            r3.v()     // Catch: java.lang.Throwable -> L1d
            r0.f2396c = r1     // Catch: java.lang.Throwable -> L1d
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
        L47:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L47
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.MobileAds.stop():void");
    }

    public static void initialize(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        Z0.d().e(context, onInitializationCompleteListener);
    }
}
