package com.google.l.b;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends z {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Method f12408a;

    x(Method method) {
        this.f12408a = method;
    }

    @Override // com.google.l.b.z
    public final boolean a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f12408a.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e2) {
            throw new RuntimeException("Failed invoking canAccess", e2);
        }
    }
}
