package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import ef.C2515C;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jf.InterfaceC3103c;
import kf.a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzea implements zzdv {

    @NotNull
    private final E zza;

    @NotNull
    private final zzem zzb;

    @NotNull
    private final zzge zzc;

    @NotNull
    private final Map zzd;

    public zzea(@NotNull E e7, @NotNull zzem zzemVar, @NotNull zzge zzgeVar, @NotNull Map map) {
        this.zza = e7;
        this.zzb = zzemVar;
        this.zzc = zzgeVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzea zzeaVar, zzrs zzrsVar, zzek zzekVar) throws zzby {
        zzgz zzgzVarZzb = zzgz.zzb();
        int iZza = zzekVar.zza();
        zzfe zzfeVar = (zzfe) zzeaVar.zzd.get(Integer.valueOf(zzrsVar.zzf()));
        if (zzfeVar == null) {
            throw new zzby(5, 2, null);
        }
        int iZzg = zzrsVar.zzg();
        zzrr[] zzrrVarArr = (zzrr[]) zzrsVar.zzj().toArray(new zzrr[0]);
        zzfeVar.zza(iZzg, zzekVar, (zzrr[]) Arrays.copyOf(zzrrVarArr, zzrrVarArr.length));
        if (iZza == zzekVar.zza()) {
            zzekVar.zzg(zzekVar.zza() + 1);
        }
        zzgzVarZzb.zzf();
        long jZza = zzgzVarZzb.zza(TimeUnit.MICROSECONDS);
        int i5 = zzbq.zza;
        int iZzk = zzrsVar.zzk();
        if (iZzk == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzbq.zza(iZzk - 2, jZza);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzek zzekVar, InterfaceC3103c interfaceC3103c) {
        Object objL = H.l(new zzdx(zzekVar, list, this, null), interfaceC3103c);
        return objL == a.f39711a ? objL : C2515C.f34653a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzek zzekVar, InterfaceC3103c interfaceC3103c) {
        Object objL = H.l(new zzdy(exc, zzekVar, this, null), interfaceC3103c);
        return objL == a.f39711a ? objL : C2515C.f34653a;
    }

    @Override // com.google.android.recaptcha.internal.zzdv
    public final void zza(@NotNull String str) {
        H.D(this.zza, null, new zzdz(new zzek(this.zzb), this, str, null), 3);
    }
}
