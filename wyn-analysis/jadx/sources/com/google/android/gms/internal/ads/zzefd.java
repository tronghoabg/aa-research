package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.webkit.CookieManager;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzefd implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzefd(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzefd zza(zzini zziniVar, zzini zziniVar2) {
        return new zzefd(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final Object zzb() {
        zzfps zzfpsVar = (zzfps) this.zza.zzb();
        final CookieManager cookieManagerH = C6.n.f1857D.f1866f.h();
        zzfpm zzfpmVar = zzfpm.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfpsVar);
        return zzfpd.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = cookieManagerH;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) C0395s.f2489e.f2492c.zzd(zzbix.zzbE));
            }
        }, zzfpmVar, zzfpsVar).zzh(1L, TimeUnit.SECONDS).zzf(Exception.class, zzeev.zza).zzi();
    }
}
