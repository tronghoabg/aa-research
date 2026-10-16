package androidx.compose.material3;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ScrimKt$Scrim$dismissModifier$1$1 implements PointerInputEventHandler {
    final /* synthetic */ a<ab> $onClick;

    ScrimKt$Scrim$dismissModifier$1$1(a<ab> aVar) {
        this.$onClick = aVar;
    }

    static final ab invoke$lambda$0(a aVar, Offset offset) {
        aVar.invoke();
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        final a<ab> aVar = this.$onClick;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new l() { // from class: androidx.compose.material3.ScrimKt$Scrim$dismissModifier$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ScrimKt$Scrim$dismissModifier$1$1.invoke$lambda$0(aVar, (Offset) obj);
            }
        }, eVar, 7, null);
        return objDetectTapGestures$default == h.c.a.a.f48038a ? objDetectTapGestures$default : ab.f48028a;
    }
}
