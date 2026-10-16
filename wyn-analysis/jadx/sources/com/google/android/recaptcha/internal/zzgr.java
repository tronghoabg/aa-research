package com.google.android.recaptcha.internal;

import Ef.C0514u;
import Ef.E;
import Ef.H;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzgr extends AbstractC3471j implements p {
    final /* synthetic */ zzgv zza;
    final /* synthetic */ zzpq zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgr(zzgv zzgvVar, zzpq zzpqVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = zzgvVar;
        this.zzb = zzpqVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzgr(this.zza, this.zzb, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgr) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Exception {
        a aVar = a.f39711a;
        e.U(obj);
        try {
            zzgv zzgvVar = this.zza;
            H.D(this.zza.zzn.zzb(), null, new zzgq(this.zza, zzgvVar.zzp().zzb(this.zzb, zzgvVar.zzl), null), 3);
        } catch (zzbj e7) {
            ((C0514u) this.zza.zzu()).Y(e7);
        }
        return C2515C.f34653a;
    }
}
