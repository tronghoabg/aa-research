package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import Ef.InterfaceC0501m0;
import Fe.e;
import ef.C2515C;
import ef.C2530n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzu extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzx zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(String str, zzx zzxVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = str;
        this.zzc = zzxVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzu zzuVar = new zzu(this.zzb, this.zzc, interfaceC3103c);
        zzuVar.zzd = obj;
        return zzuVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 == 0) {
            E e7 = (E) this.zzd;
            String str = this.zzb;
            zzqm zzqmVarZzf = zzqn.zzf();
            zzqmVarZzf.zze(str);
            zzx zzxVar = this.zzc;
            zzxVar.zzr().put(this.zzb, zzqmVarZzf);
            ArrayList arrayList = new ArrayList();
            List list = this.zzc.zzb;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzaa) obj2).zzf()) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(H.D(e7, null, new zzt(this.zzc, this.zzb, (zzaa) it.next(), zzqmVarZzf, null), 3));
            }
            InterfaceC0501m0[] interfaceC0501m0Arr = (InterfaceC0501m0[]) arrayList.toArray(new InterfaceC0501m0[0]);
            InterfaceC0501m0[] interfaceC0501m0Arr2 = (InterfaceC0501m0[]) Arrays.copyOf(interfaceC0501m0Arr, interfaceC0501m0Arr.length);
            this.zza = 1;
            if (H.B(interfaceC0501m0Arr2, this) == aVar) {
                return aVar;
            }
        }
        return new C2530n(this.zzc.zzt(this.zzb));
    }
}
