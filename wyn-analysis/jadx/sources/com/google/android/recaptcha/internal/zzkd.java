package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzkd {
    static final zzkd zza = new zzkd(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    public zzkd() {
        this.zzd = new HashMap();
    }

    public final zzkq zza(zzlx zzlxVar, int i5) {
        return (zzkq) this.zzd.get(new zzkc(zzlxVar, i5));
    }

    public zzkd(boolean z2) {
        this.zzd = Collections.EMPTY_MAP;
    }
}
