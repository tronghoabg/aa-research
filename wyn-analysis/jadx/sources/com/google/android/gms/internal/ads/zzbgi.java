package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class zzbgi implements Comparator {
    public zzbgi(zzbgj zzbgjVar) {
        Objects.requireNonNull(zzbgjVar);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbfy zzbfyVar = (zzbfy) obj;
        zzbfy zzbfyVar2 = (zzbfy) obj2;
        if (zzbfyVar.zzb() < zzbfyVar2.zzb()) {
            return -1;
        }
        if (zzbfyVar.zzb() > zzbfyVar2.zzb()) {
            return 1;
        }
        if (zzbfyVar.zza() < zzbfyVar2.zza()) {
            return -1;
        }
        if (zzbfyVar.zza() > zzbfyVar2.zza()) {
            return 1;
        }
        float fZzd = (zzbfyVar.zzd() - zzbfyVar.zzb()) * (zzbfyVar.zzc() - zzbfyVar.zza());
        float fZzd2 = (zzbfyVar2.zzd() - zzbfyVar2.zzb()) * (zzbfyVar2.zzc() - zzbfyVar2.zza());
        if (fZzd > fZzd2) {
            return -1;
        }
        return fZzd < fZzd2 ? 1 : 0;
    }
}
