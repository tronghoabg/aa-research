package com.waze.ui.b;

import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final SwipeableState f41948a;

    /* renamed from: b, reason: collision with root package name */
    private final MutableState f41949b;

    public a(SwipeableState swipeableState) {
        h.g.b.x.f(swipeableState, "swipeableState");
        this.f41948a = swipeableState;
        this.f41949b = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private final void k(boolean z) {
        this.f41949b.setValue(Boolean.valueOf(z));
    }

    public final float a() {
        return this.f41948a.getOffset().getValue().floatValue();
    }

    public final SwipeableState b() {
        return this.f41948a;
    }

    public final e c() {
        return (e) this.f41948a.getTargetValue();
    }

    public final Object d(h.c.e eVar) {
        Object objAnimateTo$default;
        SwipeableState swipeableState = this.f41948a;
        Object currentValue = swipeableState.getCurrentValue();
        e eVar2 = e.f42052a;
        return (currentValue != eVar2 && (objAnimateTo$default = SwipeableState.animateTo$default(swipeableState, eVar2, null, eVar, 2, null)) == h.c.a.a.f48038a) ? objAnimateTo$default : h.ab.f48028a;
    }

    public final Object e(h.c.e eVar) {
        Object objAnimateTo$default;
        SwipeableState swipeableState = this.f41948a;
        Object currentValue = swipeableState.getCurrentValue();
        e eVar2 = e.f42054c;
        return (currentValue != eVar2 && (objAnimateTo$default = SwipeableState.animateTo$default(swipeableState, eVar2, null, eVar, 2, null)) == h.c.a.a.f48038a) ? objAnimateTo$default : h.ab.f48028a;
    }

    public final Object f(h.c.e eVar) {
        Object objAnimateTo$default;
        SwipeableState swipeableState = this.f41948a;
        Object currentValue = swipeableState.getCurrentValue();
        e eVar2 = e.f42053b;
        return (currentValue != eVar2 && (objAnimateTo$default = SwipeableState.animateTo$default(swipeableState, eVar2, null, eVar, 2, null)) == h.c.a.a.f48038a) ? objAnimateTo$default : h.ab.f48028a;
    }

    public final void g() {
        k(false);
    }

    public final void h() {
        k(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f41949b.getValue()).booleanValue();
    }

    public final boolean j() {
        return this.f41948a.isAnimationRunning();
    }
}
