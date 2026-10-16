package Hf;

import Ef.C0494j;
import Ef.C0502n;
import If.AbstractC0621b;
import If.AbstractC0622c;
import If.AbstractC0623d;
import ef.C2515C;
import java.util.Arrays;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class j0 extends AbstractC0621b implements InterfaceC0590b0, InterfaceC0593d, If.w {

    /* renamed from: e, reason: collision with root package name */
    public final int f5146e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5147f;

    /* renamed from: g, reason: collision with root package name */
    public final Gf.a f5148g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f5149h;

    /* renamed from: i, reason: collision with root package name */
    public long f5150i;

    /* renamed from: j, reason: collision with root package name */
    public long f5151j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f5152l;

    public j0(int i5, int i10, Gf.a aVar) {
        this.f5146e = i5;
        this.f5147f = i10;
        this.f5148g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bc, code lost:
    
        throw r2.getCancellationException();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(Hf.j0 r8, Hf.InterfaceC0603m r9, jf.InterfaceC3103c r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.j0.k(Hf.j0, Hf.m, jf.c):void");
    }

    @Override // If.w
    public final InterfaceC0602l a(InterfaceC3108h interfaceC3108h, int i5, Gf.a aVar) {
        return k0.t(this, interfaceC3108h, i5, aVar);
    }

    @Override // Hf.InterfaceC0590b0
    public final boolean b(Object obj) {
        int i5;
        boolean z2;
        InterfaceC3103c[] interfaceC3103cArrN = AbstractC0622c.f5463a;
        synchronized (this) {
            if (q(obj)) {
                interfaceC3103cArrN = n(interfaceC3103cArrN);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (InterfaceC3103c interfaceC3103c : interfaceC3103cArrN) {
            if (interfaceC3103c != null) {
                interfaceC3103c.resumeWith(C2515C.f34653a);
            }
        }
        return z2;
    }

    @Override // Hf.InterfaceC0590b0
    public final void c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    t(o() + this.k, this.f5151j, o() + this.k, o() + this.k + this.f5152l);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // Hf.InterfaceC0602l
    public final Object collect(InterfaceC0603m interfaceC0603m, InterfaceC3103c interfaceC3103c) throws Throwable {
        k(this, interfaceC0603m, interfaceC3103c);
        return kf.a.f39711a;
    }

    @Override // If.AbstractC0621b
    public final AbstractC0623d e() {
        l0 l0Var = new l0();
        l0Var.f5157a = -1L;
        return l0Var;
    }

    @Override // Hf.InterfaceC0590b0, Hf.InterfaceC0603m
    public final Object emit(Object obj, InterfaceC3103c interfaceC3103c) throws Throwable {
        Throwable th;
        InterfaceC3103c[] interfaceC3103cArrN;
        h0 h0Var;
        if (b(obj)) {
            return C2515C.f34653a;
        }
        C0502n c0502n = new C0502n(1, A6.h.A(interfaceC3103c));
        c0502n.t();
        InterfaceC3103c[] interfaceC3103cArrN2 = AbstractC0622c.f5463a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        c0502n.resumeWith(C2515C.f34653a);
                        interfaceC3103cArrN = n(interfaceC3103cArrN2);
                        h0Var = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        h0 h0Var2 = new h0(this, o() + this.k + this.f5152l, obj, c0502n);
                        m(h0Var2);
                        this.f5152l++;
                        if (this.f5147f == 0) {
                            interfaceC3103cArrN2 = n(interfaceC3103cArrN2);
                        }
                        interfaceC3103cArrN = interfaceC3103cArrN2;
                        h0Var = h0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (h0Var != null) {
                    c0502n.w(new C0494j(h0Var, 2));
                }
                for (InterfaceC3103c interfaceC3103c2 : interfaceC3103cArrN) {
                    if (interfaceC3103c2 != null) {
                        interfaceC3103c2.resumeWith(C2515C.f34653a);
                    }
                }
                Object objS = c0502n.s();
                kf.a aVar = kf.a.f39711a;
                if (objS != aVar) {
                    objS = C2515C.f34653a;
                }
                return objS == aVar ? objS : C2515C.f34653a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // If.AbstractC0621b
    public final AbstractC0623d[] f() {
        return new l0[2];
    }

    public final Object i(l0 l0Var, i0 i0Var) {
        C0502n c0502n = new C0502n(1, A6.h.A(i0Var));
        c0502n.t();
        synchronized (this) {
            if (r(l0Var) < 0) {
                l0Var.f5158b = c0502n;
            } else {
                c0502n.resumeWith(C2515C.f34653a);
            }
        }
        Object objS = c0502n.s();
        return objS == kf.a.f39711a ? objS : C2515C.f34653a;
    }

    public final void j() {
        if (this.f5147f != 0 || this.f5152l > 1) {
            Object[] objArr = this.f5149h;
            AbstractC3340k.b(objArr);
            while (this.f5152l > 0) {
                long jO = o();
                int i5 = this.k;
                int i10 = this.f5152l;
                if (objArr[((int) ((jO + (i5 + i10)) - 1)) & (objArr.length - 1)] != k0.f5154a) {
                    return;
                }
                this.f5152l = i10 - 1;
                k0.f(objArr, o() + this.k + this.f5152l, null);
            }
        }
    }

    public final void l() {
        AbstractC0623d[] abstractC0623dArr;
        Object[] objArr = this.f5149h;
        AbstractC3340k.b(objArr);
        k0.f(objArr, o(), null);
        this.k--;
        long jO = o() + 1;
        if (this.f5150i < jO) {
            this.f5150i = jO;
        }
        if (this.f5151j < jO) {
            if (this.f5460b != 0 && (abstractC0623dArr = this.f5459a) != null) {
                for (AbstractC0623d abstractC0623d : abstractC0623dArr) {
                    if (abstractC0623d != null) {
                        l0 l0Var = (l0) abstractC0623d;
                        long j8 = l0Var.f5157a;
                        if (j8 >= 0 && j8 < jO) {
                            l0Var.f5157a = jO;
                        }
                    }
                }
            }
            this.f5151j = jO;
        }
    }

    public final void m(Object obj) {
        int i5 = this.k + this.f5152l;
        Object[] objArrP = this.f5149h;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i5 >= objArrP.length) {
            objArrP = p(objArrP, i5, objArrP.length * 2);
        }
        k0.f(objArrP, o() + i5, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    public final InterfaceC3103c[] n(InterfaceC3103c[] interfaceC3103cArr) {
        AbstractC0623d[] abstractC0623dArr;
        l0 l0Var;
        C0502n c0502n;
        int length = interfaceC3103cArr.length;
        if (this.f5460b != 0 && (abstractC0623dArr = this.f5459a) != null) {
            int length2 = abstractC0623dArr.length;
            int i5 = 0;
            interfaceC3103cArr = interfaceC3103cArr;
            while (i5 < length2) {
                AbstractC0623d abstractC0623d = abstractC0623dArr[i5];
                if (abstractC0623d != null && (c0502n = (l0Var = (l0) abstractC0623d).f5158b) != null && r(l0Var) >= 0) {
                    int length3 = interfaceC3103cArr.length;
                    interfaceC3103cArr = interfaceC3103cArr;
                    if (length >= length3) {
                        ?? CopyOf = Arrays.copyOf(interfaceC3103cArr, Math.max(2, interfaceC3103cArr.length * 2));
                        AbstractC3340k.d(CopyOf, "copyOf(...)");
                        interfaceC3103cArr = CopyOf;
                    }
                    interfaceC3103cArr[length] = c0502n;
                    l0Var.f5158b = null;
                    length++;
                }
                i5++;
                interfaceC3103cArr = interfaceC3103cArr;
            }
        }
        return interfaceC3103cArr;
    }

    public final long o() {
        return Math.min(this.f5151j, this.f5150i);
    }

    public final Object[] p(Object[] objArr, int i5, int i10) {
        if (i10 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i10];
        this.f5149h = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i11 = 0; i11 < i5; i11++) {
                long j8 = i11 + jO;
                k0.f(objArr2, j8, objArr[((int) j8) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.f5460b
            int r2 = r12.f5146e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L82
        Lb:
            r12.m(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.f5151j = r1
            return r9
        L23:
            int r1 = r12.k
            int r3 = r12.f5147f
            if (r1 < r3) goto L4a
            long r4 = r12.f5151j
            long r6 = r12.f5150i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L4a
            Gf.a r1 = r12.f5148g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L48
            if (r1 == r9) goto L4a
            r2 = 2
            if (r1 != r2) goto L3f
            goto L82
        L3f:
            E5.Q r1 = new E5.Q
            r2 = 9
            r3 = 0
            r1.<init>(r3, r2)
            throw r1
        L48:
            r1 = 0
            return r1
        L4a:
            r12.m(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r3) goto L57
            r12.l()
        L57:
            long r3 = r12.o()
            int r1 = r12.k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.f5150i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L82
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.f5151j
            long r5 = r12.o()
            int r7 = r12.k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.f5152l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.t(r1, r3, r5, r7)
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Hf.j0.q(java.lang.Object):boolean");
    }

    public final long r(l0 l0Var) {
        long j8 = l0Var.f5157a;
        if (j8 < o() + this.k) {
            return j8;
        }
        if (this.f5147f <= 0 && j8 <= o() && this.f5152l != 0) {
            return j8;
        }
        return -1L;
    }

    public final Object s(l0 l0Var) {
        Object obj;
        InterfaceC3103c[] interfaceC3103cArrU = AbstractC0622c.f5463a;
        synchronized (this) {
            try {
                long jR = r(l0Var);
                if (jR < 0) {
                    obj = k0.f5154a;
                } else {
                    long j8 = l0Var.f5157a;
                    Object[] objArr = this.f5149h;
                    AbstractC3340k.b(objArr);
                    Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                    if (obj2 instanceof h0) {
                        obj2 = ((h0) obj2).f5130c;
                    }
                    l0Var.f5157a = jR + 1;
                    Object obj3 = obj2;
                    interfaceC3103cArrU = u(j8);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC3103c interfaceC3103c : interfaceC3103cArrU) {
            if (interfaceC3103c != null) {
                interfaceC3103c.resumeWith(C2515C.f34653a);
            }
        }
        return obj;
    }

    public final void t(long j8, long j10, long j11, long j12) {
        long jMin = Math.min(j10, j8);
        for (long jO = o(); jO < jMin; jO++) {
            Object[] objArr = this.f5149h;
            AbstractC3340k.b(objArr);
            k0.f(objArr, jO, null);
        }
        this.f5150i = j8;
        this.f5151j = j10;
        this.k = (int) (j11 - jMin);
        this.f5152l = (int) (j12 - j11);
    }

    public final InterfaceC3103c[] u(long j8) {
        long j10;
        long j11;
        long j12;
        int i5;
        InterfaceC3103c[] interfaceC3103cArr;
        AbstractC0623d[] abstractC0623dArr;
        long j13 = this.f5151j;
        InterfaceC3103c[] interfaceC3103cArr2 = AbstractC0622c.f5463a;
        if (j8 <= j13) {
            long jO = o();
            long j14 = this.k + jO;
            int i10 = this.f5147f;
            if (i10 == 0 && this.f5152l > 0) {
                j14++;
            }
            int i11 = 0;
            if (this.f5460b != 0 && (abstractC0623dArr = this.f5459a) != null) {
                for (AbstractC0623d abstractC0623d : abstractC0623dArr) {
                    if (abstractC0623d != null) {
                        long j15 = ((l0) abstractC0623d).f5157a;
                        if (j15 >= 0 && j15 < j14) {
                            j14 = j15;
                        }
                    }
                }
            }
            if (j14 > this.f5151j) {
                long jO2 = o() + this.k;
                int iMin = this.f5460b > 0 ? Math.min(this.f5152l, i10 - ((int) (jO2 - j14))) : this.f5152l;
                long j16 = this.f5152l + jO2;
                H6.g gVar = k0.f5154a;
                if (iMin > 0) {
                    InterfaceC3103c[] interfaceC3103cArr3 = new InterfaceC3103c[iMin];
                    j12 = 1;
                    Object[] objArr = this.f5149h;
                    AbstractC3340k.b(objArr);
                    i5 = i10;
                    long j17 = jO2;
                    while (true) {
                        if (jO2 >= j16) {
                            j10 = jO;
                            j11 = j14;
                            break;
                        }
                        j10 = jO;
                        Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != gVar) {
                            AbstractC3340k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            h0 h0Var = (h0) obj;
                            int i12 = i11 + 1;
                            j11 = j14;
                            interfaceC3103cArr3[i11] = h0Var.f5131d;
                            k0.f(objArr, jO2, gVar);
                            k0.f(objArr, j17, h0Var.f5130c);
                            j17++;
                            if (i12 >= iMin) {
                                break;
                            }
                            i11 = i12;
                        } else {
                            j11 = j14;
                        }
                        jO2++;
                        jO = j10;
                        j14 = j11;
                    }
                    jO2 = j17;
                    interfaceC3103cArr = interfaceC3103cArr3;
                } else {
                    j10 = jO;
                    j11 = j14;
                    j12 = 1;
                    i5 = i10;
                    interfaceC3103cArr = interfaceC3103cArr2;
                }
                int i13 = (int) (jO2 - j10);
                long j18 = this.f5460b == 0 ? jO2 : j11;
                long jMax = Math.max(this.f5150i, jO2 - Math.min(this.f5146e, i13));
                if (i5 == 0 && jMax < j16) {
                    Object[] objArr2 = this.f5149h;
                    AbstractC3340k.b(objArr2);
                    if (AbstractC3340k.a(objArr2[((int) jMax) & (objArr2.length - 1)], gVar)) {
                        jO2 += j12;
                        jMax += j12;
                    }
                }
                t(jMax, j18, jO2, j16);
                j();
                return interfaceC3103cArr.length == 0 ? interfaceC3103cArr : n(interfaceC3103cArr);
            }
        }
        return interfaceC3103cArr2;
    }
}
