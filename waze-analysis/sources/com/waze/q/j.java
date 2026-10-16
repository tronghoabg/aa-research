package com.waze.q;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f33475a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33476b;

    public j(String str, String str2) {
        x.f(str, "content");
        x.f(str2, "buttonText");
        this.f33475a = str;
        this.f33476b = str2;
    }

    public final String a() {
        return this.f33476b;
    }

    public final String b() {
        return this.f33475a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return x.n(this.f33475a, jVar.f33475a) && x.n(this.f33476b, jVar.f33476b);
    }

    public final int hashCode() {
        return (this.f33475a.hashCode() * 31) + this.f33476b.hashCode();
    }

    public final String toString() {
        return "ConsentBumpState(content=" + this.f33475a + ", buttonText=" + this.f33476b + ")";
    }
}
