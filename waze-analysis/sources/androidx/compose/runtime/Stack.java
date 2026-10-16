package androidx.compose.runtime;

import h.g.a;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Stack<T> {
    private final ArrayList<T> backing;

    private /* synthetic */ Stack(ArrayList arrayList) {
        this.backing = arrayList;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Stack m7324boximpl(ArrayList arrayList) {
        return new Stack(arrayList);
    }

    /* renamed from: clear-impl, reason: not valid java name */
    public static final void m7325clearimpl(ArrayList<T> arrayList) {
        arrayList.clear();
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ ArrayList m7327constructorimpl$default(ArrayList arrayList, int i2, o oVar) {
        return (i2 & 1) != 0 ? new ArrayList() : arrayList;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7328equalsimpl(ArrayList<T> arrayList, Object obj) {
        return (obj instanceof Stack) && x.n(arrayList, ((Stack) obj).m7340unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7329equalsimpl0(ArrayList<Object> arrayList, ArrayList<Object> arrayList2) {
        return x.n(arrayList, arrayList2);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m7330getSizeimpl(ArrayList<T> arrayList) {
        return arrayList.size();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7331hashCodeimpl(ArrayList<T> arrayList) {
        return arrayList.hashCode();
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static final boolean m7332isEmptyimpl(ArrayList<T> arrayList) {
        return arrayList.isEmpty();
    }

    /* renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m7333isNotEmptyimpl(ArrayList<T> arrayList) {
        return !m7332isEmptyimpl(arrayList);
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m7334peekimpl(ArrayList<T> arrayList) {
        return arrayList.get(m7330getSizeimpl(arrayList) - 1);
    }

    /* renamed from: pop-impl, reason: not valid java name */
    public static final T m7336popimpl(ArrayList<T> arrayList) {
        return arrayList.remove(m7330getSizeimpl(arrayList) - 1);
    }

    /* renamed from: push-impl, reason: not valid java name */
    public static final boolean m7337pushimpl(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }

    /* renamed from: toArray-impl, reason: not valid java name */
    public static final T[] m7338toArrayimpl(ArrayList<T> arrayList) {
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i2] = arrayList.get(i2);
        }
        return tArr;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7339toStringimpl(ArrayList<T> arrayList) {
        return "Stack(backing=" + arrayList + ')';
    }

    public boolean equals(Object obj) {
        return m7328equalsimpl(this.backing, obj);
    }

    public int hashCode() {
        return m7331hashCodeimpl(this.backing);
    }

    public String toString() {
        return m7339toStringimpl(this.backing);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ ArrayList m7340unboximpl() {
        return this.backing;
    }

    /* renamed from: peek-impl, reason: not valid java name */
    public static final T m7335peekimpl(ArrayList<T> arrayList, int i2) {
        return arrayList.get(i2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> ArrayList<T> m7326constructorimpl(ArrayList<T> arrayList) {
        return arrayList;
    }
}
