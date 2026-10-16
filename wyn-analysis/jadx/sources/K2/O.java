package k2;

import N1.C0764m;
import N1.C0765n;
import a9.C1342b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3407I;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public final class O implements F, InterfaceC3143E {

    /* renamed from: a, reason: collision with root package name */
    public final F[] f38921a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f38922b;

    /* renamed from: c, reason: collision with root package name */
    public final C1342b f38923c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f38924d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f38925e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC3143E f38926f;

    /* renamed from: g, reason: collision with root package name */
    public n0 f38927g;

    /* renamed from: h, reason: collision with root package name */
    public F[] f38928h;

    /* renamed from: i, reason: collision with root package name */
    public C3157n f38929i;

    public O(C1342b c1342b, long[] jArr, F... fArr) {
        this.f38923c = c1342b;
        this.f38921a = fArr;
        c1342b.getClass();
        C3407I c3407i = AbstractC3409K.f40056b;
        l8.e0 e0Var = l8.e0.f40101e;
        this.f38929i = new C3157n(e0Var, e0Var);
        this.f38922b = new IdentityHashMap();
        this.f38928h = new F[0];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            long j8 = jArr[i5];
            if (j8 != 0) {
                this.f38921a[i5] = new m0(fArr[i5], j8);
            }
        }
    }

    @Override // k2.e0
    public final void a(f0 f0Var) {
        InterfaceC3143E interfaceC3143E = this.f38926f;
        interfaceC3143E.getClass();
        interfaceC3143E.a(this);
    }

    @Override // k2.F
    public final long b(long j8, U1.a0 a0Var) {
        F[] fArr = this.f38928h;
        return (fArr.length > 0 ? fArr[0] : this.f38921a[0]).b(j8, a0Var);
    }

    @Override // k2.f0
    public final long c() {
        return this.f38929i.c();
    }

    @Override // k2.F
    public final long d(long j8) {
        long jD = this.f38928h[0].d(j8);
        int i5 = 1;
        while (true) {
            F[] fArr = this.f38928h;
            if (i5 >= fArr.length) {
                return jD;
            }
            if (fArr[i5].d(jD) != jD) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i5++;
        }
    }

    @Override // k2.f0
    public final boolean e() {
        return this.f38929i.e();
    }

    @Override // k2.F
    public final long f() {
        long j8 = -9223372036854775807L;
        for (F f10 : this.f38928h) {
            long jF = f10.f();
            if (jF == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && f10.d(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (F f11 : this.f38928h) {
                    if (f11 == f10) {
                        break;
                    }
                    if (f11.d(jF) != jF) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = jF;
            } else if (jF != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // k2.F
    public final void h() {
        for (F f10 : this.f38921a) {
            f10.h();
        }
    }

    @Override // k2.F
    public final void i(long j8) {
        for (F f10 : this.f38928h) {
            f10.i(j8);
        }
    }

    @Override // k2.F
    public final n0 j() {
        n0 n0Var = this.f38927g;
        n0Var.getClass();
        return n0Var;
    }

    @Override // k2.f0
    public final boolean k(U1.C c10) {
        ArrayList arrayList = this.f38924d;
        if (arrayList.isEmpty()) {
            return this.f38929i.k(c10);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((F) arrayList.get(i5)).k(c10);
        }
        return false;
    }

    @Override // k2.InterfaceC3143E
    public final void l(F f10) {
        ArrayList arrayList = this.f38924d;
        arrayList.remove(f10);
        if (arrayList.isEmpty()) {
            F[] fArr = this.f38921a;
            int i5 = 0;
            for (F f11 : fArr) {
                i5 += f11.j().f39128a;
            }
            N1.O[] oArr = new N1.O[i5];
            int i10 = 0;
            for (int i11 = 0; i11 < fArr.length; i11++) {
                n0 n0VarJ = fArr[i11].j();
                int i12 = n0VarJ.f39128a;
                int i13 = 0;
                while (i13 < i12) {
                    N1.O oA = n0VarJ.a(i13);
                    int i14 = oA.f8073a;
                    C0765n[] c0765nArr = new C0765n[i14];
                    for (int i15 = 0; i15 < i14; i15++) {
                        C0765n c0765n = oA.f8076d[i15];
                        C0764m c0764mA = c0765n.a();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i11);
                        sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                        String str = c0765n.f8220a;
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        c0764mA.f8183a = sb2.toString();
                        c0765nArr[i15] = new C0765n(c0764mA);
                    }
                    N1.O o7 = new N1.O(i11 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + oA.f8074b, c0765nArr);
                    this.f38925e.put(o7, oA);
                    oArr[i10] = o7;
                    i13++;
                    i10++;
                }
            }
            this.f38927g = new n0(oArr);
            InterfaceC3143E interfaceC3143E = this.f38926f;
            interfaceC3143E.getClass();
            interfaceC3143E.l(this);
        }
    }

    @Override // k2.f0
    public final long n() {
        return this.f38929i.n();
    }

    @Override // k2.f0
    public final void o(long j8) {
        this.f38929i.o(j8);
    }

    @Override // k2.F
    public final void q(InterfaceC3143E interfaceC3143E, long j8) {
        this.f38926f = interfaceC3143E;
        ArrayList arrayList = this.f38924d;
        F[] fArr = this.f38921a;
        Collections.addAll(arrayList, fArr);
        for (F f10 : fArr) {
            f10.q(this, j8);
        }
    }

    @Override // k2.F
    public final long r(n2.q[] qVarArr, boolean[] zArr, d0[] d0VarArr, boolean[] zArr2, long j8) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[qVarArr.length];
        int[] iArr3 = new int[qVarArr.length];
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.f38922b;
            if (i10 >= length) {
                break;
            }
            d0 d0Var = d0VarArr[i10];
            Integer num = d0Var == null ? null : (Integer) identityHashMap.get(d0Var);
            iArr2[i10] = num == null ? -1 : num.intValue();
            n2.q qVar = qVarArr[i10];
            if (qVar != null) {
                String str = qVar.g().f8074b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        d0[] d0VarArr2 = new d0[length2];
        d0[] d0VarArr3 = new d0[qVarArr.length];
        n2.q[] qVarArr2 = new n2.q[qVarArr.length];
        F[] fArr = this.f38921a;
        ArrayList arrayList = new ArrayList(fArr.length);
        long j10 = j8;
        int i11 = 0;
        while (i11 < fArr.length) {
            int i12 = i5;
            while (i12 < qVarArr.length) {
                d0VarArr3[i12] = iArr2[i12] == i11 ? d0VarArr[i12] : null;
                if (iArr3[i12] == i11) {
                    n2.q qVar2 = qVarArr[i12];
                    qVar2.getClass();
                    iArr = iArr2;
                    N1.O o7 = (N1.O) this.f38925e.get(qVar2.g());
                    o7.getClass();
                    qVarArr2[i12] = new N(qVar2, o7);
                } else {
                    iArr = iArr2;
                    qVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            F[] fArr2 = fArr;
            int i13 = i11;
            long jR = fArr2[i11].r(qVarArr2, zArr, d0VarArr3, zArr2, j10);
            if (i13 == 0) {
                j10 = jR;
            } else if (jR != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z2 = false;
            for (int i14 = 0; i14 < qVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    d0 d0Var2 = d0VarArr3[i14];
                    d0Var2.getClass();
                    d0VarArr2[i14] = d0VarArr3[i14];
                    identityHashMap.put(d0Var2, Integer.valueOf(i13));
                    z2 = true;
                } else if (iArr4[i14] == i13) {
                    Q1.k.g(d0VarArr3[i14] == null);
                }
            }
            if (z2) {
                arrayList.add(fArr2[i13]);
            }
            i11 = i13 + 1;
            fArr = fArr2;
            iArr2 = iArr4;
            i5 = 0;
        }
        int i15 = i5;
        System.arraycopy(d0VarArr2, i15, d0VarArr, i15, length2);
        this.f38928h = (F[]) arrayList.toArray(new F[i15]);
        AbstractList abstractListV = AbstractC3437s.v(arrayList, new C3146c(1));
        this.f38923c.getClass();
        this.f38929i = new C3157n(arrayList, abstractListV);
        return j10;
    }
}
