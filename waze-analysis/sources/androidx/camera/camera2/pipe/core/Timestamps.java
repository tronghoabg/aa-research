package androidx.camera.camera2.pipe.core;

import h.g.b.x;
import h.o.a;
import h.o.c;
import h.o.d;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Timestamps {
    public static final Timestamps INSTANCE = new Timestamps();

    private Timestamps() {
    }

    /* renamed from: formatMs-VtjQ1oo$default, reason: not valid java name */
    public static /* synthetic */ String m1129formatMsVtjQ1oo$default(Timestamps timestamps, long j2, int i2, int i3, Object obj) {
        StringBuilder sb = new StringBuilder("%.");
        if (1 == (i3 & 1)) {
            i2 = 3;
        }
        sb.append(i2);
        sb.append("f ms");
        String str = String.format(null, sb.toString(), Arrays.copyOf(new Object[]{Double.valueOf(a.b(j2, d.f48272c))}, 1));
        x.e(str, "format(...)");
        return str;
    }

    /* renamed from: measureNow-CXI9fWU$default, reason: not valid java name */
    public static /* synthetic */ long m1130measureNowCXI9fWU$default(Timestamps timestamps, long j2, TimeSource timeSource, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            timeSource = new SystemTimeSource();
        }
        x.f(timeSource, "timeSource");
        long jMo1117nowvQl9yQU = timeSource.mo1117nowvQl9yQU();
        c cVar = a.f48264a;
        return c.j(jMo1117nowvQl9yQU - j2, d.f48270a);
    }

    /* renamed from: formatMs-VtjQ1oo, reason: not valid java name */
    public final String m1131formatMsVtjQ1oo(long j2, int i2) {
        String str = String.format(null, "%." + i2 + "f ms", Arrays.copyOf(new Object[]{Double.valueOf(a.b(j2, d.f48272c))}, 1));
        x.e(str, "format(...)");
        return str;
    }

    /* renamed from: formatMs-mxdxgDo, reason: not valid java name */
    public final String m1132formatMsmxdxgDo(long j2) {
        return (j2 / 1000000) + " ms";
    }

    /* renamed from: formatNs-LRDsOJo, reason: not valid java name */
    public final String m1133formatNsLRDsOJo(long j2) {
        c cVar = a.f48264a;
        return a.o(j2) + " ns";
    }

    /* renamed from: formatNs-mxdxgDo, reason: not valid java name */
    public final String m1134formatNsmxdxgDo(long j2) {
        return TimestampNs.m1127toStringimpl(j2).concat(" ns");
    }

    /* renamed from: measureNow-CXI9fWU, reason: not valid java name */
    public final long m1135measureNowCXI9fWU(long j2, TimeSource timeSource) {
        x.f(timeSource, "timeSource");
        long jMo1117nowvQl9yQU = timeSource.mo1117nowvQl9yQU();
        c cVar = a.f48264a;
        return c.j(jMo1117nowvQl9yQU - j2, d.f48270a);
    }

    /* renamed from: now-GvorZiw, reason: not valid java name */
    public final long m1136nowGvorZiw(TimeSource timeSource) {
        x.f(timeSource, "timeSource");
        return timeSource.mo1117nowvQl9yQU();
    }
}
