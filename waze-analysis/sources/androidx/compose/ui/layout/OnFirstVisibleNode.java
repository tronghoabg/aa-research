package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
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
final class OnFirstVisibleNode extends Modifier.Node implements ObserverModifierNode {
    private h.g.a.a<ab> callback;
    private DelegatableNode.RegistrationHandle handle;
    private br job;
    private RelativeLayoutBounds lastBounds;
    private boolean lastResult;
    private RelativeLayoutBounds lastViewport;
    private long minDurationMs;
    private float minFractionVisible;
    private final l<RelativeLayoutBounds, ab> rectChanged = new OnFirstVisibleNode$rectChanged$1(this);
    private LayoutBoundsHolder viewportBounds;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.OnFirstVisibleNode$startTimer$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ long $minDurationMs;
        int label;
        final /* synthetic */ OnFirstVisibleNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j2, OnFirstVisibleNode onFirstVisibleNode, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$minDurationMs = j2;
            this.this$0 = onFirstVisibleNode;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$minDurationMs, this.this$0, eVar);
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
                if (aj.q(this.$minDurationMs, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.this$0.triggerCallback();
            return ab.f48028a;
        }
    }

    public OnFirstVisibleNode(long j2, float f2, LayoutBoundsHolder layoutBoundsHolder, h.g.a.a<ab> aVar) {
        this.minDurationMs = j2;
        this.minFractionVisible = f2;
        this.callback = aVar;
        this.viewportBounds = layoutBoundsHolder;
    }

    public final void cancelTimer() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
    }

    public final void checkVisibility(float f2, RelativeLayoutBounds relativeLayoutBounds, RelativeLayoutBounds relativeLayoutBounds2) {
        this.lastBounds = relativeLayoutBounds;
        if (relativeLayoutBounds2 != null || this.viewportBounds == null) {
            float fFractionVisibleIn = relativeLayoutBounds2 != null ? relativeLayoutBounds.fractionVisibleIn(relativeLayoutBounds2) : relativeLayoutBounds.fractionVisibleInWindow();
            boolean z = true;
            if (fFractionVisibleIn <= f2 && fFractionVisibleIn != 1.0f) {
                z = false;
            }
            if (z && !this.lastResult) {
                startTimer();
            } else if (!z && this.lastResult) {
                cancelTimer();
            }
            this.lastResult = z;
        }
    }

    public final void forceUpdate() {
        RelativeLayoutBounds relativeLayoutBounds = this.lastBounds;
        if (relativeLayoutBounds != null) {
            checkVisibility(this.minFractionVisible, relativeLayoutBounds, this.lastViewport);
        }
    }

    public final h.g.a.a<ab> getCallback() {
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
        updateViewport();
        this.handle = OnLayoutRectChangedModifierKt.registerOnLayoutRectChanged(this, 0L, 0L, this.rectChanged);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateViewport();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onReset() {
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.job = null;
        this.lastResult = false;
        this.lastBounds = null;
        setLastViewport(null);
    }

    public final void setCallback(h.g.a.a<ab> aVar) {
        this.callback = aVar;
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

    public final void setLastResult(boolean z) {
        this.lastResult = z;
    }

    public final void setLastViewport(RelativeLayoutBounds relativeLayoutBounds) {
        if (x.n(this.lastViewport, relativeLayoutBounds)) {
            return;
        }
        this.lastViewport = relativeLayoutBounds;
        forceUpdate();
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

    public final void startTimer() {
        long j2 = this.minDurationMs;
        if (j2 == 0) {
            triggerCallback();
            return;
        }
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.job = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(j2, this, null), 3);
    }

    public final void triggerCallback() {
        DelegatableNode.RegistrationHandle registrationHandle = this.handle;
        if (registrationHandle != null) {
            registrationHandle.unregister();
        }
        br brVar = this.job;
        if (brVar != null) {
            brVar.s(null);
        }
        this.callback.invoke();
    }

    public final void updateViewport() {
        if (this.viewportBounds == null) {
            setLastViewport(null);
        } else {
            ObserverModifierNodeKt.observeReads(this, new C03801());
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.layout.OnFirstVisibleNode$updateViewport$1, reason: invalid class name and case insensitive filesystem */
    final class C03801 extends y implements h.g.a.a<ab> {
        C03801() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            LayoutBoundsHolder viewportBounds = OnFirstVisibleNode.this.getViewportBounds();
            OnFirstVisibleNode.this.setLastViewport(viewportBounds != null ? viewportBounds.getBounds() : null);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }
}
