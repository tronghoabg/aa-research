package com.google.android.recaptcha.internal;

import ef.C2530n;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zza extends AbstractC3464c {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zze zzd;
    int zze;
    String zzf;
    zzdf zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zza(zze zzeVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzd = zzeVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj, MissingResourceException {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        Object objZzc = this.zzd.zzc(null, 0L, this);
        return objZzc == a.f39711a ? objZzc : new C2530n(objZzc);
    }
}
