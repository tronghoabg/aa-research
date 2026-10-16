package com.google.e.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f8464a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f8465b;

    z(Object obj, Object obj2) {
        this.f8464a = obj2;
        this.f8465b = obj;
    }

    public static z a(y yVar, Class cls) {
        return new z(cls, yVar);
    }

    public static z d(x xVar, String str) {
        return new z(str, xVar);
    }

    public final Class b() {
        return (Class) this.f8465b;
    }

    public final String c() {
        return (String) this.f8465b;
    }
}
