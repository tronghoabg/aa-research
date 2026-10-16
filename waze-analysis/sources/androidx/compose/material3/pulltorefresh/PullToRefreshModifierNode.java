package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollNodeKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import h.g.b.o;
import h.k.n;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PullToRefreshModifierNode extends DelegatingNode implements NestedScrollConnection {
    public static final int $stable = 8;
    private final MutableFloatState distancePulled$delegate;
    private boolean enabled;
    private boolean isRefreshing;
    private DelegatableNode nestedScrollNode;
    private a<ab> onRefresh;
    private PullToRefreshState state;
    private float threshold;
    private final MutableFloatState verticalOffset$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToHidden(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1, reason: invalid class name and case insensitive filesystem */
    final class C03571 extends c {
        int label;
        /* synthetic */ Object result;

        C03571(e<? super C03571> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.animateToThreshold(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1, reason: invalid class name and case insensitive filesystem */
    final class C03581 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C03581(e<? super C03581> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PullToRefreshModifierNode.this.new C03581(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03581) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                PullToRefreshModifierNode pullToRefreshModifierNode = PullToRefreshModifierNode.this;
                PullToRefreshState state = pullToRefreshModifierNode.getState();
                float f2 = true != pullToRefreshModifierNode.isRefreshing() ? 0.0f : 1.0f;
                this.label = 1;
                if (state.snapTo(f2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1, reason: invalid class name and case insensitive filesystem */
    final class C03591 extends c {
        float F$0;
        int label;
        /* synthetic */ Object result;

        C03591(e<? super C03591> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PullToRefreshModifierNode.this.onRelease(0.0f, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1, reason: invalid class name and case insensitive filesystem */
    final class C03601 extends g implements p<af, e<? super ab>, Object> {
        int label;

        C03601(e<? super C03601> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PullToRefreshModifierNode.this.new C03601(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03601) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            if (r1.animateToHidden(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
        
            if (r1.animateToThreshold(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        
            return r0;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L19
                if (r1 == r3) goto L15
                if (r1 != r2) goto Ld
                goto L15
            Ld:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L15:
                e.b.c.b(r5)
                goto L3e
            L19:
                e.b.c.b(r5)
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r5 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                boolean r5 = r5.isRefreshing()
                androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode r1 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.this
                if (r5 != 0) goto L32
                r5 = r4
                h.c.e r5 = (h.c.e) r5
                r4.label = r3
                java.lang.Object r4 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToHidden(r1, r5)
                if (r4 != r0) goto L3e
                goto L3d
            L32:
                r5 = r4
                h.c.e r5 = (h.c.e) r5
                r4.label = r2
                java.lang.Object r4 = androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.access$animateToThreshold(r1, r5)
                if (r4 != r0) goto L3e
            L3d:
                return r0
            L3e:
                h.ab r4 = h.ab.f48028a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C03601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private PullToRefreshModifierNode(boolean z, a<ab> aVar, boolean z2, PullToRefreshState pullToRefreshState, float f2) {
        this.isRefreshing = z;
        this.onRefresh = aVar;
        this.enabled = z2;
        this.state = pullToRefreshState;
        this.threshold = f2;
        this.nestedScrollNode = NestedScrollNodeKt.nestedScrollModifierNode(this, null);
        this.verticalOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v2, types: [h.ab, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToHidden(h.c.e<? super h.ab> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToHidden$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L28
            goto L40
        L28:
            r6 = move-exception
            goto L49
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r6 = r5.state     // Catch: java.lang.Throwable -> L28
            r0.label = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r6 = r6.animateToHidden(r0)     // Catch: java.lang.Throwable -> L28
            if (r6 != r1) goto L40
            return r1
        L40:
            r5.setDistancePulled(r4)
            r5.setVerticalOffset(r4)
            h.ab r5 = h.ab.f48028a
            return r5
        L49:
            r5.setDistancePulled(r4)
            r5.setVerticalOffset(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToHidden(h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateToThreshold(h.c.e<? super h.ab> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C03571
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C03571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$animateToThreshold$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            e.b.c.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L58
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r5)
            androidx.compose.material3.pulltorefresh.PullToRefreshState r5 = r4.state     // Catch: java.lang.Throwable -> L27
            r0.label = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.animateToThreshold(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r4.isAttached()
            if (r5 == 0) goto L55
            int r5 = r4.getThresholdPx()
            float r5 = (float) r5
            r4.setDistancePulled(r5)
            int r5 = r4.getThresholdPx()
            float r5 = (float) r5
            r4.setVerticalOffset(r5)
        L55:
            h.ab r4 = h.ab.f48028a
            return r4
        L58:
            boolean r0 = r4.isAttached()
            if (r0 != 0) goto L5f
            goto L6f
        L5f:
            int r0 = r4.getThresholdPx()
            float r0 = (float) r0
            r4.setDistancePulled(r0)
            int r0 = r4.getThresholdPx()
            float r0 = (float) r0
            r4.setVerticalOffset(r0)
        L6f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.animateToThreshold(h.c.e):java.lang.Object");
    }

    private final float calculateVerticalOffset() {
        if (getAdjustedDistancePulled() <= getThresholdPx()) {
            return getAdjustedDistancePulled();
        }
        float fG = n.g(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThresholdPx() + (getThresholdPx() * (fG - (((float) Math.pow(fG, 2.0d)) / 4.0f)));
    }

    /* renamed from: consumeAvailableOffset-MK-Hz9U, reason: not valid java name */
    private final long m6427consumeAvailableOffsetMKHz9U(long j2) {
        float distancePulled;
        if (this.isRefreshing) {
            distancePulled = 0.0f;
        } else {
            float fE = n.e(getDistancePulled() + Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)), 0.0f);
            distancePulled = fE - getDistancePulled();
            setDistancePulled(fE);
            setVerticalOffset(calculateVerticalOffset());
        }
        return (Float.floatToRawIntBits(0.0f) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(distancePulled));
    }

    private final float getAdjustedDistancePulled() {
        return getDistancePulled() * 0.5f;
    }

    private final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    private final float getProgress() {
        return getAdjustedDistancePulled() / getThresholdPx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getThresholdPx() {
        return DelegatableNodeKt.requireDensity(this).mo2121roundToPx0680j_4(this.threshold);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getVerticalOffset() {
        return this.verticalOffset$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRelease(float r6, h.c.e<? super java.lang.Float> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C03591
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.C03591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onRelease$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            float r6 = r0.F$0
            e.b.c.b(r7)
            goto L6b
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r7)
            boolean r7 = r5.isRefreshing
            if (r7 == 0) goto L3f
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r4)
            return r5
        L3f:
            float r7 = r5.getAdjustedDistancePulled()
            int r2 = r5.getThresholdPx()
            float r2 = (float) r2
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L51
            h.g.a.a<h.ab> r7 = r5.onRefresh
            r7.invoke()
        L51:
            float r7 = r5.getDistancePulled()
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 != 0) goto L5b
        L59:
            r6 = r4
            goto L60
        L5b:
            int r7 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r7 >= 0) goto L60
            goto L59
        L60:
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.animateToHidden(r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5.setDistancePulled(r4)
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.onRelease(float, h.c.e):java.lang.Object");
    }

    private final void setDistancePulled(float f2) {
        this.distancePulled$delegate.setFloatValue(f2);
    }

    private final void setVerticalOffset(float f2) {
        this.verticalOffset$delegate.setFloatValue(f2);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final a<ab> getOnRefresh() {
        return this.onRefresh;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final PullToRefreshState getState() {
        return this.state;
    }

    /* renamed from: getThreshold-D9Ej5fM, reason: not valid java name */
    public final float m6428getThresholdD9Ej5fM() {
        return this.threshold;
    }

    public final boolean isRefreshing() {
        return this.isRefreshing;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        delegate(this.nestedScrollNode);
        aj.z(getCoroutineScope(), null, null, new C03581(null), 3);
        setVerticalOffset(this.isRefreshing ? getThresholdPx() : 0.0f);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e eVar) {
        return NestedScrollConnection.CC.m9451onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        if (this.state.isAnimating()) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (!this.enabled) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (!NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI())) {
            return Offset.Companion.m7996getZeroF1C5BW0();
        }
        long jM6427consumeAvailableOffsetMKHz9U = m6427consumeAvailableOffsetMKHz9U(j3);
        aj.z(getCoroutineScope(), null, null, new PullToRefreshModifierNode$onPostScroll$1(this, null), 3);
        return jM6427consumeAvailableOffsetMKHz9U;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2299onPreFlingQWom1Mo(long r5, h.c.e<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = (androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1 r0 = new androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            float r4 = r0.F$0
            e.b.c.b(r7)
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            e.b.c.b(r7)
            float r5 = androidx.compose.ui.unit.Velocity.m11407getYimpl(r5)
            r6 = 0
            r0.F$0 = r6
            r0.label = r3
            java.lang.Object r7 = r4.onRelease(r5, r0)
            if (r7 == r1) goto L53
            r4 = r6
        L44:
            java.lang.Number r7 = (java.lang.Number) r7
            float r5 = r7.floatValue()
            long r4 = androidx.compose.ui.unit.VelocityKt.Velocity(r4, r5)
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m11397boximpl(r4)
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        return this.state.isAnimating() ? Offset.Companion.m7996getZeroF1C5BW0() : !this.enabled ? Offset.Companion.m7996getZeroF1C5BW0() : (!NestedScrollSource.m9464equalsimpl0(i2, NestedScrollSource.Companion.m9476getUserInputWNlRxjI()) || Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2)) >= 0.0f) ? Offset.Companion.m7996getZeroF1C5BW0() : m6427consumeAvailableOffsetMKHz9U(j2);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setOnRefresh(a<ab> aVar) {
        this.onRefresh = aVar;
    }

    public final void setRefreshing(boolean z) {
        this.isRefreshing = z;
    }

    public final void setState(PullToRefreshState pullToRefreshState) {
        this.state = pullToRefreshState;
    }

    /* renamed from: setThreshold-0680j_4, reason: not valid java name */
    public final void m6429setThreshold0680j_4(float f2) {
        this.threshold = f2;
    }

    public final void update() {
        aj.z(getCoroutineScope(), null, null, new C03601(null), 3);
    }

    public /* synthetic */ PullToRefreshModifierNode(boolean z, a aVar, boolean z2, PullToRefreshState pullToRefreshState, float f2, o oVar) {
        this(z, aVar, z2, pullToRefreshState, f2);
    }
}
