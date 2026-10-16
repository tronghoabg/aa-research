package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSizeKt;
import h.a.i;
import h.ab;
import h.g.a.a;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SharedElement {
    public static final int $stable = 8;
    private boolean animationSpecFinalized;
    private final Object key;
    private final SharedTransitionScopeImpl scope;
    private final SharedTransitionStateMachine stateMachine = new SharedTransitionStateMachine(this);
    private final MutableState _allEntries$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(i.h(), null, 2, null);
    private final MutableState _enabledEntries$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(i.h(), null, 2, null);
    private final Animatable<Offset, AnimationVector2D> momentumAnimation = new Animatable<>(Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), VectorConvertersKt.getVectorConverter(Offset.Companion), null, null, 12, null);
    private final a<Offset> momentumAnimationOffset = new SharedElement$momentumAnimationOffset$1(this);
    private final a<ab> observingVisibilityChange = new SharedElement$observingVisibilityChange$1(this);

    public SharedElement(Object obj, SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    private final List<SharedElementEntry> get_allEntries() {
        return (List) this._allEntries$delegate.getValue();
    }

    private final List<SharedElementEntry> get_enabledEntries() {
        return (List) this._enabledEntries$delegate.getValue();
    }

    private final void set_allEntries(List<SharedElementEntry> list) {
        this._allEntries$delegate.setValue(list);
    }

    private final void set_enabledEntries(List<SharedElementEntry> list) {
        this._enabledEntries$delegate.setValue(list);
    }

    public final void addEntry(SharedElementEntry sharedElementEntry) {
        set_allEntries(i.ag(get_allEntries(), sharedElementEntry));
        updateMatch$animation();
    }

    public final List<SharedElementEntry> getAllEntries() {
        return get_allEntries();
    }

    public final boolean getBoundsTransformIsActive() {
        return getState$animation().getMatchIsOrHasBeenConfigured();
    }

    public final List<SharedElementEntry> getEnabledEntries() {
        return get_enabledEntries();
    }

    public final boolean getFoundMatch() {
        return getState$animation().getActiveMatchFound() || getState$animation().getMatchIsOrHasBeenConfigured() || this.stateMachine.getActiveMatchDeferred();
    }

    public final Object getKey() {
        return this.key;
    }

    public final a<Offset> getMomentumAnimationOffset() {
        return this.momentumAnimationOffset;
    }

    public final a<ab> getObservingVisibilityChange$animation() {
        return this.observingVisibilityChange;
    }

    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    public final SharedTransitionStateMachine.State getState$animation() {
        return this.stateMachine.getState();
    }

    public final void invalidateTargetBoundsProvider() {
        this.stateMachine.invalidateTargetBoundsProvider();
    }

    public final boolean isAnimating() {
        List<SharedElementEntry> enabledEntries = getEnabledEntries();
        int size = enabledEntries.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (enabledEntries.get(i2).getBoundsAnimation().isRunning()) {
                return true;
            }
        }
        return false;
    }

    public final void onLookaheadPlaced(Placeable.PlacementScope placementScope, SharedElementEntry sharedElementEntry) {
        LayoutCoordinates coordinates;
        this.stateMachine.processPendingRequest();
        if (x.n(getState$animation(), NoMatchFound.INSTANCE) || !sharedElementEntry.isEnabled()) {
            return;
        }
        SharedTransitionStateMachine.State state$animation = getState$animation();
        if (sharedElementEntry.getBoundsAnimation().getTarget() && state$animation.getActiveMatchFound() && (coordinates = placementScope.getCoordinates()) != null) {
            long jM11351toSizeozmzZPI = IntSizeKt.m11351toSizeozmzZPI(coordinates.mo9743getSizeYbymL2g());
            long jM9777localLookaheadPositionOfauaQtc$default = LookaheadScope.CC.m9777localLookaheadPositionOfauaQtc$default(sharedElementEntry.getSharedElement().scope, sharedElementEntry.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 6, null);
            SharedTransitionScopeImpl sharedTransitionScopeImpl = sharedElementEntry.getSharedElement().scope;
            this.stateMachine.m1829configureActiveMatchL7TYDSY(jM11351toSizeozmzZPI, jM9777localLookaheadPositionOfauaQtc$default, LayoutCoordinates.CC.m9763localPositionOfS_NoaFU$default(sharedElementEntry.getSharedElement().scope.getLookaheadRoot$animation(), coordinates, 0L, false, 2, null));
        }
    }

    public final void onSharedTransitionFinished() {
        if (getEnabledEntries().size() <= 1 || !SharedElementKt.hasVisibleContent(getEnabledEntries())) {
            this.stateMachine.resetState();
        }
    }

    public final void removeEntry(SharedElementEntry sharedElementEntry) {
        set_allEntries(i.ae(get_allEntries(), sharedElementEntry));
        set_enabledEntries(i.ae(get_enabledEntries(), sharedElementEntry));
        updateMatch$animation();
    }

    public final Rect tryInitializingCurrentBounds() {
        return this.stateMachine.tryInitializingCurrentBounds();
    }

    /* renamed from: updateExitVelocity-TH1AsA0$animation, reason: not valid java name */
    public final void m1807updateExitVelocityTH1AsA0$animation(long j2) {
        aj.z(this.scope.getCoroutineScope(), null, null, new SharedElement$updateExitVelocity$1(this, j2, null), 3);
    }

    public final void updateMatch$animation() {
        a<ab> testBlockToRun = this.scope.getTestBlockToRun();
        if (testBlockToRun != null) {
            testBlockToRun.invoke();
        }
        List<SharedElementEntry> list = get_allEntries();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            SharedElementEntry sharedElementEntry = list.get(i2);
            if (sharedElementEntry.isEnabled()) {
                arrayList.add(sharedElementEntry);
                if (sharedElementEntry.getBoundsAnimation().getTarget()) {
                    z = true;
                }
            }
        }
        set_enabledEntries(arrayList);
        this.stateMachine.checkForAndDeferStateUpdates(z);
    }
}
