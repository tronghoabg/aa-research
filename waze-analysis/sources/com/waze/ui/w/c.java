package com.waze.ui.w;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.FlingBehavior;
import com.waze.ui.w.b.bd;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final AnchoredDraggableState f43717a;

    /* renamed from: b, reason: collision with root package name */
    private FlingBehavior f43718b;

    public c(AnchoredDraggableState anchoredDraggableState) {
        h.g.b.x.f(anchoredDraggableState, "anchoredDraggableState");
        this.f43717a = anchoredDraggableState;
    }

    public final float a() {
        return this.f43717a.getOffset();
    }

    public final AnchoredDraggableState b() {
        return this.f43717a;
    }

    public final FlingBehavior c() {
        return this.f43718b;
    }

    public final bd d() {
        return (bd) this.f43717a.getCurrentValue();
    }

    public final Object e(h.c.e eVar) {
        Object objAnimateTo$default = AnchoredDraggableKt.animateTo$default(this.f43717a, bd.f43642b, null, eVar, 2, null);
        return objAnimateTo$default == h.c.a.a.f48038a ? objAnimateTo$default : h.ab.f48028a;
    }

    public final void f(FlingBehavior flingBehavior) {
        this.f43718b = flingBehavior;
    }
}
