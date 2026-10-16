package com.waze.ui.e;

import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f42221a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f42222b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f42223c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MutableState f42224d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MutableState f42225e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Transition f42226f;

    k(af afVar, float f2, v vVar, MutableState mutableState, MutableState mutableState2, Transition transition) {
        this.f42221a = afVar;
        this.f42222b = f2;
        this.f42223c = vVar;
        this.f42224d = mutableState;
        this.f42225e = mutableState2;
        this.f42226f = transition;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, h.c.e<? super h.ab> eVar) {
        final af afVar = this.f42221a;
        float f2 = this.f42222b;
        final MutableState mutableState = this.f42225e;
        final v vVar = this.f42223c;
        MutableState mutableState2 = this.f42224d;
        f fVar = new f(afVar, f2, vVar, mutableState2, mutableState, 0);
        h.g.a.a aVar = new h.g.a.a() { // from class: com.waze.ui.e.g
            @Override // h.g.a.a
            public final Object invoke() {
                MutableState mutableState3 = mutableState;
                if (w.t(mutableState3) != null) {
                    throw null;
                }
                aj.z(afVar, null, null, new j(vVar, null, 0), 3);
                mutableState3.setValue(null);
                return h.ab.f48028a;
            }
        };
        final Transition transition = this.f42226f;
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, fVar, aVar, new h.g.a.a() { // from class: com.waze.ui.e.h
            @Override // h.g.a.a
            public final Object invoke() {
                Transition transition2 = transition;
                if (transition2.isRunning() && transition2.getTargetState() == x.f42258g) {
                    MutableState mutableState3 = mutableState;
                    aj.z(afVar, null, null, new j(vVar, (h.c.e) null, 2, (char[]) null), 3);
                    mutableState3.setValue(null);
                }
                return h.ab.f48028a;
            }
        }, new i(f2, mutableState2, mutableState, 0), eVar);
        return objDetectDragGesturesAfterLongPress == h.c.a.a.f48038a ? objDetectDragGesturesAfterLongPress : h.ab.f48028a;
    }
}
