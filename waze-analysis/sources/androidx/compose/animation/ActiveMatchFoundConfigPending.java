package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionStateMachine;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Rect;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ActiveMatchFoundConfigPending extends SharedTransitionStateMachine.State {
    public static final int $stable = 8;
    private final MutableState currentBounds$delegate;
    private BoundsProvider targetBoundsProviderBeforeConfig;
    private final TargetData targetData;

    public ActiveMatchFoundConfigPending(BoundsProvider boundsProvider, TargetData targetData, Rect rect) {
        super(null);
        this.targetBoundsProviderBeforeConfig = boundsProvider;
        this.targetData = targetData;
        this.currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(rect, null, 2, null);
    }

    private void setCurrentBounds(Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059 A[PHI: r1
  0x0059: PHI (r1v1 androidx.compose.ui.geometry.Rect) = (r1v0 androidx.compose.ui.geometry.Rect), (r1v3 androidx.compose.ui.geometry.Rect) binds: [B:6:0x0018, B:22:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    /* renamed from: configureActiveMatch-38uP1EE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.animation.SharedTransitionStateMachine.State mo1699configureActiveMatch38uP1EE(androidx.compose.animation.SharedElement r11, androidx.compose.animation.BoundsProvider r12, long r13, long r15, long r17) {
        /*
            r10 = this;
            androidx.compose.animation.TargetData r0 = r10.getTargetData()
            if (r0 != 0) goto L14
            androidx.compose.animation.TargetData r1 = new androidx.compose.animation.TargetData
            long r4 = androidx.compose.ui.geometry.Offset.m7984minusMKHz9U(r15, r17)
            r8 = 0
            r2 = r13
            r6 = r17
            r1.<init>(r2, r4, r6, r8)
            r0 = r1
        L14:
            androidx.compose.ui.geometry.Rect r1 = r10.getCurrentBounds()
            if (r1 != 0) goto L59
            androidx.compose.animation.BoundsProvider r10 = r10.targetBoundsProviderBeforeConfig
            if (r10 != 0) goto L4d
            java.util.List r10 = r11.getAllEntries()
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r4 = 0
        L2a:
            r5 = 0
            if (r4 >= r1) goto L42
            java.lang.Object r6 = r10.get(r4)
            r7 = r6
            androidx.compose.animation.SharedElementEntry r7 = (androidx.compose.animation.SharedElementEntry) r7
            java.util.List r8 = r11.getEnabledEntries()
            boolean r7 = r8.contains(r7)
            if (r7 == 0) goto L3f
            goto L43
        L3f:
            int r4 = r4 + 1
            goto L2a
        L42:
            r6 = r5
        L43:
            androidx.compose.animation.SharedElementEntry r6 = (androidx.compose.animation.SharedElementEntry) r6
            if (r6 == 0) goto L4c
            androidx.compose.animation.BoundsProvider r10 = r6.getBoundsProvider()
            goto L4d
        L4c:
            r10 = r5
        L4d:
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.animation.SharedTransitionStateMachineKt.access$obtainBoundsFromLastTarget(r11, r10)
            if (r1 != 0) goto L59
            r5 = r15
            androidx.compose.ui.geometry.Rect r1 = androidx.compose.ui.geometry.RectKt.m8020Recttz77jQw(r5, r13)
            goto L5a
        L59:
            r5 = r15
        L5a:
            r9 = 1
            r3 = r13
            r7 = r17
            r2 = r0
            androidx.compose.animation.SharedTransitionStateMachineKt.m1830access$updateTargetDataBGTQxF0(r2, r3, r5, r7, r9)
            androidx.compose.animation.ActiveMatchConfigured r10 = new androidx.compose.animation.ActiveMatchConfigured
            r10.<init>(r2, r12, r1)
            androidx.compose.animation.SharedTransitionStateMachine$State r10 = (androidx.compose.animation.SharedTransitionStateMachine.State) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.ActiveMatchFoundConfigPending.mo1699configureActiveMatch38uP1EE(androidx.compose.animation.SharedElement, androidx.compose.animation.BoundsProvider, long, long, long):androidx.compose.animation.SharedTransitionStateMachine$State");
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public boolean getActiveMatchFound() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    public final BoundsProvider getTargetBoundsProviderBeforeConfig() {
        return this.targetBoundsProviderBeforeConfig;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public TargetData getTargetData() {
        return this.targetData;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public Rect initializeCurrentBounds(SharedElement sharedElement) {
        SharedElementEntry sharedElementEntry;
        Rect currentBounds = getCurrentBounds();
        if (currentBounds != null) {
            return currentBounds;
        }
        if (getCurrentBounds() == null) {
            BoundsProvider boundsProvider = this.targetBoundsProviderBeforeConfig;
            if (boundsProvider == null) {
                List<SharedElementEntry> allEntries = sharedElement.getAllEntries();
                int size = allEntries.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        sharedElementEntry = null;
                        break;
                    }
                    sharedElementEntry = allEntries.get(i2);
                    if (sharedElement.getEnabledEntries().contains(sharedElementEntry)) {
                        break;
                    }
                    i2++;
                }
                SharedElementEntry sharedElementEntry2 = sharedElementEntry;
                boundsProvider = sharedElementEntry2 != null ? sharedElementEntry2.getBoundsProvider() : null;
            }
            Rect rectObtainBoundsFromLastTarget = SharedTransitionStateMachineKt.obtainBoundsFromLastTarget(sharedElement, boundsProvider);
            if (rectObtainBoundsFromLastTarget != null) {
                setCurrentBounds(rectObtainBoundsFromLastTarget);
            }
        }
        return getCurrentBounds();
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onMatchFound(BoundsProvider boundsProvider) {
        if (this.targetBoundsProviderBeforeConfig == null) {
            this.targetBoundsProviderBeforeConfig = boundsProvider;
        }
        return this;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public SharedTransitionStateMachine.State onVisibleContentRemovedDuringTransition() {
        return NoMatchFound.INSTANCE;
    }

    public final void setTargetBoundsProviderBeforeConfig(BoundsProvider boundsProvider) {
        this.targetBoundsProviderBeforeConfig = boundsProvider;
    }

    @Override // androidx.compose.animation.SharedTransitionStateMachine.State
    public void updateBounds(Rect rect) {
        setCurrentBounds(rect);
    }

    public /* synthetic */ ActiveMatchFoundConfigPending(BoundsProvider boundsProvider, TargetData targetData, Rect rect, int i2, o oVar) {
        this(boundsProvider, (i2 & 2) != 0 ? null : targetData, (i2 & 4) != 0 ? null : rect);
    }
}
