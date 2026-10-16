package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afga {
    private afga() {
    }

    public static java.lang.Object A(java.lang.Object obj, java.lang.Object obj2, java.util.Comparator comparator) {
        comparator.getClass();
        return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
    }

    public static int B(int i) {
        if (i <= 0) {
            i = 1;
        }
        return java.lang.Integer.highestOneBit(i * 3);
    }

    public static int C(java.lang.Object[] objArr, int i, int i2) {
        int iHashCode = 1;
        for (int i3 = 0; i3 < i2; i3++) {
            java.lang.Object obj = objArr[i + i3];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static java.lang.String D(java.lang.Object[] objArr, int i, int i2, java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i + i3];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void E(java.lang.Object[] objArr, int i) {
        objArr.getClass();
        objArr[i] = null;
    }

    public static void F(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            E(objArr, i);
            i++;
        }
    }

    public static boolean G(java.lang.Object[] objArr, int i, int i2, java.util.List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!f(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static java.util.Set H(java.util.Set set) {
        ((defpackage.afde) set).b.e();
        return ((defpackage.afbw) set).size() > 0 ? set : defpackage.afde.a;
    }

    public static java.util.Set I(java.lang.Object obj) {
        java.util.Set setSingleton = java.util.Collections.singleton(obj);
        setSingleton.getClass();
        return setSingleton;
    }

    public static java.util.Set J(java.lang.Object... objArr) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(objArr.length));
        cu(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static java.util.Set K(java.util.Set set, java.lang.Iterable iterable) {
        set.getClass();
        iterable.getClass();
        java.util.Collection<?> collectionAp = ap(iterable);
        if (collectionAp.isEmpty()) {
            return bf(set);
        }
        if (!(collectionAp instanceof java.util.Set)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(set);
            linkedHashSet.removeAll(collectionAp);
            return linkedHashSet;
        }
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        for (java.lang.Object obj : set) {
            if (!((java.util.Set) collectionAp).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static java.util.Set L(java.util.Set set, java.lang.Object obj) {
        set.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(set.size()));
        boolean z = false;
        for (java.lang.Object obj2 : set) {
            boolean z2 = true;
            if (!z && f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set M(java.util.Set set, java.lang.Iterable iterable) {
        int size;
        set.getClass();
        iterable.getClass();
        java.lang.Integer numValueOf = iterable instanceof java.util.Collection ? java.lang.Integer.valueOf(((java.util.Collection) iterable).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            int size2 = set.size();
            size = size2 + size2;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(size));
        linkedHashSet.addAll(set);
        bk(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static java.util.Set N(java.util.Set set, java.lang.Object obj) {
        set.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static java.lang.Object O(java.util.Map map, java.lang.Object obj) {
        if (map instanceof afcl) {
            return ((afcl) map).a();
        }
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException(defpackage.a.bl(obj, "Key ", " is missing in the map."));
    }

    public static int P(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i >= 1073741824) {
            return Integer.MAX_VALUE;
        }
        return (int) ((i / 0.75f) + 1.0f);
    }

    public static java.util.Map Q(defpackage.afau afauVar) {
        afauVar.getClass();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(afauVar.a, afauVar.b);
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static java.util.SortedMap R(java.util.Map map, java.util.Comparator comparator) {
        java.util.TreeMap treeMap = new java.util.TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }

    public static java.lang.Object S(java.util.Map map, java.lang.Object obj) {
        map.getClass();
        return O(map, obj);
    }

    public static java.util.HashMap T(defpackage.afau... afauVarArr) {
        java.util.HashMap map = new java.util.HashMap(P(afauVarArr.length));
        Z(map, afauVarArr);
        return map;
    }

    public static java.util.Map U(defpackage.afau... afauVarArr) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(P(afauVarArr.length));
        Z(linkedHashMap, afauVarArr);
        return linkedHashMap;
    }

    public static java.util.Map V(java.util.Map map, java.util.Map map2) {
        map.getClass();
        map2.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.Map W(java.lang.Iterable iterable) {
        iterable.getClass();
        int size = iterable.size();
        if (size == 0) {
            return defpackage.afcf.a;
        }
        if (size == 1) {
            return Q((defpackage.afau) (iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : iterable.iterator().next()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(P(iterable.size()));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.afau afauVar = (defpackage.afau) it.next();
            linkedHashMap.put(afauVar.a, afauVar.b);
        }
        return linkedHashMap;
    }

    public static java.util.Map X(java.util.Map map) {
        int size = map.size();
        if (size == 0) {
            return defpackage.afcf.a;
        }
        if (size != 1) {
            return new java.util.LinkedHashMap(map);
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map mapSingletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }

    public static java.util.Map Y(java.util.Map map) {
        map.getClass();
        return new java.util.LinkedHashMap(map);
    }

    public static void Z(java.util.Map map, defpackage.afau[] afauVarArr) {
        for (defpackage.afau afauVar : afauVarArr) {
            map.put(afauVar.a, afauVar.b);
        }
    }

    public static java.lang.Object aA(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static java.lang.Object aB(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static java.lang.Object aC(java.util.List list, int i) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static java.lang.Object aD(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.List) {
            return aE((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static java.lang.Object aE(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Object aF(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static java.lang.Object aG(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            return aH((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException("Collection is empty.");
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            throw new java.lang.IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static java.lang.Object aH(java.util.List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new java.lang.IllegalArgumentException("List has more than one element.");
    }

    public static java.lang.Object aI(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            java.util.List list = (java.util.List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static java.lang.Object aJ(java.util.List list) {
        list.getClass();
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static java.util.List aK(java.lang.Iterable iterable) {
        iterable.getClass();
        return aZ(be(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List aL(java.lang.Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return aZ(iterable);
        }
        int size = iterable.size() - i;
        if (size <= 0) {
            return defpackage.afce.a;
        }
        if (size == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(aD(iterable));
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        if (iterable instanceof java.util.RandomAccess) {
            int size2 = iterable.size();
            while (i < size2) {
                arrayList.add(iterable.get(i));
                i++;
            }
        } else {
            java.util.ListIterator listIterator = iterable.listIterator(i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static java.util.List aM(java.util.List list, int i) {
        list.getClass();
        return aX(list, defpackage.afqt.e(list.size() - i, 0));
    }

    public static java.util.List aN(java.lang.Iterable iterable, defpackage.affc affcVar) {
        iterable.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.List aO(java.lang.Iterable iterable) {
        iterable.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static java.util.List aP(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(aj(iterable, 10));
        boolean z = false;
        for (java.lang.Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && f(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static java.util.List aQ(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        if (iterable instanceof java.util.Collection) {
            return aS((java.util.Collection) iterable, iterable2);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bk(arrayList, iterable);
        bk(arrayList, iterable2);
        return arrayList;
    }

    public static java.util.List aR(java.lang.Iterable iterable, java.lang.Object obj) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return aT((java.util.Collection) iterable, obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bk(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static java.util.List aS(java.util.Collection collection, java.lang.Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(collection);
            bk(arrayList, iterable);
            return arrayList;
        }
        java.util.Collection collection2 = (java.util.Collection) iterable;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static java.util.List aT(java.util.Collection collection, java.lang.Object obj) {
        collection.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List aU(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return aZ(iterable);
        }
        java.util.List listBa = ba(iterable);
        java.util.Collections.reverse(listBa);
        return listBa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List aV(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return aZ(iterable);
        }
        java.lang.Object[] array = iterable.toArray(new java.lang.Comparable[0]);
        java.lang.Comparable[] comparableArr = (java.lang.Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            java.util.Arrays.sort(comparableArr);
        }
        return bx(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List aW(java.lang.Iterable iterable, java.util.Comparator comparator) {
        iterable.getClass();
        if (iterable.size() <= 1) {
            return aZ(iterable);
        }
        java.lang.Object[] array = iterable.toArray(new java.lang.Object[0]);
        bz(array, comparator);
        array.getClass();
        java.util.List listAsList = java.util.Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List aX(java.lang.Iterable iterable, int i) {
        iterable.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return defpackage.afce.a;
        }
        if (i >= iterable.size()) {
            return aZ(iterable);
        }
        if (i == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(ay(iterable));
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        java.util.Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return af(arrayList);
    }

    public static java.util.List aY(java.util.List list, int i) {
        list.getClass();
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(i, "Requested element count ", " is less than zero."));
        }
        if (i == 0) {
            return defpackage.afce.a;
        }
        int size = list.size();
        if (i >= size) {
            return aZ(list);
        }
        if (i == 1) {
            return aa(aE(list));
        }
        int i2 = size - i;
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        if (list instanceof java.util.RandomAccess) {
            while (i2 < size) {
                arrayList.add(list.get(i2));
                i2++;
            }
        } else {
            java.util.ListIterator listIterator = list.listIterator(i2);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static java.util.List aZ(java.lang.Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            return af(ba(iterable));
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return defpackage.afce.a;
        }
        if (size != 1) {
            return new java.util.ArrayList(collection);
        }
        java.util.List listSingletonList = java.util.Collections.singletonList(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static java.util.List aa(java.lang.Object obj) {
        java.util.List listSingletonList = java.util.Collections.singletonList(obj);
        listSingletonList.getClass();
        return listSingletonList;
    }

    public static int ab(java.util.List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static java.util.List ac(java.lang.Object... objArr) {
        objArr.getClass();
        if (objArr.length <= 0) {
            return defpackage.afce.a;
        }
        java.util.List listAsList = java.util.Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static java.util.List ad(java.lang.Object obj) {
        return obj != null ? aa(obj) : defpackage.afce.a;
    }

    public static java.util.List ae(java.lang.Object... objArr) {
        return new java.util.ArrayList(new defpackage.afby(objArr, true));
    }

    public static java.util.List af(java.util.List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : aa(list.get(0));
        }
        return defpackage.afce.a;
    }

    public static defpackage.afia ag(java.util.Collection collection) {
        collection.getClass();
        return new defpackage.afia(0, collection.size() - 1);
    }

    public static void ah() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }

    public static void ai() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static int aj(java.lang.Iterable iterable, int i) {
        iterable.getClass();
        return iterable instanceof java.util.Collection ? ((java.util.Collection) iterable).size() : i;
    }

    public static java.util.List ak(java.lang.Iterable iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bk(arrayList, (java.lang.Iterable) it.next());
        }
        return arrayList;
    }

    public static void al(java.util.List list) {
        if (list.size() > 1) {
            java.util.Collections.sort(list);
        }
    }

    public static void am(java.util.List list, java.util.Comparator comparator) {
        list.getClass();
        comparator.getClass();
        if (list.size() > 1) {
            java.util.Collections.sort(list, comparator);
        }
    }

    public static java.lang.Object an(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static java.lang.Object ao(java.util.List list) {
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.remove(ab(list));
    }

    public static java.util.Collection ap(java.lang.Iterable iterable) {
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : aZ(iterable);
    }

    public static int aq(java.util.List list, int i) {
        if (i >= 0 && i <= ab(list)) {
            return ab(list) - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Element index " + i + " must be in range [" + new defpackage.afia(0, ab(list)) + "].");
    }

    public static int ar(java.util.List list, int i) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        throw new java.lang.IndexOutOfBoundsException("Position index " + i + " must be in range [" + new defpackage.afia(0, list.size()) + "].");
    }

    public static java.util.List as(java.util.List list) {
        list.getClass();
        return new afco(list);
    }

    public static java.lang.Comparable at(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Comparable au(java.lang.Iterable iterable) {
        afhz afhzVarA = ((defpackage.afhy) iterable).iterator();
        afhz afhzVar = afhzVarA;
        if (!afhzVar.a) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Comparable comparable = (java.lang.Comparable) afhzVarA.next();
        while (afhzVar.a) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) afhzVarA.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Comparable av(java.lang.Iterable iterable) {
        java.util.Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        java.lang.Comparable comparable = (java.lang.Comparable) it.next();
        while (it.hasNext()) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Comparable aw(java.lang.Iterable iterable) {
        afhz afhzVarA = ((defpackage.afhy) iterable).iterator();
        afhz afhzVar = afhzVarA;
        if (!afhzVar.a) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Comparable comparable = (java.lang.Comparable) afhzVarA.next();
        while (afhzVar.a) {
            java.lang.Comparable comparable2 = (java.lang.Comparable) afhzVarA.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static java.lang.Iterable ax(java.lang.Iterable iterable) {
        iterable.getClass();
        return new afci(new defpackage.tip(iterable, 11));
    }

    public static java.lang.Object ay(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.List) {
            return az((java.util.List) iterable);
        }
        java.util.Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new java.util.NoSuchElementException("Collection is empty.");
    }

    public static java.lang.Object az(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static byte[] bA(byte[] bArr, int i, int i2) {
        bArr.getClass();
        bv(i2, bArr.length);
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, i, i2);
        bArrCopyOfRange.getClass();
        return bArrCopyOfRange;
    }

    public static int[] bB(int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        int length = iArr.length;
        int length2 = iArr2.length;
        int[] iArrCopyOf = java.util.Arrays.copyOf(iArr, length + length2);
        java.lang.System.arraycopy(iArr2, 0, iArrCopyOf, length, length2);
        iArrCopyOf.getClass();
        return iArrCopyOf;
    }

    public static java.lang.Object[] bC(java.lang.Object[] objArr, int i, int i2) {
        objArr.getClass();
        bv(i2, objArr.length);
        java.lang.Object[] objArrCopyOfRange = java.util.Arrays.copyOfRange(objArr, i, i2);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    public static java.lang.Object[] bD(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        objArr.getClass();
        int length = objArr.length;
        int length2 = objArr2.length;
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length + length2);
        java.lang.System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        objArrCopyOf.getClass();
        return objArrCopyOf;
    }

    public static int bE(float[] fArr) {
        return fArr.length - 1;
    }

    public static int bF(int[] iArr) {
        return iArr.length - 1;
    }

    public static int bG(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static int bH(java.lang.Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static int bI(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static int bJ(java.lang.Object[] objArr, java.lang.Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (f(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int bK(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[bF(iArr)];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.lang.Integer bL(int[] iArr, int i) {
        iArr.getClass();
        if (i < iArr.length) {
            return java.lang.Integer.valueOf(iArr[i]);
        }
        return null;
    }

    public static java.lang.Iterable bM(java.lang.Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? defpackage.afce.a : new aist(objArr, 1);
    }

    public static java.lang.Iterable bN(java.lang.Object[] objArr) {
        return new afci(new defpackage.tip(objArr, 10));
    }

    public static java.lang.Object bO(java.lang.Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.lang.Object bP(java.lang.Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static java.lang.Object bQ(java.lang.Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static java.lang.Object bR(java.lang.Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[bH(objArr)];
        }
        throw new java.util.NoSuchElementException("Array is empty.");
    }

    public static java.lang.Object bS(java.lang.Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            throw new java.util.NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return objArr[0];
        }
        throw new java.lang.IllegalArgumentException("Array has more than one element.");
    }

    public static java.lang.Object bT(java.lang.Object[] objArr) {
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static java.util.List bU(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        cq(objArr, arrayList);
        return arrayList;
    }

    public static java.util.List bV(java.lang.Object[] objArr, java.util.Comparator comparator) {
        int length = objArr.length;
        if (length != 0) {
            objArr = java.util.Arrays.copyOf(objArr, length);
            objArr.getClass();
            bz(objArr, comparator);
        }
        return bx(objArr);
    }

    public static java.util.List bW(float[] fArr) {
        fArr.getClass();
        int length = fArr.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            return aa(java.lang.Float.valueOf(fArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (float f : fArr) {
            arrayList.add(java.lang.Float.valueOf(f));
        }
        return arrayList;
    }

    public static java.util.List bX(int[] iArr) {
        iArr.getClass();
        int length = iArr.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            return aa(java.lang.Integer.valueOf(iArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }

    public static java.util.List bY(long[] jArr) {
        jArr.getClass();
        int length = jArr.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            return aa(java.lang.Long.valueOf(jArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (long j : jArr) {
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    public static java.util.List bZ(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            java.util.List listSingletonList = java.util.Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, length);
        objArrCopyOf.getClass();
        java.util.List listAsList = java.util.Arrays.asList(objArrCopyOf);
        listAsList.getClass();
        return listAsList;
    }

    public static java.util.List ba(java.lang.Iterable iterable) {
        if (iterable instanceof java.util.Collection) {
            return bb((java.util.Collection) iterable);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bs(iterable, arrayList);
        return arrayList;
    }

    public static java.util.List bb(java.util.Collection collection) {
        collection.getClass();
        return new java.util.ArrayList(collection);
    }

    public static java.util.List bc(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        java.util.Iterator it = iterable.iterator();
        java.util.Iterator it2 = iterable2.iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList(java.lang.Math.min(aj(iterable, 10), aj(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new defpackage.afau(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static java.util.Set bd(java.lang.Iterable iterable, java.lang.Iterable iterable2) {
        iterable.getClass();
        iterable2.getClass();
        java.util.Collection collectionAp = ap(iterable2);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : iterable) {
            if (collectionAp.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static java.util.Set be(java.lang.Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return new java.util.LinkedHashSet((java.util.Collection) iterable);
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        bs(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static java.util.Set bf(java.lang.Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof java.util.Collection)) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            bs(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size == 0) {
                return defpackage.afcg.a;
            }
            if (size != 1) {
                return linkedHashSet;
            }
            java.util.Set setSingleton = java.util.Collections.singleton(linkedHashSet.iterator().next());
            setSingleton.getClass();
            return setSingleton;
        }
        java.util.Collection collection = (java.util.Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return defpackage.afcg.a;
        }
        if (size2 != 1) {
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet(P(collection.size()));
            bs(iterable, linkedHashSet2);
            return linkedHashSet2;
        }
        java.util.Set setSingleton2 = java.util.Collections.singleton(iterable instanceof java.util.List ? ((java.util.List) iterable).get(0) : collection.iterator().next());
        setSingleton2.getClass();
        return setSingleton2;
    }

    public static aisp bg(java.lang.Iterable iterable) {
        iterable.getClass();
        return new defpackage.afcb(iterable, 2);
    }

    public static boolean bh(java.lang.Iterable iterable, java.lang.Object obj) {
        int iIndexOf;
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof java.util.List)) {
            int i = 0;
            for (java.lang.Object obj2 : iterable) {
                if (i < 0) {
                    ai();
                }
                if (f(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
        }
        iIndexOf = ((java.util.List) iterable).indexOf(obj);
        return iIndexOf >= 0;
    }

    public static float[] bi(java.util.Collection collection) {
        float[] fArr = new float[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((java.lang.Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] bj(java.util.Collection collection) {
        int[] iArr = new int[collection.size()];
        java.util.Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((java.lang.Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static void bk(java.util.Collection collection, java.lang.Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof java.util.Collection) {
            collection.addAll((java.util.Collection) iterable);
            return;
        }
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void bl(java.util.Collection collection, java.lang.Object[] objArr) {
        objArr.getClass();
        collection.addAll(bx(objArr));
    }

    public static /* synthetic */ int bm(java.util.List list, java.lang.Comparable comparable) {
        int size = list.size();
        int size2 = list.size();
        if (size < 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bm(size, "fromIndex (0) is greater than toIndex (", ")."));
        }
        if (size > size2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(size2, size, "toIndex (", ") is greater than size (", ")."));
        }
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iX = x((java.lang.Comparable) list.get(i3), comparable);
            if (iX < 0) {
                i2 = i3 + 1;
            } else {
                if (iX <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static void bn(java.lang.Iterable iterable, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, defpackage.affc affcVar) throws java.io.IOException {
        iterable.getClass();
        appendable.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        for (java.lang.Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            defpackage.a.j(appendable, obj, affcVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ java.lang.String bo(java.lang.Iterable iterable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.affc affcVar, int i) throws java.io.IOException {
        iterable.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        java.lang.CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        java.lang.CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        java.lang.CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        bn(iterable, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : affcVar);
        return sb.toString();
    }

    public static void bp(java.lang.Iterable iterable, defpackage.affc affcVar) {
        iterable.getClass();
        bt(iterable, affcVar, true);
    }

    public static void bq(java.util.List list, defpackage.affc affcVar) {
        int iAb;
        list.getClass();
        affcVar.getClass();
        if (!(list instanceof java.util.RandomAccess)) {
            if ((list instanceof defpackage.afhc) && !(list instanceof defpackage.afhe)) {
                defpackage.afgz.c(list, "kotlin.collections.MutableIterable");
            }
            bt(list, affcVar, true);
            return;
        }
        int iAb2 = ab(list);
        int i = 0;
        if (iAb2 >= 0) {
            int i2 = 0;
            while (true) {
                java.lang.Object obj = list.get(i);
                if (!((java.lang.Boolean) affcVar.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iAb2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iAb = ab(list))) {
            return;
        }
        while (true) {
            list.remove(iAb);
            if (iAb == i) {
                return;
            } else {
                iAb--;
            }
        }
    }

    public static void br(int i, java.lang.Object[] objArr) {
        if (i < objArr.length) {
            objArr[i] = null;
        }
    }

    public static void bs(java.lang.Iterable iterable, java.util.Collection collection) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void bt(java.lang.Iterable iterable, defpackage.affc affcVar, boolean z) {
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (((java.lang.Boolean) affcVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
            }
        }
    }

    public static void bu(java.util.List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        list.remove(list.size() - 1);
    }

    public static void bv(int i, int i2) {
        if (i > i2) {
            throw new java.lang.IndexOutOfBoundsException(defpackage.a.bz(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static boolean bw(java.lang.Object[] objArr, java.lang.Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        int length = objArr.length;
        if (length != objArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = objArr[i];
            java.lang.Object obj2 = objArr2[i];
            if (obj != obj2) {
                if (obj == null || obj2 == null) {
                    return false;
                }
                if ((obj instanceof java.lang.Object[]) && (obj2 instanceof java.lang.Object[])) {
                    if (!bw((java.lang.Object[]) obj, (java.lang.Object[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                    if (!java.util.Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                    if (!java.util.Arrays.equals((short[]) obj, (short[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                    if (!java.util.Arrays.equals((int[]) obj, (int[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                    if (!java.util.Arrays.equals((long[]) obj, (long[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                    if (!java.util.Arrays.equals((float[]) obj, (float[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                    if (!java.util.Arrays.equals((double[]) obj, (double[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                    if (!java.util.Arrays.equals((char[]) obj, (char[]) obj2)) {
                        return false;
                    }
                } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                    if (!java.util.Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                        return false;
                    }
                } else {
                    if ((obj instanceof afbb) && (obj2 instanceof afbb)) {
                        throw null;
                    }
                    if ((obj instanceof afbi) && (obj2 instanceof afbi)) {
                        throw null;
                    }
                    if ((obj instanceof afbd) && (obj2 instanceof afbd)) {
                        throw null;
                    }
                    if ((obj instanceof afbf) && (obj2 instanceof afbf)) {
                        throw null;
                    }
                    if (!f(obj, obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static java.util.List bx(java.lang.Object[] objArr) {
        objArr.getClass();
        java.util.List listAsList = java.util.Arrays.asList(objArr);
        listAsList.getClass();
        return listAsList;
    }

    public static void by(java.lang.Object[] objArr, java.lang.Object obj, int i, int i2) {
        objArr.getClass();
        java.util.Arrays.fill(objArr, i, i2, obj);
    }

    public static void bz(java.lang.Object[] objArr, java.util.Comparator comparator) {
        objArr.getClass();
        if (objArr.length > 1) {
            java.util.Arrays.sort(objArr, comparator);
        }
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static defpackage.afar cA(defpackage.afer aferVar) {
        aferVar.getClass();
        return new defpackage.afay(aferVar);
    }

    public static defpackage.afar cB(int i, defpackage.afer aferVar) {
        aferVar.getClass();
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? new defpackage.afbl(aferVar) : new defpackage.afax(aferVar);
        }
        return new defpackage.afay(aferVar);
    }

    public static void cC(java.lang.Object obj, java.lang.Class cls) {
        if (obj == null) {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    public static int cD(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static java.util.LinkedHashMap cE(int i) {
        return new java.util.LinkedHashMap(cD(i));
    }

    public static java.util.List cF(int i) {
        return i == 0 ? java.util.Collections.EMPTY_LIST : new java.util.ArrayList(i);
    }

    public static int cG(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    public static java.util.List ca(boolean[] zArr) {
        zArr.getClass();
        int length = zArr.length;
        if (length == 0) {
            return defpackage.afce.a;
        }
        if (length == 1) {
            return aa(java.lang.Boolean.valueOf(zArr[0]));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (boolean z : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static java.util.Set cb(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return defpackage.afcg.a;
        }
        if (length == 1) {
            return I(java.lang.Integer.valueOf(iArr[0]));
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(length));
        ct(iArr, linkedHashSet);
        return linkedHashSet;
    }

    public static java.util.Set cc(java.lang.Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (length == 0) {
            return defpackage.afcg.a;
        }
        if (length != 1) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(P(length));
            cu(objArr, linkedHashSet);
            return linkedHashSet;
        }
        java.util.Set setSingleton = java.util.Collections.singleton(objArr[0]);
        setSingleton.getClass();
        return setSingleton;
    }

    public static defpackage.afia cd(int[] iArr) {
        return new defpackage.afia(0, bF(iArr));
    }

    public static aisp ce(java.lang.Object[] objArr) {
        return objArr.length == 0 ? aisj.a : new defpackage.afcb(objArr, 0);
    }

    public static boolean cf(int[] iArr, int i) {
        return bI(iArr, i) >= 0;
    }

    public static boolean cg(java.lang.Object[] objArr, java.lang.Object obj) {
        objArr.getClass();
        return bJ(objArr, obj) >= 0;
    }

    public static void ch(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        bArr.getClass();
        java.lang.System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static void ci(char[] cArr, char[] cArr2, int i, int i2, int i3) {
        cArr.getClass();
        cArr2.getClass();
        java.lang.System.arraycopy(cArr, i2, cArr2, i, i3 - i2);
    }

    public static void cj(long[] jArr, long[] jArr2, int i, int i2, int i3) {
        jArr.getClass();
        jArr2.getClass();
        java.lang.System.arraycopy(jArr, i2, jArr2, i, i3 - i2);
    }

    public static void ck(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        java.lang.System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void cl(float[] fArr, float[] fArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = fArr.length;
        }
        fArr.getClass();
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, i);
    }

    public static /* synthetic */ void cm(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = iArr.length;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        iArr.getClass();
        iArr2.getClass();
        java.lang.System.arraycopy(iArr, 0, iArr2, i, i2);
    }

    public static /* synthetic */ void co(long[] jArr, long j) {
        int length = jArr.length;
        jArr.getClass();
        java.util.Arrays.fill(jArr, 0, length, j);
    }

    public static void cq(java.lang.Object[] objArr, java.util.Collection collection) {
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static void cr(java.lang.Object[] objArr, java.lang.Appendable appendable, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, int i, java.lang.CharSequence charSequence4, defpackage.affc affcVar) throws java.io.IOException {
        objArr.getClass();
        appendable.append(charSequence2);
        int i2 = 0;
        for (java.lang.Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > 0) {
                i = 0;
                break;
            }
            defpackage.a.j(appendable, obj, affcVar);
        }
        if (i >= 0 && i2 > 0) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ java.lang.String cs(java.lang.Object[] objArr, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, java.lang.CharSequence charSequence3, defpackage.affc affcVar, int i) throws java.io.IOException {
        objArr.getClass();
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        java.lang.CharSequence charSequence4 = charSequence;
        charSequence4.getClass();
        java.lang.CharSequence charSequence5 = (i & 2) != 0 ? "" : charSequence2;
        charSequence5.getClass();
        java.lang.CharSequence charSequence6 = (i & 4) != 0 ? "" : charSequence3;
        charSequence6.getClass();
        java.lang.CharSequence charSequence7 = (i & 16) != 0 ? "..." : null;
        charSequence7.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        cr(objArr, sb, charSequence4, charSequence5, charSequence6, (i & 8) != 0 ? -1 : 0, charSequence7, (i & 32) != 0 ? null : affcVar);
        return sb.toString();
    }

    public static void ct(int[] iArr, java.util.Collection collection) {
        for (int i : iArr) {
            collection.add(java.lang.Integer.valueOf(i));
        }
    }

    public static void cu(java.lang.Object[] objArr, java.util.Collection collection) {
        for (java.lang.Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static /* synthetic */ void cv(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        objArr.getClass();
        objArr2.getClass();
        java.lang.System.arraycopy(objArr, i, objArr2, 0, i2 - i);
    }

    public static int cw(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if ((-2147483639) + i3 > 0) {
            return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i3;
    }

    public static java.lang.String cx(long j, int i) {
        if (j >= 0) {
            java.lang.String string = java.lang.Long.toString(j, i);
            string.getClass();
            return string;
        }
        long j2 = i;
        long j3 = (j >>> 1) / j2;
        long j4 = j3 + j3;
        long j5 = j - (j4 * j2);
        if (j5 >= j2) {
            j4++;
            j5 -= j2;
        }
        java.lang.String string2 = java.lang.Long.toString(j4, i);
        string2.getClass();
        java.lang.String string3 = java.lang.Long.toString(j5, i);
        string3.getClass();
        return string2.concat(string3);
    }

    public static java.lang.Object cy(java.lang.Throwable th) {
        th.getClass();
        return new defpackage.afav(th);
    }

    public static void cz(java.lang.Object obj) throws java.lang.Throwable {
        if (obj instanceof defpackage.afav) {
            throw ((defpackage.afav) obj).a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    public static void d(java.lang.String str) throws afbj {
        afbj afbjVar = new afbj(defpackage.a.bp(str, "lateinit property ", " has not been initialized"));
        g(afbjVar, defpackage.afga.class.getName());
        throw afbjVar;
    }

    public static boolean e(java.lang.Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    static void g(java.lang.Throwable th, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static java.lang.Class h(defpackage.afie afieVar) {
        afieVar.getClass();
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static java.lang.Class i(defpackage.afie afieVar) {
        afieVar.getClass();
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        if (!jClass.isPrimitive()) {
            jClass.getClass();
            return jClass;
        }
        java.lang.String name = jClass.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        jClass = java.lang.Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        jClass = java.lang.Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        jClass = java.lang.Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        jClass = java.lang.Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        jClass = java.lang.Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        jClass = java.lang.Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        jClass = java.lang.Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        jClass = java.lang.Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        jClass = java.lang.Short.class;
                    }
                    break;
            }
        }
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static java.lang.Class j(defpackage.afie afieVar) {
        afieVar.getClass();
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        if (jClass.isPrimitive()) {
            jClass.getClass();
            return jClass;
        }
        java.lang.String name = jClass.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return java.lang.Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return java.lang.Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return java.lang.Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return java.lang.Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return java.lang.Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return java.lang.Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return java.lang.Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return java.lang.Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return java.lang.Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static defpackage.afie k(java.lang.annotation.Annotation annotation) {
        annotation.getClass();
        java.lang.Class<? extends java.lang.annotation.Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        defpackage.afie afieVarL = l(clsAnnotationType);
        afieVarL.getClass();
        return afieVarL;
    }

    public static defpackage.afie l(java.lang.Class cls) {
        cls.getClass();
        return defpackage.afgw.a.getOrCreateKotlinClass(cls);
    }

    public static void m(java.lang.AutoCloseable autoCloseable, java.lang.Throwable th) throws java.lang.Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (java.lang.Throwable th2) {
            defpackage.adrs.E(th, th2);
        }
    }

    public static void n(java.io.Closeable closeable, java.lang.Throwable th) throws java.io.IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (java.lang.Throwable th2) {
                defpackage.adrs.E(th, th2);
            }
        }
    }

    public static int o(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static defpackage.afef p(java.lang.Enum[] enumArr) {
        enumArr.getClass();
        return new defpackage.afeg(enumArr);
    }

    public static java.lang.Object q(defpackage.affg affgVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        affgVar.getClass();
        defpackage.afdo afdoVarGT = afdkVar.gT();
        afdw afdwVar = afdoVarGT == defpackage.afdp.a ? new afdw(afdkVar) : new afdx(afdkVar, afdoVarGT);
        defpackage.afgz.g(affgVar, 2);
        return affgVar.invoke(obj, afdwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.afdk r(defpackage.affg affgVar, java.lang.Object obj, defpackage.afdk afdkVar) {
        affgVar.getClass();
        if (affgVar instanceof defpackage.afdy) {
            return ((defpackage.afdy) affgVar).b(obj, afdkVar);
        }
        defpackage.afdo afdoVarGT = afdkVar.gT();
        return afdoVarGT == defpackage.afdp.a ? new afdu(afdkVar, affgVar, obj) : new afdv(afdkVar, afdoVarGT, affgVar, obj);
    }

    public static defpackage.afdk s(defpackage.afdk afdkVar) {
        afdkVar.getClass();
        defpackage.afea afeaVar = afdkVar instanceof defpackage.afea ? (defpackage.afea) afdkVar : null;
        if (afeaVar != null && (afdkVar = afeaVar.r) == null) {
            defpackage.afdl afdlVar = (defpackage.afdl) afeaVar.gT().get(defpackage.afdl.k);
            afdkVar = afdlVar != null ? afdlVar.gJ(afeaVar) : afeaVar;
            afeaVar.r = afdkVar;
        }
        return afdkVar;
    }

    public static defpackage.afdm t(defpackage.afdm afdmVar, defpackage.afdn afdnVar) {
        afdnVar.getClass();
        if (f(afdmVar.getKey(), afdnVar)) {
            return afdmVar;
        }
        return null;
    }

    public static defpackage.afdo u(defpackage.afdm afdmVar, defpackage.afdn afdnVar) {
        afdnVar.getClass();
        return f(afdmVar.getKey(), afdnVar) ? defpackage.afdp.a : afdmVar;
    }

    public static defpackage.afdo v(defpackage.afdm afdmVar, defpackage.afdo afdoVar) {
        afdoVar.getClass();
        return w(afdmVar, afdoVar);
    }

    public static defpackage.afdo w(defpackage.afdo afdoVar, defpackage.afdo afdoVar2) {
        afdoVar2.getClass();
        return afdoVar2 == defpackage.afdp.a ? afdoVar : (defpackage.afdo) afdoVar2.fold(afdoVar, new defpackage.nog(12));
    }

    public static int x(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static java.lang.Comparable y(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static java.lang.Comparable z(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        comparable.getClass();
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }
}
