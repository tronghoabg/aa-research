package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f18188a;

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f18189b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f18190c;

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f18191d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f18188a = cls;
        f18189b = w(false);
        f18190c = w(true);
        f18191d = new k0();
    }

    public static void A(int i5, List list, J j8) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j8.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((C1393j) j8.f18144a).G(i5, (C1390g) list.get(i10));
        }
    }

    public static void B(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                double dDoubleValue = ((Double) list.get(i10)).doubleValue();
                c1393j.getClass();
                c1393j.K(i5, Double.doubleToRawLongBits(dDoubleValue));
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 8;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.L(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    public static void C(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.M(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += C1393j.w(((Integer) list.get(i11)).intValue());
        }
        c1393j.T(iW);
        while (i10 < list.size()) {
            c1393j.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void D(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.I(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 4;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void E(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.K(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 8;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void F(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                float fFloatValue = ((Float) list.get(i10)).floatValue();
                c1393j.getClass();
                c1393j.I(i5, Float.floatToRawIntBits(fFloatValue));
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 4;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.J(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    public static void G(int i5, List list, J j8, InterfaceC1385b0 interfaceC1385b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j8.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            j8.b(i5, list.get(i10), interfaceC1385b0);
        }
    }

    public static void H(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.M(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iW = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iW += C1393j.w(((Integer) list.get(i11)).intValue());
        }
        c1393j.T(iW);
        while (i10 < list.size()) {
            c1393j.N(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void I(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.U(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += C1393j.A(((Long) list.get(i11)).longValue());
        }
        c1393j.T(iA);
        while (i10 < list.size()) {
            c1393j.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void J(int i5, List list, J j8, InterfaceC1385b0 interfaceC1385b0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j8.getClass();
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((C1393j) j8.f18144a).O(i5, (AbstractC1382a) list.get(i10), interfaceC1385b0);
        }
    }

    public static void K(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.I(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 4;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.J(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void L(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.K(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11 += 8;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.L(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static void M(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                c1393j.S(i5, (iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZ += C1393j.z((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        c1393j.T(iZ);
        while (i10 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            c1393j.T((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i10++;
        }
    }

    public static void N(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                c1393j.U(i5, (jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iA += C1393j.A((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        c1393j.T(iA);
        while (i10 < list.size()) {
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            c1393j.V((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i10++;
        }
    }

    public static void O(int i5, List list, J j8) throws C1392i {
        if (list == null || list.isEmpty()) {
            return;
        }
        j8.getClass();
        boolean z2 = list instanceof D;
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.P(i5, (String) list.get(i10));
                i10++;
            }
            return;
        }
        D d3 = (D) list;
        while (i10 < list.size()) {
            Object raw = d3.getRaw(i10);
            if (raw instanceof String) {
                c1393j.P(i5, (String) raw);
            } else {
                c1393j.G(i5, (C1390g) raw);
            }
            i10++;
        }
    }

    public static void P(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.S(i5, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iZ = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZ += C1393j.z(((Integer) list.get(i11)).intValue());
        }
        c1393j.T(iZ);
        while (i10 < list.size()) {
            c1393j.T(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    public static void Q(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.U(i5, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int iA = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iA += C1393j.A(((Long) list.get(i11)).longValue());
        }
        c1393j.T(iA);
        while (i10 < list.size()) {
            c1393j.V(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    public static int a(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C1393j.y(i5) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            iY += C1393j.s((C1390g) list.get(i10));
        }
        return iY;
    }

    public static int b(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1405w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iW = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iW += C1393j.w(((Integer) list.get(i5)).intValue());
        }
        return iW;
    }

    public static int d(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1393j.t(i5) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C1393j.u(i5) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1405w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iW = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iW += C1393j.w(((Integer) list.get(i5)).intValue());
        }
        return iW;
    }

    public static int j(int i5, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C1393j.y(i5) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iA += C1393j.A(((Long) list.get(i5)).longValue());
        }
        return iA;
    }

    public static int l(int i5, List list, InterfaceC1385b0 interfaceC1385b0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = C1393j.y(i5) * size;
        for (int i10 = 0; i10 < size; i10++) {
            int iB = ((AbstractC1382a) list.get(i10)).b(interfaceC1385b0);
            iY += C1393j.z(iB) + iB;
        }
        return iY;
    }

    public static int m(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof AbstractC1405w)) {
                int iZ = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    int iIntValue = ((Integer) list.get(i5)).intValue();
                    iZ += C1393j.z((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iZ;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof H)) {
                int iA = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    long jLongValue = ((Long) list.get(i5)).longValue();
                    iA += C1393j.A((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iA;
            }
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(int i5, List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = C1393j.y(i5) * size;
        if (!(list instanceof D)) {
            while (i10 < size) {
                Object obj = list.get(i10);
                iY = (obj instanceof C1390g ? C1393j.s((C1390g) obj) : C1393j.x((String) obj)) + iY;
                i10++;
            }
            return iY;
        }
        D d3 = (D) list;
        while (i10 < size) {
            Object raw = d3.getRaw(i10);
            iY = (raw instanceof C1390g ? C1393j.s((C1390g) raw) : C1393j.x((String) raw)) + iY;
            i10++;
        }
        return iY;
    }

    public static int r(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC1405w) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iZ += C1393j.z(((Integer) list.get(i5)).intValue());
        }
        return iZ;
    }

    public static int t(int i5, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C1393j.y(i5) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof H) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iA = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iA += C1393j.A(((Long) list.get(i5)).longValue());
        }
        return iA;
    }

    public static k0 w(boolean z2) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (k0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z2));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void x(k0 k0Var, AbstractC1404v abstractC1404v, AbstractC1404v abstractC1404v2) {
        k0Var.getClass();
        j0 j0Var = abstractC1404v.unknownFields;
        j0 j0Var2 = abstractC1404v2.unknownFields;
        if (!j0Var2.equals(j0.f18234f)) {
            int i5 = j0Var.f18235a + j0Var2.f18235a;
            int[] iArrCopyOf = Arrays.copyOf(j0Var.f18236b, i5);
            System.arraycopy(j0Var2.f18236b, 0, iArrCopyOf, j0Var.f18235a, j0Var2.f18235a);
            Object[] objArrCopyOf = Arrays.copyOf(j0Var.f18237c, i5);
            System.arraycopy(j0Var2.f18237c, 0, objArrCopyOf, j0Var.f18235a, j0Var2.f18235a);
            j0Var = new j0(i5, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC1404v.unknownFields = j0Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void z(int i5, List list, J j8, boolean z2) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C1393j c1393j = (C1393j) j8.f18144a;
        int i10 = 0;
        if (!z2) {
            while (i10 < list.size()) {
                c1393j.F(i5, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        c1393j.R(i5, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).getClass();
            Logger logger = C1393j.f18227h;
            i11++;
        }
        c1393j.T(i11);
        while (i10 < list.size()) {
            c1393j.D(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    public static Object v(int i5, List list, Object obj, k0 k0Var) {
        return obj;
    }
}
