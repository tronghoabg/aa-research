package androidx.compose.ui.util;

import android.R;
import androidx.collection.MutableScatterSet;
import h.a.ac;
import h.a.i;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ListUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void appendElement(Appendable appendable, T t, l<? super T, ? extends CharSequence> lVar) throws IOException {
        if (lVar != null) {
            appendable.append(lVar.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof CharSequence)) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }

    public static final <T> boolean fastAll(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!lVar.invoke(list.get(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(list.get(i2)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, l<? super T, ? extends K> lVar) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (mutableScatterSet.add(lVar.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (lVar.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFilteredMap(List<? extends T> list, l<? super T, Boolean> lVar, l<? super T, ? extends R> lVar2) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (lVar.invoke(t).booleanValue()) {
                arrayList.add(lVar2.invoke(t));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirst(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        throwNoSuchElementException("Collection contains no element matching the predicate.");
        throw new e();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public static final <T> T fastFirstOrNull(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, l<? super T, ? extends Iterable<? extends R>> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            i.aD(arrayList, lVar.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r, p<? super R, ? super T, ? extends R> pVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            r = pVar.invoke(r, list.get(i2));
        }
        return r;
    }

    public static final <T> void fastForEach(List<? extends T> list, l<? super T, ab> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(list.get(i2));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, p<? super Integer, ? super T, ab> pVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(i2), list.get(i2));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, l<? super T, ab> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = size - 1;
            lVar.invoke(list.get(size));
            if (i2 < 0) {
                return;
            } else {
                size = i2;
            }
        }
    }

    private static final <T, A extends Appendable> A fastJoinTo(List<? extends T> list, A a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        a2.append(charSequence2);
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            T t = list.get(i4);
            i3++;
            if (i3 > 1) {
                a2.append(charSequence);
            }
            if (i2 >= 0 && i3 > i2) {
                break;
            }
            appendElement(a2, t, lVar);
        }
        if (i2 >= 0 && i3 > i2) {
            a2.append(charSequence4);
        }
        a2.append(charSequence3);
        return a2;
    }

    static /* synthetic */ Appendable fastJoinTo$default(List list, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) throws IOException {
        fastJoinTo(list, appendable, (i3 & 2) != 0 ? ", " : charSequence, (i3 & 4) != 0 ? "" : charSequence2, (i3 & 8) != 0 ? "" : charSequence3, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "..." : charSequence4, (i3 & 64) != 0 ? null : lVar);
        return appendable;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        fastJoinTo(list, sb, charSequence, charSequence2, charSequence3, i2, charSequence4, lVar);
        return sb.toString();
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i2, CharSequence charSequence4, l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
        }
        if ((i3 & 2) != 0) {
        }
        if ((i3 & 4) != 0) {
        }
        if ((i3 & 8) != 0) {
            i2 = -1;
        }
        if ((i3 & 16) != 0) {
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        l lVar2 = lVar;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i2, charSequence5, lVar2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    public static final <T> T fastLastOrNull(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i2 = size - 1;
            T t = list.get(size);
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
            if (i2 < 0) {
                return null;
            }
            size = i2;
        }
    }

    public static final <T, R> List<R> fastMap(List<? extends T> list, l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lVar.invoke(list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexed(List<? extends T> list, p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(pVar.invoke(Integer.valueOf(i2), list.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapIndexedNotNull(List<? extends T> list, p<? super Integer, ? super T, ? extends R> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = pVar.invoke(Integer.valueOf(i2), list.get(i2));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            R rInvoke = lVar.invoke(list.get(i2));
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c2, l<? super T, ? extends R> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            c2.add(lVar.invoke(list.get(i2)));
        }
        return c2;
    }

    public static final <T, R extends Comparable<? super R>> T fastMaxBy(List<? extends T> list, l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R rInvoke = lVar.invoke(t);
        x.f(list, "<this>");
        int size = list.size() - 1;
        if (size > 0) {
            int i2 = 1;
            while (true) {
                T t2 = list.get(i2);
                R rInvoke2 = lVar.invoke(t2);
                int iCompareTo = rInvoke.compareTo(rInvoke2);
                if (iCompareTo < 0) {
                    rInvoke = rInvoke2;
                }
                if (iCompareTo < 0) {
                    t = t2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return (T) t;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrDefault(List<? extends T> list, R r, l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return r;
        }
        R rInvoke = lVar.invoke(list.get(0));
        x.f(list, "<this>");
        int size = list.size() - 1;
        if (size > 0) {
            int i2 = 1;
            while (true) {
                R rInvoke2 = lVar.invoke(list.get(i2));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return rInvoke;
    }

    public static final <T, R extends Comparable<? super R>> R fastMaxOfOrNull(List<? extends T> list, l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        R rInvoke = lVar.invoke(list.get(0));
        x.f(list, "<this>");
        int size = list.size() - 1;
        if (size > 0) {
            int i2 = 1;
            while (true) {
                R rInvoke2 = lVar.invoke(list.get(i2));
                if (rInvoke2.compareTo(rInvoke) > 0) {
                    rInvoke = rInvoke2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return rInvoke;
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, l<? super T, ? extends R> lVar) {
        if (list.isEmpty()) {
            return null;
        }
        T t = list.get(0);
        R rInvoke = lVar.invoke(t);
        x.f(list, "<this>");
        int size = list.size() - 1;
        if (size > 0) {
            int i2 = 1;
            while (true) {
                T t2 = list.get(i2);
                R rInvoke2 = lVar.invoke(t2);
                int iCompareTo = rInvoke.compareTo(rInvoke2);
                if (iCompareTo > 0) {
                    rInvoke = rInvoke2;
                }
                if (iCompareTo > 0) {
                    t = t2;
                }
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return (T) t;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, p<? super S, ? super T, ? extends S> pVar) {
        if (list.isEmpty()) {
            throwUnsupportedOperationException("Empty collection can't be reduced.");
        }
        S sInvoke = (S) i.P(list);
        x.f(list, "<this>");
        int size = list.size() - 1;
        if (size > 0) {
            int i2 = 1;
            while (true) {
                sInvoke = pVar.invoke(sInvoke, list.get(i2));
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return sInvoke;
    }

    public static final <T> int fastSumBy(List<? extends T> list, l<? super T, Integer> lVar) {
        int size = list.size();
        int iIntValue = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iIntValue += lVar.invoke(list.get(i2)).intValue();
        }
        return iIntValue;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> list2, p<? super T, ? super R, ? extends V> pVar) {
        int iMin = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i2 = 0; i2 < iMin; i2++) {
            arrayList.add(pVar.invoke(list.get(i2), list2.get(i2)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, p<? super T, ? super T, ? extends R> pVar) {
        if (list.size() <= 1) {
            return ac.f47967a;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        R.array arrayVar = list.get(0);
        x.f(list, "<this>");
        int size = list.size() - 1;
        while (i2 < size) {
            i2++;
            T t = list.get(i2);
            arrayList.add(pVar.invoke(arrayVar, t));
            arrayVar = t;
        }
        return arrayList;
    }

    public static final Void throwNoSuchElementException(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void throwUnsupportedOperationException(String str) {
        throw new UnsupportedOperationException(str);
    }
}
