package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class ipt {
    private static final yph a = yph.c("CAR.AUDIO");
    private final ArrayDeque b;
    private final int c;
    private final jdh d;
    private final int e;

    public ipt(int i, jdh jdhVar) {
        String str;
        int iC = (int) acmx.a.gu().c();
        this.e = iC;
        ype ypeVar = (ype) a.l().ai(1003);
        if (iC == 0) {
            str = "unlimited";
        } else {
            str = iC + " frames";
        }
        ypeVar.D("Create queue with buffer size: %d bytes, max capacity: %s", i, str);
        this.c = i;
        this.b = new ArrayDeque(16);
        this.d = jdhVar;
    }

    public final synchronized int a() {
        return this.b.size();
    }

    public final ipr b() {
        return new ipr(this.c, this.d);
    }

    public final synchronized ipr c() {
        return (ipr) this.b.peek();
    }

    public final synchronized ipr d() {
        return (ipr) this.b.poll();
    }

    public final synchronized void e(ipr iprVar) {
        int i = this.e;
        if (i <= 0 || this.b.size() < i) {
            this.b.add(iprVar);
        } else {
            ((ype) ((ype) ((ype) a.h()).l(5, TimeUnit.SECONDS)).ai(1004)).w("Audio transmission queue reached the max capacity of %d frames, dropping incoming frame", i);
        }
    }

    public final synchronized void f() {
        ArrayDeque arrayDeque = this.b;
        ((ype) a.l().ai((char) 1005)).w("Clear AudioBufferQueue which has %d buffers in it", arrayDeque.size());
        arrayDeque.clear();
    }
}
