package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", true, SemanticsProperties$ContentDescription$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", true);
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", true);
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", true, SemanticsProperties$PaneTitle$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<ab> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", true);
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", true);
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", true);
    private static final SemanticsPropertyKey<ab> Heading = new SemanticsPropertyKey<>("Heading", true);
    private static final SemanticsPropertyKey<ab> TextEntryKey = new SemanticsPropertyKey<>("TextEntryKey", true);
    private static final SemanticsPropertyKey<ab> Disabled = new SemanticsPropertyKey<>("Disabled", true);
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", true);
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", true);
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", true);
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<Boolean> IsSensitiveData = new SemanticsPropertyKey<>("IsSensitiveData", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<ab> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.INSTANCE);
    private static final SemanticsPropertyKey<ab> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", SemanticsProperties$HideFromAccessibility$1.INSTANCE);
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", SemanticsProperties$ContentType$1.INSTANCE);
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", SemanticsProperties$ContentDataType$1.INSTANCE);
    private static final SemanticsPropertyKey<FillableData> FillableData = new SemanticsPropertyKey<>("FillableData", SemanticsProperties$FillableData$1.INSTANCE);
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", SemanticsProperties$TraversalIndex$1.INSTANCE);
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", true);
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", true);
    private static final SemanticsPropertyKey<ab> IsPopup = new SemanticsPropertyKey<>("IsPopup", true, SemanticsProperties$IsPopup$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<ab> IsDialog = new SemanticsPropertyKey<>("IsDialog", true, SemanticsProperties$IsDialog$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<Role> Role = new SemanticsPropertyKey<>("Role", true, SemanticsProperties$Role$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, SemanticsProperties$TestTag$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<ab> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, SemanticsProperties$LinkTestMarker$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = new SemanticsPropertyKey<>("Text", true, SemanticsProperties$Text$1.INSTANCE, null, 8, null);
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<AnnotatedString> InputText = new SemanticsPropertyKey<>("InputText", true);
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = new SemanticsPropertyKey<>("EditableText", true);
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", true);
    private static final SemanticsPropertyKey<TextRange> TextCompositionRange = new SemanticsPropertyKey<>("TextCompositionRange", true);
    private static final SemanticsPropertyKey<ImeAction> ImeAction = new SemanticsPropertyKey<>("ImeAction", true);
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", true);
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", true);
    private static final SemanticsPropertyKey<InputTextSuggestionState> InputTextSuggestionState = new SemanticsPropertyKey<>("InputTextSuggestionState", true);
    private static final SemanticsPropertyKey<ab> Password = new SemanticsPropertyKey<>("Password", true);
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", true);
    private static final SemanticsPropertyKey<l<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", (p) null, 2, (o) null);
    private static final SemanticsPropertyKey<Shape> Shape = new SemanticsPropertyKey<>("Shape", false, SemanticsProperties$Shape$1.INSTANCE, null, 8, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    public final SemanticsPropertyKey<ab> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<FillableData> getFillableData() {
        return FillableData;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<ab> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<ab> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<l<Object, Integer>> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    public final SemanticsPropertyKey<InputTextSuggestionState> getInputTextSuggestionState() {
        return InputTextSuggestionState;
    }

    public final SemanticsPropertyKey<ab> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<ab> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<ab> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> getIsSensitiveData() {
        return IsSensitiveData;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<ab> getLinkTestMarker() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<ab> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<ab> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<Shape> getShape() {
        return Shape;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextCompositionRange() {
        return TextCompositionRange;
    }

    public final SemanticsPropertyKey<ab> getTextEntryKey() {
        return TextEntryKey;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }

    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    public static /* synthetic */ void getIsContainer$annotations() {
    }
}
