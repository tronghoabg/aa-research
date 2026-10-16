package com.vungle.ads.internal.signals;

import android.content.Context;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f33657a;

    /* renamed from: b, reason: collision with root package name */
    public final Xf.c f33658b;

    /* renamed from: c, reason: collision with root package name */
    public long f33659c;

    /* renamed from: d, reason: collision with root package name */
    public long f33660d;

    /* renamed from: e, reason: collision with root package name */
    public long f33661e;

    /* renamed from: f, reason: collision with root package name */
    public int f33662f;

    /* renamed from: g, reason: collision with root package name */
    public long f33663g;

    /* renamed from: h, reason: collision with root package name */
    public c f33664h;

    /* renamed from: i, reason: collision with root package name */
    public ConcurrentHashMap f33665i;

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC2525i f33666j;
    public com.vungle.ads.internal.session.b k;

    public j(Context context) {
        AbstractC3340k.e(context, "context");
        this.f33657a = context;
        this.f33658b = Fe.e.a(e.f33652a);
        this.f33660d = System.currentTimeMillis();
        this.f33662f = -1;
        this.f33665i = new ConcurrentHashMap();
        EnumC2526j enumC2526j = EnumC2526j.f34667a;
        this.f33666j = Fe.c.y(enumC2526j, new g(context));
        e();
        this.f33663g = c().a("vungle_signal_session_creation_time", -1L);
        f();
        this.f33664h = new c(this.f33662f);
        com.vungle.ads.internal.session.b bVar = new com.vungle.ads.internal.session.b(context, this.f33664h.a(), a(Fe.c.y(enumC2526j, new h(context))), b(Fe.c.y(enumC2526j, new i(context))));
        this.k = bVar;
        this.f33664h.a(bVar.b());
        boolean z2 = u.f33874a;
        t.a("SignalManager", new d(this));
        try {
            this.f33664h.a(!com.vungle.ads.internal.platform.e.a() ? 1 : 0);
            this.f33664h.e(com.vungle.ads.internal.platform.e.f(context) ? 1 : 0);
            this.f33664h.c(com.vungle.ads.internal.platform.e.d(context) ? 1 : 0);
            this.f33664h.d(com.vungle.ads.internal.platform.e.c(context));
            this.f33664h.b(com.vungle.ads.internal.platform.e.e(context) ? 1 : 0);
        } catch (Exception e7) {
            boolean z10 = u.f33874a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("Failed to collect device signals: ");
            sbA.append(e7.getLocalizedMessage());
            t.b("SignalManager", sbA.toString());
        }
    }

    public final c b() {
        return this.f33664h;
    }

    public final FilePreferences c() {
        return (FilePreferences) this.f33666j.getValue();
    }

    public final String d() {
        return this.f33664h.f33641b;
    }

    public final void e() {
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f33838f;
        com.vungle.ads.internal.util.a.a(new f(this));
    }

    public final void f() {
        if (this.f33662f == -1) {
            this.f33662f = c().a("vungle_signal_session_count", 0);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j8 = this.f33663g;
        long j10 = jCurrentTimeMillis - j8;
        if (j8 < 0 || j10 >= 86400000) {
            this.f33662f = 1;
            c().b("vungle_signal_session_creation_time", jCurrentTimeMillis);
            this.f33663g = jCurrentTimeMillis;
        } else {
            this.f33662f++;
        }
        c().b("vungle_signal_session_count", this.f33662f);
        c().b();
    }

    public static final com.vungle.ads.internal.executor.a a(InterfaceC2525i interfaceC2525i) {
        return (com.vungle.ads.internal.executor.a) interfaceC2525i.getValue();
    }

    public static final PathProvider b(InterfaceC2525i interfaceC2525i) {
        return (PathProvider) interfaceC2525i.getValue();
    }

    public final synchronized m a(String placementId) {
        long jCurrentTimeMillis;
        Long l10;
        try {
            AbstractC3340k.e(placementId, "placementId");
            jCurrentTimeMillis = System.currentTimeMillis();
            l10 = this.f33665i.containsKey(placementId) ? (Long) this.f33665i.get(placementId) : null;
            this.f33665i.put(placementId, Long.valueOf(jCurrentTimeMillis));
        } catch (Throwable th) {
            throw th;
        }
        return new m(l10, jCurrentTimeMillis);
    }

    public final void b(r3 unclosedAd) {
        AbstractC3340k.e(unclosedAd, "unclosedAd");
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.r()) {
            return;
        }
        this.k.b(unclosedAd);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.f33664h.f33643d.isEmpty()) {
            return;
        }
        ((m) this.f33664h.f33643d.get(0)).f33671c = str;
    }

    public final void a(r3 unclosedAd) {
        AbstractC3340k.e(unclosedAd, "unclosedAd");
        ConfigManager.INSTANCE.getClass();
        if (ConfigManager.r()) {
            return;
        }
        this.k.a(unclosedAd);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[PHI: r2
  0x0046: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:19:0x0050, B:14:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r4, com.vungle.ads.internal.signals.m r5) {
        /*
            r3 = this;
            java.lang.String r0 = "signaledAd"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            com.vungle.ads.internal.signals.c r0 = r3.f33664h
            java.util.List r0 = r0.b()
            r0.clear()
            com.vungle.ads.internal.signals.c r0 = r3.f33664h
            java.util.List r0 = r0.b()
            r0.add(r5)
            com.vungle.ads.internal.signals.c r5 = r3.f33664h
            java.util.List r5 = r5.b()
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            com.vungle.ads.internal.signals.m r5 = (com.vungle.ads.internal.signals.m) r5
            if (r4 != 0) goto L28
            android.content.Context r4 = r3.f33657a
        L28:
            android.content.res.Resources r4 = r4.getResources()
            if (r4 == 0) goto L3b
            android.content.res.Configuration r4 = r4.getConfiguration()
            if (r4 == 0) goto L3b
            int r4 = r4.orientation
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L3c
        L3b:
            r4 = 0
        L3c:
            if (r4 != 0) goto L3f
            goto L48
        L3f:
            int r1 = r4.intValue()
            r2 = 2
            if (r1 != r2) goto L48
        L46:
            r0 = r2
            goto L5e
        L48:
            if (r4 != 0) goto L4b
            goto L53
        L4b:
            int r1 = r4.intValue()
            r2 = 1
            if (r1 != r2) goto L53
            goto L46
        L53:
            if (r4 != 0) goto L56
            goto L5d
        L56:
            int r4 = r4.intValue()
            if (r4 != 0) goto L5d
            goto L5e
        L5d:
            r0 = -1
        L5e:
            r5.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.signals.j.a(android.content.Context, com.vungle.ads.internal.signals.m):void");
    }

    public final String a() {
        this.f33664h.f33644e = (System.currentTimeMillis() + this.f33661e) - this.f33660d;
        try {
            Xf.c cVar = this.f33658b;
            return "2:".concat(cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(c.class)), this.f33664h));
        } catch (Throwable unused) {
            return null;
        }
    }
}
