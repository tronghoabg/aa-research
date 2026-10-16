package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzbaz {
    private final p8.p zza;

    public zzbaz(final Context context, Executor executor) {
        this.zza = zzhcf.zzd(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzbay
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return zzfxx.zza(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final p8.p zza() {
        return this.zza;
    }
}
