package com.google.v;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fl<T> implements ft<T> {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f12957a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f12958b = gk.g();

    /* renamed from: c, reason: collision with root package name */
    private final int[] f12959c;

    /* renamed from: d, reason: collision with root package name */
    private final Object[] f12960d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12961e;

    /* renamed from: f, reason: collision with root package name */
    private final int f12962f;

    /* renamed from: g, reason: collision with root package name */
    private final fi f12963g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f12964h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f12965i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f12966j;

    /* renamed from: k, reason: collision with root package name */
    private final int f12967k;

    /* renamed from: l, reason: collision with root package name */
    private final int f12968l;
    private final ge m;

    private fl(int[] iArr, Object[] objArr, int i2, int i3, fi fiVar, int[] iArr2, int i4, int i5, ge geVar, dc dcVar) {
        this.f12959c = iArr;
        this.f12960d = objArr;
        this.f12961e = i2;
        this.f12962f = i3;
        this.f12965i = fiVar instanceof du;
        boolean z = false;
        if (dcVar != null && (fiVar instanceof dq)) {
            z = true;
        }
        this.f12964h = z;
        this.f12966j = iArr2;
        this.f12967k = i4;
        this.f12968l = i5;
        this.m = geVar;
        this.f12963g = fiVar;
    }

    private final Object A(Object obj, int i2) {
        ft ftVarX = x(i2);
        long jU = u(t(i2));
        if (!N(obj, i2)) {
            return ftVarX.e();
        }
        Object object = f12958b.getObject(obj, jU);
        if (Q(object)) {
            return object;
        }
        Object objE = ftVarX.e();
        if (object != null) {
            ftVarX.g(objE, object);
        }
        return objE;
    }

    private final Object B(Object obj, int i2, int i3) {
        ft ftVarX = x(i3);
        if (!S(obj, i2, i3)) {
            return ftVarX.e();
        }
        Object object = f12958b.getObject(obj, u(t(i3)));
        if (Q(object)) {
            return object;
        }
        Object objE = ftVarX.e();
        if (object != null) {
            ftVarX.g(objE, object);
        }
        return objE;
    }

    private static Field C(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e2);
        }
    }

    private static void D(Object obj) {
        if (!Q(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    private final void E(Object obj, Object obj2, int i2) {
        if (N(obj2, i2)) {
            long jU = u(t(i2));
            Unsafe unsafe = f12958b;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i2) + " is present but null: " + obj2.toString());
            }
            ft ftVarX = x(i2);
            if (!N(obj, i2)) {
                if (Q(object)) {
                    Object objE = ftVarX.e();
                    ftVarX.g(objE, object);
                    unsafe.putObject(obj, jU, objE);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                H(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!Q(object2)) {
                Object objE2 = ftVarX.e();
                ftVarX.g(objE2, object2);
                unsafe.putObject(obj, jU, objE2);
                object2 = objE2;
            }
            ftVarX.g(object2, object);
        }
    }

    private final void F(Object obj, Object obj2, int i2) {
        int iN = n(i2);
        if (S(obj2, iN, i2)) {
            long jU = u(t(i2));
            Unsafe unsafe = f12958b;
            Object object = unsafe.getObject(obj2, jU);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i2) + " is present but null: " + obj2.toString());
            }
            ft ftVarX = x(i2);
            if (!S(obj, iN, i2)) {
                if (Q(object)) {
                    Object objE = ftVarX.e();
                    ftVarX.g(objE, object);
                    unsafe.putObject(obj, jU, objE);
                } else {
                    unsafe.putObject(obj, jU, object);
                }
                I(obj, iN, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jU);
            if (!Q(object2)) {
                Object objE2 = ftVarX.e();
                ftVarX.g(objE2, object2);
                unsafe.putObject(obj, jU, objE2);
                object2 = objE2;
            }
            ftVarX.g(object2, object);
        }
    }

    private final void G(Object obj, int i2, aa aaVar) {
        if (M(i2)) {
            gk.p(obj, u(i2), aaVar.u());
        } else if (this.f12965i) {
            gk.p(obj, u(i2), aaVar.t());
        } else {
            gk.p(obj, u(i2), aaVar.p());
        }
    }

    private final void H(Object obj, int i2) {
        int iQ = q(i2);
        long j2 = 1048575 & iQ;
        if (j2 == 1048575) {
            return;
        }
        gk.n(obj, j2, (1 << (iQ >>> 20)) | gk.c(obj, j2));
    }

    private final void I(Object obj, int i2, int i3) {
        gk.n(obj, q(i3) & 1048575, i2);
    }

    private final void J(Object obj, int i2, Object obj2) {
        f12958b.putObject(obj, u(t(i2)), obj2);
        H(obj, i2);
    }

    private final void K(Object obj, int i2, int i3, Object obj2) {
        f12958b.putObject(obj, u(t(i3)), obj2);
        I(obj, i2, i3);
    }

    private final boolean L(Object obj, Object obj2, int i2) {
        return N(obj, i2) == N(obj2, i2);
    }

    private static boolean M(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final boolean N(Object obj, int i2) {
        int iQ = q(i2);
        long j2 = 1048575 & iQ;
        if (j2 != 1048575) {
            return ((1 << (iQ >>> 20)) & gk.c(obj, j2)) != 0;
        }
        int iT = t(i2);
        long jU = u(iT);
        switch (s(iT)) {
            case 0:
                return Double.doubleToRawLongBits(gk.a(obj, jU)) != 0;
            case 1:
                return Float.floatToRawIntBits(gk.b(obj, jU)) != 0;
            case 2:
                return gk.d(obj, jU) != 0;
            case 3:
                return gk.d(obj, jU) != 0;
            case 4:
                return gk.c(obj, jU) != 0;
            case 5:
                return gk.d(obj, jU) != 0;
            case 6:
                return gk.c(obj, jU) != 0;
            case 7:
                return gk.t(obj, jU);
            case 8:
                Object objF = gk.f(obj, jU);
                return objF instanceof String ? !((String) objF).isEmpty() : objF instanceof v ? !v.f13054a.equals(objF) : T();
            case 9:
                return gk.f(obj, jU) != null;
            case 10:
                return !v.f13054a.equals(gk.f(obj, jU));
            case 11:
                return gk.c(obj, jU) != 0;
            case 12:
                return gk.c(obj, jU) != 0;
            case 13:
                return gk.c(obj, jU) != 0;
            case 14:
                return gk.d(obj, jU) != 0;
            case 15:
                return gk.c(obj, jU) != 0;
            case 16:
                return gk.d(obj, jU) != 0;
            case 17:
                return gk.f(obj, jU) != null;
            default:
                return T();
        }
    }

    private final boolean O(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? N(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean P(Object obj, int i2, ft ftVar) {
        return ftVar.l(gk.f(obj, u(i2)));
    }

    private static boolean Q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof du) {
            return ((du) obj).isMutable();
        }
        return true;
    }

    private final boolean R(Object obj, Object obj2, int i2) {
        long jQ = q(i2) & 1048575;
        return gk.c(obj, jQ) == gk.c(obj2, jQ);
    }

    private final boolean S(Object obj, int i2, int i3) {
        return gk.c(obj, (long) (q(i3) & 1048575)) == i2;
    }

    private boolean T() {
        throw new IllegalArgumentException();
    }

    private static final int U(byte[] bArr, int i2, int i3, gm gmVar, Class cls, k kVar) {
        gm gmVar2 = gm.DOUBLE;
        switch (gmVar) {
            case DOUBLE:
                int i4 = i2 + 8;
                kVar.f13038c = Double.valueOf(l.a(bArr, i2));
                return i4;
            case FLOAT:
                int i5 = i2 + 4;
                kVar.f13038c = Float.valueOf(l.b(bArr, i2));
                return i5;
            case INT64:
            case UINT64:
                int iW = l.w(bArr, i2, kVar);
                kVar.f13038c = Long.valueOf(kVar.f13037b);
                return iW;
            case INT32:
            case UINT32:
            case ENUM:
                int iT = l.t(bArr, i2, kVar);
                kVar.f13038c = Integer.valueOf(kVar.f13036a);
                return iT;
            case FIXED64:
            case SFIXED64:
                int i6 = i2 + 8;
                kVar.f13038c = Long.valueOf(l.A(bArr, i2));
                return i6;
            case FIXED32:
            case SFIXED32:
                int i7 = i2 + 4;
                kVar.f13038c = Integer.valueOf(l.d(bArr, i2));
                return i7;
            case BOOL:
                int iW2 = l.w(bArr, i2, kVar);
                kVar.f13038c = Boolean.valueOf(kVar.f13037b != 0);
                return iW2;
            case STRING:
                return l.r(bArr, i2, kVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return l.f(fq.a().c(cls), bArr, i2, i3, kVar);
            case BYTES:
                return l.c(bArr, i2, kVar);
            case SINT32:
                int iT2 = l.t(bArr, i2, kVar);
                kVar.f13038c = Integer.valueOf(z.O(kVar.f13036a));
                return iT2;
            case SINT64:
                int iW3 = l.w(bArr, i2, kVar);
                kVar.f13038c = Long.valueOf(z.Q(kVar.f13037b));
                return iW3;
        }
    }

    private static final void V(int i2, Object obj, af afVar) {
        if (obj instanceof String) {
            afVar.H(i2, (String) obj);
        } else {
            afVar.d(i2, (v) obj);
        }
    }

    static gf d(Object obj) {
        du duVar = (du) obj;
        gf gfVar = duVar.unknownFields;
        if (gfVar != gf.c()) {
            return gfVar;
        }
        gf gfVarE = gf.e();
        duVar.unknownFields = gfVarE;
        return gfVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.v.fl m(com.google.v.fg r32, com.google.v.ge r33, com.google.v.dc r34) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.m(com.google.v.fg, com.google.v.ge, com.google.v.dc):com.google.v.fl");
    }

    private final int n(int i2) {
        return this.f12959c[i2];
    }

    private static int o(Object obj, long j2) {
        return ((Integer) gk.f(obj, j2)).intValue();
    }

    private final int p(int i2) {
        if (i2 < this.f12961e || i2 > this.f12962f) {
            return -1;
        }
        return r(i2, 0);
    }

    private final int q(int i2) {
        return this.f12959c[i2 + 2];
    }

    private final int r(int i2, int i3) {
        int length = (this.f12959c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int iN = n(i5);
            if (i2 == iN) {
                return i5;
            }
            if (i2 < iN) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int s(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int t(int i2) {
        return this.f12959c[i2 + 1];
    }

    private static long u(int i2) {
        return i2 & 1048575;
    }

    private static long v(Object obj, long j2) {
        return ((Long) gk.f(obj, j2)).longValue();
    }

    private final ei w(int i2) {
        int i3 = i2 / 3;
        return (ei) this.f12960d[i3 + i3 + 1];
    }

    private final ft x(int i2) {
        Object[] objArr = this.f12960d;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        ft ftVar = (ft) objArr[i4];
        if (ftVar != null) {
            return ftVar;
        }
        ft ftVarC = fq.a().c((Class) objArr[i4 + 1]);
        objArr[i4] = ftVarC;
        return ftVarC;
    }

    private final Object y(Object obj, int i2, Object obj2, ge geVar, Object obj3) {
        ei eiVarW;
        int iN = n(i2);
        Object objF = gk.f(obj, u(t(i2)));
        if (objF == null || (eiVarW = w(i2)) == null) {
            return obj2;
        }
        fd fdVarI = dc.i(z(i2));
        Iterator it = ((ff) objF).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!eiVarW.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = ge.f(obj3);
                }
                int iB = fe.b(fdVarI, entry.getKey(), entry.getValue());
                v vVar = v.f13054a;
                byte[] bArr = new byte[iB];
                ae aeVarAb = ae.ab(bArr);
                try {
                    fe.e(aeVarAb, fdVarI, entry.getKey(), entry.getValue());
                    ge.b(obj2, iN, dc.a(aeVarAb, bArr));
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return obj2;
    }

    private final Object z(int i2) {
        int i3 = i2 / 3;
        return this.f12960d[i3 + i3];
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x03e8  */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.a(java.lang.Object):int");
    }

    @Override // com.google.v.ft
    public final int b(Object obj) {
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.f12959c.length; i3 += 3) {
            int iT = t(i3);
            int iS = s(iT);
            if (iS <= 50 || iS >= 69) {
                long jU = u(iT);
                int iB = 37;
                switch (iS) {
                    case 0:
                        i2 = iHashCode * 53;
                        long jDoubleToLongBits = Double.doubleToLongBits(gk.a(obj, jU));
                        byte[] bArr = ep.f12912a;
                        iB = a.a.b(jDoubleToLongBits);
                        iHashCode = i2 + iB;
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iB = Float.floatToIntBits(gk.b(obj, jU));
                        iHashCode = i2 + iB;
                        break;
                    case 2:
                        i2 = iHashCode * 53;
                        long jD = gk.d(obj, jU);
                        byte[] bArr2 = ep.f12912a;
                        iB = a.a.b(jD);
                        iHashCode = i2 + iB;
                        break;
                    case 3:
                        i2 = iHashCode * 53;
                        long jD2 = gk.d(obj, jU);
                        byte[] bArr3 = ep.f12912a;
                        iB = a.a.b(jD2);
                        iHashCode = i2 + iB;
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 5:
                        i2 = iHashCode * 53;
                        long jD3 = gk.d(obj, jU);
                        byte[] bArr4 = ep.f12912a;
                        iB = a.a.b(jD3);
                        iHashCode = i2 + iB;
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        boolean zT = gk.t(obj, jU);
                        byte[] bArr5 = ep.f12912a;
                        iB = a.a.a(zT);
                        iHashCode = i2 + iB;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iB = ((String) gk.f(obj, jU)).hashCode();
                        iHashCode = i2 + iB;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        Object objF = gk.f(obj, jU);
                        if (objF != null) {
                            iB = objF.hashCode();
                        }
                        iHashCode = i2 + iB;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iB = gk.f(obj, jU).hashCode();
                        iHashCode = i2 + iB;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 14:
                        i2 = iHashCode * 53;
                        long jD4 = gk.d(obj, jU);
                        byte[] bArr6 = ep.f12912a;
                        iB = a.a.b(jD4);
                        iHashCode = i2 + iB;
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iB = gk.c(obj, jU);
                        iHashCode = i2 + iB;
                        break;
                    case 16:
                        i2 = iHashCode * 53;
                        long jD5 = gk.d(obj, jU);
                        byte[] bArr7 = ep.f12912a;
                        iB = a.a.b(jD5);
                        iHashCode = i2 + iB;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        Object objF2 = gk.f(obj, jU);
                        if (objF2 != null) {
                            iB = objF2.hashCode();
                        }
                        iHashCode = i2 + iB;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = iHashCode * 53;
                        iB = gk.f(obj, jU).hashCode();
                        iHashCode = i2 + iB;
                        break;
                    case 50:
                        i2 = iHashCode * 53;
                        iB = gk.f(obj, jU).hashCode();
                        iHashCode = i2 + iB;
                        break;
                }
            }
        }
        int i4 = this.f12968l;
        while (true) {
            int[] iArr = this.f12966j;
            if (i4 >= iArr.length) {
                int iHashCode2 = (iHashCode * 53) + ge.d(obj).hashCode();
                return this.f12964h ? (iHashCode2 * 53) + dc.b(obj).hashCode() : iHashCode2;
            }
            int i5 = iArr[i4];
            if (!S(obj, 0, i5)) {
                iHashCode = (iHashCode * 53) + gk.f(obj, u(t(i5))).hashCode();
            }
            i4++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.v.k r39) {
        /*
            Method dump skipped, instructions count: 3824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.c(java.lang.Object, byte[], int, int, int, com.google.v.k):int");
    }

    @Override // com.google.v.ft
    public final Object e() {
        return ((du) this.f12963g).newMutableInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = Q(r8)
            if (r0 != 0) goto L8
            goto L8c
        L8:
            boolean r0 = r8 instanceof com.google.v.du
            if (r0 == 0) goto L18
            r0 = r8
            com.google.v.du r0 = (com.google.v.du) r0
            r0.clearMemoizedSerializedSize()
            r0.clearMemoizedHashCode()
            r0.markImmutable()
        L18:
            int[] r0 = r7.f12959c
            r1 = 0
        L1b:
            int r2 = r0.length
            if (r1 >= r2) goto L82
            int r2 = r7.t(r1)
            long r3 = u(r2)
            int r2 = s(r2)
            r5 = 9
            if (r2 == r5) goto L6c
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L6c;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7f
        L3a:
            sun.misc.Unsafe r2 = com.google.v.fl.f12958b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7f
            r6 = r5
            com.google.v.ff r6 = (com.google.v.ff) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L7f
        L4c:
            com.google.v.eo r2 = com.google.v.dc.m(r8, r3)
            r2.b()
            goto L7f
        L54:
            int r2 = r7.n(r1)
            boolean r2 = r7.S(r8, r2, r1)
            if (r2 == 0) goto L7f
            com.google.v.ft r2 = r7.x(r1)
            sun.misc.Unsafe r5 = com.google.v.fl.f12958b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.f(r3)
            goto L7f
        L6c:
            boolean r2 = r7.N(r8, r1)
            if (r2 == 0) goto L7f
            com.google.v.ft r2 = r7.x(r1)
            sun.misc.Unsafe r5 = com.google.v.fl.f12958b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.f(r3)
        L7f:
            int r1 = r1 + 3
            goto L1b
        L82:
            com.google.v.ge.g(r8)
            boolean r7 = r7.f12964h
            if (r7 == 0) goto L8c
            com.google.v.dc.f(r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.f(java.lang.Object):void");
    }

    @Override // com.google.v.ft
    public final void g(Object obj, Object obj2) {
        D(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.f12959c.length; i2 += 3) {
            int iT = t(i2);
            long jU = u(iT);
            int iN = n(i2);
            switch (s(iT)) {
                case 0:
                    if (N(obj2, i2)) {
                        gk.l(obj, jU, gk.a(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (N(obj2, i2)) {
                        gk.m(obj, jU, gk.b(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (N(obj2, i2)) {
                        gk.o(obj, jU, gk.d(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (N(obj2, i2)) {
                        gk.o(obj, jU, gk.d(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (N(obj2, i2)) {
                        gk.o(obj, jU, gk.d(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (N(obj2, i2)) {
                        gk.k(obj, jU, gk.t(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (N(obj2, i2)) {
                        gk.p(obj, jU, gk.f(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    E(obj, obj2, i2);
                    break;
                case 10:
                    if (N(obj2, i2)) {
                        gk.p(obj, jU, gk.f(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (N(obj2, i2)) {
                        gk.o(obj, jU, gk.d(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (N(obj2, i2)) {
                        gk.n(obj, jU, gk.c(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (N(obj2, i2)) {
                        gk.o(obj, jU, gk.d(obj2, jU));
                        H(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    E(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    eo eoVarM = dc.m(obj, jU);
                    eo eoVarM2 = dc.m(obj2, jU);
                    int size = eoVarM.size();
                    int size2 = eoVarM2.size();
                    if (size > 0 && size2 > 0) {
                        if (!eoVarM.c()) {
                            eoVarM = eoVarM.f(size2 + size);
                        }
                        eoVarM.addAll(eoVarM2);
                    }
                    if (size > 0) {
                        eoVarM2 = eoVarM;
                    }
                    gk.p(obj, jU, eoVarM2);
                    break;
                case 50:
                    int i3 = fu.f12982a;
                    gk.p(obj, jU, dc.k(gk.f(obj, jU), gk.f(obj2, jU)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (S(obj2, iN, i2)) {
                        gk.p(obj, jU, gk.f(obj2, jU));
                        I(obj, iN, i2);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    F(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (S(obj2, iN, i2)) {
                        gk.p(obj, jU, gk.f(obj2, jU));
                        I(obj, iN, i2);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    F(obj, obj2, i2);
                    break;
            }
        }
        fu.L(obj, obj2);
        if (this.f12964h) {
            fu.K(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0277 A[Catch: all -> 0x07bc, TryCatch #7 {all -> 0x07bc, blocks: (B:28:0x0074, B:51:0x0124, B:52:0x0139, B:50:0x011e, B:40:0x00bd, B:41:0x00c6, B:42:0x00d1, B:43:0x00dc, B:44:0x00e7, B:45:0x00f2, B:46:0x00fd, B:47:0x0108, B:48:0x0113, B:53:0x013a, B:55:0x0145, B:57:0x0151, B:58:0x0157, B:97:0x026c, B:99:0x0272, B:100:0x0277, B:108:0x02a0, B:105:0x0288, B:107:0x028e, B:59:0x015d, B:60:0x0165, B:62:0x016b, B:63:0x0175, B:64:0x017f, B:65:0x0189, B:66:0x0193, B:67:0x019a, B:68:0x019b, B:69:0x01a5, B:70:0x01ab, B:72:0x01b1, B:74:0x01b9, B:76:0x01ca, B:77:0x01d5, B:78:0x01da, B:79:0x01e6, B:81:0x01ec, B:83:0x01f4, B:85:0x0205, B:86:0x0210, B:87:0x0215, B:88:0x0220, B:89:0x0225, B:90:0x022e, B:91:0x0237, B:92:0x0240, B:93:0x0249, B:94:0x0252, B:95:0x025b, B:96:0x0264, B:113:0x02ad, B:132:0x02ed, B:176:0x04e7, B:177:0x04f4, B:178:0x0502, B:179:0x0510, B:180:0x051e, B:181:0x052c, B:182:0x053a, B:183:0x0548, B:184:0x0556, B:185:0x0564, B:186:0x0572, B:187:0x0580, B:188:0x058e, B:189:0x059c, B:194:0x05bd, B:195:0x05ca, B:196:0x05d8, B:197:0x05ea, B:199:0x05f1, B:200:0x05ff, B:201:0x060c, B:202:0x061a, B:203:0x0628, B:204:0x0636, B:205:0x0644, B:206:0x0652, B:207:0x0660, B:208:0x066e, B:209:0x067c, B:210:0x068f, B:211:0x06a0, B:212:0x06b1, B:213:0x06c2, B:214:0x06d3, B:216:0x06e2, B:219:0x06e9, B:220:0x06ef, B:221:0x06fb, B:222:0x070c, B:223:0x071d, B:224:0x0730, B:225:0x0739, B:226:0x074a, B:227:0x075a, B:228:0x076a, B:229:0x077a, B:230:0x078a, B:231:0x079a, B:232:0x07aa), top: B:284:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0821 A[LOOP:3: B:263:0x081d->B:265:0x0821, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:370:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0272 A[Catch: all -> 0x07bc, TryCatch #7 {all -> 0x07bc, blocks: (B:28:0x0074, B:51:0x0124, B:52:0x0139, B:50:0x011e, B:40:0x00bd, B:41:0x00c6, B:42:0x00d1, B:43:0x00dc, B:44:0x00e7, B:45:0x00f2, B:46:0x00fd, B:47:0x0108, B:48:0x0113, B:53:0x013a, B:55:0x0145, B:57:0x0151, B:58:0x0157, B:97:0x026c, B:99:0x0272, B:100:0x0277, B:108:0x02a0, B:105:0x0288, B:107:0x028e, B:59:0x015d, B:60:0x0165, B:62:0x016b, B:63:0x0175, B:64:0x017f, B:65:0x0189, B:66:0x0193, B:67:0x019a, B:68:0x019b, B:69:0x01a5, B:70:0x01ab, B:72:0x01b1, B:74:0x01b9, B:76:0x01ca, B:77:0x01d5, B:78:0x01da, B:79:0x01e6, B:81:0x01ec, B:83:0x01f4, B:85:0x0205, B:86:0x0210, B:87:0x0215, B:88:0x0220, B:89:0x0225, B:90:0x022e, B:91:0x0237, B:92:0x0240, B:93:0x0249, B:94:0x0252, B:95:0x025b, B:96:0x0264, B:113:0x02ad, B:132:0x02ed, B:176:0x04e7, B:177:0x04f4, B:178:0x0502, B:179:0x0510, B:180:0x051e, B:181:0x052c, B:182:0x053a, B:183:0x0548, B:184:0x0556, B:185:0x0564, B:186:0x0572, B:187:0x0580, B:188:0x058e, B:189:0x059c, B:194:0x05bd, B:195:0x05ca, B:196:0x05d8, B:197:0x05ea, B:199:0x05f1, B:200:0x05ff, B:201:0x060c, B:202:0x061a, B:203:0x0628, B:204:0x0636, B:205:0x0644, B:206:0x0652, B:207:0x0660, B:208:0x066e, B:209:0x067c, B:210:0x068f, B:211:0x06a0, B:212:0x06b1, B:213:0x06c2, B:214:0x06d3, B:216:0x06e2, B:219:0x06e9, B:220:0x06ef, B:221:0x06fb, B:222:0x070c, B:223:0x071d, B:224:0x0730, B:225:0x0739, B:226:0x074a, B:227:0x075a, B:228:0x076a, B:229:0x077a, B:230:0x078a, B:231:0x079a, B:232:0x07aa), top: B:284:0x011e }] */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r18, com.google.v.aa r19, com.google.v.de r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.h(java.lang.Object, com.google.v.aa, com.google.v.de):void");
    }

    @Override // com.google.v.ft
    public final void i(Object obj, byte[] bArr, int i2, int i3, k kVar) {
        c(obj, bArr, i2, i3, 0, kVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.Object r19, com.google.v.af r20) {
        /*
            Method dump skipped, instructions count: 1452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.j(java.lang.Object, com.google.v.af):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01cf, code lost:
    
        continue;
     */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.k(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    @Override // com.google.v.ft
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.fl.l(java.lang.Object):boolean");
    }
}
