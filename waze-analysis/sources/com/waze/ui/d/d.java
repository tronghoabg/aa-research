package com.waze.ui.d;

import com.waze.ui.w.b.au;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: a, reason: collision with root package name */
    private final au f42139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(au auVar) {
        super(auVar.a(), auVar.b());
        x.f(auVar, "subtype");
        this.f42139a = auVar;
    }

    public final au a() {
        return this.f42139a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f42139a, ((d) obj).f42139a);
    }

    public final int hashCode() {
        return this.f42139a.hashCode();
    }

    public final String toString() {
        return "ReportAnswerUiData(subtype=" + this.f42139a + ")";
    }
}
