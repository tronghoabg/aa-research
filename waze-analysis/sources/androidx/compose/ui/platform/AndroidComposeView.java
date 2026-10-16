package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.RetainedValuesStore;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.AndroidAutofillManager;
import androidx.compose.ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillManager;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusOwnerImplKt;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.focus.PlatformFocusOwner;
import androidx.compose.ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeChangeRequester;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent;
import androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent_androidKt;
import androidx.compose.ui.input.indirect.IndirectPointerEvent;
import androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis;
import androidx.compose.ui.input.indirect.IndirectPointerInputModifierNode;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.InsetsListener;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.WindowInsetsRulerProvider;
import androidx.compose.ui.layout.WindowInsetsRulers_androidKt;
import androidx.compose.ui.layout.WindowWindowInsetsAnimationValues;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import androidx.compose.ui.node.OutOfFrameExecutor;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeView.RootModifierNode;
import androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsModifier;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.spatial.ExecuteDelayed;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.media3.muxer.MuxerUtil;
import com.waze.R;
import h.a.u;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.c.j;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.ar;
import h.g.b.au;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, PlatformFocusOwner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver, OutOfFrameExecutor, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, FocusListener, ExecuteDelayed {
    public static final int $stable = 8;
    public static final Companion Companion;
    private static Method addChangeCallbackMethod;
    private static final MutableObjectList<AndroidComposeView> composeViews;
    private static Method dispatchOnScrollChangedMethod;
    private static Method getBooleanMethod;
    private static Runnable systemPropertiesChangedRunnable;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final MutableState _composeViewContext$delegate;
    private InputModeManagerImpl _inputModeManager;
    private TextInputServiceAndroid _legacyTextInputServiceAndroid;
    private View _rootView;
    private SoftwareKeyboardController _softwareKeyboardController;
    private TextInputService _textInputService;
    private final AutofillTree autofillTree;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private boolean composeViewContextIncrementedDuringInit;
    private final MutableState configuration$delegate;
    private AndroidContentCaptureManager contentCaptureManager;
    private j coroutineContext;
    private float currentFrameRate;
    private float currentFrameRateCategory;
    private final MutableState density$delegate;
    private final State derivedIsAttached$delegate;
    private final MutableObjectList<OwnedLayer> dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final MutableObjectList<a<ab>> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private boolean forceUseMatrixCache;
    private LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler;
    private View frameRateCategoryView;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private boolean hoverExitReceived;
    private final IndirectPointerNavigationGestureDetector indirectPointerNavigationGestureDetector;
    private final InsetsListener insetsListener;
    private final MutableState isAttached$delegate;
    private boolean isDispatchingAutofillStructure;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private int keepScreenOnCount;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private float lastSetFrameRate;
    private float lastSetFrameRateCategory;
    private final WeakCache<OwnedLayer> layerCache;
    private final a<ab> layoutChildViewsIfNeeded;
    private final MutableState layoutDirection$delegate;
    private final MutableIntObjectMap<LayoutNode> layoutNodes;
    private LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry lifecycleRetainedValuesStoreOwnerEntry;
    private final State localeList$delegate;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private l<? super ComposeViewContext, ab> onReadyForComposition;
    private final u<a<ab>> outOfFrameQueue;
    private final Runnable outOfFrameRunnable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private MutableObjectList<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private IndirectPointerEventPrimaryDirectionalMotionAxis primaryDirectionalMotionAxisOverride;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final a<ab> resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private RetainedValuesStore retainedValuesStore;
    private final LayoutNode root;
    private final ScrollCapture scrollCapture;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete;
    private final AtomicReference<SessionMutex.Session<AndroidPlatformTextInputSession>> textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1, reason: invalid class name and case insensitive filesystem */
    final class C03861 extends y implements a<Boolean> {
        final /* synthetic */ KeyEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03861(KeyEvent keyEvent) {
            super(0);
            this.$event = keyEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(this.$event));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1, reason: invalid class name and case insensitive filesystem */
    final class C03881 extends y implements a<Boolean> {
        final /* synthetic */ MotionEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03881(MotionEvent motionEvent) {
            super(0);
            this.$event = motionEvent;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(this.$event));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$requestFocusCurrent$1, reason: invalid class name and case insensitive filesystem */
    final class C03901 extends y implements l<FocusTargetNode, Boolean> {
        final /* synthetic */ int $focusDirection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03901(int i2) {
            super(1);
            this.$focusDirection = i2;
        }

        @Override // h.g.a.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return Boolean.valueOf(focusTargetNode.mo7888requestFocus3ESFkO8(this.$focusDirection));
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1, reason: invalid class name and case insensitive filesystem */
    final class C03911 extends c {
        int label;
        /* synthetic */ Object result;

        C03911(e<? super C03911> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<af, AndroidPlatformTextInputSession> {
        AnonymousClass2() {
            super(1);
        }

        @Override // h.g.a.l
        public final AndroidPlatformTextInputSession invoke(af afVar) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            return new AndroidPlatformTextInputSession(androidComposeView, androidComposeView.getTextInputService(), afVar);
        }
    }

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        composeViews = new MutableObjectList<>(0, 1, oVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v14, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    public AndroidComposeView(Context context, ComposeViewContext composeViewContext) {
        super(context);
        this._composeViewContext$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(composeViewContext, null, 2, null);
        this.lastDownPointerPosition = Offset.Companion.m7995getUnspecifiedF1C5BW0();
        int i2 = 1;
        this.superclassInitComplete = true;
        this.retainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        this.outOfFrameQueue = new u<>();
        this.outOfFrameRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.outOfFrameRunnable$lambda$0(this.f$0);
            }
        };
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        AndroidComposeView androidComposeView = this;
        this.focusOwner = new FocusOwnerImpl(this, androidComposeView);
        this.coroutineContext = composeViewContext.getCompositionContext$ui().getEffectCoroutineContext();
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this.isAttached$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.derivedIsAttached$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$derivedIsAttached$2(this));
        this.insetsListener = new InsetsListener(this);
        LayoutNode layoutNode = new LayoutNode(false, null == true ? 1 : 0, 3, null == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(new ModifierNodeElement<RootModifierNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$root$1$1
            @Override // androidx.compose.ui.node.ModifierNodeElement
            public AndroidComposeView.RootModifierNode create() {
                return this.this$0.new RootModifierNode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("rootModifier");
            }

            @Override // androidx.compose.ui.node.ModifierNodeElement
            public /* bridge */ /* synthetic */ void update(Modifier.Node node) {
            }

            public void update(AndroidComposeView.RootModifierNode rootModifierNode) {
            }
        }.then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()));
        this.root = layoutNode;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes(), this);
        this.semanticsOwner = new SemanticsOwner(getRoot(), new EmptySemanticsModifier(), getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new MutableObjectList<>(null == true ? 1 : 0, i2, null == true ? 1 : 0);
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configuration$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(context.getResources().getConfiguration()), null, 2, null);
        this.localeList$delegate = SnapshotStateKt.derivedStateOf(new AndroidComposeView$localeList$2(this));
        AndroidComposeView androidComposeView2 = this;
        this._autofill = new AndroidAutofill(androidComposeView2, getAutofillTree());
        this._autofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(context), getSemanticsOwner(), androidComposeView2, getRectManager(), context.getPackageName());
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        this.globalPosition = 9223372034707292159L;
        this.tmpPositionArray = new int[]{0, 0};
        this.tmpMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
        this.viewToWindowMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
        this.windowToViewMatrix = Matrix.m8492constructorimpl$default(null, 1, null);
        this.lastMatrixRecalculationAnimationTime = -1L;
        this.windowPosition = Offset.Companion.m7994getInfiniteF1C5BW0();
        this.isRenderNodeCompatible = true;
        this.textInputSessionMutex = SessionMutex.m7662constructorimpl();
        this.fontFamilyResolver$delegate = composeViewContext.getFontFamilyResolver$ui();
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        this.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        this.modifierLocalManager = new ModifierLocalManager(androidComposeView);
        this.textToolbar = new AndroidTextToolbar(androidComposeView2);
        this.layerCache = new WeakCache<>();
        this.endApplyChangesListeners = new MutableObjectList<>(null == true ? 1 : 0, i2, null == true ? 1 : 0);
        this.currentFrameRate = Float.NaN;
        this.currentFrameRateCategory = Float.NaN;
        this.lastSetFrameRate = Float.NaN;
        this.lastSetFrameRateCategory = Float.NaN;
        this.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                int actionMasked;
                int i3;
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
                    return;
                }
                int i4 = 7;
                if (actionMasked == 7) {
                    i3 = i4;
                } else if (actionMasked != 8) {
                    if (actionMasked != 9) {
                        i4 = 2;
                    }
                    i3 = i4;
                } else {
                    i3 = 9;
                }
                AndroidComposeView androidComposeView3 = this.this$0;
                androidComposeView3.sendSimulatedEvent(motionEvent, i3, androidComposeView3.relayoutTime, false);
            }
        };
        this.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$0(this.f$0);
            }
        };
        this.indirectPointerNavigationGestureDetector = new IndirectPointerNavigationGestureDetector(context, new AndroidComposeView$indirectPointerNavigationGestureDetector$1(this));
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        this.layoutChildViewsIfNeeded = new AndroidComposeView$layoutChildViewsIfNeeded$1(this);
        this.matrixToWindow = new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(androidComposeView2, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(androidComposeView2, androidComposeViewAccessibilityDelegateCompat);
        l<ViewRootForTest, ab> onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(androidComposeView2);
        if (isArrEnabled$ui()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, true);
            this.frameRateCategoryView = view;
            addView(view);
        }
        this.scrollCapture = Build.VERSION.SDK_INT >= 31 ? new ScrollCapture() : null;
        this.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.Companion.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public PointerIcon getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentMouseCursorIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, this.currentMouseCursorIcon);
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon pointerIcon) {
                this.currentStylusHoverIcon = pointerIcon;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int orDefault;
        boolean zN = x.n(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.composeAccessibilityDelegate;
        if (zN) {
            int orDefault2 = androidComposeViewAccessibilityDelegateCompat.getIdToBeforeMap$ui().getOrDefault(i2, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!x.n(str, androidComposeViewAccessibilityDelegateCompat.getExtraDataTestTraversalAfterVal$ui()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap$ui().getOrDefault(i2, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    private final boolean autofillSupported() {
        return true;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui = layoutNode.getParent$ui();
        return (parent$ui == null || parent$ui.getHasFixedInnerContentConstraints$ui()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m10176component1VKZWuLQ(long j2) {
        return (int) (j2 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m10177component2VKZWuLQ(long j2) {
        return (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m10178convertMeasureSpecI7RO_PI(int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return m10185packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m10185packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m10185packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchConfigurationChangeIfNeeded() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 32 || i2 >= 34) {
            return;
        }
        updateConfiguration(getResources().getConfiguration());
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i2) {
        AndroidComposeView androidComposeView = this;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = androidComposeView;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            x.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i2);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(androidComposeView, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    /* renamed from: findNextViewInEmbeddedView-3ESFkO8, reason: not valid java name */
    private final View m10179findNextViewInEmbeddedView3ESFkO8(int i2) {
        FocusTargetNode activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(i2);
        if (numM7867toAndroidFocusDirection3ESFkO8 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
            throw new h.e();
        }
        int iIntValue = numM7867toAndroidFocusDirection3ESFkO8.intValue();
        View interopView = DelegatableNodeKt.requireLayoutNode(activeFocusTargetNode).getInteropView();
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        x.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue);
        if (viewFindNextFocus == null || interopView == null || !AndroidComposeView_androidKt.containsDescendant(interopView, viewFindNextFocus)) {
            return null;
        }
        return viewFindNextFocus;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i2, View view) {
        return null;
    }

    private final CanvasHolder getCanvasHolder() {
        return getComposeViewContext().getCanvasHolder$ui();
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.derivedIsAttached$delegate.getValue()).booleanValue();
    }

    private final TextInputServiceAndroid getLegacyTextInputServiceAndroid() {
        TextInputServiceAndroid textInputServiceAndroid = this._legacyTextInputServiceAndroid;
        if (textInputServiceAndroid != null) {
            return textInputServiceAndroid;
        }
        TextInputServiceAndroid textInputServiceAndroid2 = new TextInputServiceAndroid(getView(), this);
        this._legacyTextInputServiceAndroid = textInputServiceAndroid2;
        return textInputServiceAndroid2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ComposeViewContext get_composeViewContext() {
        return (ComposeViewContext) this._composeViewContext$delegate.getValue();
    }

    private final boolean handleIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        this.indirectPointerNavigationGestureDetector.onIndirectPointerEvent(indirectPointerEvent, getFocusOwner().dispatchIndirectPointerEvent(indirectPointerEvent));
        return true;
    }

    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m10181handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        AndroidComposeView androidComposeView;
        MotionEvent motionEvent2;
        int i2;
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            am amVar = new am();
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.previousMotionEvent;
                boolean z2 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                if (motionEvent3 != null) {
                    try {
                        if (hasChangedDevices(motionEvent, motionEvent3)) {
                            if (isDevicePressEvent(motionEvent3)) {
                                this.pointerInputEventProcessor.processCancel();
                            } else if (motionEvent3.getActionMasked() != 10 && z2) {
                                sendSimulatedEvent$default(this, motionEvent3, 10, motionEvent3.getEventTime(), false, 8, null);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                int toolType = motionEvent.getToolType(0);
                if (z2 || toolType != 3 || actionMasked == 3 || actionMasked == 9 || !isInBounds(motionEvent)) {
                    androidComposeView = this;
                    motionEvent2 = motionEvent3;
                    i2 = 9;
                } else {
                    motionEvent2 = motionEvent3;
                    i2 = 9;
                    androidComposeView = this;
                    sendSimulatedEvent$default(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                int buttonState = motionEvent.getButtonState();
                if (actionMasked == 8 && buttonState == 0 && motionEvent2 != null && !motionEvent2.isFromSource(InputDeviceCompat.SOURCE_TOUCHSCREEN)) {
                    amVar.f48101a = true;
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = androidComposeView.previousMotionEvent;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = androidComposeView.previousMotionEvent;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    if (motionEvent.getAction() == i2 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            androidComposeView.motionEventAdapter.endStream(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = androidComposeView.previousMotionEvent;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = androidComposeView.previousMotionEvent;
                        float y = motionEvent7 != null ? motionEvent7.getY() : Float.NaN;
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (x == x2 && y == y2) {
                            z = false;
                        }
                        MotionEvent motionEvent8 = androidComposeView.previousMotionEvent;
                        long eventTime = motionEvent8 != null ? motionEvent8.getEventTime() : -1L;
                        long eventTime2 = motionEvent.getEventTime();
                        if (z || eventTime != eventTime2) {
                            if (pointerId >= 0) {
                                androidComposeView.motionEventAdapter.endStream(pointerId);
                            }
                            androidComposeView.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                        }
                    }
                }
                androidComposeView.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                if (amVar.f48101a) {
                    sendSimulatedEvent$default(androidComposeView, motionEvent, 10, motionEvent.getEventTime(), false, 8, null);
                }
                int iM10186sendMotionEvent8iAsVTc = m10186sendMotionEvent8iAsVTc(motionEvent);
                Trace.endSection();
                if ((iM10186sendMotionEvent8iAsVTc & 4) == 0 && amVar.f48101a) {
                    androidComposeView.pointerInputEventProcessor.clearPreviouslyHitModifierNodes();
                    sendSimulatedEvent$default(androidComposeView, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                androidComposeView.forceUseMatrixCache = false;
                return iM10186sendMotionEvent8iAsVTc;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.forceUseMatrixCache = false;
            throw th3;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f2, f2 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new C03881(motionEvent));
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final RetainedValuesStore installLocalRetainedValuesStore(LifecycleOwner lifecycleOwner, ViewModelStoreOwner viewModelStoreOwner) {
        LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
        if (lifecycleOwner == null || viewModelStoreOwner == null || frameEndScheduler == null) {
            return null;
        }
        ViewModelProvider viewModelProviderCreate$default = ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner.getViewModelStore(), new ViewModelProvider.NewInstanceFactory(), (CreationExtras) null, 4, (Object) null);
        int i2 = ar.f48106a;
        LifecycleRetainedValuesStoreOwner lifecycleRetainedValuesStoreOwner = (LifecycleRetainedValuesStoreOwner) viewModelProviderCreate$default.get(new m(LifecycleRetainedValuesStoreOwner.class));
        Object parent = getParent();
        x.d(parent, "null cannot be cast to non-null type android.view.View");
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry orCreateRetainedValuesStoreEntry = lifecycleRetainedValuesStoreOwner.getOrCreateRetainedValuesStoreEntry(((View) parent).getId());
        this.lifecycleRetainedValuesStoreOwnerEntry = orCreateRetainedValuesStoreEntry;
        return orCreateRetainedValuesStoreEntry.getRetainedValuesStore();
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            invalidateLayers(layoutNodeArr[i2]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestRemeasure(layoutNode, false & ((2 & 2) == 0));
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAttached() {
        return ((Boolean) this.isAttached$delegate.getValue()).booleanValue();
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 1; i2 < pointerCount; i2++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i2)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i2)) & Integer.MAX_VALUE) >= 2139095040 || !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i2);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* renamed from: moveFocusInChildrenBypassUnfocusableComposeView-3ESFkO8, reason: not valid java name */
    private final boolean m10182moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(int i2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7861getExitdhqQ8s())) {
            return false;
        }
        Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(i2);
        if (numM7867toAndroidFocusDirection3ESFkO8 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
            throw new h.e();
        }
        int iIntValue = numM7867toAndroidFocusDirection3ESFkO8.intValue();
        View viewM10179findNextViewInEmbeddedView3ESFkO8 = m10179findNextViewInEmbeddedView3ESFkO8(i2);
        if (viewM10179findNextViewInEmbeddedView3ESFkO8 != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewM10179findNextViewInEmbeddedView3ESFkO8, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenCurrent-3ESFkO8, reason: not valid java name */
    private final boolean m10183moveFocusInChildrenCurrent3ESFkO8(int i2) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7861getExitdhqQ8s())) {
            return false;
        }
        Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(i2);
        if (numM7867toAndroidFocusDirection3ESFkO8 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
            throw new h.e();
        }
        int iIntValue = numM7867toAndroidFocusDirection3ESFkO8.intValue();
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = androidRect == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, androidRect, iIntValue);
        if (viewFindNextFocus != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
        }
        return false;
    }

    /* renamed from: moveFocusInChildrenViewFocusFix-3ESFkO8, reason: not valid java name */
    private final boolean m10184moveFocusInChildrenViewFocusFix3ESFkO8(int i2) {
        AndroidViewsHandler androidViewsHandler;
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7861getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(i2);
        if (numM7867toAndroidFocusDirection3ESFkO8 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid focus direction");
            throw new h.e();
        }
        int iIntValue = numM7867toAndroidFocusDirection3ESFkO8.intValue();
        View rootView = getRootView();
        x.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewFindFocus, iIntValue);
        if (!FocusOwnerImplKt.m7882is1dFocusSearch3ESFkO8(i2) || !androidViewsHandler.hasFocus()) {
            Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
            androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
            if (viewFindNextFocus != null && androidRect != null) {
                viewGroup.offsetDescendantRectToMyCoords(this, androidRect);
                viewGroup.offsetRectIntoDescendantCoords(viewFindNextFocus, androidRect);
            }
        }
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = viewFindNextFocus.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent != null) {
            return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
        }
        return false;
    }

    static final void outOfFrameRunnable$lambda$0(AndroidComposeView androidComposeView) {
        Trace.beginSection("AndroidOwner:outOfFrameExecutor");
        while (!androidComposeView.outOfFrameQueue.isEmpty()) {
            try {
                androidComposeView.outOfFrameQueue.removeLast().invoke();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m10185packZIaKswc(int i2, int i3) {
        return (i2 << 32) | i3;
    }

    private final void populateAutofillVirtualStructure(ViewStructure viewStructure) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.populateViewStructure(viewStructure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            AndroidComposeView androidComposeView = this;
            while (parent instanceof ViewGroup) {
                androidComposeView = (View) parent;
                parent = ((ViewGroup) androidComposeView).getParent();
            }
            androidComposeView.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f2 = iArr[0];
            float f3 = iArr[1];
            androidComposeView.getLocationInWindow(iArr);
            int[] iArr2 = this.tmpPositionArray;
            float f4 = iArr2[0];
            float f5 = iArr2[1];
            this.windowPosition = (Float.floatToRawIntBits(f2 - f4) << 32) | (Float.floatToRawIntBits(f3 - f5) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo10213calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m10252invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    static final void sendHoverExitEvent$lambda$0(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        if (motionEvent == null) {
            x.g();
        }
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m10186sendMotionEvent8iAsVTc(motionEvent);
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m10186sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            getComposeViewContext().getWindowInfo$ui().m10261setKeyboardModifiers5xRPYO0(motionEvent.getMetaState());
        }
        AndroidComposeView androidComposeView = this;
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEvent, androidComposeView);
        int actionMasked = motionEvent.getActionMasked();
        if (pointerInputEventConvertToPointerInputEvent$ui == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown()) {
                    if (actionMasked != 0) {
                        if (actionMasked == 5) {
                            actionMasked = 5;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                size = i2;
            }
            pointerInputEventData = null;
        } else {
            pointerInputEventData = null;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m9626getPositionF1C5BW0();
        }
        int iM9631processBIzXfog = this.pointerInputEventProcessor.m9631processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, androidComposeView, isInBounds(motionEvent));
        pointerInputEventConvertToPointerInputEvent$ui.setMotionEvent(null);
        if ((actionMasked != 0 && actionMasked != 5) || (iM9631processBIzXfog & 1) != 0) {
            return iM9631processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM9631processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i2, long j2, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f2 = pointerCoords.x;
            long jMo9691localToScreenMKHz9U = mo9691localToScreenMKHz9U((Float.floatToRawIntBits(pointerCoords.y) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(f2) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo9691localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo9691localToScreenMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            i5++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        AndroidComposeView androidComposeView = this;
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui = this.motionEventAdapter.convertToPointerInputEvent$ui(motionEventObtain, androidComposeView);
        if (pointerInputEventConvertToPointerInputEvent$ui == null) {
            x.g();
        }
        this.pointerInputEventProcessor.m9631processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui, androidComposeView, true);
        motionEventObtain.recycle();
    }

    static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i2, long j2, boolean z, int i3, Object obj) {
        androidComposeView.sendSimulatedEvent(motionEvent, i2, j2, z | (!((i3 & 8) == 0)));
    }

    private final void setAttached(boolean z) {
        this.isAttached$delegate.setValue(Boolean.valueOf(z));
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_composeViewContext(ComposeViewContext composeViewContext) {
        this._composeViewContext$delegate.setValue(composeViewContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m10187startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, l<? super DrawScope, ab> lVar) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j2, lVar, null));
    }

    private final void updateConfiguration(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (x.n(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(AndroidDensity_androidKt.Density(getContext()));
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j2 = this.globalPosition;
        int iM11296getXimpl = IntOffset.m11296getXimpl(j2);
        int iM11297getYimpl = IntOffset.m11297getYimpl(j2);
        int[] iArr = this.tmpPositionArray;
        boolean z = false;
        z = false;
        z = false;
        int i2 = iArr[0];
        if (iM11296getXimpl != i2 || iM11297getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = (i2 << 32) | (iArr[1] & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            if (iM11296getXimpl != Integer.MAX_VALUE && iM11297getYimpl != Integer.MAX_VALUE) {
                MutableVector<LayoutNode> mutableVector = getRoot().get_children$ui();
                LayoutNode[] layoutNodeArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i3 = 0; i3 < size; i3++) {
                    layoutNodeArr[i3].getMeasurePassDelegate$ui().requestLayoutIfCoordinatesAreUsedAndNotifyChildren();
                }
                z = true;
            }
        }
        recalculateWindowPosition();
        View rootView = this._rootView;
        if (rootView == null) {
            rootView = getRootView();
            this._rootView = rootView;
        }
        getRectManager().m10340updateOffsetsgTq6Wqs(this.globalPosition, IntOffsetKt.m11313roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix, rootView.getWidth(), rootView.getHeight());
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z);
        getRectManager().dispatchCallbacks();
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        AndroidViewHolder androidViewHolder2 = androidViewHolder;
        getAndroidViewsHandler$ui().addView(androidViewHolder2);
        getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder2, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r5, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                /*
                    r4 = this;
                    super.onInitializeAccessibilityNodeInfo(r5, r6)
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r5)
                    boolean r5 = r5.isEnabled$ui()
                    if (r5 == 0) goto L13
                    r5 = 0
                    r6.setVisibleToUser(r5)
                L13:
                    androidx.compose.ui.node.LayoutNode r5 = r2
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui()
                L19:
                    r0 = 0
                    if (r5 == 0) goto L2d
                    androidx.compose.ui.node.NodeChain r1 = r5.getNodes$ui()
                    r2 = 8
                    boolean r1 = r1.m10027hasH91voCI$ui(r2)
                    if (r1 != 0) goto L2e
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui()
                    goto L19
                L2d:
                    r5 = r0
                L2e:
                    if (r5 == 0) goto L38
                    int r5 = r5.getSemanticsId()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L38:
                    r5 = -1
                    if (r0 == 0) goto L4f
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
                    int r1 = r1.getId()
                    int r2 = r0.intValue()
                    if (r2 != r1) goto L53
                L4f:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L53:
                    androidx.compose.ui.platform.AndroidComposeView r1 = r3
                    android.view.View r1 = (android.view.View) r1
                    int r0 = r0.intValue()
                    r6.setParent(r1, r0)
                    androidx.compose.ui.node.LayoutNode r0 = r2
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    int r0 = r0.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToBeforeMap$ui()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto L9e
                    androidx.compose.ui.platform.AndroidComposeView r2 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui()
                    android.view.View r2 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r2, r1)
                    if (r2 == 0) goto L84
                    r6.setTraversalBefore(r2)
                    goto L8b
                L84:
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    android.view.View r2 = (android.view.View) r2
                    r6.setTraversalBefore(r2, r1)
                L8b:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r2 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r3 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r3)
                    java.lang.String r3 = r3.getExtraDataTestTraversalBeforeVal$ui()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r0, r2, r3)
                L9e:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToAfterMap$ui()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto Ld8
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r5.getAndroidViewsHandler$ui()
                    android.view.View r5 = androidx.compose.ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r5, r1)
                    if (r5 == 0) goto Lbe
                    r6.setTraversalAfter(r5)
                    goto Lc5
                Lbe:
                    androidx.compose.ui.platform.AndroidComposeView r5 = r3
                    android.view.View r5 = (android.view.View) r5
                    r6.setTraversalAfter(r5, r1)
                Lc5:
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r6 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r4 = androidx.compose.ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = androidx.compose.ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r4)
                    java.lang.String r4 = r4.getExtraDataTestTraversalAfterVal$ui()
                    androidx.compose.ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r5, r0, r6, r4)
                Ld8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.AnonymousClass1.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        if (!ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            super.addFocusables(arrayList, i2, i3);
            return;
        }
        if (getFocusOwner().hasFocusableContent()) {
            super.addFocusables(arrayList, i2, i3);
            if (getFocusOwner().hasNonInteropFocusableContent() || arrayList == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (view == null) {
            x.g();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i2, layoutParams);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.performAutofill(sparseArray);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(e<? super ab> eVar) {
        Object objBoundsUpdatesEventLoop$ui = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui(eVar);
        return objBoundsUpdatesEventLoop$ui == h.c.a.a.f48038a ? objBoundsUpdatesEventLoop$ui : ab.f48028a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(e<? super ab> eVar) {
        Object objBoundsUpdatesEventLoop$ui = this.contentCaptureManager.boundsUpdatesEventLoop$ui(eVar);
        return objBoundsUpdatesEventLoop$ui == h.c.a.a.f48038a ? objBoundsUpdatesEventLoop$ui : ab.f48028a;
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo10131calculateLocalPositionMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m8498mapMKHz9U(this.windowToViewMatrix, j2);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo10132calculatePositionInWindowMKHz9U(long j2) {
        recalculateWindowPosition();
        return Matrix.m8498mapMKHz9U(this.viewToWindowMatrix, j2);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        return this.composeAccessibilityDelegate.m10197canScroll0AR0LA0$ui(false, i2, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i2) {
        return this.composeAccessibilityDelegate.m10197canScroll0AR0LA0$ui(true, i2, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void clearOwnerFocus() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnedLayer createLayer(p<? super Canvas, ? super GraphicsLayer, ab> pVar, a<ab> aVar, GraphicsLayer graphicsLayer) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, pVar, aVar);
        }
        OwnedLayer ownedLayerPop = this.layerCache.pop();
        if (ownedLayerPop == null) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, pVar, aVar);
        }
        ownedLayerPop.reuseLayer(pVar, aVar);
        return ownedLayerPop;
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementKeepScreenOnCount() {
        this.keepScreenOnCount--;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.CC.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.notifyObjectsInitialized();
        this.isDrawingContent = true;
        try {
            Trace.beginSection("AndroidOwner:draw");
            try {
                CanvasHolder canvasHolder = getCanvasHolder();
                android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
                canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
                getRoot().draw$ui(canvasHolder.getAndroidCanvas(), null);
                canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
                if (this.dirtyLayers.isNotEmpty()) {
                    int size = this.dirtyLayers.getSize();
                    for (int i2 = 0; i2 < size; i2++) {
                        this.dirtyLayers.get(i2).updateDisplayList();
                    }
                }
                if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
                    int iSave = canvas.save();
                    canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                    super.dispatchDraw(canvas);
                    canvas.restoreToCount(iSave);
                }
                this.dirtyLayers.clear();
                this.isDrawingContent = false;
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler = this.uncaughtExceptionHandler;
            if (uncaughtExceptionHandler == null) {
                throw th2;
            }
            uncaughtExceptionHandler.onUncaughtException(th2);
        }
        MutableObjectList<OwnedLayer> mutableObjectList = this.postponedDirtyLayers;
        if (mutableObjectList != null) {
            this.dirtyLayers.addAll(mutableObjectList);
            mutableObjectList.clear();
        }
        if (isArrEnabled$ui()) {
            if (Float.compare(this.currentFrameRate, this.lastSetFrameRate) != 0) {
                float f2 = this.currentFrameRate;
                this.lastSetFrameRate = f2;
                Api35Impl.setRequestedFrameRate(this, f2);
            }
            View view = this.frameRateCategoryView;
            if (view != null) {
                if (Float.compare(this.currentFrameRateCategory, this.lastSetFrameRateCategory) != 0) {
                    float f3 = this.currentFrameRateCategory;
                    this.lastSetFrameRateCategory = f3;
                    Api35Impl.setRequestedFrameRate(view, f3);
                }
                if (!Float.isNaN(this.currentFrameRateCategory)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
            }
            this.currentFrameRate = Float.NaN;
            this.currentFrameRateCategory = Float.NaN;
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 8) {
            return motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m10181handleMotionEvent8iAsVTc(motionEvent) & 4) != 0;
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        AndroidIndirectPointerEvent androidIndirectPointerEventM9518convertToIndirectPointerEventk92h6UU$ui = this.motionEventAdapter.m9518convertToIndirectPointerEventk92h6UU$ui(motionEvent, this.primaryDirectionalMotionAxisOverride);
        if (androidIndirectPointerEventM9518convertToIndirectPointerEventk92h6UU$ui != null) {
            handleIndirectPointerEvent(androidIndirectPointerEventM9518convertToIndirectPointerEventk92h6UU$ui);
            return true;
        }
        getFocusOwner().dispatchIndirectPointerCancel();
        this.indirectPointerNavigationGestureDetector.cancelCurrentEventStream();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        if (isPositionChanged(r6) == false) goto L35;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.hoverExitReceived
            if (r0 == 0) goto Le
            java.lang.Runnable r0 = r5.sendHoverExitEvent
            r5.removeCallbacks(r0)
            java.lang.Runnable r0 = r5.sendHoverExitEvent
            r0.run()
        Le:
            boolean r0 = r5.isBadMotionEvent(r6)
            r1 = 0
            if (r0 != 0) goto L76
            boolean r0 = r5.isAttachedToWindow()
            if (r0 != 0) goto L1c
            goto L76
        L1c:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r5.composeAccessibilityDelegate
            boolean r0 = r0.dispatchHoverEvent$ui(r6)
            r2 = 1
            if (r0 == 0) goto L2b
            boolean r0 = androidx.compose.ui.ComposeUiFlags.isExploreByTouchHoverHandled
            if (r0 == 0) goto L2b
            r0 = r2
            goto L2c
        L2b:
            r0 = r1
        L2c:
            int r3 = r6.getActionMasked()
            r4 = 7
            if (r3 == r4) goto L63
            r4 = 10
            if (r3 == r4) goto L38
            goto L6a
        L38:
            boolean r3 = r5.isInBounds(r6)
            if (r3 == 0) goto L6a
            int r1 = r6.getToolType(r1)
            r3 = 3
            if (r1 != r3) goto L4c
            int r1 = r6.getButtonState()
            if (r1 == 0) goto L4c
            goto L69
        L4c:
            android.view.MotionEvent r1 = r5.previousMotionEvent
            if (r1 == 0) goto L53
            r1.recycle()
        L53:
            android.view.MotionEvent r6 = android.view.MotionEvent.obtainNoHistory(r6)
            r5.previousMotionEvent = r6
            r5.hoverExitReceived = r2
            java.lang.Runnable r6 = r5.sendHoverExitEvent
            r1 = 8
            r5.postDelayed(r6, r1)
            return r0
        L63:
            boolean r3 = r5.isPositionChanged(r6)
            if (r3 != 0) goto L6a
        L69:
            return r0
        L6a:
            int r5 = r5.m10181handleMotionEvent8iAsVTc(r6)
            r5 = r5 & r2
            if (r5 == 0) goto L72
            goto L75
        L72:
            if (r0 != 0) goto L75
            return r1
        L75:
            return r2
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().mo7872dispatchKeyEventYhN2O0w(keyEvent, new C03861(keyEvent));
        }
        getComposeViewContext().getWindowInfo$ui().m10261setKeyboardModifiers5xRPYO0(keyEvent.getMetaState());
        return FocusOwner.CC.m7878dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo7871dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: dispatchOnScrollChanged-k-4lQ0M */
    public void mo10133dispatchOnScrollChangedk4lQ0M(long j2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Companion.dispatchOnScrollChanged(getViewTreeObserver());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        this.isDispatchingAutofillStructure = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            this.isDispatchingAutofillStructure = false;
            populateAutofillVirtualStructure(viewStructure);
        } catch (Throwable th) {
            this.isDispatchingAutofillStructure = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        super.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object objM10203boximpl;
        FocusTargetNode activeFocusTargetNode;
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            if (motionEvent2 == null) {
                x.g();
            }
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM10181handleMotionEvent8iAsVTc = m10181handleMotionEvent8iAsVTc(motionEvent);
        if ((iM10181handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
        boolean z2 = motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || motionEvent.isFromSource(InputDeviceCompat.SOURCE_TOUCHPAD);
        if (z && z2) {
            Object parent = getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view == null || (objM10203boximpl = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                objM10203boximpl = AutoClearFocusBehavior.m10203boximpl(AutoClearFocusBehavior.Companion.m10211getDefault4UtRPd4());
            }
            if (x.n(objM10203boximpl, AutoClearFocusBehavior.m10203boximpl(AutoClearFocusBehavior.Companion.m10210getCursorBased4UtRPd4())) && (activeFocusTargetNode = getFocusOwner().getActiveFocusTargetNode()) != null) {
                if (!LayoutCoordinatesKt.boundsInRoot(DelegatableNodeKt.requireLayoutCoordinates(activeFocusTargetNode)).m8006containsk4lQ0M((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & MuxerUtil.UNSIGNED_INT_MAX_VALUE))) {
                    FocusManager.CC.clearFocus$default(getFocusOwner(), false, 1, null);
                }
            }
        }
        return (iM10181handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, android.graphics.Canvas canvas) {
        getAndroidViewsHandler$ui().drawView(androidViewHolder, canvas);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j2, final a<ab> aVar) {
        Runnable runnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                aVar.invoke();
            }
        };
        postDelayed(runnable, j2);
        return runnable;
    }

    public final View findViewByAccessibilityIdTraversal(int i2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i2));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        Rect rectCalculateFocusRectRelativeTo;
        if (view == null || this.measureAndLayoutDelegate.getDuringMeasureLayout$ui()) {
            return super.focusSearch(view, i2);
        }
        View rootView = getRootView();
        x.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i2);
        if (viewFindNextFocus == null || !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (rectCalculateFocusRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            rectCalculateFocusRectRelativeTo = FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
        int iM7858unboximpl = focusDirection != null ? focusDirection.m7858unboximpl() : FocusDirection.Companion.m7859getDowndhqQ8s();
        aq aqVar = new aq();
        if (getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, rectCalculateFocusRectRelativeTo, new AndroidComposeView$focusSearch$searchResult$1(aqVar)) == null) {
            return view;
        }
        if (aqVar.f48105a == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i2);
            }
        } else {
            if (viewFindNextFocus == null) {
                return this;
            }
            if (FocusOwnerImplKt.m7882is1dFocusSearch3ESFkO8(iM7858unboximpl)) {
                return ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? this : super.focusSearch(view, i2);
            }
            AndroidComposeView androidComposeView = this;
            if (TwoDimensionalFocusSearchKt.m7928isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) aqVar.f48105a), FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindNextFocus, androidComposeView), rectCalculateFocusRectRelativeTo, iM7858unboximpl)) {
                return androidComposeView;
            }
        }
        return viewFindNextFocus;
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public void focusTargetAvailable() {
        if (getFocusOwner().getRootState().getHasFocus()) {
            return;
        }
        focusableViewAvailable(this);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui(z);
    }

    @Override // androidx.compose.ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z);
    }

    @Override // androidx.compose.ui.node.Owner
    public AccessibilityManager getAccessibilityManager() {
        return getComposeViewContext().getAccessibilityManager$ui();
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        if (androidViewsHandler2 == null) {
            x.g();
        }
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    @Override // androidx.compose.ui.node.Owner
    public Clipboard getClipboard() {
        return getComposeViewContext().getClipboard$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public ClipboardManager getClipboardManager() {
        return getComposeViewContext().getClipboardManager$ui();
    }

    public final ComposeViewContext getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.composeViewContextIncrementedDuringInit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Configuration getConfiguration() {
        return (Configuration) this.configuration$delegate.getValue();
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public j getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    public Rect getEmbeddedViewFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(viewFindFocus, this);
    }

    @Override // androidx.compose.ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.getLeft());
            rect.top = Math.round(embeddedViewFocusRect.getTop());
            rect.right = Math.round(embeddedViewFocusRect.getRight());
            rect.bottom = Math.round(embeddedViewFocusRect.getBottom());
            return;
        }
        if (x.n(getFocusOwner().mo7873focusSearchULY8qGw(FocusDirection.Companion.m7859getDowndhqQ8s(), null, C03871.INSTANCE), true)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return getComposeViewContext().getFontLoader$ui();
    }

    public final LifecycleRetainedValuesStoreOwner.FrameEndScheduler getFrameEndScheduler$ui() {
        return this.frameEndScheduler;
    }

    @Override // androidx.compose.ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return getComposeViewContext().getHapticFeedback$ui();
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || !this.outOfFrameQueue.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.ui.node.Owner
    public InputModeManagerImpl getInputModeManager() {
        InputModeManagerImpl inputModeManagerImpl = this._inputModeManager;
        if (inputModeManagerImpl == null) {
            inputModeManagerImpl = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m9076getTouchaOaMEAU() : InputMode.Companion.m9075getKeyboardaOaMEAU(), new InputModeChangeRequester() { // from class: androidx.compose.ui.platform.AndroidComposeView$inputModeManager$1
                @Override // androidx.compose.ui.input.InputModeChangeRequester
                /* renamed from: request-iuPiT84 */
                public final boolean mo9077requestiuPiT84(int i2) {
                    if (InputMode.m9071equalsimpl0(i2, InputMode.Companion.m9076getTouchaOaMEAU())) {
                        return this.this$0.isInTouchMode();
                    }
                    if (!InputMode.m9071equalsimpl0(i2, InputMode.Companion.m9075getKeyboardaOaMEAU())) {
                        return false;
                    }
                    if (this.this$0.isInTouchMode()) {
                        return this.this$0.requestFocusFromTouch();
                    }
                    return true;
                }
            }, null);
            this._inputModeManager = inputModeManagerImpl;
        }
        return inputModeManagerImpl;
    }

    public final InsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public LocaleList getLocaleList() {
        return (LocaleList) this.localeList$delegate.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidComposeView getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // androidx.compose.ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final IndirectPointerEventPrimaryDirectionalMotionAxis m10188getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.primaryDirectionalMotionAxisOverride;
    }

    @Override // androidx.compose.ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public RetainedValuesStore getRetainedValuesStore() {
        return this.retainedValuesStore;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.ui.node.Owner
    public RootForTest getRootForTest() {
        return this;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return getComposeViewContext().getSharedDrawScope$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.INSTANCE.isShowingLayoutBounds(this) : this.showLayoutBounds;
    }

    @Override // androidx.compose.ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = this._softwareKeyboardController;
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        this._softwareKeyboardController = delegatingSoftwareKeyboardController;
        return delegatingSoftwareKeyboardController;
    }

    @Override // androidx.compose.ui.node.Owner, androidx.compose.ui.node.RootForTest
    public TextInputService getTextInputService() {
        TextInputService textInputService = this._textInputService;
        if (textInputService != null) {
            return textInputService;
        }
        TextInputService textInputService2 = new TextInputService(AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(getLegacyTextInputServiceAndroid()));
        this._textInputService = textInputService2;
        return textInputService2;
    }

    @Override // androidx.compose.ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final RootForTest.UncaughtExceptionHandler getUncaughtExceptionHandler$ui() {
        return this.uncaughtExceptionHandler;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return getComposeViewContext().getViewConfiguration$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public WindowInfo getWindowInfo() {
        return getComposeViewContext().getWindowInfo$ui();
    }

    public final AndroidAutofillManager get_autofillManager$ui() {
        return this._autofillManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementKeepScreenOnCount() {
        this.keepScreenOnCount++;
        getView().setKeepScreenOn(this.keepScreenOnCount > 0);
    }

    @Override // androidx.compose.ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.ui.node.Owner
    public void invalidateRootLayer() {
        invalidate();
    }

    public final boolean isArrEnabled$ui() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // androidx.compose.ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        return getComposeViewContext().getLifecycleOwner$ui().getLifecycle().getCurrentState() == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo9514localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m8511timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m10202preTranslatecG2Xzmc(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), this.tmpMatrix);
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo9691localToScreenMKHz9U(long j2) {
        recalculateWindowPosition();
        long jM8498mapMKHz9U = Matrix.m8498mapMKHz9U(this.viewToWindowMatrix, j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM8498mapMKHz9U >> 32)) + Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM8498mapMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + Float.intBitsToFloat((int) (this.windowPosition & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // androidx.compose.ui.node.Owner
    public void measureAndLayout(boolean z) {
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (this.measureAndLayoutDelegate.measureAndLayout(z ? this.resendMotionEventOnLayout : this.layoutChildViewsIfNeeded)) {
                    requestLayout();
                }
                this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
                getRectManager().dispatchCallbacks();
                dispatchPendingInteropLayoutCallbacks();
            } finally {
                Trace.endSection();
            }
        }
    }

    @Override // androidx.compose.ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo10134measureAndLayout0kLqBqw(LayoutNode layoutNode, long j2) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m10014measureAndLayout0kLqBqw(layoutNode, j2);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
                getRectManager().dispatchCallbacks();
                this.layoutChildViewsIfNeeded.invoke();
                dispatchPendingInteropLayoutCallbacks();
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.CC.measureAndLayout$default(this, false, 1, null);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.outOfFrameRunnable);
        }
        this.outOfFrameRunnable.run();
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: moveFocusInChildren-3ESFkO8 */
    public boolean mo7921moveFocusInChildren3ESFkO8(int i2) {
        return ComposeUiFlags.isViewFocusFixEnabled ? m10184moveFocusInChildrenViewFocusFix3ESFkO8(i2) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? m10182moveFocusInChildrenBypassUnfocusableComposeView3ESFkO8(i2) : m10183moveFocusInChildrenCurrent3ESFkO8(i2);
    }

    public final void notifyLayerIsDirty$ui(OwnedLayer ownedLayer, boolean z) {
        boolean z2 = this.isDrawingContent;
        if (!z) {
            if (z2) {
                return;
            }
            this.dirtyLayers.remove(ownedLayer);
            MutableObjectList<OwnedLayer> mutableObjectList = this.postponedDirtyLayers;
            if (mutableObjectList != null) {
                mutableObjectList.remove(ownedLayer);
                return;
            }
            return;
        }
        if (!z2) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        MutableObjectList<OwnedLayer> mutableObjectList2 = this.postponedDirtyLayers;
        if (mutableObjectList2 == null) {
            mutableObjectList2 = new MutableObjectList<>(0, 1, null);
            this.postponedDirtyLayers = mutableObjectList2;
        }
        mutableObjectList2.add(ownedLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!getRoot().isAttached()) {
            getRoot().attach$ui(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewAttachedToWindow(this);
        }
        if (!this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().incrementViewCount$ui();
        }
        this.composeViewContextIncrementedDuringInit = false;
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui();
        AndroidComposeView outOfFrameExecutor = getOutOfFrameExecutor();
        if (outOfFrameExecutor == null) {
            throw new IllegalStateException("Expected the view to be attached to window.");
        }
        outOfFrameExecutor.schedule(new C03891());
        ForgetfulRetainedValuesStore forgetfulRetainedValuesStoreInstallLocalRetainedValuesStore = installLocalRetainedValuesStore(getComposeViewContext().getLifecycleOwner$ui(), getComposeViewContext().getViewModelStoreOwner$ui());
        if (forgetfulRetainedValuesStoreInstallLocalRetainedValuesStore == null) {
            forgetfulRetainedValuesStoreInstallLocalRetainedValuesStore = ForgetfulRetainedValuesStore.INSTANCE;
        }
        this.retainedValuesStore = forgetfulRetainedValuesStoreInstallLocalRetainedValuesStore;
        l<? super ComposeViewContext, ab> lVar = this.onReadyForComposition;
        if (lVar != null) {
            lVar.invoke(getComposeViewContext());
            this.onReadyForComposition = null;
        }
        Lifecycle lifecycle = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        lifecycle.addObserver(this);
        lifecycle.addObserver(this.contentCaptureManager);
        getInputModeManager().m9080setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m9076getTouchaOaMEAU() : InputMode.Companion.m9075getKeyboardaOaMEAU());
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().add(androidAutofillManager);
            getSemanticsOwner().getListeners$ui().add(androidAutofillManager);
        }
        getFocusOwner().getListeners().add(this);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m7666getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().isEditorFocused() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        updateConfiguration(configuration);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m7666getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? getLegacyTextInputServiceAndroid().createInputConnection(editorInfo) : androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui(jArr, iArr, consumer);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.compose.ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        getLayoutNodes().remove(layoutNode.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.onDetach$ui(layoutNode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        if (ComposeView_androidKt.getAreWindowInsetsRulersEnabled()) {
            this.insetsListener.onViewDetachedFromWindow(this);
        }
        View view = this.frameRateCategoryView;
        if (isArrEnabled$ui() && view != null) {
            removeView(view);
        }
        Companion.removeNotificationForSysPropsChange(this);
        getComposeViewContext().decrementViewCount$ui();
        getSnapshotObserver().stopObserving$ui();
        Lifecycle lifecycle = getComposeViewContext().getLifecycleOwner$ui().getLifecycle();
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.release();
        }
        this.lifecycleRetainedValuesStoreOwnerEntry = null;
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui().remove(androidAutofillManager);
            getFocusOwner().getListeners().remove(androidAutofillManager);
        }
        getRectManager().resetOffsets();
        getRectManager().dispatchCallbacks();
        getRectManager().removeScheduledCallback();
        getFocusOwner().getListeners().remove(this);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onEndApplyChanges() {
        MutableObjectList<a<ab>> mutableObjectList;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.onEndApplyChanges$ui();
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int size = this.endApplyChangesListeners.getSize();
            int i2 = 0;
            while (true) {
                mutableObjectList = this.endApplyChangesListeners;
                if (i2 < size) {
                    a<ab> aVar = mutableObjectList.get(i2);
                    this.endApplyChangesListeners.set(i2, null);
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    i2++;
                }
            }
            mutableObjectList.removeRange(0, size);
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        int i2;
        NodeChain nodes$ui;
        boolean z;
        NodeChain nodes$ui2;
        boolean z2;
        if (focusTargetModifierNode != null) {
            FocusTargetModifierNode focusTargetModifierNode3 = focusTargetModifierNode;
            if (!focusTargetModifierNode3.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = focusTargetModifierNode3.getNode();
            LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode3);
            MutableScatterSet mutableScatterSet = null;
            ArrayList arrayList = null;
            while (true) {
                if (layoutNodeRequireLayoutNode == null) {
                    break;
                }
                if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 2097152) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui() & 2097152) != 0) {
                            Modifier.Node nodePop = node;
                            MutableVector mutableVector = null;
                            while (nodePop != null) {
                                if (nodePop instanceof IndirectPointerInputModifierNode) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(nodePop);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (nodePop.getKindSet$ui() & 2097152) != 0 && (nodePop instanceof DelegatingNode)) {
                                    int i3 = 0;
                                    for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                        if ((delegate$ui.getKindSet$ui() & 2097152) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                nodePop = delegate$ui;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (nodePop != null) {
                                                    mutableVector.add(nodePop);
                                                }
                                                mutableVector.add(delegate$ui);
                                                nodePop = null;
                                            }
                                        }
                                    }
                                    if (i3 != 1) {
                                    }
                                }
                                nodePop = DelegatableNodeKt.pop(mutableVector);
                            }
                        }
                        node = node.getParent$ui();
                    }
                }
                layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
                node = (layoutNodeRequireLayoutNode == null || (nodes$ui2 = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui2.getTail$ui();
            }
            if (arrayList == null) {
                return;
            }
            if (focusTargetModifierNode2 != null) {
                FocusTargetModifierNode focusTargetModifierNode4 = focusTargetModifierNode2;
                if (!focusTargetModifierNode4.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
                }
                Modifier.Node node2 = focusTargetModifierNode4.getNode();
                LayoutNode layoutNodeRequireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetModifierNode4);
                MutableScatterSet mutableScatterSetMutableScatterSetOf = null;
                while (layoutNodeRequireLayoutNode2 != null) {
                    if ((layoutNodeRequireLayoutNode2.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 2097152) != 0) {
                        while (node2 != null) {
                            if ((node2.getKindSet$ui() & 2097152) != 0) {
                                Modifier.Node nodePop2 = node2;
                                MutableVector mutableVector2 = null;
                                while (nodePop2 != null) {
                                    if (nodePop2 instanceof IndirectPointerInputModifierNode) {
                                        if (mutableScatterSetMutableScatterSetOf == null) {
                                            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                                        }
                                        mutableScatterSetMutableScatterSetOf.add(nodePop2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (nodePop2.getKindSet$ui() & 2097152) != 0 && (nodePop2 instanceof DelegatingNode)) {
                                        int i4 = 0;
                                        for (Modifier.Node delegate$ui2 = ((DelegatingNode) nodePop2).getDelegate$ui(); delegate$ui2 != null; delegate$ui2 = delegate$ui2.getChild$ui()) {
                                            if ((delegate$ui2.getKindSet$ui() & 2097152) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nodePop2 = delegate$ui2;
                                                } else {
                                                    if (mutableVector2 == null) {
                                                        mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (nodePop2 != null) {
                                                        mutableVector2.add(nodePop2);
                                                    }
                                                    mutableVector2.add(delegate$ui2);
                                                    nodePop2 = null;
                                                }
                                            }
                                        }
                                        if (i4 != 1) {
                                        }
                                    }
                                    nodePop2 = DelegatableNodeKt.pop(mutableVector2);
                                }
                            }
                            node2 = node2.getParent$ui();
                        }
                    }
                    layoutNodeRequireLayoutNode2 = layoutNodeRequireLayoutNode2.getParent$ui();
                    node2 = (layoutNodeRequireLayoutNode2 == null || (nodes$ui = layoutNodeRequireLayoutNode2.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
                }
                mutableScatterSet = mutableScatterSetMutableScatterSetOf;
            }
            int size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                IndirectPointerInputModifierNode indirectPointerInputModifierNode = (IndirectPointerInputModifierNode) arrayList.get(i2);
                if (mutableScatterSet == null || !mutableScatterSet.contains(indirectPointerInputModifierNode)) {
                    indirectPointerInputModifierNode.onCancelIndirectPointerInput();
                }
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.lastMatrixRecalculationAnimationTime = 0L;
        updatePositionCacheAndDispatch();
        dispatchConfigurationChangeIfNeeded();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.lastMatrixRecalculationAnimationTime = 0L;
            this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
            this.onMeasureConstraints = null;
            updatePositionCacheAndDispatch();
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i4 - i2, i5 - i3);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.onLayoutNodeDeactivated$ui(layoutNode);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM10178convertMeasureSpecI7RO_PI = m10178convertMeasureSpecI7RO_PI(i2);
            long j2 = jM10178convertMeasureSpecI7RO_PI >>> 32;
            int i4 = (int) (jM10178convertMeasureSpecI7RO_PI & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            long jM10178convertMeasureSpecI7RO_PI2 = m10178convertMeasureSpecI7RO_PI(i3);
            int i5 = (int) (jM10178convertMeasureSpecI7RO_PI2 >>> 32);
            int i6 = (int) j2;
            long jM11115fitPrioritizingHeightZbe2FdA = Constraints.Companion.m11115fitPrioritizingHeightZbe2FdA(i6, i4, i5, (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & jM10178convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m11094boximpl(jM11115fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (!Constraints.m11100equalsimpl0(constraints.m11113unboximpl(), jM11115fitPrioritizingHeightZbe2FdA)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.measureAndLayoutDelegate.m10015updateRootConstraintsBRTryo0(jM11115fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostAttach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.onPostAttach$ui(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int i2) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.onPostLayoutNodeReused$ui(layoutNode, i2);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreAttach(LayoutNode layoutNode) {
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int i2) {
        getLayoutNodes().remove(i2);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        if (viewStructure == null || this.isDispatchingAutofillStructure) {
            return;
        }
        populateAutofillVirtualStructure(viewStructure);
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z, boolean z2, boolean z3) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z2) && z3) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (measureAndLayoutDelegate.requestRemeasure(layoutNode, z2) && z3) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z, boolean z2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.measureAndLayoutDelegate;
        if (z) {
            if (measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z2)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (measureAndLayoutDelegate.requestRelayout(layoutNode, z2)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        PointerIcon stylusHoverIcon;
        int toolType = motionEvent.getToolType(i2);
        return (motionEvent.isFromSource(InputDeviceCompat.SOURCE_MOUSE) || !motionEvent.isFromSource(InputDeviceCompat.SOURCE_STYLUS) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i2) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
        }
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler = this.frameEndScheduler;
            if (frameEndScheduler == null) {
                x.g();
            }
            retainedValuesStoreEntry.stopRetainingExitedValues(frameEndScheduler);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i2);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        updatePositionCacheAndDispatch();
    }

    @Override // androidx.compose.ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui();
        this.contentCaptureManager.onSemanticsChange$ui();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner lifecycleOwner) {
        LifecycleRetainedValuesStoreOwner.RetainedValuesStoreEntry retainedValuesStoreEntry = this.lifecycleRetainedValuesStoreOwnerEntry;
        if (retainedValuesStoreEntry != null) {
            retainedValuesStoreEntry.startRetainingExitedValues();
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z) {
        getInputModeManager().m9080setInputModeiuPiT84(z ? InputMode.Companion.m9076getTouchaOaMEAU() : InputMode.Companion.m9075getKeyboardaOaMEAU());
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        boolean isShowingLayoutBounds;
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        this.dirtyLayers.remove(ownedLayer);
        return true;
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnEndApplyChangesListener(a<ab> aVar) {
        if (this.endApplyChangesListeners.contains(aVar)) {
            return;
        }
        this.endApplyChangesListeners.add(aVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        getAndroidViewsHandler$ui().removeViewInLayout(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui().getLayoutNodeToHolder();
        au.c(layoutNodeToHolder).remove(getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(androidViewHolder));
        androidViewHolder.setImportantForAccessibility(0);
    }

    public final void removeConnectionToComposeViewContext() {
        if (this.composeViewContextIncrementedDuringInit) {
            getComposeViewContext().decrementViewCount$ui();
            this.composeViewContextIncrementedDuringInit = false;
        }
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Runnable runnable = obj instanceof Runnable ? (Runnable) obj : null;
        if (runnable == null) {
            return;
        }
        removeCallbacks(runnable);
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestAutofill(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            androidAutofillManager.requestAutofill$ui(layoutNode);
        }
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i2, android.graphics.Rect rect) {
        return ComposeUiFlags.isViewFocusFixEnabled ? requestFocusViewFocusFix(i2, rect) : ComposeUiFlags.isBypassUnfocusableComposeViewEnabled ? requestFocusBypassUnfocusableComposeView(i2, rect) : requestFocusCurrent(i2, rect);
    }

    public final boolean requestFocusBypassUnfocusableComposeView(int i2, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
        int iM7858unboximpl = focusDirection != null ? focusDirection.m7858unboximpl() : FocusDirection.Companion.m7860getEnterdhqQ8s();
        if (x.n(getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1(iM7858unboximpl)), true) || x.n(getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, null, new AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1(iM7858unboximpl)), true)) {
            return true;
        }
        if (hasFocus() && FocusOwnerImplKt.m7882is1dFocusSearch3ESFkO8(iM7858unboximpl)) {
            return getFocusOwner().mo7876resetFocus3ESFkO8(iM7858unboximpl);
        }
        return false;
    }

    public final boolean requestFocusCurrent(int i2, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().getRootState().getHasFocus()) {
            return super.requestFocus(i2, rect);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
        int iM7858unboximpl = focusDirection != null ? focusDirection.m7858unboximpl() : FocusDirection.Companion.m7860getEnterdhqQ8s();
        return x.n(getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new C03901(iM7858unboximpl)), true);
    }

    public final boolean requestFocusViewFocusFix(int i2, android.graphics.Rect rect) {
        View viewFindNextNonChildView;
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView) {
            return false;
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i2);
        int iM7858unboximpl = focusDirection != null ? focusDirection.m7858unboximpl() : FocusDirection.Companion.m7860getEnterdhqQ8s();
        if (hasFocus() && mo7921moveFocusInChildren3ESFkO8(iM7858unboximpl)) {
            return true;
        }
        am amVar = new am();
        Boolean boolMo7873focusSearchULY8qGw = getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1(amVar, iM7858unboximpl));
        if (boolMo7873focusSearchULY8qGw == null) {
            return false;
        }
        if (boolMo7873focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (amVar.f48101a) {
            return false;
        }
        if ((rect != null && !hasFocus() && x.n(getFocusOwner().mo7873focusSearchULY8qGw(iM7858unboximpl, null, new AndroidComposeView$requestFocusViewFocusFix$altFocus$1(iM7858unboximpl)), true)) || (viewFindNextNonChildView = findNextNonChildView(i2)) == null || viewFindNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean zRequestFocus = viewFindNextNonChildView.requestFocus(i2);
        this.processingRequestFocusForNextNonChildView = false;
        return zRequestFocus;
    }

    @Override // androidx.compose.ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.ui.focus.PlatformFocusOwner
    /* renamed from: requestOwnerFocus-7o62pno */
    public boolean mo7922requestOwnerFocus7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer numM7867toAndroidFocusDirection3ESFkO8;
        if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
            if (isFocused()) {
                return true;
            }
        } else if (isFocused() || hasFocus()) {
            return true;
        }
        int iIntValue = 130;
        if (focusDirection != null && (numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(focusDirection.m7858unboximpl())) != null) {
            iIntValue = numM7867toAndroidFocusDirection3ESFkO8.intValue();
        }
        return super.requestFocus(iIntValue, rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    @Override // androidx.compose.ui.node.OutOfFrameExecutor
    public void schedule(a<ab> aVar) {
        u<a<ab>> uVar = this.outOfFrameQueue;
        boolean zIsEmpty = uVar.isEmpty();
        uVar.addLast(aVar);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler == null) {
                throw new IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.outOfFrameRunnable);
        }
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo9692screenToLocalMKHz9U(long j2) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - Float.intBitsToFloat((int) (this.windowPosition & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return Matrix.m8498mapMKHz9U(this.windowToViewMatrix, (Float.floatToRawIntBits(fIntBitsToFloat2) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.ui.node.RootForTest
    public boolean sendIndirectPointerEvent(IndirectPointerEvent indirectPointerEvent) {
        if (AndroidIndirectPointerEvent_androidKt.getNativeEvent(indirectPointerEvent).getActionMasked() == 3) {
            getFocusOwner().dispatchIndirectPointerCancel();
            return true;
        }
        handleIndirectPointerEvent(indirectPointerEvent);
        return true;
    }

    @Override // androidx.compose.ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo10137sendKeyEventZmokQxo(KeyEvent keyEvent) {
        return getFocusOwner().mo7871dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.CC.m7878dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui(j2);
    }

    public final void setComposeViewContext(ComposeViewContext composeViewContext) {
        if (getCoroutineContext() != composeViewContext.getCompositionContext$ui().getEffectCoroutineContext() && !getRoot().getChildren$ui().isEmpty()) {
            InlineClassHelperKt.throwIllegalArgumentException("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, ab> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot snapshotMakeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            ComposeViewContext composeViewContext2 = get_composeViewContext();
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            if (x.n(composeViewContext, composeViewContext2)) {
                return;
            }
            if (isAttachedToWindow()) {
                composeViewContext2.decrementViewCount$ui();
                composeViewContext.incrementViewCount$ui();
            }
            set_composeViewContext(composeViewContext);
            setCoroutineContext(composeViewContext.getCompositionContext$ui().getEffectCoroutineContext());
        } catch (Throwable th) {
            companion.restoreNonObservable(currentThreadSnapshot, snapshotMakeCurrentNonObservable, readObserver);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.composeViewContextIncrementedDuringInit = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration$delegate.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    public void setCoroutineContext(j jVar) {
        this.coroutineContext = jVar;
    }

    public final void setFrameEndScheduler$ui(LifecycleRetainedValuesStoreOwner.FrameEndScheduler frameEndScheduler) {
        this.frameEndScheduler = frameEndScheduler;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j2) {
        this.lastMatrixRecalculationAnimationTime = j2;
    }

    public final void setOnReadyForComposition(l<? super ComposeViewContext, ab> lVar) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.composeViewContextIncrementedDuringInit) {
            lVar.invoke(getComposeViewContext());
        } else {
            this.onReadyForComposition = lVar;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m10189setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(IndirectPointerEventPrimaryDirectionalMotionAxis indirectPointerEventPrimaryDirectionalMotionAxis) {
        this.primaryDirectionalMotionAxisOverride = indirectPointerEventPrimaryDirectionalMotionAxis;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    @Override // androidx.compose.ui.node.RootForTest
    public void setUncaughtExceptionHandler(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
        this.measureAndLayoutDelegate.setUncaughtExceptionHandler$ui(uncaughtExceptionHandler);
    }

    public final void setUncaughtExceptionHandler$ui(RootForTest.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.uncaughtExceptionHandler = uncaughtExceptionHandler;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(h.g.a.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super h.c.e<?>, ? extends java.lang.Object> r5, h.c.e<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView.C03911
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView.C03911) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            e.b.c.b(r6)
            goto L44
        L2f:
            e.b.c.b(r6)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<androidx.compose.ui.platform.AndroidPlatformTextInputSession>> r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>()
            h.g.a.l r2 = (h.g.a.l) r2
            r0.label = r3
            java.lang.Object r4 = androidx.compose.ui.SessionMutex.m7669withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r4 != r1) goto L44
            return r1
        L44:
            h.e r4 = new h.e
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.textInputSession(h.g.a.p, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.Owner
    public void voteFrameRate(float f2) {
        if (isArrEnabled$ui()) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.currentFrameRate) || f2 > this.currentFrameRate) {
                    this.currentFrameRate = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.currentFrameRateCategory) || f2 < this.currentFrameRateCategory) {
                    this.currentFrameRateCategory = f2;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            if (androidComposeView.isAttachedToWindow()) {
                if (AndroidComposeView.systemPropertiesChangedRunnable == null) {
                    Runnable runnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            AndroidComposeView.Companion.addNotificationForSysPropsChange$lambda$0();
                        }
                    };
                    AndroidComposeView.systemPropertiesChangedRunnable = runnable;
                    StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                    try {
                        if (AndroidComposeView.systemPropertiesClass == null) {
                            AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                        }
                        if (AndroidComposeView.addChangeCallbackMethod == null) {
                            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                            Class cls = AndroidComposeView.systemPropertiesClass;
                            AndroidComposeView.addChangeCallbackMethod = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                        }
                        Method method = AndroidComposeView.addChangeCallbackMethod;
                        if (method != null) {
                            method.invoke(null, runnable);
                        }
                    } catch (Throwable unused) {
                    }
                    StrictMode.setVmPolicy(vmPolicy);
                }
                synchronized (AndroidComposeView.composeViews) {
                    AndroidComposeView.composeViews.add(androidComposeView);
                }
            }
        }

        static final void addNotificationForSysPropsChange$lambda$0() {
            synchronized (AndroidComposeView.composeViews) {
                int i2 = 0;
                if (Build.VERSION.SDK_INT < 30) {
                    MutableObjectList mutableObjectList = AndroidComposeView.composeViews;
                    Object[] objArr = mutableObjectList.content;
                    int i3 = mutableObjectList._size;
                    while (i2 < i3) {
                        final AndroidComposeView androidComposeView = (AndroidComposeView) objArr[i2];
                        boolean showLayoutBounds = androidComposeView.getShowLayoutBounds();
                        androidComposeView.setShowLayoutBounds(AndroidComposeView.Companion.getIsShowingLayoutBounds());
                        if (showLayoutBounds != androidComposeView.getShowLayoutBounds()) {
                            androidComposeView.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    androidComposeView.invalidateDescendants();
                                }
                            });
                        }
                        i2++;
                    }
                } else {
                    MutableObjectList mutableObjectList2 = AndroidComposeView.composeViews;
                    Object[] objArr2 = mutableObjectList2.content;
                    int i4 = mutableObjectList2._size;
                    while (i2 < i4) {
                        final AndroidComposeView androidComposeView2 = (AndroidComposeView) objArr2[i2];
                        androidComposeView2.post(new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$Companion$$ExternalSyntheticLambda1
                            @Override // java.lang.Runnable
                            public final void run() {
                                androidComposeView2.invalidateDescendants();
                            }
                        });
                        i2++;
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                }
                if (AndroidComposeView.getBooleanMethod == null) {
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", false) : null;
                return x.n(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, true);
            } catch (Exception unused) {
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeNotificationForSysPropsChange(AndroidComposeView androidComposeView) {
            synchronized (AndroidComposeView.composeViews) {
                AndroidComposeView.composeViews.remove(androidComposeView);
            }
        }

        public final void dispatchOnScrollChanged(ViewTreeObserver viewTreeObserver) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                if (AndroidComposeView.dispatchOnScrollChangedMethod == null) {
                    Method declaredMethod = viewTreeObserver.getClass().getDeclaredMethod("dispatchOnScrollChanged", null);
                    declaredMethod.setAccessible(true);
                    AndroidComposeView.dispatchOnScrollChangedMethod = declaredMethod;
                }
                Method method = AndroidComposeView.dispatchOnScrollChangedMethod;
                if (method != null) {
                    method.invoke(viewTreeObserver, null);
                }
            } catch (Exception unused) {
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$getFocusedRect$1, reason: invalid class name and case insensitive filesystem */
    final class C03871 extends y implements l<FocusTargetNode, Boolean> {
        public static final C03871 INSTANCE = new C03871();

        C03871() {
            super(1);
        }

        @Override // h.g.a.l
        public final Boolean invoke(FocusTargetNode focusTargetNode) {
            return true;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1, reason: invalid class name and case insensitive filesystem */
    final class C03891 extends y implements a<ab> {
        C03891() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AndroidComposeView.Companion.addNotificationForSysPropsChange(AndroidComposeView.this);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.ui.node.Owner
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    /* compiled from: WazeSource */
    final class RootModifierNode extends Modifier.Node implements BringIntoViewModifierNode, SemanticsModifierNode, RotaryInputModifierNode, KeyInputModifierNode, LayoutModifierNode, TraversableNode, WindowInsetsRulerProvider {
        private int previousGeneration = -1;
        private final l<RulerScope, ab> rulerLambda = new AndroidComposeView$RootModifierNode$rulerLambda$1(this);

        public RootModifierNode() {
        }

        @Override // androidx.compose.ui.relocation.BringIntoViewModifierNode
        public Object bringIntoView(LayoutCoordinates layoutCoordinates, a<Rect> aVar, e<? super ab> eVar) {
            long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(layoutCoordinates);
            Rect rectInvoke = aVar.invoke();
            Rect rectM8017translatek4lQ0M = rectInvoke != null ? rectInvoke.m8017translatek4lQ0M(jPositionInRoot) : null;
            if (rectM8017translatek4lQ0M != null) {
                AndroidComposeView.this.requestRectangleOnScreen(RectHelper_androidKt.toAndroidRect(rectM8017translatek4lQ0M), false);
            }
            return ab.f48028a;
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public MutableObjectList<MutableState<android.graphics.Rect>> getCutoutRects() {
            return getInsetsListener().getDisplayCutouts();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public List<RectRulers> getCutoutRulers() {
            return getInsetsListener().getDisplayCutoutRulers();
        }

        public final MutableIntState getGeneration() {
            return getInsetsListener().getGeneration();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public InsetsListener getInsetsListener() {
            return AndroidComposeView.this.getInsetsListener();
        }

        @Override // androidx.compose.ui.layout.WindowInsetsRulerProvider
        public ScatterMap<Object, WindowWindowInsetsAnimationValues> getInsetsValues() {
            return getInsetsListener().getInsetsValues();
        }

        public final int getPreviousGeneration() {
            return this.previousGeneration;
        }

        public final l<RulerScope, ab> getRulerLambda() {
            return this.rulerLambda;
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public /* synthetic */ boolean getShouldClearDescendantSemantics() {
            return false;
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
            return false;
        }

        @Override // androidx.compose.ui.node.TraversableNode
        public Object getTraverseKey() {
            return WindowInsetsRulers_androidKt.RulerKey;
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public /* synthetic */ boolean isImportantForBounds() {
            return true;
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicHeight.1
                /* JADX INFO: Access modifiers changed from: package-private */
                public AnonymousClass1() {
                }

                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                    return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.maxIntrinsicWidth.1
                /* JADX INFO: Access modifiers changed from: package-private */
                public C03831() {
                }

                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                    return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        /* renamed from: measure-3p2s80s */
        public MeasureResult mo1732measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(measureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, this.rulerLambda, new AndroidComposeView$RootModifierNode$measure$1(placeableMo9741measureBRTryo0), 4, null);
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return NodeMeasuringIntrinsics.INSTANCE.minHeight$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicHeight.1
                /* JADX INFO: Access modifiers changed from: package-private */
                public C03841() {
                }

                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                    return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Override // androidx.compose.ui.node.LayoutModifierNode
        public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return NodeMeasuringIntrinsics.INSTANCE.minWidth$ui(new NodeMeasuringIntrinsics.MeasureBlock() { // from class: androidx.compose.ui.node.LayoutModifierNode.minIntrinsicWidth.1
                /* JADX INFO: Access modifiers changed from: package-private */
                public C03851() {
                }

                @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.MeasureBlock
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo9969measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
                    return LayoutModifierNode.this.mo1732measure3p2s80s(measureScope, measurable, j2);
                }
            }, intrinsicMeasureScope, intrinsicMeasurable, i2);
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onKeyEvent-ZmokQxo */
        public boolean mo1939onKeyEventZmokQxo(KeyEvent keyEvent) {
            AndroidComposeView androidComposeView;
            Rect embeddedViewFocusRect;
            Boolean boolMo7873focusSearchULY8qGw;
            Boolean boolMo7873focusSearchULY8qGw2;
            FocusDirection focusDirectionM7868toFocusDirectionZmokQxo = FocusInteropUtils_androidKt.m7868toFocusDirectionZmokQxo(keyEvent);
            if (focusDirectionM7868toFocusDirectionZmokQxo == null || !KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9432getKeyDownCS__XNY())) {
                return false;
            }
            if (ComposeUiFlags.isBypassUnfocusableComposeViewEnabled) {
                FocusTargetNode activeFocusTargetNode = AndroidComposeView.this.getFocusOwner().getActiveFocusTargetNode();
                if (activeFocusTargetNode != null && activeFocusTargetNode.isInteropViewHost() && AndroidComposeView.this.mo7921moveFocusInChildren3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl())) {
                    return true;
                }
                AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                Boolean boolMo7873focusSearchULY8qGw3 = androidComposeView2.getFocusOwner().mo7873focusSearchULY8qGw(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl(), androidComposeView2.getEmbeddedViewFocusRect(), new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1(focusDirectionM7868toFocusDirectionZmokQxo));
                if (boolMo7873focusSearchULY8qGw3 == null || boolMo7873focusSearchULY8qGw3.booleanValue()) {
                    return true;
                }
                if (FocusOwnerImplKt.m7882is1dFocusSearch3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl())) {
                    Integer numM7867toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl());
                    int iIntValue = numM7867toAndroidFocusDirection3ESFkO8 != null ? numM7867toAndroidFocusDirection3ESFkO8.intValue() : 2;
                    AndroidComposeView androidComposeView3 = AndroidComposeView.this;
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View rootView = androidComposeView3.getRootView();
                    x.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                    View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, AndroidComposeView.this.getView(), iIntValue);
                    if (viewFindNextFocus == null || x.n(viewFindNextFocus, AndroidComposeView.this)) {
                        return AndroidComposeView.this.getFocusOwner().mo7876resetFocus3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl());
                    }
                }
                return false;
            }
            Integer numM7867toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m7867toAndroidFocusDirection3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl());
            if ((!ComposeUiFlags.isViewFocusFixEnabled || !AndroidComposeView.this.hasFocus() || numM7867toAndroidFocusDirection3ESFkO82 == null || !AndroidComposeView.this.mo7921moveFocusInChildren3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl())) && (boolMo7873focusSearchULY8qGw = androidComposeView.getFocusOwner().mo7873focusSearchULY8qGw(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl(), (embeddedViewFocusRect = (androidComposeView = AndroidComposeView.this).getEmbeddedViewFocusRect()), new AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$2(focusDirectionM7868toFocusDirectionZmokQxo))) != null && !boolMo7873focusSearchULY8qGw.booleanValue()) {
                if (!FocusOwnerImplKt.m7882is1dFocusSearch3ESFkO8(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl())) {
                    return false;
                }
                if (numM7867toAndroidFocusDirection3ESFkO82 != null) {
                    View viewFindNextNonChildView = AndroidComposeView.this.findNextNonChildView(numM7867toAndroidFocusDirection3ESFkO82.intValue());
                    if (true == x.n(viewFindNextNonChildView, AndroidComposeView.this)) {
                        viewFindNextNonChildView = null;
                    }
                    if (viewFindNextNonChildView != null) {
                        android.graphics.Rect androidRect = embeddedViewFocusRect != null ? RectHelper_androidKt.toAndroidRect(embeddedViewFocusRect) : null;
                        if (androidRect == null) {
                            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Invalid rect");
                            throw new h.e();
                        }
                        View rootView2 = AndroidComposeView.this.getRootView();
                        x.d(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
                        ViewGroup viewGroup = (ViewGroup) rootView2;
                        viewGroup.offsetDescendantRectToMyCoords(AndroidComposeView.this.getView(), androidRect);
                        viewGroup.offsetRectIntoDescendantCoords(viewFindNextNonChildView, androidRect);
                        if (FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, numM7867toAndroidFocusDirection3ESFkO82, androidRect)) {
                            return true;
                        }
                    }
                }
                if (AndroidComposeView.this.getFocusOwner().mo7870clearFocusI7lrPNg(false, true, false, focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl()) && (boolMo7873focusSearchULY8qGw2 = AndroidComposeView.this.getFocusOwner().mo7873focusSearchULY8qGw(focusDirectionM7868toFocusDirectionZmokQxo.m7858unboximpl(), null, new AndroidComposeView$RootModifierNode$onKeyEvent$1(focusDirectionM7868toFocusDirectionZmokQxo))) != null) {
                    return boolMo7873focusSearchULY8qGw2.booleanValue();
                }
            }
            return true;
        }

        @Override // androidx.compose.ui.input.key.KeyInputModifierNode
        /* renamed from: onPreKeyEvent-ZmokQxo */
        public boolean mo1941onPreKeyEventZmokQxo(KeyEvent keyEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
        public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
            return false;
        }

        public final void setPreviousGeneration(int i2) {
            this.previousGeneration = i2;
        }

        public static /* synthetic */ void getRulerLambda$annotations() {
        }

        @Override // androidx.compose.ui.node.SemanticsModifierNode
        public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        }
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m10180getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i2;
        layoutParamsGenerateDefaultLayoutParams.height = i3;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM8498mapMKHz9U = Matrix.m8498mapMKHz9U(this.viewToWindowMatrix, (Float.floatToRawIntBits(y) & MuxerUtil.UNSIGNED_INT_MAX_VALUE) | (Float.floatToRawIntBits(x) << 32));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM8498mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM8498mapMKHz9U & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        this.windowPosition = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i2, android.graphics.Rect rect) {
        super.onFocusChanged(z, i2, rect);
        if (z || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }
}
