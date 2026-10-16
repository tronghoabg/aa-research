package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class iqn implements iqk {
    public static final yph a = yph.c("CAR.AUDIO.CHANNEL");
    public iql d;
    public final iqm e;
    private final boolean j;
    public final iqc[] f = new iqc[3];
    public final iqa[] g = new iqa[3];
    public final Object b = new Object();
    public volatile int[] c = {0, 0, 0};
    private final boolean[] h = new boolean[2];
    private final AtomicBoolean i = new AtomicBoolean(false);

    public iqn(iqm iqmVar, boolean z) {
        this.e = iqmVar;
        this.j = z;
    }

    private final void n(int i, boolean z) {
        synchronized (this.b) {
            int[] iArr = this.c;
            if (z) {
                iArr[i] = iArr[i] | 2;
            } else {
                iArr[i] = iArr[i] & (-3);
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

    private final synchronized boolean r(String str) {
        if (a.O() && str != null && kmo.c(acna.c(), str) && !this.i.get()) {
            if (acna.g()) {
                return true;
            }
        }
        return false;
    }

    private final boolean s(int i) {
        boolean z;
        synchronized (this.b) {
            z = (this.c[i] & 2) != 0;
        }
        return z;
    }

    private static final void t(iqc iqcVar, iqa iqaVar) {
        iqaVar.f(false, false, null);
        iqaVar.u(iqcVar);
        iqcVar.j(iqaVar);
    }

    @Override // defpackage.iqk
    public final synchronized void a(int i) {
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        synchronized (this.b) {
            this.h[iAc] = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f5, code lost:
    
        if (r5 != r13) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f7  */
    @Override // defpackage.iqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r22, boolean r23, defpackage.iqs r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqn.b(boolean, boolean, iqs):void");
    }

    @Override // defpackage.iqk
    public final synchronized void c(iqj iqjVar, Duration duration) {
        iqc iqcVar = this.f[0];
        this.i.set(false);
        ((ype) a.l().ai((char) 1128)).u("onVoiceSessionEnd ASR is inactive");
        if (iqcVar != null) {
            iqcVar.c();
            if (!this.j) {
                synchronized (this.b) {
                    int[] iArr = this.c;
                    iArr[0] = iArr[0] | 1;
                }
                iqjVar.a();
                iql iqlVar = this.d;
                iqlVar.getClass();
                iqlVar.a(duration.toMillis());
            }
        }
    }

    @Override // defpackage.iqk
    public final synchronized void d() {
        iqc iqcVar = this.f[0];
        if (iqcVar != null) {
            iqcVar.d();
            if (!this.j) {
                g(3, false);
                synchronized (this.b) {
                    int[] iArr = this.c;
                    iArr[0] = iArr[0] & (-2);
                }
            }
        }
    }

    @Override // defpackage.iqk
    public final synchronized void e() {
        if (a.O()) {
            this.i.set(true);
            ((ype) a.l().ai((char) 1129)).u("onVoiceSessionStartSent ASR is active");
            iql iqlVar = this.d;
            iqlVar.getClass();
            iqlVar.a(0L);
        }
    }

    @Override // defpackage.iqk
    public final synchronized void f(int i) {
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        synchronized (this.b) {
            this.h[iAc] = true;
        }
    }

    @Override // defpackage.iqk
    public final void g(int i, boolean z) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.f()).ai(1134)).N("waitForStreamToStop: %s, wait for ack: %b", roc.O(i), z);
        yph yphVar2 = irb.a;
        iqa[] iqaVarArr = this.g;
        int iAc = a.ac(i);
        iqa iqaVar = iqaVarArr[iAc];
        if (iqaVar == null || !q(iAc)) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!z) {
            iqaVar.o(5000L, false);
            return;
        }
        for (long jElapsedRealtime2 = 5000; !iqaVar.s() && jElapsedRealtime2 > 0; jElapsedRealtime2 = 5000 - (SystemClock.elapsedRealtime() - jElapsedRealtime)) {
            iqaVar.o(jElapsedRealtime2, true);
        }
        if (iqaVar.s()) {
            return;
        }
        ((ype) ((ype) yphVar.h()).ai(1135)).L("stream %s could not stop in %d ms", roc.O(i), 5000L);
    }

    @Override // defpackage.iqk
    public final synchronized iqa h(int i, String str) {
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        if (i == 5 && r(str)) {
            ((ype) ((ype) a.h()).ai((char) 1133)).y("requestBottomHalfForStream for package %s waiting on ASR", str);
        } else if (p(iAc)) {
            iqc iqcVar = this.f[iAc];
            iqa iqaVar = this.g[iAc];
            if (iqaVar.p()) {
                if (iqaVar.u(iqcVar)) {
                    ((ype) ((ype) a.f()).ai((char) 1132)).y("requestBottomHalfForStream granted to stream %s", roc.O(i));
                    return iqaVar;
                }
            } else if (iqaVar.t() != null) {
                int i2 = iqcVar.c;
                iqc iqcVarT = iqaVar.t();
                iqcVarT.getClass();
                if (i2 == iqcVarT.c) {
                    ((ype) ((ype) a.h()).ai((char) 1131)).y("requestBottomHalfForStream for stream:%s while it is occupying bottom half", roc.O(i));
                    return iqaVar;
                }
            }
        }
        synchronized (this.b) {
            this.h[iAc] = true;
        }
        ((ype) ((ype) a.f()).ai(1130)).L("No bottom half immediately available for stream %s. Waiting %d ms for focus response.", roc.O(i), 500L);
        iql iqlVar = this.d;
        iqlVar.getClass();
        iqlVar.a(500L);
        return null;
    }

    public final void i(int i) {
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        boolean zS = s(iAc);
        ((ype) ((ype) a.f()).ai(1104)).N("disabling stream: %s, had focus: %b", roc.O(i), zS);
        if (zS) {
            n(iAc, false);
        }
    }

    public final void j() {
        iqa iqaVar;
        for (int i = 0; i < 3; i++) {
            if (!p(i) && (iqaVar = this.g[i]) != null) {
                iqaVar.g(ouo.AUDIO_BOTTOM_HALF_DISABLED);
                iqc iqcVarT = iqaVar.t();
                if (iqcVarT != null) {
                    iqcVarT.i(iqaVar);
                    iqaVar.f(false, false, null);
                }
            }
        }
    }

    public final void k(iqs iqsVar) {
        yph yphVar = a;
        ((ype) ((ype) yphVar.d()).ai((char) 1105)).y("doHandleBottomHalfRequest carAudioFocusEvent: %s", iqsVar);
        int i = 1;
        while (i >= 0) {
            Object obj = this.b;
            synchronized (obj) {
                boolean[] zArr = this.h;
                if (zArr[i]) {
                    ((ype) ((ype) yphVar.d()).ai((char) 1106)).w("Getting bottom half for stream: %d", i);
                    int i2 = i == 0 ? 1 : 0;
                    if (o(i)) {
                        ((ype) ((ype) yphVar.d()).ai((char) 1113)).w("Bottom half available for stream: %d", i);
                        iqa[] iqaVarArr = this.g;
                        if (iqaVarArr[i].u(this.f[i])) {
                            iqaVar = iqaVarArr[i];
                        }
                    } else if (o(i2)) {
                        ((ype) ((ype) yphVar.d()).ai((char) 1109)).w("Bottom half for alternative stream %d is available", i2);
                        if (p(i)) {
                            iqa[] iqaVarArr2 = this.g;
                            iqc iqcVarT = iqaVarArr2[i].t();
                            ((ype) ((ype) yphVar.d()).ai((char) 1111)).y("Switching clients. Client: %s", iqcVarT);
                            if (iqcVarT != null) {
                                int i3 = iqcVarT.c;
                                yph yphVar2 = irb.a;
                                if (a.ac(i3) == i2) {
                                    if (iqaVarArr2[i2].u(iqcVarT)) {
                                        ((ype) ((ype) yphVar.d()).ai(1112)).R("AudioSourceService %s switches bottom half from %d to %d", iqcVarT, Integer.valueOf(i), Integer.valueOf(i2));
                                        iqcVarT.j(iqaVarArr2[i2]);
                                    }
                                    if (iqaVarArr2[i].u(this.f[i])) {
                                        iqaVar = iqaVarArr2[i];
                                    }
                                }
                            } else if (iqaVarArr2[i].u(this.f[i])) {
                                iqaVar = iqaVarArr2[i];
                            }
                        } else if (!q(i)) {
                            ((ype) ((ype) yphVar.f()).ai((char) 1125)).u("bottom half switching not allowed if channel is currently disabled");
                        } else if (i == 0) {
                            ((ype) ((ype) yphVar.f()).ai((char) 1110)).w("Using alternative stream %d", i2);
                            iqa[] iqaVarArr3 = this.g;
                            iqaVar = iqaVarArr3[i2].u(this.f[0]) ? iqaVarArr3[i2] : null;
                            i = 0;
                        }
                    }
                    if (iqaVar == null) {
                        ((ype) ((ype) a.f()).ai((char) 1107)).w("Couldn't get bottom half for %d", i);
                        return;
                    }
                    ((ype) ((ype) yphVar.f()).ai((char) 1108)).y("Requested bottom half available %s", iqaVar);
                    synchronized (obj) {
                        zArr[i] = false;
                    }
                    this.f[i].h(iqaVar, iqsVar);
                } else {
                    ((ype) ((ype) yphVar.f()).ai(1114)).w("Audio stream %d did not request bottom half", i);
                }
            }
            i--;
        }
    }

    final void l(int i) {
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        boolean zS = s(iAc);
        ((ype) ((ype) a.f()).ai(1116)).N("enabling stream: %s, had focus: %b", roc.O(i), zS);
        if (zS) {
            return;
        }
        n(iAc, true);
    }

    public final boolean m(int i) {
        boolean z;
        yph yphVar = irb.a;
        int iAc = a.ac(i);
        synchronized (this.b) {
            z = this.c[iAc] == 3;
        }
        return z;
    }
}
