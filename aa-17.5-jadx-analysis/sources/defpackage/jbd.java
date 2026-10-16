package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* loaded from: classes.dex */
public final class jbd extends jbe {
    long a;
    long b;
    public long c;
    final /* synthetic */ jbf d;
    private long j;
    private long k;
    private long l;
    private long m;
    private boolean n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;
    private boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbd(jbf jbfVar, jeb jebVar, long j, long j2, long j3, long j4) {
        super(jbfVar, jebVar);
        this.d = jbfVar;
        this.l = 0L;
        this.m = 0L;
        this.c = 0L;
        this.n = false;
        this.o = 0L;
        this.p = 0L;
        this.q = false;
        this.r = false;
        this.s = false;
        this.j = j;
        this.a = j2;
        this.k = j3;
        this.b = j4;
    }

    private final synchronized void l() {
        if (!this.q) {
            if (this.c > this.j) {
                jbf.b.l().ai(1764).G("%dms buffered in MD over %dms threshold", this.c / 1000000, this.j / 1000000);
                m(this.a);
                this.d.f(yxi.FRAMER_WRITER_AUDIO_BUFFER_OVERFLOW);
            }
            long j = 0;
            if (this.k > 0 && !n()) {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long jA = a(jElapsedRealtimeNanos) + super.c().l;
                if (jA > this.k) {
                    jbf.b.l().ai(1763).G("%dms buffered in HU over %dms threshold", jA / 1000000, this.k / 1000000);
                    m(0L);
                    this.d.f(yxi.FRAMER_WRITER_HU_AUDIO_BUFFER_OVERFLOW);
                    this.r = true;
                } else if (this.r) {
                    long jA2 = a(jElapsedRealtimeNanos);
                    if (jA2 > this.b) {
                        jbf.b.l().ai(1762).G("%dms buffered in HU still over %dms lower threshold", jA2 / 1000000, this.b / 1000000);
                        m(0L);
                    } else {
                        this.r = false;
                    }
                }
            }
            if (this.h) {
                long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                long jA3 = a(jElapsedRealtimeNanos2) + this.c;
                long j2 = this.d.c;
                if (jA3 <= j2) {
                    this.h = false;
                    return;
                }
                long jA4 = j2 - a(jElapsedRealtimeNanos2);
                if (jA4 < 0) {
                    jbf.b.f().l(3, TimeUnit.SECONDS).ai(1761).x("Negative targetBuffer while trying to prune in a stall. huBuffered: %d", a(jElapsedRealtimeNanos2));
                } else {
                    j = jA4;
                }
                m(j);
            }
        }
    }

    private final synchronized void m(long j) {
        if (j < 0) {
            throw new IllegalStateException("Target buffer cannot be less than 0.");
        }
        long j2 = this.c;
        int i = 0;
        izm izmVarJ = null;
        while (this.c > j && super.c().c.o() == 0) {
            this.c -= super.c().l;
            izmVarJ = super.j();
            izmVarJ.c.close();
            i++;
        }
        if (i > 0 && izmVarJ != null) {
            izk izkVar = ((izl) this.d.o.a).n;
            izkVar.sendMessage(izkVar.obtainMessage(3, izmVarJ.b, i, null));
        }
        jbf.b.h().ai(1766).S("Pruned %d messages from MD buffer to go from %dms to %dms (target buffer is %dms)", Integer.valueOf(i), Long.valueOf(j2 / 1000000), Long.valueOf(this.c / 1000000), Long.valueOf(j / 1000000));
    }

    private final synchronized boolean n() {
        return this.e.isEmpty();
    }

    public final long a(long j) {
        long j2 = this.l - (j - this.m);
        if (j2 < 0) {
            return 0L;
        }
        return j2;
    }

    @Override // defpackage.jbe
    public final long b() {
        long j = this.p;
        if (j == 0) {
            return 0L;
        }
        long jElapsedRealtimeNanos = (j - SystemClock.elapsedRealtimeNanos()) / 1000;
        if (jElapsedRealtimeNanos > 0) {
            return jElapsedRealtimeNanos;
        }
        this.p = 0L;
        return 0L;
    }

    @Override // defpackage.jbe
    public final synchronized izm c() {
        this.q = true;
        return super.c();
    }

    @Override // defpackage.jbe
    public final jeb d() {
        long jA = a(SystemClock.elapsedRealtimeNanos());
        jbf jbfVar = this.d;
        long j = jbfVar.d;
        boolean z = this.s;
        if (jA > j) {
            if (!z) {
                this.s = true;
                jbfVar.f(yxi.FRAMER_WRITER_AV_PRIORITY_INVERTED);
            }
            return jeb.AUDIO_HIGH_BUFFER;
        }
        if (z) {
            this.s = false;
            jbfVar.f(yxi.FRAMER_WRITER_AV_PRIORITY_RESTORED);
        }
        return this.f;
    }

