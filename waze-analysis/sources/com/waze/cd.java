package com.waze;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.waze.config.ConfigValues;
import j$.time.Instant;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cd extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    public final bz f22131a;

    /* renamed from: b, reason: collision with root package name */
    public final LiveData f22132b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.q.e f22133c;

    /* renamed from: d, reason: collision with root package name */
    private final p f22134d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f22135e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.am.i f22136f;

    /* renamed from: g, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f22137g;

    /* renamed from: h, reason: collision with root package name */
    private final by f22138h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f22139i;

    /* renamed from: j, reason: collision with root package name */
    private final MutableLiveData f22140j;

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public cd(com.waze.cf r5, com.waze.shared_infra.q.e r6, com.waze.p r7, com.waze.shared_infra.i.b r8, com.waze.am.i r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cd.<init>(com.waze.cf, com.waze.shared_infra.q.e, com.waze.p, com.waze.shared_infra.i.b, com.waze.am.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object c(com.waze.cd r6, h.c.e r7) {
        /*
            boolean r0 = r7 instanceof com.waze.cc
            if (r0 == 0) goto L13
            r0 = r7
            com.waze.cc r0 = (com.waze.cc) r0
            int r1 = r0.f22130c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22130c = r1
            goto L18
        L13:
            com.waze.cc r0 = new com.waze.cc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f22128a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f22130c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L8a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            e.b.c.b(r7)
            com.waze.by r7 = r6.f22138h
            boolean r7 = r7.b()
            r2 = 0
            if (r7 != 0) goto L40
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        L40:
            kotlinx.coroutines.b.bn r7 = r6.f22139i
            java.lang.Object r4 = r7.d()
            com.waze.cb r4 = (com.waze.cb) r4
            com.waze.cb r5 = com.waze.cb.f22055a
            int r4 = r4.ordinal()
            if (r4 == 0) goto L72
            if (r4 == r3) goto L5f
            r6 = 2
            if (r4 == r6) goto L5f
            r6 = 3
            if (r4 != r6) goto L59
            goto L8a
        L59:
            h.i r6 = new h.i
            r6.<init>()
            throw r6
        L5f:
            kotlinx.coroutines.b.k r7 = (kotlinx.coroutines.b.k) r7
            com.waze.mb r6 = new com.waze.mb
            r2 = 0
            r6.<init>(r2, r3, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.f22130c = r3
            java.lang.Object r6 = kotlinx.coroutines.b.ai.i(r7, r6, r0)
            if (r6 != r1) goto L8a
            return r1
        L72:
            com.waze.shared_infra.i.e r7 = r6.f22137g
            java.lang.String r0 = "no signal from the OS splash, and app is ready. can't hold forever. give up and continue"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r7.g(r0)
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "OS splash was not running and app already finished initialization"
            r7.<init>(r0)
            com.waze.shared_infra.i.b r6 = r6.f22135e
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            com.waze.shared_infra.h.b.f(r6, r7)
            r3 = r2
        L8a:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.cd.c(com.waze.cd, h.c.e):java.lang.Object");
    }

    public final void d() {
        this.f22139i.e(cb.f22058d);
    }

    public final void e() {
        this.f22139i.e(cb.f22057c);
        Instant instantB = this.f22133c.b();
        h.g.b.x.f(instantB, "time");
        ConfigValues.CONFIG_VALUE_APP_LAUNCH_DYNAMIC_SPLASH_SCREEN_LAST_SHOWN_UTC_SECONDS.d(Long.valueOf(instantB.getEpochSecond()));
        this.f22134d.d(this.f22138h.a());
    }

    public final void f() {
        this.f22139i.e(cb.f22056b);
    }

    public final boolean g() {
        return this.f22138h.b();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (this.f22138h.b()) {
            cb cbVar = (cb) this.f22139i.d();
            cb cbVar2 = cb.f22055a;
            int iOrdinal = cbVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                throw new h.i();
            }
            this.f22134d.c();
        }
    }
}
