package defpackage;

import android.view.VelocityTracker;
import com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class nbu {
    public boolean a;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public nbu(SlidingViewSwitcher slidingViewSwitcher) {
        this.d = slidingViewSwitcher;
        this.b = VelocityTracker.obtain();
        this.c = aizq.e(0, 1, 2, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(float r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.nbr
            if (r0 == 0) goto L13
            r0 = r9
            nbr r0 = (defpackage.nbr) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nbr r0 = new nbr
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r8 = r0.a
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r2 = r0.f
            nbu r4 = r0.e
            defpackage.woy.dF(r9)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.woy.dF(r9)
        L38:
            r0.e = r7
            java.lang.Object r2 = r7.d
            r9 = r2
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r9 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r9
            r0.f = r9
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r7.c
            java.lang.Object r9 = defpackage.afpt.p(r9, r0)
            if (r9 == r1) goto La2
            r4 = r7
        L4e:
            android.view.MotionEvent r9 = (android.view.MotionEvent) r9
            java.lang.Object r4 = r4.b     // Catch: java.lang.Throwable -> L9d
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4     // Catch: java.lang.Throwable -> L9d
            r4.addMovement(r9)     // Catch: java.lang.Throwable -> L9d
            yph r4 = com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.a     // Catch: java.lang.Throwable -> L9d
            yop r5 = r4.l()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r6 = "awaiting slop with event: %s"
            r5.y(r6, r9)     // Catch: java.lang.Throwable -> L9d
            int r5 = r9.getActionMasked()     // Catch: java.lang.Throwable -> L9d
            if (r5 == r3) goto L94
            r6 = 2
            if (r5 == r6) goto L6f
            r2 = 3
            if (r5 == r2) goto L94
            goto L90
        L6f:
            float r5 = r9.getRawX()     // Catch: java.lang.Throwable -> L9d
            float r5 = r5 - r8
            float r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L9d
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r2 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r2     // Catch: java.lang.Throwable -> L9d
            int r2 = r2.d     // Catch: java.lang.Throwable -> L9d
            int r2 = defpackage.tdg.a(r5, r2)     // Catch: java.lang.Throwable -> L9d
            if (r2 <= 0) goto L90
            yop r7 = r4.l()     // Catch: java.lang.Throwable -> L9d
            java.lang.String r8 = "Exceeded slop"
            r7.u(r8)     // Catch: java.lang.Throwable -> L9d
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L9d
            goto L99
        L90:
            r9.recycle()
            goto L38
        L94:
            r7 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L9d
        L99:
            r9.recycle()
            return r7
        L9d:
            r7 = move-exception
            r9.recycle()
            throw r7
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbu.a(float, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096 A[Catch: all -> 0x0157, TRY_ENTER, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v3, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:18:0x0057). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(float r20, defpackage.afck r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbu.b(float, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (((com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r11).c(r12, r2, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1 A[Catch: all -> 0x003c, PHI: r12
  0x00a1: PHI (r12v12 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x009f, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:16:0x0038, B:37:0x00a1, B:21:0x0041, B:29:0x0089, B:31:0x0091, B:35:0x0097, B:24:0x0076, B:26:0x007e), top: B:46:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.MotionEvent r11, defpackage.afck r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.nbt
            if (r0 == 0) goto L13
            r0 = r12
            nbt r0 = (defpackage.nbt) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nbt r0 = new nbt
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L45
            if (r2 == r7) goto L3f
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            defpackage.woy.dF(r12)
            goto Lba
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.woy.dF(r12)     // Catch: java.lang.Throwable -> L3c
            goto La1
        L3c:
            r11 = move-exception
            goto Lc9
        L3f:
            float r11 = r0.a
            defpackage.woy.dF(r12)     // Catch: java.lang.Throwable -> L3c
            goto L89
        L45:
            defpackage.woy.dF(r12)
            java.lang.Object r12 = r10.b
            android.view.VelocityTracker r12 = (android.view.VelocityTracker) r12
            r12.clear()
            r12.addMovement(r11)
            java.lang.Object r12 = r10.d
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r12 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r12
            android.view.View r12 = r12.a()
            float r2 = r11.getRawX()
            float r8 = r12.getTranslationX()
            float r2 = r2 + r8
            r11.recycle()
            yph r11 = com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.a
            yop r11 = r11.l()
            tdg r8 = new tdg
            r8.<init>(r2)
            java.lang.String r9 = "Begin gesture. initialTouchX: %s, target: %s"
            r11.M(r9, r8, r12)
            float r11 = r12.getTranslationX()     // Catch: java.lang.Throwable -> L3c
            int r11 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r11 != 0) goto L97
            r0.a = r2     // Catch: java.lang.Throwable -> L3c
            r0.d = r7     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r12 = r10.a(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r12 == r1) goto Lc8
            r11 = r2
        L89:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L3c
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r12 != 0) goto L96
            afak r11 = defpackage.afak.a     // Catch: java.lang.Throwable -> L3c
            r10.a = r6
            return r11
        L96:
            r2 = r11
        L97:
            r10.a = r7     // Catch: java.lang.Throwable -> L3c
            r0.d = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r12 = r10.b(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r12 == r1) goto Lc8
        La1:
            nbo r12 = (defpackage.nbo) r12     // Catch: java.lang.Throwable -> L3c
            r10.a = r6
            java.lang.Object r11 = r10.d
            java.lang.Object r2 = r10.b
            android.view.VelocityTracker r2 = (android.view.VelocityTracker) r2
            float r2 = r2.getXVelocity()
            r0.d = r4
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r11 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r11
            java.lang.Object r11 = r11.c(r12, r2, r0)
            if (r11 != r1) goto Lba
            goto Lc8
        Lba:
            java.lang.Object r10 = r10.d
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r10 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r10
            r11 = 0
            r10.j(r11)
            r10.i(r3)
            afak r10 = defpackage.afak.a
            return r10
        Lc8:
            return r1
        Lc9:
            r10.a = r6
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbu.c(android.view.MotionEvent, afck):java.lang.Object");
    }

    public final void d() throws IOException {
        ((hsw) this.d).i(this, false);
    }

    public final void e() {
        if (this.a) {
            return;
        }
        try {
            d();
        } catch (IOException unused) {
        }
    }

    public final ajnr f(int i) {
        ajnr ajnrVar;
        Object obj = this.d;
        synchronized (obj) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            Object obj2 = ((frc) this.b).d.get(i);
            ajnrVar = (ajnr) obj2;
            a.ba(((frf) obj).h, ajnrVar);
            obj2.getClass();
        }
        return ajnrVar;
    }

    public final void g(boolean z) {
        Object obj = this.d;
        synchronized (obj) {
            if (this.a) {
                throw new IllegalStateException("editor is closed");
            }
            if (affa.f(((frc) this.b).i, this)) {
                ((frf) obj).h(this, z);
            }
            this.a = true;
        }
    }

    public nbu(hsw hswVar, hsv hsvVar) {
        this.d = hswVar;
        this.b = hsvVar;
        this.c = hsvVar.e ? null : new boolean[hswVar.d];
    }

    public nbu(frf frfVar, frc frcVar) {
        this.d = frfVar;
        this.b = frcVar;
        this.c = new boolean[2];
    }
}
