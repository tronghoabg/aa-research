package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusProperties$enter$1;
import androidx.compose.ui.focus.FocusProperties$exit$1;
import androidx.compose.ui.focus.FocusProperties$onEnter$1;
import androidx.compose.ui.focus.FocusProperties$onExit$1;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import h.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CanFocusChecker implements FocusProperties {
    public static final CanFocusChecker INSTANCE = new CanFocusChecker();
    private static Boolean canFocusValue;

    private CanFocusChecker() {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        Boolean bool = canFocusValue;
        if (bool != null) {
            return bool.booleanValue();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("canFocus is read before it is written");
        throw new e();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getDown() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getEnd() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ l getEnter() {
        return FocusProperties$enter$1.INSTANCE;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ l getExit() {
        return FocusProperties$exit$1.INSTANCE;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ Rect getFocusRect() {
        return FocusProperties.Companion.getUnsetFocusRect();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getLeft() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getNext() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ l getOnEnter() {
        return FocusProperties$onEnter$1.INSTANCE;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ l getOnExit() {
        return FocusProperties$onExit$1.INSTANCE;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getPrevious() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getRight() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getStart() {
        return FocusRequester.Companion.getDefault();
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ FocusRequester getUp() {
        return FocusRequester.Companion.getDefault();
    }

    public final boolean isCanFocusSet() {
        return canFocusValue != null;
    }

    public final void reset() {
        canFocusValue = null;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        canFocusValue = Boolean.valueOf(z);
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnter(l lVar) {
        setOnEnter(FocusPropertiesKt.toUsingEnterExitScope(lVar));
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setExit(l lVar) {
        setOnExit(FocusPropertiesKt.toUsingEnterExitScope(lVar));
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setDown(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setEnd(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setFocusRect(Rect rect) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setLeft(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setNext(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setOnEnter(l lVar) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setOnExit(l lVar) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setPrevious(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setRight(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setStart(FocusRequester focusRequester) {
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public /* synthetic */ void setUp(FocusRequester focusRequester) {
    }
}