    @Override // defpackage.jbe
    public final synchronized void e(izm izmVar) {
        if (izmVar.a != 0) {
            throw new IllegalArgumentException("PerChannelWriterThread does not accept pre-fragmented messages.");
        }
        jcn jcnVar = izmVar.c;
        short sO = jcnVar.o();
        int i = 3;
        if (sO != -32767) {
            long j = 64000000;
            if (sO == 0) {
                if (this.n) {
                    j = this.o;
                    izmVar.l = j;
                } else {
                    int i2 = izmVar.d;
                    if (i2 == 8202 || i2 == 4106) {
                        j = 42666666;
                        izmVar.l = 42666666L;
                    } else {
                        if (i2 != 2058) {
                            throw new IllegalArgumentException(a.bp(i2, "Audio data message is too big! size = "));
                        }
                        izmVar.l = 64000000L;
                    }
                }
                this.c += j;
                jbf.b.f().l(1, TimeUnit.MINUTES).ai(1759).z("MD BUF = %f ms HU BUF = %f ms", this.c / 1000000.0f, a(SystemClock.elapsedRealtimeNanos()) / 1000000.0f);
            } else if (sO == 1) {
                yop yopVarAi = jbf.b.f().l(1, TimeUnit.MINUTES).ai(1760);
                int i3 = izmVar.d;
                yopVarAi.w("Processing media config of length %d", i3);
                if (i3 >= 4) {
                    this.n = true;
                    int iA = jcnVar.a(2) & 7;
                    int iA2 = ((jcnVar.a(3) >> 7) & 1) | (iA + iA);
                    if (iA2 == 3) {
                        this.o = 21333333L;
                    } else if (iA2 != 8) {
                        this.o = 21333333L;
                        jbf.a.h().l(1, TimeUnit.MINUTES).ai(1765).w("Failed to decode AAC sampling rate: %d", iA2);
                        this.d.f(yxi.FRAMER_WRITER_AAC_CODECINFO_DECODE_FAIL);
                    } else {
                        this.o = 64000000L;
                    }
                }
            }
        } else {
            Optional optional = izmVar.j;
            if (optional.isPresent() && this.k > 0) {
                long nanos = ((Duration) optional.get()).toNanos();
                yop yopVarAi2 = jbf.a.f().ai(1755);
                Long lValueOf = Long.valueOf(nanos);
                Long lValueOf2 = Long.valueOf(this.k);
                jbf jbfVar = this.d;
                boolean z = jbfVar.n;
                yopVarAi2.R("maxUnacked: %d, threshold: %d, force flag: %b", lValueOf, lValueOf2, Boolean.valueOf(z));
                if (nanos >= this.k) {
                    jbf.b.f().ai(1756).G("Max unacked of %dms is NOT less than dropHuAudioThreshold of %dms", nanos / 1000000, this.k / 1000000);
                } else if (z) {
                    jbf.b.f().ai(1758).G("Max unacked of %dms is less than dropHuAudioThreshold of %dms, using legacy configuration values", nanos / 1000000, this.k / 1000000);
                    BiFunction biFunction = jbfVar.g;
                    if (this.f != jeb.AUDIO_MEDIA) {
                        i = 5;
                    }
                    ips ipsVar = (ips) biFunction.apply(Integer.valueOf(i), true);
                    long j2 = ipsVar.a * 1000000;
                    long j3 = Long.MAX_VALUE;
                    if (j2 == 0) {
                        j2 = Long.MAX_VALUE;
                    }
                    this.j = j2;
                    long j4 = ipsVar.b * 1000000;
                    if (j4 != 0) {
                        j3 = j4;
                    }
                    this.a = j3;
                    this.k = ipsVar.c * 1000000;
                    this.b = ipsVar.d * 1000000;
                } else {
                    jbf.b.f().ai(1757).G("Max unacked of %dms is less than dropHuAudioThreshold of %dms", nanos / 1000000, this.k / 1000000);
                }
            }
        }
        super.e(izmVar);
    }

    @Override // defpackage.jbe
    public final void f() {
        this.h = true;
    }

    @Override // defpackage.jbe
    public final synchronized void g(int i, PrintWriter printWriter) {
        printWriter.format(" %d messages on channel %d, priority = %d HU buffer = %f MD buffer = %f%n", Integer.valueOf(this.e.size()), Integer.valueOf(i), Integer.valueOf(d().j), Float.valueOf(a(SystemClock.elapsedRealtimeNanos()) / 1000000.0f), Float.valueOf(this.c / 1000000.0f));
    }

    @Override // defpackage.jbe
    protected final synchronized void h() throws IOException {
        long j = super.c().l;
        this.c -= j;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (d() == jeb.AUDIO_HIGH_BUFFER) {
            this.p = (j >> 1) + jElapsedRealtimeNanos;
        }
        this.l = a(jElapsedRealtimeNanos) + j;
        this.m = jElapsedRealtimeNanos;
        j();
        this.q = false;
    }

    @Override // defpackage.jbe
    public final void i() throws InterruptedException, IOException {
        l();
        if (n()) {
            return;
        }
        super.i();
    }
}
