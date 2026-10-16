package h.a;

import androidx.camera.video.AudioStats;
import h.g.b.au;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import l.a.bgi;
import l.a.bgp;
import l.a.bhj;
import l.a.bis;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class i {
    public static /* synthetic */ int A(List list, int i2) {
        if (i2 >= 0 && i2 <= e(list)) {
            return e(list) - i2;
        }
        throw new IndexOutOfBoundsException("Element index " + i2 + " must be in range [" + new h.k.j(0, e(list)) + "].");
    }

    public static /* synthetic */ int B(List list, int i2) {
        return e(list) - i2;
    }

    public static /* synthetic */ int C(List list, int i2) {
        if (i2 >= 0 && i2 <= list.size()) {
            return list.size() - i2;
        }
        throw new IndexOutOfBoundsException("Position index " + i2 + " must be in range [" + new h.k.j(0, list.size()) + "].");
    }

    public static List D(List list) {
        h.g.b.x.f(list, "<this>");
        return new aq(list);
    }

    public static List E(List list) {
        h.g.b.x.f(list, "<this>");
        return new ao(list);
    }

    public static void F(List list) {
        h.g.b.x.f(list, "<this>");
        Collections.reverse(list);
    }

    public static double G(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        int i2 = 0;
        double dDoubleValue = AudioStats.AUDIO_AMPLITUDE_NONE;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
            i2++;
            if (i2 < 0) {
                o();
            }
        }
        if (i2 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i2;
    }

    public static int H(Iterable iterable, Object obj) {
        h.g.b.x.f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 < 0) {
                p();
            }
            if (h.g.b.x.n(obj, obj2)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int I(List list, Object obj) {
        h.g.b.x.f(list, "<this>");
        return list.indexOf(obj);
    }

    public static Comparable J(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable K(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float L(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Float M(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Object N(Iterable iterable, int i2) {
        h.g.b.x.f(iterable, "<this>");
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i2);
        }
        com.waze.c.e.u uVar = new com.waze.c.e.u(i2, 10);
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(uVar, "defaultValue");
        if (z) {
            List list = (List) iterable;
            return (i2 < 0 || i2 >= list.size()) ? uVar.invoke(Integer.valueOf(i2)) : list.get(i2);
        }
        if (i2 < 0) {
            return uVar.invoke(Integer.valueOf(i2));
        }
        int i3 = 0;
        for (Object obj : iterable) {
            int i4 = i3 + 1;
            if (i2 == i3) {
                return obj;
            }
            i3 = i4;
        }
        return uVar.invoke(Integer.valueOf(i2));
    }

    public static Object O(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (iterable instanceof List) {
            return P((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object P(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object Q(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
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

    public static Object R(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object S(List list, int i2) {
        h.g.b.x.f(list, "<this>");
        if (i2 < 0 || i2 >= list.size()) {
            return null;
        }
        return list.get(i2);
    }

    public static Object T(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        h.g.b.x.f(list, "<this>");
        return list.get(list.size() - 1);
    }

    public static Object U(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Object V(Collection collection, h.j.f fVar) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(fVar, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return N(collection, fVar.d(collection.size()));
    }

    public static Object W(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (iterable instanceof List) {
            return X((List) iterable);
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

    public static Object X(List list) {
        h.g.b.x.f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object Y(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static HashSet Z(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        HashSet hashSet = new HashSet(r.a(q(iterable, 12)));
        aT(iterable, hashSet);
        return hashSet;
    }

    public static final List a(List list) {
        h.g.b.x.f(list, "builder");
        return ((h.a.a.d) list).e();
    }

    public static int[] aA(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr[i2] = ((Number) it.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static long[] aB(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            jArr[i2] = ((Number) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static boolean[] aC(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        return zArr;
    }

    public static void aD(Collection collection, Iterable iterable) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(iterable, "elements");
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void aE(Collection collection, h.m.h hVar) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(hVar, "elements");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void aF(Collection collection, Object[] objArr) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(objArr, "elements");
        collection.addAll(c.i(objArr));
    }

    public static int aG(List list, int i2, h.g.a.l lVar) {
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(lVar, "comparison");
        be(list.size(), i2);
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int iIntValue = ((Number) lVar.invoke(list.get(i5))).intValue();
            if (iIntValue < 0) {
                i4 = i5 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static /* synthetic */ int aI(List list, Comparable comparable) {
        int size = list.size();
        h.g.b.x.f(list, "<this>");
        be(list.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int iA = h.b.a.a((Comparable) list.get(i4), comparable);
            if (iA < 0) {
                i3 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static List aJ(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        return aU(iterable, 2);
    }

    public static List aK(List list) {
        h.g.b.x.f(list, "<this>");
        return am(list, h.k.n.h(list.size() - 1, 0));
    }

    public static void aL(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, h.g.a.l lVar) throws IOException {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(appendable, "buffer");
        h.g.b.x.f(charSequence, "separator");
        h.g.b.x.f(charSequence2, "prefix");
        h.g.b.x.f(charSequence3, "postfix");
        h.g.b.x.f(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i3 = 0;
        for (Object obj : iterable) {
            i3++;
            if (i3 > 1) {
                appendable.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            } else {
                h.n.o.b(appendable, obj, lVar);
            }
        }
        if (i2 >= 0 && i3 > i2) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ String aM(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, h.g.a.l lVar, int i3) throws IOException {
        if ((i3 & 1) != 0) {
        }
        CharSequence charSequence4 = charSequence;
        if ((i3 & 2) != 0) {
        }
        CharSequence charSequence5 = charSequence2;
        if ((i3 & 4) != 0) {
        }
        CharSequence charSequence6 = charSequence3;
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        int i4 = i2;
        String str = (i3 & 16) != 0 ? "..." : null;
        h.g.a.l lVar2 = (i3 & 32) != 0 ? null : lVar;
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(charSequence4, "separator");
        h.g.b.x.f(charSequence5, "prefix");
        h.g.b.x.f(charSequence6, "postfix");
        h.g.b.x.f(str, "truncated");
        StringBuilder sb = new StringBuilder();
        aL(iterable, sb, charSequence4, charSequence5, charSequence6, i4, str, lVar2);
        return sb.toString();
    }

    public static void aN(Collection collection, Iterable iterable) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(iterable, "elements");
        collection.removeAll(y(iterable));
    }

    public static void aO(Collection collection, h.m.h hVar) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(hVar, "elements");
        List listJ = h.m.k.j(hVar);
        if (listJ.isEmpty()) {
            return;
        }
        collection.removeAll(listJ);
    }

    public static void aP(Collection collection, Object[] objArr) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(objArr, "elements");
        if (objArr.length == 0) {
            return;
        }
        collection.removeAll(c.i(objArr));
    }

    public static void aQ(List list, h.g.a.l lVar) {
        int iE;
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(lVar, "predicate");
        if (!(list instanceof RandomAccess)) {
            h.g.b.x.d(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            if ((list instanceof h.g.b.a.a) && !(list instanceof h.g.b.a.c)) {
                au.d(list, "kotlin.collections.MutableIterable");
            }
            try {
                bd(list, lVar, true);
                return;
            } catch (ClassCastException e2) {
                throw au.a(e2);
            }
        }
        int iE2 = e(list);
        int i2 = 0;
        if (iE2 >= 0) {
            int i3 = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) lVar.invoke(obj)).booleanValue()) {
                    if (i3 != i2) {
                        list.set(i3, obj);
                    }
                    i3++;
                }
                if (i2 == iE2) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = i3;
        }
        if (i2 >= list.size() || i2 > (iE = e(list))) {
            return;
        }
        while (true) {
            list.remove(iE);
            if (iE == i2) {
                return;
            } else {
                iE--;
            }
        }
    }

    public static void aR(Iterable iterable, h.g.a.l lVar) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(lVar, "predicate");
        bd(iterable, lVar, false);
    }

    public static final void aS(int i2, Object[] objArr) {
        h.g.b.x.f(objArr, "array");
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
    }

    public static void aT(Iterable iterable, Collection collection) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(collection, "destination");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static List aU(Iterable iterable, int i2) {
        h.g.b.x.f(iterable, "<this>");
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itAN = c.aN(iterable.iterator(), i2, true, false);
            while (itAN.hasNext()) {
                arrayList.add((List) itAN.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = h.k.n.i(2, size - i3);
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static /* synthetic */ void aV(Iterable iterable, Appendable appendable, CharSequence charSequence, h.g.a.l lVar, int i2) throws IOException {
        if ((i2 & 2) != 0) {
        }
        aL(iterable, appendable, charSequence, (i2 & 4) != 0 ? "" : null, (i2 & 8) != 0 ? "" : null, (i2 & 16) != 0 ? -1 : 0, (i2 & 32) != 0 ? "..." : null, (i2 & 64) != 0 ? null : lVar);
    }

    public static final void aW(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                e.a.h.ad.c(th, th2);
            }
        }
    }

    public static final byte[] aX(InputStream inputStream) throws IOException {
        h.g.b.x.f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        aY(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        h.g.b.x.e(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final void aY(InputStream inputStream, OutputStream outputStream) throws IOException {
        h.g.b.x.f(inputStream, "<this>");
        h.g.b.x.f(outputStream, "out");
        byte[] bArr = new byte[8192];
        int i2 = inputStream.read(bArr);
        while (i2 >= 0) {
            outputStream.write(bArr, 0, i2);
            i2 = inputStream.read(bArr);
        }
    }

    public static final /* synthetic */ com.waze.shared_infra.coordinators.c aZ(bgi bgiVar) {
        h.g.b.x.f(bgiVar, "builder");
        return new com.waze.shared_infra.coordinators.c(bgiVar);
    }

    public static List aa(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        return ao(at(iterable));
    }

    public static List ab(Iterable iterable, int i2) {
        ArrayList arrayList;
        Object objT;
        h.g.b.x.f(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Requested element count " + i2 + " is less than zero.");
        }
        if (i2 == 0) {
            return ao(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i2;
            if (size <= 0) {
                return h();
            }
            if (size == 1) {
                h.g.b.x.f(iterable, "<this>");
                if (iterable instanceof List) {
                    objT = T((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    objT = next;
                }
                return d(objT);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i2 < size2) {
                        arrayList.add(list.get(i2));
                        i2++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i2);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i3 = 0;
        for (Object obj : iterable) {
            if (i3 >= i2) {
                arrayList.add(obj);
            } else {
                i3++;
            }
        }
        return m(arrayList);
    }

    public static List ac(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(arrayList, "destination");
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ad(Iterable iterable, Iterable iterable2) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(iterable2, "elements");
        Collection collectionY = y(iterable2);
        if (collectionY.isEmpty()) {
            return ao(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionY.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List ae(Iterable iterable, Object obj) {
        h.g.b.x.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && h.g.b.x.n(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List af(Collection collection, Iterable iterable) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            aD(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static List ag(Collection collection, Object obj) {
        h.g.b.x.f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List ah(Collection collection, Object[] objArr) {
        h.g.b.x.f(collection, "<this>");
        h.g.b.x.f(objArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + objArr.length);
        arrayList.addAll(collection);
        aF(arrayList, objArr);
        return arrayList;
    }

    public static List ai(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return ao(iterable);
        }
        List listAp = ap(iterable);
        F(listAp);
        return listAp;
    }

    public static List aj(List list, h.k.j jVar) {
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(jVar, "indices");
        return jVar.isEmpty() ? h() : ao(list.subList(jVar.getStart().intValue(), jVar.getEndInclusive().intValue() + 1));
    }

    public static List ak(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listAp = ap(iterable);
            s(listAp);
            return listAp;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return ao(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        h.g.b.x.f(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return c.i(array);
    }

    public static List al(Iterable iterable, Comparator comparator) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listAp = ap(iterable);
            t(listAp, comparator);
            return listAp;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return ao(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        c.k(array, comparator);
        return c.i(array);
    }

    public static List am(Iterable iterable, int i2) {
        h.g.b.x.f(iterable, "<this>");
        if (i2 < 0) {
            throw new IllegalArgumentException("Requested element count " + i2 + " is less than zero.");
        }
        if (i2 == 0) {
            return h();
        }
        if (iterable instanceof Collection) {
            if (i2 >= ((Collection) iterable).size()) {
                return ao(iterable);
            }
            if (i2 == 1) {
                return d(O(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i2);
        Iterator it = iterable.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i3++;
            if (i3 == i2) {
                break;
            }
        }
        return m(arrayList);
    }

    public static List an(List list, int i2) {
        h.g.b.x.f(list, "<this>");
        if (i2 == 0) {
            return h();
        }
        int size = list.size();
        if (i2 >= size) {
            return ao(list);
        }
        if (i2 == 1) {
            return d(T(list));
        }
        int i3 = size - i2;
        ArrayList arrayList = new ArrayList(i2);
        if (list instanceof RandomAccess) {
            while (i3 < size) {
                arrayList.add(list.get(i3));
                i3++;
            }
        } else {
            ListIterator listIterator = list.listIterator(i3);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static List ao(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m(ap(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ac.f47967a;
        }
        if (size != 1) {
            h.g.b.x.f(collection, "<this>");
            return new ArrayList(collection);
        }
        List listSingletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        h.g.b.x.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List ap(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return aq((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        aT(iterable, arrayList);
        return arrayList;
    }

    public static List aq(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        return new ArrayList(collection);
    }

    public static List ar(Iterable iterable, Iterable iterable2) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(iterable2, "other");
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q(iterable, 10), q(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new h.k(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static Set as(Iterable iterable, Iterable iterable2) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(iterable2, "other");
        Collection collectionY = y(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionY.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static Set at(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        aT(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set au(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            aT(iterable, linkedHashSet);
            LinkedHashSet linkedHashSet2 = linkedHashSet;
            h.g.b.x.f(linkedHashSet2, "<this>");
            int size = linkedHashSet2.size();
            return size != 0 ? size != 1 ? linkedHashSet2 : e.c.d.a.o(linkedHashSet2.iterator().next()) : e.c.d.a.p();
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return e.c.d.a.p();
        }
        if (size2 == 1) {
            return e.c.d.a.o(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet3 = new LinkedHashSet(r.a(collection.size()));
        aT(iterable, linkedHashSet3);
        return linkedHashSet3;
    }

    public static h.m.h av(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        return new z(iterable, 0);
    }

    public static boolean aw(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static boolean ax(Iterable iterable, Object obj) {
        h.g.b.x.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : H(iterable, obj) >= 0;
    }

    public static double[] ay(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            dArr[i2] = ((Number) it.next()).doubleValue();
            i2++;
        }
        return dArr;
    }

    public static float[] az(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[i2] = ((Number) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    public static final List b() {
        return new h.a.a.d((byte[]) null);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c ba(bis bisVar) {
        h.g.b.x.f(bisVar, "builder");
        return new com.waze.shared_infra.s.c(bisVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c bb(bhj bhjVar) {
        h.g.b.x.f(bhjVar, "builder");
        return new com.waze.shared_infra.s.c(bhjVar);
    }

    public static final /* synthetic */ com.waze.shared_infra.s.c bc(bgp bgpVar) {
        h.g.b.x.f(bgpVar, "builder");
        return new com.waze.shared_infra.s.c(bgpVar);
    }

    private static boolean bd(Iterable iterable, h.g.a.l lVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    private static void be(int i2, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + i3 + ").");
        }
        if (i3 <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i2 + ").");
    }

    public static final List c(int i2) {
        return new h.a.a.d(i2);
    }

    public static final List d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        h.g.b.x.e(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static int e(List list) {
        h.g.b.x.f(list, "<this>");
        return list.size() - 1;
    }

    public static ArrayList f(Object... objArr) {
        h.g.b.x.f(objArr, "elements");
        return new ArrayList(g(objArr, true));
    }

    public static Collection g(Object[] objArr, boolean z) {
        h.g.b.x.f(objArr, "<this>");
        return new t(objArr, z);
    }

    public static List h() {
        return ac.f47967a;
    }

    public static List i(Object... objArr) {
        h.g.b.x.f(objArr, "elements");
        if (objArr.length <= 0) {
            return ac.f47967a;
        }
        h.g.b.x.f(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        h.g.b.x.e(listAsList, "asList(...)");
        return listAsList;
    }

    public static List j(Object obj) {
        return obj != null ? d(obj) : h();
    }

    public static List k(Object... objArr) {
        h.g.b.x.f(objArr, "elements");
        return c.R(objArr);
    }

    public static List l(Object... objArr) {
        h.g.b.x.f(objArr, "elements");
        return new ArrayList(g(objArr, true));
    }

    public static List m(List list) {
        h.g.b.x.f(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : d(list.get(0)) : h();
    }

    public static h.k.j n(Collection collection) {
        h.g.b.x.f(collection, "<this>");
        return new h.k.j(0, collection.size() - 1);
    }

    public static void o() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void p() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static int q(Iterable iterable, int i2) {
        h.g.b.x.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }

    public static List r(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aD(arrayList, (Iterable) it.next());
        }
        return arrayList;
    }

    public static void s(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static void t(List list, Comparator comparator) {
        h.g.b.x.f(list, "<this>");
        h.g.b.x.f(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    public static Object u(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static Object v(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object w(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(e(list));
    }

    public static Object x(List list) {
        h.g.b.x.f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(e(list));
    }

    public static Collection y(Iterable iterable) {
        h.g.b.x.f(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : ao(iterable);
    }

    public static boolean z(Iterable iterable, h.g.a.l lVar) {
        h.g.b.x.f(iterable, "<this>");
        h.g.b.x.f(lVar, "predicate");
        return bd(iterable, lVar, true);
    }
}
