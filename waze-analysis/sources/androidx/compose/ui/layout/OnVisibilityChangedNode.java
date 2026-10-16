package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.UnplacedAwareModifierNode;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.g.b.y;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OnVisibilityChangedNode extends Modifier.Node implements ObserverModifierNode, UnplacedAwareModifierNode {
    public static final int $stable = 8;
    private l<? super Boolean, ab> callback;
    private DelegatableNode.RegistrationHandle handle;
    private br job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastReportedResult;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final l<RelativeLayoutBounds, ab> rectChanged = new OnVisibilityChangedNode$rectChanged$1(this);
    private LayoutBoundsHolder viewportBounds;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.OnVisibilityChangedNode$checkVisibility$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return OnVisibilityChangedNode.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (aj.q(OnVisibilityChangedNode.this.getMinDurationMs(), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            OnVisibilityChangedNode.this.triggerCallback();
            return ab.f48028a;
        }
    }

    public OnVisibilityChangedNode(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, l<? super Boolean, ab> lVar) {
        this.minDurationMs = j2;
        this.minFractionVisible = f2;
        this.callback = lVar;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final void checkVisibility(float f2, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fFractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = true;
            if (fFractionVisibleIn <= f2 && fFractionVisibleIn != 1.0f) {
                z = false;
            }
            if (z != this.lastResult) {
                this.lastResult = z;
                br brVar = this.job;
                if (brVar != null) {
                    brVar.s(null);
                }
                this.job = null;
                if (z != this.lastReportedResult) {
                    if (!z || this.minDurationMs <= 0) {
                        triggerCallback();
                    } else {
                        this.job = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
                    }
                }
            }
        }
    }

    public final void fireExitIfNeeded() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.job = null;
        this.lastResult = false;
        if (this.lastReportedResult) {
            triggerCallback();
        }
    }

    public final void forceUpdate() {
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    public final l<Boolean, ab> getCallback() {
        return this.callback;
    }

    public final DelegatableNode.RegistrationHandle getHandle() {
        return this.handle;
    }

    public final br getJob() {
        return this.job;
    }

    public final RelativeLayoutBounds getLastBounds() {
        return this.lastBounds;
    }

    public final boolean getLastReportedResult() {
        return this.lastReportedResult;
    }

    public final boolean getLastResult() {
        return this.lastResult;
    }

    public final RelativeLayoutBounds getLastViewport() {
        return this.lastViewport;
    }

    public final long getMinDurationMs() {
        return this.minDurationMs;
    }

    public final float getMinFractionVisible() {
        return this.minFractionVisible;
    }

    public final l<RelativeLayoutBounds, ab> getRectChanged() {
        return this.rectChanged;
    }

    public final LayoutBoundsHolder getViewportBounds() {
        return this.viewportBounds;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        fireExitIfNeeded();
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        fireExitIfNeeded();
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        this.lastViewport = null;
    }

    @Override // androidx.compose.ui.node.UnplacedAwareModifierNode
    public void onUnplaced() {
        fireExitIfNeeded();
    }

    public final void setCallback(l<? super Boolean, ab> lVar) {
        this.callback = lVar;
    }

    public final void setHandle(DelegatableNode.RegistrationHandle registrationHandle) {
        this.handle = registrationHandle;
    }

    public final void setJob(br brVar) {
        this.job = brVar;
    }

    public final void setLastBounds(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastBounds = relativeLayoutBounds;
    }

    public final void setLastReportedResult(boolean z) {
        this.lastReportedResult = z;
    }

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        this.lastViewport = relativeLayoutBounds;
    }

    public final void setMinDurationMs(long j2) {
        this.minDurationMs = j2;
    }

    public final void setMinFractionVisible(float f2) {
        this.minFractionVisible = f2;
    }

    public final void setViewportBounds(LayoutBoundsHolder layoutBoundsHolder) {
        this.viewportBounds = layoutBoundsHolder;
        updateViewport();
    }

    public final void triggerCallback() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.job = null;
        this.callback.invoke(Boolean.valueOf(this.lastResult));
        this.lastReportedResult = this.lastResult;
    }

    public final void updateViewport() {
        if (this.viewportBounds != null) {
            ObserverModifierNodeKt.observeReads(this, new C03811());
        } else if (this.lastViewport != null) {
            this.lastViewport = null;
            forceUpdate();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.OnVisibilityChangedNode$updateViewport$1, reason: invalid class name and case insensitive filesystem */
    final class C03811 extends y implements h.g.a.a<ab> {
        C03811() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LayoutBoundsHolder viewportBounds = OnVisibilityChangedNode.this.getViewportBounds();
            RelativeLayoutBounds bounds = viewportBounds != null ? viewportBounds.getBounds() : null;
            if (x.n(OnVisibilityChangedNode.this.getLastViewport(), bounds)) {
                return;
            }
            OnVisibilityChangedNode.this.setLastViewport(bounds);
            OnVisibilityChangedNode.this.forceUpdate();
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }
}
