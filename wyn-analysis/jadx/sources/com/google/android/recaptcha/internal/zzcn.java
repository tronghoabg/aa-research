package com.google.android.recaptcha.internal;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zzcn extends AbstractC3464c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzco zzb;
    int zzc;
    zzdf zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcn(zzco zzcoVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzb = zzcoVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzi(null, null, null, this);
    }
}
