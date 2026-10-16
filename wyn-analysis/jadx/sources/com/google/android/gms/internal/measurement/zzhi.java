package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import k8.AbstractC3201j;
import k8.C3192a;
import k8.C3204m;

/* loaded from: classes4.dex */
public final class zzhi {
    private static volatile AbstractC3201j zza = C3192a.f39293a;
    private static final Object zzb = new Object();

    private static boolean zza(Context context) {
        return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE) != 0;
    }

    public static boolean zza(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (zza.b()) {
            return ((Boolean) zza.a()).booleanValue();
        }
        synchronized (zzb) {
            try {
                if (zza.b()) {
                    return ((Boolean) zza.a()).booleanValue();
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    }
                    zza = new C3204m(Boolean.valueOf(z2));
                    return ((Boolean) zza.a()).booleanValue();
                }
                if (zza(context)) {
                    z2 = true;
                }
                zza = new C3204m(Boolean.valueOf(z2));
                return ((Boolean) zza.a()).booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
