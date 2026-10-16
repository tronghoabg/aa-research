package defpackage;

import android.os.Bundle;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class jfu extends jfs {
    private static final yph i = yph.c("CAR.VideoLog");
    public final AtomicInteger b = new AtomicInteger();
    public final AtomicInteger c = new AtomicInteger();
    public final AtomicLong d = new AtomicLong();
    public final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger f = new AtomicInteger();
    public final AtomicInteger g = new AtomicInteger();
    public final AtomicLong h = new AtomicLong();
    private final AtomicLong j = new AtomicLong();

    static {
        yfq.w("MEDIA FRAMES SENT", "AVERAGE LATENCY", "HIGH LATENCY FRAMES", "UNACKED FRAMES", "BIT RATE", "AVERAGE ENCODING TIME", "AVERAGE SENDING TIME");
    }

    @Override // defpackage.jfs
    public final Bundle a(long j) {
        int i2;
        int i3;
        int i4;
        Bundle bundle = new Bundle();
        AtomicInteger atomicInteger = this.c;
        int i5 = atomicInteger.intValue() > 0 ? (int) (this.d.get() / atomicInteger.get()) : -1;
        if (j != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            i2 = (this.g.get() * 8) / ((int) (j / 1000));
        } else {
            i2 = 0;
        }
        AtomicInteger atomicInteger2 = this.b;
        int i6 = atomicInteger2.get();
        if (i6 != 0) {
            long j2 = i6;
            i3 = (int) (this.h.get() / j2);
            i4 = (int) (this.j.get() / j2);
        } else {
            i3 = 0;
            i4 = 0;
        }
        bundle.putInt("MEDIA FRAMES SENT", atomicInteger2.get());
        bundle.putInt("AVERAGE LATENCY", i5);
        AtomicInteger atomicInteger3 = this.f;
        bundle.putInt("UNACKED FRAMES", atomicInteger3.get());
        AtomicInteger atomicInteger4 = this.e;
        bundle.putInt("HIGH LATENCY FRAMES", atomicInteger4.get());
        bundle.putInt("BIT RATE", i2);
        bundle.putInt("AVERAGE ENCODING TIME", i3);
        bundle.putInt("AVERAGE SENDING TIME", i4);
        atomicInteger2.set(0);
        atomicInteger.set(0);
        this.d.set(0L);
        atomicInteger4.set(0);
        atomicInteger3.set(0);
        this.g.set(0);
        this.j.set(0L);
        this.h.set(0L);
        return bundle;
    }

    @Override // defpackage.jfs
    public final void b(BufferedWriter bufferedWriter, Bundle bundle) {
        try {
            bufferedWriter.append((CharSequence) ("4 | MEDIA FRAMES SENT: " + bundle.getInt("MEDIA FRAMES SENT") + " | AVERAGE LATENCY: " + bundle.getInt("AVERAGE LATENCY") + " | UNACKED FRAMES: " + bundle.getInt("UNACKED FRAMES") + " | HIGH LATENCY FRAMES: " + bundle.getInt("HIGH LATENCY FRAMES") + " | BIT RATE: " + bundle.getInt("BIT RATE")));
        } catch (IOException unused) {
            ((ype) i.l().ai((char) 2004)).u("couldn't write to log file");
        }
    }
}
