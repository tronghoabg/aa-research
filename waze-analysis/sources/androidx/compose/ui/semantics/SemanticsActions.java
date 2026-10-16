package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<l<List<Float>, Boolean>>> GetScrollViewportLength;
    private static final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> OnAutofillText;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<l<FillableData, Boolean>>> OnFillData;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> ScrollBy;
    private static final SemanticsPropertyKey<p<Offset, e<? super Offset>, Object>> ScrollByOffset;
    private static final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<l<Boolean, Boolean>>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt.AnonymousClass1 anonymousClass1 = SemanticsPropertiesKt.AnonymousClass1.INSTANCE;
        GetTextLayoutResult = new SemanticsPropertyKey<>("GetTextLayoutResult", true, anonymousClass1, null, 8, null);
        OnClick = new SemanticsPropertyKey<>("OnClick", true, anonymousClass1, null, 8, null);
        OnLongClick = new SemanticsPropertyKey<>("OnLongClick", true, anonymousClass1, null, 8, null);
        ScrollBy = new SemanticsPropertyKey<>("ScrollBy", true, anonymousClass1, null, 8, null);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", (p) null, 2, (o) null);
        SemanticsPropertiesKt.AnonymousClass1 anonymousClass12 = SemanticsPropertiesKt.AnonymousClass1.INSTANCE;
        ScrollToIndex = new SemanticsPropertyKey<>("ScrollToIndex", true, anonymousClass12, null, 8, null);
        OnAutofillText = new SemanticsPropertyKey<>("OnAutofillText", true, anonymousClass12, null, 8, null);
        OnFillData = new SemanticsPropertyKey<>("OnFillData", true, anonymousClass12, null, 8, null);
        SetProgress = new SemanticsPropertyKey<>("SetProgress", true, anonymousClass12, null, 8, null);
        SetSelection = new SemanticsPropertyKey<>("SetSelection", true, anonymousClass12, null, 8, null);
        SetText = new SemanticsPropertyKey<>("SetText", true, anonymousClass12, null, 8, null);
        SetTextSubstitution = new SemanticsPropertyKey<>("SetTextSubstitution", true, anonymousClass12, null, 8, null);
        ShowTextSubstitution = new SemanticsPropertyKey<>("ShowTextSubstitution", true, anonymousClass12, null, 8, null);
        ClearTextSubstitution = new SemanticsPropertyKey<>("ClearTextSubstitution", true, anonymousClass12, null, 8, null);
        InsertTextAtCursor = new SemanticsPropertyKey<>("InsertTextAtCursor", true, anonymousClass12, null, 8, null);
        OnImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, anonymousClass12, null, 8, null);
        PerformImeAction = new SemanticsPropertyKey<>("PerformImeAction", true, anonymousClass12, null, 8, null);
        CopyText = new SemanticsPropertyKey<>("CopyText", true, anonymousClass12, null, 8, null);
        CutText = new SemanticsPropertyKey<>("CutText", true, anonymousClass12, null, 8, null);
        PasteText = new SemanticsPropertyKey<>("PasteText", true, anonymousClass12, null, 8, null);
        Expand = new SemanticsPropertyKey<>("Expand", true, anonymousClass12, null, 8, null);
        Collapse = new SemanticsPropertyKey<>("Collapse", true, anonymousClass12, null, 8, null);
        Dismiss = new SemanticsPropertyKey<>("Dismiss", true, anonymousClass12, null, 8, null);
        RequestFocus = new SemanticsPropertyKey<>("RequestFocus", true, anonymousClass12, null, 8, null);
        CustomActions = new SemanticsPropertyKey<>("CustomActions", true, SemanticsActions$CustomActions$1.INSTANCE, null, 8, null);
        PageUp = new SemanticsPropertyKey<>("PageUp", true, anonymousClass12, null, 8, null);
        PageLeft = new SemanticsPropertyKey<>("PageLeft", true, anonymousClass12, null, 8, null);
        PageDown = new SemanticsPropertyKey<>("PageDown", true, anonymousClass12, null, 8, null);
        PageRight = new SemanticsPropertyKey<>("PageRight", true, anonymousClass12, null, 8, null);
        GetScrollViewportLength = new SemanticsPropertyKey<>("GetScrollViewportLength", true, anonymousClass12, null, 8, null);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<List<Float>, Boolean>>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<List<TextLayoutResult>, Boolean>>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<FillableData, Boolean>>> getOnFillData() {
        return OnFillData;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<a<Boolean>>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<p<Float, Float, Boolean>>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<p<Offset, e<? super Offset>, Object>> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<Integer, Boolean>>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<Float, Boolean>>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<q<Integer, Integer, Boolean, Boolean>>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<AnnotatedString, Boolean>>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<l<Boolean, Boolean>>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }

    public static /* synthetic */ void getOnAutofillText$annotations() {
    }

    public static /* synthetic */ void getPerformImeAction$annotations() {
    }
}
