package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.io.File;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class zzbam implements zzfzg {
    final /* synthetic */ zzfxl zza;

    public zzbam(zzbao zzbaoVar, zzfxl zzfxlVar) {
        this.zza = zzfxlVar;
        Objects.requireNonNull(zzbaoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfzg
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
