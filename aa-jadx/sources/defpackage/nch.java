package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nch {
    public boolean a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;

    public nch(com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher slidingViewSwitcher) {
        this.d = slidingViewSwitcher;
        this.b = android.view.VelocityTracker.obtain();
        this.c = defpackage.ajap.e(0, 1, 2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0068  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:19:0x0050, B:26:0x006f, B:28:0x0082, B:31:0x0092), top: B:38:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:19:0x0050, B:26:0x006f, B:28:0x0082, B:31:0x0092), top: B:38:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[Catch: all -> 0x0098, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:19:0x0050, B:26:0x006f, B:28:0x0082, B:31:0x0092), top: B:38:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [aizj, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004d -> B:18:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(float r8, defpackage.afdk r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.nce
            if (r0 == 0) goto L13
            r0 = r9
            nce r0 = (defpackage.nce) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            nce r0 = new nce
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            afdr r1 = defpackage.afdr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r8 = r0.a
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r2 = r0.f
            nch r4 = r0.e
            defpackage.afga.cz(r9)
            goto L4e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.afga.cz(r9)
        L38:
            r0.e = r7
            java.lang.Object r2 = r7.d
            r9 = r2
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r9 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r9
            r0.f = r9
            r0.a = r8
            r0.d = r3
            java.lang.Object r9 = r7.c
            java.lang.Object r9 = defpackage.afsg.w(r9, r0)
            if (r9 == r1) goto L9d
            r4 = r7
        L4e:
            android.view.MotionEvent r9 = (android.view.MotionEvent) r9
            java.lang.Object r4 = r4.b     // Catch: java.lang.Throwable -> L98
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4     // Catch: java.lang.Throwable -> L98
            r4.addMovement(r9)     // Catch: java.lang.Throwable -> L98
            yqm r4 = com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher.a     // Catch: java.lang.Throwable -> L98
            ypu r5 = r4.l()     // Catch: java.lang.Throwable -> L98
            java.lang.String r6 = "awaiting slop with event: %s"
            r5.y(r6, r9)     // Catch: java.lang.Throwable -> L98
            int r5 = r9.getActionMasked()     // Catch: java.lang.Throwable -> L98
            if (r5 == r3) goto L92
            r6 = 2
            if (r5 == r6) goto L6f
            r2 = 3
            if (r5 == r2) goto L92
            goto L8e
        L6f:
            float r5 = r9.getRawX()     // Catch: java.lang.Throwable -> L98
            float r5 = r5 - r8
            float r5 = java.lang.Math.abs(r5)     // Catch: java.lang.Throwable -> L98
            com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher r2 = (com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r2     // Catch: java.lang.Throwable -> L98
            int r2 = r2.d     // Catch: java.lang.Throwable -> L98
            int r2 = defpackage.ted.a(r5, r2)     // Catch: java.lang.Throwable -> L98
            if (r2 <= 0) goto L8e
            ypu r7 = r4.l()     // Catch: java.lang.Throwable -> L98
            java.lang.String r8 = "Exceeded slop"
            r7.u(r8)     // Catch: java.lang.Throwable -> L98
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L98
            goto L94
        L8e:
            r9.recycle()
            goto L38
        L92:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L98
        L94:
            r9.recycle()
            return r7
        L98:
            r7 = move-exception
            r9.recycle()
            throw r7
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nch.a(float, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0096 A[Catch: all -> 0x0157, TRY_ENTER, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0115 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012a A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x012d A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:63:0x0135 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138 A[Catch: all -> 0x0157, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0142 A[Catch: all -> 0x0157, TRY_LEAVE, TryCatch #0 {all -> 0x0157, blocks: (B:19:0x0059, B:26:0x0072, B:27:0x0076, B:29:0x007e, B:34:0x008c, B:32:0x0087, B:33:0x008a, B:36:0x0096, B:40:0x00b9, B:44:0x00c9, B:48:0x00e0, B:51:0x0115, B:65:0x013a, B:67:0x0142, B:63:0x0135, B:64:0x0138, B:56:0x0120, B:57:0x0123, B:59:0x012a, B:60:0x012d), top: B:76:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v3, types: [aizj, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0053 -> B:18:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(float r20, defpackage.afdk r21) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nch.b(float, afdk):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a1 A[Catch: all -> 0x003c, PHI: r12
  0x00a1: PHI (r12v12 java.lang.Object) = (r12v8 java.lang.Object), (r12v1 java.lang.Object) binds: [B:36:0x009f, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:16:0x0038, B:37:0x00a1, B:21:0x0041, B:29:0x0089, B:31:0x0091, B:35:0x0097, B:24:0x0076, B:26:0x007e), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (((com.google.android.apps.auto.components.system.dashboard.media.switcher.SlidingViewSwitcher) r11).c(r12, r2, r0) == r1) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.view.MotionEvent r11, defpackage.afdk r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nch.c(android.view.MotionEvent, afdk):java.lang.Object");
    }

    public final void d() throws java.io.IOException {
        ((defpackage.htg) this.d).i(this, false);
    }

    public final void e() {
        if (this.a) {
            return;
        }
        try {
            d();
        } catch (java.io.IOException unused) {
        }
    }

    public final defpackage.ajor f(int i) {
        defpackage.ajor ajorVar;
        java.lang.Object obj = this.d;
        synchronized (obj) {
            if (this.a) {
                throw new java.lang.IllegalStateException("editor is closed");
            }
            ((boolean[]) this.c)[i] = true;
            java.lang.Object obj2 = ((defpackage.frl) this.b).d.get(i);
            ajorVar = (defpackage.ajor) obj2;
            defpackage.ly.x(((defpackage.fro) obj).h, ajorVar);
            obj2.getClass();
        }
        return ajorVar;
    }

    public final void g(boolean z) {
        java.lang.Object obj = this.d;
        synchronized (obj) {
            if (this.a) {
                throw new java.lang.IllegalStateException("editor is closed");
            }
            if (defpackage.afga.f(((defpackage.frl) this.b).i, this)) {
                ((defpackage.fro) obj).h(this, z);
            }
            this.a = true;
        }
    }

    public nch(defpackage.htg htgVar, defpackage.hte hteVar) {
        this.d = htgVar;
        this.b = hteVar;
        this.c = hteVar.c ? null : new boolean[htgVar.d];
    }

    public nch(defpackage.fro froVar, defpackage.frl frlVar) {
        this.d = froVar;
        this.b = frlVar;
        this.c = new boolean[2];
    }
}
