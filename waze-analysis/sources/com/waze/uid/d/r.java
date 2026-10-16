package com.waze.uid.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final String f44475a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44476b;

    public r(String str, boolean z) {
        this.f44475a = str;
        this.f44476b = z;
    }

    public final String a() {
        return this.f44475a;
    }

    public final boolean b() {
        return this.f44476b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return x.n(this.f44475a, rVar.f44475a) && this.f44476b == rVar.f44476b;
    }

    public final int hashCode() {
        String str = this.f44475a;
        return ((str == null ? 0 : str.hashCode()) * 31) + a.a.a(this.f44476b);
    }

    public final String toString() {
        return "WebViewConfig(title=" + this.f44475a + ", showClose=" + this.f44476b + ")";
    }
}
