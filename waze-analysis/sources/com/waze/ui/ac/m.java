package com.waze.ui.ac;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f41770a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str) {
        super(null);
        x.f(str, "value");
        this.f41770a = str;
    }

    public final String a() {
        return this.f41770a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && x.n(this.f41770a, ((m) obj).f41770a);
    }

    public final int hashCode() {
        return this.f41770a.hashCode();
    }

    public final String toString() {
        return "Text(value=" + this.f41770a + ")";
    }
}
