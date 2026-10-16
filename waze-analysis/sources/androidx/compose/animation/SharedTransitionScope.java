package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import com.waze.strings.DisplayStrings;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    /* compiled from: WazeSource */
    public interface OverlayClip {
        Path getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    /* compiled from: WazeSource */
    public interface PlaceholderSize {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: WazeSource */
        public final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceholderSize AnimatedSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$AnimatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo1823calculateSizeJyjRU_E(long j2, long j3) {
                    return j3;
                }
            };
            private static final PlaceholderSize ContentSize = new PlaceholderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceholderSize$Companion$ContentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceholderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo1823calculateSizeJyjRU_E(long j2, long j3) {
                    return j2;
                }
            };

            private Companion() {
            }

            public final PlaceholderSize getAnimatedSize() {
                return AnimatedSize;
            }

            public final PlaceholderSize getContentSize() {
                return ContentSize;
            }
        }

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo1823calculateSizeJyjRU_E(long j2, long j3);
    }

    /* compiled from: WazeSource */
    public interface ResizeMode {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* compiled from: WazeSource */
        public final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public static /* synthetic */ ResizeMode scaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((i2 & 2) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.scaleToBounds(contentScale, alignment);
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }

            public final ResizeMode scaleToBounds(ContentScale contentScale, Alignment alignment) {
                return SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
            }
        }
    }

    /* compiled from: WazeSource */
    public interface SharedContentConfig {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.animation.SharedTransitionScope$SharedContentConfig$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA, reason: not valid java name */
            public static Rect m1824xea938c3d(SharedContentConfig sharedContentConfig, SharedContentState sharedContentState, Rect rect, long j2) {
                return null;
            }

            public static boolean $default$getShouldKeepEnabledForOngoingAnimation(SharedContentConfig sharedContentConfig) {
                return true;
            }

            public static boolean $default$isEnabled(SharedContentConfig sharedContentConfig, SharedContentState sharedContentState) {
                return true;
            }
        }

        /* renamed from: alternativeTargetBoundsInTransitionScopeAfterRemoval-cSwnlzA */
        Rect mo1746alternativeTargetBoundsInTransitionScopeAfterRemovalcSwnlzA(SharedContentState sharedContentState, Rect rect, long j2);

        boolean getShouldKeepEnabledForOngoingAnimation();

        boolean isEnabled(SharedContentState sharedContentState);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$renderInSharedTransitionScopeOverlay$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<Boolean> {
        AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$1, reason: invalid class name and case insensitive filesystem */
    final class C01981 extends y implements a<Boolean> {
        C01981() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements l<IntSize, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Boolean invoke(IntSize intSize) {
            return m1826invokeozmzZPI(intSize.m11343unboximpl());
        }

        /* renamed from: invoke-ozmzZPI, reason: not valid java name */
        public final Boolean m1826invokeozmzZPI(long j2) {
            return false;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$3, reason: invalid class name */
    final class AnonymousClass3 extends y implements p<Placeable.PlacementScope, LayoutCoordinates, Boolean> {
        final /* synthetic */ a<Boolean> $enabled;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(a<Boolean> aVar) {
            super(2);
            this.$enabled = aVar;
        }

        @Override // h.g.a.p
        public final Boolean invoke(Placeable.PlacementScope placementScope, LayoutCoordinates layoutCoordinates) {
            return this.$enabled.invoke();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$skipToLookaheadPosition$4, reason: invalid class name */
    final class AnonymousClass4 extends y implements q<ApproachMeasureScope, Measurable, Constraints, MeasureResult> {
        final /* synthetic */ a<Boolean> $enabled;
        final /* synthetic */ SharedTransitionScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(a<Boolean> aVar, SharedTransitionScope sharedTransitionScope) {
            super(3);
            this.$enabled = aVar;
            this.this$0 = sharedTransitionScope;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ MeasureResult invoke(ApproachMeasureScope approachMeasureScope, Measurable measurable, Constraints constraints) {
            return m1827invoke3p2s80s(approachMeasureScope, measurable, constraints.m11113unboximpl());
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final MeasureResult m1827invoke3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(j2);
            return MeasureScope.CC.layout$default(approachMeasureScope, placeableMo9741measureBRTryo0.getWidth(), placeableMo9741measureBRTryo0.getHeight(), null, new SharedTransitionScope$skipToLookaheadPosition$4$1$1(this.$enabled, placeableMo9741measureBRTryo0, this.this$0), 4, null);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$skipToLookaheadSize$1, reason: invalid class name and case insensitive filesystem */
    final class C01991 extends y implements a<Boolean> {
        C01991() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h.g.a.a
        public final Boolean invoke() {
            return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
        }
    }

    OverlayClip OverlayClip(Shape shape);

    SharedContentConfig SharedContentConfig();

    boolean isTransitionActive();

    SharedContentState rememberSharedContentState(Object obj, SharedContentConfig sharedContentConfig, Composer composer, int i2);

    SharedContentState rememberSharedContentState(Object obj, Composer composer, int i2);

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, float f2, a<Boolean> aVar);

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, boolean z, float f2, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z, float f2, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z2, float f2, OverlayClip overlayClip);

    Modifier skipToLookaheadPosition(Modifier modifier, a<Boolean> aVar);

    Modifier skipToLookaheadSize(Modifier modifier, a<Boolean> aVar);

    /* compiled from: WazeSource */
    public final class SharedContentState {
        public static final int $stable = 8;
        private final MutableState config$delegate;
        private final MutableState internalState$delegate;
        private final Object key;

        public SharedContentState(Object obj, SharedContentConfig sharedContentConfig) {
            this.key = obj;
            this.config$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(sharedContentConfig, null, 2, null);
            this.internalState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        }

        private final SharedElementEntry getNonNullInternalState() {
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation != null) {
                return internalState$animation;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not been initialized.");
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation();
        }

        public final SharedContentConfig getConfig$animation() {
            return (SharedContentConfig) this.config$delegate.getValue();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SharedElementEntry getInternalState$animation() {
            return (SharedElementEntry) this.internalState$delegate.getValue();
        }

        public final Object getKey() {
            return this.key;
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementEntry parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final boolean isAnimating$animation() {
            BoundsAnimation boundsAnimation;
            SharedElementEntry internalState$animation = getInternalState$animation();
            State<Rect> animationState = null;
            if (internalState$animation != null && (boundsAnimation = internalState$animation.getBoundsAnimation()) != null) {
                animationState = boundsAnimation.getAnimationState();
            }
            return animationState != null;
        }

        public final boolean isEnabledByUser$animation() {
            SharedContentConfig config$animation = getConfig$animation();
            if (config$animation.isEnabled(this)) {
                return true;
            }
            return isAnimating$animation() && config$animation.getShouldKeepEnabledForOngoingAnimation();
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementEntry internalState$animation = getInternalState$animation();
            if (internalState$animation == null || (sharedElement = internalState$animation.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        /* renamed from: prepareTransitionWithInitialVelocity-TH1AsA0, reason: not valid java name */
        public final void m1825prepareTransitionWithInitialVelocityTH1AsA0(long j2) {
            SharedElementEntry nonNullInternalState = getNonNullInternalState();
            if (getConfig$animation().isEnabled(this)) {
                nonNullInternalState.getSharedElement().m1807updateExitVelocityTH1AsA0$animation(j2);
            }
        }

        public final void setConfig$animation(SharedContentConfig sharedContentConfig) {
            this.config$delegate.setValue(sharedContentConfig);
        }

        public final void setInternalState$animation(SharedElementEntry sharedElementEntry) {
            this.internalState$delegate.setValue(sharedElementEntry);
        }

        public /* synthetic */ SharedContentState(Object obj, SharedTransitionDefaults.SharedContentConfig sharedContentConfig, int i2, o oVar) {
            this(obj, (i2 & 2) != 0 ? SharedTransitionDefaults.SharedContentConfig.INSTANCE : sharedContentConfig);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.animation.SharedTransitionScope$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static SharedContentState $default$rememberSharedContentState(SharedTransitionScope sharedTransitionScope, Object obj, SharedContentConfig sharedContentConfig, Composer composer, int i2) {
            composer.startReplaceGroup(-148945892);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148945892, i2, -1, "androidx.compose.animation.SharedTransitionScope.rememberSharedContentState (SharedTransitionScope.kt:851)");
            }
            boolean zChanged = composer.changed(obj);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new SharedContentState(obj, sharedContentConfig);
                composer.updateRememberedValue(objRememberedValue);
            }
            SharedContentState sharedContentState = (SharedContentState) objRememberedValue;
            sharedContentState.setConfig$animation(sharedContentConfig);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return sharedContentState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, float f2, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
            }
            if (1 == (i2 & 1)) {
                f2 = 0.0f;
            }
            if ((i2 & 2) != 0) {
                aVar = sharedTransitionScope.new AnonymousClass1();
            }
            return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, f2, aVar);
        }

        public static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceholderSize placeholderSize, boolean z, float f2, OverlayClip overlayClip, int i2, Object obj) {
            if (obj == null) {
                return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, (i2 & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition, (i2 & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition, (i2 & 16) != 0 ? SharedTransitionDefaults.INSTANCE.getBoundsTransform() : boundsTransform, (i2 & 32) != 0 ? ResizeMode.Companion.scaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter()) : resizeMode, (i2 & 64) != 0 ? PlaceholderSize.Companion.getContentSize() : placeholderSize, (!((i2 & 128) == 0)) | z, (i2 & 256) != 0 ? 0.0f : f2, (i2 & 512) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
        }

        public static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z, float f2, OverlayClip overlayClip, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
            }
            if ((i2 & 4) != 0) {
                boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
            }
            BoundsTransform boundsTransform2 = boundsTransform;
            if ((i2 & 8) != 0) {
                placeholderSize = PlaceholderSize.Companion.getContentSize();
            }
            return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform2, placeholderSize, (!((i2 & 16) == 0)) | z, (i2 & 32) != 0 ? 0.0f : f2, (i2 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }

        public static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z, BoundsTransform boundsTransform, PlaceholderSize placeholderSize, boolean z2, float f2, OverlayClip overlayClip, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
            }
            if ((i2 & 4) != 0) {
                boundsTransform = SharedTransitionDefaults.INSTANCE.getBoundsTransform();
            }
            BoundsTransform boundsTransform2 = boundsTransform;
            if ((i2 & 8) != 0) {
                placeholderSize = PlaceholderSize.Companion.getContentSize();
            }
            return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z, boundsTransform2, placeholderSize, (!((i2 & 16) == 0)) | z2, (i2 & 32) != 0 ? 0.0f : f2, (i2 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier skipToLookaheadPosition$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: skipToLookaheadPosition");
            }
            if ((i2 & 1) != 0) {
                aVar = sharedTransitionScope.new C01981();
            }
            return sharedTransitionScope.skipToLookaheadPosition(modifier, aVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Modifier skipToLookaheadSize$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: skipToLookaheadSize");
            }
            if ((i2 & 1) != 0) {
                aVar = sharedTransitionScope.new C01991();
            }
            return sharedTransitionScope.skipToLookaheadSize(modifier, aVar);
        }

        public static SharedContentState $default$rememberSharedContentState(SharedTransitionScope sharedTransitionScope, Object obj, Composer composer, int i2) {
            composer.startReplaceGroup(800730162);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(800730162, i2, -1, "androidx.compose.animation.SharedTransitionScope.rememberSharedContentState (SharedTransitionScope.kt:829)");
            }
            int i3 = i2 & 14;
            SharedContentState sharedContentStateRememberSharedContentState = sharedTransitionScope.rememberSharedContentState(obj, SharedTransitionDefaults.SharedContentConfig.INSTANCE, composer, ((i2 << 3) & DisplayStrings.DS_TAP_TO_VERIFY) | i3 | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return sharedContentStateRememberSharedContentState;
        }
    }
}
