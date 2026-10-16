package com.google.android.recaptcha.internal;

import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zzcs extends AbstractC3464c {
    Object zza;
    Object zzb;
    double zzc;
    /* synthetic */ Object zzd;
    final /* synthetic */ zzcx zze;
    int zzf;
    zzcx zzg;
    zzdf zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcx zzcxVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zze = zzcxVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.zzd = obj;
        this.zzf |= Integer.MIN_VALUE;
        Object objZzg = this.zze.zzg(null, 0L, this);
        return objZzg == a.f39711a ? objZzg : new C2530n(objZzg);
    }
}
