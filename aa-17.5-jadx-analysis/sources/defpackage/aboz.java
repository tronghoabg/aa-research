package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class aboz<T> implements abpl<T> {
    public static final int[] a = new int[0];
    public static final Unsafe b = abqb.g();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final abow g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final abpv m;

    public aboz(int[] iArr, Object[] objArr, int i, int i2, abow abowVar, int[] iArr2, int i3, int i4, abpv abpvVar, yrm yrmVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = abowVar instanceof abnv;
        boolean z = false;
        if (yrmVar != null && (abowVar instanceof abns)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = abpvVar;
        this.g = abowVar;
    }

    private final void A(Object obj, Object obj2, int i) {
        if (I(obj2, i)) {
            int iS = s(i) & 1048575;
            Unsafe unsafe = b;
            long j = iS;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            abpl abplVarV = v(i);
            if (!I(obj, i)) {
                if (K(object)) {
                    Object objE = abplVarV.e();
                    abplVarV.h(objE, object);
                    unsafe.putObject(obj, j, objE);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                D(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!K(object2)) {
                Object objE2 = abplVarV.e();
                abplVarV.h(objE2, object2);
                unsafe.putObject(obj, j, objE2);
                object2 = objE2;
            }
            abplVarV.h(object2, object);
        }
    }

    private final void B(Object obj, Object obj2, int i) {
        int iN = n(i);
        if (M(obj2, iN, i)) {
            long jT = t(s(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jT);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + n(i) + " is present but null: " + obj2.toString());
            }
            abpl abplVarV = v(i);
            if (!M(obj, iN, i)) {
                if (K(object)) {
                    Object objE = abplVarV.e();
                    abplVarV.h(objE, object);
                    unsafe.putObject(obj, jT, objE);
                } else {
                    unsafe.putObject(obj, jT, object);
                }
                E(obj, iN, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jT);
            if (!K(object2)) {
                Object objE2 = abplVarV.e();
                abplVarV.h(objE2, object2);
                unsafe.putObject(obj, jT, objE2);
                object2 = objE2;
            }
            abplVarV.h(object2, object);
        }
    }

    private final void C(Object obj, int i, abmx abmxVar) throws IOException {
        long j = i & 1048575;
        if ((536870912 & i) != 0) {
            abqb.a.l(obj, j, abmxVar.u());
        } else if (this.i) {
            abqb.a.l(obj, j, abmxVar.t());
        } else {
            abqb.a.l(obj, j, abmxVar.o());
        }
    }

    private final void D(Object obj, int i) {
        int iQ = q(i);
        long j = 1048575 & iQ;
        if (j == 1048575) {
            return;
        }
        abqa abqaVar = abqb.a;
        abqaVar.j(obj, j, (1 << (iQ >>> 20)) | abqaVar.g(obj, j));
    }

    private final void E(Object obj, int i, int i2) {
        abqb.l(obj, q(i2) & 1048575, i);
    }

    private final void F(Object obj, int i, Object obj2) {
        b.putObject(obj, s(i) & 1048575, obj2);
        D(obj, i);
    }

    private final void G(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, t(s(i2)), obj2);
        E(obj, i, i2);
    }

    private final boolean H(Object obj, Object obj2, int i) {
        return I(obj, i) == I(obj2, i);
    }

    private final boolean I(Object obj, int i) {
        int iQ = q(i);
        long j = iQ & 1048575;
        if (j != 1048575) {
            return ((1 << (iQ >>> 20)) & abqb.a.g(obj, j)) != 0;
        }
        int iS = s(i);
        long j2 = iS & 1048575;
        switch ((iS >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(abqb.b(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(abqb.c(obj, j2)) != 0;
            case 2:
                return abqb.a.h(obj, j2) != 0;
            case 3:
                return abqb.a.h(obj, j2) != 0;
            case 4:
                return abqb.a.g(obj, j2) != 0;
            case 5:
                return abqb.a.h(obj, j2) != 0;
            case 6:
                return abqb.a.g(obj, j2) != 0;
            case 7:
                return abqb.a.f(obj, j2);
            case 8:
                Object objI = abqb.a.i(obj, j2);
                return objI instanceof String ? !((String) objI).isEmpty() : objI instanceof abms ? !abms.d.equals(objI) : N();
            case 9:
                return abqb.a.i(obj, j2) != null;
            case 10:
                return !abms.d.equals(abqb.a.i(obj, j2));
            case 11:
                return abqb.a.g(obj, j2) != 0;
            case 12:
                return abqb.a.g(obj, j2) != 0;
            case 13:
                return abqb.a.g(obj, j2) != 0;
            case 14:
                return abqb.a.h(obj, j2) != 0;
            case 15:
                return abqb.a.g(obj, j2) != 0;
            case 16:
                return abqb.a.h(obj, j2) != 0;
            case 17:
                return abqb.a.i(obj, j2) != null;
            default:
                return N();
        }
    }

    private final boolean J(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(obj, i) : (i3 & i4) != 0;
    }

    private static boolean K(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof abnv) {
            return ((abnv) obj).T();
        }
        return true;
    }

    private final boolean L(Object obj, Object obj2, int i) {
        long jQ = q(i) & 1048575;
        return abqb.d(obj, jQ) == abqb.d(obj2, jQ);
    }

    private final boolean M(Object obj, int i, int i2) {
        return abqb.a.g(obj, (long) (q(i2) & 1048575)) == i;
    }

    private boolean N() {
        throw new IllegalArgumentException();
    }

    private static final int O(byte[] bArr, int i, int i2, abqd abqdVar, Class cls, abmg abmgVar) throws IOException {
        abqd abqdVar2 = abqd.DOUBLE;
        switch (abqdVar) {
            case DOUBLE:
                int i3 = i + 8;
                abmgVar.c = Double.valueOf(abmh.a(bArr, i));
                return i3;
            case FLOAT:
                int i4 = i + 4;
                abmgVar.c = Float.valueOf(Float.intBitsToFloat(abmh.c(bArr, i)));
                return i4;
            case INT64:
            case UINT64:
                int iO = abmh.o(bArr, i, abmgVar);
                abmgVar.c = Long.valueOf(abmgVar.b);
                return iO;
            case INT32:
            case UINT32:
            case ENUM:
                int iL = abmh.l(bArr, i, abmgVar);
                abmgVar.c = Integer.valueOf(abmgVar.a);
                return iL;
            case FIXED64:
            case SFIXED64:
                int i5 = i + 8;
                abmgVar.c = Long.valueOf(abmh.s(bArr, i));
                return i5;
            case FIXED32:
            case SFIXED32:
                int i6 = i + 4;
                abmgVar.c = Integer.valueOf(abmh.c(bArr, i));
                return i6;
            case BOOL:
                int iO2 = abmh.o(bArr, i, abmgVar);
                abmgVar.c = Boolean.valueOf(abmgVar.b != 0);
                return iO2;
            case STRING:
                return abmh.j(bArr, i, abmgVar);
            case GROUP:
            default:
                throw new RuntimeException("unsupported field type.");
            case MESSAGE:
                return abmh.f(abpe.a.b(cls), bArr, i, i2, abmgVar);
            case BYTES:
                return abmh.b(bArr, i, abmgVar);
            case SINT32:
                int iL2 = abmh.l(bArr, i, abmgVar);
                int i7 = abmgVar.a;
                int i8 = abmw.l;
                abmgVar.c = Integer.valueOf((-(i7 & 1)) ^ (i7 >>> 1));
                return iL2;
            case SINT64:
                int iO3 = abmh.o(bArr, i, abmgVar);
                long j = abmgVar.b;
                int i9 = abmw.l;
                abmgVar.c = Long.valueOf((-(j & 1)) ^ (j >>> 1));
                return iO3;
        }
    }

    private final Object P(Object obj, int i, Object obj2, Object obj3) {
        abob abobVarU;
        int iN = n(i);
        Object objI = abqb.a.i(obj, s(i) & 1048575);
        if (objI == null || (abobVarU = u(i)) == null) {
            return obj2;
        }
        Object obj4 = ((lds) w(i)).a;
        Iterator it = ((abot) objI).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!abobVarU.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = abpv.e(obj3);
                }
                int iN2 = lds.n((abos) obj4, entry.getKey(), entry.getValue());
                abms abmsVar = abms.d;
                byte[] bArr = new byte[iN2];
                abmy abmyVar = new abmy(bArr, 0, iN2, null);
                try {
                    lds.o(abmyVar, (abos) obj4, entry.getKey(), entry.getValue());
                    abmyVar.I();
                    ((abpw) obj2).e((iN << 3) | 2, new abmq(bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private static final void Q(int i, Object obj, lds ldsVar) throws IOException {
        if (obj instanceof String) {
            ldsVar.F(i, (String) obj);
        } else {
            ldsVar.q(i, (abms) obj);
        }
    }

    static abpw d(Object obj) {
        abnv abnvVar = (abnv) obj;
        abpw abpwVar = abnvVar.al;
        if (abpwVar != abpw.a) {
            return abpwVar;
        }
        abpw abpwVar2 = new abpw();
        abnvVar.al = abpwVar2;
        return abpwVar2;
    }

    public static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields), e);
        }
    }

    private final int n(int i) {
        return this.c[i];
    }

    private static int o(Object obj, long j) {
        return ((Integer) abqb.a.i(obj, j)).intValue();
    }

    private final int p(int i) {
        if (i < this.e || i > this.f) {
            return -1;
        }
        return r(i, 0);
    }

    private final int q(int i) {
        return this.c[i + 2];
    }

    private final int r(int i, int i2) {
        int length = (this.c.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int iN = n(i4);
            if (i == iN) {
                return i4;
            }
            if (i < iN) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private final int s(int i) {
        return this.c[i + 1];
    }

    private static long t(int i) {
        return i & 1048575;
    }

    private final abob u(int i) {
        int i2 = i / 3;
        return (abob) this.d[i2 + i2 + 1];
    }

    private final abpl v(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        abpl abplVar = (abpl) objArr[i3];
        if (abplVar != null) {
            return abplVar;
        }
        abpl abplVarB = abpe.a.b((Class) objArr[i3 + 1]);
        objArr[i3] = abplVarB;
        return abplVarB;
    }

    private final Object w(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object x(Object obj, int i) {
        abpl abplVarV = v(i);
        int iS = s(i) & 1048575;
        if (!I(obj, i)) {
            return abplVarV.e();
        }
        Object object = b.getObject(obj, iS);
        if (K(object)) {
            return object;
        }
        Object objE = abplVarV.e();
        if (object != null) {
            abplVarV.h(objE, object);
        }
        return objE;
    }

    private final Object y(Object obj, int i, int i2) {
        abpl abplVarV = v(i2);
        if (!M(obj, i, i2)) {
            return abplVarV.e();
        }
        Object object = b.getObject(obj, t(s(i2)));
        if (K(object)) {
            return object;
        }
        Object objE = abplVarV.e();
        if (object != null) {
            abplVarV.h(objE, object);
        }
        return objE;
    }

    private static void z(Object obj) {
        if (!K(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(String.valueOf(obj))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:169:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0634  */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r18) throws defpackage.abqc {
        /*
            Method dump skipped, instructions count: 2322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.a(java.lang.Object):int");
    }

    @Override // defpackage.abpl
    public final int b(Object obj) {
        int i;
        long jDoubleToLongBits;
        int iFloatToIntBits;
        int i2;
        int iHashCode = 0;
        for (int i3 = 0; i3 < this.c.length; i3 += 3) {
            int iS = s(i3);
            int i4 = (iS >>> 20) & 255;
            if (i4 <= 50 || i4 >= 69) {
                long j = iS & 1048575;
                int iHashCode2 = 37;
                switch (i4) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(abqb.b(obj, j));
                        byte[] bArr = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 1:
                        i = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(abqb.c(obj, j));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = abqb.a.h(obj, j);
                        byte[] bArr2 = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = abqb.a.h(obj, j);
                        byte[] bArr3 = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 4:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = abqb.a.h(obj, j);
                        byte[] bArr4 = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 6:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 7:
                        i = iHashCode * 53;
                        boolean zF = abqb.a.f(obj, j);
                        byte[] bArr5 = aboi.a;
                        iFloatToIntBits = true != zF ? 1237 : 1231;
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 8:
                        i = iHashCode * 53;
                        iFloatToIntBits = ((String) abqb.a.i(obj, j)).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 9:
                        i2 = iHashCode * 53;
                        Object objI = abqb.a.i(obj, j);
                        if (objI != null) {
                            iHashCode2 = objI.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
                        break;
                    case 10:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 11:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 12:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 13:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = abqb.a.h(obj, j);
                        byte[] bArr6 = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 15:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.g(obj, j);
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = abqb.a.h(obj, j);
                        byte[] bArr7 = aboi.a;
                        iFloatToIntBits = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case 17:
                        i2 = iHashCode * 53;
                        Object objI2 = abqb.a.i(obj, j);
                        if (objI2 != null) {
                            iHashCode2 = objI2.hashCode();
                        }
                        iHashCode = i2 + iHashCode2;
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
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 31:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 37:
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i = iHashCode * 53;
                        iFloatToIntBits = abqb.a.i(obj, j).hashCode();
                        iHashCode = i + iFloatToIntBits;
                        break;
                }
            }
        }
        int i5 = this.l;
        while (true) {
            int[] iArr = this.j;
            if (i5 >= iArr.length) {
                int iHashCode3 = (iHashCode * 53) + ((abnv) obj).al.hashCode();
                return this.h ? (iHashCode3 * 53) + ((abns) obj).w.hashCode() : iHashCode3;
            }
            if (!M(obj, 0, iArr[i5])) {
                iHashCode = (iHashCode * 53) + abqb.a.i(obj, s(r3) & 1048575).hashCode();
            }
            i5++;
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    final int c(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, defpackage.abmg r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.c(java.lang.Object, byte[], int, int, int, abmg):int");
    }

    @Override // defpackage.abpl
    public final Object e() {
        return ((abnv) this.g).u();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = K(r8)
            if (r0 != 0) goto L8
            goto L9c
        L8:
            boolean r0 = r8 instanceof defpackage.abnv
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            abnv r0 = (defpackage.abnv) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.Q(r2)
            r0.ak = r1
            r0.O()
        L1b:
            int[] r0 = r7.c
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L89
            int r2 = r7.s(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = r2 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L73
            r5 = 60
            if (r2 == r5) goto L5b
            r5 = 68
            if (r2 == r5) goto L5b
            switch(r2) {
                case 17: goto L73;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L86
        L3d:
            sun.misc.Unsafe r2 = defpackage.aboz.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L86
            r6 = r5
            abot r6 = (defpackage.abot) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L86
        L4f:
            abqa r2 = defpackage.abqb.a
            java.lang.Object r2 = r2.i(r8, r3)
            aboh r2 = (defpackage.aboh) r2
            r2.b()
            goto L86
        L5b:
            int r2 = r7.n(r1)
            boolean r2 = r7.M(r8, r2, r1)
            if (r2 == 0) goto L86
            abpl r2 = r7.v(r1)
            sun.misc.Unsafe r5 = defpackage.aboz.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
            goto L86
        L73:
            boolean r2 = r7.I(r8, r1)
            if (r2 == 0) goto L86
            abpl r2 = r7.v(r1)
            sun.misc.Unsafe r5 = defpackage.aboz.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.g(r3)
        L86:
            int r1 = r1 + 3
            goto L1d
        L89:
            r0 = r8
            abnv r0 = (defpackage.abnv) r0
            abpw r0 = r0.al
            r0.d()
            boolean r7 = r7.h
            if (r7 == 0) goto L9c
            abns r8 = (defpackage.abns) r8
            abnl r7 = r8.w
            r7.e()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.g(java.lang.Object):void");
    }

    @Override // defpackage.abpl
    public final void h(Object obj, Object obj2) {
        Object obj3;
        z(obj);
        obj2.getClass();
        int i = 0;
        while (i < this.c.length) {
            int iS = s(i);
            int iN = n(i);
            long j = 1048575 & iS;
            switch ((iS >>> 20) & 255) {
                case 0:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqb.k(obj3, j, abqb.b(obj2, j));
                        D(obj3, i);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 1:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqb.a.e(obj3, j, abqb.c(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 2:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar = abqb.a;
                        abqaVar.k(obj3, j, abqaVar.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 3:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar2 = abqb.a;
                        abqaVar2.k(obj3, j, abqaVar2.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 4:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar3 = abqb.a;
                        abqaVar3.j(obj3, j, abqaVar3.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 5:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar4 = abqb.a;
                        abqaVar4.k(obj3, j, abqaVar4.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 6:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar5 = abqb.a;
                        abqaVar5.j(obj3, j, abqaVar5.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 7:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar6 = abqb.a;
                        abqaVar6.c(obj3, j, abqaVar6.f(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 8:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar7 = abqb.a;
                        abqaVar7.l(obj3, j, abqaVar7.i(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 9:
                    obj3 = obj;
                    A(obj3, obj2, i);
                    continue;
                    i += 3;
                    obj = obj3;
                case 10:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar8 = abqb.a;
                        abqaVar8.l(obj3, j, abqaVar8.i(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 11:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar9 = abqb.a;
                        abqaVar9.j(obj3, j, abqaVar9.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 12:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar10 = abqb.a;
                        abqaVar10.j(obj3, j, abqaVar10.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 13:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar11 = abqb.a;
                        abqaVar11.j(obj3, j, abqaVar11.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 14:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar12 = abqb.a;
                        abqaVar12.k(obj3, j, abqaVar12.h(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 15:
                    obj3 = obj;
                    if (I(obj2, i)) {
                        abqa abqaVar13 = abqb.a;
                        abqaVar13.j(obj3, j, abqaVar13.g(obj2, j));
                        D(obj3, i);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                case 16:
                    if (I(obj2, i)) {
                        abqa abqaVar14 = abqb.a;
                        obj3 = obj;
                        abqaVar14.k(obj3, j, abqaVar14.h(obj2, j));
                        D(obj3, i);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    A(obj, obj2, i);
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
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                case 31:
                case 32:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                case 37:
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                case Maneuver.TYPE_DESTINATION /* 39 */:
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                case 48:
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    abqa abqaVar15 = abqb.a;
                    aboh abohVarD = (aboh) abqaVar15.i(obj, j);
                    aboh abohVar = (aboh) abqaVar15.i(obj2, j);
                    int size = abohVarD.size();
                    int size2 = abohVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!abohVarD.c()) {
                            abohVarD = abohVarD.d(size2 + size);
                        }
                        abohVarD.addAll(abohVar);
                    }
                    if (size > 0) {
                        abohVar = abohVarD;
                    }
                    abqaVar15.l(obj, j, abohVar);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    abpv abpvVar = abpm.a;
                    abqa abqaVar16 = abqb.a;
                    abqaVar16.l(obj, j, yrm.ax(abqaVar16.i(obj, j), abqaVar16.i(obj2, j)));
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
                    if (M(obj2, iN, i)) {
                        abqa abqaVar17 = abqb.a;
                        abqaVar17.l(obj, j, abqaVar17.i(obj2, j));
                        E(obj, iN, i);
                        break;
                    }
                    break;
                case 60:
                    B(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (M(obj2, iN, i)) {
                        abqa abqaVar18 = abqb.a;
                        abqaVar18.l(obj, j, abqaVar18.i(obj2, j));
                        E(obj, iN, i);
                        break;
                    }
                    break;
                case 68:
                    B(obj, obj2, i);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
        Object obj4 = obj;
        abpv abpvVar2 = abpm.a;
        abnv abnvVar = (abnv) obj4;
        abnvVar.al = abpv.c(abnvVar.al, ((abnv) obj2).al);
        if (this.h) {
            abpm.j(obj4, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x0849 A[Catch: all -> 0x0845, TRY_ENTER, TryCatch #2 {all -> 0x0845, blocks: (B:76:0x01c3, B:288:0x082e, B:297:0x0849, B:298:0x084e), top: B:324:0x01c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0868  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0879 A[LOOP:4: B:311:0x0875->B:313:0x0879, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x018f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0855 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r22, defpackage.abmx r23, defpackage.abnj r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.i(java.lang.Object, abmx, abnj):void");
    }

    @Override // defpackage.abpl
    public final void j(Object obj, byte[] bArr, int i, int i2, abmg abmgVar) throws IOException {
        c(obj, bArr, i, i2, 0, abmgVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01f6, code lost:
    
        continue;
     */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.k(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.l(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    @Override // defpackage.abpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(java.lang.Object r21, defpackage.lds r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.m(java.lang.Object, lds):void");
    }
}
