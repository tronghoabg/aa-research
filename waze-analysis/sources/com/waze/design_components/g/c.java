package com.waze.design_components.g;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f23462a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23463b;

    public c(Integer num, String str) {
        this.f23462a = num;
        this.f23463b = str;
    }

    public final Integer a() {
        return this.f23462a;
    }

    public final String b() {
        return this.f23463b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f23462a, cVar.f23462a) && x.n(this.f23463b, cVar.f23463b);
    }

    public final int hashCode() {
        Integer num = this.f23462a;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.f23463b;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ResolvedTextAttr(referenceId=" + this.f23462a + ", hardCodedValue=" + this.f23463b + ")";
    }
}
