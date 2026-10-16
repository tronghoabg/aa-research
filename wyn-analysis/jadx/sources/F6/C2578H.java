package f6;

import E5.C0;
import ac.C1346a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import org.apache.tika.metadata.TikaCoreProperties;
import u6.AbstractC4256a;

/* renamed from: f6.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2578H implements InterfaceC2610w, InterfaceC2609v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2610w[] f34883a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f34884b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.fragment.app.X f34885c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f34886d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f34887e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2609v f34888f;

    /* renamed from: g, reason: collision with root package name */
    public a0 f34889g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC2610w[] f34890h;

    /* renamed from: i, reason: collision with root package name */
    public C1346a f34891i;

    public C2578H(androidx.fragment.app.X x5, long[] jArr, InterfaceC2610w... interfaceC2610wArr) {
        this.f34885c = x5;
        this.f34883a = interfaceC2610wArr;
        x5.getClass();
        this.f34891i = new C1346a(new W[0], 5);
        this.f34884b = new IdentityHashMap();
        this.f34890h = new InterfaceC2610w[0];
        for (int i5 = 0; i5 < interfaceC2610wArr.length; i5++) {
            long j8 = jArr[i5];
            if (j8 != 0) {
                this.f34883a[i5] = new C2576F(interfaceC2610wArr[i5], j8);
            }
        }
    }

    @Override // f6.InterfaceC2609v
    public final void a(InterfaceC2610w interfaceC2610w) {
        ArrayList arrayList = this.f34886d;
        arrayList.remove(interfaceC2610w);
        if (arrayList.isEmpty()) {
            InterfaceC2610w[] interfaceC2610wArr = this.f34883a;
            int i5 = 0;
            for (InterfaceC2610w interfaceC2610w2 : interfaceC2610wArr) {
                i5 += interfaceC2610w2.j().f35030a;
            }
            Z[] zArr = new Z[i5];
            int i10 = 0;
            for (int i11 = 0; i11 < interfaceC2610wArr.length; i11++) {
                a0 a0VarJ = interfaceC2610wArr[i11].j();
                int i12 = a0VarJ.f35030a;
                int i13 = 0;
                while (i13 < i12) {
                    Z zA = a0VarJ.a(i13);
                    Z z2 = new Z(i11 + TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER + zA.f35018b, zA.f35020d);
                    this.f34887e.put(z2, zA);
                    zArr[i10] = z2;
                    i13++;
                    i10++;
                }
            }
            this.f34889g = new a0(zArr);
            InterfaceC2609v interfaceC2609v = this.f34888f;
            interfaceC2609v.getClass();
            interfaceC2609v.a(this);
        }
    }

    @Override // f6.InterfaceC2609v
    public final void b(W w2) {
        InterfaceC2609v interfaceC2609v = this.f34888f;
        interfaceC2609v.getClass();
        interfaceC2609v.b(this);
    }

    @Override // f6.W
    public final long c() {
        return this.f34891i.c();
    }

    @Override // f6.InterfaceC2610w
    public final long d(long j8) {
        long jD = this.f34890h[0].d(j8);
        int i5 = 1;
        while (true) {
            InterfaceC2610w[] interfaceC2610wArr = this.f34890h;
            if (i5 >= interfaceC2610wArr.length) {
                return jD;
            }
            if (interfaceC2610wArr[i5].d(jD) != jD) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i5++;
        }
    }

    @Override // f6.W
    public final boolean e() {
        return this.f34891i.e();
    }

    @Override // f6.InterfaceC2610w
    public final long f() {
        long j8 = -9223372036854775807L;
        for (InterfaceC2610w interfaceC2610w : this.f34890h) {
            long jF = interfaceC2610w.f();
            if (jF == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && interfaceC2610w.d(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (InterfaceC2610w interfaceC2610w2 : this.f34890h) {
                    if (interfaceC2610w2 == interfaceC2610w) {
                        break;
                    }
                    if (interfaceC2610w2.d(jF) != jF) {
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

    @Override // f6.InterfaceC2610w
    public final void h() {
        for (InterfaceC2610w interfaceC2610w : this.f34883a) {
            interfaceC2610w.h();
        }
    }

    @Override // f6.InterfaceC2610w
    public final void i(long j8) {
        for (InterfaceC2610w interfaceC2610w : this.f34890h) {
            interfaceC2610w.i(j8);
        }
    }

    @Override // f6.InterfaceC2610w
    public final a0 j() {
        a0 a0Var = this.f34889g;
        a0Var.getClass();
        return a0Var;
    }

    @Override // f6.W
    public final long n() {
        return this.f34891i.n();
    }

    @Override // f6.W
    public final void o(long j8) {
        this.f34891i.o(j8);
    }

    @Override // f6.InterfaceC2610w
    public final void r(InterfaceC2609v interfaceC2609v, long j8) {
        this.f34888f = interfaceC2609v;
        ArrayList arrayList = this.f34886d;
        InterfaceC2610w[] interfaceC2610wArr = this.f34883a;
        Collections.addAll(arrayList, interfaceC2610wArr);
        for (InterfaceC2610w interfaceC2610w : interfaceC2610wArr) {
            interfaceC2610w.r(this, j8);
        }
    }

    @Override // f6.InterfaceC2610w
    public final long s(long j8, C0 c02) {
        InterfaceC2610w[] interfaceC2610wArr = this.f34890h;
        return (interfaceC2610wArr.length > 0 ? interfaceC2610wArr[0] : this.f34883a[0]).s(j8, c02);
    }

    @Override // f6.InterfaceC2610w
    public final long y(r6.n[] nVarArr, boolean[] zArr, V[] vArr, boolean[] zArr2, long j8) {
        HashMap map;
        IdentityHashMap identityHashMap;
        InterfaceC2610w[] interfaceC2610wArr;
        int[] iArr;
        int[] iArr2;
        int[] iArr3 = new int[nVarArr.length];
        int[] iArr4 = new int[nVarArr.length];
        int i5 = 0;
        while (true) {
            int length = nVarArr.length;
            map = this.f34887e;
            identityHashMap = this.f34884b;
            interfaceC2610wArr = this.f34883a;
            if (i5 >= length) {
                break;
            }
            V v2 = vArr[i5];
            Integer num = v2 == null ? null : (Integer) identityHashMap.get(v2);
            iArr3[i5] = num == null ? -1 : num.intValue();
            iArr4[i5] = -1;
            r6.n nVar = nVarArr[i5];
            if (nVar != null) {
                Z z2 = (Z) map.get(nVar.g());
                z2.getClass();
                int i10 = 0;
                while (true) {
                    if (i10 >= interfaceC2610wArr.length) {
                        break;
                    }
                    int iIndexOf = interfaceC2610wArr[i10].j().f35031b.indexOf(z2);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        iArr4[i5] = i10;
                        break;
                    }
                    i10++;
                }
            }
            i5++;
        }
        identityHashMap.clear();
        int length2 = nVarArr.length;
        V[] vArr2 = new V[length2];
        V[] vArr3 = new V[nVarArr.length];
        r6.n[] nVarArr2 = new r6.n[nVarArr.length];
        ArrayList arrayList = new ArrayList(interfaceC2610wArr.length);
        long j10 = j8;
        int i11 = 0;
        while (i11 < interfaceC2610wArr.length) {
            int i12 = 0;
            while (i12 < nVarArr.length) {
                vArr3[i12] = iArr3[i12] == i11 ? vArr[i12] : null;
                if (iArr4[i12] == i11) {
                    r6.n nVar2 = nVarArr[i12];
                    nVar2.getClass();
                    iArr = iArr3;
                    Z z10 = (Z) map.get(nVar2.g());
                    z10.getClass();
                    iArr2 = iArr4;
                    nVarArr2[i12] = new C2575E(nVar2, z10);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    nVarArr2[i12] = null;
                }
                i12++;
                iArr3 = iArr;
                iArr4 = iArr2;
            }
            int[] iArr5 = iArr3;
            int[] iArr6 = iArr4;
            ArrayList arrayList2 = arrayList;
            V[] vArr4 = vArr3;
            int i13 = i11;
            long jY = interfaceC2610wArr[i11].y(nVarArr2, zArr, vArr4, zArr2, j10);
            if (i13 == 0) {
                j10 = jY;
            } else if (jY != j10) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i14 = 0; i14 < nVarArr.length; i14++) {
                if (iArr6[i14] == i13) {
                    V v10 = vArr4[i14];
                    v10.getClass();
                    vArr2[i14] = vArr4[i14];
                    identityHashMap.put(v10, Integer.valueOf(i13));
                    z11 = true;
                } else if (iArr5[i14] == i13) {
                    AbstractC4256a.i(vArr4[i14] == null);
                }
            }
            if (z11) {
                arrayList2.add(interfaceC2610wArr[i13]);
            }
            i11 = i13 + 1;
            arrayList = arrayList2;
            vArr3 = vArr4;
            iArr3 = iArr5;
            iArr4 = iArr6;
        }
        System.arraycopy(vArr2, 0, vArr, 0, length2);
        InterfaceC2610w[] interfaceC2610wArr2 = (InterfaceC2610w[]) arrayList.toArray(new InterfaceC2610w[0]);
        this.f34890h = interfaceC2610wArr2;
        this.f34885c.getClass();
        this.f34891i = new C1346a(interfaceC2610wArr2, 5);
        return j10;
    }

    @Override // f6.W
    public final boolean z(long j8) {
        ArrayList arrayList = this.f34886d;
        if (arrayList.isEmpty()) {
            return this.f34891i.z(j8);
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((InterfaceC2610w) arrayList.get(i5)).z(j8);
        }
        return false;
    }
}
