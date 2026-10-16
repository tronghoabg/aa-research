package com.google.android.gms.internal.ads;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final class zzgbx extends AbstractC3464c {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzgcp zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbx(zzgcp zzgcpVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzc = zzgcpVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzA(this);
    }
}
