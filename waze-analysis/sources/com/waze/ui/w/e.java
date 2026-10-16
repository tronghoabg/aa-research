package com.waze.ui.w;

import androidx.compose.foundation.gestures.AnchoredDragScope;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.ScrollScope;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements ScrollScope {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AnchoredDragScope f43723a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AnchoredDraggableState f43724b;

    e(AnchoredDragScope anchoredDragScope, AnchoredDraggableState anchoredDraggableState) {
        this.f43723a = anchoredDragScope;
        this.f43724b = anchoredDraggableState;
    }

    @Override // androidx.compose.foundation.gestures.ScrollScope
    public final float scrollBy(float f2) {
        AnchoredDragScope.CC.dragTo$default(this.f43723a, this.f43724b.getOffset() + f2, 0.0f, 2, null);
        return f2;
    }
}
