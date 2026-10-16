package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import h.g.a.a;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NestedScrollDispatcher {
    public static final int $stable = 8;
    private a<? extends af> calculateNestedScrollScope = new NestedScrollDispatcher$calculateNestedScrollScope$1(this);
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollNode nestedScrollNode;
    private af scope;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r0 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        if (r0 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9457dispatchPostFlingRZ2iAVY(long r6, long r8, h.c.e<? super androidx.compose.ui.unit.Velocity> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1
            r0.<init>(r5, r10)
        L18:
            r10 = r0
            java.lang.Object r0 = r10.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r10.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r0)
            goto L68
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            e.b.c.b(r0)
            goto L4c
        L37:
            e.b.c.b(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r0 = r5.getParent$ui()
            if (r0 != 0) goto L5a
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r5 = r5.lastKnownParentNode
            if (r5 == 0) goto L53
            r10.label = r4
            java.lang.Object r0 = r5.mo2297onPostFlingRZ2iAVY(r6, r8, r10)
            if (r0 == r1) goto L6f
        L4c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r5 = r0.m11415unboximpl()
            goto L76
        L53:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r5.m11417getZero9UxMQ8M()
            goto L76
        L5a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r5 = r5.getParent$ui()
            if (r5 == 0) goto L70
            r10.label = r3
            java.lang.Object r0 = r5.mo2297onPostFlingRZ2iAVY(r6, r8, r10)
            if (r0 == r1) goto L6f
        L68:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r5 = r0.m11415unboximpl()
            goto L76
        L6f:
            return r1
        L70:
            androidx.compose.ui.unit.Velocity$Companion r5 = androidx.compose.ui.unit.Velocity.Companion
            long r5 = r5.m11417getZero9UxMQ8M()
        L76:
            androidx.compose.ui.unit.Velocity r5 = androidx.compose.ui.unit.Velocity.m11397boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m9457dispatchPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m9458dispatchPostScrollDzOQY0M(long j2, long j3, int i2) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo2298onPostScrollDzOQY0M(j2, j3, i2) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9459dispatchPreFlingQWom1Mo(long r5, h.c.e<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r7)
            goto L40
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r7)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r4 = r4.getParent$ui()
            if (r4 == 0) goto L48
            r0.label = r3
            java.lang.Object r7 = r4.mo2299onPreFlingQWom1Mo(r5, r0)
            if (r7 == r1) goto L47
        L40:
            androidx.compose.ui.unit.Velocity r7 = (androidx.compose.ui.unit.Velocity) r7
            long r4 = r7.m11415unboximpl()
            goto L4e
        L47:
            return r1
        L48:
            androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r4.m11417getZero9UxMQ8M()
        L4e:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m11397boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher.m9459dispatchPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m9460dispatchPreScrollOzD1aCk(long j2, int i2) {
        NestedScrollConnection parent$ui = getParent$ui();
        return parent$ui != null ? parent$ui.mo2300onPreScrollOzD1aCk(j2, i2) : Offset.Companion.m7996getZeroF1C5BW0();
    }

    public final a<af> getCalculateNestedScrollScope$ui() {
        return this.calculateNestedScrollScope;
    }

    public final af getCoroutineScope() {
        af afVarInvoke = this.calculateNestedScrollScope.invoke();
        if (afVarInvoke != null) {
            return afVarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getNestedScrollNode$ui() {
        return this.nestedScrollNode;
    }

    public final NestedScrollConnection getParent$ui() {
        NestedScrollNode nestedScrollNode = this.nestedScrollNode;
        return nestedScrollNode != null ? nestedScrollNode.getParentNestedScrollNode$ui() : null;
    }

    public final af getScope$ui() {
        return this.scope;
    }

    public final void setCalculateNestedScrollScope$ui(a<? extends af> aVar) {
        this.calculateNestedScrollScope = aVar;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void setNestedScrollNode$ui(NestedScrollNode nestedScrollNode) {
        this.nestedScrollNode = nestedScrollNode;
    }

    public final void setScope$ui(af afVar) {
        this.scope = afVar;
    }
}
