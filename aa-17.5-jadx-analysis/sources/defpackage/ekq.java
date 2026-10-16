package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class ekq {
    public static final Class a;
    public static final eky b;
    public static final eky c;

    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = eig.a;
        eky ekyVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                ekyVar = (eky) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = ekyVar;
        c = new eky();
    }

    @Deprecated
    static int a(int i, eke ekeVar, ekp ekpVar) {
        boolean z = eiw.e;
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return iNumberOfLeadingZeros + iNumberOfLeadingZeros + ((eie) ekeVar).c(ekpVar);
    }

    static int b(eie eieVar, ekp ekpVar) {
        int iC = eieVar.c(ekpVar);
        boolean z = eiw.e;
        return ((352 - (Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    static int c(int i, Object obj, ekp ekpVar) {
        int iNumberOfLeadingZeros;
        int iB;
        if (obj instanceof ejs) {
            boolean z = eiw.e;
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
            iB = ((ejs) obj).a();
        } else {
            boolean z2 = eiw.e;
            iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i << 3) * 9;
            iB = b((eie) obj, ekpVar);
        }
        return ((352 - iNumberOfLeadingZeros) >>> 6) + iB;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ejj)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                boolean z = eiw.e;
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        ejj ejjVar = (ejj) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            int iE = ejjVar.e(i);
            boolean z2 = eiw.e;
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE + iE) ^ (iE >> 31)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ejv)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                boolean z = eiw.e;
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        ejv ejvVar = (ejv) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            long jE = ejvVar.e(i);
            boolean z2 = eiw.e;
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jE + jE) ^ (jE >> 63)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ejj)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                boolean z = eiw.e;
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(iIntValue) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        ejj ejjVar = (ejj) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            int iE = ejjVar.e(i);
            boolean z2 = eiw.e;
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(iE) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static Object g(Object obj, int i, List list, ejl ejlVar, Object obj2, eky ekyVar) {
        if (ejlVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!ejlVar.a()) {
                    obj2 = h(obj, i, iIntValue, obj2, ekyVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (ejlVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, ekyVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, eky ekyVar) {
        if (obj2 == null) {
            obj2 = ekyVar.a(obj);
        }
        ekyVar.b(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        boolean z = eiw.e;
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        boolean z = eiw.e;
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ejj)) {
            int I = 0;
            while (i < size) {
                I += eiw.I(((Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        ejj ejjVar = (ejj) list;
        int I2 = 0;
        while (i < size) {
            I2 += eiw.I(ejjVar.e(i));
            i++;
        }
        return I2;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof ejv)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                boolean z = eiw.e;
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(jLongValue) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        ejv ejvVar = (ejv) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            long jE = ejvVar.e(i);
            boolean z2 = eiw.e;
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(jE) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static void m(Object obj, Object obj2) {
        ejc ejcVarG = dtg.g(obj2);
        if (ejcVarG.g()) {
            return;
        }
        ejc ejcVarH = dtg.h(obj);
        ekv ekvVar = ejcVarG.b;
        int i = ekvVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ejcVarH.e(ekvVar.d(i2));
        }
        Iterator it = ekvVar.a().iterator();
        while (it.hasNext()) {
            ejcVarH.e((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        ekz ekzVarD = eky.d(obj);
        ekz ekzVarD2 = eky.d(obj2);
        ekz ekzVar = ekz.a;
        if (!ekzVar.equals(ekzVarD2)) {
            if (ekzVar.equals(ekzVarD)) {
                int i = ekzVarD.b + ekzVarD2.b;
                int[] iArrCopyOf = Arrays.copyOf(ekzVarD.c, i);
                System.arraycopy(ekzVarD2.c, 0, iArrCopyOf, ekzVarD.b, ekzVarD2.b);
                Object[] objArrCopyOf = Arrays.copyOf(ekzVarD.d, i);
                System.arraycopy(ekzVarD2.d, 0, objArrCopyOf, ekzVarD.b, ekzVarD2.b);
                ekzVarD = new ekz(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!ekzVarD2.equals(ekzVar)) {
                ekzVarD.b();
                int i2 = ekzVarD.b + ekzVarD2.b;
                ekzVarD.c(i2);
                System.arraycopy(ekzVarD2.c, 0, ekzVarD.c, ekzVarD.b, ekzVarD2.b);
                System.arraycopy(ekzVarD2.d, 0, ekzVarD.d, ekzVarD.b, ekzVarD2.b);
                ekzVarD.b = i2;
            }
        }
        eky.e(obj, ekzVarD);
    }

    public static void o(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eih)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).j(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            eiwVar.z(i3);
            while (i2 < list.size()) {
                eiwVar.i(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        eih eihVar = (eih) list;
        if (!z) {
            while (i2 < eihVar.a) {
                ((eiw) erbVar.a).j(i, eihVar.f(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eihVar.a; i6++) {
            eihVar.f(i6);
            i5++;
        }
        eiwVar2.z(i5);
        while (i2 < eihVar.a) {
            eiwVar2.i(eihVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eix)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).R(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            eiwVar.z(i3);
            while (i2 < list.size()) {
                eiwVar.S(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        eix eixVar = (eix) list;
        if (!z) {
            while (i2 < eixVar.a) {
                ((eiw) erbVar.a).R(i, eixVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < eixVar.a; i6++) {
            eixVar.e(i6);
            i5 += 8;
        }
        eiwVar2.z(i5);
        while (i2 < eixVar.a) {
            eiwVar2.S(eixVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof eje)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).T(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            eiwVar.z(i3);
            while (i2 < list.size()) {
                eiwVar.U(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        eje ejeVar = (eje) list;
        if (!z) {
            while (i2 < ejeVar.a) {
                ((eiw) erbVar.a).T(i, ejeVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ejeVar.a; i6++) {
            ejeVar.e(i6);
            i5 += 4;
        }
        eiwVar2.z(i5);
        while (i2 < ejeVar.a) {
            eiwVar2.U(ejeVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejj)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = erbVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((eiw) obj).y(i, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            eiwVar.z(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                eiwVar.z((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        ejj ejjVar = (ejj) list;
        if (!z) {
            while (i2 < ejjVar.a) {
                Object obj2 = erbVar.a;
                int iE = ejjVar.e(i2);
                ((eiw) obj2).y(i, (iE + iE) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ejjVar.a; i4++) {
            int iE2 = ejjVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE2 + iE2) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        eiwVar2.z(iNumberOfLeadingZeros2);
        while (i2 < ejjVar.a) {
            int iE3 = ejjVar.e(i2);
            eiwVar2.z((iE3 + iE3) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void s(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejv)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = erbVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((eiw) obj).A(i, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            eiwVar.z(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                eiwVar.B((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        ejv ejvVar = (ejv) list;
        if (!z) {
            while (i2 < ejvVar.a) {
                Object obj2 = erbVar.a;
                long jE = ejvVar.e(i2);
                ((eiw) obj2).A(i, (jE + jE) ^ (jE >> 63));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ejvVar.a; i4++) {
            long jE2 = ejvVar.e(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jE2 + jE2) ^ (jE2 >> 63)) * 9)) >>> 6;
        }
        eiwVar2.z(iNumberOfLeadingZeros2);
        while (i2 < ejvVar.a) {
            long jE3 = ejvVar.e(i2);
            eiwVar2.B((jE3 + jE3) ^ (jE3 >> 63));
            i2++;
        }
    }

    public static void t(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejj)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            eiwVar.z(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                eiwVar.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ejj ejjVar = (ejj) list;
        if (!z) {
            while (i2 < ejjVar.a) {
                ((eiw) erbVar.a).y(i, ejjVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ejjVar.a; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(ejjVar.e(i4)) * 9)) >>> 6;
        }
        eiwVar2.z(iNumberOfLeadingZeros2);
        while (i2 < ejjVar.a) {
            eiwVar2.z(ejjVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void u(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejj)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += eiw.I(((Integer) list.get(i3)).intValue());
            }
            eiwVar.z(I);
            while (i2 < list.size()) {
                eiwVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ejj ejjVar = (ejj) list;
        if (!z) {
            while (i2 < ejjVar.a) {
                ((eiw) erbVar.a).q(i, ejjVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < ejjVar.a; i4++) {
            I2 += eiw.I(ejjVar.e(i4));
        }
        eiwVar2.z(I2);
        while (i2 < ejjVar.a) {
            eiwVar2.r(ejjVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejj)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            eiwVar.z(i3);
            while (i2 < list.size()) {
                eiwVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        ejj ejjVar = (ejj) list;
        if (!z) {
            while (i2 < ejjVar.a) {
                ((eiw) erbVar.a).m(i, ejjVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ejjVar.a; i6++) {
            ejjVar.e(i6);
            i5 += 4;
        }
        eiwVar2.z(i5);
        while (i2 < ejjVar.a) {
            eiwVar2.n(ejjVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void w(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejv)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            eiwVar.z(i3);
            while (i2 < list.size()) {
                eiwVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ejv ejvVar = (ejv) list;
        if (!z) {
            while (i2 < ejvVar.a) {
                ((eiw) erbVar.a).o(i, ejvVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ejvVar.a; i6++) {
            ejvVar.e(i6);
            i5 += 8;
        }
        eiwVar2.z(i5);
        while (i2 < ejvVar.a) {
            eiwVar2.p(ejvVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void x(int i, List list, erb erbVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ejv)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((eiw) erbVar.a).A(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            eiw eiwVar = (eiw) erbVar.a;
            eiwVar.x(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            eiwVar.z(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                eiwVar.B(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ejv ejvVar = (ejv) list;
        if (!z) {
            while (i2 < ejvVar.a) {
                ((eiw) erbVar.a).A(i, ejvVar.e(i2));
                i2++;
            }
            return;
        }
        eiw eiwVar2 = (eiw) erbVar.a;
        eiwVar2.x(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < ejvVar.a; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(ejvVar.e(i4)) * 9)) >>> 6;
        }
        eiwVar2.z(iNumberOfLeadingZeros2);
        while (i2 < ejvVar.a) {
            eiwVar2.B(ejvVar.e(i2));
            i2++;
        }
    }
}
