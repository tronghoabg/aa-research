package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import android.app.Application;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzcc extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ Application zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcc(Application application, String str, long j8, zzdq zzdqVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = application;
        this.zzc = str;
        this.zzd = j8;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzcc(this.zzb, this.zzc, this.zzd, null, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        a aVar = a.f39711a;
        int i5 = this.zza;
        e.U(obj);
        if (i5 != 0) {
            return obj;
        }
        Application application = this.zzb;
        String str = this.zzc;
        long j8 = this.zzd;
        zzco zzcoVar = zzco.zza;
        this.zza = 1;
        Object objZze = zzcoVar.zze(application, str, j8, new zzbv("https://www.recaptcha.net/recaptcha/api3"), null, null, zzco.zzf, this);
        return objZze == aVar ? aVar : objZze;
    }
}
