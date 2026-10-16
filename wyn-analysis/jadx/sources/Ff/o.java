package ff;

import A7.AbstractC0279p0;
import Va.M6;
import ef.C2527k;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import vf.AbstractC4345a;

/* loaded from: classes5.dex */
public abstract class o extends t {
    public static ArrayList A0(Iterable iterable, Object obj) {
        AbstractC3340k.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList(p.a0(iterable, 10));
        boolean z2 = false;
        for (Object obj2 : iterable) {
            boolean z10 = true;
            if (!z2 && AbstractC3340k.a(obj2, obj)) {
                z2 = true;
                z10 = false;
            }
            if (z10) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List B0(Iterable iterable, Iterable iterable2) {
        AbstractC3340k.e(iterable, "<this>");
        Collection collectionG0 = t.g0(iterable2);
        if (collectionG0.isEmpty()) {
            return S0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionG0.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList C0(Iterable iterable, Iterable elements) {
        AbstractC3340k.e(iterable, "<this>");
        AbstractC3340k.e(elements, "elements");
        if (iterable instanceof Collection) {
            return E0(elements, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        t.e0(iterable, arrayList);
        t.e0(elements, arrayList);
        return arrayList;
    }

    public static ArrayList D0(Iterable iterable, Object obj) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return F0((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        t.e0(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList E0(Iterable elements, Collection collection) {
        AbstractC3340k.e(collection, "<this>");
        AbstractC3340k.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            t.e0(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList F0(Collection collection, Object obj) {
        AbstractC3340k.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List G0(List list) {
        AbstractC3340k.e(list, "<this>");
        if ((list instanceof Collection) && list.size() <= 1) {
            return S0(list);
        }
        List listV0 = V0(list);
        Collections.reverse(listV0);
        return listV0;
    }

    public static Object H0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return I0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object I0(List list) {
        AbstractC3340k.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object J0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object K0(List list) {
        AbstractC3340k.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List L0(AbstractList abstractList) {
        AbstractC3340k.e(abstractList, "<this>");
        if (abstractList.size() <= 1) {
            return S0(abstractList);
        }
        Object[] array = abstractList.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        AbstractC3340k.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return m.c0(array);
    }

    public static List M0(Comparator comparator, Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listV0 = V0(iterable);
            s.d0(listV0, comparator);
            return listV0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return S0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC3340k.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return m.c0(array);
    }

    public static List N0(Iterable iterable, int i5) {
        AbstractC3340k.e(iterable, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested element count ", " is less than zero.").toString());
        }
        if (i5 == 0) {
            return v.f35432a;
        }
        if (iterable instanceof Collection) {
            if (i5 >= ((Collection) iterable).size()) {
                return S0(iterable);
            }
            if (i5 == 1) {
                return AbstractC3935e.C(p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i5);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i5) {
                break;
            }
        }
        return AbstractC3935e.I(arrayList);
    }

    public static List O0(int i5, List list) {
        AbstractC3340k.e(list, "<this>");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Requested element count ", " is less than zero.").toString());
        }
        if (i5 == 0) {
            return v.f35432a;
        }
        int size = list.size();
        if (i5 >= size) {
            return S0(list);
        }
        if (i5 == 1) {
            return AbstractC3935e.C(y0(list));
        }
        ArrayList arrayList = new ArrayList(i5);
        if (list instanceof RandomAccess) {
            for (int i10 = size - i5; i10 < size; i10++) {
                arrayList.add(list.get(i10));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i5);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static byte[] P0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            bArr[i5] = ((Number) it.next()).byteValue();
            i5++;
        }
        return bArr;
    }

    public static final void Q0(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC3340k.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] R0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = ((Number) it.next()).intValue();
            i5++;
        }
        return iArr;
    }

    public static List S0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return AbstractC3935e.I(V0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return v.f35432a;
        }
        if (size != 1) {
            return U0(collection);
        }
        return AbstractC3935e.C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static long[] T0(List list) {
        AbstractC3340k.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it = list.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr[i5] = ((Number) it.next()).longValue();
            i5++;
        }
        return jArr;
    }

    public static ArrayList U0(Collection collection) {
        AbstractC3340k.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List V0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return U0((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        Q0(iterable, arrayList);
        return arrayList;
    }

    public static Set W0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Q0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set X0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        boolean z2 = iterable instanceof Collection;
        x xVar = x.f35434a;
        if (z2) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return tg.b.P(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC2641B.D(collection.size()));
                Q0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Q0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : tg.b.P(linkedHashSet2.iterator().next());
            }
        }
        return xVar;
    }

    public static Af.t Y0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        return new Af.t(new Af.q(iterable, 28), 3);
    }

    public static ArrayList Z0(Iterable iterable, Iterable other) {
        AbstractC3340k.e(iterable, "<this>");
        AbstractC3340k.e(other, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(p.a0(iterable, 10), p.a0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new C2527k(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int h0(int i5, List list) {
        if (i5 >= 0 && i5 <= AbstractC3935e.z(list)) {
            return AbstractC3935e.z(list) - i5;
        }
        StringBuilder sbL = pd.f.l(i5, "Element index ", " must be in range [");
        sbL.append(new zf.g(0, AbstractC3935e.z(list), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static final int i0(int i5, List list) {
        if (i5 >= 0 && i5 <= list.size()) {
            return list.size() - i5;
        }
        StringBuilder sbL = pd.f.l(i5, "Position index ", " must be in range [");
        sbL.append(new zf.g(0, list.size(), 1));
        sbL.append("].");
        throw new IndexOutOfBoundsException(sbL.toString());
    }

    public static Af.o j0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        return new Af.o(iterable, 5);
    }

    public static boolean k0(Iterable iterable, Object obj) {
        int iIndexOf;
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    iIndexOf = -1;
                    break;
                }
                Object next = it.next();
                if (i5 < 0) {
                    AbstractC3935e.P();
                    throw null;
                }
                if (AbstractC3340k.a(obj, next)) {
                    iIndexOf = i5;
                    break;
                }
                i5++;
            }
        } else {
            iIndexOf = ((List) iterable).indexOf(obj);
        }
        return iIndexOf >= 0;
    }

    public static List l0(Iterable iterable) {
        ArrayList arrayList;
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - 1;
            if (size <= 0) {
                return v.f35432a;
            }
            if (size == 1) {
                return AbstractC3935e.C(x0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    for (int i5 = 1; i5 < size2; i5++) {
                        arrayList.add(list.get(i5));
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(1);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj : iterable) {
            if (i10 >= 1) {
                arrayList.add(obj);
            } else {
                i10++;
            }
        }
        return AbstractC3935e.I(arrayList);
    }

    public static List m0(List list) {
        AbstractC3340k.e(list, "<this>");
        List list2 = list;
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return N0(list2, size);
    }

    public static ArrayList n0(Iterable iterable, tf.l lVar) {
        AbstractC3340k.e(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList o0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object p0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object q0(List list) {
        AbstractC3340k.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object r0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object s0(List list) {
        AbstractC3340k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object t0(int i5, List list) {
        AbstractC3340k.e(list, "<this>");
        if (i5 < 0 || i5 >= list.size()) {
            return null;
        }
        return list.get(i5);
    }

    public static final void u0(Iterable iterable, StringBuilder buffer, CharSequence charSequence, CharSequence prefix, CharSequence postfix, CharSequence charSequence2, tf.l lVar) {
        AbstractC3340k.e(iterable, "<this>");
        AbstractC3340k.e(buffer, "buffer");
        AbstractC3340k.e(prefix, "prefix");
        AbstractC3340k.e(postfix, "postfix");
        buffer.append(prefix);
        int i5 = 0;
        for (Object obj : iterable) {
            i5++;
            if (i5 > 1) {
                buffer.append(charSequence);
            }
            AbstractC4345a.i(buffer, obj, lVar);
        }
        buffer.append(postfix);
    }

    public static /* synthetic */ void v0(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, tf.l lVar, int i5) {
        if ((i5 & 4) != 0) {
            str2 = "";
        }
        if ((i5 & 8) != 0) {
            str3 = "";
        }
        if ((i5 & 64) != 0) {
            lVar = null;
        }
        u0(iterable, sb2, str, str2, str3, "...", lVar);
    }

    public static String w0(Iterable iterable, String str, String str2, String str3, tf.l lVar, int i5) {
        if ((i5 & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String prefix = (i5 & 2) != 0 ? "" : str2;
        String str5 = (i5 & 4) != 0 ? "" : str3;
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        AbstractC3340k.e(iterable, "<this>");
        AbstractC3340k.e(prefix, "prefix");
        StringBuilder sb2 = new StringBuilder();
        u0(iterable, sb2, str4, prefix, str5, "...", lVar);
        return sb2.toString();
    }

    public static Object x0(Iterable iterable) {
        AbstractC3340k.e(iterable, "<this>");
        if (iterable instanceof List) {
            return y0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object y0(List list) {
        AbstractC3340k.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(AbstractC3935e.z(list));
    }

    public static Object z0(List list) {
        AbstractC3340k.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return M6.k(1, list);
    }
}
