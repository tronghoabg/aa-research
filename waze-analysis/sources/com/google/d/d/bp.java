package com.google.d.d;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class bp {

    /* renamed from: a, reason: collision with root package name */
    private final Object f7458a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7459b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f7460c;

    bp(Object obj, Object obj2, Object obj3) {
        this.f7458a = obj;
        this.f7459b = obj2;
        this.f7460c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f7460c;
        Object obj2 = this.f7459b;
        Object obj3 = this.f7458a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
