package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class abpm {
    public static final abpv a = new abpv();

    @Deprecated
    static int a(int i, abow abowVar, abpl abplVar) {
        int iNumberOfLeadingZeros = (352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6;
        return iNumberOfLeadingZeros + iNumberOfLeadingZeros + ((abmd) abowVar).e(abplVar);
    }

    static int b(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abnw)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue + iIntValue) ^ (iIntValue >> 31)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        abnw abnwVar = (abnw) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            int iE = abnwVar.e(i);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE + iE) ^ (iE >> 31)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int c(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abor)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue + jLongValue) ^ (jLongValue >> 63)) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        abor aborVar = (abor) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            long jA = aborVar.a(i);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jA + jA) ^ (jA >> 63)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abnw)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        abnw abnwVar = (abnw) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(abnwVar.e(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static Object e(Object obj, int i, List list, abob abobVar, Object obj2, abpv abpvVar) {
        if (abobVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!abobVar.a(iIntValue)) {
                    obj2 = k(obj, i, iIntValue, obj2);
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
            if (abobVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = k(obj, i, iIntValue2, obj2);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 4);
    }

    static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (((352 - (Integer.numberOfLeadingZeros(i << 3) * 9)) >>> 6) + 8);
    }

    public static /* synthetic */ int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abnw)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Integer) list.get(i)).intValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        abnw abnwVar = (abnw) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(abnwVar.e(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    public static /* synthetic */ int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof abor)) {
            int iNumberOfLeadingZeros = 0;
            while (i < size) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i)).longValue()) * 9)) >>> 6;
                i++;
            }
            return iNumberOfLeadingZeros;
        }
        abor aborVar = (abor) list;
        int iNumberOfLeadingZeros2 = 0;
        while (i < size) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(aborVar.a(i)) * 9)) >>> 6;
            i++;
        }
        return iNumberOfLeadingZeros2;
    }

    static void j(Object obj, Object obj2) {
        abnl abnlVar = ((abns) obj2).w;
        if (abnlVar.g()) {
            return;
        }
        abnl abnlVarI = ((abns) obj).i();
        abpq abpqVar = abnlVar.b;
        int size = abpqVar.size();
        for (int i = 0; i < size; i++) {
            abpn abpnVar = (abpn) abpqVar.a(i);
            abnu abnuVar = abpnVar.c;
            Object objB = abpnVar.a;
            boolean z = objB instanceof abol;
            if (abnuVar.d) {
                if (z) {
                    throw new IllegalStateException("Lazy fields can not be repeated");
                }
                Object objJ = abnlVarI.j(abnuVar);
                List list = (List) objB;
                int size2 = list.size();
                if (objJ == null) {
                    objJ = new ArrayList(size2);
                }
                List list2 = (List) objJ;
                for (int i2 = 0; i2 < size2; i2++) {
                    list2.add(abnl.c(list.get(i2)));
                }
                abnlVarI.b.d(abnuVar, objJ);
            } else if (abnuVar.a() == abqe.i) {
                Object objJ2 = abnlVarI.j(abnuVar);
                if (objJ2 == null) {
                    abnlVarI.b.d(abnuVar, abnl.c(objB));
                    if (z) {
                        abnlVarI.d = true;
                    }
                } else {
                    if (z) {
                        objB = ((abol) objB).b();
                    }
                    if (objJ2 instanceof abow) {
                        abov abovVarK = ((abow) objJ2).K();
                        abnu.b(abovVarK, objB);
                        abnlVarI.b.d(abnuVar, abovVarK.q());
                    } else {
                        abnu.b(objJ2, objB);
                    }
                }
            } else {
                if (z) {
                    throw new IllegalStateException("Lazy fields must be message-valued");
                }
                abnlVarI.b.d(abnuVar, abnl.c(objB));
            }
        }
    }

    static Object k(Object obj, int i, int i2, Object obj2) {
        if (obj2 == null) {
            obj2 = abpv.e(obj);
        }
        ((abpw) obj2).e(i << 3, Long.valueOf(i2));
        return obj2;
    }

    public static void l(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abmj)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).f(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            abndVar.v(i3);
            while (i2 < list.size()) {
                abndVar.d(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        abmj abmjVar = (abmj) list;
        if (!z) {
            while (i2 < abmjVar.b) {
                ((abnd) ldsVar.a).f(i, abmjVar.f(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abmjVar.b; i6++) {
            abmjVar.f(i6);
            i5++;
        }
        abndVar2.v(i5);
        while (i2 < abmjVar.b) {
            abndVar2.d(abmjVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void m(int i, List list, lds ldsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((abnd) ldsVar.a).g(i, (abms) list.get(i2));
        }
    }

    public static void n(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abne)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).J(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            abndVar.v(i3);
            while (i2 < list.size()) {
                abndVar.K(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        abne abneVar = (abne) list;
        if (!z) {
            while (i2 < abneVar.c) {
                ((abnd) ldsVar.a).J(i, abneVar.e(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abneVar.c; i6++) {
            abneVar.e(i6);
            i5 += 8;
        }
        abndVar2.v(i5);
        while (i2 < abneVar.c) {
            abndVar2.K(abneVar.e(i2));
            i2++;
        }
    }

    public static void o(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnn)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).L(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            abndVar.v(i3);
            while (i2 < list.size()) {
                abndVar.M(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        abnn abnnVar = (abnn) list;
        if (!z) {
            while (i2 < abnnVar.c) {
                ((abnd) ldsVar.a).L(i, abnnVar.e(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abnnVar.c; i6++) {
            abnnVar.e(i6);
            i5 += 4;
        }
        abndVar2.v(i5);
        while (i2 < abnnVar.c) {
            abndVar2.M(abnnVar.e(i2));
            i2++;
        }
    }

    public static void p(int i, List list, lds ldsVar, abpl abplVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ldsVar.w(i, list.get(i2), abplVar);
        }
    }

    public static void q(int i, List list, lds ldsVar, abpl abplVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ldsVar.z(i, list.get(i2), abplVar);
        }
    }

    public static void r(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnw)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ldsVar.a;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    ((abnd) obj).u(i, (iIntValue + iIntValue) ^ (iIntValue >> 31));
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros((iIntValue2 + iIntValue2) ^ (iIntValue2 >> 31)) * 9)) >>> 6;
            }
            abndVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                abndVar.v((iIntValue3 + iIntValue3) ^ (iIntValue3 >> 31));
                i2++;
            }
            return;
        }
        abnw abnwVar = (abnw) list;
        if (!z) {
            while (i2 < abnwVar.c) {
                Object obj2 = ldsVar.a;
                int iE = abnwVar.e(i2);
                ((abnd) obj2).u(i, (iE + iE) ^ (iE >> 31));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < abnwVar.c; i4++) {
            int iE2 = abnwVar.e(i4);
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros((iE2 + iE2) ^ (iE2 >> 31)) * 9)) >>> 6;
        }
        abndVar2.v(iNumberOfLeadingZeros2);
        while (i2 < abnwVar.c) {
            int iE3 = abnwVar.e(i2);
            abndVar2.v((iE3 + iE3) ^ (iE3 >> 31));
            i2++;
        }
    }

    public static void s(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abor)) {
            if (!z) {
                while (i2 < list.size()) {
                    Object obj = ldsVar.a;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    ((abnd) obj).w(i, (jLongValue + jLongValue) ^ (jLongValue >> 63));
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros((jLongValue2 + jLongValue2) ^ (jLongValue2 >> 63)) * 9)) >>> 6;
            }
            abndVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                abndVar.x((jLongValue3 + jLongValue3) ^ (jLongValue3 >> 63));
                i2++;
            }
            return;
        }
        abor aborVar = (abor) list;
        if (!z) {
            while (i2 < aborVar.c) {
                Object obj2 = ldsVar.a;
                long jA = aborVar.a(i2);
                ((abnd) obj2).w(i, (jA + jA) ^ (jA >> 63));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aborVar.c; i4++) {
            long jA2 = aborVar.a(i4);
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros((jA2 + jA2) ^ (jA2 >> 63)) * 9)) >>> 6;
        }
        abndVar2.v(iNumberOfLeadingZeros2);
        while (i2 < aborVar.c) {
            long jA3 = aborVar.a(i2);
            abndVar2.x((jA3 + jA3) ^ (jA3 >> 63));
            i2++;
        }
    }

    public static void t(int i, List list, lds ldsVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof aboq)) {
            while (i2 < list.size()) {
                ((abnd) ldsVar.a).r(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        aboq aboqVar = (aboq) list;
        while (i2 < list.size()) {
            Object objC = aboqVar.c();
            if (objC instanceof String) {
                ((abnd) ldsVar.a).r(i, (String) objC);
            } else {
                ((abnd) ldsVar.a).g(i, (abms) objC);
            }
            i2++;
        }
    }

    public static void u(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnw)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).u(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (352 - (Integer.numberOfLeadingZeros(((Integer) list.get(i3)).intValue()) * 9)) >>> 6;
            }
            abndVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                abndVar.v(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abnw abnwVar = (abnw) list;
        if (!z) {
            while (i2 < abnwVar.c) {
                ((abnd) ldsVar.a).u(i, abnwVar.e(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < abnwVar.c; i4++) {
            iNumberOfLeadingZeros2 += (352 - (Integer.numberOfLeadingZeros(abnwVar.e(i4)) * 9)) >>> 6;
        }
        abndVar2.v(iNumberOfLeadingZeros2);
        while (i2 < abnwVar.c) {
            abndVar2.v(abnwVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void v(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnw)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int iF = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iF += abnd.F(((Integer) list.get(i3)).intValue());
            }
            abndVar.v(iF);
            while (i2 < list.size()) {
                abndVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abnw abnwVar = (abnw) list;
        if (!z) {
            while (i2 < abnwVar.c) {
                ((abnd) ldsVar.a).m(i, abnwVar.e(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int iNumberOfLeadingZeros = 0;
        for (int i4 = 0; i4 < abnwVar.c; i4++) {
            iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(abnwVar.e(i4)) * 9)) >>> 6;
        }
        abndVar2.v(iNumberOfLeadingZeros);
        while (i2 < abnwVar.c) {
            abndVar2.n(abnwVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void w(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abnw)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).i(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            abndVar.v(i3);
            while (i2 < list.size()) {
                abndVar.j(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        abnw abnwVar = (abnw) list;
        if (!z) {
            while (i2 < abnwVar.c) {
                ((abnd) ldsVar.a).i(i, abnwVar.e(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < abnwVar.c; i6++) {
            abnwVar.e(i6);
            i5 += 4;
        }
        abndVar2.v(i5);
        while (i2 < abnwVar.c) {
            abndVar2.j(abnwVar.e(i2));
            i2++;
        }
    }

    public static /* synthetic */ void x(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abor)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).k(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            abndVar.v(i3);
            while (i2 < list.size()) {
                abndVar.l(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abor aborVar = (abor) list;
        if (!z) {
            while (i2 < aborVar.c) {
                ((abnd) ldsVar.a).k(i, aborVar.a(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < aborVar.c; i6++) {
            aborVar.a(i6);
            i5 += 8;
        }
        abndVar2.v(i5);
        while (i2 < aborVar.c) {
            abndVar2.l(aborVar.a(i2));
            i2++;
        }
    }

    public static /* synthetic */ void y(int i, List list, lds ldsVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof abor)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((abnd) ldsVar.a).w(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abnd abndVar = (abnd) ldsVar.a;
            abndVar.t(i, 2);
            int iNumberOfLeadingZeros = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iNumberOfLeadingZeros += (640 - (Long.numberOfLeadingZeros(((Long) list.get(i3)).longValue()) * 9)) >>> 6;
            }
            abndVar.v(iNumberOfLeadingZeros);
            while (i2 < list.size()) {
                abndVar.x(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        abor aborVar = (abor) list;
        if (!z) {
            while (i2 < aborVar.c) {
                ((abnd) ldsVar.a).w(i, aborVar.a(i2));
                i2++;
            }
            return;
        }
        abnd abndVar2 = (abnd) ldsVar.a;
        abndVar2.t(i, 2);
        int iNumberOfLeadingZeros2 = 0;
        for (int i4 = 0; i4 < aborVar.c; i4++) {
            iNumberOfLeadingZeros2 += (640 - (Long.numberOfLeadingZeros(aborVar.a(i4)) * 9)) >>> 6;
        }
        abndVar2.v(iNumberOfLeadingZeros2);
        while (i2 < aborVar.c) {
            abndVar2.x(aborVar.a(i2));
            i2++;
        }
    }
}
