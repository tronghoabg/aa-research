package com.waze.ui.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j implements p {

    /* renamed from: a, reason: collision with root package name */
    private final String f41890a;

    public j(String str) {
        h.g.b.x.f(str, "value");
        this.f41890a = str;
    }

    public final String a() {
        return this.f41890a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && h.g.b.x.n(this.f41890a, ((j) obj).f41890a);
    }

    public final int hashCode() {
        return this.f41890a.hashCode();
    }

    public final String toString() {
        return "SearchValueChanged(value=" + this.f41890a + ")";
    }
}
