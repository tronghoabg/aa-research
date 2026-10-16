package com.waze.main_screen.ab.a;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class i implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f25638a;

    public i(Integer num) {
        this.f25638a = num;
    }

    public final Integer a() {
        return this.f25638a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f25638a, ((i) obj).f25638a);
    }

    public final int hashCode() {
        Integer num = this.f25638a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ClosePopUp(reason=" + this.f25638a + ")";
    }
}
