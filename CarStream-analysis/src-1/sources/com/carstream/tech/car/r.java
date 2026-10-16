package com.carstream.tech.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class r implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ t c;

    public /* synthetic */ r(t tVar, boolean z, int i) {
        this.a = i;
        this.c = tVar;
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L33;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            com.carstream.tech.car.t r0 = r7.c
            com.carstream.tech.car.CarScreen r1 = r0.a
            boolean r1 = r1.pageTrusted()
            if (r1 != 0) goto L10
            goto L1b
        L10:
            com.carstream.tech.car.CarScreen r0 = r0.a
            boolean r1 = r7.b
            r0.pageControlsShown = r1
            dd r1 = r0.currentApp
            r0.syncControlBar(r1)
        L1b:
            return
        L1c:
            com.carstream.tech.car.t r0 = r7.c
            com.carstream.tech.car.CarScreen r1 = r0.a
            boolean r1 = r1.pageTrusted()
            if (r1 != 0) goto L27
            goto L32
        L27:
            com.carstream.tech.car.CarScreen r0 = r0.a
            boolean r1 = r7.b
            r0.pageOverlayShown = r1
            dd r1 = r0.currentApp
            r0.syncControlBar(r1)
        L32:
            return
        L33:
            com.carstream.tech.car.t r0 = r7.c
            com.carstream.tech.car.CarScreen r0 = r0.a
            boolean r1 = r0.choPhepBaoTrangThaiPhat()
            if (r1 != 0) goto L3e
            goto L68
        L3e:
            boolean r1 = r7.b
            r0.keepAliveWanted = r1
            l3 r2 = r0.controlBar
            s8 r2 = r2.d
            if (r2 == 0) goto L4b
            r2.c(r1)
        L4b:
            com.carstream.tech.car.u r2 = r0.keeper
            if (r1 != 0) goto L5d
            r2.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r2.e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L5d
            goto L60
        L5d:
            r2.c(r1)
        L60:
            u6 r2 = r0.carHooks
            defpackage.z6.u(r2, r1)
            r0.tickHome()
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.car.r.run():void");
    }
}
