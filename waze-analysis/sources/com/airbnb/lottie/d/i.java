package com.airbnb.lottie.d;

import androidx.core.util.Pair;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    Object f2285a;

    /* renamed from: b, reason: collision with root package name */
    Object f2286b;

    public final void a(Object obj, Object obj2) {
        this.f2285a = obj;
        this.f2286b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return com.waze.c.c.e.b(pair.first, this.f2285a) && com.waze.c.c.e.b(pair.second, this.f2286b);
    }

    public final int hashCode() {
        Object obj = this.f2285a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f2286b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.f2285a) + " " + String.valueOf(this.f2286b) + "}";
    }
}
