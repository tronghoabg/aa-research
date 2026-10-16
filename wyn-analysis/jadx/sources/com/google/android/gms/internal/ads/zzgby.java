package com.google.android.gms.internal.ads;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes3.dex */
final class zzgby extends AbstractC3471j implements tf.p {
    public zzgby(InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new zzgby(interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgby) create((zzgbi) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        zzgbi zzgbiVarZzd = zzgbi.zzd();
        AbstractC3340k.d(zzgbiVarZzd, "getDefaultInstance(...)");
        return zzgbiVarZzd;
    }
}
