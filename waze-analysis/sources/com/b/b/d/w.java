package com.b.b.d;

import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final int f2699a;

    private w(int i2) {
        this.f2699a = i2;
    }

    public static w a(int i2) {
        return new w(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f2699a == ((w) obj).f2699a;
    }

    public final int hashCode() {
        return this.f2699a;
    }

    public final String toString() {
        return String.format(Locale.US, "SubscriptionId{%d}", Integer.valueOf(this.f2699a));
    }
}
