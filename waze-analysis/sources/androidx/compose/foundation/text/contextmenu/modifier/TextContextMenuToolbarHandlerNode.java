package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextContextMenuToolbarHandlerNode extends DelegatingNode implements CompositionLocalConsumerModifierNode, TextContextMenuDataProvider {
    public static final int $stable = 8;
    private l<? super LayoutCoordinates, Rect> computeContentBounds;
    private l<? super e<? super ab>, ? extends Object> onHide;
    private l<? super e<? super ab>, ? extends Object> onShow;
    private ToolbarRequester requester;
    private br textToolbarJob;
    private final State derivedData$delegate = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return TextContextMenuToolbarHandlerNode.derivedData_delegate$lambda$0(this.f$0);
        }
    });
    private Rect previousContentBounds = Rect.Companion.getZero();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode$show$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ TextContextMenuProvider $provider;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(TextContextMenuProvider textContextMenuProvider, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$provider = textContextMenuProvider;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return TextContextMenuToolbarHandlerNode.this.new AnonymousClass1(this.$provider, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        
            if (r7.invoke(r6) != r0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
        
            if (r1.invoke(r6) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r6.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L26
                if (r1 == r3) goto L22
                if (r1 == r2) goto L1a
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                java.lang.Object r6 = r6.L$0
                java.lang.Throwable r6 = (java.lang.Throwable) r6
                e.b.c.b(r7)
                goto L7d
            L22:
                e.b.c.b(r7)
                goto L66
            L26:
                e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2e
                goto L56
            L2a:
                e.b.c.b(r7)     // Catch: java.lang.Throwable -> L2e
                goto L44
            L2e:
                r7 = move-exception
                goto L69
            L30:
                e.b.c.b(r7)
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this     // Catch: java.lang.Throwable -> L2e
                h.g.a.l r7 = r7.getOnShow()     // Catch: java.lang.Throwable -> L2e
                if (r7 == 0) goto L44
                r6.label = r5     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r7 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L2e
                if (r7 != r0) goto L44
                goto L7b
            L44:
                androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider r7 = r6.$provider     // Catch: java.lang.Throwable -> L2e
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this     // Catch: java.lang.Throwable -> L2e
                androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider r1 = (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider) r1     // Catch: java.lang.Throwable -> L2e
                r5 = r6
                h.c.e r5 = (h.c.e) r5     // Catch: java.lang.Throwable -> L2e
                r6.label = r4     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r7 = r7.showTextContextMenu(r1, r5)     // Catch: java.lang.Throwable -> L2e
                if (r7 != r0) goto L56
                goto L7b
            L56:
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r7 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this
                h.g.a.l r7 = r7.getOnHide()
                if (r7 == 0) goto L66
                r6.label = r3
                java.lang.Object r6 = r7.invoke(r6)
                if (r6 == r0) goto L7b
            L66:
                h.ab r6 = h.ab.f48028a
                return r6
            L69:
                androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode r1 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.this
                h.g.a.l r1 = r1.getOnHide()
                if (r1 == 0) goto L7c
                r6.L$0 = r7
                r6.label = r2
                java.lang.Object r6 = r1.invoke(r6)
                if (r6 != r0) goto L7c
            L7b:
                return r0
            L7c:
                r6 = r7
            L7d:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuToolbarHandlerNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public TextContextMenuToolbarHandlerNode(ToolbarRequester toolbarRequester, l<? super e<? super ab>, ? extends Object> lVar, l<? super e<? super ab>, ? extends Object> lVar2, l<? super LayoutCoordinates, Rect> lVar3) {
        this.requester = toolbarRequester;
        this.onShow = lVar;
        this.onHide = lVar2;
        this.computeContentBounds = lVar3;
    }

    static final TextContextMenuData derivedData_delegate$lambda$0(TextContextMenuToolbarHandlerNode textContextMenuToolbarHandlerNode) {
        return textContextMenuToolbarHandlerNode.isAttached() ? TextContextMenuModifierKt.collectTextContextMenuData(textContextMenuToolbarHandlerNode) : TextContextMenuData.Companion.getEmpty();
    }

    private final TextContextMenuData getDerivedData() {
        return (TextContextMenuData) this.derivedData$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public Rect contentBounds(LayoutCoordinates layoutCoordinates) {
        Rect rectInvoke;
        if (!isAttached() || (rectInvoke = this.computeContentBounds.invoke(layoutCoordinates)) == null) {
            return this.previousContentBounds;
        }
        this.previousContentBounds = rectInvoke;
        return rectInvoke;
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    public TextContextMenuData data() {
        return getDerivedData();
    }

    public final l<LayoutCoordinates, Rect> getComputeContentBounds() {
        return this.computeContentBounds;
    }

    public final l<e<? super ab>, Object> getOnHide() {
        return this.onHide;
    }

    public final l<e<? super ab>, Object> getOnShow() {
        return this.onShow;
    }

    public final ToolbarRequester getRequester() {
        return this.requester;
    }

    public final void hide() {
        br brVar = this.textToolbarJob;
        if (brVar == null) {
            return;
        }
        brVar.s(null);
        this.textToolbarJob = null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Attached);
        this.requester.setToolbarHandlerNode$foundation(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.requester.setToolbarHandlerState$foundation(ToolbarHandlerState.Detached);
        this.requester.setToolbarHandlerNode$foundation(null);
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider
    /* renamed from: position-tuRUvjQ */
    public long mo3451positiontuRUvjQ(LayoutCoordinates layoutCoordinates) {
        return contentBounds(layoutCoordinates).m8015getTopLeftF1C5BW0();
    }

    public final void setComputeContentBounds(l<? super LayoutCoordinates, Rect> lVar) {
        this.computeContentBounds = lVar;
    }

    public final void setOnHide(l<? super e<? super ab>, ? extends Object> lVar) {
        this.onHide = lVar;
    }

    public final void setOnShow(l<? super e<? super ab>, ? extends Object> lVar) {
        this.onShow = lVar;
    }

    public final void setRequester(ToolbarRequester toolbarRequester) {
        this.requester = toolbarRequester;
    }

    public final void show() {
        TextContextMenuProvider textContextMenuProvider;
        if (isAttached()) {
            br brVar = this.textToolbarJob;
            if ((brVar == null || !brVar.bZ()) && (textContextMenuProvider = (TextContextMenuProvider) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextContextMenuProviderKt.getLocalTextContextMenuToolbarProvider())) != null) {
                this.textToolbarJob = aj.z(getCoroutineScope(), null, ag.f51345d, new AnonymousClass1(textContextMenuProvider, null), 1);
            }
        }
    }

    public final void update(ToolbarRequester toolbarRequester) {
        this.requester.setToolbarHandlerNode$foundation(null);
        this.requester = toolbarRequester;
        toolbarRequester.setToolbarHandlerNode$foundation(this);
        this.requester.setToolbarHandlerState$foundation(isAttached() ? ToolbarHandlerState.Attached : ToolbarHandlerState.Detached);
    }
}
