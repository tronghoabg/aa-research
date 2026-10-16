package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ymd extends yln implements Serializable {
    public static final ymd a = new ymd();
    private static final long serialVersionUID = 0;

    private ymd() {
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yln
    public final yln c() {
        return yli.a;
    }

    @Override // defpackage.yln, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
