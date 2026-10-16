package androidx.compose.foundation.layout;

import android.graphics.Path;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.waze.strings.DisplayStrings;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean testInsets;
    private int accessCount;
    private final AndroidWindowInsets captionBar;
    private final ValueInsets captionBarIgnoringVisibility;
    private final boolean consumes;
    private final MutableState cutoutPath$delegate;
    private final AndroidWindowInsets displayCutout;
    private final AndroidWindowInsets ime;
    private final ValueInsets imeAnimationSource;
    private final ValueInsets imeAnimationTarget;
    private final InsetsListener insetsListener;
    private final AndroidWindowInsets mandatorySystemGestures;
    private final AndroidWindowInsets navigationBars;
    private final ValueInsets navigationBarsIgnoringVisibility;
    private final WindowInsets safeContent;
    private final WindowInsets safeDrawing;
    private final WindowInsets safeGestures;
    private final AndroidWindowInsets statusBars;
    private final ValueInsets statusBarsIgnoringVisibility;
    private final AndroidWindowInsets systemBars;
    private final ValueInsets systemBarsIgnoringVisibility;
    private final AndroidWindowInsets systemGestures;
    private final AndroidWindowInsets tappableElement;
    private final ValueInsets tappableElementIgnoringVisibility;
    private final ValueInsets waterfall;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final WeakHashMap<View, WindowInsetsHolder> viewMap = new WeakHashMap<>();

    private WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view) {
        DisplayCutoutCompat displayCutout;
        Path cutoutPath;
        DisplayCutoutCompat displayCutout2;
        Insets waterfallInsets;
        Companion companion = Companion;
        AndroidWindowInsets androidWindowInsetsSystemInsets = companion.systemInsets(windowInsetsCompat, 4, "captionBar");
        this.captionBar = androidWindowInsetsSystemInsets;
        AndroidWindowInsets androidWindowInsetsSystemInsets2 = companion.systemInsets(windowInsetsCompat, 128, "displayCutout");
        this.displayCutout = androidWindowInsetsSystemInsets2;
        AndroidWindowInsets androidWindowInsetsSystemInsets3 = companion.systemInsets(windowInsetsCompat, 8, "ime");
        this.ime = androidWindowInsetsSystemInsets3;
        AndroidWindowInsets androidWindowInsetsSystemInsets4 = companion.systemInsets(windowInsetsCompat, 32, "mandatorySystemGestures");
        this.mandatorySystemGestures = androidWindowInsetsSystemInsets4;
        AndroidWindowInsets androidWindowInsetsSystemInsets5 = companion.systemInsets(windowInsetsCompat, 2, "navigationBars");
        this.navigationBars = androidWindowInsetsSystemInsets5;
        AndroidWindowInsets androidWindowInsetsSystemInsets6 = companion.systemInsets(windowInsetsCompat, 1, "statusBars");
        this.statusBars = androidWindowInsetsSystemInsets6;
        AndroidWindowInsets androidWindowInsetsSystemInsets7 = companion.systemInsets(windowInsetsCompat, DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL, "systemBars");
        this.systemBars = androidWindowInsetsSystemInsets7;
        AndroidWindowInsets androidWindowInsetsSystemInsets8 = companion.systemInsets(windowInsetsCompat, 16, "systemGestures");
        this.systemGestures = androidWindowInsetsSystemInsets8;
        AndroidWindowInsets androidWindowInsetsSystemInsets9 = companion.systemInsets(windowInsetsCompat, 64, "tappableElement");
        this.tappableElement = androidWindowInsetsSystemInsets9;
        ValueInsets ValueInsets = WindowInsets_androidKt.ValueInsets((windowInsetsCompat == null || (displayCutout2 = windowInsetsCompat.getDisplayCutout()) == null || (waterfallInsets = displayCutout2.getWaterfallInsets()) == null) ? Insets.NONE : waterfallInsets, "waterfall");
        this.waterfall = ValueInsets;
        this.cutoutPath$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((windowInsetsCompat == null || (displayCutout = windowInsetsCompat.getDisplayCutout()) == null || (cutoutPath = displayCutout.getCutoutPath()) == null) ? null : AndroidPath_androidKt.asComposePath(cutoutPath), null, 2, null);
        WindowInsets windowInsetsUnion = WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets7, androidWindowInsetsSystemInsets3), androidWindowInsetsSystemInsets2);
        this.safeDrawing = windowInsetsUnion;
        WindowInsets windowInsetsUnion2 = WindowInsetsKt.union(WindowInsetsKt.union(WindowInsetsKt.union(androidWindowInsetsSystemInsets9, androidWindowInsetsSystemInsets4), androidWindowInsetsSystemInsets8), ValueInsets);
        this.safeGestures = windowInsetsUnion2;
        this.safeContent = WindowInsetsKt.union(windowInsetsUnion, windowInsetsUnion2);
        this.captionBarIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 4, "captionBarIgnoringVisibility");
        this.navigationBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 2, "navigationBarsIgnoringVisibility");
        this.statusBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 1, "statusBarsIgnoringVisibility");
        this.systemBarsIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL, "systemBarsIgnoringVisibility");
        this.tappableElementIgnoringVisibility = companion.valueInsetsIgnoringVisibility(windowInsetsCompat, 64, "tappableElementIgnoringVisibility");
        this.imeAnimationTarget = WindowInsets_androidKt.ValueInsets(Insets.NONE, "imeAnimationTarget");
        this.imeAnimationSource = WindowInsets_androidKt.ValueInsets(Insets.NONE, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(com.waze.R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.consumes = bool != null ? bool.booleanValue() : false;
        this.insetsListener = new InsetsListener(this);
        WindowInsetsCompat rootWindowInsets = ViewCompat.getRootWindowInsets(view);
        if (rootWindowInsets != null) {
            androidWindowInsetsSystemInsets.setVisible(rootWindowInsets.isVisible(4));
            androidWindowInsetsSystemInsets2.setVisible(rootWindowInsets.isVisible(128));
            androidWindowInsetsSystemInsets3.setVisible(rootWindowInsets.isVisible(8));
            androidWindowInsetsSystemInsets4.setVisible(rootWindowInsets.isVisible(32));
            androidWindowInsetsSystemInsets5.setVisible(rootWindowInsets.isVisible(2));
            androidWindowInsetsSystemInsets6.setVisible(rootWindowInsets.isVisible(1));
            androidWindowInsetsSystemInsets7.setVisible(rootWindowInsets.isVisible(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL));
            androidWindowInsetsSystemInsets8.setVisible(rootWindowInsets.isVisible(16));
            androidWindowInsetsSystemInsets9.setVisible(rootWindowInsets.isVisible(64));
        }
    }

    private final void setCutoutPath(androidx.compose.ui.graphics.Path path) {
        this.cutoutPath$delegate.setValue(path);
    }

    public static /* synthetic */ void update$default(WindowInsetsHolder windowInsetsHolder, WindowInsetsCompat windowInsetsCompat, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        windowInsetsHolder.update(windowInsetsCompat, i2);
    }

    public final void decrementAccessors(View view) {
        int i2 = this.accessCount - 1;
        this.accessCount = i2;
        if (i2 == 0) {
            ViewCompat.setOnApplyWindowInsetsListener(view, null);
            ViewCompat.setWindowInsetsAnimationCallback(view, null);
            view.removeOnAttachStateChangeListener(this.insetsListener);
        }
    }

    public final AndroidWindowInsets getCaptionBar() {
        return this.captionBar;
    }

    public final ValueInsets getCaptionBarIgnoringVisibility() {
        return this.captionBarIgnoringVisibility;
    }

    public final boolean getConsumes() {
        return this.consumes;
    }

    public final androidx.compose.ui.graphics.Path getCutoutPath() {
        return (androidx.compose.ui.graphics.Path) this.cutoutPath$delegate.getValue();
    }

    public final AndroidWindowInsets getDisplayCutout() {
        return this.displayCutout;
    }

    public final AndroidWindowInsets getIme() {
        return this.ime;
    }

    public final ValueInsets getImeAnimationSource() {
        return this.imeAnimationSource;
    }

    public final ValueInsets getImeAnimationTarget() {
        return this.imeAnimationTarget;
    }

    public final AndroidWindowInsets getMandatorySystemGestures() {
        return this.mandatorySystemGestures;
    }

    public final AndroidWindowInsets getNavigationBars() {
        return this.navigationBars;
    }

    public final ValueInsets getNavigationBarsIgnoringVisibility() {
        return this.navigationBarsIgnoringVisibility;
    }

    public final WindowInsets getSafeContent() {
        return this.safeContent;
    }

    public final WindowInsets getSafeDrawing() {
        return this.safeDrawing;
    }

    public final WindowInsets getSafeGestures() {
        return this.safeGestures;
    }

    public final AndroidWindowInsets getStatusBars() {
        return this.statusBars;
    }

    public final ValueInsets getStatusBarsIgnoringVisibility() {
        return this.statusBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemBars() {
        return this.systemBars;
    }

    public final ValueInsets getSystemBarsIgnoringVisibility() {
        return this.systemBarsIgnoringVisibility;
    }

    public final AndroidWindowInsets getSystemGestures() {
        return this.systemGestures;
    }

    public final AndroidWindowInsets getTappableElement() {
        return this.tappableElement;
    }

    public final ValueInsets getTappableElementIgnoringVisibility() {
        return this.tappableElementIgnoringVisibility;
    }

    public final ValueInsets getWaterfall() {
        return this.waterfall;
    }

    public final void incrementAccessors(View view) {
        if (this.accessCount == 0) {
            this.insetsListener.resetState();
            ViewCompat.setOnApplyWindowInsetsListener(view, this.insetsListener);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.insetsListener);
            ViewCompat.setWindowInsetsAnimationCallback(view, this.insetsListener);
        }
        this.accessCount++;
    }

    public final void update(WindowInsetsCompat windowInsetsCompat, int i2) {
        Insets waterfallInsets;
        Path cutoutPath;
        if (testInsets) {
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets == null) {
                x.g();
            }
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        }
        this.captionBar.update$foundation_layout(windowInsetsCompat, i2);
        this.ime.update$foundation_layout(windowInsetsCompat, i2);
        this.displayCutout.update$foundation_layout(windowInsetsCompat, i2);
        this.navigationBars.update$foundation_layout(windowInsetsCompat, i2);
        this.statusBars.update$foundation_layout(windowInsetsCompat, i2);
        this.systemBars.update$foundation_layout(windowInsetsCompat, i2);
        this.systemGestures.update$foundation_layout(windowInsetsCompat, i2);
        this.tappableElement.update$foundation_layout(windowInsetsCompat, i2);
        this.mandatorySystemGestures.update$foundation_layout(windowInsetsCompat, i2);
        if (i2 == 0) {
            this.captionBarIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(4)));
            this.navigationBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(2)));
            this.statusBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(1)));
            this.systemBarsIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(DisplayStrings.DS_REPORT_MENU_V2_HEAVY_TRAFFIC_LABEL)));
            this.tappableElementIgnoringVisibility.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsetsIgnoringVisibility(64)));
            DisplayCutoutCompat displayCutout = windowInsetsCompat.getDisplayCutout();
            ValueInsets valueInsets = this.waterfall;
            if (displayCutout == null || (waterfallInsets = displayCutout.getWaterfallInsets()) == null) {
                waterfallInsets = Insets.NONE;
            }
            valueInsets.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(waterfallInsets));
            androidx.compose.ui.graphics.Path pathAsComposePath = null;
            if (displayCutout != null && (cutoutPath = displayCutout.getCutoutPath()) != null) {
                pathAsComposePath = AndroidPath_androidKt.asComposePath(cutoutPath);
            }
            setCutoutPath(pathAsComposePath);
        }
        Snapshot.Companion.sendApplyNotifications();
    }

    public final void updateImeAnimationSource(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationSource.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(8)));
    }

    public final void updateImeAnimationTarget(WindowInsetsCompat windowInsetsCompat) {
        this.imeAnimationTarget.setValue$foundation_layout(WindowInsets_androidKt.toInsetsValues(windowInsetsCompat.getInsets(8)));
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DisposableEffectResult current$lambda$0$0(final WindowInsetsHolder windowInsetsHolder, final View view, DisposableEffectScope disposableEffectScope) {
            windowInsetsHolder.incrementAccessors(view);
            return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$lambda$0$0$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                    windowInsetsHolder.decrementAccessors(view);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AndroidWindowInsets systemInsets(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            AndroidWindowInsets androidWindowInsets = new AndroidWindowInsets(i2, str);
            if (windowInsetsCompat != null) {
                androidWindowInsets.update$foundation_layout(windowInsetsCompat, i2);
            }
            return androidWindowInsets;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ValueInsets valueInsetsIgnoringVisibility(WindowInsetsCompat windowInsetsCompat, int i2, String str) {
            Insets insetsIgnoringVisibility;
            if (windowInsetsCompat == null || (insetsIgnoringVisibility = windowInsetsCompat.getInsetsIgnoringVisibility(i2)) == null) {
                insetsIgnoringVisibility = Insets.NONE;
            }
            return WindowInsets_androidKt.ValueInsets(insetsIgnoringVisibility, str);
        }

        public final WindowInsetsHolder current(Composer composer, int i2) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1366542614, i2, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:576)");
            }
            final View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            final WindowInsetsHolder orCreateFor = getOrCreateFor(view);
            boolean zChangedInstance = composer.changedInstance(orCreateFor) | composer.changedInstance(view);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new l() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return WindowInsetsHolder.Companion.current$lambda$0$0(orCreateFor, view, (DisposableEffectScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            EffectsKt.DisposableEffect(orCreateFor, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return orCreateFor;
        }

        public final WindowInsetsHolder getOrCreateFor(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.viewMap) {
                WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
                Object obj = weakHashMap.get(view);
                Object obj2 = obj;
                if (obj == null) {
                    WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                    weakHashMap.put(view, windowInsetsHolder2);
                    obj2 = windowInsetsHolder2;
                }
                windowInsetsHolder = (WindowInsetsHolder) obj2;
            }
            return windowInsetsHolder;
        }

        public final void setUseTestInsets(boolean z) {
            WindowInsetsHolder.testInsets = z;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getConsumes$annotations() {
    }

    public /* synthetic */ WindowInsetsHolder(WindowInsetsCompat windowInsetsCompat, View view, o oVar) {
        this(windowInsetsCompat, view);
    }
}
