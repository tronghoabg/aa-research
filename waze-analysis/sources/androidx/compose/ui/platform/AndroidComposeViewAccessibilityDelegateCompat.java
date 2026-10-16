package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ArraySet;
import androidx.collection.IntIntMapKt;
import androidx.collection.IntList;
import androidx.collection.IntListKt;
import androidx.collection.IntObjectMap;
import androidx.collection.IntObjectMapKt;
import androidx.collection.IntSetKt;
import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.AndroidComposeUiFlags;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.semantics.SemanticsNode_androidKt;
import androidx.compose.ui.semantics.SemanticsOwnerKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.lifecycle.Lifecycle;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import h.ab;
import h.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.w;
import h.g.b.x;
import h.g.b.y;
import h.i;
import h.k.n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AccessibilityDelegateCompat implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final int CONTENT_CHANGE_TYPE_CHECKED = 8192;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataShapeRectCornersKey = "androidx.compose.ui.semantics.shapeCorners";
    public static final String ExtraDataShapeRectKey = "androidx.compose.ui.semantics.shapeRect";
    public static final String ExtraDataShapeRegionKey = "androidx.compose.ui.semantics.shapeRegion";
    public static final int ExtraDataShapeTypeGeneric = 2;
    public static final String ExtraDataShapeTypeKey = "androidx.compose.ui.semantics.shapeType";
    public static final int ExtraDataShapeTypeRectangle = 0;
    public static final int ExtraDataShapeTypeRounded = 1;
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private List<? extends AccessibilityServiceInfo> _enabledServices;
    private int accessibilityCursorPosition;
    private int accessibilityFocusedVirtualViewId;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private SparseArrayCompat<SparseArrayCompat<CharSequence>> actionIdToLabel;
    private final o<ab> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private IntObjectMap<SemanticsNodeWithAdjustedBounds> currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private AccessibilityNodeInfoCompat currentlyAccessibilityFocusedANI;
    private AccessibilityNodeInfoCompat currentlyFocusedANI;
    private final MutableIntIntMap drawingOrder;
    private int focusedVirtualViewId;
    private MutableIntIntMap idToAfterMap;
    private MutableIntIntMap idToBeforeMap;
    private SparseArrayCompat<MutableObjectIntMap<CharSequence>> labelToActionId;
    private final Handler legacyMainHandler;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private MutableIntSet paneDisplayed;
    private final MutableIntObjectMap<ScrollAxisRange> pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final MutableIntObjectMap<ScrollAxisRange> pendingVerticalScrollEvents;
    private MutableIntObjectMap<SemanticsNodeCopy> previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private Boolean requestFromAccessibilityToolForTesting;
    private final l<ScrollObservationScope, ab> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final ArraySet<LayoutNode> subtreeChangedLayoutNodes;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final IntList AccessibilityActionsResourceIds = IntListKt.intListOf(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(this);

    /* compiled from: WazeSource */
    final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        public static final void addSetProgressAction(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    /* compiled from: WazeSource */
    final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        public static final void addPageActions(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
            Role role = (Role) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getRole());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                int iM10317getCarouselo7Vup1c = Role.Companion.m10317getCarouselo7Vup1c();
                if (role != null && Role.m10312equalsimpl0(role.m10315unboximpl(), iM10317getCarouselo7Vup1c)) {
                    return;
                }
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageUp());
                if (accessibilityAction != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageDown());
                if (accessibilityAction2 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageLeft());
                if (accessibilityAction3 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageRight());
                if (accessibilityAction4 != null) {
                    accessibilityNodeInfoCompat.addAction(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    /* compiled from: WazeSource */
    final class ComposeAccessibilityNodeProvider extends AccessibilityNodeProviderCompat {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(i2, accessibilityNodeInfoCompat, str, bundle);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i2) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateNodeInfo = androidComposeViewAccessibilityDelegateCompat.createNodeInfo(i2);
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (i2 == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
                if (i2 == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = accessibilityNodeInfoCompatCreateNodeInfo;
                }
            }
            return accessibilityNodeInfoCompatCreateNodeInfo;
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public AccessibilityNodeInfoCompat findFocus(int i2) {
            if (i2 == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (i2 == 2) {
                return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + i2);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public boolean performAction(int i2, int i3, Bundle bundle) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(i2, i3, bundle);
        }
    }

    /* compiled from: WazeSource */
    final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i4, int i5, long j2) {
            this.node = semanticsNode;
            this.action = i2;
            this.granularity = i3;
            this.fromIndex = i4;
            this.toIndex = i5;
            this.traverseTime = j2;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1, reason: invalid class name and case insensitive filesystem */
    final class C03921 extends y implements l<LayoutNode, Boolean> {
        public static final C03921 INSTANCE = new C03921();

        C03921() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(LayoutNode layoutNode) {
            SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
            boolean z = false;
            if (semanticsConfiguration != null && semanticsConfiguration.isMergingSemanticsOfDescendants()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        x.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.pendingVerticalScrollEvents = new MutableIntObjectMap<>(0, 1, null);
        this.actionIdToLabel = new SparseArrayCompat<>(0, 1, null);
        this.labelToActionId = new SparseArrayCompat<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new ArraySet<>(0, 1, null);
        this.boundsUpdateChannel = w.c(1, null, null, 6);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = IntObjectMapKt.intObjectMapOf();
        this.paneDisplayed = new MutableIntSet(0, 1, null);
        this.idToBeforeMap = new MutableIntIntMap(0, 1, null);
        this.idToAfterMap = new MutableIntIntMap(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.previousSemanticsRoot = new SemanticsNodeCopy(androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode(), IntObjectMapKt.intObjectMapOf());
        this.drawingOrder = IntIntMapKt.mutableIntIntMapOf();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.semanticsChangeChecker$lambda$0(this.f$0);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        SemanticsNode semanticsNode;
        float[] cornerArray;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (x.n(str, this.ExtraDataTestTraversalBeforeVal)) {
            int orDefault = this.idToBeforeMap.getOrDefault(i2, -1);
            if (orDefault != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault);
                return;
            }
            return;
        }
        if (x.n(str, this.ExtraDataTestTraversalAfterVal)) {
            int orDefault2 = this.idToAfterMap.getOrDefault(i2, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfoCompat.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && bundle != null && x.n(str, AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY)) {
            int i3 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX, -1);
            int i4 = bundle.getInt(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH, -1);
            if (i4 > 0 && i3 >= 0) {
                if (i3 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                    RectF[] boundingBoxes = getBoundingBoxes(semanticsNode, i3, i4);
                    if (boundingBoxes != null) {
                        accessibilityNodeInfoCompat.getExtras().putParcelableArray(str, boundingBoxes);
                        return;
                    }
                    return;
                }
            }
            Log.e(LogTag, "Invalid arguments for accessibility character locations");
            return;
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getTestTag()) && bundle != null && x.n(str, ExtraDataTestTagKey)) {
            String str2 = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getTestTag());
            if (str2 != null) {
                accessibilityNodeInfoCompat.getExtras().putCharSequence(str, str2);
                return;
            }
            return;
        }
        if (x.n(str, ExtraDataIdKey)) {
            accessibilityNodeInfoCompat.getExtras().putInt(str, semanticsNode.getId());
            return;
        }
        if (x.n(str, ExtraDataShapeTypeKey)) {
            Shape shape = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getShape());
            if (shape != null) {
                Rect shapeBounds = getShapeBounds(semanticsNode, getBoundsInScreen(accessibilityNodeInfoCompat), shape);
                Outline outlineM10195createOutline12SF9DM = m10195createOutline12SF9DM(shape, shapeBounds.m8013getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection());
                if (outlineM10195createOutline12SF9DM instanceof Outline.Rectangle) {
                    accessibilityNodeInfoCompat.getExtras().putInt(ExtraDataShapeTypeKey, 0);
                    accessibilityNodeInfoCompat.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineM10195createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                } else if (outlineM10195createOutline12SF9DM instanceof Outline.Rounded) {
                    accessibilityNodeInfoCompat.getExtras().putInt(ExtraDataShapeTypeKey, 1);
                    accessibilityNodeInfoCompat.getExtras().putParcelable(ExtraDataShapeRectKey, toAndroidRect(outlineM10195createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    accessibilityNodeInfoCompat.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, toCornerArray(outlineM10195createOutline12SF9DM));
                    return;
                } else {
                    if (!(outlineM10195createOutline12SF9DM instanceof Outline.Generic)) {
                        throw new i();
                    }
                    accessibilityNodeInfoCompat.getExtras().putInt(ExtraDataShapeTypeKey, 2);
                    accessibilityNodeInfoCompat.getExtras().putParcelable(ExtraDataShapeRegionKey, toRegion(outlineM10195createOutline12SF9DM, shapeBounds.getLeft(), shapeBounds.getTop()));
                    return;
                }
            }
            return;
        }
        if (x.n(str, ExtraDataShapeRectKey)) {
            Shape shape2 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getShape());
            if (shape2 != null) {
                Rect shapeBounds2 = getShapeBounds(semanticsNode, getBoundsInScreen(accessibilityNodeInfoCompat), shape2);
                android.graphics.Rect androidRect = toAndroidRect(m10195createOutline12SF9DM(shape2, shapeBounds2.m8013getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds2.getLeft(), shapeBounds2.getTop());
                if (androidRect != null) {
                    accessibilityNodeInfoCompat.getExtras().putParcelable(ExtraDataShapeRectKey, androidRect);
                    return;
                }
                return;
            }
            return;
        }
        if (x.n(str, ExtraDataShapeRectCornersKey)) {
            Shape shape3 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getShape());
            if (shape3 == null || (cornerArray = toCornerArray(m10195createOutline12SF9DM(shape3, getShapeBounds(semanticsNode, getBoundsInScreen(accessibilityNodeInfoCompat), shape3).m8013getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()))) == null) {
                return;
            }
            accessibilityNodeInfoCompat.getExtras().putFloatArray(ExtraDataShapeRectCornersKey, cornerArray);
            return;
        }
        if (x.n(str, ExtraDataShapeRegionKey)) {
            Shape shape4 = (Shape) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getShape());
            if (shape4 != null) {
                Rect shapeBounds3 = getShapeBounds(semanticsNode, getBoundsInScreen(accessibilityNodeInfoCompat), shape4);
                Region region = toRegion(m10195createOutline12SF9DM(shape4, shapeBounds3.m8013getSizeNHjbRc(), semanticsNode.getLayoutInfo().getLayoutDirection()), shapeBounds3.getLeft(), shapeBounds3.getTop());
                if (region != null) {
                    accessibilityNodeInfoCompat.getExtras().putParcelable(ExtraDataShapeRegionKey, region);
                    return;
                }
                return;
            }
            return;
        }
        ScatterSet<SemanticsPropertyKey<?>> accessibilityExtraKeys$ui = semanticsNode.getUnmergedConfig$ui().getAccessibilityExtraKeys$ui();
        if (accessibilityExtraKeys$ui == null) {
            return;
        }
        Object[] objArr = accessibilityExtraKeys$ui.elements;
        long[] jArr = accessibilityExtraKeys$ui.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j2 = jArr[i5];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = ~(i5 - length);
                int i7 = 0;
                while (true) {
                    int i8 = 8 - (i6 >>> 31);
                    if (i7 < i8) {
                        if ((255 & j2) < 128) {
                            SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i5 << 3) + i7];
                            String accessibilityExtraKey$ui = semanticsPropertyKey.getAccessibilityExtraKey$ui();
                            if (x.n(accessibilityExtraKey$ui, str)) {
                                Object orNull = SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), semanticsPropertyKey);
                                if (orNull instanceof Serializable) {
                                    accessibilityNodeInfoCompat.getExtras().putSerializable(accessibilityExtraKey$ui, (Serializable) orNull);
                                } else {
                                    if (!(orNull instanceof Parcelable)) {
                                        throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                    }
                                    accessibilityNodeInfoCompat.getExtras().putParcelable(accessibilityExtraKey$ui, (Parcelable) orNull);
                                }
                            } else {
                                continue;
                            }
                        }
                        j2 >>= 8;
                        i7++;
                    } else if (i8 != 8) {
                        return;
                    }
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    /* renamed from: adjustForReversedScrollingAndRtl-RE3cj74, reason: not valid java name */
    private final long m10193adjustForReversedScrollingAndRtlRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j2) {
        if (Offset.m7977equalsimpl0(j2, Offset.Companion.m7996getZeroF1C5BW0())) {
            return j2;
        }
        long j3 = j2 >> 32;
        int i2 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode)) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode2.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            fIntBitsToFloat2 = -fIntBitsToFloat2;
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds) {
        IntRect adjustedBounds = semanticsNodeWithAdjustedBounds.getAdjustedBounds();
        return toBoundsInScreen(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc  */
    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m10194canScrollmoWRBKg(androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> r20, boolean r21, int r22, long r23) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m10194canScrollmoWRBKg(androidx.collection.IntObjectMap, boolean, int, long):boolean");
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    private final boolean clearAccessibilityFocus(int i2) {
        if (!isAccessibilityFocused(i2)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int i2, int i3) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i3);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName(ClassName);
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, i2);
        if (isEnabled$ui() && (semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2)) != null) {
            accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getPassword()));
            AccessibilityEventCompat.setAccessibilityDataSensitive(accessibilityEventObtain, x.n(SemanticsConfigurationKt.getOrNull(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getIsSensitiveData()), true));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AccessibilityNodeInfoCompat createNodeInfo(int i2) {
        if (this.view.getComposeViewContext().getLifecycleOwner$ui().getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2);
        if (semanticsNodeWithAdjustedBounds == null) {
            return emptyNodeInfoOrNull();
        }
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
        boolean zN = x.n(SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), SemanticsProperties.INSTANCE.getIsSensitiveData()), true);
        if (zN && !isRequestFromAccessibilityTool()) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatObtain = AccessibilityNodeInfoCompat.obtain();
        accessibilityNodeInfoCompatObtain.setAccessibilityDataSensitive(zN);
        if (i2 == -1) {
            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
            accessibilityNodeInfoCompatObtain.setParent(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            SemanticsNode parent = semanticsNode.getParent();
            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
            if (numValueOf == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + i2 + " has null parent");
                throw new e();
            }
            int iIntValue = numValueOf.intValue();
            accessibilityNodeInfoCompatObtain.setParent(this.view, iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId() ? iIntValue : -1);
        }
        accessibilityNodeInfoCompatObtain.setSource(this.view, i2);
        accessibilityNodeInfoCompatObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
        populateAccessibilityNodeInfoProperties(i2, accessibilityNodeInfoCompatObtain, semanticsNode);
        return accessibilityNodeInfoCompatObtain;
    }

    /* renamed from: createOutline-12SF9DM, reason: not valid java name */
    private final Outline m10195createOutline12SF9DM(Shape shape, long j2, LayoutDirection layoutDirection) {
        return shape.mo2037createOutlinePq9zytI(j2, layoutDirection, this.view.getDensity());
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int i2, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, 8192);
        if (num != null) {
            accessibilityEventCreateEvent.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventCreateEvent.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventCreateEvent.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventCreateEvent.getText().add(charSequence);
        }
        return accessibilityEventCreateEvent;
    }

    private final AccessibilityNodeInfoCompat emptyNodeInfoOrNull() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return AccessibilityNodeInfoCompat.obtain();
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode semanticsNode) {
        return (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m10541getEndimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m10550unboximpl());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode semanticsNode) {
        return (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getContentDescription()) || !semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m10546getStartimpl(((TextRange) semanticsNode.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getTextSelectionRange())).m10550unboximpl());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.RectF[] getBoundingBoxes(androidx.compose.ui.semantics.SemanticsNode r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r24
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r22.getUnmergedConfig$ui()
            androidx.compose.ui.text.TextLayoutResult r2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.getTextLayoutResult(r2)
            r3 = 0
            if (r2 != 0) goto L10
            return r3
        L10:
            androidx.compose.ui.node.LayoutNode r4 = r22.getLayoutNode$ui()
            androidx.compose.ui.node.NodeCoordinator r4 = r4.getInnerCoordinator$ui()
            boolean r5 = r4.isAttached()
            r6 = 1
            if (r6 == r5) goto L20
            r4 = r3
        L20:
            if (r4 == 0) goto Lf0
            androidx.compose.ui.layout.LayoutCoordinates r4 = (androidx.compose.ui.layout.LayoutCoordinates) r4
            long r4 = androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(r4)
            androidx.compose.ui.geometry.Rect r6 = r22.getBoundsInRoot()
            android.graphics.RectF[] r7 = new android.graphics.RectF[r1]
            r8 = 0
        L2f:
            if (r8 >= r1) goto Lef
            int r9 = r23 + r8
            androidx.compose.ui.text.TextLayoutInput r10 = r2.getLayoutInput()
            androidx.compose.ui.text.AnnotatedString r10 = r10.getText()
            int r10 = r10.length()
            if (r9 < r10) goto L47
        L41:
            r22 = r3
            r19 = r4
            goto Le7
        L47:
            androidx.compose.ui.geometry.Rect r9 = r2.getBoundingBox(r9)
            androidx.compose.ui.geometry.Rect r9 = r9.m8017translatek4lQ0M(r4)
            boolean r10 = r9.overlaps(r6)
            if (r10 == 0) goto L5a
            androidx.compose.ui.geometry.Rect r9 = r9.intersect(r6)
            goto L5b
        L5a:
            r9 = r3
        L5b:
            if (r9 == 0) goto L41
            androidx.compose.ui.platform.AndroidComposeView r10 = r0.view
            float r11 = r9.getLeft()
            float r12 = r9.getTop()
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r13 = (long) r11
            int r11 = java.lang.Float.floatToRawIntBits(r12)
            long r11 = (long) r11
            androidx.compose.ui.platform.AndroidComposeView r15 = r0.view
            r16 = 32
            long r13 = r13 << r16
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r11 & r17
            long r11 = r11 | r13
            long r10 = r10.mo9691localToScreenMKHz9U(r11)
            float r12 = r9.getRight()
            float r9 = r9.getBottom()
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r12 = (long) r12
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            r14 = r3
            r19 = r4
            long r3 = (long) r9
            r22 = r14
            r5 = r15
            long r14 = r10 >> r16
            long r12 = r12 << r16
            long r3 = r3 & r17
            long r3 = r3 | r12
            long r3 = r5.mo9691localToScreenMKHz9U(r3)
            long r12 = r3 >> r16
            int r5 = (int) r12
            int r9 = (int) r14
            android.graphics.RectF r12 = new android.graphics.RectF
            float r13 = java.lang.Float.intBitsToFloat(r9)
            float r14 = java.lang.Float.intBitsToFloat(r5)
            float r13 = java.lang.Math.min(r13, r14)
            long r10 = r10 & r17
            long r3 = r3 & r17
            int r3 = (int) r3
            int r4 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r4)
            float r11 = java.lang.Float.intBitsToFloat(r3)
            float r10 = java.lang.Math.min(r10, r11)
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            float r5 = java.lang.Math.max(r9, r5)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = java.lang.Math.max(r4, r3)
            r12.<init>(r13, r10, r5, r3)
            r7[r8] = r12
        Le7:
            int r8 = r8 + 1
            r3 = r22
            r4 = r19
            goto L2f
        Lef:
            return r7
        Lf0:
            r22 = r3
            return r22
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.getBoundingBoxes(androidx.compose.ui.semantics.SemanticsNode, int, int):android.graphics.RectF[]");
    }

    private final android.graphics.Rect getBoundsInScreen(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        android.graphics.Rect rect = new android.graphics.Rect();
        accessibilityNodeInfoCompat.getBoundsInScreen(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntObjectMap<SemanticsNodeWithAdjustedBounds> getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsOwnerKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner(), -1, AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1.INSTANCE);
            if (isEnabled$ui()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.setTraversalValues(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private final List<AccessibilityServiceInfo> getEnabledServices() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Handler getHandler() {
        return AndroidComposeUiFlags.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    private final String getIterableTextForAccessibility(SemanticsNode semanticsNode) {
        AnnotatedString textForTextField;
        if (semanticsNode == null) {
            return null;
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) semanticsNode.getUnmergedConfig$ui().get(SemanticsProperties.INSTANCE.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getEditableText())) {
            textForTextField = getTextForTextField(semanticsNode.getUnmergedConfig$ui());
            if (textForTextField == null) {
                return null;
            }
        } else {
            List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getText());
            if (list == null || (textForTextField = (AnnotatedString) h.a.i.R(list)) == null) {
                return null;
            }
        }
        return textForTextField.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode semanticsNode, int i2) {
        AccessibilityIterators.AbstractTextSegmentIterator companion;
        TextLayoutResult textLayoutResult;
        if (semanticsNode == null) {
            return null;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        String str = iterableTextForAccessibility;
        if (str == null || str.length() == 0) {
            return null;
        }
        if (i2 == 1) {
            companion = AccessibilityIterators.CharacterTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.CharacterTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else if (i2 == 2) {
            companion = AccessibilityIterators.WordTextSegmentIterator.Companion.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            ((AccessibilityIterators.WordTextSegmentIterator) companion).initialize(iterableTextForAccessibility);
        } else if (i2 == 4) {
            if (!semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) && (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig$ui())) != null) {
                if (i2 == 4) {
                    companion = AccessibilityIterators.LineTextSegmentIterator.Companion.getInstance();
                    ((AccessibilityIterators.LineTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult);
                } else {
                    companion = AccessibilityIterators.PageTextSegmentIterator.Companion.getInstance();
                    ((AccessibilityIterators.PageTextSegmentIterator) companion).initialize(iterableTextForAccessibility, textLayoutResult, semanticsNode);
                }
            }
        } else {
            if (i2 != 8) {
                if (i2 != 16) {
                    return null;
                }
                return !semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) ? null : null;
            }
            companion = AccessibilityIterators.ParagraphTextSegmentIterator.Companion.getInstance();
            companion.initialize(iterableTextForAccessibility);
        }
        return companion;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008c A[LOOP:0: B:5:0x001c->B:37:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[EDGE_INSN: B:50:0x0091->B:38:0x0091 BREAK  A[LOOP:0: B:5:0x001c->B:37:0x008c], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.geometry.Rect getShapeBounds(androidx.compose.ui.semantics.SemanticsNode r10, android.graphics.Rect r11, final androidx.compose.ui.graphics.Shape r12) {
        /*
            r9 = this;
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$getShapeBounds$shapeNodeMatcher$1
            r0.<init>()
            androidx.compose.ui.node.LayoutNode r10 = r10.getLayoutNode$ui()
            androidx.compose.ui.node.NodeChain r12 = r10.getNodes$ui()
            int r1 = androidx.compose.ui.node.NodeChain.access$getAggregateChildKindSet(r12)
            r1 = r1 & 8
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L91
            androidx.compose.ui.Modifier$Node r12 = r12.getHead$ui()
        L1c:
            if (r12 == 0) goto L91
            int r1 = r12.getKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L84
            r1 = r12
            r5 = r4
        L28:
            if (r1 == 0) goto L84
            boolean r6 = r1 instanceof androidx.compose.ui.node.SemanticsModifierNode
            if (r6 == 0) goto L40
            r6 = r1
            androidx.compose.ui.node.SemanticsModifierNode r6 = (androidx.compose.ui.node.SemanticsModifierNode) r6
            r7 = r0
            androidx.compose.ui.semantics.SemanticsPropertyReceiver r7 = (androidx.compose.ui.semantics.SemanticsPropertyReceiver) r7
            r6.applySemantics(r7)
            boolean r6 = r0.getHasMatchedShape()
            if (r6 != 0) goto L3e
            goto L7f
        L3e:
            r4 = r1
            goto L91
        L40:
            int r6 = r1.getKindSet$ui()
            r6 = r6 & 8
            if (r6 == 0) goto L7f
            boolean r6 = r1 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto L7f
            r6 = r1
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.getDelegate$ui()
            r7 = r3
        L54:
            if (r6 == 0) goto L7d
            int r8 = r6.getKindSet$ui()
            r8 = r8 & 8
            if (r8 == 0) goto L78
            int r7 = r7 + 1
            if (r7 != r2) goto L64
            r1 = r6
            goto L78
        L64:
            if (r5 != 0) goto L6f
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            r8 = 16
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r8]
            r5.<init>(r8, r3)
        L6f:
            if (r1 == 0) goto L74
            r5.add(r1)
        L74:
            r5.add(r6)
            r1 = r4
        L78:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild$ui()
            goto L54
        L7d:
            if (r7 == r2) goto L28
        L7f:
            androidx.compose.ui.Modifier$Node r1 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L28
        L84:
            int r1 = r12.getAggregateChildKindSet$ui()
            r1 = r1 & 8
            if (r1 == 0) goto L91
            androidx.compose.ui.Modifier$Node r12 = r12.getChild$ui()
            goto L1c
        L91:
            androidx.compose.ui.node.SemanticsModifierNode r4 = (androidx.compose.ui.node.SemanticsModifierNode) r4
            if (r4 == 0) goto Lc8
            androidx.compose.ui.Modifier$Node r12 = r4.getNode()
            if (r12 == 0) goto Lc8
            boolean r12 = r12.isAttached()
            if (r12 != r2) goto Lc8
            androidx.compose.ui.node.DelegatableNode r4 = (androidx.compose.ui.node.DelegatableNode) r4
            androidx.compose.ui.layout.LayoutCoordinates r10 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(r4)
            androidx.compose.ui.layout.LayoutCoordinates r12 = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(r10)
            androidx.compose.ui.geometry.Rect r10 = r12.localBoundingBoxOf(r10, r3)
            float r12 = r10.getLeft()
            float r0 = r10.getTop()
            float r1 = r10.getRight()
            float r10 = r10.getBottom()
            android.graphics.Rect r10 = r9.toBoundsInScreen(r12, r0, r1, r10)
            androidx.compose.ui.geometry.Rect r9 = r9.toBoundsRelativeToNodeBounds(r10, r11)
            return r9
        Lc8:
            androidx.compose.ui.node.NodeCoordinator r9 = r10.getOuterCoordinator$ui()
            androidx.compose.ui.layout.LayoutCoordinates r9 = (androidx.compose.ui.layout.LayoutCoordinates) r9
            androidx.compose.ui.geometry.Rect r9 = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInWindow(r9, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.getShapeBounds(androidx.compose.ui.semantics.SemanticsNode, android.graphics.Rect, androidx.compose.ui.graphics.Shape):androidx.compose.ui.geometry.Rect");
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int i2) {
        return this.accessibilityFocusedVirtualViewId == i2;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode semanticsNode) {
        return !semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getContentDescription()) && semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isRequestFromAccessibilityTool() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (x.n(bool, true)) {
            return true;
        }
        if (x.n(bool, false)) {
            return false;
        }
        return AccessibilityManagerCompat.isRequestFromAccessibilityTool(this.accessibilityManager);
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:7:0x0019
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0037 -> B:7:0x0019). Please report as a decompilation issue!!! */
    private final boolean legacyScrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode r8) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.legacyScrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    private static final float legacyScrollOntoScreen$scrollDelta(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.i(ab.f48028a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean performActionHelper(int i2, int i3, Bundle bundle) {
        SemanticsNode semanticsNode;
        a aVar;
        int i4;
        a aVar2;
        a aVar3;
        a aVar4;
        a aVar5;
        a aVar6;
        a aVar7;
        a aVar8;
        a aVar9;
        a aVar10;
        a aVar11;
        l lVar;
        AccessibilityAction accessibilityAction;
        l lVar2;
        a aVar12;
        CharSequence charSequence;
        List list;
        Bundle bundle2 = bundle;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = getCurrentSemanticsNodes().get(i2);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return false;
        }
        if (x.n(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getIsSensitiveData()), true) && !isRequestFromAccessibilityTool()) {
            return false;
        }
        if (i3 == 64) {
            return requestAccessibilityFocus(i2);
        }
        if (i3 == 128) {
            return clearAccessibilityFocus(i2);
        }
        if (i3 == 256 || i3 == 512) {
            if (bundle2 != null) {
                return traverseAtGranularity(semanticsNode, bundle2.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT), i3 == 256, bundle2.getBoolean(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN));
            }
            return false;
        }
        if (i3 == 16384) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCopyText());
            if (accessibilityAction2 == null || (aVar = (a) accessibilityAction2.getAction()) == null) {
                return false;
            }
            return ((Boolean) aVar.invoke()).booleanValue();
        }
        Boolean bool = null;
        if (i3 == 131072) {
            if (bundle2 != null) {
                i4 = bundle2.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT, -1);
            } else {
                i4 = -1;
                bundle2 = null;
            }
            boolean accessibilitySelection = setAccessibilitySelection(semanticsNode, i4, bundle2 != null ? bundle2.getInt(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT, -1) : -1, false);
            if (accessibilitySelection) {
                sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), 0, null, null, 12, null);
            }
            return accessibilitySelection;
        }
        if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            return false;
        }
        if (i3 == 1) {
            if (this.view.isInTouchMode()) {
                this.view.requestFocusFromTouch();
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getRequestFocus());
            if (accessibilityAction3 == null || (aVar2 = (a) accessibilityAction3.getAction()) == null) {
                return false;
            }
            return ((Boolean) aVar2.invoke()).booleanValue();
        }
        if (i3 == 2) {
            if (!x.n(SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getFocused()), true)) {
                return false;
            }
            this.view.getFocusOwner().mo7870clearFocusI7lrPNg(false, true, true, FocusDirection.Companion.m7861getExitdhqQ8s());
            return true;
        }
        switch (i3) {
            case 16:
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnClick());
                if (accessibilityAction4 != null && (aVar3 = (a) accessibilityAction4.getAction()) != null) {
                    bool = (Boolean) aVar3.invoke();
                }
                sendEventForVirtualView$default(this, i2, 1, null, null, 12, null);
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            case 32:
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnLongClick());
                if (accessibilityAction5 == null || (aVar4 = (a) accessibilityAction5.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar4.invoke()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPasteText());
                if (accessibilityAction6 == null || (aVar7 = (a) accessibilityAction6.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar7.invoke()).booleanValue();
            case 65536:
                AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCutText());
                if (accessibilityAction7 == null || (aVar8 = (a) accessibilityAction7.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar8.invoke()).booleanValue();
            case 262144:
                AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getExpand());
                if (accessibilityAction8 == null || (aVar9 = (a) accessibilityAction8.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar9.invoke()).booleanValue();
            case 524288:
                AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCollapse());
                if (accessibilityAction9 == null || (aVar10 = (a) accessibilityAction9.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar10.invoke()).booleanValue();
            case 1048576:
                AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getDismiss());
                if (accessibilityAction10 == null || (aVar11 = (a) accessibilityAction10.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar11.invoke()).booleanValue();
            case 2097152:
                String string = bundle2 != null ? bundle2.getString(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE) : null;
                AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetText());
                if (accessibilityAction11 == null || (lVar = (l) accessibilityAction11.getAction()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) lVar.invoke(new AnnotatedString(string, null, 2, null))).booleanValue();
            case android.R.id.accessibilityActionShowOnScreen:
                return AndroidComposeUiFlags.isAccessibilityShowOnScreenNestedScrollingEnabled ? scrollOntoScreen(semanticsNode) : legacyScrollOntoScreen(semanticsNode);
            case android.R.id.accessibilityActionSetProgress:
                if (bundle2 == null || !bundle2.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress())) == null || (lVar2 = (l) accessibilityAction.getAction()) == null) {
                    return false;
                }
                return ((Boolean) lVar2.invoke(Float.valueOf(bundle2.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)))).booleanValue();
            case android.R.id.accessibilityActionImeEnter:
                AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getOnImeAction());
                if (accessibilityAction12 == null || (aVar12 = (a) accessibilityAction12.getAction()) == null) {
                    return false;
                }
                return ((Boolean) aVar12.invoke()).booleanValue();
            default:
                switch (i3) {
                    case android.R.id.accessibilityActionScrollUp:
                    case android.R.id.accessibilityActionScrollLeft:
                    case android.R.id.accessibilityActionScrollDown:
                    case android.R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i3) {
                            case android.R.id.accessibilityActionPageUp:
                                AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageUp());
                                if (accessibilityAction13 != null && (r0 = (a) accessibilityAction13.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageDown:
                                AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageDown());
                                if (accessibilityAction14 != null && (r0 = (a) accessibilityAction14.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageLeft:
                                AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageLeft());
                                if (accessibilityAction15 != null && (r0 = (a) accessibilityAction15.getAction()) != null) {
                                    break;
                                }
                                break;
                            case android.R.id.accessibilityActionPageRight:
                                AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageRight());
                                if (accessibilityAction16 != null && (r0 = (a) accessibilityAction16.getAction()) != null) {
                                    break;
                                }
                                break;
                            default:
                                SparseArrayCompat<CharSequence> sparseArrayCompat = this.actionIdToLabel.get(i2);
                                if (sparseArrayCompat != null && (charSequence = sparseArrayCompat.get(i3)) != null && (list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getCustomActions())) != null) {
                                    int size = list.size();
                                    for (int i5 = 0; i5 < size; i5++) {
                                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i5);
                                        if (x.n(customAccessibilityAction.getLabel(), charSequence)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                }
                return false;
        }
        boolean z = i3 == 4096;
        boolean z2 = i3 == 8192;
        boolean z3 = i3 == 16908345;
        boolean z4 = i3 == 16908347;
        boolean z5 = i3 == 16908344;
        boolean z6 = z3 || z4 || z || z2;
        boolean z7 = z5 || i3 == 16908346 || z || z2;
        if (z || z2) {
            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getProgressBarRangeInfo());
            AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getSetProgress());
            if (progressBarRangeInfo != null && accessibilityAction17 != null) {
                float fE = (n.e(progressBarRangeInfo.getRange().getEndInclusive().floatValue(), progressBarRangeInfo.getRange().getStart().floatValue()) - n.f(progressBarRangeInfo.getRange().getStart().floatValue(), progressBarRangeInfo.getRange().getEndInclusive().floatValue())) / (progressBarRangeInfo.getSteps() > 0 ? progressBarRangeInfo.getSteps() + 1 : 20.0f);
                if (z2) {
                    fE = -fE;
                }
                l lVar3 = (l) accessibilityAction17.getAction();
                if (lVar3 != null) {
                    return ((Boolean) lVar3.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + fE))).booleanValue();
                }
                return false;
            }
        }
        long jM8013getSizeNHjbRc = LayoutCoordinatesKt.boundsInParent(semanticsNode.getLayoutInfo().getCoordinates()).m8013getSizeNHjbRc();
        Float scrollViewportLength = SemanticsUtils_androidKt.getScrollViewportLength(semanticsNode.getUnmergedConfig$ui());
        AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getScrollBy());
        if (accessibilityAction18 == null) {
            return false;
        }
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getHorizontalScrollAxisRange());
        if (scrollAxisRange != null && z6) {
            float fFloatValue = scrollViewportLength != null ? scrollViewportLength.floatValue() : Float.intBitsToFloat((int) (jM8013getSizeNHjbRc >> 32));
            if (z3 || z2) {
                fFloatValue = -fFloatValue;
            }
            if (scrollAxisRange.getReverseScrolling()) {
                fFloatValue = -fFloatValue;
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode) && (z3 || z4)) {
                fFloatValue = -fFloatValue;
            }
            if (performActionHelper$canScroll(scrollAxisRange, fFloatValue)) {
                if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getPageLeft()) || semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getPageRight())) {
                    AccessibilityAction accessibilityAction19 = fFloatValue > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageRight()) : (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageLeft());
                    if (accessibilityAction19 != null && (aVar6 = (a) accessibilityAction19.getAction()) != null) {
                        return ((Boolean) aVar6.invoke()).booleanValue();
                    }
                } else {
                    p pVar = (p) accessibilityAction18.getAction();
                    if (pVar != null) {
                        return ((Boolean) pVar.invoke(Float.valueOf(fFloatValue), Float.valueOf(0.0f))).booleanValue();
                    }
                }
                return false;
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getVerticalScrollAxisRange());
        if (scrollAxisRange2 != null && z7) {
            float fFloatValue2 = scrollViewportLength != null ? scrollViewportLength.floatValue() : Float.intBitsToFloat((int) (jM8013getSizeNHjbRc & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            if (z5 || z2) {
                fFloatValue2 = -fFloatValue2;
            }
            if (scrollAxisRange2.getReverseScrolling()) {
                fFloatValue2 = -fFloatValue2;
            }
            if (performActionHelper$canScroll(scrollAxisRange2, fFloatValue2)) {
                if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getPageUp()) || semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getPageDown())) {
                    AccessibilityAction accessibilityAction20 = fFloatValue2 > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageDown()) : (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsActions.INSTANCE.getPageUp());
                    if (accessibilityAction20 != null && (aVar5 = (a) accessibilityAction20.getAction()) != null) {
                        return ((Boolean) aVar5.invoke()).booleanValue();
                    }
                } else {
                    p pVar2 = (p) accessibilityAction18.getAction();
                    if (pVar2 != null) {
                        return ((Boolean) pVar2.invoke(Float.valueOf(0.0f), Float.valueOf(fFloatValue2))).booleanValue();
                    }
                }
            }
        }
        return false;
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f2) {
        if (f2 >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f2 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x063e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void populateAccessibilityNodeInfoProperties(int r24, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r25, androidx.compose.ui.semantics.SemanticsNode r26) {
        /*
            Method dump skipped, instructions count: 2593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int i2, List<ScrollObservationScope> list) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(list, i2);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(i2, this.scrollObservationScopes, null, null, null, null);
            z = true;
            scrollObservationScopeFindById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int i2) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(i2)) {
            return false;
        }
        int i3 = this.accessibilityFocusedVirtualViewId;
        if (i3 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i3, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = i2;
        this.view.invalidate();
        sendEventForVirtualView$default(this, i2, 32768, null, null, 12, null);
        return true;
    }

    private final void resetEnabledAccessibilityServiceList() {
        this._enabledServices = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            l<ScrollObservationScope, ab> lVar = this.scheduleScrollEventIfNeededLambda;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(scrollObservationScope, this);
            snapshotObserver.observer.observeReads(scrollObservationScope, lVar, anonymousClass1);
        }
    }

    /* renamed from: scrollDxDyForNodeVisible-RE3cj74, reason: not valid java name */
    private final long m10196scrollDxDyForNodeVisibleRE3cj74(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j2) {
        Rect rectBoundsInParent = LayoutCoordinatesKt.boundsInParent(semanticsNode2.getLayoutInfo().getCoordinates());
        LayoutCoordinates parentLayoutCoordinates = semanticsNode2.getLayoutInfo().getCoordinates().getParentLayoutCoordinates();
        Rect rectM8017translatek4lQ0M = rectBoundsInParent.m8017translatek4lQ0M(parentLayoutCoordinates != null ? LayoutCoordinatesKt.positionInRoot(parentLayoutCoordinates) : Offset.Companion.m7996getZeroF1C5BW0());
        Rect rectM8020Recttz77jQw = RectKt.m8020Recttz77jQw(Offset.m7985plusMKHz9U(semanticsNode.m10326getPositionInRootF1C5BW0(), j2), IntSizeKt.m11351toSizeozmzZPI(semanticsNode.m10329getSizeYbymL2g()));
        return (Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(rectM8020Recttz77jQw.getLeft() - rectM8017translatek4lQ0M.getLeft(), rectM8020Recttz77jQw.getRight() - rectM8017translatek4lQ0M.getRight())) << 32) | (Float.floatToRawIntBits(scrollDxDyForNodeVisible_RE3cj74$scrollDelta(rectM8020Recttz77jQw.getTop() - rectM8017translatek4lQ0M.getTop(), rectM8020Recttz77jQw.getBottom() - rectM8017translatek4lQ0M.getBottom())) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    private static final float scrollDxDyForNodeVisible_RE3cj74$scrollDelta(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:7:0x0019
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0036 -> B:7:0x0019). Please report as a decompilation issue!!! */
    private final boolean scrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode r15) {
        /*
            r14 = this;
            androidx.compose.ui.semantics.SemanticsNode r0 = r15.getParent()
            r1 = 0
            if (r0 == 0) goto L36
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r0.getUnmergedConfig$ui()
            if (r2 == 0) goto L36
            androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.getScrollBy()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r3)
            androidx.compose.ui.semantics.AccessibilityAction r2 = (androidx.compose.ui.semantics.AccessibilityAction) r2
        L19:
            if (r2 != 0) goto L38
            if (r0 == 0) goto L38
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getParent()
            if (r0 == 0) goto L36
            androidx.compose.ui.semantics.SemanticsConfiguration r2 = r0.getUnmergedConfig$ui()
            if (r2 == 0) goto L36
            androidx.compose.ui.semantics.SemanticsActions r3 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r3 = r3.getScrollBy()
            java.lang.Object r2 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r2, r3)
            androidx.compose.ui.semantics.AccessibilityAction r2 = (androidx.compose.ui.semantics.AccessibilityAction) r2
            goto L19
        L36:
            r2 = r1
            goto L19
        L38:
            if (r0 != 0) goto L7c
            androidx.compose.ui.geometry.Rect r15 = r15.getBoundsInRoot()
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r15.getLeft()
            double r1 = (double) r1
            double r1 = java.lang.Math.floor(r1)
            float r1 = (float) r1
            float r2 = r15.getTop()
            double r2 = (double) r2
            double r2 = java.lang.Math.floor(r2)
            float r2 = (float) r2
            float r3 = r15.getRight()
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            float r3 = (float) r3
            int r3 = h.h.a.b(r3)
            float r15 = r15.getBottom()
            double r4 = (double) r15
            double r4 = java.lang.Math.ceil(r4)
            float r15 = (float) r4
            int r15 = h.h.a.b(r15)
            int r1 = (int) r1
            int r2 = (int) r2
            r0.<init>(r1, r2, r3, r15)
            androidx.compose.ui.platform.AndroidComposeView r14 = r14.view
            boolean r14 = r14.requestRectangleOnScreen(r0)
            return r14
        L7c:
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r1 = r1.m7996getZeroF1C5BW0()
            r3 = 0
            r4 = r3
        L84:
            if (r0 == 0) goto Le0
            androidx.compose.ui.semantics.SemanticsConfiguration r5 = r0.getUnmergedConfig$ui()
            androidx.compose.ui.semantics.SemanticsActions r6 = androidx.compose.ui.semantics.SemanticsActions.INSTANCE
            androidx.compose.ui.semantics.SemanticsPropertyKey r6 = r6.getScrollBy()
            java.lang.Object r5 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r5, r6)
            androidx.compose.ui.semantics.AccessibilityAction r5 = (androidx.compose.ui.semantics.AccessibilityAction) r5
            if (r5 == 0) goto Ldb
            long r6 = r14.m10196scrollDxDyForNodeVisibleRE3cj74(r15, r0, r1)
            long r8 = r14.m10193adjustForReversedScrollingAndRtlRE3cj74(r15, r0, r6)
            h.c r5 = r5.getAction()
            h.g.a.p r5 = (h.g.a.p) r5
            r10 = 1
            if (r5 == 0) goto Ld2
            r11 = 32
            long r11 = r8 >> r11
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r12
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r5 = r5.invoke(r11, r8)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != r10) goto Ld2
            goto Ld4
        Ld2:
            if (r4 == 0) goto Ld6
        Ld4:
            r4 = r10
            goto Ld7
        Ld6:
            r4 = r3
        Ld7:
            long r1 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r1, r6)
        Ldb:
            androidx.compose.ui.semantics.SemanticsNode r0 = r0.getParent()
            goto L84
        Le0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scrollOntoScreen(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    static final void semanticsChangeChecker$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.CC.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int i2) {
        if (i2 == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return i2;
    }

    private final void sendAccessibilitySemanticsStructureChangeEvents(SemanticsNode semanticsNode, SemanticsNodeCopy semanticsNodeCopy) {
        MutableIntSet mutableIntSetMutableIntSetOf = IntSetKt.mutableIntSetOf();
        List<SemanticsNode> replacedChildren$ui = semanticsNode.getReplacedChildren$ui();
        int size = replacedChildren$ui.size();
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = replacedChildren$ui.get(i2);
            if (getCurrentSemanticsNodes().containsKey(semanticsNode2.getId())) {
                if (!semanticsNodeCopy.getChildren().contains(semanticsNode2.getId())) {
                    notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                    return;
                }
                mutableIntSetMutableIntSetOf.add(semanticsNode2.getId());
            }
        }
        MutableIntSet children = semanticsNodeCopy.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            if (i6 != 8) {
                                break;
                            }
                        } else if ((255 & j2) < 128 && !mutableIntSetMutableIntSetOf.contains(iArr[(i3 << 3) + i5])) {
                            notifySubtreeAccessibilityStateChangedIfNeeded(semanticsNode.getLayoutNode$ui());
                            return;
                        } else {
                            j2 >>= 8;
                            i5++;
                        }
                    }
                } else if (i3 == length) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List<SemanticsNode> replacedChildren$ui2 = semanticsNode.getReplacedChildren$ui();
        int size2 = replacedChildren$ui2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            SemanticsNode semanticsNode3 = replacedChildren$ui2.get(i7);
            SemanticsNodeCopy semanticsNodeCopy2 = this.previousSemanticsNodes.get(semanticsNode3.getId());
            if (semanticsNodeCopy2 != null && getCurrentSemanticsNodes().containsKey(semanticsNode3.getId())) {
                sendAccessibilitySemanticsStructureChangeEvents(semanticsNode3, semanticsNodeCopy2);
            }
        }
    }

    private final boolean sendEvent(AccessibilityEvent accessibilityEvent) {
        if (!isEnabled$ui()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(accessibilityEvent).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int i2, int i3, Integer num, List<String> list) {
        if (i2 == Integer.MIN_VALUE || !isEnabled$ui()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i2, i3);
        if (num != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(list, ",", null, null, 0, null, null, 62, null));
        }
        return sendEvent(accessibilityEventCreateEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i2, i3, num, list);
    }

    private final void sendPaneChangeEvents(int i2, int i3, String str) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(i2), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(i3);
        if (str != null) {
            accessibilityEventCreateEvent.getText().add(str);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int i2) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (i2 != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), 131072);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0688  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap<androidx.compose.ui.semantics.SemanticsNodeWithAdjustedBounds> r50) {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(androidx.collection.IntObjectMap):void");
    }

    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, MutableIntSet mutableIntSet) {
        SemanticsConfiguration semanticsConfiguration;
        LayoutNode layoutNodeFindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes$ui().m10027hasH91voCI$ui(8)) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1.INSTANCE);
            }
            if (layoutNode == null || (semanticsConfiguration = layoutNode.getSemanticsConfiguration()) == null) {
                return;
            }
            if (!semanticsConfiguration.isMergingSemanticsOfDescendants() && (layoutNodeFindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, C03921.INSTANCE)) != null) {
                layoutNode = layoutNodeFindClosestParentNode;
            }
            if (layoutNode != null) {
                int semanticsId = layoutNode.getSemanticsId();
                if (mutableIntSet.add(semanticsId)) {
                    sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), 2048, 1, null, 8, null);
                }
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = this.pendingHorizontalScrollEvents.get(semanticsId);
            ScrollAxisRange scrollAxisRange2 = this.pendingVerticalScrollEvents.get(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventCreateEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode semanticsNode, int i2, int i3, boolean z) {
        String iterableTextForAccessibility;
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsActions.INSTANCE.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
            q qVar = (q) ((AccessibilityAction) semanticsNode.getUnmergedConfig$ui().get(SemanticsActions.INSTANCE.getSetSelection())).getAction();
            if (qVar != null) {
                return ((Boolean) qVar.invoke(Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i2 != i3 || i3 != this.accessibilityCursorPosition) && (iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode)) != null) {
            if (i2 < 0 || i2 != i3 || i3 > iterableTextForAccessibility.length()) {
                i2 = -1;
            }
            this.accessibilityCursorPosition = i2;
            String str = iterableTextForAccessibility;
            boolean z2 = str.length() > 0;
            sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNode.getId()), z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z2 ? Integer.valueOf(iterableTextForAccessibility.length()) : null, str));
            sendPendingTextTraversedAtGranularityEvent(semanticsNode.getId());
            return true;
        }
        return false;
    }

    private final void setContentInvalid(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (semanticsNode.getUnmergedConfig$ui().contains(SemanticsProperties.INSTANCE.getError())) {
            accessibilityNodeInfoCompat.setContentInvalid(true);
            accessibilityNodeInfoCompat.setError((CharSequence) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig$ui(), SemanticsProperties.INSTANCE.getError()));
        }
    }

    private final void setInvisibleIfEmptyBounds(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, SemanticsNode semanticsNode) {
        if (semanticsNode.getTouchBoundsInRoot().isEmpty()) {
            accessibilityNodeInfoCompat.setVisibleToUser(false);
        }
    }

    private final void setText(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AnnotatedString infoText = AndroidComposeViewAccessibilityDelegateCompat_androidKt.getInfoText(semanticsNode);
        accessibilityNodeInfoCompat.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final android.graphics.Rect toAndroidRect(Rect rect, float f2, float f3) {
        return new android.graphics.Rect((int) (rect.getLeft() + f2), (int) (rect.getTop() + f3), (int) (rect.getRight() + f2), (int) (rect.getBottom() + f3));
    }

    static /* synthetic */ android.graphics.Rect toAndroidRect$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Rect rect, float f2, float f3, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.toAndroidRect(rect, f2, f3);
    }

    private final android.graphics.Rect toBoundsInScreen(float f2, float f3, float f4, float f5) {
        long jMo9691localToScreenMKHz9U = this.view.mo9691localToScreenMKHz9U((Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32));
        long jMo9691localToScreenMKHz9U2 = this.view.mo9691localToScreenMKHz9U((Float.floatToRawIntBits(f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f4) << 32));
        int i2 = (int) (jMo9691localToScreenMKHz9U2 >> 32);
        int i3 = (int) (jMo9691localToScreenMKHz9U >> 32);
        float fFloor = (float) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2)));
        long j2 = jMo9691localToScreenMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE;
        int i4 = (int) (jMo9691localToScreenMKHz9U2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        int i5 = (int) j2;
        return new android.graphics.Rect((int) fFloor, (int) Math.floor(Math.min(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i5), Float.intBitsToFloat(i4))));
    }

    private final Rect toBoundsRelativeToNodeBounds(android.graphics.Rect rect, android.graphics.Rect rect2) {
        int i2 = rect.left - rect2.left;
        float f2 = i2;
        float f3 = rect.top - rect2.top;
        return new Rect(f2, f3, rect.width() + f2, rect.height() + f3);
    }

    private final float[] toCornerArray(Outline outline) {
        if (!(outline instanceof Outline.Rounded)) {
            return null;
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        return new float[]{Float.intBitsToFloat((int) (rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8030getTopLeftCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8031getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8031getTopRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8029getBottomRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8029getBottomRightCornerRadiuskKHJgLs() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), Float.intBitsToFloat((int) (rounded.getRoundRect().m8028getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & rounded.getRoundRect().m8028getBottomLeftCornerRadiuskKHJgLs()))};
    }

    private final Region toRegion(Outline outline, float f2, float f3) {
        if (!(outline instanceof Outline.Generic)) {
            return null;
        }
        Outline.Generic generic = (Outline.Generic) outline;
        Region region = new Region(toAndroidRect$default(this, generic.getBounds().translate(f2, f3), 0.0f, 0.0f, 3, null));
        Region region2 = new Region();
        Path path = generic.getPath();
        if (!(path instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((AndroidPath) path).getInternalPath();
        internalPath.offset(f2, f3);
        region2.setPath(internalPath, region);
        return region2;
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        AndroidComposeView androidComposeView = this.view;
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, androidComposeView.getDensity(), androidComposeView.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final boolean traverseAtGranularity(SemanticsNode semanticsNode, int i2, boolean z, boolean z2) {
        AccessibilityIterators.TextSegmentIterator iteratorForGranularity;
        int accessibilitySelectionStart;
        int id = semanticsNode.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(semanticsNode.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        String str = iterableTextForAccessibility;
        if (str != null && str.length() != 0 && (iteratorForGranularity = getIteratorForGranularity(semanticsNode, i2)) != null) {
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(semanticsNode);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = z ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = z ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing != null) {
                int i3 = iArrFollowing[0];
                int i4 = iArrFollowing[1];
                int i5 = true != z ? i3 : i4;
                if (z2 && isAccessibilitySelectionExtendable(semanticsNode)) {
                    accessibilitySelectionStart = getAccessibilitySelectionStart(semanticsNode);
                    if (accessibilitySelectionStart == -1) {
                        accessibilitySelectionStart = true != z ? i4 : i3;
                    }
                } else {
                    accessibilitySelectionStart = i5;
                }
                this.pendingTextTraversedEvent = new PendingTextTraversedEvent(semanticsNode, true != z ? 512 : 256, i2, i3, i4, SystemClock.uptimeMillis());
                setAccessibilitySelection(semanticsNode, accessibilitySelectionStart, i5, true);
                return true;
            }
        }
        return false;
    }

    private final <T extends CharSequence> T trimToSize(T t, int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (t == null || t.length() == 0 || t.length() <= i2) {
            return t;
        }
        int i3 = i2 - 1;
        if (Character.isHighSurrogate(t.charAt(i3)) && Character.isLowSurrogate(t.charAt(i2))) {
            i2 = i3;
        }
        T t2 = (T) t.subSequence(0, i2);
        x.d(t2, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t2;
    }

    private final void updateHoveredVirtualView(int i2) {
        int i3 = this.hoveredVirtualViewId;
        if (i3 == i2) {
            return;
        }
        this.hoveredVirtualViewId = i2;
        sendEventForVirtualView$default(this, i2, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i3, 256, null, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: all -> 0x00cb, TryCatch #0 {all -> 0x00cb, blocks: (B:13:0x002f, B:22:0x0056, B:25:0x0063, B:27:0x006b, B:29:0x0074, B:31:0x007f, B:32:0x0090, B:35:0x009d, B:36:0x00a4, B:18:0x0043, B:21:0x004a), top: B:45:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00bf -> B:22:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui(h.c.e<? super h.ab> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            java.lang.Object r6 = r0.L$0
            androidx.collection.MutableIntSet r6 = (androidx.collection.MutableIntSet) r6
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> Lcb
            goto L56
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.a.q r2 = (kotlinx.coroutines.a.q) r2
            java.lang.Object r6 = r0.L$0
            androidx.collection.MutableIntSet r6 = (androidx.collection.MutableIntSet) r6
            e.b.c.b(r10)     // Catch: java.lang.Throwable -> Lcb
            goto L63
        L47:
            e.b.c.b(r10)
            androidx.collection.MutableIntSet r6 = new androidx.collection.MutableIntSet     // Catch: java.lang.Throwable -> Lcb
            r10 = 0
            r6.<init>(r3, r5, r10)     // Catch: java.lang.Throwable -> Lcb
            kotlinx.coroutines.a.o<h.ab> r10 = r9.boundsUpdateChannel     // Catch: java.lang.Throwable -> Lcb
            kotlinx.coroutines.a.q r2 = r10.p()     // Catch: java.lang.Throwable -> Lcb
        L56:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Lcb
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Lcb
            r0.label = r5     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r10 = r2.a(r0)     // Catch: java.lang.Throwable -> Lcb
            if (r10 != r1) goto L63
            goto Lc2
        L63:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Lcb
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto Lc3
            r2.b()     // Catch: java.lang.Throwable -> Lcb
            boolean r10 = r9.isEnabled$ui()     // Catch: java.lang.Throwable -> Lcb
            if (r10 == 0) goto La4
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r10 = r9.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> Lcb
            java.util.Collection r10 = (java.util.Collection) r10     // Catch: java.lang.Throwable -> Lcb
            int r10 = r10.size()     // Catch: java.lang.Throwable -> Lcb
            r7 = r3
        L7d:
            if (r7 >= r10) goto L90
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r8 = r9.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r8 = r8.valueAt(r7)     // Catch: java.lang.Throwable -> Lcb
            androidx.compose.ui.node.LayoutNode r8 = (androidx.compose.ui.node.LayoutNode) r8     // Catch: java.lang.Throwable -> Lcb
            r9.sendSubtreeChangeAccessibilityEvents(r8, r6)     // Catch: java.lang.Throwable -> Lcb
            r9.sendTypeViewScrolledAccessibilityEvent(r8)     // Catch: java.lang.Throwable -> Lcb
            int r7 = r7 + 1
            goto L7d
        L90:
            r6.clear()     // Catch: java.lang.Throwable -> Lcb
            android.os.Handler r10 = r9.getHandler()     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = r9.checkingForSemanticsChanges     // Catch: java.lang.Throwable -> Lcb
            if (r7 != 0) goto La4
            if (r10 == 0) goto La4
            r9.checkingForSemanticsChanges = r5     // Catch: java.lang.Throwable -> Lcb
            java.lang.Runnable r7 = r9.semanticsChangeChecker     // Catch: java.lang.Throwable -> Lcb
            r10.post(r7)     // Catch: java.lang.Throwable -> Lcb
        La4:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r10 = r9.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> Lcb
            r10.clear()     // Catch: java.lang.Throwable -> Lcb
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.semantics.ScrollAxisRange> r10 = r9.pendingHorizontalScrollEvents     // Catch: java.lang.Throwable -> Lcb
            r10.clear()     // Catch: java.lang.Throwable -> Lcb
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.semantics.ScrollAxisRange> r10 = r9.pendingVerticalScrollEvents     // Catch: java.lang.Throwable -> Lcb
            r10.clear()     // Catch: java.lang.Throwable -> Lcb
            long r7 = r9.SendRecurringAccessibilityEventsIntervalMillis     // Catch: java.lang.Throwable -> Lcb
            r0.L$0 = r6     // Catch: java.lang.Throwable -> Lcb
            r0.L$1 = r2     // Catch: java.lang.Throwable -> Lcb
            r0.label = r4     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r10 = kotlinx.coroutines.aj.q(r7, r0)     // Catch: java.lang.Throwable -> Lcb
            if (r10 == r1) goto Lc2
            goto L56
        Lc2:
            return r1
        Lc3:
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r9 = r9.subtreeChangedLayoutNodes
            r9.clear()
            h.ab r9 = h.ab.f48028a
            return r9
        Lcb:
            r10 = move-exception
            androidx.collection.ArraySet<androidx.compose.ui.node.LayoutNode> r9 = r9.subtreeChangedLayoutNodes
            r9.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui(h.c.e):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui, reason: not valid java name */
    public final boolean m10197canScroll0AR0LA0$ui(boolean z, int i2, long j2) {
        if (x.n(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m10194canScrollmoWRBKg(getCurrentSemanticsNodes(), z, i2, j2);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui(MotionEvent motionEvent) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui = hitTestSemanticsAt$ui(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui);
            if (iHitTestSemanticsAt$ui == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean getAccessibilityForceEnabledForTesting$ui() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        return this.nodeProvider;
    }

    public final String getExtraDataTestTraversalAfterVal$ui() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    public final String getExtraDataTestTraversalBeforeVal$ui() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    public final int getHoveredVirtualViewId$ui() {
        return this.hoveredVirtualViewId;
    }

    public final MutableIntIntMap getIdToAfterMap$ui() {
        return this.idToAfterMap;
    }

    public final MutableIntIntMap getIdToBeforeMap$ui() {
        return this.idToBeforeMap;
    }

    public final l<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui() {
        return this.onSendAccessibilityEvent;
    }

    public final Boolean getRequestFromAccessibilityToolForTesting$ui() {
        return this.requestFromAccessibilityToolForTesting;
    }

    public final long getSendRecurringAccessibilityEventsIntervalMillis$ui() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui(float f2, float f3) {
        int iSemanticsNodeIdToAccessibilityVirtualNodeId;
        Owner.CC.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m9973hitTestSemantics6fMxITs$ui$default(this.view.getRoot(), (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), hitTestResult, 0, false, 12, null);
        HitTestResult hitTestResult2 = hitTestResult;
        x.f(hitTestResult2, "<this>");
        int size = hitTestResult2.size();
        while (true) {
            size--;
            iSemanticsNodeIdToAccessibilityVirtualNodeId = Integer.MIN_VALUE;
            if (size < 0) {
                break;
            }
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(hitTestResult.get(size));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) == null) {
                if (layoutNodeRequireLayoutNode.getNodes$ui().m10027hasH91voCI$ui(8)) {
                    iSemanticsNodeIdToAccessibilityVirtualNodeId = semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
                    SemanticsNode SemanticsNode = SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false);
                    if (SemanticsOwnerKt.isImportantForAccessibility(SemanticsNode) && !SemanticsNode_androidKt.isAccessibilityIgnoredLink(SemanticsNode)) {
                        break;
                    }
                }
            } else {
                return Integer.MIN_VALUE;
            }
        }
        return iSemanticsNodeIdToAccessibilityVirtualNodeId;
    }

    public final boolean isEnabled$ui() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !getEnabledServices().isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    public final void onLayoutChange$ui(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handler = getHandler();
        if (!isEnabled$ui() || this.checkingForSemanticsChanges || handler == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handler.post(this.semanticsChangeChecker);
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean z) {
        resetEnabledAccessibilityServiceList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            resetEnabledAccessibilityServiceList();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handler = getHandler();
        if (handler == null) {
            x.g();
        }
        handler.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void setAccessibilityForceEnabledForTesting$ui(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui(int i2) {
        this.hoveredVirtualViewId = i2;
    }

    public final void setIdToAfterMap$ui(MutableIntIntMap mutableIntIntMap) {
        this.idToAfterMap = mutableIntIntMap;
    }

    public final void setIdToBeforeMap$ui(MutableIntIntMap mutableIntIntMap) {
        this.idToBeforeMap = mutableIntIntMap;
    }

    public final void setOnSendAccessibilityEvent$ui(l<? super AccessibilityEvent, Boolean> lVar) {
        this.onSendAccessibilityEvent = lVar;
    }

    public final void setRequestFromAccessibilityToolForTesting$ui(Boolean bool) {
        this.requestFromAccessibilityToolForTesting = bool;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui(long j2) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j2;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }

    private static /* synthetic */ void getHandler$annotations() {
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui$annotations() {
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui$annotations() {
    }

    private final android.graphics.Rect toAndroidRect(Outline outline, float f2, float f3) {
        if ((outline instanceof Outline.Rectangle) || (outline instanceof Outline.Rounded)) {
            return toAndroidRect(outline.getBounds(), f2, f3);
        }
        return null;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        final /* synthetic */ ScrollObservationScope $scrollObservationScope;
        final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
            super(0);
            this.$scrollObservationScope = scrollObservationScope;
            this.this$0 = androidComposeViewAccessibilityDelegateCompat;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SemanticsNode semanticsNode;
            LayoutNode layoutNode$ui;
            ScrollObservationScope scrollObservationScope = this.$scrollObservationScope;
            ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
            ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
            Float oldXValue = scrollObservationScope.getOldXValue();
            Float oldYValue = scrollObservationScope.getOldYValue();
            float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
            float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.this$0.semanticsNodeIdToAccessibilityVirtualNodeId(this.$scrollObservationScope.getSemanticsNodeId());
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.this$0;
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat.getCurrentSemanticsNodes().get(androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId);
                if (semanticsNodeWithAdjustedBounds != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this.this$0;
                    try {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = androidComposeViewAccessibilityDelegateCompat2.currentlyAccessibilityFocusedANI;
                        if (accessibilityNodeInfoCompat != null) {
                            accessibilityNodeInfoCompat.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat2.boundsInScreen(semanticsNodeWithAdjustedBounds));
                        }
                    } catch (IllegalStateException unused) {
                    }
                }
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this.this$0;
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) androidComposeViewAccessibilityDelegateCompat3.getCurrentSemanticsNodes().get(androidComposeViewAccessibilityDelegateCompat3.focusedVirtualViewId);
                if (semanticsNodeWithAdjustedBounds2 != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat4 = this.this$0;
                    try {
                        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = androidComposeViewAccessibilityDelegateCompat4.currentlyFocusedANI;
                        if (accessibilityNodeInfoCompat2 != null) {
                            accessibilityNodeInfoCompat2.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat4.boundsInScreen(semanticsNodeWithAdjustedBounds2));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                }
                this.this$0.getView().invalidate();
                SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds3 = (SemanticsNodeWithAdjustedBounds) this.this$0.getCurrentSemanticsNodes().get(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                if (semanticsNodeWithAdjustedBounds3 != null && (semanticsNode = semanticsNodeWithAdjustedBounds3.getSemanticsNode()) != null && (layoutNode$ui = semanticsNode.getLayoutNode$ui()) != null) {
                    AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat5 = this.this$0;
                    if (horizontalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat5.pendingHorizontalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        androidComposeViewAccessibilityDelegateCompat5.pendingVerticalScrollEvents.set(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                    }
                    androidComposeViewAccessibilityDelegateCompat5.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.$scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
            }
            if (verticalScrollAxisRange != null) {
                this.$scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
            }
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }
}
