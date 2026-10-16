package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import Fe.e;
import ef.C2515C;
import ff.o;
import java.util.List;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzdx extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzea zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzek zzekVar, List list, zzea zzeaVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzekVar;
        this.zzc = list;
        this.zzd = zzeaVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzdx zzdxVar = new zzdx(this.zzb, this.zzc, this.zzd, interfaceC3103c);
        zzdxVar.zze = obj;
        return zzdxVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.zza;
        C2515C c2515c = C2515C.f34653a;
        e.U(obj);
        if (i5 != 0) {
            return c2515c;
        }
        E e7 = (E) this.zze;
        while (true) {
            zzek zzekVar = this.zzb;
            if (zzekVar.zza() < 0) {
                break;
            }
            if (zzekVar.zza() >= this.zzc.size() || !H.y(e7)) {
                break;
            }
            zzrs zzrsVar = (zzrs) this.zzc.get(this.zzb.zza());
            try {
                zzea.zzf(this.zzd, zzrsVar, this.zzb);
            } catch (Exception e10) {
                zzrsVar.zzk();
                new Integer(zzrsVar.zzg());
                o.w0(zzrsVar.zzj(), null, null, null, new zzdw(this.zzd), 31);
                zzea zzeaVar = this.zzd;
                zzek zzekVar2 = this.zzb;
                this.zza = 1;
                if (zzeaVar.zzh(e10, zzekVar2, this) == aVar) {
                    return aVar;
                }
            }
        }
        return c2515c;
    }
}
