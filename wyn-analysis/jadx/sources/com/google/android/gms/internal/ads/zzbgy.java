package com.google.android.gms.internal.ads;

import D6.C0376i;
import D6.C0388o;
import D6.C0392q;
import D6.Q0;
import D6.w1;
import D6.x1;
import android.content.Context;
import android.os.RemoteException;
import z6.AbstractC4618a;

/* loaded from: classes3.dex */
public final class zzbgy {
    private D6.L zza;
    private final Context zzb;
    private final String zzc;
    private final Q0 zzd;
    private final AbstractC4618a zze;
    private final zzbvf zzf = new zzbvf();
    private final w1 zzg = w1.f2529a;

    public zzbgy(Context context, String str, Q0 q02, AbstractC4618a abstractC4618a) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = q02;
        this.zze = abstractC4618a;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            x1 x1VarW = x1.W();
            C0388o c0388o = C0392q.f2477g.f2479b;
            Context context = this.zzb;
            String str = this.zzc;
            zzbvf zzbvfVar = this.zzf;
            c0388o.getClass();
            D6.L l10 = (D6.L) new C0376i(c0388o, context, x1VarW, str, zzbvfVar).d(context, false);
            this.zza = l10;
            if (l10 != null) {
                Q0 q02 = this.zzd;
                q02.f2371n = jCurrentTimeMillis;
                l10.zzJ(new zzbgl(this.zze, str));
                D6.L l11 = this.zza;
                this.zzg.getClass();
                l11.zze(w1.a(context, q02));
            }
        } catch (RemoteException e7) {
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }
}
