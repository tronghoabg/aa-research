package com.waze.main_screen;

import androidx.core.app.NotificationCompat;
import com.waze.bw.c.d.a.bp;
import com.waze.bw.c.d.bl;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.z.a.b.ab f25615a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.bw.c.c.x f25616b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.bw.c.c.a f25617c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f25618d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f25619e;

    /* renamed from: f, reason: collision with root package name */
    private final ch f25620f;

    public ab(boolean z, com.waze.z.a.b.ab abVar, com.waze.bw.c.c.x xVar, com.waze.bw.c.c.a aVar, h.g.a.a aVar2) {
        h.g.b.x.f(abVar, "wazeBottomSheetState");
        h.g.b.x.f(xVar, "startStateMobileStateHolder");
        h.g.b.x.f(aVar, "startStateActionsHandler");
        h.g.b.x.f(aVar2, "onSheetEvent");
        this.f25615a = abVar;
        this.f25616b = xVar;
        this.f25617c = aVar;
        this.f25618d = aVar2;
        this.f25619e = z;
        this.f25620f = xVar.b();
    }

    public final float a() {
        return this.f25615a.b();
    }

    public final float b() {
        return this.f25615a.c();
    }

    public final com.waze.z.a.b.ab c() {
        return this.f25615a;
    }

    public final com.waze.z.a.b.ad d() {
        return this.f25615a.h();
    }

    public final com.waze.z.a.b.ad e() {
        return this.f25615a.i();
    }

    public final Float h(com.waze.z.a.b.ad adVar) {
        h.g.b.x.f(adVar, "wazeBottomSheetValue");
        return this.f25615a.j(adVar);
    }

    public final Object i(h.c.e eVar) {
        Object objK = this.f25615a.k(eVar);
        return objK == h.c.a.a.f48038a ? objK : h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r5, androidx.activity.compose.ManagedActivityResultLauncher r6, androidx.activity.compose.ManagedActivityResultLauncher r7, h.c.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.waze.main_screen.z
            if (r0 == 0) goto L13
            r0 = r8
            com.waze.main_screen.z r0 = (com.waze.main_screen.z) r0
            int r1 = r0.f27886c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27886c = r1
            goto L18
        L13:
            com.waze.main_screen.z r0 = new com.waze.main_screen.z
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f27884a
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f27886c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r8)
            goto L48
        L2f:
            e.b.c.b(r8)
            com.waze.bw.c.c.x r8 = r4.f25616b
            kotlinx.coroutines.b.bq r8 = r8.a()
            com.waze.main_screen.aa r2 = new com.waze.main_screen.aa
            r2.<init>(r4, r5, r6, r7)
            kotlinx.coroutines.b.l r2 = (kotlinx.coroutines.b.l) r2
            r0.f27886c = r3
            java.lang.Object r4 = r8.collect(r2, r0)
            if (r4 != r1) goto L48
            return r1
        L48:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.ab.j(android.content.Context, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, h.c.e):java.lang.Object");
    }

    public final ch k() {
        return this.f25620f;
    }

    public final void l(bp bpVar) {
        h.g.b.x.f(bpVar, NotificationCompat.CATEGORY_EVENT);
        this.f25616b.d(new com.waze.bw.c.c.v(bpVar));
    }

    public final void m(bl blVar) {
        h.g.b.x.f(blVar, NotificationCompat.CATEGORY_EVENT);
        this.f25618d.invoke();
        this.f25616b.d(new com.waze.bw.c.c.w(blVar));
    }

    public final void n() {
        if (this.f25619e) {
            return;
        }
        this.f25616b.d(new com.waze.bw.c.c.w(com.waze.bw.c.d.bc.f17983a));
        this.f25619e = true;
    }
}
