package androidx.compose.foundation.gestures;

import androidx.compose.foundation.GestureConnection;
import androidx.compose.foundation.GestureNodeKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DraggableKt {
    private static final int HorizontalAngleUpperBounds = 30;
    private static final q<af, Offset, e<? super ab>, Object> NoOpOnDragStarted = new DraggableKt$NoOpOnDragStarted$1(null);
    private static final q<af, Float, e<? super ab>, Object> NoOpOnDragStopped = new DraggableKt$NoOpOnDragStopped$1(null);
    private static final int VerticalAngleUpperBounds = 90;

    public static final DraggableState DraggableState(l<? super Float, ab> lVar) {
        return new DefaultDraggableState(lVar);
    }

    public static final Modifier draggable(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, q<? super af, ? super Offset, ? super e<? super ab>, ? extends Object> qVar, q<? super af, ? super Float, ? super e<? super ab>, ? extends Object> qVar2, boolean z3) {
        return modifier.then(new DraggableElement(draggableState, orientation, z, mutableInteractionSource, z2, qVar, qVar2, z3));
    }

    public static /* synthetic */ Modifier draggable$default(Modifier modifier, DraggableState draggableState, Orientation orientation, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, q qVar, q qVar2, boolean z3, int i2, Object obj) {
        q qVar3 = (i2 & 32) != 0 ? NoOpOnDragStarted : qVar;
        q qVar4 = (i2 & 64) != 0 ? NoOpOnDragStopped : qVar2;
        int i3 = i2 & 16;
        int i4 = i2 & 8;
        boolean z4 = !((i2 & 4) == 0);
        boolean z5 = (i3 == 0) & z2;
        if (i4 != 0) {
            mutableInteractionSource = null;
        }
        return draggable(modifier, draggableState, orientation, z | z4, mutableInteractionSource, z5, qVar3, qVar4, ((i2 & 128) == 0) & z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isDragAngleAlignedWithOrientation(Orientation orientation, float f2) {
        return orientation == Orientation.Horizontal ? f2 <= 30.0f : f2 > 30.0f && f2 <= 90.0f;
    }

    public static final DraggableState rememberDraggableState(l<? super Float, ab> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-183245213, i2, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:152)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = DraggableState(new l() { // from class: androidx.compose.foundation.gestures.DraggableKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return DraggableKt.rememberDraggableState$lambda$0$0(stateRememberUpdatedState, ((Float) obj).floatValue());
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        DraggableState draggableState = (DraggableState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberDraggableState$lambda$0$0(State state, float f2) {
        ((l) state.getValue()).invoke(Float.valueOf(f2));
        return ab.f48028a;
    }

    /* renamed from: toFloat-3MmeM6k, reason: not valid java name */
    public static final float m2212toFloat3MmeM6k(long j2, Orientation orientation) {
        return Float.intBitsToFloat((int) (orientation == Orientation.Vertical ? j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE : j2 >> 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toFloat-sF-c-tU, reason: not valid java name */
    public static final float m2213toFloatsFctU(long j2, Orientation orientation) {
        return orientation == Orientation.Vertical ? Velocity.m11407getYimpl(j2) : Velocity.m11406getXimpl(j2);
    }

    /* renamed from: toValidVelocity-TH1AsA0, reason: not valid java name */
    public static final long m2214toValidVelocityTH1AsA0(long j2) {
        return VelocityKt.Velocity(Float.isNaN(Velocity.m11406getXimpl(j2)) ? 0.0f : Velocity.m11406getXimpl(j2), Float.isNaN(Velocity.m11407getYimpl(j2)) ? 0.0f : Velocity.m11407getYimpl(j2));
    }

    public static final void traverseParentDraggableGestures(DelegatableNode delegatableNode, final l<? super DraggableGestureConnection, Boolean> lVar) {
        GestureNodeKt.traverseAncestorGestures(delegatableNode, new l() { // from class: androidx.compose.foundation.gestures.DraggableKt$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DraggableKt.traverseParentDraggableGestures$lambda$0(lVar, (GestureConnection) obj));
            }
        });
    }

    static final boolean traverseParentDraggableGestures$lambda$0(l lVar, GestureConnection gestureConnection) {
        if (gestureConnection instanceof DraggableGestureConnection) {
            return ((Boolean) lVar.invoke(gestureConnection)).booleanValue();
        }
        return true;
    }
}
