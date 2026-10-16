package androidx.datastore.preferences.protobuf;

import Va.M6;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements InterfaceC1385b0 {

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f18155o = new int[0];

    /* renamed from: p, reason: collision with root package name */
    public static final Unsafe f18156p = s0.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f18157a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f18158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18160d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC1404v f18161e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18162f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18163g;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f18164h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18165i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18166j;
    public final U k;

    /* renamed from: l, reason: collision with root package name */
    public final G f18167l;

    /* renamed from: m, reason: collision with root package name */
    public final k0 f18168m;

    /* renamed from: n, reason: collision with root package name */
    public final N f18169n;

    public S(int[] iArr, Object[] objArr, int i5, int i10, AbstractC1404v abstractC1404v, boolean z2, int[] iArr2, int i11, int i12, U u10, G g9, k0 k0Var, C1397n c1397n, N n10) {
        this.f18157a = iArr;
        this.f18158b = objArr;
        this.f18159c = i5;
        this.f18160d = i10;
        this.f18162f = abstractC1404v instanceof AbstractC1404v;
        this.f18163g = z2;
        this.f18164h = iArr2;
        this.f18165i = i11;
        this.f18166j = i12;
        this.k = u10;
        this.f18167l = g9;
        this.f18168m = k0Var;
        this.f18161e = abstractC1404v;
        this.f18169n = n10;
    }

    public static long A(long j8, Object obj) {
        return ((Long) s0.f18264d.i(j8, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Field ", str, " for ");
            sbW.append(cls.getName());
            sbW.append(" not found. Known fields are ");
            sbW.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbW.toString());
        }
    }

    public static int J(int i5) {
        return (i5 & 267386880) >>> 20;
    }

    public static void N(int i5, Object obj, J j8) throws C1392i {
        if (!(obj instanceof String)) {
            j8.a(i5, (C1390g) obj);
        } else {
            ((C1393j) j8.f18144a).P(i5, (String) obj);
        }
    }

    public static List r(AbstractC1382a abstractC1382a, long j8) {
        return (List) s0.f18264d.i(j8, abstractC1382a);
    }

    public static S w(C1383a0 c1383a0, U u10, G g9, k0 k0Var, C1397n c1397n, N n10) {
        if (c1383a0 instanceof C1383a0) {
            return x(c1383a0, u10, g9, k0Var, c1397n, n10);
        }
        c1383a0.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.S x(androidx.datastore.preferences.protobuf.C1383a0 r36, androidx.datastore.preferences.protobuf.U r37, androidx.datastore.preferences.protobuf.G r38, androidx.datastore.preferences.protobuf.k0 r39, androidx.datastore.preferences.protobuf.C1397n r40, androidx.datastore.preferences.protobuf.N r41) {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.x(androidx.datastore.preferences.protobuf.a0, androidx.datastore.preferences.protobuf.U, androidx.datastore.preferences.protobuf.G, androidx.datastore.preferences.protobuf.k0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.N):androidx.datastore.preferences.protobuf.S");
    }

    public static long y(int i5) {
        return i5 & 1048575;
    }

    public static int z(long j8, Object obj) {
        return ((Integer) s0.f18264d.i(j8, obj)).intValue();
    }

    public final int B(int i5) {
        if (i5 >= this.f18159c && i5 <= this.f18160d) {
            int[] iArr = this.f18157a;
            int length = (iArr.length / 3) - 1;
            int i10 = 0;
            while (i10 <= length) {
                int i11 = (length + i10) >>> 1;
                int i12 = i11 * 3;
                int i13 = iArr[i12];
                if (i5 == i13) {
                    return i12;
                }
                if (i5 < i13) {
                    length = i11 - 1;
                } else {
                    i10 = i11 + 1;
                }
            }
        }
        return -1;
    }

    public final void C(Object obj, long j8, G4.f fVar, InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) throws C1408z {
        int iZ;
        List listC = this.f18167l.c(j8, obj);
        int i5 = fVar.f4233a;
        if ((i5 & 7) != 3) {
            throw A.b();
        }
        do {
            listC.add(fVar.w(interfaceC1385b0, c1396m));
            C1391h c1391h = (C1391h) fVar.f4236d;
            if (c1391h.c() || fVar.f4235c != 0) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == i5);
        fVar.f4235c = iZ;
    }

    public final void D(Object obj, int i5, G4.f fVar, InterfaceC1385b0 interfaceC1385b0, C1396m c1396m) throws C1408z {
        int iZ;
        List listC = this.f18167l.c(i5 & 1048575, obj);
        int i10 = fVar.f4233a;
        if ((i10 & 7) != 2) {
            throw A.b();
        }
        do {
            listC.add(fVar.C(interfaceC1385b0, c1396m));
            C1391h c1391h = (C1391h) fVar.f4236d;
            if (c1391h.c() || fVar.f4235c != 0) {
                return;
            } else {
                iZ = c1391h.z();
            }
        } while (iZ == i10);
        fVar.f4235c = iZ;
    }

    public final void E(Object obj, int i5, G4.f fVar) {
        if ((536870912 & i5) != 0) {
            s0.o(obj, i5 & 1048575, fVar.O());
        } else if (this.f18162f) {
            s0.o(obj, i5 & 1048575, fVar.M());
        } else {
            s0.o(obj, i5 & 1048575, fVar.j());
        }
    }

    public final void F(Object obj, int i5, G4.f fVar) throws C1408z {
        boolean z2 = (536870912 & i5) != 0;
        G g9 = this.f18167l;
        if (z2) {
            fVar.N(g9.c(i5 & 1048575, obj), true);
        } else {
            fVar.N(g9.c(i5 & 1048575, obj), false);
        }
    }

    public final void H(int i5, Object obj) {
        if (this.f18163g) {
            return;
        }
        int i10 = this.f18157a[i5 + 2];
        long j8 = i10 & 1048575;
        s0.m(j8, obj, s0.f18264d.g(j8, obj) | (1 << (i10 >>> 20)));
    }

    public final void I(int i5, int i10, Object obj) {
        s0.m(this.f18157a[i10 + 2] & 1048575, obj, i5);
    }

    public final int K(int i5) {
        return this.f18157a[i5 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void L(Object obj, J j8) throws C1392i {
        int i5;
        int i10;
        boolean z2;
        int[] iArr = this.f18157a;
        int length = iArr.length;
        Unsafe unsafe = f18156p;
        int i11 = -1;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int iK = K(i13);
            int i14 = iArr[i13];
            int iJ = J(iK);
            if (this.f18163g || iJ > 17) {
                i5 = 1048575;
                i10 = 0;
            } else {
                int i15 = iArr[i13 + 2];
                i5 = 1048575;
                int i16 = i15 & 1048575;
                if (i16 != i11) {
                    i12 = unsafe.getInt(obj, i16);
                    i11 = i16;
                }
                i10 = 1 << (i15 >>> 20);
            }
            long j10 = iK & i5;
            switch (iJ) {
                case 0:
                    if ((i10 & i12) != 0) {
                        double dE = s0.f18264d.e(j10, obj);
                        C1393j c1393j = (C1393j) j8.f18144a;
                        c1393j.getClass();
                        c1393j.K(i14, Double.doubleToRawLongBits(dE));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i12) != 0) {
                        float f10 = s0.f18264d.f(j10, obj);
                        C1393j c1393j2 = (C1393j) j8.f18144a;
                        c1393j2.getClass();
                        c1393j2.I(i14, Float.floatToRawIntBits(f10));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).U(i14, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).U(i14, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).M(i14, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).K(i14, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).I(i14, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).F(i14, s0.f18264d.c(j10, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i10 & i12) != 0) {
                        N(i14, unsafe.getObject(obj, j10), j8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).O(i14, (AbstractC1382a) unsafe.getObject(obj, j10), m(i13));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i10 & i12) != 0) {
                        j8.a(i14, (C1390g) unsafe.getObject(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).S(i14, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).M(i14, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).I(i14, unsafe.getInt(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i12) != 0) {
                        ((C1393j) j8.f18144a).K(i14, unsafe.getLong(obj, j10));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i10 & i12) != 0) {
                        int i17 = unsafe.getInt(obj, j10);
                        ((C1393j) j8.f18144a).S(i14, (i17 >> 31) ^ (i17 << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i10 & i12) != 0) {
                        long j11 = unsafe.getLong(obj, j10);
                        ((C1393j) j8.f18144a).U(i14, (j11 << 1) ^ (j11 >> 63));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i10 & i12) != 0) {
                        j8.b(i14, unsafe.getObject(obj, j10), m(i13));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c0.B(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 19:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 20:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 21:
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 22:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 23:
                    c0.E(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 24:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 25:
                    c0.z(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 26:
                    c0.O(iArr[i13], (List) unsafe.getObject(obj, j10), j8);
                    break;
                case 27:
                    c0.J(iArr[i13], (List) unsafe.getObject(obj, j10), j8, m(i13));
                    break;
                case 28:
                    c0.A(iArr[i13], (List) unsafe.getObject(obj, j10), j8);
                    break;
                case 29:
                    z2 = false;
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 30:
                    z2 = false;
                    c0.C(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 31:
                    z2 = false;
                    c0.K(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 32:
                    z2 = false;
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 33:
                    z2 = false;
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 34:
                    z2 = false;
                    c0.N(iArr[i13], (List) unsafe.getObject(obj, j10), j8, false);
                    break;
                case 35:
                    c0.B(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 36:
                    c0.F(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 37:
                    c0.I(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 38:
                    c0.Q(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 39:
                    c0.H(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 40:
                    c0.E(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 41:
                    c0.D(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 42:
                    c0.z(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 43:
                    c0.P(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 44:
                    c0.C(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 45:
                    c0.K(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 46:
                    c0.L(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 47:
                    c0.M(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 48:
                    c0.N(iArr[i13], (List) unsafe.getObject(obj, j10), j8, true);
                    break;
                case 49:
                    c0.G(iArr[i13], (List) unsafe.getObject(obj, j10), j8, m(i13));
                    break;
                case 50:
                    M(j8, i14, unsafe.getObject(obj, j10), i13);
                    break;
                case 51:
                    if (q(i14, i13, obj)) {
                        double dDoubleValue = ((Double) s0.f18264d.i(j10, obj)).doubleValue();
                        C1393j c1393j3 = (C1393j) j8.f18144a;
                        c1393j3.getClass();
                        c1393j3.K(i14, Double.doubleToRawLongBits(dDoubleValue));
                    }
                    break;
                case 52:
                    if (q(i14, i13, obj)) {
                        float fFloatValue = ((Float) s0.f18264d.i(j10, obj)).floatValue();
                        C1393j c1393j4 = (C1393j) j8.f18144a;
                        c1393j4.getClass();
                        c1393j4.I(i14, Float.floatToRawIntBits(fFloatValue));
                    }
                    break;
                case 53:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).U(i14, A(j10, obj));
                    }
                    break;
                case 54:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).U(i14, A(j10, obj));
                    }
                    break;
                case 55:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).M(i14, z(j10, obj));
                    }
                    break;
                case 56:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).K(i14, A(j10, obj));
                    }
                    break;
                case 57:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).I(i14, z(j10, obj));
                    }
                    break;
                case 58:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).F(i14, ((Boolean) s0.f18264d.i(j10, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (q(i14, i13, obj)) {
                        N(i14, unsafe.getObject(obj, j10), j8);
                    }
                    break;
                case 60:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).O(i14, (AbstractC1382a) unsafe.getObject(obj, j10), m(i13));
                    }
                    break;
                case 61:
                    if (q(i14, i13, obj)) {
                        j8.a(i14, (C1390g) unsafe.getObject(obj, j10));
                    }
                    break;
                case 62:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).S(i14, z(j10, obj));
                    }
                    break;
                case 63:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).M(i14, z(j10, obj));
                    }
                    break;
                case 64:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).I(i14, z(j10, obj));
                    }
                    break;
                case 65:
                    if (q(i14, i13, obj)) {
                        ((C1393j) j8.f18144a).K(i14, A(j10, obj));
                    }
                    break;
                case 66:
                    if (q(i14, i13, obj)) {
                        int iZ = z(j10, obj);
                        ((C1393j) j8.f18144a).S(i14, (iZ >> 31) ^ (iZ << 1));
                    }
                    break;
                case 67:
                    if (q(i14, i13, obj)) {
                        long jA = A(j10, obj);
                        ((C1393j) j8.f18144a).U(i14, (jA << 1) ^ (jA >> 63));
                    }
                    break;
                case 68:
                    if (q(i14, i13, obj)) {
                        j8.b(i14, unsafe.getObject(obj, j10), m(i13));
                    }
                    break;
            }
        }
        this.f18168m.getClass();
        ((AbstractC1404v) obj).unknownFields.d(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(androidx.datastore.preferences.protobuf.J r23, int r24, java.lang.Object r25, int r26) throws androidx.datastore.preferences.protobuf.C1392i {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.M(androidx.datastore.preferences.protobuf.J, int, java.lang.Object, int):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void a(Object obj) {
        int[] iArr;
        int i5;
        int i10 = this.f18165i;
        while (true) {
            iArr = this.f18164h;
            i5 = this.f18166j;
            if (i10 >= i5) {
                break;
            }
            long jK = K(iArr[i10]) & 1048575;
            Object objI = s0.f18264d.i(jK, obj);
            if (objI != null) {
                this.f18169n.getClass();
                ((M) objI).f18150a = false;
                s0.o(obj, jK, objI);
            }
            i10++;
        }
        int length = iArr.length;
        while (i5 < length) {
            this.f18167l.a(iArr[i5], obj);
            i5++;
        }
        this.f18168m.getClass();
        ((AbstractC1404v) obj).unknownFields.f18239e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.b(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void c(Object obj, J j8) throws C1392i {
        j8.getClass();
        if (!this.f18163g) {
            L(obj, j8);
            return;
        }
        int[] iArr = this.f18157a;
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int iK = K(i5);
            int i10 = iArr[i5];
            int iJ = J(iK);
            C1393j c1393j = (C1393j) j8.f18144a;
            switch (iJ) {
                case 0:
                    if (p(i5, obj)) {
                        double dE = s0.f18264d.e(iK & 1048575, obj);
                        c1393j.getClass();
                        c1393j.K(i10, Double.doubleToRawLongBits(dE));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p(i5, obj)) {
                        float f10 = s0.f18264d.f(iK & 1048575, obj);
                        c1393j.getClass();
                        c1393j.I(i10, Float.floatToRawIntBits(f10));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (p(i5, obj)) {
                        c1393j.U(i10, s0.f18264d.h(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (p(i5, obj)) {
                        c1393j.U(i10, s0.f18264d.h(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (p(i5, obj)) {
                        c1393j.M(i10, s0.f18264d.g(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (p(i5, obj)) {
                        c1393j.K(i10, s0.f18264d.h(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (p(i5, obj)) {
                        c1393j.I(i10, s0.f18264d.g(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (p(i5, obj)) {
                        c1393j.F(i10, s0.f18264d.c(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (p(i5, obj)) {
                        N(i10, s0.f18264d.i(iK & 1048575, obj), j8);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (p(i5, obj)) {
                        c1393j.O(i10, (AbstractC1382a) s0.f18264d.i(iK & 1048575, obj), m(i5));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p(i5, obj)) {
                        j8.a(i10, (C1390g) s0.f18264d.i(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (p(i5, obj)) {
                        c1393j.S(i10, s0.f18264d.g(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (p(i5, obj)) {
                        c1393j.M(i10, s0.f18264d.g(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (p(i5, obj)) {
                        c1393j.I(i10, s0.f18264d.g(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (p(i5, obj)) {
                        c1393j.K(i10, s0.f18264d.h(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (p(i5, obj)) {
                        int iG = s0.f18264d.g(iK & 1048575, obj);
                        c1393j.S(i10, (iG >> 31) ^ (iG << 1));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (p(i5, obj)) {
                        long jH = s0.f18264d.h(iK & 1048575, obj);
                        c1393j.U(i10, (jH >> 63) ^ (jH << 1));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (p(i5, obj)) {
                        j8.b(i10, s0.f18264d.i(iK & 1048575, obj), m(i5));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c0.B(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 19:
                    c0.F(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 20:
                    c0.I(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 21:
                    c0.Q(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 22:
                    c0.H(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 23:
                    c0.E(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 24:
                    c0.D(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 25:
                    c0.z(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 26:
                    c0.O(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8);
                    break;
                case 27:
                    c0.J(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, m(i5));
                    break;
                case 28:
                    c0.A(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8);
                    break;
                case 29:
                    c0.P(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 30:
                    c0.C(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 31:
                    c0.K(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 32:
                    c0.L(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 33:
                    c0.M(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 34:
                    c0.N(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, false);
                    break;
                case 35:
                    c0.B(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 36:
                    c0.F(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 37:
                    c0.I(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 38:
                    c0.Q(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 39:
                    c0.H(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 40:
                    c0.E(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 41:
                    c0.D(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 42:
                    c0.z(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 43:
                    c0.P(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 44:
                    c0.C(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 45:
                    c0.K(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 46:
                    c0.L(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 47:
                    c0.M(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 48:
                    c0.N(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, true);
                    break;
                case 49:
                    c0.G(iArr[i5], (List) s0.f18264d.i(iK & 1048575, obj), j8, m(i5));
                    break;
                case 50:
                    M(j8, i10, s0.f18264d.i(iK & 1048575, obj), i5);
                    break;
                case 51:
                    if (q(i10, i5, obj)) {
                        double dDoubleValue = ((Double) s0.f18264d.i(iK & 1048575, obj)).doubleValue();
                        c1393j.getClass();
                        c1393j.K(i10, Double.doubleToRawLongBits(dDoubleValue));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i10, i5, obj)) {
                        float fFloatValue = ((Float) s0.f18264d.i(iK & 1048575, obj)).floatValue();
                        c1393j.getClass();
                        c1393j.I(i10, Float.floatToRawIntBits(fFloatValue));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i10, i5, obj)) {
                        c1393j.U(i10, A(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i10, i5, obj)) {
                        c1393j.U(i10, A(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i10, i5, obj)) {
                        c1393j.M(i10, z(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i10, i5, obj)) {
                        c1393j.K(i10, A(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i10, i5, obj)) {
                        c1393j.I(i10, z(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i10, i5, obj)) {
                        c1393j.F(i10, ((Boolean) s0.f18264d.i(iK & 1048575, obj)).booleanValue());
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i10, i5, obj)) {
                        N(i10, s0.f18264d.i(iK & 1048575, obj), j8);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i10, i5, obj)) {
                        c1393j.O(i10, (AbstractC1382a) s0.f18264d.i(iK & 1048575, obj), m(i5));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i10, i5, obj)) {
                        j8.a(i10, (C1390g) s0.f18264d.i(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i10, i5, obj)) {
                        c1393j.S(i10, z(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i10, i5, obj)) {
                        c1393j.M(i10, z(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i10, i5, obj)) {
                        c1393j.I(i10, z(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i10, i5, obj)) {
                        c1393j.K(i10, A(iK & 1048575, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i10, i5, obj)) {
                        int iZ = z(iK & 1048575, obj);
                        c1393j.S(i10, (iZ >> 31) ^ (iZ << 1));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i10, i5, obj)) {
                        long jA = A(iK & 1048575, obj);
                        c1393j.U(i10, (jA >> 63) ^ (jA << 1));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i10, i5, obj)) {
                        j8.b(i10, s0.f18264d.i(iK & 1048575, obj), m(i5));
                        break;
                    } else {
                        break;
                    }
            }
        }
        this.f18168m.getClass();
        ((AbstractC1404v) obj).unknownFields.d(j8);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final int d(AbstractC1382a abstractC1382a) {
        return this.f18163g ? o(abstractC1382a) : n(abstractC1382a);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final void e(Object obj, G4.f fVar, C1396m c1396m) throws Throwable {
        c1396m.getClass();
        s(this.f18168m, obj, fVar, c1396m);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(androidx.datastore.preferences.protobuf.AbstractC1404v r11, androidx.datastore.preferences.protobuf.AbstractC1404v r12) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.f(androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[PHI: r3
  0x00e1: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x0216, B:41:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(androidx.datastore.preferences.protobuf.AbstractC1404v r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.g(androidx.datastore.preferences.protobuf.v):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(androidx.datastore.preferences.protobuf.AbstractC1404v r12, androidx.datastore.preferences.protobuf.AbstractC1404v r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.h(androidx.datastore.preferences.protobuf.v, androidx.datastore.preferences.protobuf.v):boolean");
    }

    public final boolean i(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2, int i5) {
        return p(i5, abstractC1404v) == p(i5, abstractC1404v2);
    }

    public final void j(int i5, Object obj, Object obj2) {
        int i10 = this.f18157a[i5];
        if (s0.f18264d.i(K(i5) & 1048575, obj) == null) {
            return;
        }
        k(i5);
    }

    public final void k(int i5) {
        if (this.f18158b[((i5 / 3) * 2) + 1] != null) {
            throw new ClassCastException();
        }
    }

    public final Object l(int i5) {
        return this.f18158b[(i5 / 3) * 2];
    }

    public final InterfaceC1385b0 m(int i5) {
        int i10 = (i5 / 3) * 2;
        Object[] objArr = this.f18158b;
        InterfaceC1385b0 interfaceC1385b0 = (InterfaceC1385b0) objArr[i10];
        if (interfaceC1385b0 != null) {
            return interfaceC1385b0;
        }
        InterfaceC1385b0 interfaceC1385b0A = Y.f18175c.a((Class) objArr[i10 + 1]);
        objArr[i10] = interfaceC1385b0A;
        return interfaceC1385b0A;
    }

    public final int n(AbstractC1382a abstractC1382a) {
        int i5;
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iV;
        Unsafe unsafe = f18156p;
        int i10 = -1;
        int i11 = 0;
        int iH = 0;
        int i12 = 0;
        while (true) {
            int[] iArr = this.f18157a;
            if (i11 >= iArr.length) {
                this.f18168m.getClass();
                return ((AbstractC1404v) abstractC1382a).unknownFields.a() + iH;
            }
            int iK = K(i11);
            int i13 = iArr[i11];
            int iJ = J(iK);
            if (iJ <= 17) {
                int i14 = iArr[i11 + 2];
                int i15 = i14 & 1048575;
                i5 = 1 << (i14 >>> 20);
                if (i15 != i10) {
                    i12 = unsafe.getInt(abstractC1382a, i15);
                    i10 = i15;
                }
            } else {
                i5 = 0;
            }
            long j8 = iK & 1048575;
            switch (iJ) {
                case 0:
                    if ((i5 & i12) != 0) {
                        iH = M6.h(i13, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i12 & i5) != 0) {
                        iH = M6.h(i13, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i12 & i5) != 0) {
                        long j10 = unsafe.getLong(abstractC1382a, j8);
                        iY = C1393j.y(i13);
                        iA = C1393j.A(j10);
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i12 & i5) != 0) {
                        long j11 = unsafe.getLong(abstractC1382a, j8);
                        iY = C1393j.y(i13);
                        iA = C1393j.A(j11);
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i12 & i5) != 0) {
                        int i16 = unsafe.getInt(abstractC1382a, j8);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.w(i16);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i12 & i5) != 0) {
                        iU = C1393j.u(i13);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i12 & i5) != 0) {
                        iU = C1393j.t(i13);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i12 & i5) != 0) {
                        iH = M6.h(i13, 1, iH);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i12 & i5) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(abstractC1382a, j8);
                        if (object instanceof C1390g) {
                            iR = C1393j.r(i13, (C1390g) object);
                            iH = iR + iH;
                            break;
                        } else {
                            iY3 = C1393j.y(i13);
                            iX = C1393j.x((String) object);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                case 9:
                    if ((i12 & i5) != 0) {
                        Object object2 = unsafe.getObject(abstractC1382a, j8);
                        InterfaceC1385b0 interfaceC1385b0M = m(i11);
                        Class cls = c0.f18188a;
                        int iY5 = C1393j.y(i13);
                        int iB = ((AbstractC1382a) object2).b(interfaceC1385b0M);
                        iH = M6.i(iB, iB, iY5, iH);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i12 & i5) != 0) {
                        iU = C1393j.r(i13, (C1390g) unsafe.getObject(abstractC1382a, j8));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i12 & i5) != 0) {
                        int i17 = unsafe.getInt(abstractC1382a, j8);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.z(i17);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i12 & i5) != 0) {
                        int i18 = unsafe.getInt(abstractC1382a, j8);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.w(i18);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i12 & i5) != 0) {
                        iH = M6.h(i13, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i5 & i12) != 0) {
                        iH = M6.h(i13, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i12 & i5) != 0) {
                        int i19 = unsafe.getInt(abstractC1382a, j8);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.z((i19 >> 31) ^ (i19 << 1));
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i12 & i5) != 0) {
                        long j12 = unsafe.getLong(abstractC1382a, j8);
                        iY = C1393j.y(i13);
                        iA = C1393j.A((j12 >> 63) ^ (j12 << 1));
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i12 & i5) != 0) {
                        iU = C1393j.v(i13, (AbstractC1382a) unsafe.getObject(abstractC1382a, j8), m(i11));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iU = c0.f(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 19:
                    iU = c0.d(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 20:
                    iU = c0.j(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 21:
                    iU = c0.t(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 22:
                    iU = c0.h(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 23:
                    iU = c0.f(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 24:
                    iU = c0.d(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(abstractC1382a, j8);
                    Class cls2 = c0.f18188a;
                    int size = list.size();
                    iY4 = size == 0 ? 0 : (C1393j.y(i13) + 1) * size;
                    iH += iY4;
                    break;
                case 26:
                    iU = c0.q(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 27:
                    iU = c0.l(i13, (List) unsafe.getObject(abstractC1382a, j8), m(i11));
                    iH += iU;
                    break;
                case 28:
                    iU = c0.a(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 29:
                    iU = c0.r(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 30:
                    iU = c0.b(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 31:
                    iU = c0.d(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 32:
                    iU = c0.f(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 33:
                    iU = c0.m(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 34:
                    iU = c0.o(i13, (List) unsafe.getObject(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 35:
                    int iG = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG > 0) {
                        iH = M6.i(iG, C1393j.y(i13), iG, iH);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE > 0) {
                        iH = M6.i(iE, C1393j.y(i13), iE, iH);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK2 = c0.k((List) unsafe.getObject(abstractC1382a, j8));
                    if (iK2 > 0) {
                        iH = M6.i(iK2, C1393j.y(i13), iK2, iH);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iU2 = c0.u((List) unsafe.getObject(abstractC1382a, j8));
                    if (iU2 > 0) {
                        iH = M6.i(iU2, C1393j.y(i13), iU2, iH);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i20 = c0.i((List) unsafe.getObject(abstractC1382a, j8));
                    if (i20 > 0) {
                        iH = M6.i(i20, C1393j.y(i13), i20, iH);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG2 = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG2 > 0) {
                        iH = M6.i(iG2, C1393j.y(i13), iG2, iH);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE2 > 0) {
                        iH = M6.i(iE2, C1393j.y(i13), iE2, iH);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(abstractC1382a, j8);
                    Class cls3 = c0.f18188a;
                    int size2 = list2.size();
                    if (size2 > 0) {
                        iH = M6.i(size2, C1393j.y(i13), size2, iH);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iS = c0.s((List) unsafe.getObject(abstractC1382a, j8));
                    if (iS > 0) {
                        iH = M6.i(iS, C1393j.y(i13), iS, iH);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = c0.c((List) unsafe.getObject(abstractC1382a, j8));
                    if (iC > 0) {
                        iH = M6.i(iC, C1393j.y(i13), iC, iH);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE3 > 0) {
                        iH = M6.i(iE3, C1393j.y(i13), iE3, iH);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG3 = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG3 > 0) {
                        iH = M6.i(iG3, C1393j.y(i13), iG3, iH);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iN = c0.n((List) unsafe.getObject(abstractC1382a, j8));
                    if (iN > 0) {
                        iH = M6.i(iN, C1393j.y(i13), iN, iH);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iP = c0.p((List) unsafe.getObject(abstractC1382a, j8));
                    if (iP > 0) {
                        iH = M6.i(iP, C1393j.y(i13), iP, iH);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(abstractC1382a, j8);
                    InterfaceC1385b0 interfaceC1385b0M2 = m(i11);
                    Class cls4 = c0.f18188a;
                    int size3 = list3.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i21 = 0; i21 < size3; i21++) {
                            iV += C1393j.v(i13, (AbstractC1382a) list3.get(i21), interfaceC1385b0M2);
                        }
                    }
                    iH += iV;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1382a, j8);
                    Object objL = l(i11);
                    this.f18169n.getClass();
                    iU = N.a(i13, object3, objL);
                    iH += iU;
                    break;
                case 51:
                    if (q(i13, i11, abstractC1382a)) {
                        iH = M6.h(i13, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i13, i11, abstractC1382a)) {
                        iH = M6.h(i13, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i13, i11, abstractC1382a)) {
                        long jA = A(j8, abstractC1382a);
                        iY = C1393j.y(i13);
                        iA = C1393j.A(jA);
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i13, i11, abstractC1382a)) {
                        long jA2 = A(j8, abstractC1382a);
                        iY = C1393j.y(i13);
                        iA = C1393j.A(jA2);
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i13, i11, abstractC1382a)) {
                        int iZ = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.w(iZ);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i13, i11, abstractC1382a)) {
                        iU = C1393j.u(i13);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i13, i11, abstractC1382a)) {
                        iU = C1393j.t(i13);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i13, i11, abstractC1382a)) {
                        iH = M6.h(i13, 1, iH);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!q(i13, i11, abstractC1382a)) {
                        break;
                    } else {
                        Object object4 = unsafe.getObject(abstractC1382a, j8);
                        if (object4 instanceof C1390g) {
                            iR = C1393j.r(i13, (C1390g) object4);
                            iH = iR + iH;
                            break;
                        } else {
                            iY3 = C1393j.y(i13);
                            iX = C1393j.x((String) object4);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                case 60:
                    if (q(i13, i11, abstractC1382a)) {
                        Object object5 = unsafe.getObject(abstractC1382a, j8);
                        InterfaceC1385b0 interfaceC1385b0M3 = m(i11);
                        Class cls5 = c0.f18188a;
                        int iY6 = C1393j.y(i13);
                        int iB2 = ((AbstractC1382a) object5).b(interfaceC1385b0M3);
                        iH = M6.i(iB2, iB2, iY6, iH);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i13, i11, abstractC1382a)) {
                        iU = C1393j.r(i13, (C1390g) unsafe.getObject(abstractC1382a, j8));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i13, i11, abstractC1382a)) {
                        int iZ2 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.z(iZ2);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i13, i11, abstractC1382a)) {
                        int iZ3 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.w(iZ3);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i13, i11, abstractC1382a)) {
                        iH = M6.h(i13, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i13, i11, abstractC1382a)) {
                        iH = M6.h(i13, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i13, i11, abstractC1382a)) {
                        int iZ4 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i13);
                        iW = C1393j.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i13, i11, abstractC1382a)) {
                        long jA3 = A(j8, abstractC1382a);
                        iY = C1393j.y(i13);
                        iA = C1393j.A((jA3 >> 63) ^ (jA3 << 1));
                        iY4 = iA + iY;
                        iH += iY4;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i13, i11, abstractC1382a)) {
                        iU = C1393j.v(i13, (AbstractC1382a) unsafe.getObject(abstractC1382a, j8), m(i11));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
            }
            i11 += 3;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1385b0
    public final Object newInstance() {
        this.k.getClass();
        return this.f18161e.d(4);
    }

    public final int o(AbstractC1382a abstractC1382a) {
        int iY;
        int iA;
        int iY2;
        int iW;
        int iU;
        int iY3;
        int iX;
        int iR;
        int iY4;
        int iA2;
        int iV;
        Unsafe unsafe = f18156p;
        int i5 = 0;
        int iH = 0;
        while (true) {
            int[] iArr = this.f18157a;
            if (i5 >= iArr.length) {
                this.f18168m.getClass();
                return ((AbstractC1404v) abstractC1382a).unknownFields.a() + iH;
            }
            int iK = K(i5);
            int iJ = J(iK);
            int i10 = iArr[i5];
            long j8 = iK & 1048575;
            if (iJ >= EnumC1400q.f18252b.f18257a && iJ <= EnumC1400q.f18253c.f18257a) {
                int i11 = iArr[i5 + 2];
            }
            switch (iJ) {
                case 0:
                    if (p(i5, abstractC1382a)) {
                        iH = M6.h(i10, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (p(i5, abstractC1382a)) {
                        iH = M6.h(i10, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (p(i5, abstractC1382a)) {
                        long jH = s0.f18264d.h(j8, abstractC1382a);
                        iY = C1393j.y(i10);
                        iA = C1393j.A(jH);
                        iU = iA + iY;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (p(i5, abstractC1382a)) {
                        long jH2 = s0.f18264d.h(j8, abstractC1382a);
                        iY = C1393j.y(i10);
                        iA = C1393j.A(jH2);
                        iU = iA + iY;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (p(i5, abstractC1382a)) {
                        int iG = s0.f18264d.g(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.w(iG);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (p(i5, abstractC1382a)) {
                        iU = C1393j.u(i10);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (p(i5, abstractC1382a)) {
                        iU = C1393j.t(i10);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (p(i5, abstractC1382a)) {
                        iH = M6.h(i10, 1, iH);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!p(i5, abstractC1382a)) {
                        break;
                    } else {
                        Object objI = s0.f18264d.i(j8, abstractC1382a);
                        if (objI instanceof C1390g) {
                            iR = C1393j.r(i10, (C1390g) objI);
                            iH = iR + iH;
                            break;
                        } else {
                            iY3 = C1393j.y(i10);
                            iX = C1393j.x((String) objI);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                case 9:
                    if (p(i5, abstractC1382a)) {
                        Object objI2 = s0.f18264d.i(j8, abstractC1382a);
                        InterfaceC1385b0 interfaceC1385b0M = m(i5);
                        Class cls = c0.f18188a;
                        int iY5 = C1393j.y(i10);
                        int iB = ((AbstractC1382a) objI2).b(interfaceC1385b0M);
                        iH = M6.i(iB, iB, iY5, iH);
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (p(i5, abstractC1382a)) {
                        iU = C1393j.r(i10, (C1390g) s0.f18264d.i(j8, abstractC1382a));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (p(i5, abstractC1382a)) {
                        int iG2 = s0.f18264d.g(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.z(iG2);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (p(i5, abstractC1382a)) {
                        int iG3 = s0.f18264d.g(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.w(iG3);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (p(i5, abstractC1382a)) {
                        iH = M6.h(i10, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (p(i5, abstractC1382a)) {
                        iH = M6.h(i10, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (p(i5, abstractC1382a)) {
                        int iG4 = s0.f18264d.g(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.z((iG4 >> 31) ^ (iG4 << 1));
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (p(i5, abstractC1382a)) {
                        long jH3 = s0.f18264d.h(j8, abstractC1382a);
                        iY4 = C1393j.y(i10);
                        iA2 = C1393j.A((jH3 >> 63) ^ (jH3 << 1));
                        iU = iA2 + iY4;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (p(i5, abstractC1382a)) {
                        iU = C1393j.v(i10, (AbstractC1382a) s0.f18264d.i(j8, abstractC1382a), m(i5));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    iU = c0.f(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 19:
                    iU = c0.d(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 20:
                    iU = c0.j(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 21:
                    iU = c0.t(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 22:
                    iU = c0.h(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 23:
                    iU = c0.f(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 24:
                    iU = c0.d(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 25:
                    List listR = r(abstractC1382a, j8);
                    Class cls2 = c0.f18188a;
                    int size = listR.size();
                    iH += size == 0 ? 0 : (C1393j.y(i10) + 1) * size;
                    break;
                case 26:
                    iU = c0.q(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 27:
                    iU = c0.l(i10, r(abstractC1382a, j8), m(i5));
                    iH += iU;
                    break;
                case 28:
                    iU = c0.a(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 29:
                    iU = c0.r(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 30:
                    iU = c0.b(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 31:
                    iU = c0.d(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 32:
                    iU = c0.f(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 33:
                    iU = c0.m(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 34:
                    iU = c0.o(i10, r(abstractC1382a, j8));
                    iH += iU;
                    break;
                case 35:
                    int iG5 = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG5 > 0) {
                        iH = M6.i(iG5, C1393j.y(i10), iG5, iH);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int iE = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE > 0) {
                        iH = M6.i(iE, C1393j.y(i10), iE, iH);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int iK2 = c0.k((List) unsafe.getObject(abstractC1382a, j8));
                    if (iK2 > 0) {
                        iH = M6.i(iK2, C1393j.y(i10), iK2, iH);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int iU2 = c0.u((List) unsafe.getObject(abstractC1382a, j8));
                    if (iU2 > 0) {
                        iH = M6.i(iU2, C1393j.y(i10), iU2, iH);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i12 = c0.i((List) unsafe.getObject(abstractC1382a, j8));
                    if (i12 > 0) {
                        iH = M6.i(i12, C1393j.y(i10), i12, iH);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int iG6 = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG6 > 0) {
                        iH = M6.i(iG6, C1393j.y(i10), iG6, iH);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int iE2 = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE2 > 0) {
                        iH = M6.i(iE2, C1393j.y(i10), iE2, iH);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(abstractC1382a, j8);
                    Class cls3 = c0.f18188a;
                    int size2 = list.size();
                    if (size2 > 0) {
                        iH = M6.i(size2, C1393j.y(i10), size2, iH);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int iS = c0.s((List) unsafe.getObject(abstractC1382a, j8));
                    if (iS > 0) {
                        iH = M6.i(iS, C1393j.y(i10), iS, iH);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int iC = c0.c((List) unsafe.getObject(abstractC1382a, j8));
                    if (iC > 0) {
                        iH = M6.i(iC, C1393j.y(i10), iC, iH);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int iE3 = c0.e((List) unsafe.getObject(abstractC1382a, j8));
                    if (iE3 > 0) {
                        iH = M6.i(iE3, C1393j.y(i10), iE3, iH);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int iG7 = c0.g((List) unsafe.getObject(abstractC1382a, j8));
                    if (iG7 > 0) {
                        iH = M6.i(iG7, C1393j.y(i10), iG7, iH);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int iN = c0.n((List) unsafe.getObject(abstractC1382a, j8));
                    if (iN > 0) {
                        iH = M6.i(iN, C1393j.y(i10), iN, iH);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int iP = c0.p((List) unsafe.getObject(abstractC1382a, j8));
                    if (iP > 0) {
                        iH = M6.i(iP, C1393j.y(i10), iP, iH);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List listR2 = r(abstractC1382a, j8);
                    InterfaceC1385b0 interfaceC1385b0M2 = m(i5);
                    Class cls4 = c0.f18188a;
                    int size3 = listR2.size();
                    if (size3 == 0) {
                        iV = 0;
                    } else {
                        iV = 0;
                        for (int i13 = 0; i13 < size3; i13++) {
                            iV += C1393j.v(i10, (AbstractC1382a) listR2.get(i13), interfaceC1385b0M2);
                        }
                    }
                    iH += iV;
                    break;
                case 50:
                    Object objI3 = s0.f18264d.i(j8, abstractC1382a);
                    Object objL = l(i5);
                    this.f18169n.getClass();
                    iU = N.a(i10, objI3, objL);
                    iH += iU;
                    break;
                case 51:
                    if (q(i10, i5, abstractC1382a)) {
                        iH = M6.h(i10, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i10, i5, abstractC1382a)) {
                        iH = M6.h(i10, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i10, i5, abstractC1382a)) {
                        long jA = A(j8, abstractC1382a);
                        iY = C1393j.y(i10);
                        iA = C1393j.A(jA);
                        iU = iA + iY;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i10, i5, abstractC1382a)) {
                        long jA2 = A(j8, abstractC1382a);
                        iY = C1393j.y(i10);
                        iA = C1393j.A(jA2);
                        iU = iA + iY;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (q(i10, i5, abstractC1382a)) {
                        int iZ = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.w(iZ);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i10, i5, abstractC1382a)) {
                        iU = C1393j.u(i10);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (q(i10, i5, abstractC1382a)) {
                        iU = C1393j.t(i10);
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i10, i5, abstractC1382a)) {
                        iH = M6.h(i10, 1, iH);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!q(i10, i5, abstractC1382a)) {
                        break;
                    } else {
                        Object objI4 = s0.f18264d.i(j8, abstractC1382a);
                        if (objI4 instanceof C1390g) {
                            iR = C1393j.r(i10, (C1390g) objI4);
                            iH = iR + iH;
                            break;
                        } else {
                            iY3 = C1393j.y(i10);
                            iX = C1393j.x((String) objI4);
                            iR = iX + iY3;
                            iH = iR + iH;
                        }
                    }
                case 60:
                    if (q(i10, i5, abstractC1382a)) {
                        Object objI5 = s0.f18264d.i(j8, abstractC1382a);
                        InterfaceC1385b0 interfaceC1385b0M3 = m(i5);
                        Class cls5 = c0.f18188a;
                        int iY6 = C1393j.y(i10);
                        int iB2 = ((AbstractC1382a) objI5).b(interfaceC1385b0M3);
                        iH = M6.i(iB2, iB2, iY6, iH);
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i10, i5, abstractC1382a)) {
                        iU = C1393j.r(i10, (C1390g) s0.f18264d.i(j8, abstractC1382a));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i10, i5, abstractC1382a)) {
                        int iZ2 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.z(iZ2);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (q(i10, i5, abstractC1382a)) {
                        int iZ3 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.w(iZ3);
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i10, i5, abstractC1382a)) {
                        iH = M6.h(i10, 4, iH);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i10, i5, abstractC1382a)) {
                        iH = M6.h(i10, 8, iH);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i10, i5, abstractC1382a)) {
                        int iZ4 = z(j8, abstractC1382a);
                        iY2 = C1393j.y(i10);
                        iW = C1393j.z((iZ4 >> 31) ^ (iZ4 << 1));
                        iU = iW + iY2;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i10, i5, abstractC1382a)) {
                        long jA3 = A(j8, abstractC1382a);
                        iY4 = C1393j.y(i10);
                        iA2 = C1393j.A((jA3 >> 63) ^ (jA3 << 1));
                        iU = iA2 + iY4;
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (q(i10, i5, abstractC1382a)) {
                        iU = C1393j.v(i10, (AbstractC1382a) s0.f18264d.i(j8, abstractC1382a), m(i5));
                        iH += iU;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final boolean p(int i5, Object obj) {
        if (this.f18163g) {
            int iK = K(i5);
            long j8 = iK & 1048575;
            switch (J(iK)) {
                case 0:
                    if (s0.f18264d.e(j8, obj) == 0.0d) {
                        return false;
                    }
                    break;
                case 1:
                    if (s0.f18264d.f(j8, obj) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        return false;
                    }
                    break;
                case 2:
                    if (s0.f18264d.h(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (s0.f18264d.h(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (s0.f18264d.h(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return s0.f18264d.c(j8, obj);
                case 8:
                    Object objI = s0.f18264d.i(j8, obj);
                    if (objI instanceof String) {
                        return !((String) objI).isEmpty();
                    }
                    if (objI instanceof C1390g) {
                        return !C1390g.f18203c.equals(objI);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (s0.f18264d.i(j8, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    return !C1390g.f18203c.equals(s0.f18264d.i(j8, obj));
                case 11:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (s0.f18264d.h(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (s0.f18264d.g(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (s0.f18264d.h(j8, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (s0.f18264d.i(j8, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((s0.f18264d.g(r6 & 1048575, obj) & (1 << (this.f18157a[i5 + 2] >>> 20))) == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean q(int i5, int i10, Object obj) {
        return s0.f18264d.g((long) (this.f18157a[i10 + 2] & 1048575), obj) == i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        ((androidx.datastore.preferences.protobuf.AbstractC1404v) r2).unknownFields = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0609 A[Catch: all -> 0x04c5, TryCatch #1 {all -> 0x04c5, blocks: (B:160:0x0604, B:162:0x0609, B:164:0x0610, B:166:0x0617, B:125:0x045e, B:126:0x046a, B:127:0x0480, B:128:0x0496, B:129:0x04ac, B:132:0x04c8, B:133:0x04de, B:134:0x04f4, B:136:0x0500, B:137:0x051f, B:138:0x0533, B:139:0x0541, B:140:0x0559, B:141:0x056f, B:142:0x0585, B:143:0x059b, B:144:0x05b1, B:145:0x05c7, B:146:0x05de, B:152:0x05f5), top: B:182:0x0604 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x063a A[LOOP:3: B:174:0x0638->B:175:0x063a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x061d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(androidx.datastore.preferences.protobuf.k0 r17, java.lang.Object r18, G4.f r19, androidx.datastore.preferences.protobuf.C1396m r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.s(androidx.datastore.preferences.protobuf.k0, java.lang.Object, G4.f, androidx.datastore.preferences.protobuf.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C1396m r12, G4.f r13) throws androidx.datastore.preferences.protobuf.C1408z {
        /*
            r8 = this;
            int r10 = r8.K(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.r0 r10 = androidx.datastore.preferences.protobuf.s0.f18264d
            java.lang.Object r10 = r10.i(r0, r9)
            androidx.datastore.preferences.protobuf.N r2 = r8.f18169n
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.M r10 = androidx.datastore.preferences.protobuf.M.f18149b
            androidx.datastore.preferences.protobuf.M r10 = r10.c()
            androidx.datastore.preferences.protobuf.s0.o(r9, r0, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.M r3 = (androidx.datastore.preferences.protobuf.M) r3
            boolean r3 = r3.f18150a
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.M r3 = androidx.datastore.preferences.protobuf.M.f18149b
            androidx.datastore.preferences.protobuf.M r3 = r3.c()
            androidx.datastore.preferences.protobuf.N.b(r3, r10)
            androidx.datastore.preferences.protobuf.s0.o(r9, r0, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.M r10 = (androidx.datastore.preferences.protobuf.M) r10
            androidx.datastore.preferences.protobuf.L r11 = (androidx.datastore.preferences.protobuf.L) r11
            androidx.datastore.preferences.protobuf.K r9 = r11.f18148a
            r11 = 2
            r13.W(r11)
            java.lang.Object r0 = r13.f4236d
            androidx.datastore.preferences.protobuf.h r0 = (androidx.datastore.preferences.protobuf.C1391h) r0
            int r1 = r0.A()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            w1.i r3 = r9.f18147c
            r4 = r3
        L55:
            int r5 = r13.d()     // Catch: java.lang.Throwable -> L79
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L9b
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L79
            if (r6 == 0) goto L65
            goto L9b
        L65:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L86
            if (r5 == r11) goto L7b
            boolean r5 = r13.X()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            if (r5 == 0) goto L73
            goto L55
        L73:
            androidx.datastore.preferences.protobuf.A r5 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            throw r5     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
        L79:
            r9 = move-exception
            goto La2
        L7b:
            androidx.datastore.preferences.protobuf.y0 r5 = r9.f18146b     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            java.lang.Object r4 = r13.p(r5, r6, r12)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            goto L55
        L86:
            androidx.datastore.preferences.protobuf.w0 r5 = r9.f18145a     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            r6 = 0
            java.lang.Object r2 = r13.p(r5, r6, r6)     // Catch: java.lang.Throwable -> L79 androidx.datastore.preferences.protobuf.C1408z -> L8e
            goto L55
        L8e:
            boolean r5 = r13.X()     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L95
            goto L55
        L95:
            androidx.datastore.preferences.protobuf.A r9 = new androidx.datastore.preferences.protobuf.A     // Catch: java.lang.Throwable -> L79
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L79
            throw r9     // Catch: java.lang.Throwable -> L79
        L9b:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L79
            r0.d(r1)
            return
        La2:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.S.t(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.m, G4.f):void");
    }

    public final void u(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2, int i5) {
        long jK = K(i5) & 1048575;
        if (p(i5, abstractC1404v2)) {
            r0 r0Var = s0.f18264d;
            Object objI = r0Var.i(jK, abstractC1404v);
            Object objI2 = r0Var.i(jK, abstractC1404v2);
            if (objI != null && objI2 != null) {
                s0.o(abstractC1404v, jK, AbstractC1407y.c(objI, objI2));
                H(i5, abstractC1404v);
            } else if (objI2 != null) {
                s0.o(abstractC1404v, jK, objI2);
                H(i5, abstractC1404v);
            }
        }
    }

    public final void v(AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2, int i5) {
        int iK = K(i5);
        int i10 = this.f18157a[i5];
        long j8 = iK & 1048575;
        if (q(i10, i5, abstractC1404v2)) {
            r0 r0Var = s0.f18264d;
            Object objI = r0Var.i(j8, abstractC1404v);
            Object objI2 = r0Var.i(j8, abstractC1404v2);
            if (objI != null && objI2 != null) {
                s0.o(abstractC1404v, j8, AbstractC1407y.c(objI, objI2));
                I(i10, i5, abstractC1404v);
            } else if (objI2 != null) {
                s0.o(abstractC1404v, j8, objI2);
                I(i10, i5, abstractC1404v);
            }
        }
    }
}
