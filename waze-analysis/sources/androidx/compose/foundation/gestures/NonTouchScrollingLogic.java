package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import h.ab;
import h.c.e;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class NonTouchScrollingLogic {
    public static final int $stable = 8;
    private Density density;
    private boolean isScrolling;
    private final p<Velocity, e<? super ab>, Object> onScrollStopped;
    private final ScrollingLogic scrollingLogic;
    private final DifferentialVelocityTracker velocityTracker = new DifferentialVelocityTracker();

    /* JADX WARN: Multi-variable type inference failed */
    public NonTouchScrollingLogic(ScrollingLogic scrollingLogic, p<? super Velocity, ? super e<? super ab>, ? extends Object> pVar, Density density) {
        this.scrollingLogic = scrollingLogic;
        this.onScrollStopped = pVar;
        this.density = density;
    }

    public final void consume$foundation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            changes.get(i2).consume();
        }
    }

    protected final Density getDensity() {
        return this.density;
    }

    protected final p<Velocity, e<? super ab>, Object> getOnScrollStopped() {
        return this.onScrollStopped;
    }

    protected final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    public final DifferentialVelocityTracker getVelocityTracker$foundation() {
        return this.velocityTracker;
    }

    public final boolean isConsumed$foundation(PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (changes.get(i2).isConsumed()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isScrolling$foundation() {
        return this.isScrolling;
    }

    /* renamed from: onPointerEvent-H0pRuoY */
    public abstract void mo2250onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    protected final void setDensity(Density density) {
        this.density = density;
    }

    public final void setScrolling$foundation(boolean z) {
        this.isScrolling = z;
    }

    public abstract void startReceivingEvents(af afVar);

    public final void updateDensity(Density density) {
        this.density = density;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userScroll$foundation(h.g.a.p<? super androidx.compose.foundation.gestures.NestedScrollScope, ? super h.c.e<? super h.ab>, ? extends java.lang.Object> r5, h.c.e<? super h.ab> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = (androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1 r0 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r6)
            r4.isScrolling = r3
            androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2 r6 = new androidx.compose.foundation.gestures.NonTouchScrollingLogic$userScroll$2
            r2 = 0
            r6.<init>(r4, r5, r2)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.label = r3
            java.lang.Object r5 = kotlinx.coroutines.aj.O(r6, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            r5 = 0
            r4.isScrolling = r5
            h.ab r4 = h.ab.f48028a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.NonTouchScrollingLogic.userScroll$foundation(h.g.a.p, h.c.e):java.lang.Object");
    }
}
