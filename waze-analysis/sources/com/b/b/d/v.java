package com.b.b.d;

import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final int f2698a;

    private v(int i2) {
        this.f2698a = i2;
    }

    public static v b(int i2) {
        return new v(i2);
    }

    public final int a() {
        return this.f2698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f2698a == ((v) obj).f2698a;
    }

    public final int hashCode() {
        return this.f2698a;
    }

    public final String toString() {
        return String.format(Locale.US, "RequestId{%d}", Integer.valueOf(this.f2698a));
    }
}
