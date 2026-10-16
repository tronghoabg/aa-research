package androidx.compose.foundation.gestures;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Draggable2DKt {
    private static final l<Offset, ab> NoOpOnDragStart = new l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };
    private static final l<Velocity, ab> NoOpOnDragStop = new l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda2
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ab.f48028a;
        }
    };

    public static final Draggable2DState Draggable2DState(l<? super Offset, ab> lVar) {
        return new DefaultDraggable2DState(lVar);
    }

    public static final Modifier draggable2D(Modifier modifier, Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, l<? super Offset, ab> lVar, l<? super Velocity, ab> lVar2, boolean z3) {
        return modifier.then(new Draggable2DElement(draggable2DState, z, mutableInteractionSource, z2, lVar, lVar2, z3));
    }

    public static /* synthetic */ Modifier draggable2D$default(Modifier modifier, Draggable2DState draggable2DState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, l lVar, l lVar2, boolean z3, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            lVar = NoOpOnDragStart;
        }
        l lVar3 = lVar;
        if ((i2 & 32) != 0) {
            lVar2 = NoOpOnDragStop;
        }
        l lVar4 = lVar2;
        int i3 = i2 & 8;
        int i4 = i2 & 4;
        boolean z4 = !((i2 & 2) == 0);
        boolean z5 = (i3 == 0) & z2;
        if (i4 != 0) {
            mutableInteractionSource = null;
        }
        return draggable2D(modifier, draggable2DState, z | z4, mutableInteractionSource, z5, lVar3, lVar4, ((i2 & 64) == 0) & z3);
    }

    public static final Draggable2DState rememberDraggable2DState(l<? super Offset, ab> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1150277615, i2, -1, "androidx.compose.foundation.gestures.rememberDraggable2DState (Draggable2D.kt:106)");
        }
        final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = Draggable2DState(new l() { // from class: androidx.compose.foundation.gestures.Draggable2DKt$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Draggable2DKt.rememberDraggable2DState$lambda$0$0(stateRememberUpdatedState, (Offset) obj);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        Draggable2DState draggable2DState = (Draggable2DState) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return draggable2DState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab rememberDraggable2DState$lambda$0$0(State state, Offset offset) {
        ((l) state.getValue()).invoke(offset);
        return ab.f48028a;
    }
}
