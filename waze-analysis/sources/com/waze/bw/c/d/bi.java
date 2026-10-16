package com.waze.bw.c.d;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bi implements bs {

    /* renamed from: a, reason: collision with root package name */
    private final bt f17989a;

    public bi(bt btVar) {
        h.g.b.x.f(btVar, "vocieActionType");
        this.f17989a = btVar;
    }

    public final bt a() {
        return this.f17989a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi) && this.f17989a == ((bi) obj).f17989a;
    }

    public final int hashCode() {
        return this.f17989a.hashCode();
    }

    public final String toString() {
        return "VoiceSearchClicked(vocieActionType=" + this.f17989a + ")";
    }
}
