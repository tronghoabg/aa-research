package com.waze.network.b;

import android.net.ConnectivityManager;
import android.net.DnsResolver;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class f implements okhttp3.v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32053a = 0;

    /* renamed from: c, reason: collision with root package name */
    private static final ExecutorService f32054c = Executors.newSingleThreadExecutor(new a(0));

    /* renamed from: d, reason: collision with root package name */
    private final ConnectivityManager f32055d;

    /* renamed from: e, reason: collision with root package name */
    private final long f32056e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.perf.tracer.g f32057f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f32058g;

    /* renamed from: h, reason: collision with root package name */
    private final DnsResolver f32059h;

    public /* synthetic */ f(ConnectivityManager connectivityManager, long j2, com.waze.perf.tracer.g gVar, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(connectivityManager, "connectivityManager");
        h.g.b.x.f(gVar, "perfTracer");
        h.g.b.x.f(eVar, "logger");
        this.f32055d = connectivityManager;
        this.f32056e = j2;
        this.f32057f = gVar;
        this.f32058g = eVar;
        DnsResolver dnsResolver = DnsResolver.getInstance();
        h.g.b.x.e(dnsResolver, "getInstance(...)");
        this.f32059h = dnsResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // okhttp3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List d(java.lang.String r15) {
        /*
            r14 = this;
            java.lang.String r0 = "hostname"
            h.g.b.x.f(r15, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DNS lookup hostname='"
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.waze.shared_infra.i.e r1 = r14.f32058g
            r1.a(r0)
            h.g.b.aq r6 = new h.g.b.aq
            r6.<init>()
            com.waze.network.b.b r0 = com.waze.network.b.b.f31984c
            r6.f48105a = r0
            android.os.CancellationSignal r5 = new android.os.CancellationSignal
            r5.<init>()
            kotlinx.coroutines.CompletableDeferred r1 = kotlinx.coroutines.bo.j()
            r0 = r14
            com.waze.network.b.f r0 = (com.waze.network.b.f) r0     // Catch: java.lang.Throwable -> L65
            android.net.ConnectivityManager r0 = r14.f32055d     // Catch: java.lang.Throwable -> L65
            android.net.Network r8 = r0.getActiveNetwork()     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L5a
            android.net.DnsResolver r7 = r14.f32059h     // Catch: java.lang.Throwable -> L65
            java.util.concurrent.ExecutorService r0 = com.waze.network.b.f.f32054c     // Catch: java.lang.Throwable -> L65
            r11 = r0
            java.util.concurrent.Executor r11 = (java.util.concurrent.Executor) r11     // Catch: java.lang.Throwable -> L65
            com.waze.network.b.c r0 = new com.waze.network.b.c     // Catch: java.lang.Throwable -> L65
            r0.<init>(r14, r15, r1)     // Catch: java.lang.Throwable -> L65
            android.net.DnsResolver$Callback r13 = com.waze.mg$$ExternalSyntheticApiModelOutline1.m28525m(r0)     // Catch: java.lang.Throwable -> L65
            r10 = 0
            r9 = r15
            r12 = r5
            com.waze.mg$$ExternalSyntheticApiModelOutline1.m(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L56
            r4 = r9
            h.ab r15 = h.ab.f48028a     // Catch: java.lang.Throwable -> L63
            goto L6c
        L56:
            r0 = move-exception
            r4 = r9
            r5 = r12
            goto L67
        L5a:
            r4 = r15
            java.lang.RuntimeException r15 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L63
            java.lang.String r0 = "no active network"
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L63
            throw r15     // Catch: java.lang.Throwable -> L63
        L63:
            r0 = move-exception
            goto L67
        L65:
            r0 = move-exception
            r4 = r15
        L67:
            r15 = r0
            java.lang.Object r15 = e.b.c.a(r15)
        L6c:
            java.lang.Throwable r15 = h.m.c(r15)
            if (r15 == 0) goto L75
            r1.b(r15)
        L75:
            com.waze.network.b.e r2 = new com.waze.network.b.e
            r8 = 0
            r3 = r14
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            h.g.a.p r2 = (h.g.a.p) r2
            java.lang.Object r14 = kotlinx.coroutines.aj.B(r2)
            java.util.List r14 = (java.util.List) r14
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.network.b.f.d(java.lang.String):java.util.List");
    }
}
