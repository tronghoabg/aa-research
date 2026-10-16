package androidx.constraintlayout.compose;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.InspectableValueKt;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.ap;
import h.g.b.w;
import kotlinx.coroutines.a.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionDragHandlerKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.constraintlayout.compose.MotionDragHandlerKt$detectDragGesturesWhenNeeded$2, reason: invalid class name */
    final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ l<Offset, Boolean> $onAcceptFirstDown;
        final /* synthetic */ p<PointerInputChange, Offset, ab> $onDrag;
        final /* synthetic */ a<ab> $onDragCancel;
        final /* synthetic */ a<ab> $onDragEnd;
        final /* synthetic */ l<Offset, ab> $onDragStart;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super Offset, Boolean> lVar, l<? super Offset, ab> lVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, a<ab> aVar, a<ab> aVar2, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$onAcceptFirstDown = lVar;
            this.$onDragStart = lVar2;
            this.$onDrag = pVar;
            this.$onDragCancel = aVar;
            this.$onDragEnd = aVar2;
        }

        static final ab invokeSuspend$lambda$0(ap apVar, PointerInputChange pointerInputChange, Offset offset) {
            pointerInputChange.consume();
            apVar.f48104a = offset.m7990unboximpl();
            return ab.f48028a;
        }

        static final ab invokeSuspend$lambda$1(p pVar, PointerInputChange pointerInputChange) {
            pVar.invoke(pointerInputChange, Offset.m7969boximpl(PointerEventKt.positionChange(pointerInputChange)));
            pointerInputChange.consume();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$onAcceptFirstDown, this.$onDragStart, this.$onDrag, this.$onDragCancel, this.$onDragEnd, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
        
            if (r12 != r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[PHI: r1 r4 r5 r12
  0x0092: PHI (r1v5 h.g.b.ap) = (r1v4 h.g.b.ap), (r1v13 h.g.b.ap) binds: [B:20:0x0090, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r4v8 androidx.compose.ui.input.pointer.PointerInputChange) = 
  (r4v7 androidx.compose.ui.input.pointer.PointerInputChange)
  (r4v11 androidx.compose.ui.input.pointer.PointerInputChange)
 binds: [B:20:0x0090, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r5v8 androidx.compose.ui.input.pointer.AwaitPointerEventScope) = 
  (r5v7 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
  (r5v10 androidx.compose.ui.input.pointer.AwaitPointerEventScope)
 binds: [B:20:0x0090, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r12v7 java.lang.Object) = (r12v6 java.lang.Object), (r12v0 java.lang.Object) binds: [B:20:0x0090, B:10:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0090 -> B:21:0x0092). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 234
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionDragHandlerKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWhenNeeded(PointerInputScope pointerInputScope, l<? super Offset, Boolean> lVar, l<? super Offset, ab> lVar2, a<ab> aVar, a<ab> aVar2, p<? super PointerInputChange, ? super Offset, ab> pVar, e<? super ab> eVar) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass2(lVar, lVar2, pVar, aVar2, aVar, null), eVar);
        return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
    }

    public static final Modifier motionPointerInput(Modifier modifier, final Object obj, final MutableFloatState mutableFloatState, final MotionMeasurer motionMeasurer) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new MotionDragHandlerKt$motionPointerInput$$inlined$debugInspectorInfo$1(obj, mutableFloatState, motionMeasurer) : InspectableValueKt.getNoInspectorInfo(), new q() { // from class: androidx.constraintlayout.compose.MotionDragHandlerKt$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                return MotionDragHandlerKt.motionPointerInput$lambda$1(motionMeasurer, obj, mutableFloatState, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        });
    }

    static final Modifier motionPointerInput$lambda$1(MotionMeasurer motionMeasurer, Object obj, MutableFloatState mutableFloatState, Modifier modifier, Composer composer, int i2) {
        composer.startReplaceGroup(146198586);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(146198586, i2, -1, "androidx.constraintlayout.compose.motionPointerInput.<anonymous> (MotionDragHandler.kt:61)");
        }
        if (motionMeasurer.getTransition().hasOnSwipe()) {
            boolean zChanged = composer.changed(obj);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TransitionHandler(motionMeasurer, mutableFloatState);
                composer.updateRememberedValue(objRememberedValue);
            }
            TransitionHandler transitionHandler = (TransitionHandler) objRememberedValue;
            boolean zChanged2 = composer.changed(obj);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = w.c(-1, null, null, 6);
                composer.updateRememberedValue(objRememberedValue2);
            }
            o oVar = (o) objRememberedValue2;
            boolean zChangedInstance = composer.changedInstance(transitionHandler) | composer.changedInstance(oVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (p) new MotionDragHandlerKt$motionPointerInput$2$1$1(transitionHandler, oVar, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.LaunchedEffect(obj, (p<? super af, ? super e<? super ab>, ? extends Object>) objRememberedValue3, composer, 0);
            boolean zChangedInstance2 = composer.changedInstance(transitionHandler) | composer.changedInstance(oVar);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (p) new MotionDragHandlerKt$motionPointerInput$2$2$1(transitionHandler, oVar, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            modifier = modifier.then(new SuspendPointerInputElement(obj, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) objRememberedValue4), 6, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier;
    }
}
