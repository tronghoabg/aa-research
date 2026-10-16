package androidx.compose.ui.node;

import android.view.View;
import androidx.collection.IntObjectMap;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.c.e;
import h.c.j;
import h.g.a.a;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface Owner extends PositionCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z) {
            enableExtraAssertions = z;
        }
    }

    /* compiled from: WazeSource */
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo10131calculateLocalPositionMKHz9U(long j2);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo10132calculatePositionInWindowMKHz9U(long j2);

    OwnedLayer createLayer(p<? super Canvas, ? super GraphicsLayer, ab> pVar, a<ab> aVar, GraphicsLayer graphicsLayer);

    void decrementKeepScreenOnCount();

    void decrementSensitiveComponentCount();

    /* renamed from: dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
    void mo10133dispatchOnScrollChangedk4lQ0M(long j2);

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    j getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    IntObjectMap<LayoutNode> getLayoutNodes();

    LocaleList getLocaleList();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    OutOfFrameExecutor getOutOfFrameExecutor();

    Placeable.PlacementScope getPlacementScope();

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    RetainedValuesStore getRetainedValuesStore();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    void incrementKeepScreenOnCount();

    void incrementSensitiveComponentCount();

    void invalidateRootLayer();

    void measureAndLayout(boolean z);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo10134measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onLayoutNodeDeactivated(LayoutNode layoutNode);

    void onPostAttach(LayoutNode layoutNode);

    void onPostLayoutNodeReused(LayoutNode layoutNode, int i2);

    void onPreAttach(LayoutNode layoutNode);

    void onPreLayoutNodeReused(LayoutNode layoutNode, int i2);

    void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3);

    void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(a<ab> aVar);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    void requestAutofill(LayoutNode layoutNode);

    void requestOnPositionedCallback(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);

    Object textInputSession(p<? super PlatformTextInputSessionScope, ? super e<?>, ? extends Object> pVar, e<?> eVar);

    void voteFrameRate(float f2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.node.Owner$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static OutOfFrameExecutor $default$getOutOfFrameExecutor(Owner owner) {
            return null;
        }

        public static /* synthetic */ OwnedLayer createLayer$default(Owner owner, p pVar, a aVar, GraphicsLayer graphicsLayer, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
            }
            if ((i2 & 4) != 0) {
                graphicsLayer = null;
            }
            return owner.createLayer(pVar, aVar, graphicsLayer);
        }

        public static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
            }
            owner.forceMeasureTheSubtree(layoutNode, z & ((i2 & 2) == 0));
        }

        public static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
            }
            owner.measureAndLayout(1 == ((z ? 1 : 0) | (i2 & 1)));
        }

        public static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
            }
            owner.onRequestMeasure(layoutNode, z & ((i2 & 2) == 0), z2 & ((i2 & 4) == 0), z3 | (!((i2 & 8) == 0)));
        }

        public static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z, boolean z2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
            }
            owner.onRequestRelayout(layoutNode, z & ((i2 & 2) == 0), z2 & ((i2 & 4) == 0));
        }

        public static /* synthetic */ void getFontLoader$annotations() {
        }

        public static void $default$decrementKeepScreenOnCount(Owner owner) {
        }

        public static void $default$decrementSensitiveComponentCount(Owner owner) {
        }

        public static void $default$incrementKeepScreenOnCount(Owner owner) {
        }

        public static void $default$incrementSensitiveComponentCount(Owner owner) {
        }

        public static void $default$invalidateRootLayer(Owner owner) {
        }

        /* renamed from: $default$dispatchOnScrollChanged-k-4lQ0M, reason: not valid java name */
        public static void m10135$default$dispatchOnScrollChangedk4lQ0M(Owner owner, long j2) {
        }

        public static void $default$voteFrameRate(Owner owner, float f2) {
        }

        public static void $default$onPostLayoutNodeReused(Owner owner, LayoutNode layoutNode, int i2) {
        }

        public static void $default$onPreLayoutNodeReused(Owner owner, LayoutNode layoutNode, int i2) {
        }
    }
}
