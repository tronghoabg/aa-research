package androidx.compose.runtime.snapshots;

import androidx.collection.ObjectList;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.k.j;
import h.k.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, p<? super Integer, ? super T, Boolean> pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (pVar.invoke(Integer.valueOf(i2), t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(ObjectList<T> objectList, l<? super T, ab> lVar) {
        j jVarU = n.u(0, objectList._size);
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return;
        }
        while (true) {
            lVar.invoke(objectList.get(iA));
            if (iA == iB) {
                return;
            } else {
                iA++;
            }
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, p<? super Integer, ? super T, ab> pVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            pVar.invoke(Integer.valueOf(i2), list.get(i2));
        }
    }

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, l<? super T, ? extends K> lVar) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            K kInvoke = lVar.invoke(t);
            HashMap map2 = map;
            Object arrayList = map2.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map2.put(kInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t);
        }
        return map;
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

    public static final <T, R> List<R> fastMap(List<? extends T> list, l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(lVar.invoke(list.get(i2)));
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

    public static final <T> boolean fastNone(List<? extends T> list, l<? super T, Boolean> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (lVar.invoke(list.get(i2)).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            hashSet.add(list.get(i2));
        }
        return hashSet;
    }

    public static final <T> void fastForEach(List<? extends T> list, l<? super T, ab> lVar) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(list.get(i2));
        }
    }
}
