package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes3.dex */
final class zzgbz extends AbstractC3471j implements tf.p {
    int zza;
    final /* synthetic */ zzgcp zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbz(zzgcp zzgcpVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzgcpVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new zzgbz(this.zzb, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbz) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.zza;
        Fe.e.U(obj);
        if (i5 == 0) {
            zzgcp zzgcpVar = this.zzb;
            this.zza = 1;
            if (zzgcpVar.zzu(this) == aVar) {
                return aVar;
            }
        }
        return C2515C.f34653a;
    }
}
