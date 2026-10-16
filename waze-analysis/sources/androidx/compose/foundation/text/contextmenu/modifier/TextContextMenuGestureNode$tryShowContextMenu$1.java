package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class TextContextMenuGestureNode$tryShowContextMenu$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ TextContextMenuGestureNode.ClickTextContextMenuDataProvider $dataProvider;
    final /* synthetic */ long $localClickOffset;
    final /* synthetic */ TextContextMenuProvider $provider;
    int label;
    final /* synthetic */ TextContextMenuGestureNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextContextMenuGestureNode$tryShowContextMenu$1(TextContextMenuGestureNode textContextMenuGestureNode, long j2, TextContextMenuProvider textContextMenuProvider, TextContextMenuGestureNode.ClickTextContextMenuDataProvider clickTextContextMenuDataProvider, e<? super TextContextMenuGestureNode$tryShowContextMenu$1> eVar) {
        super(2, eVar);
        this.this$0 = textContextMenuGestureNode;
        this.$localClickOffset = j2;
        this.$provider = textContextMenuProvider;
        this.$dataProvider = clickTextContextMenuDataProvider;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new TextContextMenuGestureNode$tryShowContextMenu$1(this.this$0, this.$localClickOffset, this.$provider, this.$dataProvider, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((TextContextMenuGestureNode$tryShowContextMenu$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        if (r6.$provider.showTextContextMenu(r6.$dataProvider, r6) != r0) goto L17;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r7)
            goto L47
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L18:
            e.b.c.b(r7)
            goto L36
        L1c:
            e.b.c.b(r7)
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode r7 = r6.this$0
            h.g.a.p r7 = androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode.access$getOnPreShowContextMenu$p(r7)
            if (r7 == 0) goto L36
            long r4 = r6.$localClickOffset
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m7969boximpl(r4)
            r6.label = r3
            java.lang.Object r7 = r7.invoke(r1, r6)
            if (r7 != r0) goto L36
            goto L4a
        L36:
            androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider r7 = r6.$provider
            androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$ClickTextContextMenuDataProvider r1 = r6.$dataProvider
            androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider r1 = (androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider) r1
            r3 = r6
            h.c.e r3 = (h.c.e) r3
            r6.label = r2
            java.lang.Object r6 = r7.showTextContextMenu(r1, r3)
            if (r6 == r0) goto L4a
        L47:
            h.ab r6 = h.ab.f48028a
            return r6
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGestureNode$tryShowContextMenu$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
