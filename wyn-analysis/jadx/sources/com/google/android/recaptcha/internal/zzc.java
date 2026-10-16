package com.google.android.recaptcha.internal;

import ef.C2530n;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zzc extends AbstractC3464c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzdf zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzc = zzeVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj, MissingResourceException {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == a.f39711a ? objZze : new C2530n(objZze);
    }
}
