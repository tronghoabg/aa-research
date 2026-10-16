package com.waze.ui;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f41786a;

    ae(h.g.a.a aVar) {
        this.f41786a = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, h.c.e<? super h.ab> eVar) {
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new com.waze.tide.a.c(this.f41786a, 15), eVar, 7, null);
        return objDetectTapGestures$default == h.c.a.a.f48038a ? objDetectTapGestures$default : h.ab.f48028a;
    }
}
