package com.waze.ui.y;

import com.waze.ui.f.ak;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ak f43848a;

    public a(ak akVar) {
        x.f(akVar, "conversationUiState");
        this.f43848a = akVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && x.n(this.f43848a, ((a) obj).f43848a);
    }

    public final int hashCode() {
        return this.f43848a.hashCode();
    }

    public final String toString() {
        return "SearchAgentUiState(conversationUiState=" + this.f43848a + ")";
    }
}
