package com.waze.y;

import com.waze.z.a.b.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f45547a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super((byte[]) null);
        x.f(str, "carId");
        this.f45547a = str;
    }

    public final String a() {
        return this.f45547a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && x.n(this.f45547a, ((c) obj).f45547a);
    }

    public final int hashCode() {
        return this.f45547a.hashCode();
    }

    public final String toString() {
        return "ChangeCopilotCar(carId=" + this.f45547a + ")";
    }
}
