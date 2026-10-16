package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import androidx.compose.runtime.tooling.CompositionInstance;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.CompositionDataTreeKt;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceContext;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.tooling.preview.PreviewWrapperProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.u;
import h.g.b.x;
import h.l.f;
import h.n.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private Composition composition;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private a<ab> onDraw;
    private p<? super Composer, ? super Integer, ab> previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private List<ViewInfo> viewInfos;

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet) throws NumberFormatException {
        super(context, attributeSet);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = i.h();
        this.designInfoList = i.h();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new a() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m8282toArgb8_81llA(Color.Companion.m8262getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                return this.this$0.FakeSavedStateRegistryOwner.getLifecycleRegistry();
            }

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i2, ActivityResultContract<I, O> activityResultContract, I i3, ActivityOptionsCompat activityOptionsCompat) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    private final void InvokeComposableViaReflection(final String str, final String str2, final Class<? extends PreviewParameterProvider<?>> cls, final int i2, final long j2, Composer composer, final int i3) {
        int i4;
        String str3;
        Class<? extends PreviewParameterProvider<?>> cls2;
        int i5;
        int i6 = i3 & 6;
        final Composer composerStartRestartGroup = composer.startRestartGroup(-1149447747);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str3 = str2;
            i4 |= true != composerStartRestartGroup.changed(str3) ? 16 : 32;
        } else {
            str3 = str2;
        }
        if ((i3 & 384) == 0) {
            cls2 = cls;
            i4 |= true != composerStartRestartGroup.changedInstance(cls2) ? 128 : 256;
        } else {
            cls2 = cls;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 = i2;
            i4 |= true != composerStartRestartGroup.changed(i5) ? 1024 : 2048;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(j2) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(this) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1149447747, i4, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.InvokeComposableViaReflection (ComposeViewAdapter.android.kt:436)");
            }
            final String str4 = str3;
            final Class<? extends PreviewParameterProvider<?>> cls3 = cls2;
            final int i7 = i5;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(237179144, true, new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.InvokeComposableViaReflection$lambda$0(str, str4, composerStartRestartGroup, cls3, i7, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54);
            if (j2 >= 0) {
                composerStartRestartGroup.startReplaceGroup(577938792);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                ComposeViewAdapter$InvokeComposableViaReflection$1$1 composeViewAdapter$InvokeComposableViaReflection$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || composeViewAdapter$InvokeComposableViaReflection$1$1RememberedValue == Composer.Companion.getEmpty()) {
                    composeViewAdapter$InvokeComposableViaReflection$1$1RememberedValue = new ComposeViewAdapter$InvokeComposableViaReflection$1$1(this);
                    composerStartRestartGroup.updateRememberedValue(composeViewAdapter$InvokeComposableViaReflection$1$1RememberedValue);
                }
                a aVar = (a) ((f) composeViewAdapter$InvokeComposableViaReflection$1$1RememberedValue);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new a() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda4
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return ComposeViewAdapter.InvokeComposableViaReflection$lambda$2$0(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                setClock$ui_tooling(new PreviewAnimationClock(aVar, (a) objRememberedValue));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(578981477);
                composerStartRestartGroup.endReplaceGroup();
            }
            composableLambdaRememberComposableLambda.invoke(composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.InvokeComposableViaReflection$lambda$3(this.f$0, str, str2, cls, i2, j2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab InvokeComposableViaReflection$lambda$0(String str, String str2, Composer composer, Class cls, int i2, ComposeViewAdapter composeViewAdapter, Composer composer2, int i3) {
        Throwable cause;
        if (composer2.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(237179144, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.InvokeComposableViaReflection.<anonymous> (ComposeViewAdapter.android.kt:443)");
            }
            try {
                ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(cls, i2);
                composableInvoker.invokeComposable(str, str2, composer, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                Throwable th2 = th;
                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                    th2 = cause;
                }
                composeViewAdapter.delayedException.set(th2);
                throw th;
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab InvokeComposableViaReflection$lambda$2$0(ComposeViewAdapter composeViewAdapter) {
        View childAt = composeViewAdapter.getChildAt(0);
        x.d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
        ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
        if (viewRootForTest != null) {
            viewRootForTest.invalidateDescendants();
        }
        Snapshot.Companion.sendApplyNotifications();
        return ab.f48028a;
    }

    static final ab InvokeComposableViaReflection$lambda$3(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i2, long j2, int i3, Composer composer, int i4) {
        composeViewAdapter.InvokeComposableViaReflection(str, str2, cls, i2, j2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    private final void WrapPreview(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-265259911);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-265259911, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:411)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.rememberComposableLambda(-874838087, true, new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda10
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.WrapPreview$lambda$0(this.f$0, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda11
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.WrapPreview$lambda$1(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab WrapPreview$lambda$0(ComposeViewAdapter composeViewAdapter, p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-874838087, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:422)");
            }
            InspectableKt.Inspectable(composeViewAdapter.slotTableRecord, pVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab WrapPreview$lambda$1(ComposeViewAdapter composeViewAdapter, p pVar, int i2, Composer composer, int i3) {
        composeViewAdapter.WrapPreview(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private final void findAndTrackAnimations() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(i.q(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        PreviewAnimationClock previewAnimationClock = this.clock;
        AnimationSearch animationSearch = new AnimationSearch(new h.g.b.ab(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter.findAndTrackAnimations.1
            @Override // h.g.b.ab, h.l.n
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling();
            }

            @Override // h.g.b.ab
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling((PreviewAnimationClock) obj);
            }
        });
        ArrayList arrayList2 = arrayList;
        boolean zSearchAny = animationSearch.searchAny(arrayList2);
        this.hasAnimations = zSearchAny;
        if (previewAnimationClock == null || !zSearchAny) {
            return;
        }
        animationSearch.attachAllAnimations(arrayList2);
    }

    private final void findDesignInfoProviders() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(i.q(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> listFindAll = PreviewUtils_androidKt.findAll((Group) it2.next(), new l() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComposeViewAdapter.findDesignInfoProviders$lambda$1$0(this.f$0, (Group) obj));
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (Group group : listFindAll) {
                String designInfoOrNull = getDesignInfoOrNull(group, group.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it3.next(), group.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            i.aD(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findDesignInfoProviders$lambda$1$0(ComposeViewAdapter composeViewAdapter, Group group) {
        if (!x.n(group.getName(), "remember") && composeViewAdapter.hasDesignInfo(group)) {
            return true;
        }
        Collection<Group> children = group.getChildren();
        if ((children instanceof Collection) && children.isEmpty()) {
            return false;
        }
        for (Group group2 : children) {
            if (x.n(group2.getName(), "remember") && composeViewAdapter.hasDesignInfo(group2)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void getClock$ui_tooling$annotations() {
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Class<?> cls2 = Integer.TYPE;
            return cls.getDeclaredMethod("getDesignInfo", cls2, cls2, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strInvokeGetDesignInfo;
        Iterator<T> it = group.getData().iterator();
        do {
            strInvokeGetDesignInfo = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                strInvokeGetDesignInfo = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
            }
        } while (strInvokeGetDesignInfo == null);
        return strInvokeGetDesignInfo;
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean hasDesignInfo(Group group) {
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return getFileName(group).length() == 0 && getLineNumber(group) == -1;
    }

    private final void init(AttributeSet attributeSet) throws NumberFormatException {
        long j2;
        ComposeViewAdapter composeViewAdapter = this;
        ViewTreeLifecycleOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeViewModelStoreOwner.set(composeViewAdapter, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String strAj = o.aj(attributeValue);
        String strC = o.C(attributeValue, '.', attributeValue);
        String attributeValue2 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "previewWrapperProviderClass");
        Class<? extends PreviewWrapperProvider> clsAsPreviewWrapperProviderClass = attributeValue2 != null ? PreviewUtils_androidKt.asPreviewWrapperProviderClass(attributeValue2) : null;
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue3 = attributeSet.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PreviewParameterProvider<?>> clsAsPreviewProviderClass = attributeValue3 != null ? PreviewUtils_androidKt.asPreviewProviderClass(attributeValue3) : null;
        try {
            j2 = Long.parseLong(attributeSet.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j2 = -1;
        }
        init$ui_tooling$default(this, strAj, strC, clsAsPreviewWrapperProviderClass, clsAsPreviewProviderClass, attributeIntValue, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j2, attributeSet.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attributeSet.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, null);
    }

    static final ab init$lambda$2(a aVar, final ComposeViewAdapter composeViewAdapter, final Class cls, final String str, final String str2, final Class cls2, final int i2, final long j2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1214370042, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:529)");
            }
            EffectsKt.SideEffect(aVar, composer, 0);
            composeViewAdapter.WrapPreview(ComposableLambdaKt.rememberComposableLambda(-322523079, true, new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.init$lambda$2$0(cls, composeViewAdapter, str, str2, cls2, i2, j2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab init$lambda$2$0(Class cls, final ComposeViewAdapter composeViewAdapter, final String str, final String str2, final Class cls2, final int i2, final long j2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322523079, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:537)");
            }
            PreviewUtils_androidKt.instantiatePreviewWrapperProvider(cls).Wrap(ComposableLambdaKt.rememberComposableLambda(189383298, true, new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.init$lambda$2$0$0(this.f$0, str, str2, cls2, i2, j2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab init$lambda$2$0$0(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i2, long j2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(189383298, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:540)");
            }
            composeViewAdapter.InvokeComposableViaReflection(str, str2, cls, i2, j2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public static /* synthetic */ void init$ui_tooling$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, Class cls2, int i2, boolean z, boolean z2, long j2, boolean z3, String str3, a aVar, a aVar2, int i3, Object obj) {
        a aVar3 = (i3 & 1024) != 0 ? new a() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        } : aVar;
        a aVar4 = (i3 & 2048) != 0 ? new a() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda8
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        } : aVar2;
        int i4 = i3 & 512;
        int i5 = i3 & 128;
        int i6 = i3 & 64;
        int i7 = i3 & 32;
        int i8 = i3 & 16;
        int i9 = i3 & 8;
        int i10 = i3 & 4;
        boolean z4 = (i3 & 256) == 0;
        boolean z5 = i6 == 0;
        boolean z6 = i7 == 0;
        String str4 = i4 != 0 ? null : str3;
        boolean z7 = z4 & z3;
        long j3 = i5 != 0 ? -1L : j2;
        boolean z8 = z5 & z2;
        boolean z9 = z6 & z;
        int i11 = i8 == 0 ? i2 : 0;
        composeViewAdapter.init$ui_tooling(str, str2, i10 == 0 ? cls : null, i9 != 0 ? null : cls2, i11, z9, z8, j3, z7, str4, aVar3, aVar4);
    }

    private final String invokeGetDesignInfo(Object obj, int i2, int i3) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull != null) {
            try {
                Object objInvoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i2), Integer.valueOf(i3), this.designInfoProvidersArgument);
                x.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
                String str = (String) objInvoke;
                if (str.length() == 0) {
                    str = null;
                }
                return str;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final boolean isNullGroup(Group group) {
        if (!hasNullSourcePosition(group) || !group.getChildren().isEmpty()) {
            return false;
        }
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        return (node instanceof LayoutInfo ? (LayoutInfo) node : null) == null;
    }

    private final void processViewInfos() {
        List<ViewInfo> listMakeTree$default = CompositionDataTreeKt.makeTree$default(this.slotTableRecord.getStore(), new l() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ab.f48028a;
            }
        }, new AnonymousClass2(this), new q() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda2
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return (ViewInfo) obj2;
            }
        }, null, 8, null);
        this.viewInfos = listMakeTree$default;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtil_androidKt.toDebugString$default(listMakeTree$default, 0, null, 3, null));
        }
    }

    static final ViewInfo processViewInfos$lambda$1(CompositionInstance compositionInstance, ViewInfo viewInfo, List list) {
        return viewInfo;
    }

    private final ViewInfo toViewInfo(Group group) {
        String sourceFile;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) i.W(group.getChildren()));
        }
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toViewInfo((Group) it.next()));
        }
        ArrayList arrayList4 = arrayList3;
        SourceLocation location = group.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            sourceFile = "";
        }
        String str = sourceFile;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList4, layoutInfo, group.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewInfo toViewInfoFactory(CompositionGroup compositionGroup, SourceContext sourceContext, List<ViewInfo> list, List<ViewInfo> list2) {
        String sourceFile;
        if (list2 != null) {
            list = i.af(list, list2);
        }
        List<ViewInfo> list3 = list;
        SourceLocation location = sourceContext.getLocation();
        if (location == null || (sourceFile = location.getSourceFile()) == null) {
            sourceFile = "";
        }
        String str = sourceFile;
        SourceLocation location2 = sourceContext.getLocation();
        int lineNumber = location2 != null ? location2.getLineNumber() : -1;
        IntRect bounds = sourceContext.getBounds();
        SourceLocation location3 = sourceContext.getLocation();
        Object node = compositionGroup.getNode();
        return new ViewInfo(str, lineNumber, bounds, location3, list3, node instanceof LayoutInfo ? (LayoutInfo) node : null, sourceContext.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                i.aD(arrayList, i.af(i.d(viewInfo), viewInfo.allChildren()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    public final void dispose$ui_tooling() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling().dispose();
        }
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().clear();
    }

    public final PreviewAnimationClock getClock$ui_tooling() {
        return this.clock;
    }

    public final boolean getClockInitialized$ui_tooling() {
        return this.clock != null;
    }

    public final List<String> getDesignInfoList$ui_tooling() {
        return this.designInfoList;
    }

    public final List<ViewInfo> getViewInfos$ui_tooling() {
        return this.viewInfos;
    }

    public final boolean hasAnimations() {
        return this.hasAnimations;
    }

    public final void init$ui_tooling(final String str, final String str2, final Class<? extends PreviewWrapperProvider> cls, final Class<? extends PreviewParameterProvider<?>> cls2, final int i2, boolean z, boolean z2, final long j2, boolean z3, String str3, final a<ab> aVar, a<ab> aVar2) {
        this.debugPaintBounds = z;
        this.debugViewInfos = z2;
        this.composableName = str2;
        this.lookForDesignInfoProviders = z3;
        if (str3 == null) {
            str3 = "";
        }
        this.designInfoProvidersArgument = str3;
        this.onDraw = aVar2;
        ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-1214370042, true, new p() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda13
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return ComposeViewAdapter.init$lambda$2(aVar, this, cls, str, str2, cls2, i2, j2, (Composer) obj, ((Integer) obj2).intValue());
            }
        });
        this.previewComposition = composableLambdaComposableLambdaInstance;
        this.composeView.setContent(composableLambdaComposableLambdaInstance);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        super.onLayout(z, i2, i3, i4, i5);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    public final void setClock$ui_tooling(PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    public final void setDesignInfoList$ui_tooling(List<String> list) {
        this.designInfoList = list;
    }

    public final void setViewInfos$ui_tooling(List<ViewInfo> list) {
        this.viewInfos = list;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.tooling.ComposeViewAdapter$processViewInfos$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends u implements r<CompositionGroup, SourceContext, List<? extends ViewInfo>, List<? extends ViewInfo>, ViewInfo> {
        AnonymousClass2(Object obj) {
            super(4, obj, ComposeViewAdapter.class, "toViewInfoFactory", "toViewInfoFactory(Landroidx/compose/runtime/tooling/CompositionGroup;Landroidx/compose/ui/tooling/data/SourceContext;Ljava/util/List;Ljava/util/List;)Landroidx/compose/ui/tooling/ViewInfo;", 0);
        }

        @Override // h.g.a.r
        public /* bridge */ /* synthetic */ ViewInfo invoke(CompositionGroup compositionGroup, SourceContext sourceContext, List<? extends ViewInfo> list, List<? extends ViewInfo> list2) {
            return invoke2(compositionGroup, sourceContext, (List<ViewInfo>) list, (List<ViewInfo>) list2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ViewInfo invoke2(CompositionGroup compositionGroup, SourceContext sourceContext, List<ViewInfo> list, List<ViewInfo> list2) {
            return ((ComposeViewAdapter) this.receiver).toViewInfoFactory(compositionGroup, sourceContext, list, list2);
        }
    }

    /* JADX WARN: Type inference failed for: r7v11, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i2) throws NumberFormatException {
        super(context, attributeSet, i2);
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = i.h();
        this.designInfoList = i.h();
        this.slotTableRecord = CompositionDataRecord.Companion.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.getLambda$2086912010$ui_tooling();
        this.designInfoProvidersArgument = "";
        this.onDraw = new a() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m8282toArgb8_81llA(Color.Companion.m8262getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.lifecycle.LifecycleOwner
            public LifecycleRegistry getLifecycle() {
                return this.this$0.FakeSavedStateRegistryOwner.getLifecycleRegistry();
            }

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int i22, ActivityResultContract<I, O> activityResultContract, I i3, ActivityOptionsCompat activityOptionsCompat) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }
}
