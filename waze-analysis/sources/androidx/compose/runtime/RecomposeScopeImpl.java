package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterSet;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.tooling.IdentifiableRecomposeScope;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope, IdentifiableRecomposeScope {
    private Anchor anchor;
    private p<? super Composer, ? super Integer, ab> block;
    private int currentToken;
    private int flags;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    private final boolean checkDerivedStateChanged(DerivedState<?> derivedState, MutableScatterMap<DerivedState<?>, Object> mutableScatterMap) {
        x.d(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
        if (policy == null) {
            policy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return !policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final h.ab end$lambda$0$1(androidx.compose.runtime.RecomposeScopeImpl r18, int r19, androidx.collection.MutableObjectIntMap r20, androidx.compose.runtime.Composition r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            int r4 = r0.currentToken
            if (r4 != r1) goto L7a
            androidx.collection.MutableObjectIntMap<java.lang.Object> r4 = r0.trackedInstances
            boolean r4 = h.g.b.x.n(r2, r4)
            if (r4 == 0) goto L7a
            boolean r4 = r3 instanceof androidx.compose.runtime.CompositionImpl
            if (r4 == 0) goto L7a
            r4 = r2
            androidx.collection.ObjectIntMap r4 = (androidx.collection.ObjectIntMap) r4
            long[] r4 = r4.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7a
            r7 = 0
        L23:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L75
            int r10 = r7 - r5
            r11 = 0
        L36:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L73
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L6f
            int r12 = r7 << 3
            int r12 = r12 + r11
            java.lang.Object[] r14 = r2.keys
            r14 = r14[r12]
            int[] r15 = r2.values
            r15 = r15[r12]
            if (r15 == r1) goto L6f
            r15 = r3
            androidx.compose.runtime.CompositionImpl r15 = (androidx.compose.runtime.CompositionImpl) r15
            r15.removeObservation$runtime(r14, r0)
            boolean r6 = r14 instanceof androidx.compose.runtime.DerivedState
            if (r6 == 0) goto L6c
            r6 = r14
            androidx.compose.runtime.DerivedState r6 = (androidx.compose.runtime.DerivedState) r6
            r15.removeDerivedStateObservation$runtime(r6)
            androidx.collection.MutableScatterMap<androidx.compose.runtime.DerivedState<?>, java.lang.Object> r6 = r0.trackedDependencies
            if (r6 == 0) goto L6c
            r6.remove(r14)
        L6c:
            r2.removeValueAt(r12)
        L6f:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L36
        L73:
            if (r12 != r13) goto L7a
        L75:
            if (r7 == r5) goto L7a
            int r7 = r7 + 1
            goto L23
        L7a:
            h.ab r0 = h.ab.f48028a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.end$lambda$0$1(androidx.compose.runtime.RecomposeScopeImpl, int, androidx.collection.MutableObjectIntMap, androidx.compose.runtime.Composition):h.ab");
    }

    private final boolean getFlag(int i2) {
        return (this.flags & i2) != 0;
    }

    private final boolean getRereading() {
        return (this.flags & 32) != 0;
    }

    private final void setFlag(int i2, boolean z) {
        int i3 = this.flags;
        this.flags = z ? i2 | i3 : (~i2) & i3;
    }

    private final void setRereading(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 32 : i2 & (-33);
    }

    private final void setSkipped(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 16 : i2 & (-17);
    }

    public final void adoptedBy(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void compose(Composer composer) {
        p<? super Composer, ? super Integer, ab> pVar = this.block;
        if (pVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        pVar.invoke(composer, 1);
    }

    public final l<Composition, ab> end(final int i2) {
        final MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap != null && !getSkipped$runtime()) {
            MutableObjectIntMap<Object> mutableObjectIntMap2 = mutableObjectIntMap;
            Object[] objArr = mutableObjectIntMap2.keys;
            int[] iArr = mutableObjectIntMap2.values;
            long[] jArr = mutableObjectIntMap2.metadata;
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
                            if (i5 < i6) {
                                if ((j2 & 255) < 128) {
                                    int i7 = (i3 << 3) + i5;
                                    Object obj = objArr[i7];
                                    if (iArr[i7] != i2) {
                                        return new l() { // from class: androidx.compose.runtime.RecomposeScopeImpl$$ExternalSyntheticLambda0
                                            @Override // h.g.a.l
                                            public final Object invoke(Object obj2) {
                                                return RecomposeScopeImpl.end$lambda$0$1(this.f$0, i2, mutableObjectIntMap, (Composition) obj2);
                                            }
                                        };
                                    }
                                }
                                j2 >>= 8;
                                i5++;
                            } else if (i6 != 8) {
                                return null;
                            }
                        }
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                }
            }
        }
        return null;
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        return this.block != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.flags & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.flags & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.flags & 64) != 0;
    }

    @Override // androidx.compose.runtime.tooling.IdentifiableRecomposeScope
    public Object getIdentity() {
        return this.anchor;
    }

    public final RecomposeScopeOwner getOwner$runtime() {
        return this.owner;
    }

    public final boolean getPaused() {
        return (this.flags & 256) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.flags & 8) != 0;
    }

    public final boolean getResetReusing() {
        return (this.flags & 1024) != 0;
    }

    public final boolean getResuming() {
        return (this.flags & 512) != 0;
    }

    public final boolean getReusing() {
        return (this.flags & 128) != 0;
    }

    public final boolean getSkipped$runtime() {
        return (this.flags & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.flags & 1) != 0;
    }

    public final boolean getValid() {
        Anchor anchor;
        return (this.owner == null || (anchor = this.anchor) == null || !anchor.getValid()) ? false : true;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidationResultInvalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        return (recomposeScopeOwner == null || (invalidationResultInvalidate = recomposeScopeOwner.invalidate(this, obj)) == null) ? InvalidationResult.IGNORED : invalidationResultInvalidate;
    }

    public final boolean isConditional() {
        return this.trackedDependencies != null;
    }

    public final boolean isInvalidFor(Object obj) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (obj == null || (mutableScatterMap = this.trackedDependencies) == null) {
            return true;
        }
        if (obj instanceof DerivedState) {
            return checkDerivedStateChanged((DerivedState) obj, mutableScatterMap);
        }
        if (!(obj instanceof ScatterSet)) {
            return true;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.isNotEmpty()) {
            Object[] objArr = scatterSet.elements;
            long[] jArr = scatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                loop0: while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = i2 - length;
                        int i4 = 0;
                        while (true) {
                            int i5 = 8 - ((~i3) >>> 31);
                            if (i4 < i5) {
                                if ((255 & j2) < 128) {
                                    Object obj2 = objArr[(i2 << 3) + i4];
                                    if (!(obj2 instanceof DerivedState) || checkDerivedStateChanged((DerivedState) obj2, mutableScatterMap)) {
                                        break loop0;
                                    }
                                }
                                j2 >>= 8;
                                i4++;
                            } else if (i5 != 8) {
                                return false;
                            }
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
                return true;
            }
        }
        return false;
    }

    public final void recordDerivedStateValue(DerivedState<?> derivedState, Object obj) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
        if (mutableScatterMap == null) {
            mutableScatterMap = new MutableScatterMap<>(0, 1, null);
            this.trackedDependencies = mutableScatterMap;
        }
        mutableScatterMap.set(derivedState, obj);
    }

    public final boolean recordRead(Object obj) {
        int i2 = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        int i3 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(i2, i3, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        return mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rereadTrackedInstances() {
        /*
            r18 = this;
            r1 = r18
            androidx.compose.runtime.RecomposeScopeOwner r0 = r1.owner
            if (r0 == 0) goto L60
            androidx.collection.MutableObjectIntMap<java.lang.Object> r2 = r1.trackedInstances
            if (r2 == 0) goto L60
            r3 = 1
            r1.setRereading(r3)
            r3 = 0
            androidx.collection.ObjectIntMap r2 = (androidx.collection.ObjectIntMap) r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r4 = r2.keys     // Catch: java.lang.Throwable -> L5b
            int[] r5 = r2.values     // Catch: java.lang.Throwable -> L5b
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L5b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L5b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L57
            r7 = r3
        L1d:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L5b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L5b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r6
            r11 = r3
        L30:
            int r12 = ~r10     // Catch: java.lang.Throwable -> L5b
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L50
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L4c
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r4[r12]     // Catch: java.lang.Throwable -> L5b
            r12 = r5[r12]     // Catch: java.lang.Throwable -> L5b
            r0.recordReadOf(r14)     // Catch: java.lang.Throwable -> L5b
        L4c:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L30
        L50:
            if (r12 != r13) goto L57
        L52:
            if (r7 == r6) goto L57
            int r7 = r7 + 1
            goto L1d
        L57:
            r1.setRereading(r3)
            return
        L5b:
            r0 = move-exception
            r1.setRereading(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.RecomposeScopeImpl.rereadTrackedInstances():void");
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        setSkipped(true);
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 2 : i2 & (-3);
    }

    public final void setDefaultsInvalid(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 4 : i2 & (-5);
    }

    public final void setForcedRecompose(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 64 : i2 & (-65);
    }

    public final void setOwner$runtime(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void setPaused(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 256 : i2 & (-257);
    }

    public final void setRequiresRecompose(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 8 : i2 & (-9);
    }

    public final void setResetReusing(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 1024 : i2 & (-1025);
    }

    public final void setResuming(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 512 : i2 & (-513);
    }

    public final void setReusing(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 128 : i2 & (-129);
    }

    public final void setUsed(boolean z) {
        int i2 = this.flags;
        this.flags = z ? i2 | 1 : i2 & (-2);
    }

    public final void start(int i2) {
        this.currentToken = i2;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(p<? super Composer, ? super Integer, ab> pVar) {
        this.block = pVar;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime(SlotWriter slotWriter, List<GapAnchor> list, RecomposeScopeOwner recomposeScopeOwner) {
            List<GapAnchor> list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object objSlot = slotWriter.slot(list.get(i2), 0);
                RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime(SlotTable slotTable, List<GapAnchor> list) {
            List<GapAnchor> list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    GapAnchor gapAnchor = list.get(i2);
                    if (slotTable.ownsAnchor(gapAnchor) && (slotTable.slot$runtime(slotTable.anchorIndex(gapAnchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getIdentity$annotations() {
    }
}
