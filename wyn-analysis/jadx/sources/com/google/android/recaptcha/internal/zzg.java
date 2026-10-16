package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import ef.C2515C;
import ef.C2530n;
import java.util.MissingResourceException;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzg extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(zze zzeVar, String str, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = zzeVar;
        this.zzc = str;
        this.zzd = j8;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzg(this.zzb, this.zzc, this.zzd, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzg) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj, MissingResourceException {
        Object objZzc;
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 != 0) {
            objZzc = ((C2530n) obj).f34674a;
        } else {
            zze zzeVar = this.zzb;
            String str = this.zzc;
            long j8 = this.zzd;
            this.zza = 1;
            objZzc = zzeVar.zzc(str, j8, this);
            if (objZzc == aVar) {
                return aVar;
            }
        }
        return new C2530n(objZzc);
    }
}
