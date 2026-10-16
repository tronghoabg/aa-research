package kotlinx.coroutines.b.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class e<T> implements y<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h.c.j f51404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51405b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.a.a f51406c;

    public e(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        this.f51404a = jVar;
        this.f51405b = i2;
        this.f51406c = aVar;
        int i3 = kotlinx.coroutines.ai.f51347a;
    }

    static /* synthetic */ Object g(e eVar, kotlinx.coroutines.b.l lVar, h.c.e eVar2) {
        Object objD = aj.d(new l(lVar, eVar, (h.c.e) null, 1), eVar2);
        return objD == h.c.a.a.f48038a ? objD : h.ab.f48028a;
    }

    protected abstract Object a(kotlinx.coroutines.a.ad adVar, h.c.e eVar);

    protected abstract e b(h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar);

    protected String c() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[PHI: r5
  0x001a: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v5 int) binds: [B:7:0x0012, B:11:0x0018, B:14:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlinx.coroutines.b.a.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.b.k cc(h.c.j r3, int r4, kotlinx.coroutines.a.a r5) {
        /*
            r2 = this;
            int r0 = kotlinx.coroutines.ai.f51347a
            h.c.j r0 = r2.f51404a
            h.c.j r3 = r3.plus(r0)
            kotlinx.coroutines.a.a r1 = kotlinx.coroutines.a.a.f51271a
            if (r5 != r1) goto L24
            int r5 = r2.f51405b
            r1 = -3
            if (r5 != r1) goto L12
            goto L22
        L12:
            if (r4 != r1) goto L15
            goto L1a
        L15:
            r1 = -2
            if (r5 == r1) goto L22
            if (r4 != r1) goto L1c
        L1a:
            r4 = r5
            goto L22
        L1c:
            int r5 = r5 + r4
            if (r5 >= 0) goto L1a
            r4 = 2147483647(0x7fffffff, float:NaN)
        L22:
            kotlinx.coroutines.a.a r5 = r2.f51406c
        L24:
            boolean r0 = h.g.b.x.n(r3, r0)
            if (r0 == 0) goto L35
            int r0 = r2.f51405b
            if (r4 != r0) goto L35
            kotlinx.coroutines.a.a r0 = r2.f51406c
            if (r5 != r0) goto L35
            kotlinx.coroutines.b.k r2 = (kotlinx.coroutines.b.k) r2
            return r2
        L35:
            kotlinx.coroutines.b.a.e r2 = r2.b(r3, r4, r5)
            kotlinx.coroutines.b.k r2 = (kotlinx.coroutines.b.k) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.b.a.e.cc(h.c.j, int, kotlinx.coroutines.a.a):kotlinx.coroutines.b.k");
    }

    @Override // kotlinx.coroutines.b.k
    public Object collect(kotlinx.coroutines.b.l<? super T> lVar, h.c.e<? super h.ab> eVar) {
        return g(this, lVar, eVar);
    }

    public kotlinx.coroutines.a.af d(kotlinx.coroutines.af afVar) {
        int i2 = this.f51405b;
        kotlinx.coroutines.ag agVar = kotlinx.coroutines.ag.f51344c;
        h.g.a.p pVarH = h();
        if (i2 == -3) {
            i2 = -2;
        }
        return kotlinx.coroutines.a.ab.c(afVar, this.f51404a, i2, this.f51406c, agVar, pVarH);
    }

    public kotlinx.coroutines.b.k e() {
        return null;
    }

    public final h.g.a.p h() {
        return new f(this, (h.c.e) null, 1);
    }

    public String toString() throws IOException {
        ArrayList arrayList = new ArrayList(4);
        String strC = c();
        if (strC != null) {
            arrayList.add(strC);
        }
        h.c.j jVar = this.f51404a;
        if (jVar != h.c.k.f48060a) {
            Objects.toString(jVar);
            arrayList.add("context=".concat(String.valueOf(jVar)));
        }
        int i2 = this.f51405b;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        kotlinx.coroutines.a.a aVar = this.f51406c;
        if (aVar != kotlinx.coroutines.a.a.f51271a) {
            Objects.toString(aVar);
            arrayList.add("onBufferOverflow=".concat(String.valueOf(aVar)));
        }
        return aj.a(this) + "[" + h.a.i.aM(arrayList, ", ", null, null, 0, null, 62) + "]";
    }
}
