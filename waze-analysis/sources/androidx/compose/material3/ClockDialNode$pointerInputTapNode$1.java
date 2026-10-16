package androidx.compose.material3;

import androidx.compose.foundation.gestures.PressGestureScope;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.media3.muxer.MuxerUtil;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ClockDialNode$pointerInputTapNode$1 implements PointerInputEventHandler {
    final /* synthetic */ ClockDialNode this$0;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements q<PressGestureScope, Offset, e<? super ab>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ ClockDialNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClockDialNode clockDialNode, e<? super AnonymousClass1> eVar) {
            super(3, eVar);
            this.this$0 = clockDialNode;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(PressGestureScope pressGestureScope, Offset offset, e<? super ab> eVar) {
            return m4535invoked4ec7I(pressGestureScope, offset.m7990unboximpl(), eVar);
        }

        /* renamed from: invoke-d-4ec7I, reason: not valid java name */
        public final Object m4535invoked4ec7I(PressGestureScope pressGestureScope, long j2, e<? super ab> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, eVar);
            anonymousClass1.J$0 = j2;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            long j2 = this.J$0;
            FocusManager.CC.clearFocus$default((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalFocusManager()), false, 1, null);
            this.this$0.offsetX = Float.intBitsToFloat((int) (j2 >> 32));
            this.this$0.offsetY = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            return ab.f48028a;
        }
    }

    ClockDialNode$pointerInputTapNode$1(ClockDialNode clockDialNode) {
        this.this$0 = clockDialNode;
    }

    static final ab invoke$lambda$0(ClockDialNode clockDialNode, Offset offset) {
        FocusManager.CC.clearFocus$default((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(clockDialNode, CompositionLocalsKt.getLocalFocusManager()), false, 1, null);
        aj.z(clockDialNode.getCoroutineScope(), null, null, new ClockDialNode$pointerInputTapNode$1$2$1(clockDialNode, offset, null), 3);
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        final ClockDialNode clockDialNode = this.this$0;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new l() { // from class: androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ClockDialNode$pointerInputTapNode$1.invoke$lambda$0(clockDialNode, (Offset) obj);
            }
        }, eVar, 3, null);
        return objDetectTapGestures$default == a.f48038a ? objDetectTapGestures$default : ab.f48028a;
    }
}
