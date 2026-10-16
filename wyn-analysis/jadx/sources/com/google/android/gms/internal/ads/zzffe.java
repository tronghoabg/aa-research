package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzffe implements zzimz {
    public static zzfcv zza(Context context, zzcez zzcezVar, zzcfa zzcfaVar, Object obj, zzfdx zzfdxVar, zzfer zzferVar, zzimt zzimtVar, zzimt zzimtVar2, zzimt zzimtVar3, zzimt zzimtVar4, zzimt zzimtVar5, zzimt zzimtVar6, zzimt zzimtVar7, Executor executor, zzfqq zzfqqVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzfek) obj);
        hashSet.add(zzfdxVar);
        hashSet.add(zzferVar);
        zzbio zzbioVar = zzbix.zzgS;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar.zzb());
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgT)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar2.zzb());
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgV)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar4.zzb());
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzgW)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar5.zzb());
        }
        if (((Boolean) c0395s.f2492c.zzd(zzbix.zzec)).booleanValue()) {
            hashSet.add((zzfcs) zzimtVar7.zzb());
        }
        return new zzfcv(context, executor, hashSet, zzfqqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
