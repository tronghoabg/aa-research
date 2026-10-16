package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439c {

    /* renamed from: a, reason: collision with root package name */
    public final int f18658a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f18659b;

    public C1439c(int i5, Method method) throws SecurityException {
        this.f18658a = i5;
        this.f18659b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1439c)) {
            return false;
        }
        C1439c c1439c = (C1439c) obj;
        return this.f18658a == c1439c.f18658a && this.f18659b.getName().equals(c1439c.f18659b.getName());
    }

    public final int hashCode() {
        return this.f18659b.getName().hashCode() + (this.f18658a * 31);
    }
}
