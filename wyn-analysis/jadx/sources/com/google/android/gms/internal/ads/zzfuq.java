package com.google.android.gms.internal.ads;

import D6.C0395s;
import D6.H0;
import D6.U;
import D6.o1;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzfuq extends zzful {
    public zzfuq(ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, D6.S s10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a) {
        super(clientApi, context, i5, zzfmcVar, o1Var, s10, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    @Override // com.google.android.gms.internal.ads.zzful
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza(android.content.Context r10) {
        /*
            r9 = this;
            com.google.android.gms.internal.ads.zzfmc r0 = r9.zzd
            com.google.android.gms.internal.ads.zzbvj r0 = r0.zzd()
            java.lang.String r1 = "Failed to create a rewarded ad."
            r2 = 1
            if (r0 != 0) goto L15
            com.google.android.gms.internal.ads.zzfsy r10 = new com.google.android.gms.internal.ads.zzfsy
            r10.<init>(r2, r1)
            p8.p r10 = com.google.android.gms.internal.ads.zzhcf.zzc(r10)
            return r10
        L15:
            com.google.android.gms.ads.internal.ClientApi r3 = r9.zza
            q7.b r4 = new q7.b
            r4.<init>(r10)
            java.util.concurrent.atomic.AtomicReference r10 = r9.zze
            java.lang.Object r10 = r10.get()
            D6.o1 r10 = (D6.o1) r10
            java.lang.String r10 = r10.f2469a
            int r5 = r9.zzc
            com.google.android.gms.internal.ads.zzccp r10 = r3.A(r4, r10, r0, r5)
            com.google.android.gms.internal.ads.zzfke r10 = (com.google.android.gms.internal.ads.zzfke) r10
            if (r10 != 0) goto L3a
            com.google.android.gms.internal.ads.zzfsy r10 = new com.google.android.gms.internal.ads.zzfsy
            r10.<init>(r2, r1)
            p8.p r10 = com.google.android.gms.internal.ads.zzhcf.zzc(r10)
            return r10
        L3a:
            com.google.android.gms.internal.ads.zzhcy r0 = com.google.android.gms.internal.ads.zzhcy.zze()
            java.util.concurrent.atomic.AtomicReference r1 = r9.zze     // Catch: android.os.RemoteException -> L7c
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L7c
            D6.o1 r1 = (D6.o1) r1     // Catch: android.os.RemoteException -> L7c
            D6.v1 r1 = r1.f2471c     // Catch: android.os.RemoteException -> L7c
            r9.zzB(r1)     // Catch: android.os.RemoteException -> L7c
            com.google.android.gms.internal.ads.zzfsx r4 = r9.zzf     // Catch: android.os.RemoteException -> L7c
            if (r4 == 0) goto L7e
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzY     // Catch: android.os.RemoteException -> L7c
            D6.s r3 = D6.C0395s.f2489e     // Catch: android.os.RemoteException -> L7c
            com.google.android.gms.internal.ads.zzbiv r5 = r3.f2492c     // Catch: android.os.RemoteException -> L7c
            java.lang.Object r1 = r5.zzd(r1)     // Catch: android.os.RemoteException -> L7c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: android.os.RemoteException -> L7c
            boolean r1 = r1.booleanValue()     // Catch: android.os.RemoteException -> L7c
            if (r1 == 0) goto L7e
            r1 = r3
            com.google.android.gms.internal.ads.zzfti r3 = new com.google.android.gms.internal.ads.zzfti     // Catch: android.os.RemoteException -> L7c
            java.util.concurrent.ScheduledExecutorService r5 = r9.zzi     // Catch: android.os.RemoteException -> L7c
            com.google.android.gms.internal.ads.zzbio r6 = com.google.android.gms.internal.ads.zzbix.zzaa     // Catch: android.os.RemoteException -> L7c
            com.google.android.gms.internal.ads.zzbiv r1 = r1.f2492c     // Catch: android.os.RemoteException -> L7c
            java.lang.Object r1 = r1.zzd(r6)     // Catch: android.os.RemoteException -> L7c
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: android.os.RemoteException -> L7c
            long r6 = r1.longValue()     // Catch: android.os.RemoteException -> L7c
            r8 = r9
            r3.<init>(r4, r5, r6, r8)     // Catch: android.os.RemoteException -> La1
            r10.zzu(r3)     // Catch: android.os.RemoteException -> La1
            goto L7f
        L7c:
            r8 = r9
            goto La1
        L7e:
            r8 = r9
        L7f:
            java.util.concurrent.atomic.AtomicReference r1 = r8.zze     // Catch: android.os.RemoteException -> La1
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> La1
            D6.o1 r1 = (D6.o1) r1     // Catch: android.os.RemoteException -> La1
            D6.v1 r1 = r1.f2471c     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzfup r3 = new com.google.android.gms.internal.ads.zzfup     // Catch: android.os.RemoteException -> La1
            com.google.android.gms.internal.ads.zzfty r4 = new com.google.android.gms.internal.ads.zzfty     // Catch: android.os.RemoteException -> La1
            r4.<init>(r9, r0)     // Catch: android.os.RemoteException -> La1
            java.util.concurrent.atomic.AtomicReference r5 = r8.zze     // Catch: android.os.RemoteException -> La1
            java.lang.Object r5 = r5.get()     // Catch: android.os.RemoteException -> La1
            D6.o1 r5 = (D6.o1) r5     // Catch: android.os.RemoteException -> La1
            java.lang.String r5 = r5.f2469a     // Catch: android.os.RemoteException -> La1
            r3.<init>(r10, r4, r5)     // Catch: android.os.RemoteException -> La1
            r10.zzc(r1, r3)     // Catch: android.os.RemoteException -> La1
            return r0
        La1:
            java.lang.String r10 = "Failed to load rewarded ad."
            H6.l.f(r10)
            com.google.android.gms.internal.ads.zzfsy r10 = new com.google.android.gms.internal.ads.zzfsy
            java.lang.String r0 = "remote exception"
            r10.<init>(r2, r0)
            p8.p r10 = com.google.android.gms.internal.ads.zzhcf.zzc(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfuq.zza(android.content.Context):p8.p");
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final long zzb() {
        return ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzW)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final /* bridge */ /* synthetic */ H0 zzc(Object obj) {
        try {
            return ((zzccp) obj).zzm();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Failed to get response info for the rewarded ad.", e7);
            return null;
        }
    }

    public zzfuq(String str, ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, U u10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar) {
        super(str, clientApi, context, i5, zzfmcVar, o1Var, u10, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a, zzfsxVar);
    }
}
