package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NestedScrollNode extends Modifier.Node implements TraversableNode, NestedScrollConnection {
    public static final int $stable = 8;
    private NestedScrollConnection connection;
    private NestedScrollNode lastKnownParentNode;
    private NestedScrollDispatcher resolvedDispatcher;
    private final Object traverseKey;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollNode$updateDispatcherFields$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<af> {
        AnonymousClass1() {
            super(0);
        }

        @Override // h.g.a.a
        public final af invoke() {
            return NestedScrollNode.this.getNestedCoroutineScope();
        }
    }

    public NestedScrollNode(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        this.resolvedDispatcher = nestedScrollDispatcher == null ? new NestedScrollDispatcher() : nestedScrollDispatcher;
        this.traverseKey = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final af getNestedCoroutineScope() {
        NestedScrollNode parentNestedScrollNode$ui = getParentNestedScrollNode$ui();
        af nestedCoroutineScope = parentNestedScrollNode$ui != null ? parentNestedScrollNode$ui.getNestedCoroutineScope() : null;
        if (nestedCoroutineScope != null && aj.j(nestedCoroutineScope)) {
            return nestedCoroutineScope;
        }
        af scope$ui = this.resolvedDispatcher.getScope$ui();
        if (scope$ui != null) {
            return scope$ui;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    private final NestedScrollConnection getParentConnection() {
        if (isAttached()) {
            return getParentNestedScrollNode$ui();
        }
        return null;
    }

    private final void resetDispatcherFields() {
        if (this.resolvedDispatcher.getNestedScrollNode$ui() == this) {
            this.resolvedDispatcher.setNestedScrollNode$ui(null);
            if (ComposeUiFlags.isClearNestedScrollCoroutineScopeFixEnabled) {
                this.resolvedDispatcher.setScope$ui(null);
                this.resolvedDispatcher.setCalculateNestedScrollScope$ui(NestedScrollNodeKt.EmptyScope);
            }
        }
    }

    private final void updateDispatcher(NestedScrollDispatcher nestedScrollDispatcher) {
        resetDispatcherFields();
        if (nestedScrollDispatcher == null) {
            this.resolvedDispatcher = new NestedScrollDispatcher();
        } else if (!x.n(nestedScrollDispatcher, this.resolvedDispatcher)) {
            this.resolvedDispatcher = nestedScrollDispatcher;
        }
        if (isAttached()) {
            updateDispatcherFields();
        }
    }

    private final void updateDispatcherFields() {
        this.resolvedDispatcher.setNestedScrollNode$ui(this);
        this.resolvedDispatcher.setLastKnownParentNode$ui(null);
        this.lastKnownParentNode = null;
        this.resolvedDispatcher.setCalculateNestedScrollScope$ui(new AnonymousClass1());
        this.resolvedDispatcher.setScope$ui(getCoroutineScope());
    }

    public final NestedScrollConnection getConnection() {
        return this.connection;
    }

    public final NestedScrollNode getLastKnownParentNode$ui() {
        return this.lastKnownParentNode;
    }

    public final NestedScrollNode getParentNestedScrollNode$ui() {
        if (isAttached()) {
            return (NestedScrollNode) TraversableNodeKt.findNearestAncestor(this);
        }
        return null;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateDispatcherFields();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        NestedScrollNode nestedScrollNode = (NestedScrollNode) NestedScrollNodeKt.findNearestAttachedAncestor(this);
        this.lastKnownParentNode = nestedScrollNode;
        this.resolvedDispatcher.setLastKnownParentNode$ui(nestedScrollNode);
        resetDispatcherFields();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2297onPostFlingRZ2iAVY(long r12, long r14, h.c.e<? super androidx.compose.ui.unit.Velocity> r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r1 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1 r1 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPostFling$1
            r1.<init>(r11, r0)
        L1a:
            r7 = r1
            java.lang.Object r0 = r7.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r7.label
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 == r3) goto L37
            if (r2 != r8) goto L2f
            long r11 = r7.J$0
            e.b.c.b(r0)
            goto L83
        L2f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L37:
            long r12 = r7.J$1
            long r2 = r7.J$0
            e.b.c.b(r0)
            r9 = r2
            r2 = r12
            r12 = r9
            goto L56
        L42:
            e.b.c.b(r0)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r2 = r11.connection
            r7.J$0 = r12
            r7.J$1 = r14
            r7.label = r3
            r3 = r12
            r5 = r14
            java.lang.Object r0 = r2.mo2297onPostFlingRZ2iAVY(r3, r5, r7)
            if (r0 == r1) goto L9a
            r2 = r14
        L56:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r4 = r0.m11415unboximpl()
            boolean r0 = r11.isAttached()
            if (r0 == 0) goto L67
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = r11.getParentConnection()
            goto L6b
        L67:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode r11 = r11.lastKnownParentNode
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r11 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r11
        L6b:
            if (r11 == 0) goto L8b
            long r12 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r12, r4)
            long r2 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r2, r4)
            r7.J$0 = r4
            r7.label = r8
            r14 = r2
            r16 = r7
            java.lang.Object r0 = r11.mo2297onPostFlingRZ2iAVY(r12, r14, r16)
            if (r0 == r1) goto L9a
            r11 = r4
        L83:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.m11415unboximpl()
            r4 = r11
            goto L91
        L8b:
            androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.Companion
            long r0 = r11.m11417getZero9UxMQ8M()
        L91:
            long r11 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r4, r0)
            androidx.compose.ui.unit.Velocity r11 = androidx.compose.ui.unit.Velocity.m11397boximpl(r11)
            return r11
        L9a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo2297onPostFlingRZ2iAVY(long, long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        long jMo2298onPostScrollDzOQY0M = this.connection.mo2298onPostScrollDzOQY0M(j2, j3, i2);
        NestedScrollConnection parentConnection = getParentConnection();
        return Offset.m7985plusMKHz9U(jMo2298onPostScrollDzOQY0M, parentConnection != null ? parentConnection.mo2298onPostScrollDzOQY0M(Offset.m7985plusMKHz9U(j2, jMo2298onPostScrollDzOQY0M), Offset.m7984minusMKHz9U(j3, jMo2298onPostScrollDzOQY0M), i2) : Offset.Companion.m7996getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r9 != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo2299onPreFlingQWom1Mo(long r7, h.c.e<? super androidx.compose.ui.unit.Velocity> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = (androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1 r0 = new androidx.compose.ui.input.nestedscroll.NestedScrollNode$onPreFling$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r6 = r0.J$0
            e.b.c.b(r9)
            goto L6b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            long r7 = r0.J$0
            e.b.c.b(r9)
            goto L4d
        L3a:
            e.b.c.b(r9)
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r9 = r6.getParentConnection()
            if (r9 == 0) goto L54
            r0.J$0 = r7
            r0.label = r4
            java.lang.Object r9 = r9.mo2299onPreFlingQWom1Mo(r7, r0)
            if (r9 == r1) goto L7a
        L4d:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r4 = r9.m11415unboximpl()
            goto L5a
        L54:
            androidx.compose.ui.unit.Velocity$Companion r9 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r9.m11417getZero9UxMQ8M()
        L5a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r6 = r6.connection
            long r7 = androidx.compose.ui.unit.Velocity.m11409minusAH228Gc(r7, r4)
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = r6.mo2299onPreFlingQWom1Mo(r7, r0)
            if (r9 == r1) goto L7a
            r6 = r4
        L6b:
            androidx.compose.ui.unit.Velocity r9 = (androidx.compose.ui.unit.Velocity) r9
            long r8 = r9.m11415unboximpl()
            long r6 = androidx.compose.ui.unit.Velocity.m11410plusAH228Gc(r6, r8)
            androidx.compose.ui.unit.Velocity r6 = androidx.compose.ui.unit.Velocity.m11397boximpl(r6)
            return r6
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.NestedScrollNode.mo2299onPreFlingQWom1Mo(long, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        NestedScrollConnection parentConnection = getParentConnection();
        long jMo2300onPreScrollOzD1aCk = parentConnection != null ? parentConnection.mo2300onPreScrollOzD1aCk(j2, i2) : Offset.Companion.m7996getZeroF1C5BW0();
        return Offset.m7985plusMKHz9U(jMo2300onPreScrollOzD1aCk, this.connection.mo2300onPreScrollOzD1aCk(Offset.m7984minusMKHz9U(j2, jMo2300onPreScrollOzD1aCk), i2));
    }

    public final void setConnection(NestedScrollConnection nestedScrollConnection) {
        this.connection = nestedScrollConnection;
    }

    public final void setLastKnownParentNode$ui(NestedScrollNode nestedScrollNode) {
        this.lastKnownParentNode = nestedScrollNode;
    }

    public final void updateNode$ui(NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        this.connection = nestedScrollConnection;
        updateDispatcher(nestedScrollDispatcher);
    }

    private static /* synthetic */ void getNestedCoroutineScope$annotations() {
    }
}
