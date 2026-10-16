package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1701o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f26548a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26549b;

    public C1701o(Object obj, String str) {
        this.f26548a = obj;
        this.f26549b = str;
    }

    public final String a() {
        return this.f26549b + "@" + System.identityHashCode(this.f26548a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1701o)) {
            return false;
        }
        C1701o c1701o = (C1701o) obj;
        return this.f26548a == c1701o.f26548a && this.f26549b.equals(c1701o.f26549b);
    }

    public final int hashCode() {
        return this.f26549b.hashCode() + (System.identityHashCode(this.f26548a) * 31);
    }
}
