package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dd {

    /* renamed from: a, reason: collision with root package name */
    private final dc f30051a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30052b;

    public dd(dc dcVar, List list) {
        h.g.b.x.f(dcVar, "parameters");
        h.g.b.x.f(list, "options");
        this.f30051a = dcVar;
        this.f30052b = list;
    }

    public final dc a() {
        return this.f30051a;
    }

    public final List b() {
        return this.f30052b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd)) {
            return false;
        }
        dd ddVar = (dd) obj;
        return h.g.b.x.n(this.f30051a, ddVar.f30051a) && h.g.b.x.n(this.f30052b, ddVar.f30052b);
    }

    public final int hashCode() {
        return (this.f30051a.hashCode() * 31) + this.f30052b.hashCode();
    }

    public final String toString() {
        return "ParamsAndOptions(parameters=" + this.f30051a + ", options=" + this.f30052b + ")";
    }
}
