package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes3.dex */
final class zzgcc extends AbstractC3471j implements tf.p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgbe zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcc(zzgbe zzgbeVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzgbeVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        zzgcc zzgccVar = new zzgcc(this.zzb, interfaceC3103c);
        zzgccVar.zza = obj;
        return zzgccVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcc) create((zzgbi) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        zzgbk zzgbkVarZza = zzgbj.zza((zzgbg) ((zzgbi) this.zza).zzcc());
        zziht zzihtVarZzb = zzgbkVarZza.zzb();
        zzgbe zzgbeVar = this.zzb;
        String strZza = zzgbeVar.zza();
        AbstractC3340k.d(strZza, "getGwsQueryId(...)");
        zzgbkVarZza.zzc(zzihtVarZzb, strZza, zzgbeVar);
        return zzgbkVarZza.zza();
    }
}
