package k.a;

import h.g.b.x;
import java.io.IOException;
import k.am;
import k.r;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d extends r {

    /* renamed from: a, reason: collision with root package name */
    private final long f50754a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f50755b;

    /* renamed from: c, reason: collision with root package name */
    private long f50756c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(am amVar, long j2, boolean z) {
        super(amVar);
        x.f(amVar, "delegate");
        this.f50754a = j2;
        this.f50755b = z;
    }

    @Override // k.r, k.am
    public final long a(k.h hVar, long j2) throws IOException {
        x.f(hVar, "sink");
        long j3 = this.f50756c;
        long j4 = this.f50754a;
        if (j3 > j4) {
            j2 = 0;
        } else if (this.f50755b) {
            long j5 = j4 - j3;
            if (j5 == 0) {
                return -1L;
            }
            j2 = Math.min(j2, j5);
        }
        long jA = super.a(hVar, j2);
        if (jA != -1) {
            this.f50756c += jA;
        }
        long j6 = this.f50756c;
        if ((j6 >= j4 || jA != -1) && j6 <= j4) {
            return jA;
        }
        if (jA > 0 && j6 > j4) {
            long jQ = hVar.q() - (j6 - j4);
            k.h hVar2 = new k.h();
            hVar2.ac(hVar);
            hVar.l(hVar2, jQ);
            hVar2.N();
        }
        throw new IOException("expected " + j4 + " bytes but got " + this.f50756c);
    }
}
