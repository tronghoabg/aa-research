package com.google.l.b;

import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class af extends ah {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f12338a;

    af(Method method) {
        this.f12338a = method;
    }

    @Override // com.google.l.b.ah
    public final Object a(Class cls) {
        ah.b(cls);
        return this.f12338a.invoke(null, cls, Object.class);
    }
}
