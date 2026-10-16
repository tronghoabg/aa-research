package com.google.android.recaptcha.internal;

import Ef.E;
import Fe.e;
import android.content.ContentValues;
import com.applovin.sdk.AppLovinErrorCodes;
import ef.C2515C;
import ff.o;
import jf.InterfaceC3103c;
import kf.a;
import lf.AbstractC3471j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

/* loaded from: classes4.dex */
final class zzdj extends AbstractC3471j implements p {
    final /* synthetic */ zzdk zza;
    final /* synthetic */ zzre zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdk zzdkVar, zzre zzreVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.zza = zzdkVar;
        this.zzb = zzreVar;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c create(@Nullable Object obj, @NotNull InterfaceC3103c interfaceC3103c) {
        return new zzdj(this.zza, this.zzb, interfaceC3103c);
    }

    @Override // tf.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdj) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f39711a;
        e.U(obj);
        zzre zzreVar = this.zzb;
        zzdk zzdkVar = this.zza;
        synchronized (zzdg.class) {
            try {
                if (zzdkVar.zze != null) {
                    byte[] bArrZzd = zzreVar.zzd();
                    zzdb zzdbVar = new zzdb(zzhz.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                    zzda zzdaVar = zzdkVar.zze;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("ss", zzdbVar.zzc());
                    contentValues.put("ts", Long.valueOf(zzdbVar.zzb()));
                    zzdaVar.getWritableDatabase().insert("ce", null, contentValues);
                    int iZzb = zzdkVar.zze.zzb() + AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    if (iZzb > 0) {
                        zzdkVar.zze.zza(o.N0(zzdkVar.zze.zzd(), iZzb));
                    }
                    if (zzdkVar.zze.zzb() >= 20) {
                        zzdkVar.zzg();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return C2515C.f34653a;
    }
}
