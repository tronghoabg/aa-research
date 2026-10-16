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
public final class zzftf extends zzful {
    public zzftf(ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, D6.S s10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a) {
        super(clientApi, context, i5, zzfmcVar, o1Var, s10, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    @Override // com.google.android.gms.internal.ads.zzful
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p8.p zza(android.content.Context r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzfmc r0 = r14.zzd
            com.google.android.gms.internal.ads.zzbvj r5 = r0.zzd()
            java.lang.String r0 = "Failed to create an app open ad manager."
            r7 = 1
            if (r5 != 0) goto L15
            com.google.android.gms.internal.ads.zzfsy r15 = new com.google.android.gms.internal.ads.zzfsy
            r15.<init>(r7, r0)
            p8.p r15 = com.google.android.gms.internal.ads.zzhcf.zzc(r15)
            return r15
        L15:
            com.google.android.gms.ads.internal.ClientApi r1 = r14.zza
            q7.b r2 = new q7.b
            r2.<init>(r15)
            D6.x1 r3 = D6.x1.W()
            java.util.concurrent.atomic.AtomicReference r15 = r14.zze
            java.lang.Object r15 = r15.get()
            D6.o1 r15 = (D6.o1) r15
            java.lang.String r4 = r15.f2469a
            int r6 = r14.zzc
            D6.L r15 = r1.O(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.ads.zzfgu r15 = (com.google.android.gms.internal.ads.zzfgu) r15
            if (r15 != 0) goto L3e
            com.google.android.gms.internal.ads.zzfsy r15 = new com.google.android.gms.internal.ads.zzfsy
            r15.<init>(r7, r0)
            p8.p r15 = com.google.android.gms.internal.ads.zzhcf.zzc(r15)
            return r15
        L3e:
            com.google.android.gms.internal.ads.zzhcy r0 = com.google.android.gms.internal.ads.zzhcy.zze()
            java.util.concurrent.atomic.AtomicReference r1 = r14.zze     // Catch: android.os.RemoteException -> L82
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L82
            D6.o1 r1 = (D6.o1) r1     // Catch: android.os.RemoteException -> L82
            D6.v1 r1 = r1.f2471c     // Catch: android.os.RemoteException -> L82
            r14.zzB(r1)     // Catch: android.os.RemoteException -> L82
            com.google.android.gms.internal.ads.zzfsx r9 = r14.zzf     // Catch: android.os.RemoteException -> L82
            if (r9 == 0) goto L85
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzY     // Catch: android.os.RemoteException -> L82
            D6.s r2 = D6.C0395s.f2489e     // Catch: android.os.RemoteException -> L82
            com.google.android.gms.internal.ads.zzbiv r3 = r2.f2492c     // Catch: android.os.RemoteException -> L82
            java.lang.Object r1 = r3.zzd(r1)     // Catch: android.os.RemoteException -> L82
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: android.os.RemoteException -> L82
            boolean r1 = r1.booleanValue()     // Catch: android.os.RemoteException -> L82
            if (r1 == 0) goto L85
            com.google.android.gms.internal.ads.zzfti r8 = new com.google.android.gms.internal.ads.zzfti     // Catch: android.os.RemoteException -> L82
            java.util.concurrent.ScheduledExecutorService r10 = r14.zzi     // Catch: android.os.RemoteException -> L82
            com.google.android.gms.internal.ads.zzbio r1 = com.google.android.gms.internal.ads.zzbix.zzab     // Catch: android.os.RemoteException -> L82
            com.google.android.gms.internal.ads.zzbiv r2 = r2.f2492c     // Catch: android.os.RemoteException -> L82
            java.lang.Object r1 = r2.zzd(r1)     // Catch: android.os.RemoteException -> L82
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: android.os.RemoteException -> L82
            long r11 = r1.longValue()     // Catch: android.os.RemoteException -> L82
            r13 = r14
            r8.<init>(r9, r10, r11, r13)     // Catch: android.os.RemoteException -> L7f
            r15.zzL(r8)     // Catch: android.os.RemoteException -> L7f
            goto L86
        L7f:
            r0 = move-exception
        L80:
            r15 = r0
            goto Lab
        L82:
            r0 = move-exception
            r13 = r14
            goto L80
        L85:
            r13 = r14
        L86:
            java.util.concurrent.atomic.AtomicReference r1 = r13.zze     // Catch: android.os.RemoteException -> L7f
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L7f
            D6.o1 r1 = (D6.o1) r1     // Catch: android.os.RemoteException -> L7f
            com.google.android.gms.internal.ads.zzfte r2 = new com.google.android.gms.internal.ads.zzfte     // Catch: android.os.RemoteException -> L7f
            com.google.android.gms.internal.ads.zzfty r3 = new com.google.android.gms.internal.ads.zzfty     // Catch: android.os.RemoteException -> L7f
            r3.<init>(r14, r0)     // Catch: android.os.RemoteException -> L7f
            java.lang.String r1 = r1.f2469a     // Catch: android.os.RemoteException -> L7f
            r2.<init>(r3, r1)     // Catch: android.os.RemoteException -> L7f
            r15.zzJ(r2)     // Catch: android.os.RemoteException -> L7f
            java.util.concurrent.atomic.AtomicReference r1 = r13.zze     // Catch: android.os.RemoteException -> L7f
            java.lang.Object r1 = r1.get()     // Catch: android.os.RemoteException -> L7f
            D6.o1 r1 = (D6.o1) r1     // Catch: android.os.RemoteException -> L7f
            D6.v1 r1 = r1.f2471c     // Catch: android.os.RemoteException -> L7f
            r15.zze(r1)     // Catch: android.os.RemoteException -> L7f
            return r0
        Lab:
            java.lang.String r0 = "Failed to load app open ad."
            H6.l.g(r0, r15)
            com.google.android.gms.internal.ads.zzfsy r15 = new com.google.android.gms.internal.ads.zzfsy
            java.lang.String r0 = "remote exception"
            r15.<init>(r7, r0)
            p8.p r15 = com.google.android.gms.internal.ads.zzhcf.zzc(r15)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzftf.zza(android.content.Context):p8.p");
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final long zzb() {
        return ((Long) C0395s.f2489e.f2492c.zzd(zzbix.zzX)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzful
    public final /* bridge */ /* synthetic */ H0 zzc(Object obj) {
        try {
            return ((zzbgq) obj).zzg();
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.b("Failed to get response info for the app open ad.", e7);
            return null;
        }
    }

    public zzftf(String str, ClientApi clientApi, Context context, int i5, zzfmc zzfmcVar, o1 o1Var, U u10, ScheduledExecutorService scheduledExecutorService, zzfow zzfowVar, zzftg zzftgVar, InterfaceC3596a interfaceC3596a, zzfsx zzfsxVar) {
        super(str, clientApi, context, i5, zzfmcVar, o1Var, u10, scheduledExecutorService, zzfowVar, zzftgVar, interfaceC3596a, zzfsxVar);
    }
}
