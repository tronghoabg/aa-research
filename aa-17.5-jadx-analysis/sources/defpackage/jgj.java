package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class jgj implements Choreographer.FrameCallback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jgj(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aitf, java.lang.Object] */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        long j2;
        int i;
        int i2;
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 == 1) {
                this.a.run();
                return;
            } else {
                if (i3 == 2) {
                    ((vjo) this.a).a(j);
                    return;
                }
                int i4 = aiwx.a;
                aitu aituVar = aium.a;
                this.a.f(ajct.a, Long.valueOf(j));
                return;
            }
        }
        jgl jglVar = (jgl) this.a;
        jgn jgnVar = jglVar.b;
        jgnVar.getClass();
        if (jgnVar.a) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            double d = jglVar.p;
            double d2 = jglVar.c;
            double d3 = j / 1000000;
            if (((long) ((d - d2) - d3)) > 0) {
                jglVar.i.incrementAndGet();
                jglVar.e.add(new jgk(j, (byte) 3));
                Choreographer.getInstance().postFrameCallback(this);
                return;
            }
            if (d3 > d2 + d) {
                d = d3;
            }
            jglVar.p = d + jglVar.d;
            jglVar.e.add(new jgk(j, (byte) 1));
            if (jglVar.k) {
                if (!jglVar.o || ((i2 = jglVar.j) != 0 && jglVar.h.get() % i2 == 0)) {
                    long j3 = Long.MAX_VALUE;
                    long j4 = 0;
                    for (int i5 = 0; i5 < 5; i5++) {
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        long jNanoTime = System.nanoTime();
                        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                        long j5 = jElapsedRealtimeNanos2 - jElapsedRealtimeNanos;
                        if (j5 < j3) {
                            j4 = ((jElapsedRealtimeNanos + jElapsedRealtimeNanos2) / 2) - jNanoTime;
                            j3 = j5;
                        }
                    }
                    if (!jglVar.o || jglVar.g <= j + j4) {
                        ((ype) jgl.a.l().ai(2013)).x("Rebasing VSync offset to %s", j4);
                        jglVar.q.set(false);
                        jglVar.n = j4;
                        jglVar.o = true;
                    } else {
                        ((ype) ((ype) jgl.a.h()).ai(2014)).x("Normalized frame time with offset %s has fallen behind last frame time, unable to rebase.", j4);
                        jglVar.q.set(true);
                    }
                }
                j2 = jglVar.n + j;
            } else {
                if (jglVar.l == 0 || ((i = jglVar.j) != 0 && jglVar.h.get() % i == 0)) {
                    long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
                    if (jglVar.l == 0 || jglVar.f <= jElapsedRealtimeNanos3) {
                        ((ype) ((ype) jgl.a.f()).ai(2011)).G("Rebasing VSync to %s -- %s", jElapsedRealtimeNanos3, j);
                        jglVar.q.set(false);
                        jglVar.l = jElapsedRealtimeNanos3;
                        jglVar.m = j;
                    } else {
                        ((ype) ((ype) jgl.a.h()).ai((char) 2012)).u("Realtime has fallen behind last frame time, unable to rebase");
                        jglVar.q.set(true);
                    }
                }
                j2 = jglVar.l + (j - jglVar.m);
            }
            jglVar.h.incrementAndGet();
            jglVar.f = j;
            jglVar.g = j2;
            jgnVar.a(j2);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public jgj(jgl jglVar, int i) {
        this.b = i;
        this.a = jglVar;
    }
}
