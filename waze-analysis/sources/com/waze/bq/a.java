package com.waze.bq;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.y.a f17220a;

    public a(com.waze.ui.y.a aVar) {
        x.f(aVar, "uiState");
        this.f17220a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f17220a, ((a) obj).f17220a);
    }

    public final int hashCode() {
        return this.f17220a.hashCode();
    }

    public final String toString() {
        return "SearchAgentState(uiState=" + this.f17220a + ")";
    }
}
