package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class iqu implements defpackage.iqr {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AUDIO.CHANNEL");
    public defpackage.iqs d;
    public final defpackage.iqt e;
    private final boolean j;
    public final defpackage.iqj[] f = new defpackage.iqj[3];
    public final defpackage.iqh[] g = new defpackage.iqh[3];
    public final java.lang.Object b = new java.lang.Object();
    public volatile int[] c = {0, 0, 0};
    private final boolean[] h = new boolean[2];
    private final java.util.concurrent.atomic.AtomicBoolean i = new java.util.concurrent.atomic.AtomicBoolean(false);

    public iqu(defpackage.iqt iqtVar, boolean z) {
        this.e = iqtVar;
        this.j = z;
    }

    private final void n(int i, boolean z) {
        synchronized (this.b) {
            int[] iArr = this.c;
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

    private final boolean o(int i) {
        return p(i) && this.g[i].p();
    }

    private final boolean p(int i) {
        boolean z;
        synchronized (this.b) {
            z = this.c[i] == 3;
        }
        return z;
    }

    private final boolean q(int i) {
        int i2;
        synchronized (this.b) {
            i2 = this.c[i] & 1;
        }
        return 1 == i2;
    }

    private final synchronized boolean r(java.lang.String str) {
        return defpackage.a.N() && str != null && defpackage.kmv.c(acoc.c(), str) && !this.i.get() && acoc.g();
    }

    private final boolean s(int i) {
        boolean z;
        synchronized (this.b) {
            z = (this.c[i] & 2) != 0;
        }
        return z;
    }

    private static final void t(defpackage.iqj iqjVar, defpackage.iqh iqhVar) {
        iqhVar.f(false, false, null);
        iqhVar.u(iqjVar);
        iqjVar.j(iqhVar);
    }

    @Override // defpackage.iqr
    public final synchronized void a(int i) {
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.b) {
            this.h[iAb] = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8 A[DONT_INVERT, PHI: r10
  0x00f8: PHI (r10v2 iqj) = (r10v1 iqj), (r10v0 iqj) binds: [B:58:0x00f7, B:56:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r5 != r13) goto L58;
     */
    @Override // defpackage.iqr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r22, boolean r23, defpackage.ira r24) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqu.b(boolean, boolean, ira):void");
    }

    @Override // defpackage.iqr
    public final synchronized void c(iqq iqqVar, j$.time.Duration duration) {
        defpackage.iqj iqjVar = this.f[0];
        this.i.set(false);
        ((defpackage.yqj) a.l().ai((char) 1128)).u("onVoiceSessionEnd ASR is inactive");
        if (iqjVar != null) {
            iqjVar.c();
            if (!this.j) {
                synchronized (this.b) {
                    int[] iArr = this.c;
                    iArr[0] = iArr[0] | 1;
                }
                iqqVar.a();
                defpackage.iqs iqsVar = this.d;
                iqsVar.getClass();
                iqsVar.a(duration.toMillis());
            }
        }
    }

    @Override // defpackage.iqr
    public final synchronized void d() {
        defpackage.iqj iqjVar = this.f[0];
        if (iqjVar != null) {
            iqjVar.d();
            if (!this.j) {
                g(3, false);
                synchronized (this.b) {
                    int[] iArr = this.c;
                    iArr[0] = iArr[0] & (-2);
                }
            }
        }
    }

    @Override // defpackage.iqr
    public final synchronized void e() {
        if (defpackage.a.N()) {
            this.i.set(true);
            ((defpackage.yqj) a.l().ai((char) 1129)).u("onVoiceSessionStartSent ASR is active");
            defpackage.iqs iqsVar = this.d;
            iqsVar.getClass();
            iqsVar.a(0L);
        }
    }

    @Override // defpackage.iqr
    public final synchronized void f(int i) {
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.b) {
            this.h[iAb] = true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    @Override // defpackage.iqr
    public final void g(int i, boolean z) throws xzp {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1134)).N("waitForStreamToStop: %s, wait for ack: %b", defpackage.tna.Y(i), z);
        defpackage.yqm yqmVar2 = defpackage.irk.a;
        defpackage.iqh[] iqhVarArr = this.g;
        int iAb = defpackage.a.ab(i);
        defpackage.iqh iqhVar = iqhVarArr[iAb];
        if (iqhVar == null || !q(iAb)) {
            return;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (!z) {
            iqhVar.o(5000L, false);
            return;
        }
        for (long jElapsedRealtime2 = 5000; !iqhVar.s() && jElapsedRealtime2 > 0; jElapsedRealtime2 = 5000 - (android.os.SystemClock.elapsedRealtime() - jElapsedRealtime)) {
            iqhVar.o(jElapsedRealtime2, true);
        }
        if (iqhVar.s()) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai(1135)).L("stream %s could not stop in %d ms", defpackage.tna.Y(i), 5000L);
    }

    @Override // defpackage.iqr
    public final synchronized defpackage.iqh h(int i, java.lang.String str) {
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        if (i == 5 && r(str)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1133)).y("requestBottomHalfForStream for package %s waiting on ASR", str);
        } else if (p(iAb)) {
            defpackage.iqj iqjVar = this.f[iAb];
            defpackage.iqh iqhVar = this.g[iAb];
            if (iqhVar.p()) {
                if (iqhVar.u(iqjVar)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1132)).y("requestBottomHalfForStream granted to stream %s", defpackage.tna.Y(i));
                    return iqhVar;
                }
            } else if (iqhVar.t() != null) {
                int i2 = iqjVar.c;
                defpackage.iqj iqjVarT = iqhVar.t();
                iqjVarT.getClass();
                if (i2 == iqjVarT.c) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 1131)).y("requestBottomHalfForStream for stream:%s while it is occupying bottom half", defpackage.tna.Y(i));
                    return iqhVar;
                }
            }
        }
        synchronized (this.b) {
            this.h[iAb] = true;
        }
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1130)).L("No bottom half immediately available for stream %s. Waiting %d ms for focus response.", defpackage.tna.Y(i), 500L);
        defpackage.iqs iqsVar = this.d;
        iqsVar.getClass();
        iqsVar.a(500L);
        return null;
    }

    public final void i(int i) {
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        boolean zS = s(iAb);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1104)).N("disabling stream: %s, had focus: %b", defpackage.tna.Y(i), zS);
        if (zS) {
            n(iAb, false);
        }
    }

    public final void j() {
        defpackage.iqh iqhVar;
        for (int i = 0; i < 3; i++) {
            if (!p(i) && (iqhVar = this.g[i]) != null) {
                iqhVar.g(defpackage.ovl.AUDIO_BOTTOM_HALF_DISABLED);
                defpackage.iqj iqjVarT = iqhVar.t();
                if (iqjVarT != null) {
                    iqjVarT.i(iqhVar);
                    iqhVar.f(false, false, null);
                }
            }
        }
    }

    public final void k(defpackage.ira iraVar) {
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1105)).y("doHandleBottomHalfRequest carAudioFocusEvent: %s", iraVar);
        int i = 1;
        while (i >= 0) {
            java.lang.Object obj = this.b;
            synchronized (obj) {
                boolean[] zArr = this.h;
                if (zArr[i]) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1106)).w("Getting bottom half for stream: %d", i);
                    int i2 = i == 0 ? 1 : 0;
                    defpackage.iqh iqhVar = null;
                    if (o(i)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1113)).w("Bottom half available for stream: %d", i);
                        defpackage.iqh[] iqhVarArr = this.g;
                        if (iqhVarArr[i].u(this.f[i])) {
                            iqhVar = iqhVarArr[i];
                        }
                    } else if (o(i2)) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1109)).w("Bottom half for alternative stream %d is available", i2);
                        if (p(i)) {
                            defpackage.iqh[] iqhVarArr2 = this.g;
                            defpackage.iqj iqjVarT = iqhVarArr2[i].t();
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai((char) 1111)).y("Switching clients. Client: %s", iqjVarT);
                            if (iqjVarT != null) {
                                int i3 = iqjVarT.c;
                                defpackage.yqm yqmVar2 = defpackage.irk.a;
                                if (defpackage.a.ab(i3) == i2) {
                                    if (iqhVarArr2[i2].u(iqjVarT)) {
                                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.d()).ai(1112)).R("AudioSourceService %s switches bottom half from %d to %d", iqjVarT, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                                        iqjVarT.j(iqhVarArr2[i2]);
                                    }
                                    if (iqhVarArr2[i].u(this.f[i])) {
                                        iqhVar = iqhVarArr2[i];
                                    }
                                }
                            } else if (iqhVarArr2[i].u(this.f[i])) {
                                iqhVar = iqhVarArr2[i];
                            }
                        } else if (!q(i)) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1125)).u("bottom half switching not allowed if channel is currently disabled");
                        } else if (i == 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1110)).w("Using alternative stream %d", i2);
                            defpackage.iqh[] iqhVarArr3 = this.g;
                            iqhVar = iqhVarArr3[i2].u(this.f[0]) ? iqhVarArr3[i2] : null;
                            i = 0;
                        }
                    }
                    if (iqhVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 1107)).w("Couldn't get bottom half for %d", i);
                        return;
                    }
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1108)).y("Requested bottom half available %s", iqhVar);
                    synchronized (obj) {
                        zArr[i] = false;
                    }
                    this.f[i].h(iqhVar, iraVar);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(1114)).w("Audio stream %d did not request bottom half", i);
                }
            }
            i--;
        }
    }

    final void l(int i) {
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        boolean zS = s(iAb);
        ((defpackage.yqj) ((defpackage.yqj) a.f()).ai(1116)).N("enabling stream: %s, had focus: %b", defpackage.tna.Y(i), zS);
        if (zS) {
            return;
        }
        n(iAb, true);
    }

    public final boolean m(int i) {
        boolean z;
        defpackage.yqm yqmVar = defpackage.irk.a;
        int iAb = defpackage.a.ab(i);
        synchronized (this.b) {
            z = this.c[iAb] == 3;
        }
        return z;
    }
}
