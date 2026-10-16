package dg;

import Va.M6;
import cg.C1618g;
import cg.H;
import cg.o;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d extends o {

    /* renamed from: b, reason: collision with root package name */
    public final long f34295b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34296c;

    /* renamed from: d, reason: collision with root package name */
    public long f34297d;

    public d(H h10, long j8, boolean z2) {
        super(h10);
        this.f34295b = j8;
        this.f34296c = z2;
    }

    @Override // cg.o, cg.H
    public final long read(C1618g sink, long j8) throws IOException {
        AbstractC3340k.e(sink, "sink");
        long j10 = this.f34297d;
        long j11 = this.f34295b;
        if (j10 > j11) {
            j8 = 0;
        } else if (this.f34296c) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j8 = Math.min(j8, j12);
        }
        long j13 = super.read(sink, j8);
        if (j13 != -1) {
            this.f34297d += j13;
        }
        long j14 = this.f34297d;
        if ((j14 >= j11 || j13 != -1) && j14 <= j11) {
            return j13;
        }
        if (j13 > 0 && j14 > j11) {
            long j15 = sink.f19902b - (j14 - j11);
            C1618g c1618g = new C1618g();
            c1618g.q(sink);
            sink.E(c1618g, j15);
            c1618g.a();
        }
        StringBuilder sbU = M6.u(j11, "expected ", " bytes but got ");
        sbU.append(this.f34297d);
        throw new IOException(sbU.toString());
    }
}
