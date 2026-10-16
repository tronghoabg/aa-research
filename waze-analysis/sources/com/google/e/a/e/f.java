package com.google.e.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f8438a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8439b;

    f(Object obj, Object obj2) {
        this.f8438a = obj2;
        this.f8439b = obj;
    }

    public static f a(e eVar, Class cls) {
        return new f(cls, eVar);
    }

    public static f d(d dVar, String str) {
        return new f(str, dVar);
    }

    public final Class b() {
        return (Class) this.f8439b;
    }

    public final String c() {
        return (String) this.f8439b;
    }
}
