package com.google.android.gms.internal.ads;

import D6.C0368e;
import D6.C0388o;
import D6.C0392q;
import D6.Q0;
import D6.v1;
import D6.w1;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import q7.BinderC3877b;
import x6.EnumC4471b;

/* loaded from: classes3.dex */
public final class zzbzz {
    private static zzcet zze;
    private final Context zza;
    private final EnumC4471b zzb;
    private final Q0 zzc;
    private final String zzd;

    public zzbzz(Context context, EnumC4471b enumC4471b, Q0 q02, String str) {
        this.zza = context;
        this.zzb = enumC4471b;
        this.zzc = q02;
        this.zzd = str;
    }

    public static zzcet zza(Context context) {
        zzcet zzcetVar;
        synchronized (zzbzz.class) {
            try {
                if (zze == null) {
                    C0388o c0388o = C0392q.f2477g.f2479b;
                    zzbvf zzbvfVar = new zzbvf();
                    c0388o.getClass();
                    zze = (zzcet) new C0368e(c0388o, context, zzbvfVar).d(context, false);
                }
                zzcetVar = zze;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcetVar;
    }

    public final void zzb(Q6.b bVar) {
        zzcet zzcetVar;
        BinderC3877b binderC3877b;
        v1 v1VarA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context context = this.zza;
        zzcet zzcetVarZza = zza(context);
        if (zzcetVarZza == null) {
            bVar.onFailure("Internal Error, query info generator is null.");
            return;
        }
        BinderC3877b binderC3877b2 = new BinderC3877b(context);
        Q0 q02 = this.zzc;
        if (q02 == null) {
            binderC3877b = binderC3877b2;
            zzcetVar = zzcetVarZza;
            v1VarA = new v1(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null, 0, jCurrentTimeMillis, 0L, -1);
        } else {
            zzcetVar = zzcetVarZza;
            binderC3877b = binderC3877b2;
            q02.f2371n = jCurrentTimeMillis;
            v1VarA = w1.a(context, q02);
        }
        try {
            zzcetVar.zze(binderC3877b, new zzcex(this.zzd, this.zzb.name(), null, v1VarA), new zzbzy(this, bVar));
        } catch (RemoteException unused) {
            bVar.onFailure("Internal Error.");
        }
    }
}
