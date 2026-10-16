package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import ba.C1521a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC1724m;
import com.google.android.gms.common.internal.C1733w;
import com.google.android.gms.common.internal.C1734x;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.C2713b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import n7.AbstractC3598c;
import p7.AbstractC3772b;
import x.C4413f;

/* renamed from: com.google.android.gms.common.api.internal.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1695i implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f26527p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f26528q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f26529r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static C1695i f26530s;

    /* renamed from: a, reason: collision with root package name */
    public long f26531a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f26532b;

    /* renamed from: c, reason: collision with root package name */
    public C1735y f26533c;

    /* renamed from: d, reason: collision with root package name */
    public C2713b f26534d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f26535e;

    /* renamed from: f, reason: collision with root package name */
    public final d7.e f26536f;

    /* renamed from: g, reason: collision with root package name */
    public final C1521a f26537g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f26538h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f26539i;

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f26540j;
    public E k;

    /* renamed from: l, reason: collision with root package name */
    public final C4413f f26541l;

    /* renamed from: m, reason: collision with root package name */
    public final C4413f f26542m;

    /* renamed from: n, reason: collision with root package name */
    public final zau f26543n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f26544o;

    public C1695i(Context context, Looper looper) {
        d7.e eVar = d7.e.f34127d;
        this.f26531a = 10000L;
        this.f26532b = false;
        this.f26538h = new AtomicInteger(1);
        this.f26539i = new AtomicInteger(0);
        this.f26540j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.f26541l = new C4413f(0);
        this.f26542m = new C4413f(0);
        this.f26544o = true;
        this.f26535e = context;
        zau zauVar = new zau(looper, this);
        this.f26543n = zauVar;
        this.f26536f = eVar;
        this.f26537g = new C1521a(2);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC3598c.f40928g == null) {
            AbstractC3598c.f40928g = Boolean.valueOf(AbstractC3598c.h() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (AbstractC3598c.f40928g.booleanValue()) {
            this.f26544o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f26529r) {
            try {
                C1695i c1695i = f26530s;
                if (c1695i != null) {
                    c1695i.f26539i.incrementAndGet();
                    zau zauVar = c1695i.f26543n;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status e(C1688b c1688b, d7.b bVar) {
        return new Status(17, N0.a.h("API: ", c1688b.f26506b.f26436c, " is not available on this device. Connection failed with: ", String.valueOf(bVar)), bVar.f34116c, bVar);
    }

    public static C1695i h(Context context) {
        C1695i c1695i;
        synchronized (f26529r) {
            try {
                if (f26530s == null) {
                    Looper looper = AbstractC1724m.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = d7.e.f34126c;
                    f26530s = new C1695i(applicationContext, looper);
                }
                c1695i = f26530s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1695i;
    }

    public final void b(E e7) {
        synchronized (f26529r) {
            try {
                if (this.k != e7) {
                    this.k = e7;
                    this.f26541l.clear();
                }
                this.f26541l.addAll(e7.f26449e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        if (this.f26532b) {
            return false;
        }
        C1734x c1734x = (C1734x) C1733w.c().f26696a;
        if (c1734x != null && !c1734x.f26698b) {
            return false;
        }
        int i5 = ((SparseIntArray) this.f26537g.f19414b).get(203400000, -1);
        return i5 == -1 || i5 == 0;
    }

    public final boolean d(d7.b bVar, int i5) {
        d7.e eVar = this.f26536f;
        eVar.getClass();
        Context context = this.f26535e;
        if (!AbstractC3772b.H(context)) {
            int i10 = bVar.f34115b;
            PendingIntent activity = bVar.f34116c;
            if (!((i10 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = eVar.b(context, i10, null);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i11 = GoogleApiActivity.f26420b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i5);
                intent.putExtra("notify_manager", true);
                eVar.h(context, i10, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    public final H f(com.google.android.gms.common.api.l lVar) {
        ConcurrentHashMap concurrentHashMap = this.f26540j;
        C1688b apiKey = lVar.getApiKey();
        H h10 = (H) concurrentHashMap.get(apiKey);
        if (h10 == null) {
            h10 = new H(this, lVar);
            concurrentHashMap.put(apiKey, h10);
        }
        if (h10.f26455b.requiresSignIn()) {
            this.f26542m.add(apiKey);
        }
        h10.k();
        return h10;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, com.google.android.gms.common.api.l r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L7d
            com.google.android.gms.common.api.internal.b r3 = r11.getApiKey()
            boolean r11 = r8.c()
            if (r11 != 0) goto Ld
            goto L4b
        Ld:
            com.google.android.gms.common.internal.w r11 = com.google.android.gms.common.internal.C1733w.c()
            java.lang.Object r11 = r11.f26696a
            com.google.android.gms.common.internal.x r11 = (com.google.android.gms.common.internal.C1734x) r11
            r0 = 1
            if (r11 == 0) goto L4e
            boolean r1 = r11.f26698b
            if (r1 == 0) goto L4b
            j$.util.concurrent.ConcurrentHashMap r1 = r8.f26540j
            java.lang.Object r1 = r1.get(r3)
            com.google.android.gms.common.api.internal.H r1 = (com.google.android.gms.common.api.internal.H) r1
            if (r1 == 0) goto L48
            com.google.android.gms.common.api.g r2 = r1.f26455b
            boolean r4 = r2 instanceof com.google.android.gms.common.internal.AbstractC1717f
            if (r4 == 0) goto L4b
            com.google.android.gms.common.internal.f r2 = (com.google.android.gms.common.internal.AbstractC1717f) r2
            boolean r4 = r2.hasConnectionInfo()
            if (r4 == 0) goto L48
            boolean r4 = r2.isConnecting()
            if (r4 != 0) goto L48
            com.google.android.gms.common.internal.j r11 = com.google.android.gms.common.api.internal.M.e(r1, r2, r10)
            if (r11 == 0) goto L4b
            int r2 = r1.f26464l
            int r2 = r2 + r0
            r1.f26464l = r2
            boolean r0 = r11.f26654c
            goto L4e
        L48:
            boolean r0 = r11.f26699c
            goto L4e
        L4b:
            r10 = 0
            r1 = r8
            goto L68
        L4e:
            com.google.android.gms.common.api.internal.M r11 = new com.google.android.gms.common.api.internal.M
            r1 = 0
            if (r0 == 0) goto L59
            long r4 = java.lang.System.currentTimeMillis()
            goto L5a
        L59:
            r4 = r1
        L5a:
            if (r0 == 0) goto L60
            long r1 = android.os.SystemClock.elapsedRealtime()
        L60:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L68:
            if (r10 == 0) goto L7e
            com.google.android.gms.tasks.Task r9 = r9.getTask()
            com.google.android.gms.internal.base.zau r11 = r1.f26543n
            r11.getClass()
            A7.V0 r0 = new A7.V0
            r2 = 2
            r0.<init>(r11, r2)
            r9.addOnCompleteListener(r0, r10)
            return
        L7d:
            r1 = r8
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1695i.g(com.google.android.gms.tasks.TaskCompletionSource, int, com.google.android.gms.common.api.l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0310  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1695i.handleMessage(android.os.Message):boolean");
    }

    public final Task i(com.google.android.gms.common.api.l lVar, AbstractC1706u abstractC1706u, B b5, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g(taskCompletionSource, abstractC1706u.f26556c, lVar);
        O o7 = new O(new a0(new P(abstractC1706u, b5, runnable), taskCompletionSource), this.f26539i.get(), lVar);
        zau zauVar = this.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(8, o7));
        return taskCompletionSource.getTask();
    }

    public final void j(d7.b bVar, int i5) {
        if (d(bVar, i5)) {
            return;
        }
        zau zauVar = this.f26543n;
        zauVar.sendMessage(zauVar.obtainMessage(5, i5, 0, bVar));
    }
}
