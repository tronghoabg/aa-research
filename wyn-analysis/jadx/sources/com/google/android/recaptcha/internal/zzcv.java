package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import Ef.L0;
import Fe.e;
import com.google.android.recaptcha.RecaptchaAction;
import ef.C2515C;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzcv extends AbstractC3471j implements p {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzdc zzc;
    final /* synthetic */ zzcx zzd;
    final /* synthetic */ RecaptchaAction zze;
    final /* synthetic */ zzpw zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(long j8, zzdc zzdcVar, zzcx zzcxVar, RecaptchaAction recaptchaAction, zzpw zzpwVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zzb = j8;
        this.zzc = zzdcVar;
        this.zzd = zzcxVar;
        this.zze = recaptchaAction;
        this.zzf = zzpwVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzcv(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcv) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws zzbj {
        a aVar = a.f39711a;
        try {
            if (this.zza != 0) {
                e.U(obj);
            } else {
                e.U(obj);
                long j8 = this.zzb;
                zzcu zzcuVar = new zzcu(this.zzc, this.zzd, this.zze, this.zzf, null);
                this.zza = 1;
                obj = H.Q(j8, zzcuVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (zzqf) obj;
        } catch (L0 unused) {
            throw new zzbj(zzbh.zzc, zzbg.zzb, null);
        } catch (zzbj e7) {
            throw e7;
        } catch (Exception unused2) {
            throw new zzbj(zzbh.zzb, zzbg.zza, null);
        }
    }
}
