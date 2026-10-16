package com.google.android.recaptcha.internal;

import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3464c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
final class zzcq extends AbstractC3464c {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcx zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcq(zzcx zzcxVar, InterfaceC3103c interfaceC3103c) {
        super(interfaceC3103c);
        this.zzb = zzcxVar;
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo170execute0E7RQCE = this.zzb.mo170execute0E7RQCE(null, 0L, this);
        return objMo170execute0E7RQCE == a.f39711a ? objMo170execute0E7RQCE : new C2530n(objMo170execute0E7RQCE);
    }
}
