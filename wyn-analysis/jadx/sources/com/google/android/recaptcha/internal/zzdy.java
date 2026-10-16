package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import java.util.Arrays;
import jf.InterfaceC3103c;
import kf.a;
import kotlin.jvm.internal.H;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzdy extends AbstractC3471j implements p {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzek zzb;
    final /* synthetic */ zzea zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(Exception exc, zzek zzekVar, zzea zzeaVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = exc;
        this.zzb = zzekVar;
        this.zzc = zzeaVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        zzdy zzdyVar = new zzdy(this.zza, this.zzb, this.zzc, interfaceC3103c);
        zzdyVar.zzd = obj;
        return zzdyVar;
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdy) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        zzrh zzrhVarZza;
        a aVar = a.f39711a;
        e.U(obj);
        E e7 = (E) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzby) {
            zzrhVarZza = ((zzby) exc).zza();
            zzrhVarZza.zzd(this.zzb.zza());
        } else {
            zzek zzekVar = this.zzb;
            zzrh zzrhVarZzf = zzri.zzf();
            zzrhVarZzf.zzd(zzekVar.zza());
            zzrhVarZzf.zzq(2);
            zzrhVarZzf.zzp(2);
            zzrhVarZza = zzrhVarZzf;
        }
        zzri zzriVar = (zzri) zzrhVarZza.zzj();
        zzriVar.zzJ();
        zzriVar.zzk();
        H.f39741a.getOrCreateKotlinClass(this.zza.getClass()).getSimpleName();
        this.zza.getMessage();
        zzek zzekVar2 = this.zzb;
        zzbt zzbtVarZzb = zzekVar2.zzb();
        zzbt zzbtVar = zzekVar2.zza;
        if (zzbtVar == null) {
            zzbtVar = null;
        }
        zzoy zzoyVarZza = zzdn.zza(zzbtVarZzb, zzbtVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (Ef.H.y(e7)) {
            zzea zzeaVar = this.zzc;
            zzhz zzhzVarZzh = zzhz.zzh();
            byte[] bArrZzd = zzriVar.zzd();
            String strZzi = zzhzVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzhz zzhzVarZzh2 = zzhz.zzh();
            byte[] bArrZzd2 = zzoyVarZza.zzd();
            zzeaVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzhzVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return C2515C.f34653a;
    }
}
