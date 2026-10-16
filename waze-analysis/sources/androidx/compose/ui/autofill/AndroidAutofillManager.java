package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectList;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;
    private MutableIntSet currentlyDisplayedIDs;
    private final String packageName;
    private boolean pendingAutofillCommit;
    private PlatformAutofillManager platformAutofillManager;
    private final RectManager rectManager;
    private Rect reusableRect = new Rect();
    private AutofillId rootAutofillId;
    private final SemanticsOwner semanticsOwner;
    private final View view;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillId autofillId = ViewCompatShims.getAutofillId(view).toAutofillId();
        if (autofillId == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new e();
        }
        this.rootAutofillId = autofillId;
        this.currentlyDisplayedIDs = new MutableIntSet(0, 1, null);
    }

    private final void notifyAutofillManager(SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, int i2) {
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        ContentDataType contentDataType = semanticsConfiguration2 != null ? (ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()) : null;
        ContentDataType contentDataType2 = semanticsConfiguration != null ? (ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDataType()) : null;
        if (x.n(contentDataType2, ContentDataType.Companion.getNone())) {
            if (x.n(contentDataType, ContentDataType.Companion.getNone())) {
                return;
            }
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, false);
            return;
        }
        if (x.n(contentDataType, ContentDataType.Companion.getNone()) && !x.n(contentDataType2, ContentDataType.Companion.getNone())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, true);
        }
        String text = (semanticsConfiguration2 == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, false);
            } else if (x.n(contentDataType2, ContentDataType.Companion.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.view, i2, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2));
            }
        }
        ToggleableState toggleableState = semanticsConfiguration2 != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        ToggleableState toggleableState2 = semanticsConfiguration != null ? (ToggleableState) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getToggleableState()) : null;
        if (toggleableState != toggleableState2) {
            if (toggleableState == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, true);
            } else if (toggleableState2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, false);
            } else if (x.n(contentDataType2, ContentDataType.Companion.getToggle())) {
                int iOrdinal = toggleableState2.ordinal();
                Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : false : true;
                if (bool != null) {
                    this.platformAutofillManager.notifyValueChanged(this.view, i2, AutofillApi26Helper.INSTANCE.getAutofillToggleValue(bool.booleanValue()));
                }
            }
        }
        FillableData fillableData = semanticsConfiguration2 != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getFillableData()) : null;
        FillableData fillableData2 = semanticsConfiguration != null ? (FillableData) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFillableData()) : null;
        if (x.n(fillableData, fillableData2)) {
            return;
        }
        if (fillableData == null) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, true);
            return;
        }
        PlatformAutofillManager platformAutofillManager = this.platformAutofillManager;
        if (fillableData2 == null) {
            platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, false);
        } else {
            platformAutofillManager.notifyValueChanged(this.view, i2, ((AndroidFillableData) fillableData2).getAutofillValue$ui());
        }
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void onDetach$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui() {
        if (this.currentlyDisplayedIDs.isEmpty() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.isNotEmpty()) {
            this.pendingAutofillCommit = true;
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo semanticsInfoRequireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        SemanticsInfo semanticsInfoRequireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        if (focusTargetModifierNode != null && (semanticsInfoRequireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode)) != null && (semanticsConfiguration2 = semanticsInfoRequireSemanticsInfo2.getSemanticsConfiguration()) != null && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2)) {
            this.platformAutofillManager.notifyViewExited(this.view, semanticsInfoRequireSemanticsInfo2.getSemanticsId());
        }
        if (focusTargetModifierNode2 == null || (semanticsInfoRequireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode2)) == null || (semanticsConfiguration = semanticsInfoRequireSemanticsInfo.getSemanticsConfiguration()) == null || !AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
            return;
        }
        int semanticsId = semanticsInfoRequireSemanticsInfo.getSemanticsId();
        RectManager rectManager = this.rectManager;
        LayoutNode layoutNode = (LayoutNode) rectManager.layoutNodes.get(semanticsId);
        if (layoutNode == null || !rectManager.inRectList(layoutNode)) {
            return;
        }
        RectList rects = rectManager.getRects();
        int iIndexInRectList = rectManager.indexInRectList(layoutNode);
        long[] jArr = rects.items;
        long j2 = jArr[iIndexInRectList];
        long j3 = jArr[iIndexInRectList + 1];
        int i2 = (int) (j2 >> 32);
        this.platformAutofillManager.notifyViewEntered(this.view, semanticsId, new Rect(i2, (int) j2, (int) (j3 >> 32), (int) j3));
    }

    public final void onLayoutNodeDeactivated$ui(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostAttach$ui(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void onPostLayoutNodeReused$ui(SemanticsInfo semanticsInfo, int i2) {
        if (this.currentlyDisplayedIDs.remove(i2)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i2, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    @Override // androidx.compose.ui.semantics.SemanticsListener
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        SemanticsConfiguration semanticsConfiguration2 = semanticsInfo.getSemanticsConfiguration();
        int semanticsId = semanticsInfo.getSemanticsId();
        notifyAutofillManager(semanticsConfiguration2, semanticsConfiguration, semanticsId);
        boolean z = semanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
        boolean z2 = semanticsConfiguration2 != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration2);
        if (z != z2) {
            MutableIntSet mutableIntSet = this.currentlyDisplayedIDs;
            if (z2) {
                mutableIntSet.add(semanticsId);
            } else {
                mutableIntSet.remove(semanticsId);
            }
        }
    }

    public final void performAutofill(SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        l lVar;
        l lVar2;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iKeyAt = sparseArray.keyAt(i2);
            AutofillValue autofillValueM64m = j$$ExternalSyntheticApiModelOutline1.m64m((Object) sparseArray.get(iKeyAt));
            SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui(iKeyAt);
            if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null) {
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnAutofillText());
                if (accessibilityAction != null && (lVar2 = (l) accessibilityAction.getAction()) != null) {
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnFillData());
                if (accessibilityAction2 != null && (lVar = (l) accessibilityAction2.getAction()) != null) {
                }
            }
        }
    }

    public final void populateViewStructure(ViewStructure viewStructure) {
        SemanticsOwner semanticsOwner = this.semanticsOwner;
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui = semanticsOwner.getRootInfo$ui();
        PopulateViewStructure_androidKt.populate(viewStructure, rootInfo$ui, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListMutableObjectListOf = ObjectListKt.mutableObjectListOf(rootInfo$ui, viewStructure);
        while (mutableObjectListMutableObjectListOf.isNotEmpty()) {
            MutableObjectList mutableObjectList = mutableObjectListMutableObjectListOf;
            Object objRemoveAt = mutableObjectListMutableObjectListOf.removeAt(mutableObjectList._size - 1);
            x.d(objRemoveAt, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) objRemoveAt;
            Object objRemoveAt2 = mutableObjectListMutableObjectListOf.removeAt(mutableObjectList._size - 1);
            x.d(objRemoveAt2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) objRemoveAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i2 = 0; i2 < size; i2++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i2);
                if (!semanticsInfo.isDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration)) {
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructure2);
                    } else {
                        ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure2, autofillApi26Helper.addChildCount(viewStructure2, 1));
                        PopulateViewStructure_androidKt.populate(viewStructureNewChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructureNewChild);
                    }
                }
            }
        }
    }

    public final void requestAutofill$ui(SemanticsInfo semanticsInfo) {
        int semanticsId = semanticsInfo.getSemanticsId();
        RectManager rectManager = this.rectManager;
        LayoutNode layoutNode = (LayoutNode) rectManager.layoutNodes.get(semanticsId);
        if (layoutNode == null || !rectManager.inRectList(layoutNode)) {
            return;
        }
        RectList rects = rectManager.getRects();
        int iIndexInRectList = rectManager.indexInRectList(layoutNode);
        long[] jArr = rects.items;
        long j2 = jArr[iIndexInRectList];
        long j3 = jArr[iIndexInRectList + 1];
        long j4 = j2 >> 32;
        int i2 = (int) j2;
        int i3 = (int) (j3 >> 32);
        this.reusableRect.set((int) j4, i2, i3, (int) j3);
        this.platformAutofillManager.requestAutofill(this.view, semanticsInfo.getSemanticsId(), this.reusableRect);
    }

    public final void setPlatformAutofillManager(PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }
}
