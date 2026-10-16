package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
final class zzegs implements zzdgf {
    private final Context zza;
    private final zzceg zzb;

    public zzegs(Context context, zzceg zzcegVar) {
        this.zza = context;
        this.zzb = zzcegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdP(zzcbk zzcbkVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdgf
    public final void zzdQ(zzfky zzfkyVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = zzfkyVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzceg zzcegVar = this.zzb;
        Context context = this.zza;
        zzcegVar.zzd(context, zzfkyVar.zza.zza.zzd);
        zzcegVar.zzn(context, str);
    }
}
