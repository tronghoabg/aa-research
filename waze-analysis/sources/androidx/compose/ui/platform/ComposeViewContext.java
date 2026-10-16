package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.HostDefaultProviderKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.res.ImageVectorCache;
import androidx.compose.ui.res.ResourceIdCache;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.unit.IntSize;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.savedstate.compose.LocalSavedStateRegistryOwnerKt;
import com.waze.R;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeViewContext {
    public static final int $stable = 8;
    private CompositionContext _compositionContext;
    private LifecycleOwner _lifecycleOwner;
    private SavedStateRegistryOwner _savedStateRegistryOwner;
    private ViewModelStoreOwner _viewModelStoreOwner;
    private final AndroidAccessibilityManager accessibilityManager;
    private boolean areValuesResolved;
    private final a<DerivedSize> calculateWindowSizeLambda;
    private final ComposeViewContext$callback$1 callback;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final MutableState<Configuration> configuration;
    private final Configuration currentConfiguration;
    private final MutableState<FontFamily.Resolver> fontFamilyResolver;
    private final Font.ResourceLoader fontLoader;
    private final HapticFeedback hapticFeedback;
    private final ImageVectorCache imageVectorCache;
    private final ResourceIdCache resourceIdCache;
    private final LayoutNodeDrawScope sharedDrawScope;
    private long testWindowSize;
    private final AndroidUriHandler uriHandler;
    private final View view;
    private final AndroidViewConfiguration viewConfiguration;
    private int viewCount;
    private final LazyWindowInfo windowInfo;

    /* JADX WARN: Multi-variable type inference failed */
    private ComposeViewContext(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, boolean z) {
        ImageVectorCache imageVectorCache;
        Configuration configuration;
        MutableState<Configuration> mutableStateMutableStateOf$default;
        AndroidAccessibilityManager androidAccessibilityManager;
        AndroidUriHandler androidUriHandler;
        AndroidClipboardManager androidClipboardManager;
        AndroidClipboard androidClipboard;
        AndroidFontResourceLoader androidFontResourceLoader;
        MutableState<FontFamily.Resolver> mutableStateMutableStateOf;
        AndroidViewConfiguration androidViewConfiguration;
        CanvasHolder canvasHolder;
        LayoutNodeDrawScope layoutNodeDrawScope;
        ResourceIdCache resourceIdCache;
        this.view = view;
        this._compositionContext = compositionContext;
        this._lifecycleOwner = lifecycleOwner;
        this._savedStateRegistryOwner = savedStateRegistryOwner;
        this._viewModelStoreOwner = viewModelStoreOwner;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            imageVectorCache = composeViewContext.imageVectorCache;
        } else {
            imageVectorCache = new ImageVectorCache();
        }
        this.imageVectorCache = imageVectorCache;
        this.resourceIdCache = (composeViewContext == null || (resourceIdCache = composeViewContext.resourceIdCache) == null) ? new ResourceIdCache() : resourceIdCache;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            configuration = composeViewContext.currentConfiguration;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.currentConfiguration = configuration;
        CanvasDrawScope canvasDrawScope = null;
        Object[] objArr = 0;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            mutableStateMutableStateOf$default = composeViewContext.configuration;
        } else {
            mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Configuration(configuration), null, 2, null);
        }
        this.configuration = mutableStateMutableStateOf$default;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidAccessibilityManager = composeViewContext.accessibilityManager;
        } else {
            androidAccessibilityManager = new AndroidAccessibilityManager(view.getContext());
        }
        this.accessibilityManager = androidAccessibilityManager;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidUriHandler = composeViewContext.uriHandler;
        } else {
            androidUriHandler = new AndroidUriHandler(view.getContext());
        }
        this.uriHandler = androidUriHandler;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidClipboardManager = composeViewContext.clipboardManager;
        } else {
            androidClipboardManager = new AndroidClipboardManager(view.getContext());
        }
        this.clipboardManager = androidClipboardManager;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidClipboard = composeViewContext.clipboard;
        } else {
            androidClipboard = new AndroidClipboard(androidClipboardManager);
        }
        this.clipboard = androidClipboard;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidFontResourceLoader = composeViewContext.fontLoader;
        } else {
            androidFontResourceLoader = new AndroidFontResourceLoader(view.getContext());
        }
        this.fontLoader = androidFontResourceLoader;
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            mutableStateMutableStateOf = composeViewContext.fontFamilyResolver;
        } else {
            mutableStateMutableStateOf = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(view.getContext()), SnapshotStateKt.referentialEqualityPolicy());
        }
        this.fontFamilyResolver = mutableStateMutableStateOf;
        this.hapticFeedback = view == (composeViewContext != null ? composeViewContext.view : null) ? composeViewContext.hapticFeedback : new PlatformHapticFeedback(view);
        if (z) {
            if (composeViewContext == null) {
                x.g();
            }
            androidViewConfiguration = composeViewContext.viewConfiguration;
        } else {
            androidViewConfiguration = new AndroidViewConfiguration(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.viewConfiguration = androidViewConfiguration;
        this.sharedDrawScope = (composeViewContext == null || (layoutNodeDrawScope = composeViewContext.sharedDrawScope) == null) ? new LayoutNodeDrawScope(canvasDrawScope, 1, objArr == true ? 1 : 0) : layoutNodeDrawScope;
        this.windowInfo = new LazyWindowInfo();
        this.canvasHolder = (composeViewContext == null || (canvasHolder = composeViewContext.canvasHolder) == null) ? new CanvasHolder() : canvasHolder;
        this.testWindowSize = IntSize.Companion.m11344getZeroYbymL2g();
        this.calculateWindowSizeLambda = new ComposeViewContext$calculateWindowSizeLambda$1(this);
        this.callback = new ComposeViewContext$callback$1(this);
    }

    public static /* synthetic */ ComposeViewContext copy$default(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            view = composeViewContext.view;
        }
        if ((i2 & 2) != 0) {
            compositionContext = composeViewContext._compositionContext;
        }
        if ((i2 & 4) != 0) {
            lifecycleOwner = composeViewContext._lifecycleOwner;
        }
        if ((i2 & 8) != 0) {
            savedStateRegistryOwner = composeViewContext._savedStateRegistryOwner;
        }
        if ((i2 & 16) != 0) {
            viewModelStoreOwner = composeViewContext._viewModelStoreOwner;
        }
        ViewModelStoreOwner viewModelStoreOwner2 = viewModelStoreOwner;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        return composeViewContext.copy(view, compositionContext, lifecycleOwner2, savedStateRegistryOwner, viewModelStoreOwner2);
    }

    private final void resolveValuesIfNeeded() {
        if (this.areValuesResolved) {
            return;
        }
        this.areValuesResolved = true;
        if (this._compositionContext == null) {
            Recomposer recomposerFindViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this.view);
            if (recomposerFindViewTreeCompositionContext == null) {
                recomposerFindViewTreeCompositionContext = WindowRecomposer_androidKt.getWindowRecomposer(this.view);
            }
            this._compositionContext = recomposerFindViewTreeCompositionContext;
        }
        if (this._lifecycleOwner == null) {
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(this.view);
            if (lifecycleOwner == null) {
                throw new IllegalStateException("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            this._lifecycleOwner = lifecycleOwner;
        }
        if (this._savedStateRegistryOwner == null) {
            SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this.view);
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
            this._savedStateRegistryOwner = savedStateRegistryOwner;
        }
        if (this._viewModelStoreOwner == null) {
            this._viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(this.view);
        }
    }

    private final void startObserving() {
        this.view.getContext().registerComponentCallbacks(this.callback);
        onConfigurationChanged$ui(this.view.getResources().getConfiguration());
        this.windowInfo.setWindowFocused(this.view.hasWindowFocus());
        this.windowInfo.setOnInitializeContainerSize(this.calculateWindowSizeLambda);
        MutableState mutableState = this.windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(this.calculateWindowSizeLambda.invoke());
        }
        View view = this.view;
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.callback);
    }

    private final void stopObserving() {
        this.view.getContext().unregisterComponentCallbacks(this.callback);
        this.windowInfo.setOnInitializeContainerSize(null);
        this.view.getViewTreeObserver().removeOnWindowFocusChangeListener(this.callback);
    }

    public final void ProvideCompositionLocals$ui(AndroidComposeView androidComposeView, p<? super Composer, ? super Integer, ab> pVar, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(123858079);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(androidComposeView) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(123858079, i3, -1, "androidx.compose.ui.platform.ComposeViewContext.ProvideCompositionLocals (ComposeViewContext.android.kt:464)");
            }
            Object tag = androidComposeView.getTag(R.id.inspection_slot_table_set);
            Set<CompositionData> set = null;
            Set<CompositionData> set2 = au.g(tag) ? (Set) tag : null;
            if (set2 == null) {
                Object parent = androidComposeView.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                if (au.g(tag2)) {
                    set = (Set) tag2;
                }
            } else {
                set = set2;
            }
            if (set != null) {
                set.add(composerStartRestartGroup.getCompositionData());
                composerStartRestartGroup.collectParameterInformation();
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = DisposableSaveableStateRegistry_androidKt.DisposableSaveableStateRegistry(androidComposeView, getSavedStateRegistryOwner$ui());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            DisposableSaveableStateRegistry disposableSaveableStateRegistry = (DisposableSaveableStateRegistry) objRememberedValue;
            ab abVar = ab.f48028a;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(disposableSaveableStateRegistry);
            ComposeViewContext$ProvideCompositionLocals$1$1 composeViewContext$ProvideCompositionLocals$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || composeViewContext$ProvideCompositionLocals$1$1RememberedValue == Composer.Companion.getEmpty()) {
                composeViewContext$ProvideCompositionLocals$1$1RememberedValue = new ComposeViewContext$ProvideCompositionLocals$1$1(disposableSaveableStateRegistry);
                composerStartRestartGroup.updateRememberedValue(composeViewContext$ProvideCompositionLocals$1$1RememberedValue);
            }
            EffectsKt.DisposableEffect(abVar, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) composeViewContext$ProvideCompositionLocals$1$1RememberedValue, composerStartRestartGroup, 6);
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalScrollCaptureInProgress())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui();
            boolean zChanged = composerStartRestartGroup.changed(androidComposeView.getView());
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ViewTreeHostDefaultProvider(androidComposeView.getView());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{LocalLifecycleOwnerKt.getLocalLifecycleOwner().provides(getLifecycleOwner$ui()), LocalSavedStateRegistryOwnerKt.getLocalSavedStateRegistryOwner().provides(getSavedStateRegistryOwner$ui()), AndroidCompositionLocals_androidKt.getLocalImageVectorCache().provides(this.imageVectorCache), AndroidCompositionLocals_androidKt.getLocalResourceIdCache().provides(this.resourceIdCache), AndroidCompositionLocals_androidKt.getLocalContext().provides(androidComposeView.getContext()), InspectionTablesKt.getLocalInspectionTables().provides(set), AndroidCompositionLocals_androidKt.getLocalConfiguration().provides(androidComposeView.getConfiguration()), SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(disposableSaveableStateRegistry), AndroidCompositionLocals_androidKt.getLocalView().provides(androidComposeView.getView()), CompositionLocalsKt.getLocalProvidableScrollCaptureInProgress().provides(Boolean.valueOf(zBooleanValue)), CompositionLocalsKt.getLocalViewConfiguration().provides(androidComposeView.getViewConfiguration()), HostDefaultProviderKt.getLocalHostDefaultProvider().provides((ViewTreeHostDefaultProvider) objRememberedValue2)}, ComposableLambdaKt.rememberComposableLambda(1317454175, true, new ComposeViewContext$ProvideCompositionLocals$2(androidComposeView, this, pVar), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ComposeViewContext$ProvideCompositionLocals$3(this, androidComposeView, pVar, i2));
        }
    }

    public final ComposeViewContext copy(View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner) {
        return new ComposeViewContext(this, view, compositionContext, lifecycleOwner, savedStateRegistryOwner, viewModelStoreOwner, false, 64, null);
    }

    public final void decrementViewCount$ui() {
        int i2 = this.viewCount - 1;
        this.viewCount = i2;
        if (i2 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.viewCount = 0;
        } else if (i2 != 0) {
            return;
        }
        stopObserving();
    }

    public final AndroidAccessibilityManager getAccessibilityManager$ui() {
        return this.accessibilityManager;
    }

    public final CanvasHolder getCanvasHolder$ui() {
        return this.canvasHolder;
    }

    public final AndroidClipboard getClipboard$ui() {
        return this.clipboard;
    }

    public final AndroidClipboardManager getClipboardManager$ui() {
        return this.clipboardManager;
    }

    public final CompositionContext getCompositionContext$ui() {
        resolveValuesIfNeeded();
        CompositionContext compositionContext = this._compositionContext;
        if (compositionContext == null) {
            x.g();
        }
        return compositionContext;
    }

    public final MutableState<Configuration> getConfiguration$ui() {
        return this.configuration;
    }

    public final MutableState<FontFamily.Resolver> getFontFamilyResolver$ui() {
        return this.fontFamilyResolver;
    }

    public final Font.ResourceLoader getFontLoader$ui() {
        return this.fontLoader;
    }

    public final HapticFeedback getHapticFeedback$ui() {
        return this.hapticFeedback;
    }

    public final ImageVectorCache getImageVectorCache$ui() {
        return this.imageVectorCache;
    }

    public final LifecycleOwner getLifecycleOwner$ui() {
        resolveValuesIfNeeded();
        LifecycleOwner lifecycleOwner = this._lifecycleOwner;
        if (lifecycleOwner == null) {
            x.g();
        }
        return lifecycleOwner;
    }

    public final ResourceIdCache getResourceIdCache$ui() {
        return this.resourceIdCache;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner$ui() {
        resolveValuesIfNeeded();
        SavedStateRegistryOwner savedStateRegistryOwner = this._savedStateRegistryOwner;
        if (savedStateRegistryOwner == null) {
            x.g();
        }
        return savedStateRegistryOwner;
    }

    public final LayoutNodeDrawScope getSharedDrawScope$ui() {
        return this.sharedDrawScope;
    }

    /* renamed from: getTestWindowSize-YbymL2g$ui, reason: not valid java name */
    public final long m10218getTestWindowSizeYbymL2g$ui() {
        return this.testWindowSize;
    }

    public final AndroidUriHandler getUriHandler$ui() {
        return this.uriHandler;
    }

    public final View getView$ui() {
        return this.view;
    }

    public final AndroidViewConfiguration getViewConfiguration$ui() {
        return this.viewConfiguration;
    }

    public final int getViewCount$ui() {
        return this.viewCount;
    }

    public final ViewModelStoreOwner getViewModelStoreOwner$ui() {
        resolveValuesIfNeeded();
        return this._viewModelStoreOwner;
    }

    public final LazyWindowInfo getWindowInfo$ui() {
        return this.windowInfo;
    }

    public final void incrementViewCount$ui() {
        int i2 = this.viewCount + 1;
        this.viewCount = i2;
        if (i2 == 1) {
            startObserving();
        }
    }

    public final void onConfigurationChanged$ui(Configuration configuration) {
        int iUpdateFrom = this.currentConfiguration.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            this.imageVectorCache.prune(iUpdateFrom);
            this.configuration.setValue(new Configuration(configuration));
            this.resourceIdCache.clear();
            if ((268435456 & iUpdateFrom) != 0) {
                this.fontFamilyResolver.setValue(FontFamilyResolver_androidKt.createFontFamilyResolver(this.view.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                LazyWindowInfo lazyWindowInfo = this.windowInfo;
                a<DerivedSize> aVar = this.calculateWindowSizeLambda;
                MutableState mutableState = lazyWindowInfo._containerSize;
                if (mutableState != null) {
                    mutableState.setValue(aVar.invoke());
                }
            }
        }
    }

    /* renamed from: setTestWindowSize-ozmzZPI$ui, reason: not valid java name */
    public final void m10219setTestWindowSizeozmzZPI$ui(long j2) {
        this.testWindowSize = j2;
    }

    public static /* synthetic */ void getFontLoader$ui$annotations() {
    }

    public /* synthetic */ ComposeViewContext(View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, int i2, o oVar) {
        this(view, (i2 & 2) != 0 ? null : compositionContext, (i2 & 4) != 0 ? null : lifecycleOwner, (i2 & 8) != 0 ? null : savedStateRegistryOwner, (i2 & 16) != 0 ? null : viewModelStoreOwner);
    }

    public ComposeViewContext(View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner) {
        this(ComposeView_androidKt.findViewTreeComposeViewContext(view), view, compositionContext, lifecycleOwner, savedStateRegistryOwner, viewModelStoreOwner, false, 64, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ ComposeViewContext(ComposeViewContext composeViewContext, View view, CompositionContext compositionContext, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, ViewModelStoreOwner viewModelStoreOwner, boolean z, int i2, o oVar) {
        View view2;
        if ((i2 & 64) != 0) {
            Context context = null;
            if (composeViewContext != null && (view2 = composeViewContext.view) != null) {
                context = view2.getContext();
            }
            z = x.n(context, view.getContext());
        }
        this(composeViewContext, view, compositionContext, lifecycleOwner, savedStateRegistryOwner, viewModelStoreOwner, z);
    }
}
