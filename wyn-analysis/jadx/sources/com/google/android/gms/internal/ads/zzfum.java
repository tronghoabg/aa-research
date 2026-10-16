package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.U;
import D6.o1;
import android.content.Context;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import n7.InterfaceC3596a;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzfum {
    private final Context zza;
    private final H6.a zzb;
    private final ScheduledExecutorService zzc;
    private final zzfow zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfmc zzf;
    private final InterfaceC3596a zzg;
    private final zzfsx zzh;
    private final zzftn zzi;

    public zzfum(Context context, H6.a aVar, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzfmc zzfmcVar, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar, zzftn zzftnVar) {
        this.zza = context;
        this.zzb = aVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzfowVar;
        this.zzg = interfaceC3596a;
        this.zzf = zzfmcVar;
        this.zzh = zzfsxVar;
        this.zzi = zzftnVar;
    }

    private final zzftg zzc() {
        zzbio zzbioVar = zzbix.zzJ;
        C0395s c0395s = C0395s.f2489e;
        return new zzftg(((Long) c0395s.f2492c.zzd(zzbioVar)).longValue(), 2.0d, ((Long) c0395s.f2492c.zzd(zzbix.zzK)).longValue(), 0.2d, this.zzg, this.zzi);
    }

    public final zzful zza(o1 o1Var, D6.S s10) {
        EnumC4471b enumC4471bA = EnumC4471b.a(o1Var.f2470b);
        if (enumC4471bA == null) {
            return null;
        }
        int iOrdinal = enumC4471bA.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            H6.a aVar = this.zzb;
            return new zzftk(clientApi, context, aVar.f4929c, this.zzf, o1Var, s10, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            H6.a aVar2 = this.zzb;
            return new zzfuq(clientApi2, context2, aVar2.f4929c, this.zzf, o1Var, s10, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        H6.a aVar3 = this.zzb;
        return new zzftf(clientApi3, context3, aVar3.f4929c, this.zzf, o1Var, s10, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final zzful zzb(String str, o1 o1Var, U u10) {
        EnumC4471b enumC4471bA = EnumC4471b.a(o1Var.f2470b);
        if (enumC4471bA == null) {
            return null;
        }
        int iOrdinal = enumC4471bA.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            H6.a aVar = this.zzb;
            return new zzftk(str, clientApi, context, aVar.f4929c, this.zzf, o1Var, u10, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            H6.a aVar2 = this.zzb;
            return new zzfuq(str, clientApi2, context2, aVar2.f4929c, this.zzf, o1Var, u10, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        H6.a aVar3 = this.zzb;
        return new zzftf(str, clientApi3, context3, aVar3.f4929c, this.zzf, o1Var, u10, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
