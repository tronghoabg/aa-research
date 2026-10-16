package defpackage;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
final class ekh implements ekp {
    private static final int[] a = new int[0];
    private static final Unsafe b = elf.h();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final eke g;
    private final boolean h;
    private final boolean i;
    private final int[] j;
    private final int k;
    private final int l;
    private final eky m;

    private ekh(int[] iArr, Object[] objArr, int i, int i2, eke ekeVar, int[] iArr2, int i3, int i4, eky ekyVar, dtg dtgVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i;
        this.f = i2;
        this.i = ekeVar instanceof eji;
        boolean z = false;
        if (dtgVar != null && (ekeVar instanceof ejg)) {
            z = true;
        }
        this.h = z;
        this.j = iArr2;
        this.k = i3;
        this.l = i4;
        this.m = ekyVar;
        this.g = ekeVar;
    }

    private final void A(Object obj, Object obj2, int i) {
        if (I(obj2, i)) {
            long jQ = q(p(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m(i) + " is present but null: " + obj2);
            }
            ekp ekpVarT = t(i);
            if (!I(obj, i)) {
                if (L(object)) {
                    Object objC = ekpVarT.c();
                    ekpVarT.e(objC, object);
                    unsafe.putObject(obj, jQ, objC);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                C(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!L(object2)) {
                Object objC2 = ekpVarT.c();
                ekpVarT.e(objC2, object2);
                unsafe.putObject(obj, jQ, objC2);
                object2 = objC2;
            }
            ekpVarT.e(object2, object);
        }
    }

    private final void B(Object obj, Object obj2, int i) {
        int iM = m(i);
        if (M(obj2, iM, i)) {
            long jQ = q(p(i));
            Unsafe unsafe = b;
            Object object = unsafe.getObject(obj2, jQ);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + m(i) + " is present but null: " + obj2);
            }
            ekp ekpVarT = t(i);
            if (!M(obj, iM, i)) {
                if (L(object)) {
                    Object objC = ekpVarT.c();
                    ekpVarT.e(objC, object);
                    unsafe.putObject(obj, jQ, objC);
                } else {
                    unsafe.putObject(obj, jQ, object);
                }
                D(obj, iM, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, jQ);
            if (!L(object2)) {
                Object objC2 = ekpVarT.c();
                ekpVarT.e(objC2, object2);
                unsafe.putObject(obj, jQ, objC2);
                object2 = objC2;
            }
            ekpVarT.e(object2, object);
        }
    }

    private final void C(Object obj, int i) {
        int iO = o(i);
        long j = 1048575 & iO;
        if (j == 1048575) {
            return;
        }
        elf.p(obj, j, (1 << (iO >>> 20)) | elf.c(obj, j));
    }

    private final void D(Object obj, int i, int i2) {
        elf.p(obj, o(i2) & 1048575, i);
    }

    private final void E(Object obj, int i, Object obj2) {
        b.putObject(obj, q(p(i)), obj2);
        C(obj, i);
    }

    private final void F(Object obj, int i, int i2, Object obj2) {
        b.putObject(obj, q(p(i2)), obj2);
        D(obj, i, i2);
    }

    private final boolean G(Object obj, Object obj2, int i) {
        return I(obj, i) == I(obj2, i);
    }

    private static boolean H(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean I(Object obj, int i) {
        int iO = o(i);
        long j = 1048575 & iO;
        if (j != 1048575) {
            return ((1 << (iO >>> 20)) & elf.c(obj, j)) != 0;
        }
        int iP = p(i);
        long jQ = q(iP);
        switch ((iP >>> 20) & 255) {
            case 0:
                return Double.doubleToRawLongBits(elf.a(obj, jQ)) != 0;
            case 1:
                return Float.floatToRawIntBits(elf.b(obj, jQ)) != 0;
            case 2:
                return elf.d(obj, jQ) != 0;
            case 3:
                return elf.d(obj, jQ) != 0;
            case 4:
                return elf.c(obj, jQ) != 0;
            case 5:
                return elf.d(obj, jQ) != 0;
            case 6:
                return elf.c(obj, jQ) != 0;
            case 7:
                return elf.t(obj, jQ);
            case 8:
                Object objF = elf.f(obj, jQ);
                if (objF instanceof String) {
                    return !((String) objF).isEmpty();
                }
                if (objF instanceof eip) {
                    return !eip.b.equals(objF);
                }
                throw new IllegalArgumentException();
            case 9:
                return elf.f(obj, jQ) != null;
            case 10:
                return !eip.b.equals(elf.f(obj, jQ));
            case 11:
                return elf.c(obj, jQ) != 0;
            case 12:
                return elf.c(obj, jQ) != 0;
            case 13:
                return elf.c(obj, jQ) != 0;
            case 14:
                return elf.d(obj, jQ) != 0;
            case 15:
                return elf.c(obj, jQ) != 0;
            case 16:
                return elf.d(obj, jQ) != 0;
            case 17:
                return elf.f(obj, jQ) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean J(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? I(obj, i) : (i3 & i4) != 0;
    }

    private static boolean K(Object obj, int i, ekp ekpVar) {
        return ekpVar.g(elf.f(obj, q(i)));
    }

    private static boolean L(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof eji) {
            return ((eji) obj).s();
        }
        return true;
    }

    private final boolean M(Object obj, int i, int i2) {
        return elf.c(obj, (long) (o(i2) & 1048575)) == i;
    }

    private static boolean N(Object obj, long j) {
        return ((Boolean) elf.f(obj, j)).booleanValue();
    }

    private final void O(Object obj, int i, wld wldVar) throws IOException {
        if (H(i)) {
            elf.r(obj, q(i), wldVar.v());
        } else if (this.i) {
            elf.r(obj, q(i), wldVar.u());
        } else {
            elf.r(obj, q(i), wldVar.r());
        }
    }

    private static final void P(int i, Object obj, erb erbVar) throws IOException {
        if (!(obj instanceof String)) {
            erbVar.b(i, (eip) obj);
        } else {
            ((eiw) erbVar.a).v(i, (String) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static defpackage.ekh j(defpackage.ekb r35, defpackage.eky r36, defpackage.dtg r37) {
        /*
            Method dump skipped, instructions count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.j(ekb, eky, dtg):ekh");
    }

    private static double k(Object obj, long j) {
        return ((Double) elf.f(obj, j)).doubleValue();
    }

    private static float l(Object obj, long j) {
        return ((Float) elf.f(obj, j)).floatValue();
    }

    private final int m(int i) {
        return this.c[i];
    }

    private static int n(Object obj, long j) {
        return ((Integer) elf.f(obj, j)).intValue();
    }

    private final int o(int i) {
        return this.c[i + 2];
    }

    private final int p(int i) {
        return this.c[i + 1];
    }

    private static long q(int i) {
        return i & 1048575;
    }

    private static long r(Object obj, long j) {
        return ((Long) elf.f(obj, j)).longValue();
    }

    private final ejl s(int i) {
        int i2 = i / 3;
        return (ejl) this.d[i2 + i2 + 1];
    }

    private final ekp t(int i) {
        Object[] objArr = this.d;
        int i2 = i / 3;
        int i3 = i2 + i2;
        ekp ekpVar = (ekp) objArr[i3];
        if (ekpVar != null) {
            return ekpVar;
        }
        ekp ekpVarA = ekm.a.a((Class) objArr[i3 + 1]);
        objArr[i3] = ekpVarA;
        return ekpVarA;
    }

    private final Object u(Object obj, int i, Object obj2, eky ekyVar, Object obj3) {
        ejl ejlVarS;
        int iM = m(i);
        Object objF = elf.f(obj, q(p(i)));
        if (objF == null || (ejlVarS = s(i)) == null) {
            return obj2;
        }
        fgp fgpVarG = dth.g(v(i));
        Iterator it = ((ejz) objF).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!ejlVarS.a()) {
                if (obj2 == null) {
                    obj2 = ekyVar.a(obj3);
                }
                int iR = erb.r(fgpVarG, entry.getKey(), entry.getValue());
                eip eipVar = eip.b;
                byte[] bArr = new byte[iR];
                boolean z = eiw.e;
                eiu eiuVar = new eiu(bArr, iR);
                try {
                    erb.s(eiuVar, fgpVarG, entry.getKey(), entry.getValue());
                    ((ekz) obj2).e((iM << 3) | 2, dtd.g(eiuVar, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    private final Object v(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    private final Object w(Object obj, int i) {
        ekp ekpVarT = t(i);
        long jQ = q(p(i));
        if (!I(obj, i)) {
            return ekpVarT.c();
        }
        Object object = b.getObject(obj, jQ);
        if (L(object)) {
            return object;
        }
        Object objC = ekpVarT.c();
        if (object != null) {
            ekpVarT.e(objC, object);
        }
        return objC;
    }

    private final Object x(Object obj, int i, int i2) {
        ekp ekpVarT = t(i2);
        if (!M(obj, i, i2)) {
            return ekpVarT.c();
        }
        Object object = b.getObject(obj, q(p(i2)));
        if (L(object)) {
            return object;
        }
        Object objC = ekpVarT.c();
        if (object != null) {
            ekpVarT.e(objC, object);
        }
        return objC;
    }

    private static Field y(Class cls, String str) {
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

    private static void z(Object obj) {
        if (L(obj)) {
            return;
        }
        Objects.toString(obj);
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05b7  */
    @Override // defpackage.ekp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 2076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.a(java.lang.Object):int");
    }

    @Override // defpackage.ekp
    public final int b(Object obj) {
        int i;
        int iG;
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < this.c.length; i4 += 3) {
            int iP = p(i4);
            int iM = m(i4);
            long jQ = q(iP);
            int iHashCode = 37;
            switch ((iP >>> 20) & 255) {
                case 0:
                    i = i3 * 53;
                    long jDoubleToLongBits = Double.doubleToLongBits(elf.a(obj, jQ));
                    Charset charset = ejn.a;
                    iG = a.g(jDoubleToLongBits);
                    i3 = i + iG;
                    break;
                case 1:
                    i = i3 * 53;
                    iG = Float.floatToIntBits(elf.b(obj, jQ));
                    i3 = i + iG;
                    break;
                case 2:
                    i = i3 * 53;
                    long jD = elf.d(obj, jQ);
                    Charset charset2 = ejn.a;
                    iG = a.g(jD);
                    i3 = i + iG;
                    break;
                case 3:
                    i = i3 * 53;
                    long jD2 = elf.d(obj, jQ);
                    Charset charset3 = ejn.a;
                    iG = a.g(jD2);
                    i3 = i + iG;
                    break;
                case 4:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 5:
                    i = i3 * 53;
                    long jD3 = elf.d(obj, jQ);
                    Charset charset4 = ejn.a;
                    iG = a.g(jD3);
                    i3 = i + iG;
                    break;
                case 6:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 7:
                    i = i3 * 53;
                    boolean zT = elf.t(obj, jQ);
                    Charset charset5 = ejn.a;
                    iG = a.f(zT);
                    i3 = i + iG;
                    break;
                case 8:
                    i = i3 * 53;
                    iG = ((String) elf.f(obj, jQ)).hashCode();
                    i3 = i + iG;
                    break;
                case 9:
                    i2 = i3 * 53;
                    Object objF = elf.f(obj, jQ);
                    if (objF != null) {
                        iHashCode = objF.hashCode();
                    }
                    i3 = i2 + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iG = elf.f(obj, jQ).hashCode();
                    i3 = i + iG;
                    break;
                case 11:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 12:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 13:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 14:
                    i = i3 * 53;
                    long jD4 = elf.d(obj, jQ);
                    Charset charset6 = ejn.a;
                    iG = a.g(jD4);
                    i3 = i + iG;
                    break;
                case 15:
                    i = i3 * 53;
                    iG = elf.c(obj, jQ);
                    i3 = i + iG;
                    break;
                case 16:
                    i = i3 * 53;
                    long jD5 = elf.d(obj, jQ);
                    Charset charset7 = ejn.a;
                    iG = a.g(jD5);
                    i3 = i + iG;
                    break;
                case 17:
                    i2 = i3 * 53;
                    Object objF2 = elf.f(obj, jQ);
                    if (objF2 != null) {
                        iHashCode = objF2.hashCode();
                    }
                    i3 = i2 + iHashCode;
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
                    i = i3 * 53;
                    iG = elf.f(obj, jQ).hashCode();
                    i3 = i + iG;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i = i3 * 53;
                    iG = elf.f(obj, jQ).hashCode();
                    i3 = i + iG;
                    break;
                case 51:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jDoubleToLongBits2 = Double.doubleToLongBits(k(obj, jQ));
                        Charset charset8 = ejn.a;
                        iG = a.g(jDoubleToLongBits2);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = Float.floatToIntBits(l(obj, jQ));
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jR = r(obj, jQ);
                        Charset charset9 = ejn.a;
                        iG = a.g(jR);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jR2 = r(obj, jQ);
                        Charset charset10 = ejn.a;
                        iG = a.g(jR2);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jR3 = r(obj, jQ);
                        Charset charset11 = ejn.a;
                        iG = a.g(jR3);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        boolean zN = N(obj, jQ);
                        Charset charset12 = ejn.a;
                        iG = a.f(zN);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = ((String) elf.f(obj, jQ)).hashCode();
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = elf.f(obj, jQ).hashCode();
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = elf.f(obj, jQ).hashCode();
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jR4 = r(obj, jQ);
                        Charset charset13 = ejn.a;
                        iG = a.g(jR4);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = n(obj, jQ);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        long jR5 = r(obj, jQ);
                        Charset charset14 = ejn.a;
                        iG = a.g(jR5);
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (M(obj, iM, i4)) {
                        i = i3 * 53;
                        iG = elf.f(obj, jQ).hashCode();
                        i3 = i + iG;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i3 * 53) + eky.d(obj).hashCode();
        return this.h ? (iHashCode2 * 53) + dtg.g(obj).hashCode() : iHashCode2;
    }

    @Override // defpackage.ekp
    public final Object c() {
        return ((eji) this.g).l();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    @Override // defpackage.ekp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = L(r8)
            if (r0 != 0) goto L8
            goto L90
        L8:
            boolean r0 = r8 instanceof defpackage.eji
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            eji r0 = (defpackage.eji) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.q(r2)
            r0.memoizedHashCode = r1
            r0.o()
        L1b:
            int[] r0 = r7.c
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L84
            int r2 = r7.p(r1)
            long r3 = q(r2)
            int r2 = r2 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = 9
            if (r2 == r5) goto L6e
            r5 = 60
            if (r2 == r5) goto L56
            r5 = 68
            if (r2 == r5) goto L56
            switch(r2) {
                case 17: goto L6e;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L81
        L3c:
            sun.misc.Unsafe r2 = defpackage.ekh.b
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L81
            r6 = r5
            ejz r6 = (defpackage.ejz) r6
            r6.c()
            r2.putObject(r8, r3, r5)
            goto L81
        L4e:
            ejm r2 = defpackage.dth.e(r8, r3)
            r2.b()
            goto L81
        L56:
            int r2 = r7.m(r1)
            boolean r2 = r7.M(r8, r2, r1)
            if (r2 == 0) goto L81
            ekp r2 = r7.t(r1)
            sun.misc.Unsafe r5 = defpackage.ekh.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
            goto L81
        L6e:
            boolean r2 = r7.I(r8, r1)
            if (r2 == 0) goto L81
            ekp r2 = r7.t(r1)
            sun.misc.Unsafe r5 = defpackage.ekh.b
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.d(r3)
        L81:
            int r1 = r1 + 3
            goto L1d
        L84:
            eky r0 = r7.m
            r0.c(r8)
            boolean r7 = r7.h
            if (r7 == 0) goto L90
            defpackage.dtg.i(r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.d(java.lang.Object):void");
    }

    @Override // defpackage.ekp
    public final void e(Object obj, Object obj2) {
        z(obj);
        obj2.getClass();
        for (int i = 0; i < this.c.length; i += 3) {
            int iP = p(i);
            long jQ = q(iP);
            int iM = m(i);
            switch ((iP >>> 20) & 255) {
                case 0:
                    if (I(obj2, i)) {
                        elf.n(obj, jQ, elf.a(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (I(obj2, i)) {
                        elf.o(obj, jQ, elf.b(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (I(obj2, i)) {
                        elf.q(obj, jQ, elf.d(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (I(obj2, i)) {
                        elf.q(obj, jQ, elf.d(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (I(obj2, i)) {
                        elf.q(obj, jQ, elf.d(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (I(obj2, i)) {
                        elf.j(obj, jQ, elf.t(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (I(obj2, i)) {
                        elf.r(obj, jQ, elf.f(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    A(obj, obj2, i);
                    break;
                case 10:
                    if (I(obj2, i)) {
                        elf.r(obj, jQ, elf.f(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (I(obj2, i)) {
                        elf.q(obj, jQ, elf.d(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (I(obj2, i)) {
                        elf.p(obj, jQ, elf.c(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (I(obj2, i)) {
                        elf.q(obj, jQ, elf.d(obj2, jQ));
                        C(obj, i);
                        break;
                    } else {
                        break;
                    }
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
                    ejm ejmVarE = dth.e(obj, jQ);
                    ejm ejmVarE2 = dth.e(obj2, jQ);
                    int size = ejmVarE.size();
                    int size2 = ejmVarE2.size();
                    if (size > 0 && size2 > 0) {
                        if (!ejmVarE.c()) {
                            ejmVarE = ejmVarE.d(size2 + size);
                        }
                        ejmVarE.addAll(ejmVarE2);
                    }
                    if (size > 0) {
                        ejmVarE2 = ejmVarE;
                    }
                    elf.r(obj, jQ, ejmVarE2);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Class cls = ekq.a;
                    elf.r(obj, jQ, dth.c(elf.f(obj, jQ), elf.f(obj2, jQ)));
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
                    if (M(obj2, iM, i)) {
                        elf.r(obj, jQ, elf.f(obj2, jQ));
                        D(obj, iM, i);
                        break;
                    } else {
                        break;
                    }
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
                    if (M(obj2, iM, i)) {
                        elf.r(obj, jQ, elf.f(obj2, jQ));
                        D(obj, iM, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    B(obj, obj2, i);
                    break;
            }
        }
        ekq.n(obj, obj2);
        if (this.h) {
            ekq.m(obj, obj2);
        }
    }

    @Override // defpackage.ekp
    public final boolean f(Object obj, Object obj2) {
        boolean zC;
        for (int i = 0; i < this.c.length; i += 3) {
            int iP = p(i);
            long jQ = q(iP);
            switch ((iP >>> 20) & 255) {
                case 0:
                    if (!G(obj, obj2, i) || Double.doubleToLongBits(elf.a(obj, jQ)) != Double.doubleToLongBits(elf.a(obj2, jQ))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!G(obj, obj2, i) || Float.floatToIntBits(elf.b(obj, jQ)) != Float.floatToIntBits(elf.b(obj2, jQ))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!G(obj, obj2, i) || elf.d(obj, jQ) != elf.d(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!G(obj, obj2, i) || elf.d(obj, jQ) != elf.d(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!G(obj, obj2, i) || elf.d(obj, jQ) != elf.d(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!G(obj, obj2, i) || elf.t(obj, jQ) != elf.t(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (G(obj, obj2, i)) {
                        Object objF = elf.f(obj, jQ);
                        Object objF2 = elf.f(obj2, jQ);
                        Class cls = ekq.a;
                        if (a.C(objF, objF2)) {
                            continue;
                        }
                    }
                    return false;
                case 9:
                    if (G(obj, obj2, i)) {
                        Object objF3 = elf.f(obj, jQ);
                        Object objF4 = elf.f(obj2, jQ);
                        Class cls2 = ekq.a;
                        if (a.C(objF3, objF4)) {
                            continue;
                        }
                    }
                    return false;
                case 10:
                    if (G(obj, obj2, i)) {
                        Object objF5 = elf.f(obj, jQ);
                        Object objF6 = elf.f(obj2, jQ);
                        Class cls3 = ekq.a;
                        if (a.C(objF5, objF6)) {
                            continue;
                        }
                    }
                    return false;
                case 11:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!G(obj, obj2, i) || elf.d(obj, jQ) != elf.d(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!G(obj, obj2, i) || elf.c(obj, jQ) != elf.c(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!G(obj, obj2, i) || elf.d(obj, jQ) != elf.d(obj2, jQ)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (G(obj, obj2, i)) {
                        Object objF7 = elf.f(obj, jQ);
                        Object objF8 = elf.f(obj2, jQ);
                        Class cls4 = ekq.a;
                        if (a.C(objF7, objF8)) {
                            continue;
                        }
                    }
                    return false;
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
                    Object objF9 = elf.f(obj, jQ);
                    Object objF10 = elf.f(obj2, jQ);
                    Class cls5 = ekq.a;
                    zC = a.C(objF9, objF10);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    Object objF11 = elf.f(obj, jQ);
                    Object objF12 = elf.f(obj2, jQ);
                    Class cls6 = ekq.a;
                    zC = a.C(objF11, objF12);
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
                case 60:
                case 61:
                case 62:
                case 63:
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long jO = o(i) & 1048575;
                    if (elf.c(obj, jO) == elf.c(obj2, jO)) {
                        Object objF13 = elf.f(obj, jQ);
                        Object objF14 = elf.f(obj2, jQ);
                        Class cls7 = ekq.a;
                        if (a.C(objF13, objF14)) {
                            continue;
                        }
                    }
                    return false;
                default:
            }
            if (!zC) {
                return false;
            }
        }
        if (!eky.d(obj).equals(eky.d(obj2))) {
            return false;
        }
        if (this.h) {
            return dtg.g(obj).equals(dtg.g(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    @Override // defpackage.ekp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.g(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06ed A[LOOP:4: B:236:0x06e9->B:238:0x06ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0011 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:369:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [ekh] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // defpackage.ekp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Object r21, defpackage.wld r22, defpackage.eja r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.h(java.lang.Object, wld, eja):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    @Override // defpackage.ekp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.Object r20, defpackage.erb r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekh.i(java.lang.Object, erb):void");
    }
}
