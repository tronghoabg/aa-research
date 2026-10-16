package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
final class zzaup implements zzaug {
    final /* synthetic */ Context zza;
    private File zzb = null;

    public zzaup(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzaug
    public final File zza() {
        if (this.zzb == null) {
            this.zzb = new File(this.zza.getCacheDir(), "volley");
        }
        return this.zzb;
    }
}
