package com.google.d.d;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class eo extends eq implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final eo f7570a = new eo();
    private static final long serialVersionUID = 0;

    private eo() {
    }

    private Object readResolve() {
        return f7570a;
    }

    @Override // com.google.d.d.eq
    public final eq a() {
        return fd.f7617a;
    }

    @Override // com.google.d.d.eq, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        com.google.d.b.an.B(comparable);
        com.google.d.b.an.B(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
