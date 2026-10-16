package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aipw {
    public static final long a(long j) {
        long j2 = defpackage.aitq.a;
        if (j > 0) {
            return defpackage.aitq.e(defpackage.aitq.g(j, defpackage.agac.f(999999L, defpackage.aits.NANOSECONDS)));
        }
        return 0L;
    }

    public static final <T> void addIfNotNull(java.util.Collection<T> collection, T t) {
        collection.getClass();
        if (t != null) {
            collection.add(t);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final java.lang.Object b(defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aivf aivfVar;
        if (afdkVar instanceof defpackage.aivf) {
            aivfVar = (defpackage.aivf) afdkVar;
            int i = aivfVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aivfVar.b = i - Integer.MIN_VALUE;
            } else {
                aivfVar = new defpackage.aivf(afdkVar);
            }
        } else {
            aivfVar = new defpackage.aivf(afdkVar);
        }
        java.lang.Object obj = aivfVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aivfVar.b;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            aivfVar.b = 1;
            defpackage.aiug aiugVar = new defpackage.aiug(defpackage.afga.s(aivfVar), 1);
            aiugVar.z();
            if (aiugVar.k() == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        throw new defpackage.afap();
    }

    public static final java.lang.Object c(long j, defpackage.afdk afdkVar) {
        if (j > 0) {
            defpackage.aiug aiugVar = new defpackage.aiug(defpackage.afga.s(afdkVar), 1);
            aiugVar.z();
            if (j < Long.MAX_VALUE) {
                e(aiugVar.b).c(j, aiugVar);
            }
            java.lang.Object objK = aiugVar.k();
            defpackage.afdr afdrVar = defpackage.afdr.a;
            if (objK == afdrVar) {
                afdkVar.getClass();
            }
            if (objK == afdrVar) {
                return objK;
            }
        }
        return defpackage.afbk.a;
    }

    private static final int capacity(int i) {
        if (i < 3) {
            return 3;
        }
        return i + (i / 3) + 1;
    }

    public static final <T> java.util.List<T> compact(java.util.ArrayList<T> arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        if (size == 0) {
            return defpackage.afce.a;
        }
        if (size == 1) {
            return defpackage.afga.aa(defpackage.afga.az(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final java.lang.Object d(long j, defpackage.afdk afdkVar) {
        return c(a(j), afdkVar);
    }

    public static final defpackage.aive e(defpackage.afdo afdoVar) {
        defpackage.afdm afdmVar = afdoVar.get(defpackage.afdl.k);
        defpackage.aive aiveVar = afdmVar instanceof defpackage.aive ? (defpackage.aive) afdmVar : null;
        return aiveVar == null ? defpackage.aivb.a : aiveVar;
    }

    public static final <K> java.util.Map<K, java.lang.Integer> mapToIndex(java.lang.Iterable<? extends K> iterable) {
        iterable.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<? extends K> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), java.lang.Integer.valueOf(i));
            i++;
        }
        return linkedHashMap;
    }

    public static final <K, V> java.util.HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new java.util.HashMap<>(capacity(i));
    }

    public static final <E> java.util.HashSet<E> newHashSetWithExpectedSize(int i) {
        return new java.util.HashSet<>(capacity(i));
    }

    public static final <E> java.util.LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i) {
        return new java.util.LinkedHashSet<>(capacity(i));
    }
}
