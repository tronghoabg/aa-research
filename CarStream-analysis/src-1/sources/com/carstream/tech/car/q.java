package com.carstream.tech.car;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class q implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ t g;

    public q(t tVar, String str, String str2, String str3, long j, long j2, boolean z) {
        this.g = tVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            com.carstream.tech.car.t r0 = r10.g
            com.carstream.tech.car.CarScreen r1 = r0.a
            boolean r0 = r1.pageTrusted()
            if (r0 != 0) goto Lb
            return
        Lb:
            u6 r2 = r1.carHooks
            long r7 = r10.e
            boolean r9 = r10.f
            java.lang.String r3 = r10.b
            java.lang.String r4 = r10.c
            long r5 = r10.d
            defpackage.z6.t(r2, r3, r4, r5, r7, r9)
            l3 r0 = r1.controlBar
            s8 r0 = r0.d
            boolean r2 = r10.f
            if (r0 == 0) goto L25
            r0.c(r2)
        L25:
            com.carstream.tech.car.u r0 = r1.keeper
            if (r2 != 0) goto L37
            r0.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.e
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L37
            goto L3a
        L37:
            r0.c(r2)
        L3a:
            r1.keepAliveWanted = r2
            long r5 = r10.d
            long r7 = r10.e
            java.lang.String r2 = r10.a
            java.lang.String r3 = r10.b
            java.lang.String r4 = r10.c
            r1.recordWatch(r2, r3, r4, r5, r7)
            r1.tickHome()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carstream.tech.car.q.run():void");
    }
}
