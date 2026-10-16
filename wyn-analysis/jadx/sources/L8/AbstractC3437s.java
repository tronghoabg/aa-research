package l8;

import Va.M6;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import k8.C3203l;
import k8.InterfaceC3199h;
import k8.InterfaceC3202k;
import ka.AbstractC3256n;
import org.apache.tika.fork.ForkServer;

/* renamed from: l8.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3437s {
    public static int a(int i5) {
        if (i5 >= 3) {
            return i5 < 1073741824 ? (int) Math.ceil(i5 / 0.75d) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        d(i5, "expectedSize");
        return i5 + 1;
    }

    public static void b(int i5, Object[] objArr) {
        for (int i10 = 0; i10 < i5; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(AbstractC3256n.g(i10, "at index "));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void d(int i5, String str) {
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i5);
    }

    public static Object e(int i5) {
        if (i5 < 2 || i5 > 1073741824 || Integer.highestOneBit(i5) != i5) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "must be power of 2 between 2^1 and 2^30: "));
        }
        return i5 <= 256 ? new byte[i5] : i5 <= 65536 ? new short[i5] : new int[i5];
    }

    public static boolean f(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static o0 h(Set set, InterfaceC3202k interfaceC3202k) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof o0)) {
                set.getClass();
                return new o0(set, interfaceC3202k);
            }
            o0 o0Var = (o0) set;
            InterfaceC3202k interfaceC3202k2 = o0Var.f40151b;
            interfaceC3202k2.getClass();
            return new o0(o0Var.f40150a, new C3203l(Arrays.asList(interfaceC3202k2, interfaceC3202k)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof o0)) {
            set2.getClass();
            return new p0(set2, interfaceC3202k);
        }
        o0 o0Var2 = (o0) set2;
        InterfaceC3202k interfaceC3202k3 = o0Var2.f40151b;
        interfaceC3202k3.getClass();
        return new p0((SortedSet) o0Var2.f40150a, new C3203l(Arrays.asList(interfaceC3202k3, interfaceC3202k)));
    }

    public static Object i(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object j(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return M6.k(1, list);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 = ~(~(i5 + (next != null ? next.hashCode() : 0)));
        }
        return i5;
    }

    public static n0 l(AbstractC3414P abstractC3414P, AbstractC3414P abstractC3414P2) {
        Fe.e.t(abstractC3414P, "set1");
        Fe.e.t(abstractC3414P2, "set2");
        return new n0(abstractC3414P, abstractC3414P2, 1);
    }

    public static int m(int i5, int i10, int i11) {
        return (i5 & (~i11)) | (i10 & i11);
    }

    public static ArrayList n(Object... objArr) {
        int length = objArr.length;
        d(length, "arraySize");
        ArrayList arrayList = new ArrayList(S3.f.F(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static Set o() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static int p(Object obj, Object obj2, int i5, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i10;
        int i11;
        int iS = s(obj);
        int i12 = iS & i5;
        int iT = t(i12, obj3);
        if (iT != 0) {
            int i13 = ~i5;
            int i14 = iS & i13;
            int i15 = -1;
            while (true) {
                i10 = iT - 1;
                i11 = iArr[i10];
                if ((i11 & i13) == i14 && Fe.b.v(obj, objArr[i10]) && (objArr2 == null || Fe.b.v(obj2, objArr2[i10]))) {
                    break;
                }
                int i16 = i11 & i5;
                if (i16 == 0) {
                    break;
                }
                i15 = i10;
                iT = i16;
            }
            int i17 = i11 & i5;
            if (i15 == -1) {
                u(i12, i17, obj3);
                return i10;
            }
            iArr[i15] = m(iArr[i15], i17, i5);
            return i10;
        }
        return -1;
    }

    public static void q(List list, InterfaceC3202k interfaceC3202k, int i5, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (interfaceC3202k.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i5; i11--) {
            list.remove(i11);
        }
    }

    public static int r(int i5) {
        return (int) (Integer.rotateLeft((int) (i5 * (-862048943)), 15) * 461845907);
    }

    public static int s(Object obj) {
        return r(obj == null ? 0 : obj.hashCode());
    }

    public static int t(int i5, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i5] & ForkServer.ERROR : obj instanceof short[] ? ((short[]) obj)[i5] & 65535 : ((int[]) obj)[i5];
    }

    public static void u(int i5, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i5] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i5] = (short) i10;
        } else {
            ((int[]) obj)[i5] = i10;
        }
    }

    public static AbstractList v(List list, InterfaceC3199h interfaceC3199h) {
        return list instanceof RandomAccess ? new W(list, interfaceC3199h) : new X(list, interfaceC3199h);
    }
}
