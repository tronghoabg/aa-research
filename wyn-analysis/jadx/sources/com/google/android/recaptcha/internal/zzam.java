package com.google.android.recaptcha.internal;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zzam extends AbstractC3464c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzap zzc;
    int zzd;
    zzap zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzap zzapVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzc = zzapVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
