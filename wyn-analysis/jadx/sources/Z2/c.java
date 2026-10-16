package Z2;

import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.C;
import s2.j;
import s2.m;
import s2.n;
import s2.o;
import vf.AbstractC4345a;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public o f16945a;

    /* renamed from: b, reason: collision with root package name */
    public C f16946b;

    /* renamed from: c, reason: collision with root package name */
    public int f16947c;

    /* renamed from: d, reason: collision with root package name */
    public long f16948d;

    /* renamed from: e, reason: collision with root package name */
    public b f16949e;

    /* renamed from: f, reason: collision with root package name */
    public int f16950f;

    /* renamed from: g, reason: collision with root package name */
    public long f16951g;

    @Override // s2.m
    public final void a(long j8, long j10) {
        this.f16947c = j8 == 0 ? 0 : 4;
        b bVar = this.f16949e;
        if (bVar != null) {
            bVar.b(j10);
        }
    }

    @Override // s2.m
    public final void g(o oVar) {
        this.f16945a = oVar;
        this.f16946b = oVar.mo0m(0, 1);
        oVar.l();
    }

    @Override // s2.m
    public final m h() {
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) {
        return AbstractC4345a.k((j) nVar);
    }

    @Override // s2.m
    public final List j() {
        C3407I c3407i = AbstractC3409K.f40056b;
        return e0.f40101e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x018b, code lost:
    
        if (r12 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b4  */
    @Override // s2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int k(s2.n r25, J5.n r26) throws java.io.EOFException, java.io.InterruptedIOException, N1.D {
        /*
            Method dump skipped, instructions count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.c.k(s2.n, J5.n):int");
    }

    @Override // s2.m
    public final void release() {
    }
}
