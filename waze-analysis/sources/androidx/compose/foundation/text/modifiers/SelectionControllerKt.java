package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.ab;
import h.c.e;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1, java.lang.Object] */
    public static final Modifier makeDefaultSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j2, final a<? extends LayoutCoordinates> aVar) {
        final ?? r0 = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$longPressDragObserver$1
            private long lastPosition = Offset.Companion.m7996getZeroF1C5BW0();
            private long dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
            private SelectionAdjustment selectionAdjustmentMode = SelectionAdjustment.Companion.getNone();

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            public final SelectionAdjustment getSelectionAdjustmentMode() {
                return this.selectionAdjustmentMode;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo3386onDragk4lQ0M(long j3) {
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j4 = j2;
                    if (layoutCoordinatesInvoke.isAttached() && SelectionRegistrarKt.hasSelection(selectionRegistrar2, j4)) {
                        long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(this.dragTotalDistance, j3);
                        this.dragTotalDistance = jM7985plusMKHz9U;
                        long jM7985plusMKHz9U2 = Offset.m7985plusMKHz9U(this.lastPosition, jM7985plusMKHz9U);
                        if (selectionRegistrar2.mo3906notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, jM7985plusMKHz9U2, this.lastPosition, false, this.selectionAdjustmentMode, true)) {
                            this.lastPosition = jM7985plusMKHz9U2;
                            this.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                        }
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-3MmeM6k */
            public void mo3387onStart3MmeM6k(long j3, SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!layoutCoordinatesInvoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo3907notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, j3, this.selectionAdjustmentMode, true);
                    this.lastPosition = j3;
                }
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
                    this.dragTotalDistance = Offset.Companion.m7996getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j2)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            public final void setDragTotalDistance(long j3) {
                this.dragTotalDistance = j3;
            }

            public final void setLastPosition(long j3) {
                this.lastPosition = j3;
            }

            public final void setSelectionAdjustmentMode(SelectionAdjustment selectionAdjustment) {
                this.selectionAdjustmentMode = selectionAdjustment;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo3385onDownk4lQ0M(long j3) {
            }
        };
        final ?? r1 = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeDefaultSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m7996getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo3762onDrag3MmeM6k(long j3, SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j4 = j2;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j4)) {
                    return false;
                }
                if (!selectionRegistrar2.mo3906notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, j3, this.lastPosition, false, selectionAdjustment, false)) {
                    return true;
                }
                this.lastPosition = j3;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo3763onExtendk4lQ0M(long j3) {
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j4 = j2;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo3906notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, j3, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j3;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j4);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo3764onExtendDragk4lQ0M(long j3) {
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return true;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j4 = j2;
                if (!layoutCoordinatesInvoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j4)) {
                    return false;
                }
                if (!selectionRegistrar2.mo3906notifySelectionUpdatenjBpvok(layoutCoordinatesInvoke, j3, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    return true;
                }
                this.lastPosition = j3;
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-9KIMszo */
            public boolean mo3765onStart9KIMszo(long j3, SelectionAdjustment selectionAdjustment, int i2) {
                LayoutCoordinates layoutCoordinatesInvoke = aVar.invoke();
                if (layoutCoordinatesInvoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j4 = j2;
                if (!layoutCoordinatesInvoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo3907notifySelectionUpdateStartubNVwUQ(layoutCoordinatesInvoke, j3, selectionAdjustment, false);
                this.lastPosition = j3;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j4);
            }

            public final void setLastPosition(long j3) {
                this.lastPosition = j3;
            }
        };
        return SuspendingPointerInputFilterKt.pointerInput(Modifier.Companion, (Object) r1, (Object) r0, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt.makeDefaultSelectionModifier.1
            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objAwaitSelectionGestures = SelectionGesturesKt.awaitSelectionGestures(pointerInputScope, r1, r0, eVar);
                return objAwaitSelectionGestures == h.c.a.a.f48038a ? objAwaitSelectionGestures : ab.f48028a;
            }
        });
    }
}
