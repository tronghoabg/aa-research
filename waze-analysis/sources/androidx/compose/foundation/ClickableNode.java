package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.IndirectPointerInputDragCycleDetectorKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.Role;
import h.ab;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    public static final int $stable = 8;
    private PointerInputChange downEvent;
    private IndirectPointerInputChange indirectDownEvent;

    private ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a<ab> aVar) {
        super(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, aVar, null);
    }

    private final void cancelInput(boolean z) {
        if (z) {
            this.indirectDownEvent = null;
        } else {
            this.downEvent = null;
        }
        handlePressInteractionCancel(z);
        m1942setGestureStateKFqyr68(GestureState.Companion.m2033getIdle7meUWtM());
    }

    private final void checkForCancellation(IndirectPointerEvent indirectPointerEvent) {
        if (this.indirectDownEvent != null) {
            List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                IndirectPointerInputChange indirectPointerInputChange = changes.get(i2);
                if (indirectPointerInputChange.isConsumed() && !x.n(indirectPointerInputChange, this.indirectDownEvent)) {
                    cancelInput(true);
                    return;
                }
            }
        }
    }

    private final void handleDownEvent(IndirectPointerInputChange indirectPointerInputChange) {
        indirectPointerInputChange.consume();
        this.indirectDownEvent = indirectPointerInputChange;
        if (getEnabled()) {
            m1942setGestureStateKFqyr68(GestureState.Companion.m2035getWaiting7meUWtM());
            handlePressInteractionStart(indirectPointerInputChange);
        }
    }

    private final void handleNonUpEventIfNeeded(IndirectPointerEvent indirectPointerEvent) {
        float touchSlop = ((ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalViewConfiguration())).getTouchSlop();
        List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            IndirectPointerInputChange indirectPointerInputChange = changes.get(i2);
            long jM9108getPositionF1C5BW0 = indirectPointerInputChange.m9108getPositionF1C5BW0();
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            if (indirectPointerInputChange2 == null) {
                x.g();
            }
            float fAbs = Math.abs(Offset.m7978getDistanceimpl(Offset.m7984minusMKHz9U(jM9108getPositionF1C5BW0, indirectPointerInputChange2.m9108getPositionF1C5BW0())));
            if (indirectPointerInputChange.isConsumed() || fAbs > touchSlop) {
                cancelInput(true);
                return;
            }
        }
    }

    /* renamed from: handleNonUpEventIfNeeded-O0kMr_c, reason: not valid java name */
    private final void m2021handleNonUpEventIfNeededO0kMr_c(PointerEvent pointerEvent, long j2) {
        long jM1933getExtendedTouchPaddinghWWAJMo = m1933getExtendedTouchPaddinghWWAJMo(j2);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.isConsumed() || PointerEventKt.m9544isOutOfBoundsjwHxaWs(pointerInputChange, j2, jM1933getExtendedTouchPaddinghWWAJMo)) {
                cancelInput(false);
                return;
            }
        }
    }

    private final void handleUpEvent(IndirectPointerInputChange indirectPointerInputChange) {
        indirectPointerInputChange.consume();
        if (getEnabled()) {
            m1942setGestureStateKFqyr68(GestureState.Companion.m2034getRecognized7meUWtM());
            IndirectPointerInputChange indirectPointerInputChange2 = this.indirectDownEvent;
            if (indirectPointerInputChange2 == null) {
                x.g();
            }
            m1936handlePressInteractionRelease3MmeM6k(indirectPointerInputChange2.m9108getPositionF1C5BW0(), true);
            getOnClick().invoke();
        }
        this.indirectDownEvent = null;
    }

    @Override // androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onCancelIndirectPointerInput() {
        cancelInput(true);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        super.onCancelPointerInput();
        cancelInput(false);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyDownEvent-ZmokQxo */
    protected final boolean mo1937onClickKeyDownEventZmokQxo(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    /* renamed from: onClickKeyUpEvent-ZmokQxo */
    protected final boolean mo1938onClickKeyUpEventZmokQxo(KeyEvent keyEvent) {
        getOnClick().invoke();
        return true;
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode
    public void onIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent, PointerEventPass pointerEventPass) {
        super.onIndirectPointerEvent(indirectPointerEvent, pointerEventPass);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                checkForCancellation(indirectPointerEvent);
                if (GestureState.m2029equalsimpl0(mo1934getGestureState7meUWtM(), GestureState.Companion.m2034getRecognized7meUWtM())) {
                    m1942setGestureStateKFqyr68(GestureState.Companion.m2033getIdle7meUWtM());
                    return;
                }
                return;
            }
            return;
        }
        if (this.indirectDownEvent == null) {
            List<IndirectPointerInputChange> changes = indirectPointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(changes.get(i2))) {
                    handleDownEvent(indirectPointerEvent.getChanges().get(0));
                    return;
                }
            }
            return;
        }
        List<IndirectPointerInputChange> changes2 = indirectPointerEvent.getChanges();
        int size2 = changes2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (!ClickableKt.changedToUp(changes2.get(i3))) {
                handleNonUpEventIfNeeded(indirectPointerEvent);
                return;
            }
        }
        handleUpEvent(indirectPointerEvent.getChanges().get(0));
    }

    @Override // androidx.compose.foundation.AbstractClickableNode, androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        super.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                checkForCancellation(pointerEvent);
                if (GestureState.m2029equalsimpl0(mo1934getGestureState7meUWtM(), GestureState.Companion.m2034getRecognized7meUWtM())) {
                    m1942setGestureStateKFqyr68(GestureState.Companion.m2033getIdle7meUWtM());
                    return;
                }
                return;
            }
            return;
        }
        if (this.downEvent == null) {
            if (TapGestureDetectorKt.isChangedToDown$default(pointerEvent, true, false, 2, null)) {
                handleDownEvent(pointerEvent.getChanges().get(0));
                return;
            }
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!PointerEventKt.changedToUp(changes.get(i2))) {
                m2021handleNonUpEventIfNeededO0kMr_c(pointerEvent, j2);
                return;
            }
        }
        handleUpEvent(pointerEvent.getChanges().get(0));
    }

    /* renamed from: update-O2vRcR0, reason: not valid java name */
    public final void m2022updateO2vRcR0(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a<ab> aVar) {
        m1943updateCommonO2vRcR0(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, aVar);
    }

    public /* synthetic */ ClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z, boolean z2, String str, Role role, a aVar, o oVar) {
        this(mutableInteractionSource, indicationNodeFactory, z, z2, str, role, aVar);
    }

    private final void handleDownEvent(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
        this.downEvent = pointerInputChange;
        if (getEnabled()) {
            m1942setGestureStateKFqyr68(GestureState.Companion.m2035getWaiting7meUWtM());
            handlePressInteractionStart(pointerInputChange);
        }
    }

    private final void handleUpEvent(PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
        if (getEnabled()) {
            m1942setGestureStateKFqyr68(GestureState.Companion.m2034getRecognized7meUWtM());
            PointerInputChange pointerInputChange2 = this.downEvent;
            if (pointerInputChange2 == null) {
                x.g();
            }
            m1936handlePressInteractionRelease3MmeM6k(pointerInputChange2.m9608getPositionF1C5BW0(), false);
            getOnClick().invoke();
        }
        this.downEvent = null;
    }

    private final void checkForCancellation(PointerEvent pointerEvent) {
        if (this.downEvent != null) {
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = changes.get(i2);
                if (pointerInputChange.isConsumed() && !x.n(pointerInputChange, this.downEvent)) {
                    cancelInput(false);
                    return;
                }
            }
        }
    }
}
