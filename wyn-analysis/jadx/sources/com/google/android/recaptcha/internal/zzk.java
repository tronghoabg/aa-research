package com.google.android.recaptcha.internal;

import Ef.C0484e;
import Ef.E;
import Ef.H;
import Ef.K;
import Fe.e;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import ff.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzk extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzpq zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, long j8, zzpq zzpqVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzlVar;
        this.zzc = j8;
        this.zzd = zzpqVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, interfaceC3103c);
        zzkVar.zze = obj;
        return zzkVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws MissingResourceException {
        zzdf zzdfVar;
        Object objZ;
        a aVar = a.f39711a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            e.U(obj);
        } else {
            e.U(obj);
            E e7 = (E) this.zze;
            zzl zzlVar = this.zzb;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(zzlVar.zza().zzd());
            zzdf zzdfVarZzf = zzdcVarZza.zzf(30);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.zzb.zzd().iterator();
            while (it.hasNext()) {
                arrayList.add(H.h(e7, null, new zzj((zze) it.next(), this.zzc, this.zzd, null), 3));
            }
            K[] kArr = (K[]) arrayList.toArray(new K[0]);
            K[] kArr2 = (K[]) Arrays.copyOf(kArr, kArr.length);
            this.zze = zzdfVarZzf;
            this.zza = 1;
            obj = kArr2.length == 0 ? v.f35432a : new C0484e(kArr2).a(this);
            if (obj == aVar) {
                return aVar;
            }
            zzdfVar = zzdfVarZzf;
        }
        List list = (List) obj;
        if ((list instanceof Collection) && list.isEmpty()) {
            zzbj zzbjVar = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar);
            objZ = e.z(zzbjVar);
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (!(((C2530n) it2.next()).f34674a instanceof C2529m)) {
                    zzdfVar.zza();
                    objZ = C2515C.f34653a;
                    break;
                }
            }
            zzbj zzbjVar2 = new zzbj(zzbh.zzb, zzbg.zzY, null);
            zzdfVar.zzb(zzbjVar2);
            objZ = e.z(zzbjVar2);
        }
        return new C2530n(objZ);
    }
}
