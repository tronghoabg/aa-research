package com.waze.sharedui.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class i extends n {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38910a;

    public i(Object obj) {
        super(null);
        this.f38910a = obj;
    }

    public final Object a() {
        return this.f38910a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f38910a, ((i) obj).f38910a);
    }

    public final int hashCode() {
        Object obj = this.f38910a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Data(data=" + this.f38910a + ")";
    }
}
