package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    private PointerEvent lastEventDispatchedToInitialPass;
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent, boolean z) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).isConsumed()) {
                stopDispatching(pointerEvent);
                return;
            }
        }
        LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
        if (layoutCoordinates$ui == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        PointerInteropUtils_androidKt.m9670toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui.mo9746localToRootMKHz9U(Offset.Companion.m7996getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this, this.this$0));
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            if (z) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    changes.get(i3).consume();
                }
            }
            InternalPointerEvent internalPointerEvent$ui = pointerEvent.getInternalPointerEvent$ui();
            if (internalPointerEvent$ui != null) {
                internalPointerEvent$ui.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui());
            }
        }
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui(false);
        this.lastEventDispatchedToInitialPass = null;
    }

    private final void stopDispatching(PointerEvent pointerEvent) {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            LayoutCoordinates layoutCoordinates$ui = getLayoutCoordinates$ui();
            if (layoutCoordinates$ui == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            PointerInteropUtils_androidKt.m9669toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui.mo9746localToRootMKHz9U(Offset.Companion.m7996getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$stopDispatching$1(this.this$0));
        }
        this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo9633onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        List<PointerInputChange> list = changes;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                z = false;
                break;
            }
        }
        z = true;
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (changes.get(i3).isConsumed()) {
                z2 = false;
                break;
            }
        }
        z2 = true;
        if (this.this$0.getDisallowIntercept$ui()) {
            z3 = true;
        } else {
            int size3 = list.size();
            int i4 = 0;
            while (true) {
                if (i4 < size3) {
                    PointerInputChange pointerInputChange2 = changes.get(i4);
                    if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange2) || PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                        break;
                    } else {
                        i4++;
                    }
                } else if (z2) {
                    break;
                } else {
                    z3 = false;
                }
            }
            z3 = true;
        }
        if (this.state != PointerInteropFilter.DispatchToViewState.NotDispatching) {
            if (pointerEventPass == PointerEventPass.Initial && z3) {
                this.lastEventDispatchedToInitialPass = pointerEvent;
                dispatchToView(pointerEvent, !z || this.this$0.getDisallowIntercept$ui());
            }
            if (pointerEventPass == PointerEventPass.Main && z && x.n(pointerEvent, this.lastEventDispatchedToInitialPass) && this.this$0.getDisallowIntercept$ui()) {
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    changes.get(i5).consume();
                }
            }
            if (pointerEventPass == PointerEventPass.Final && !z3 && !x.n(pointerEvent, this.lastEventDispatchedToInitialPass)) {
                dispatchToView(pointerEvent, true);
            }
        }
        if (pointerEventPass == PointerEventPass.Final) {
            int size5 = list.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    reset();
                    break;
                } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i6))) {
                    break;
                } else {
                    i6++;
                }
            }
            if (x.n(pointerEvent, this.lastEventDispatchedToInitialPass) && z) {
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        break;
                    }
                    if (!changes.get(i7).isConsumed()) {
                        i7++;
                    } else if (!this.this$0.getDisallowIntercept$ui()) {
                        stopDispatching(pointerEvent);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    changes.get(i8).consume();
                }
            }
        }
    }
}
