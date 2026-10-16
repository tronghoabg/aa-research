package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import ef.C2530n;
import java.util.Iterator;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzw extends AbstractC3471j implements p {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzpq zzd;
    final /* synthetic */ zzx zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzw(zzpq zzpqVar, zzx zzxVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzd = zzpqVar;
        this.zze = zzxVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzw(this.zzd, this.zze, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzw) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        Iterator it;
        a aVar = a.f39711a;
        if (this.zzc != 0) {
            Object obj3 = this.zzb;
            Object obj4 = this.zza;
            e.U(obj);
            it = obj3;
            obj2 = obj4;
        } else {
            e.U(obj);
            if (!this.zzd.zzO()) {
                return new C2530n(e.z(new zzbj(zzbh.zzb, zzbg.zzac, null)));
            }
            zzpq zzpqVar = this.zzd;
            zzx zzxVar = this.zze;
            zzps zzpsVarZzj = zzpqVar.zzj();
            zzxVar.zzc = zzpsVarZzj.zzi();
            it = this.zze.zzb.iterator();
            obj2 = zzpsVarZzj;
        }
        while (it.hasNext()) {
            zzaa zzaaVar = (zzaa) it.next();
            this.zza = obj2;
            this.zzb = it;
            this.zzc = 1;
            if (zzaaVar.zzd((zzps) obj2, this) == aVar) {
                return aVar;
            }
        }
        return new C2530n(C2515C.f34653a);
    }
}
