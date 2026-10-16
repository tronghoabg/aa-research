package com.waze.bl.b.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends b {

    /* renamed from: a, reason: collision with root package name */
    private final List f16935a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list) {
        super(null, null);
        h.g.b.x.f(list, "candidates");
        this.f16935a = list;
    }

    public final List b() {
        return this.f16935a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && h.g.b.x.n(this.f16935a, ((e) obj).f16935a);
    }

    public final int hashCode() {
        return this.f16935a.hashCode();
    }

    public final String toString() {
        return "Success(candidates=" + this.f16935a + ")";
    }
}
