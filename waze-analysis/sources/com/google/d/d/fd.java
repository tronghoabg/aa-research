package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class fd extends eq implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final fd f7617a = new fd();
    private static final long serialVersionUID = 0;

    private fd() {
    }

    private Object readResolve() {
        return f7617a;
    }

    @Override // com.google.d.d.eq
    public final eq a() {
        return eo.f7570a;
    }

    @Override // com.google.d.d.eq, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        com.google.d.b.an.B(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
