package com.waze.bd.a;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final List f16205a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list) {
        super(null);
        x.f(list, "suggestions");
        this.f16205a = list;
    }

    public final List a() {
        return this.f16205a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && x.n(this.f16205a, ((b) obj).f16205a);
    }

    public final int hashCode() {
        return this.f16205a.hashCode();
    }

    public final String toString() {
        return "Success(suggestions=" + this.f16205a + ")";
    }
}
