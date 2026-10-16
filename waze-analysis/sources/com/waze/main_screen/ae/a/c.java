package com.waze.main_screen.ae.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f25718a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25719b;

    public c(String str, boolean z) {
        x.f(str, "companyName");
        this.f25718a = str;
        this.f25719b = z;
    }

    public final String a() {
        return this.f25718a;
    }

    public final boolean b() {
        return this.f25719b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f25718a, cVar.f25718a) && this.f25719b == cVar.f25719b;
    }

    public final int hashCode() {
        return (this.f25718a.hashCode() * 31) + a.a.a(this.f25719b);
    }

    public final String toString() {
        return "TooltipData(companyName=" + this.f25718a + ", withToast=" + this.f25719b + ")";
    }
}
