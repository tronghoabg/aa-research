package com.google.android.recaptcha;

import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Recaptcha$getClient$1 extends AbstractC3464c {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzb = recaptcha;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM169getClientBWLJW6A = this.zzb.m169getClientBWLJW6A(null, null, 0L, this);
        return objM169getClientBWLJW6A == a.f39711a ? objM169getClientBWLJW6A : new C2530n(objM169getClientBWLJW6A);
    }
}
