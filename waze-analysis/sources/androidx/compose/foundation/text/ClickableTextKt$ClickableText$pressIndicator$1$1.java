package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.text.TextLayoutResult;
import h.ab;
import h.c.a.a;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ClickableTextKt$ClickableText$pressIndicator$1$1 implements PointerInputEventHandler {
    final /* synthetic */ MutableState<TextLayoutResult> $layoutResult;
    final /* synthetic */ l<Integer, ab> $onClick;

    /* JADX WARN: Multi-variable type inference failed */
    ClickableTextKt$ClickableText$pressIndicator$1$1(MutableState<TextLayoutResult> mutableState, l<? super Integer, ab> lVar) {
        this.$layoutResult = mutableState;
        this.$onClick = lVar;
    }

    static final ab invoke$lambda$0(MutableState mutableState, l lVar, Offset offset) {
        TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState.getValue();
        if (textLayoutResult != null) {
            lVar.invoke(Integer.valueOf(textLayoutResult.m10516getOffsetForPositionk4lQ0M(offset.m7990unboximpl())));
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        final MutableState<TextLayoutResult> mutableState = this.$layoutResult;
        final l<Integer, ab> lVar = this.$onClick;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new l() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ClickableTextKt$ClickableText$pressIndicator$1$1.invoke$lambda$0(mutableState, lVar, (Offset) obj);
            }
        }, eVar, 7, null);
        return objDetectTapGestures$default == a.f48038a ? objDetectTapGestures$default : ab.f48028a;
    }
}
