package R0;

import A.AbstractC0213f;

/* loaded from: classes.dex */
public abstract class o implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f10080a;

    /* renamed from: b, reason: collision with root package name */
    public Q0.d f10081b;

    /* renamed from: c, reason: collision with root package name */
    public l f10082c;

    /* renamed from: d, reason: collision with root package name */
    public int f10083d;

    /* renamed from: e, reason: collision with root package name */
    public final g f10084e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f10085f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10086g = false;

    /* renamed from: h, reason: collision with root package name */
    public final f f10087h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public final f f10088i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    public int f10089j = 1;

    public o(Q0.d dVar) {
        this.f10081b = dVar;
    }

    public static void b(f fVar, f fVar2, int i5) {
        fVar.f10068l.add(fVar2);
        fVar.f10063f = i5;
        fVar2.k.add(fVar);
    }

    public static f h(Q0.c cVar) {
        Q0.c cVar2 = cVar.f9511f;
        if (cVar2 == null) {
            return null;
        }
        int iF = AbstractC0213f.f(cVar2.f9510e);
        Q0.d dVar = cVar2.f9509d;
        if (iF == 1) {
            return dVar.f9546d.f10087h;
        }
        if (iF == 2) {
            return dVar.f9548e.f10087h;
        }
        if (iF == 3) {
            return dVar.f9546d.f10088i;
        }
        if (iF == 4) {
            return dVar.f9548e.f10088i;
        }
        if (iF != 5) {
            return null;
        }
        return dVar.f9548e.k;
    }

    public static f i(Q0.c cVar, int i5) {
        Q0.c cVar2 = cVar.f9511f;
        if (cVar2 == null) {
            return null;
        }
        Q0.d dVar = cVar2.f9509d;
        o oVar = i5 == 0 ? dVar.f9546d : dVar.f9548e;
        int iF = AbstractC0213f.f(cVar2.f9510e);
        if (iF == 1 || iF == 2) {
            return oVar.f10087h;
        }
        if (iF == 3 || iF == 4) {
            return oVar.f10088i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i5, g gVar) {
        fVar.f10068l.add(fVar2);
        fVar.f10068l.add(this.f10084e);
        fVar.f10065h = i5;
        fVar.f10066i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i5, int i10) {
        if (i10 == 0) {
            Q0.d dVar = this.f10081b;
            int i11 = dVar.f9576v;
            int iMax = Math.max(dVar.f9575u, i5);
            if (i11 > 0) {
                iMax = Math.min(i11, i5);
            }
            if (iMax != i5) {
                return iMax;
            }
        } else {
            Q0.d dVar2 = this.f10081b;
            int i12 = dVar2.f9579y;
            int iMax2 = Math.max(dVar2.f9578x, i5);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i5);
            }
            if (iMax2 != i5) {
                return iMax2;
            }
        }
        return i5;
    }

    public long j() {
        if (this.f10084e.f10067j) {
            return r0.f10064g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(Q0.c r12, Q0.c r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.o.l(Q0.c, Q0.c, int):void");
    }
}
