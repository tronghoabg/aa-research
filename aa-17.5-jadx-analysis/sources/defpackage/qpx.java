package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class qpx implements qpu {
    public static final ypf a = ols.R("CAR.AUDIO.CHANNEL");
    public qpv e;
    public final qpw f;
    public final qpo[] g = new qpo[3];
    public final rek[] b = new rek[3];
    public final Object c = new Object();
    public volatile int[] d = {0, 0, 0};
    private final boolean[] h = new boolean[2];

    public qpx(qpw qpwVar) {
        this.f = qpwVar;
    }

    private final void l(int i, boolean z) {
        synchronized (this.c) {
            int[] iArr = this.d;
            if (z) {
                iArr[i] = iArr[i] | 2;
            } else {
                iArr[i] = iArr[i] & (-3);
            }
        }
    }

    private final boolean m(int i) {
        return n(i) && this.b[i].p();
    }

    private final boolean n(int i) {
        boolean z;
        synchronized (this.c) {
            z = this.d[i] == 3;
        }
        return z;
    }

    private final boolean o(int i) {
        return !n(i) || this.b[i].q();
    }

    private final boolean p(int i) {
        boolean z;
        synchronized (this.c) {
            z = (this.d[i] & 2) != 0;
        }
        return z;
    }

    private static final void q(qpo qpoVar, rek rekVar) {
        rekVar.o();
        rekVar.s(qpoVar);
        qpoVar.g(rekVar);
    }

    @Override // defpackage.qpu
    public final synchronized rek a(int i) {
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        if (n(iAc)) {
            rek rekVar = this.b[iAc];
            boolean zP = rekVar.p();
            qpo[] qpoVarArr = this.g;
            if (zP) {
                if (rekVar.s(qpoVarArr[iAc])) {
                    a.f().ai(7604).w("requestBottomHalfForStream grant to stream %d", i);
                    return rekVar;
                }
            } else if (qpoVarArr[iAc] == rekVar.r()) {
                a.h().ai(7603).w("requestBottomHalfForStream for stream:%d while it is occupying BH", i);
                return rekVar;
            }
        }
        synchronized (this.c) {
            this.h[iAc] = true;
        }
        a.d().ai(7602).w("requestBottomHalfForStream no stream available for stream %d", i);
        qpv qpvVar = this.e;
        qpvVar.getClass();
        qpvVar.a(500L);
        return null;
    }

    @Override // defpackage.qpu
    public final synchronized void b(int i) {
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        synchronized (this.c) {
            this.h[iAc] = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r3 != r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        if (r4 != r12) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    @Override // defpackage.qpu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r22, boolean r23, defpackage.rem r24) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpx.c(boolean, boolean, rem):void");
    }

    @Override // defpackage.qpu
    public final synchronized void d(int i) {
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        synchronized (this.c) {
            this.h[iAc] = true;
        }
    }

    public final void e(int i) {
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        boolean zP = p(iAc);
        a.f().ai(7576).N("disabling stream: %s, had focus: %b", roc.O(i), zP);
        if (zP) {
            l(iAc, false);
        }
    }

    public final void f() {
        rek rekVar;
        for (int i = 0; i < 3; i++) {
            if (!n(i) && (rekVar = this.b[i]) != null) {
                rekVar.d();
            }
        }
    }

    public final void g(rem remVar) {
        ypf ypfVar = a;
        ypfVar.d().ai(7577).u("doHandleBottomHalfRequest");
        int i = 1;
        while (i >= 0) {
            Object obj = this.c;
            synchronized (obj) {
                boolean[] zArr = this.h;
                if (zArr[i]) {
                    ypfVar.d().ai(7578).w("Getting bottom half for stream: %d", i);
                    int i2 = i == 0 ? 1 : 0;
                    rek rekVar = null;
                    if (m(i)) {
                        ypfVar.d().ai(7586).w("Bottom half available for stream: %d", i);
                        rek[] rekVarArr = this.b;
                        if (rekVarArr[i].s(this.g[i])) {
                            rekVar = rekVarArr[i];
                        }
                    } else if (n(i2)) {
                        ypfVar.d().ai(7581).w("Alternative stream %d is enabled", i2);
                        if (m(i2)) {
                            ypfVar.d().ai(7582).u("Bottom half for alternative stream available");
                            if (n(i)) {
                                rek[] rekVarArr2 = this.b;
                                qpo qpoVarR = rekVarArr2[i].r();
                                ypfVar.d().ai(7584).y("Switching clients. Client: %s", qpoVarR);
                                if (qpoVarR != null) {
                                    int i3 = qpoVarR.c;
                                    ypf ypfVar2 = qqv.a;
                                    if (a.ac(i3) == i2) {
                                        if (rekVarArr2[i2].s(qpoVarR)) {
                                            ypfVar.d().ai(7585).R("AudioSourceService %s switches bottom half from %d to %d", qpoVarR, Integer.valueOf(i), Integer.valueOf(i2));
                                            qpoVarR.g(rekVarArr2[i2]);
                                        }
                                        if (rekVarArr2[i].s(this.g[i])) {
                                            rekVar = rekVarArr2[i];
                                        }
                                    }
                                } else if (rekVarArr2[i].s(this.g[i])) {
                                    rekVar = rekVarArr2[i];
                                }
                            } else {
                                ypfVar.d().ai(7583).w("Using alternative stream %d", i2);
                                rek[] rekVarArr3 = this.b;
                                if (rekVarArr3[i2].s(this.g[i])) {
                                    rekVar = rekVarArr3[i2];
                                }
                            }
                        }
                    }
                    if (rekVar == null) {
                        a.f().ai(7579).w("Couldn't get bottom half for %d", i);
                        return;
                    }
                    ypfVar.f().ai(7580).y("Requested bottom half available %s", rekVar);
                    synchronized (obj) {
                        zArr[i] = false;
                    }
                    this.g[i].a(rekVar, remVar);
                } else {
                    ypfVar.f().ai(7587).w("Audio stream %d did not request bottom half", i);
                }
            }
            i--;
        }
    }

    final void h(int i) {
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        boolean zP = p(iAc);
        a.f().ai(7590).N("enabling stream: %s, had focus: %b", roc.O(i), zP);
        if (zP) {
            return;
        }
        l(iAc, true);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.c) {
            z = true;
            boolean zO = o(1);
            boolean zO2 = o(0);
            a.d().ai(7599).Q("isSilent tts: %b media:%b", zO, zO2);
            if (!zO || !zO2) {
                z = false;
            }
        }
        return z;
    }

    public final boolean j(int i) {
        boolean z;
        ypf ypfVar = qqv.a;
        int iAc = a.ac(i);
        synchronized (this.c) {
            z = this.d[iAc] == 3;
        }
        return z;
    }

    public final void k(int i, long j) {
        int i2;
        yop yopVarAi = a.d().ai(7588);
        ypf ypfVar = qqv.a;
        yopVarAi.y("waitForStreamToStop %s", roc.O(i));
        rek[] rekVarArr = this.b;
        int iAc = a.ac(i);
        rek rekVar = rekVarArr[iAc];
        if (rekVar != null) {
            synchronized (this.c) {
                i2 = this.d[iAc] & 1;
            }
            if (i2 != 0) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long jElapsedRealtime2 = j;
                while (!rekVar.q() && jElapsedRealtime2 > 0) {
                    rekVar.u(jElapsedRealtime2);
                    jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            }
        }
    }
}
