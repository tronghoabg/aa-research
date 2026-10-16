package com.waze.o.d.b.b;

import com.waze.ui.f.ak;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final ak f32899a;

    public i(ak akVar) {
        x.f(akVar, "conversationUiState");
        this.f32899a = akVar;
    }

    public final ak a() {
        return this.f32899a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && x.n(this.f32899a, ((i) obj).f32899a);
    }

    public final int hashCode() {
        return this.f32899a.hashCode();
    }

    public final String toString() {
        return "CompaninioUiState(conversationUiState=" + this.f32899a + ")";
    }
}
