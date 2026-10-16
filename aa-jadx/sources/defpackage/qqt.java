package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qqt implements defpackage.qqq {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.AUDIO.CHANNEL");
    public defpackage.qqr e;
    public final defpackage.qqs f;
    public final defpackage.qqk[] g = new defpackage.qqk[3];
    public final defpackage.rff[] b = new defpackage.rff[3];
    public final java.lang.Object c = new java.lang.Object();
    public volatile int[] d = {0, 0, 0};
    private final boolean[] h = new boolean[2];

    public qqt(defpackage.qqs qqsVar) {
        this.f = qqsVar;
    }

    private final void l(int i, boolean z) {
        synchronized (this.c) {
            int[] iArr = this.d;
            try {
                if (z) {
                    iArr[i] = iArr[i] | 2;
                } else {
                    iArr[i] = iArr[i] & (-3);
                }
            } catch (java.lang.Throwable th) {
                throw th;
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

    private static final void q(defpackage.qqk qqkVar, defpackage.rff rffVar) {
        rffVar.o();
        rffVar.s(qqkVar);
        qqkVar.g(rffVar);
    }

    @Override // defpackage.qqq
    public final synchronized defpackage.rff a(int i) {
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        if (n(iAb)) {
            defpackage.rff rffVar = this.b[iAb];
            boolean zP = rffVar.p();
            defpackage.qqk[] qqkVarArr = this.g;
            if (zP) {
                if (rffVar.s(qqkVarArr[iAb])) {
                    a.f().ai(7629).w("requestBottomHalfForStream grant to stream %d", i);
                    return rffVar;
                }
            } else if (qqkVarArr[iAb] == rffVar.r()) {
                a.h().ai(7628).w("requestBottomHalfForStream for stream:%d while it is occupying BH", i);
                return rffVar;
            }
        }
        synchronized (this.c) {
            this.h[iAb] = true;
        }
        a.d().ai(7627).w("requestBottomHalfForStream no stream available for stream %d", i);
        defpackage.qqr qqrVar = this.e;
        qqrVar.getClass();
        qqrVar.a(500L);
        return null;
    }

    @Override // defpackage.qqq
    public final synchronized void b(int i) {
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.c) {
            this.h[iAb] = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[DONT_INVERT, PHI: r9
  0x00ee: PHI (r9v4 qqk) = (r9v3 qqk), (r9v0 qqk) binds: [B:53:0x00ed, B:51:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123  */
    /* JADX WARN: Code duplicated, block: B:66:0x0125  */
    /* JADX WARN: Code duplicated, block: B:67:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a A[DONT_INVERT, PHI: r9
  0x012a: PHI (r9v2 qqk) = (r9v1 qqk), (r9v0 qqk) binds: [B:68:0x0129, B:66:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r3 != r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0127, code lost:
    
        if (r4 != r12) goto L68;
     */
    @Override // defpackage.qqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r22, boolean r23, defpackage.rfh r24) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqt.c(boolean, boolean, rfh):void");
    }

    @Override // defpackage.qqq
    public final synchronized void d(int i) {
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.c) {
            this.h[iAb] = true;
        }
    }

    public final void e(int i) {
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        boolean zP = p(iAb);
        a.f().ai(7601).N("disabling stream: %s, had focus: %b", defpackage.tna.Y(i), zP);
        if (zP) {
            l(iAb, false);
        }
    }

    public final void f() {
        defpackage.rff rffVar;
        for (int i = 0; i < 3; i++) {
            if (!n(i) && (rffVar = this.b[i]) != null) {
                rffVar.d();
            }
        }
    }

    public final void g(defpackage.rfh rfhVar) {
        defpackage.yqk yqkVar = a;
        yqkVar.d().ai(7602).u("doHandleBottomHalfRequest");
        int i = 1;
        while (i >= 0) {
            java.lang.Object obj = this.c;
            synchronized (obj) {
                boolean[] zArr = this.h;
                if (zArr[i]) {
                    yqkVar.d().ai(7603).w("Getting bottom half for stream: %d", i);
                    int i2 = i == 0 ? 1 : 0;
                    defpackage.rff rffVar = null;
                    if (m(i)) {
                        yqkVar.d().ai(7611).w("Bottom half available for stream: %d", i);
                        defpackage.rff[] rffVarArr = this.b;
                        if (rffVarArr[i].s(this.g[i])) {
                            rffVar = rffVarArr[i];
                        }
                    } else if (n(i2)) {
                        yqkVar.d().ai(7606).w("Alternative stream %d is enabled", i2);
                        if (m(i2)) {
                            yqkVar.d().ai(7607).u("Bottom half for alternative stream available");
                            if (n(i)) {
                                defpackage.rff[] rffVarArr2 = this.b;
                                defpackage.qqk qqkVarR = rffVarArr2[i].r();
                                yqkVar.d().ai(7609).y("Switching clients. Client: %s", qqkVarR);
                                if (qqkVarR != null) {
                                    int i3 = qqkVarR.c;
                                    defpackage.yqk yqkVar2 = defpackage.qrr.a;
                                    if (defpackage.a.ab(i3) == i2) {
                                        if (rffVarArr2[i2].s(qqkVarR)) {
                                            yqkVar.d().ai(7610).R("AudioSourceService %s switches bottom half from %d to %d", qqkVarR, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                                            qqkVarR.g(rffVarArr2[i2]);
                                        }
                                        if (rffVarArr2[i].s(this.g[i])) {
                                            rffVar = rffVarArr2[i];
                                        }
                                    }
                                } else if (rffVarArr2[i].s(this.g[i])) {
                                    rffVar = rffVarArr2[i];
                                }
                            } else {
                                yqkVar.d().ai(7608).w("Using alternative stream %d", i2);
                                defpackage.rff[] rffVarArr3 = this.b;
                                if (rffVarArr3[i2].s(this.g[i])) {
                                    rffVar = rffVarArr3[i2];
                                }
                            }
                        }
                    }
                    if (rffVar == null) {
                        a.f().ai(7604).w("Couldn't get bottom half for %d", i);
                        return;
                    }
                    yqkVar.f().ai(7605).y("Requested bottom half available %s", rffVar);
                    synchronized (obj) {
                        zArr[i] = false;
                    }
                    this.g[i].a(rffVar, rfhVar);
                } else {
                    yqkVar.f().ai(7612).w("Audio stream %d did not request bottom half", i);
                }
            }
            i--;
        }
    }

    final void h(int i) {
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        boolean zP = p(iAb);
        a.f().ai(7615).N("enabling stream: %s, had focus: %b", defpackage.tna.Y(i), zP);
        if (zP) {
            return;
        }
        l(iAb, true);
    }

    public final boolean i() {
        boolean z;
        synchronized (this.c) {
            z = true;
            boolean zO = o(1);
            boolean zO2 = o(0);
            a.d().ai(7624).Q("isSilent tts: %b media:%b", zO, zO2);
            if (!zO || !zO2) {
                z = false;
            }
        }
        return z;
    }

    public final boolean j(int i) {
        boolean z;
        defpackage.yqk yqkVar = defpackage.qrr.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.c) {
            z = this.d[iAb] == 3;
        }
        return z;
    }

    public final void k(int i, long j) {
        int i2;
        defpackage.ypu ypuVarAi = a.d().ai(7613);
        defpackage.yqk yqkVar = defpackage.qrr.a;
        ypuVarAi.y("waitForStreamToStop %s", defpackage.tna.Y(i));
        defpackage.rff[] rffVarArr = this.b;
        int iAb = defpackage.a.ab(i);
        defpackage.rff rffVar = rffVarArr[iAb];
        if (rffVar != null) {
            synchronized (this.c) {
                i2 = this.d[iAb] & 1;
            }
            if (i2 != 0) {
                long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                long jElapsedRealtime2 = j;
                while (!rffVar.q() && jElapsedRealtime2 > 0) {
                    rffVar.u(jElapsedRealtime2);
                    jElapsedRealtime2 = j - (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
            }
        }
    }
}
