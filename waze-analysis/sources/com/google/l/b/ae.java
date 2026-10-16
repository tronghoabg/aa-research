package com.google.l.b;

import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ae extends ah {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f12336a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f12337b;

    ae(Method method, int i2) {
        this.f12336a = method;
        this.f12337b = i2;
    }

    @Override // com.google.l.b.ah
    public final Object a(Class cls) {
        ah.b(cls);
        return this.f12336a.invoke(null, cls, Integer.valueOf(this.f12337b));
    }
}
