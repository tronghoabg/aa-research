package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzt extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zzx zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzaa zzd;
    final /* synthetic */ zzqm zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzx zzxVar, String str, zzaa zzaaVar, zzqm zzqmVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzxVar;
        this.zzc = str;
        this.zzd = zzaaVar;
        this.zze = zzqmVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzt(this.zzb, this.zzc, this.zzd, this.zze, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzt) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 == 0) {
            zzx zzxVar = this.zzb;
            String str = this.zzc;
            zzaa zzaaVar = this.zzd;
            this.zza = 1;
            obj = zzxVar.zzu(str, zzaaVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        this.zze.zzd((zzqj) obj);
        return C2515C.f34653a;
    }
}
