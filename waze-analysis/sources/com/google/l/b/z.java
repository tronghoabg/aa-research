package com.google.l.b;

import java.lang.reflect.AccessibleObject;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
abstract class z {

    /* renamed from: b, reason: collision with root package name */
    static final z f12409b;

    static {
        z xVar = null;
        if (l.a()) {
            try {
                xVar = new x(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (xVar == null) {
            xVar = new y();
        }
        f12409b = xVar;
    }

    /* synthetic */ z() {
    }

    abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
