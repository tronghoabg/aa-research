package com.waze.ui.d;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends k {

    /* renamed from: a, reason: collision with root package name */
    private final b f42145a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar) {
        super(null);
        x.f(bVar, "answer");
        this.f42145a = bVar;
    }

    public final b a() {
        return this.f42145a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && x.n(this.f42145a, ((h) obj).f42145a);
    }

    public final int hashCode() {
        return this.f42145a.hashCode();
    }

    public final String toString() {
        return "EnrichAlertAnswerSelected(answer=" + this.f42145a + ")";
    }
}
