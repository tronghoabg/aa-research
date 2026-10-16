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
final class zzh extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j8;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, interfaceC3103c);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws MissingResourceException {
        zzdf zzdfVar;
        a aVar = a.f39711a;
        if (this.zza != 0) {
            zzdfVar = (zzdf) this.zze;
            e.U(obj);
        } else {
            e.U(obj);
            E e7 = (E) this.zze;
            zzl zzlVar = this.zzb;
            String str = this.zzc;
            zzdc zzdcVarZza = zzlVar.zza();
            zzdcVarZza.zzc(str);
            zzdf zzdfVarZzf = zzdcVarZza.zzf(31);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(H.h(e7, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
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
        String str2 = this.zzc;
        zzpv zzpvVarZzf = zzpw.zzf();
        zzpvVarZzf.zzd(str2);
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            Object obj2 = ((C2530n) it.next()).f34674a;
            if (!(obj2 instanceof C2529m)) {
                zzpvVarZzf.zzg((zzpw) obj2);
            }
        }
        zzpw zzpwVar = (zzpw) zzpvVarZzf.zzj();
        zzdfVar.zza();
        return zzpwVar;
    }
}
