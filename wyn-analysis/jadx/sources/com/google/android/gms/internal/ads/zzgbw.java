package com.google.android.gms.internal.ads;

import jf.InterfaceC3103c;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
final class zzgbw extends AbstractC3464c {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgcp zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbw(zzgcp zzgcpVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzd = zzgcpVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzB(0L, this);
    }
}
