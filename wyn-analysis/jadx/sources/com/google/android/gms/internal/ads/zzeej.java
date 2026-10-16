package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.PatternSyntaxException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzeej {
    private final Context zza;
    private final H6.a zzb;
    private final Executor zzc;
    private final AtomicReference zzd = new AtomicReference("");

    public zzeej(Context context, H6.a aVar, Executor executor) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = executor;
    }

    private final String zzc() throws SecurityException {
        String name;
        H6.a aVar = this.zzb;
        String strZzd = null;
        if (aVar.f4930d) {
            name = zzclm.class.getName();
        } else {
            try {
                name = (String) new JSONObject(zzd((String) C0395s.f2489e.f2492c.zzd(zzbix.zzpX))).get(Integer.toString(aVar.f4929c));
            } catch (ClassCastException | IllegalArgumentException | NullPointerException | JSONException e7) {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpW)).booleanValue()) {
                    C6.n.f1857D.f1868h.zzh(e7, "SdkIE");
                }
                name = null;
            }
        }
        if (TextUtils.isEmpty(name)) {
            return CommonGetHeaderBiddingToken.HB_TOKEN_VERSION;
        }
        try {
            strZzd = zzd((String) C0395s.f2489e.f2492c.zzd(zzbix.zzpY));
        } catch (IllegalArgumentException e10) {
            if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzpW)).booleanValue()) {
                C6.n.f1857D.f1868h.zzh(e10, "SdkIE");
            }
        }
        if (TextUtils.isEmpty(strZzd)) {
            return "3";
        }
        try {
            for (Method method : this.zza.getClassLoader().loadClass(name).getDeclaredMethods()) {
                if (method.getName().matches(strZzd)) {
                    return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
                }
            }
            return "0";
        } catch (ClassNotFoundException unused) {
            return "4";
        } catch (NoClassDefFoundError unused2) {
            return "6";
        } catch (SecurityException unused3) {
            return "7";
        } catch (PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final String zzd(String str) throws IllegalArgumentException {
        String str2 = new String(Base64.decode((String) C0395s.f2489e.f2492c.zzd(zzbix.zzpZ), 10), StandardCharsets.UTF_8);
        String str3 = new String(Base64.decode(str, 0));
        G6.M m10 = U.f4562l;
        char[] charArray = str3.toCharArray();
        for (int i5 = 0; i5 < charArray.length; i5++) {
            charArray[i5] = (char) (charArray[i5] ^ str2.charAt(i5 % str2.length()));
        }
        return new String(charArray);
    }

    public final String zza() {
        zzbio zzbioVar = zzbix.zzpV;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (!((String) c0395s.f2492c.zzd(zzbix.zzpX)).isEmpty()) {
                if (!((String) c0395s.f2492c.zzd(zzbix.zzpY)).isEmpty()) {
                    if (!((String) c0395s.f2492c.zzd(zzbix.zzpZ)).isEmpty()) {
                        String str = (String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeei
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void zzb() {
        AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            try {
                if (((String) atomicReference.get()).isEmpty()) {
                    atomicReference.set(zzc());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
