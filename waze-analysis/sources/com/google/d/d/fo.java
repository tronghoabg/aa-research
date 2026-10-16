package com.google.d.d;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class fo {
    public static Map A(Map map, com.google.d.b.t tVar) {
        return new dt(map, new ec(tVar, 1));
    }

    static boolean B(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ArrayList C(Iterable iterable) {
        com.google.d.b.an.B(iterable);
        return iterable instanceof Collection ? new ArrayList((Collection) iterable) : D(iterable.iterator());
    }

    public static ArrayList D(Iterator it) {
        ArrayList arrayList = new ArrayList();
        com.google.d.b.an.B(it);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @SafeVarargs
    public static ArrayList E(Object... objArr) {
        int length = objArr.length;
        ah(length, "arraySize");
        ArrayList arrayList = new ArrayList(com.google.d.l.j.k(length + 5));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static List F(List list) {
        return list instanceof bn ? ((bn) list).a() : list instanceof df ? ((df) list).b() : list instanceof RandomAccess ? new dd(list) : new df(list);
    }

    public static List G(List list, com.google.d.b.t tVar) {
        return list instanceof RandomAccess ? new dh(list, tVar) : new dj(list, tVar);
    }

    public static Object H(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object I(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    static Object J(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator K(Iterator it, com.google.d.b.t tVar) {
        com.google.d.b.an.B(tVar);
        return new cw(it, tVar);
    }

    static void L(Iterator it) {
        com.google.d.b.an.B(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean M(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static Iterable N(Iterable iterable, int i2) {
        com.google.d.b.an.m(i2 >= 0, "limit is negative");
        return new cu(iterable, i2);
    }

    public static Iterable O(Iterable iterable, int i2) {
        com.google.d.b.an.m(i2 >= 0, "number to skip cannot be negative");
        return new ct(iterable, i2);
    }

    public static Object P(Iterable iterable, Object obj) {
        return I(iterable.iterator(), obj);
    }

    public static Object Q(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return iterable instanceof SortedSet ? ((SortedSet) iterable).last() : H(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return al(list);
    }

    static Object[] R(Iterable iterable) {
        return am(iterable).toArray();
    }

    static Object[] S(Iterable iterable, Object[] objArr) {
        return am(iterable).toArray(objArr);
    }

    public static Object T(Iterable iterable) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return null;
            }
            if (iterable instanceof List) {
                return al((List) iterable);
            }
            if (iterable instanceof SortedSet) {
                return ((SortedSet) iterable).last();
            }
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return H(it);
        }
        return null;
    }

    public static void U(Iterable iterable, com.google.d.b.ab abVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            com.google.d.b.an.B(abVar);
            ao((List) iterable, abVar);
            return;
        }
        Iterator it = iterable.iterator();
        com.google.d.b.an.B(abVar);
        while (it.hasNext()) {
            if (abVar.apply(it.next())) {
                it.remove();
            }
        }
    }

    static int V(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    static int W(Object obj) {
        return V(obj == null ? 0 : obj.hashCode());
    }

    static int X(int i2) {
        int iMax = Math.max(i2, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= iHighestOneBit) {
            return iHighestOneBit;
        }
        int i3 = iHighestOneBit + iHighestOneBit;
        if (i3 > 0) {
            return i3;
        }
        return 1073741824;
    }

    static int Y(int i2, int i3) {
        return i2 & (~i3);
    }

    static int Z(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        com.google.d.b.an.B(comparator);
        com.google.d.b.an.B(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = eo.f7570a;
            }
        } else {
            if (!(iterable instanceof fn)) {
                return false;
            }
            comparator2 = ((fn) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    static int aa(int i2) {
        return (i2 < 32 ? 4 : 2) * (i2 + 1);
    }

    static int ab(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iW = W(obj);
        int i5 = iW & i2;
        int iAc = ac(obj3, i5);
        if (iAc == 0) {
            return -1;
        }
        int iY = Y(iW, i2);
        int i6 = -1;
        while (true) {
            i3 = iAc - 1;
            int i7 = iArr[i3];
            i4 = i7 & i2;
            if (Y(i7, i2) == iY && Objects.equals(obj, objArr[i3]) && (objArr2 == null || Objects.equals(obj2, objArr2[i3]))) {
                break;
            }
            if (i4 == 0) {
                return -1;
            }
            i6 = i3;
            iAc = i4;
        }
        if (i6 == -1) {
            ae(obj3, i5, i4);
            return i3;
        }
        iArr[i6] = Z(iArr[i6], i4, i2);
        return i3;
    }

    static int ac(Object obj, int i2) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i2] : ((int[]) obj)[i2];
    }

    static Object ad(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i2);
    }

    static void ae(Object obj, int i2, int i3) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    static void af(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(String.valueOf(obj2))));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }

    static void ag(boolean z) {
        com.google.d.b.an.v(z, "no calls to next() since the last call to remove()");
    }

    static void ah(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    static boolean ai(Collection collection, Object obj) {
        com.google.d.b.an.B(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static void aj(boolean z, String str, Object obj) {
        if (!z) {
            throw new com.google.d.b.ar(com.google.d.b.an.d(str, obj));
        }
    }

    private static boolean ak(char c2) {
        if (c2 < 'a' || c2 > 'z') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    private static Object al(List list) {
        return list.get(list.size() - 1);
    }

    private static Collection am(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : D(iterable.iterator());
    }

    private static void an(List list, com.google.d.b.ab abVar, int i2, int i3) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i3) {
                break;
            } else if (abVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i3--;
            if (i3 < i2) {
                return;
            } else {
                list.remove(i3);
            }
        }
    }

    private static void ao(List list, com.google.d.b.ab abVar) {
        int i2 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            Object obj = list.get(i3);
            if (!abVar.apply(obj)) {
                if (i3 > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (IllegalArgumentException unused) {
                        an(list, abVar, i2, i3);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        an(list, abVar, i2, i3);
                        return;
                    }
                }
                i2++;
            }
        }
        list.subList(i2, list.size()).clear();
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static fl c(Set set, Set set2) {
        com.google.d.b.an.C(set, "set1");
        com.google.d.b.an.C(set2, "set2");
        return new fh(set, set2);
    }

    public static HashSet d(int i2) {
        return new HashSet(u(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set e(Set set, com.google.d.b.ab abVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof fi)) {
                com.google.d.b.an.B(set);
                return new fi(set, abVar);
            }
            fi fiVar = (fi) set;
            return new fi((Set) fiVar.f7407a, com.google.d.b.an.k(fiVar.f7408b, abVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof fi)) {
            com.google.d.b.an.B(sortedSet);
            return new fj(sortedSet, abVar);
        }
        fi fiVar2 = (fi) sortedSet;
        return new fj((SortedSet) fiVar2.f7407a, com.google.d.b.an.k(fiVar2.f7408b, abVar));
    }

    public static Set f() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set g() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    static boolean h(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static boolean i(Set set, Collection collection) {
        com.google.d.b.an.B(collection);
        if (collection instanceof em) {
            collection = ((em) collection).b();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return j(set, collection.iterator());
        }
        Iterator it = set.iterator();
        com.google.d.b.an.B(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    static boolean j(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static /* synthetic */ int k(byte b2) {
        return b2 & 255;
    }

    public static void l(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void m(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void n(String str) {
        if (!ak(str.charAt(0))) {
            throw new IllegalArgumentException("identifier must start with an ASCII letter: ".concat(str));
        }
        for (int i2 = 1; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!ak(cCharAt) && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_')) {
                throw new IllegalArgumentException("identifier must contain only ASCII letters, digits or underscore: ".concat(str));
            }
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str.concat(" must not be null"));
        }
    }

    static void p(dw dwVar, ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(dwVar.B().size());
        for (Map.Entry entry : dwVar.B().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    static void q(Object obj, int i2) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException("at index " + i2);
    }

    static void r(Object... objArr) {
        s(objArr, objArr.length);
    }

    static void s(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            q(objArr[i3], i3);
        }
    }

    public static dc t(dc dcVar, com.google.d.b.t tVar) {
        return new eg(dcVar, new ec(tVar, 0));
    }

    static int u(int i2) {
        if (i2 < 3) {
            ah(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) Math.ceil(i2 / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static com.google.d.b.t v(final dp dpVar) {
        com.google.d.b.an.B(dpVar);
        return new com.google.d.b.t() { // from class: com.google.d.d.dk
            @Override // com.google.d.b.t
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                dp dpVar2 = dpVar;
                com.google.d.b.an.B(dpVar2);
                com.google.d.b.an.B(entry);
                return new dn(entry, dpVar2);
            }
        };
    }

    static Object w(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static Object x(Map map, Object obj) {
        com.google.d.b.an.B(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String y(Map map) {
        int size = map.size();
        ah(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public static LinkedHashMap z(int i2) {
        return new LinkedHashMap(u(i2));
    }
}
