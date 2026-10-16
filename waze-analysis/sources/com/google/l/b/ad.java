package com.google.l.b;

import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ad extends ah {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f12334a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f12335b;

    ad(Method method, Object obj) {
        this.f12334a = method;
        this.f12335b = obj;
    }

    @Override // com.google.l.b.ah
    public final Object a(Class cls) {
        ah.b(cls);
        return this.f12334a.invoke(this.f12335b, cls);
    }
}
