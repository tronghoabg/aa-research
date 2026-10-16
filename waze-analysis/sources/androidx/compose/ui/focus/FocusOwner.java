package androidx.compose.ui.focus;

import android.view.KeyEvent;
import androidx.collection.MutableObjectList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import h.g.a.a;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface FocusOwner extends FocusManager {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusOwner$-CC, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: dispatchKeyEvent-YhN2O0w$default, reason: not valid java name */
        public static /* synthetic */ boolean m7878dispatchKeyEventYhN2O0w$default(FocusOwner focusOwner, KeyEvent keyEvent, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w");
            }
            if ((i2 & 2) != 0) {
                aVar = FocusOwner$dispatchKeyEvent$1.INSTANCE;
            }
            return focusOwner.mo7872dispatchKeyEventYhN2O0w(keyEvent, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean dispatchRotaryEvent$default(FocusOwner focusOwner, RotaryScrollEvent rotaryScrollEvent, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchRotaryEvent");
            }
            if ((i2 & 2) != 0) {
                aVar = AnonymousClass1.INSTANCE;
            }
            return focusOwner.dispatchRotaryEvent(rotaryScrollEvent, aVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.focus.FocusOwner$dispatchRotaryEvent$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends y implements a<Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return false;
        }
    }

    /* renamed from: clearFocus-I7lrPNg, reason: not valid java name */
    boolean mo7870clearFocusI7lrPNg(boolean z, boolean z2, boolean z3, int i2);

    void clearOwnerFocus();

    void dispatchIndirectPointerCancel();

    boolean dispatchIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent);

    /* renamed from: dispatchInterceptedSoftKeyboardEvent-ZmokQxo, reason: not valid java name */
    boolean mo7871dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent keyEvent);

    /* renamed from: dispatchKeyEvent-YhN2O0w, reason: not valid java name */
    boolean mo7872dispatchKeyEventYhN2O0w(KeyEvent keyEvent, a<Boolean> aVar);

    boolean dispatchRotaryEvent(RotaryScrollEvent rotaryScrollEvent, a<Boolean> aVar);

    /* renamed from: focusSearch-ULY8qGw, reason: not valid java name */
    Boolean mo7873focusSearchULY8qGw(int i2, Rect rect, l<? super FocusTargetNode, Boolean> lVar);

    void focusTargetAvailable();

    FocusTargetNode getActiveFocusTargetNode();

    Rect getFocusRect();

    MutableObjectList<FocusListener> getListeners();

    Modifier getModifier();

    FocusState getRootState();

    boolean hasFocusableContent();

    boolean hasNonInteropFocusableContent();

    boolean isFocusCaptured();

    /* renamed from: moveFocus-aToIllA, reason: not valid java name */
    boolean mo7874moveFocusaToIllA(int i2, boolean z);

    void releaseFocus();

    /* renamed from: requestOwnerFocus-7o62pno, reason: not valid java name */
    boolean mo7875requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect);

    /* renamed from: resetFocus-3ESFkO8, reason: not valid java name */
    boolean mo7876resetFocus3ESFkO8(int i2);

    void scheduleInvalidation(FocusEventModifierNode focusEventModifierNode);

    void scheduleInvalidation(FocusTargetNode focusTargetNode);

    void scheduleInvalidationForOwner();

    void setActiveFocusTargetNode(FocusTargetNode focusTargetNode);

    void setFocusCaptured(boolean z);

    /* renamed from: takeFocus-aToIllA, reason: not valid java name */
    boolean mo7877takeFocusaToIllA(int i2, Rect rect);
}
