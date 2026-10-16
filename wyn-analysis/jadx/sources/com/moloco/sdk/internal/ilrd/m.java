package com.moloco.sdk.internal.ilrd;

import E5.Q;
import Ef.H;
import Ef.S;
import Va.M6;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1457v;
import com.moloco.sdk.C1869e0;
import com.moloco.sdk.C1872f0;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.C1944g;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class m implements DefaultLifecycleObserver {

    /* renamed from: a, reason: collision with root package name */
    public final Kd.a f28581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28582b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n f28583c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28584d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28585e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28586f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28587g;

    /* renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f28588h;

    /* renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.q f28589i;

    /* renamed from: j, reason: collision with root package name */
    public final String f28590j;
    public final String k;

    /* renamed from: l, reason: collision with root package name */
    public final C1944g f28591l;

    /* renamed from: m, reason: collision with root package name */
    public final C8.i f28592m;

    /* renamed from: n, reason: collision with root package name */
    public final C8.i f28593n;

    /* renamed from: o, reason: collision with root package name */
    public final C8.i f28594o;

    /* renamed from: p, reason: collision with root package name */
    public final Nf.d f28595p;

    /* renamed from: q, reason: collision with root package name */
    public r f28596q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f28597r;

    public m(Kd.a aVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.n persistentHttpRequest, long j8, int i5, long j10, long j11, com.moloco.sdk.internal.services.k timeProvider, AbstractC1451o processLifeycle, com.moloco.sdk.internal.services.q advertisingIdService, String str2, String str3, C1944g dataStoreService) {
        C8.i iVar = new C8.i(aVar, timeProvider, "SessionInactiveScheduler");
        C8.i iVar2 = new C8.i(aVar, timeProvider, "SessionMaxLengthScheduler");
        C8.i iVar3 = new C8.i(aVar, timeProvider, "UploadIntervalScheduler");
        AbstractC3340k.e(persistentHttpRequest, "persistentHttpRequest");
        AbstractC3340k.e(timeProvider, "timeProvider");
        AbstractC3340k.e(processLifeycle, "processLifeycle");
        AbstractC3340k.e(advertisingIdService, "advertisingIdService");
        AbstractC3340k.e(dataStoreService, "dataStoreService");
        this.f28581a = aVar;
        this.f28582b = str;
        this.f28583c = persistentHttpRequest;
        this.f28584d = j8;
        this.f28585e = i5;
        this.f28586f = j10;
        this.f28587g = j11;
        this.f28588h = timeProvider;
        this.f28589i = advertisingIdService;
        this.f28590j = str2;
        this.k = str3;
        this.f28591l = dataStoreService;
        this.f28592m = iVar;
        this.f28593n = iVar2;
        this.f28594o = iVar3;
        this.f28595p = Nf.e.a();
        this.f28597r = new ArrayList();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("ILRD repository initialized - url=", str, ", uploadInterval=");
        sbW.append((Object) Cf.a.j(j10));
        sbW.append(", maxBatchSize=");
        sbW.append(i5);
        sbW.append(", sessionExpiry=");
        sbW.append((Object) Cf.a.j(j8));
        sbW.append(", maxSessionLength=");
        sbW.append((Object) Cf.a.j(j11));
        MolocoLogger.info$default(molocoLogger, "IlrdEventsRepository", sbW.toString(), null, false, 12, null);
        Lf.e eVar = S.f3698a;
        H.D(aVar, Jf.n.f6132a.f4117e, new C1882a(processLifeycle, this, null), 2);
        H.D(aVar, null, new C1883b(this, null), 3);
    }

    public static final C1872f0 a(m mVar, t tVar) {
        mVar.getClass();
        C1869e0 c1869e0E = C1872f0.e();
        c1869e0E.a(UUID.randomUUID().toString());
        r rVar = mVar.f28596q;
        if (rVar != null) {
            c1869e0E.c(rVar.c());
            Cf.h hVar = Cf.a.f2200b;
            mVar.f28588h.getClass();
            long jT = Fe.b.T(System.currentTimeMillis() - rVar.f28639d, Cf.c.f2207c);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Event created: sessionId=" + rVar.c() + ", sessionAge=" + ((Object) Cf.a.j(jT)), null, false, 12, null);
        }
        if (!(tVar instanceof t)) {
            throw new Q((byte) 0, 9);
        }
        c1869e0E.b(tVar.f28644a);
        return (C1872f0) c1869e0E.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.moloco.sdk.internal.ilrd.m r27, lf.AbstractC3464c r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.m.b(com.moloco.sdk.internal.ilrd.m, lf.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r14v9, types: [Nf.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.moloco.sdk.internal.ilrd.m r14, lf.AbstractC3464c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.ilrd.m.d(com.moloco.sdk.internal.ilrd.m, lf.c):java.lang.Object");
    }

    public final void c() throws Throwable {
        r rVar = this.f28596q;
        long j8 = this.f28587g;
        com.moloco.sdk.internal.services.k kVar = this.f28588h;
        if (rVar != null && !rVar.f28641f) {
            Cf.h hVar = Cf.a.f2200b;
            kVar.getClass();
            long jT = Fe.b.T(System.currentTimeMillis() - rVar.f28639d, Cf.c.f2207c);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "Session validation - age: " + ((Object) Cf.a.j(jT)) + ", limit: " + ((Object) Cf.a.j(j8)), null, false, 12, null);
            return;
        }
        r rVar2 = new r(kVar, null);
        this.f28596q = rVar2;
        this.f28593n.b(j8, new g(this, null));
        h hVar2 = new h(this, null);
        C8.i iVar = this.f28594o;
        long j10 = this.f28586f;
        iVar.b(j10, hVar2);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "New session started: sessionId=" + rVar2.c() + ", maxBatch=" + this.f28585e + ", uploadInterval=" + ((Object) Cf.a.j(j10)) + ", sessionExp=" + ((Object) Cf.a.j(this.f28584d)) + ", maxLength=" + ((Object) Cf.a.j(j8)), null, false, 12, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(InterfaceC1457v interfaceC1457v) {
        M6.c(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(InterfaceC1457v interfaceC1457v) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(InterfaceC1457v interfaceC1457v) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdEventsRepository", "onPause called, sending events", null, false, 12, null);
        H.D(this.f28581a, null, new i(this, null), 3);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(InterfaceC1457v interfaceC1457v) {
        M6.d(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC1457v interfaceC1457v) {
        M6.e(interfaceC1457v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC1457v interfaceC1457v) {
    }
}
