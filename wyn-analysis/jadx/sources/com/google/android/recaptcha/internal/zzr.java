package com.google.android.recaptcha.internal;

import E5.Q;
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
final class zzr extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zzaa zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzx zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzaa zzaaVar, String str, zzx zzxVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzaaVar;
        this.zzc = str;
        this.zzd = zzxVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzr(this.zzb, this.zzc, this.zzd, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 == 0) {
            zzaa zzaaVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzaaVar.zzc(str, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        zzac zzacVar = (zzac) obj;
        zzqj zzqjVarZzf = zzql.zzf();
        zzqjVarZzf.zzp(3);
        if (zzacVar instanceof zzz) {
            zzqjVarZzf.zze(zzx.zzp(this.zzd, ((zzz) zzacVar).zza()));
            return zzqjVarZzf;
        }
        if (!(zzacVar instanceof zzy)) {
            throw new Q((byte) 0, 9);
        }
        zzqjVarZzf.zzd(zzx.zzo(this.zzd, ((zzy) zzacVar).zza()));
        return zzqjVarZzf;
    }
}
