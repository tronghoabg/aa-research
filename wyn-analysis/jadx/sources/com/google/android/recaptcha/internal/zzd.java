package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzd extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzpq zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzpq zzpqVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzeVar;
        this.zzc = zzpqVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzd(this.zzb, this.zzc, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj {
        Object objZzh;
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 != 0) {
            objZzh = ((C2530n) obj).f34674a;
        } else {
            zze zzeVar = this.zzb;
            zzpq zzpqVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzpqVar, this);
            if (objZzh == aVar) {
                return aVar;
            }
        }
        return new C2530n(objZzh);
    }
}
