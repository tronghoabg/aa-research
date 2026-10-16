package G4;

import O.B;
import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.A0;
import androidx.datastore.preferences.protobuf.AbstractC1387d;
import androidx.datastore.preferences.protobuf.AbstractC1394k;
import androidx.datastore.preferences.protobuf.AbstractC1405w;
import androidx.datastore.preferences.protobuf.AbstractC1407y;
import androidx.datastore.preferences.protobuf.C1390g;
import androidx.datastore.preferences.protobuf.C1391h;
import androidx.datastore.preferences.protobuf.C1396m;
import androidx.datastore.preferences.protobuf.C1408z;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.InterfaceC1385b0;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r;
import androidx.datastore.preferences.protobuf.v0;
import ff.m;
import hb.G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f4233a;

    /* renamed from: b, reason: collision with root package name */
    public int f4234b;

    /* renamed from: c, reason: collision with root package name */
    public int f4235c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4236d;

    public f() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f4235c = iHighestOneBit - 1;
        this.f4236d = new int[iHighestOneBit];
    }

    public static void Y(int i5) throws A {
        if ((i5 & 3) != 0) {
            throw A.e();
        }
    }

    public static void Z(int i5) throws A {
        if ((i5 & 7) != 0) {
            throw A.e();
        }
    }

    public long A() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).m();
    }

    public void B(List list) throws A {
        int iZ;
        boolean z2 = list instanceof H;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.m();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.m();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(c1391h.m()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Long.valueOf(c1391h.m()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public Object C(InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) throws A {
        C1391h c1391h = (C1391h) this.f4236d;
        int iA = c1391h.A();
        if (c1391h.f18210a >= 100) {
            throw new A("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = c1391h.e(iA);
        Object objNewInstance = interfaceC1385b0.newInstance();
        c1391h.f18210a++;
        interfaceC1385b0.e(objNewInstance, this, c1396m);
        interfaceC1385b0.a(objNewInstance);
        c1391h.a(0);
        c1391h.f18210a--;
        c1391h.d(iE);
        return objNewInstance;
    }

    public Object D(InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) throws C1408z {
        W(2);
        return C(interfaceC1385b0, c1396m);
    }

    public int E() throws C1408z {
        W(5);
        return ((C1391h) this.f4236d).v();
    }

    public void F(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 2) {
                Y(c1391h.A());
                c1391h.v();
                throw null;
            }
            if (i5 != 5) {
                throw A.b();
            }
            c1391h.v();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 2) {
            int iA = c1391h.A();
            Y(iA);
            int iB = c1391h.b() + iA;
            do {
                list.add(Integer.valueOf(c1391h.v()));
            } while (c1391h.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c1391h.v()));
            if (c1391h.c()) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == this.f4233a);
        this.f4235c = iZ;
    }

    public long G() throws C1408z {
        W(1);
        return ((C1391h) this.f4236d).w();
    }

    public void H(List list) throws A {
        int iZ;
        boolean z2 = list instanceof H;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 1) {
                c1391h.w();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            Z(c1391h.A());
            c1391h.w();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(c1391h.w()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iA = c1391h.A();
        Z(iA);
        int iB = c1391h.b() + iA;
        do {
            list.add(Long.valueOf(c1391h.w()));
        } while (c1391h.b() < iB);
    }

    public int I() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).x();
    }

    public void J(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.x();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.x();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(c1391h.x()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Integer.valueOf(c1391h.x()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public long K() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).y();
    }

    public void L(List list) throws A {
        int iZ;
        boolean z2 = list instanceof H;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.y();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.y();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(c1391h.y()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Long.valueOf(c1391h.y()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public String M() throws C1408z {
        W(2);
        C1391h c1391h = (C1391h) this.f4236d;
        int iS = c1391h.s();
        byte[] bArr = c1391h.f18213d;
        if (iS > 0) {
            int i5 = c1391h.f18214e;
            int i10 = c1391h.f18216g;
            if (iS <= i5 - i10) {
                String str = new String(bArr, i10, iS, AbstractC1407y.f18274a);
                c1391h.f18216g += iS;
                return str;
            }
        }
        if (iS == 0) {
            return "";
        }
        if (iS > c1391h.f18214e) {
            return new String(c1391h.n(iS), AbstractC1407y.f18274a);
        }
        c1391h.D(iS);
        String str2 = new String(bArr, c1391h.f18216g, iS, AbstractC1407y.f18274a);
        c1391h.f18216g += iS;
        return str2;
    }

    public void N(List list, boolean z2) throws C1408z {
        int iZ;
        int iZ2;
        if ((this.f4233a & 7) != 2) {
            throw A.b();
        }
        boolean z10 = list instanceof D;
        C1391h c1391h = (C1391h) this.f4236d;
        if (!z10 || z2) {
            do {
                list.add(z2 ? O() : M());
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        D d3 = (D) list;
        do {
            d3.D(j());
            if (c1391h.c()) {
                return;
            } else {
                iZ2 = c1391h.z();
            }
        } while (iZ2 == this.f4233a);
        this.f4235c = iZ2;
    }

    public String O() throws C1408z {
        W(2);
        C1391h c1391h = (C1391h) this.f4236d;
        int iS = c1391h.s();
        int i5 = c1391h.f18216g;
        int i10 = c1391h.f18214e;
        int i11 = i10 - i5;
        byte[] bArrN = c1391h.f18213d;
        if (iS <= i11 && iS > 0) {
            c1391h.f18216g = i5 + iS;
        } else {
            if (iS == 0) {
                return "";
            }
            i5 = 0;
            if (iS <= i10) {
                c1391h.D(iS);
                c1391h.f18216g = iS;
            } else {
                bArrN = c1391h.n(iS);
            }
        }
        return v0.f18273a.e(i5, iS, bArrN);
    }

    public int P() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).A();
    }

    public void Q(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.A();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.A();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(c1391h.A()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Integer.valueOf(c1391h.A()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public long R() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).B();
    }

    public void S(List list) throws A {
        int iZ;
        boolean z2 = list instanceof H;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.B();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.B();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Long.valueOf(c1391h.B()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Long.valueOf(c1391h.B()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public long T() {
        int i5 = this.f4234b;
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        int i10 = this.f4233a;
        long j8 = ((long[]) this.f4236d)[i10];
        this.f4233a = (i10 + 1) & this.f4235c;
        this.f4234b = i5 - 1;
        return j8;
    }

    public void U(Object[] objArr, int i5, int i10) {
        int i11;
        Object obj;
        this.f4234b--;
        while (true) {
            int i12 = i5 + 1;
            while (true) {
                i11 = i12 & i10;
                obj = objArr[i11];
                if (obj == null) {
                    objArr[i5] = null;
                    return;
                }
                int iHashCode = obj.hashCode() * (-1640531527);
                int i13 = (iHashCode ^ (iHashCode >>> 16)) & i10;
                if (i5 <= i11) {
                    if (i5 >= i13 || i13 > i11) {
                        break;
                    } else {
                        i12 = i11 + 1;
                    }
                } else if (i5 < i13 || i13 <= i11) {
                    i12 = i11 + 1;
                }
            }
            objArr[i5] = obj;
            i5 = i11;
        }
    }

    public void V(int i5) throws A {
        if (((C1391h) this.f4236d).b() != i5) {
            throw A.f();
        }
    }

    public void W(int i5) throws C1408z {
        if ((this.f4233a & 7) != i5) {
            throw A.b();
        }
    }

    public boolean X() {
        int i5;
        C1391h c1391h = (C1391h) this.f4236d;
        if (c1391h.c() || (i5 = this.f4233a) == this.f4234b) {
            return false;
        }
        return c1391h.E(i5);
    }

    public void a(Je.b bVar) {
        Object obj;
        Object obj2;
        Object[] objArr = (Object[]) this.f4236d;
        int i5 = this.f4233a;
        int iHashCode = bVar.hashCode() * (-1640531527);
        int i10 = (iHashCode ^ (iHashCode >>> 16)) & i5;
        Object obj3 = objArr[i10];
        if (obj3 != null) {
            if (obj3.equals(bVar)) {
                return;
            }
            do {
                i10 = (i10 + 1) & i5;
                obj2 = objArr[i10];
                if (obj2 == null) {
                }
            } while (!obj2.equals(bVar));
            return;
        }
        objArr[i10] = bVar;
        int i11 = this.f4234b + 1;
        this.f4234b = i11;
        if (i11 < this.f4235c) {
            return;
        }
        Object[] objArr2 = (Object[]) this.f4236d;
        int length = objArr2.length;
        int i12 = length << 1;
        int i13 = i12 - 1;
        Object[] objArr3 = new Object[i12];
        while (true) {
            int i14 = i11 - 1;
            if (i11 == 0) {
                this.f4233a = i13;
                this.f4235c = (int) (i12 * 0.75f);
                this.f4236d = objArr3;
                return;
            }
            do {
                length--;
                obj = objArr2[length];
            } while (obj == null);
            int iHashCode2 = obj.hashCode() * (-1640531527);
            int i15 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i13;
            if (objArr3[i15] != null) {
                do {
                    i15 = (i15 + 1) & i13;
                } while (objArr3[i15] != null);
            }
            objArr3[i15] = objArr2[length];
            i11 = i14;
        }
    }

    public void b(G g9) {
        g9.f36252c = null;
        g9.f36250a = null;
        g9.f36251b = null;
        g9.f36258i = 1;
        int i5 = this.f4233a;
        if (i5 > 0) {
            int i10 = this.f4235c;
            if ((i10 & 1) == 0) {
                this.f4235c = i10 + 1;
                this.f4233a = i5 - 1;
                this.f4234b++;
            }
        }
        g9.f36250a = (G) this.f4236d;
        this.f4236d = g9;
        int i11 = this.f4235c;
        int i12 = i11 + 1;
        this.f4235c = i12;
        int i13 = this.f4233a;
        if (i13 > 0 && (i12 & 1) == 0) {
            this.f4235c = i11 + 2;
            this.f4233a = i13 - 1;
            this.f4234b++;
        }
        int i14 = 4;
        while (true) {
            int i15 = i14 - 1;
            if ((this.f4235c & i15) != i15) {
                return;
            }
            int i16 = this.f4234b;
            if (i16 == 0) {
                G g10 = (G) this.f4236d;
                G g11 = g10.f36250a;
                G g12 = g11.f36250a;
                g11.f36250a = g12.f36250a;
                this.f4236d = g11;
                g11.f36251b = g12;
                g11.f36252c = g10;
                g11.f36258i = g10.f36258i + 1;
                g12.f36250a = g11;
                g10.f36250a = g11;
            } else if (i16 == 1) {
                G g13 = (G) this.f4236d;
                G g14 = g13.f36250a;
                this.f4236d = g14;
                g14.f36252c = g13;
                g14.f36258i = g13.f36258i + 1;
                g13.f36250a = g14;
                this.f4234b = 0;
            } else if (i16 == 2) {
                this.f4234b = 0;
            }
            i14 *= 2;
        }
    }

    public void c(int i5) {
        int[] iArr = (int[]) this.f4236d;
        int i10 = this.f4234b;
        iArr[i10] = i5;
        int i11 = this.f4235c & (i10 + 1);
        this.f4234b = i11;
        int i12 = this.f4233a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            m.g0(0, i12, length, iArr, iArr2);
            m.g0(i13, 0, this.f4233a, (int[]) this.f4236d, iArr2);
            this.f4236d = iArr2;
            this.f4233a = 0;
            this.f4234b = length;
            this.f4235c = i14 - 1;
        }
    }

    public int d() {
        int i5 = this.f4235c;
        if (i5 != 0) {
            this.f4233a = i5;
            this.f4235c = 0;
        } else {
            this.f4233a = ((C1391h) this.f4236d).z();
        }
        int i10 = this.f4233a;
        return (i10 == 0 || i10 == this.f4234b) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : i10 >>> 3;
    }

    public int e(int i5) {
        return ((B) this.f4236d).f8702d[this.f4234b + i5];
    }

    public Object f(int i5) {
        return ((B) this.f4236d).f8704f[this.f4235c + i5];
    }

    public int g() {
        return this.f4233a;
    }

    public boolean h() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).f();
    }

    public void i(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1387d;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.f();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.f();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Boolean.valueOf(c1391h.f()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Boolean.valueOf(c1391h.f()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public C1390g j() throws C1408z {
        W(2);
        C1391h c1391h = (C1391h) this.f4236d;
        int iS = c1391h.s();
        int i5 = c1391h.f18214e;
        int i10 = c1391h.f18216g;
        int i11 = i5 - i10;
        byte[] bArr = c1391h.f18213d;
        if (iS <= i11 && iS > 0) {
            C1390g c1390gA = C1390g.a(i10, iS, bArr);
            c1391h.f18216g += iS;
            return c1390gA;
        }
        if (iS == 0) {
            return C1390g.f18203c;
        }
        byte[] bArrO = c1391h.o(iS);
        if (bArrO != null) {
            return C1390g.a(0, bArrO.length, bArrO);
        }
        int i12 = c1391h.f18216g;
        int i13 = c1391h.f18214e;
        int length = i13 - i12;
        c1391h.f18218i += i13;
        c1391h.f18216g = 0;
        c1391h.f18214e = 0;
        ArrayList arrayListP = c1391h.p(iS - length);
        byte[] bArr2 = new byte[iS];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        Iterator it = arrayListP.iterator();
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C1390g c1390g = C1390g.f18203c;
        return new C1390g(bArr2);
    }

    public void k(List list) throws C1408z {
        int iZ;
        if ((this.f4233a & 7) != 2) {
            throw A.b();
        }
        do {
            list.add(j());
            C1391h c1391h = (C1391h) this.f4236d;
            if (c1391h.c()) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == this.f4233a);
        this.f4235c = iZ;
    }

    public double l() throws C1408z {
        W(1);
        return ((C1391h) this.f4236d).g();
    }

    public void m(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1394k;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 1) {
                c1391h.g();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            Z(c1391h.A());
            c1391h.g();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 1) {
            do {
                list.add(Double.valueOf(c1391h.g()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iA = c1391h.A();
        Z(iA);
        int iB = c1391h.b() + iA;
        do {
            list.add(Double.valueOf(c1391h.g()));
        } while (c1391h.b() < iB);
    }

    public int n() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).h();
    }

    public void o(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.h();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.h();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(c1391h.h()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Integer.valueOf(c1391h.h()));
        } while (c1391h.b() < iB);
        V(iB);
    }

    public Object p(A0 a02, Class cls, C1396m c1396m) throws C1408z {
        switch (a02.ordinal()) {
            case 0:
                return Double.valueOf(l());
            case 1:
                return Float.valueOf(u());
            case 2:
                return Long.valueOf(A());
            case 3:
                return Long.valueOf(R());
            case 4:
                return Integer.valueOf(y());
            case 5:
                return Long.valueOf(s());
            case 6:
                return Integer.valueOf(q());
            case 7:
                return Boolean.valueOf(h());
            case 8:
                return O();
            case 9:
            default:
                throw new RuntimeException("unsupported field type.");
            case 10:
                W(2);
                return C(Y.f18175c.a(cls), c1396m);
            case 11:
                return j();
            case 12:
                return Integer.valueOf(P());
            case 13:
                return Integer.valueOf(n());
            case 14:
                return Integer.valueOf(E());
            case 15:
                return Long.valueOf(G());
            case 16:
                return Integer.valueOf(I());
            case 17:
                return Long.valueOf(K());
        }
    }

    public int q() throws C1408z {
        W(5);
        return ((C1391h) this.f4236d).i();
    }

    public void r(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 2) {
                Y(c1391h.A());
                c1391h.i();
                throw null;
            }
            if (i5 != 5) {
                throw A.b();
            }
            c1391h.i();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 2) {
            int iA = c1391h.A();
            Y(iA);
            int iB = c1391h.b() + iA;
            do {
                list.add(Integer.valueOf(c1391h.i()));
            } while (c1391h.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw A.b();
        }
        do {
            list.add(Integer.valueOf(c1391h.i()));
            if (c1391h.c()) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == this.f4233a);
        this.f4235c = iZ;
    }

    public long s() throws C1408z {
        W(1);
        return ((C1391h) this.f4236d).j();
    }

    public void t(List list) throws A {
        int iZ;
        boolean z2 = list instanceof H;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 1) {
                c1391h.j();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            Z(c1391h.A());
            c1391h.j();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 1) {
            do {
                list.add(Long.valueOf(c1391h.j()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iA = c1391h.A();
        Z(iA);
        int iB = c1391h.b() + iA;
        do {
            list.add(Long.valueOf(c1391h.j()));
        } while (c1391h.b() < iB);
    }

    public float u() throws C1408z {
        W(5);
        return ((C1391h) this.f4236d).k();
    }

    public void v(List list) throws A {
        int iZ;
        boolean z2 = list instanceof r;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 2) {
                Y(c1391h.A());
                c1391h.k();
                throw null;
            }
            if (i5 != 5) {
                throw A.b();
            }
            c1391h.k();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 2) {
            int iA = c1391h.A();
            Y(iA);
            int iB = c1391h.b() + iA;
            do {
                list.add(Float.valueOf(c1391h.k()));
            } while (c1391h.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw A.b();
        }
        do {
            list.add(Float.valueOf(c1391h.k()));
            if (c1391h.c()) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == this.f4233a);
        this.f4235c = iZ;
    }

    public Object w(InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) {
        int i5 = this.f4234b;
        this.f4234b = ((this.f4233a >>> 3) << 3) | 4;
        try {
            Object objNewInstance = interfaceC1385b0.newInstance();
            interfaceC1385b0.e(objNewInstance, this, c1396m);
            interfaceC1385b0.a(objNewInstance);
            if (this.f4233a == this.f4234b) {
                return objNewInstance;
            }
            throw A.e();
        } finally {
            this.f4234b = i5;
        }
    }

    public Object x(InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) throws C1408z {
        W(3);
        return w(interfaceC1385b0, c1396m);
    }

    public int y() throws C1408z {
        W(0);
        return ((C1391h) this.f4236d).l();
    }

    public void z(List list) throws A {
        int iZ;
        boolean z2 = list instanceof AbstractC1405w;
        C1391h c1391h = (C1391h) this.f4236d;
        if (z2) {
            if (list != null) {
                throw new ClassCastException();
            }
            int i5 = this.f4233a & 7;
            if (i5 == 0) {
                c1391h.l();
                throw null;
            }
            if (i5 != 2) {
                throw A.b();
            }
            c1391h.A();
            c1391h.l();
            throw null;
        }
        int i10 = this.f4233a & 7;
        if (i10 == 0) {
            do {
                list.add(Integer.valueOf(c1391h.l()));
                if (c1391h.c()) {
                    return;
                } else {
                    iZ = c1391h.z();
                }
            } while (iZ == this.f4233a);
            this.f4235c = iZ;
            return;
        }
        if (i10 != 2) {
            throw A.b();
        }
        int iB = c1391h.b() + c1391h.A();
        do {
            list.add(Integer.valueOf(c1391h.l()));
        } while (c1391h.b() < iB);
        V(iB);
    }
}
