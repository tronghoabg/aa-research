package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusPropertiesImpl implements FocusProperties {
    public static final int $stable = 8;
    private boolean canFocus = true;
    private FocusRequester next = FocusRequester.Companion.getDefault();
    private FocusRequester previous = FocusRequester.Companion.getDefault();
    private FocusRequester up = FocusRequester.Companion.getDefault();
    private FocusRequester down = FocusRequester.Companion.getDefault();
    private FocusRequester left = FocusRequester.Companion.getDefault();
    private FocusRequester right = FocusRequester.Companion.getDefault();
    private FocusRequester start = FocusRequester.Companion.getDefault();
    private FocusRequester end = FocusRequester.Companion.getDefault();
    private l<? super FocusEnterExitScope, ab> onEnter = FocusPropertiesImpl$onEnter$1.INSTANCE;
    private l<? super FocusEnterExitScope, ab> onExit = FocusPropertiesImpl$onExit$1.INSTANCE;
    private Rect focusRect = FocusProperties.Companion.getUnsetFocusRect();

    @Override // androidx.compose.ui.focus.FocusProperties
    public boolean getCanFocus() {
        return this.canFocus;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getDown() {
        return this.down;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getEnd() {
        return this.end;
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
    public Rect getFocusRect() {
        return this.focusRect;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getNext() {
        return this.next;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public l<FocusEnterExitScope, ab> getOnEnter() {
        return this.onEnter;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public l<FocusEnterExitScope, ab> getOnExit() {
        return this.onExit;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getPrevious() {
        return this.previous;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getStart() {
        return this.start;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public FocusRequester getUp() {
        return this.up;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setCanFocus(boolean z) {
        this.canFocus = z;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setDown(FocusRequester focusRequester) {
        this.down = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setEnd(FocusRequester focusRequester) {
        this.end = focusRequester;
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
    public void setFocusRect(Rect rect) {
        this.focusRect = rect;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setLeft(FocusRequester focusRequester) {
        this.left = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setNext(FocusRequester focusRequester) {
        this.next = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setOnEnter(l<? super FocusEnterExitScope, ab> lVar) {
        this.onEnter = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setOnExit(l<? super FocusEnterExitScope, ab> lVar) {
        this.onExit = lVar;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setPrevious(FocusRequester focusRequester) {
        this.previous = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setRight(FocusRequester focusRequester) {
        this.right = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setStart(FocusRequester focusRequester) {
        this.start = focusRequester;
    }

    @Override // androidx.compose.ui.focus.FocusProperties
    public void setUp(FocusRequester focusRequester) {
        this.up = focusRequester;
    }
}
