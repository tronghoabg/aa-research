package com.waze.z.a.b;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.ScrollScope;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class u implements ScrollScope {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnchoredDragScope f45780a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f45781b;

    u(AnchoredDragScope anchoredDragScope, AnchoredDraggableState anchoredDraggableState) {
        this.f45780a = anchoredDragScope;
        this.f45781b = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float f2) {
        AnchoredDragScope.CC.dragTo$default(this.f45780a, this.f45781b.getOffset() + f2, 0.0f, 2, null);
        return f2;
    }
}
