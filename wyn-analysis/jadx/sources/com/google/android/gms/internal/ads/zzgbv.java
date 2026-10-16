package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes3.dex */
final class zzgbv extends AbstractC3471j implements tf.p {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbv(String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        zzgbv zzgbvVar = new zzgbv(this.zzb, interfaceC3103c);
        zzgbvVar.zza = obj;
        return zzgbvVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbv) create((zzgbi) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        zzgbk zzgbkVarZza = zzgbj.zza((zzgbg) ((zzgbi) this.zza).zzcc());
        zzgbkVarZza.zzd(zzgbkVarZza.zzb(), this.zzb);
        return zzgbkVarZza.zza();
    }
}
