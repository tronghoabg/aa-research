package androidx.compose.foundation;

import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CombinedClickableNode$onClickKeyUpEvent$2 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $keyCode;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ CombinedClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombinedClickableNode$onClickKeyUpEvent$2(CombinedClickableNode combinedClickableNode, long j2, e<? super CombinedClickableNode$onClickKeyUpEvent$2> eVar) {
        super(2, eVar);
        this.this$0 = combinedClickableNode;
        this.$keyCode = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(this.this$0, this.$keyCode, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (kotlinx.coroutines.aj.q(r4 - r6, r10) == r0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r11)
            goto L6a
        L10:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L18:
            long r4 = r10.J$1
            long r6 = r10.J$0
            e.b.c.b(r11)
            goto L4a
        L20:
            e.b.c.b(r11)
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            androidx.compose.ui.node.CompositionLocalConsumerModifierNode r11 = (androidx.compose.ui.node.CompositionLocalConsumerModifierNode) r11
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.getLocalViewConfiguration()
            androidx.compose.runtime.CompositionLocal r1 = (androidx.compose.runtime.CompositionLocal) r1
            java.lang.Object r11 = androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(r11, r1)
            androidx.compose.ui.platform.ViewConfiguration r11 = (androidx.compose.ui.platform.ViewConfiguration) r11
            long r6 = r11.getDoubleTapMinTimeMillis()
            long r4 = r11.getDoubleTapTimeoutMillis()
            r11 = r10
            h.c.e r11 = (h.c.e) r11
            r10.J$0 = r6
            r10.J$1 = r4
            r10.label = r3
            java.lang.Object r11 = kotlinx.coroutines.aj.q(r6, r11)
            if (r11 == r0) goto L76
        L4a:
            androidx.compose.foundation.CombinedClickableNode r11 = r10.this$0
            long r8 = r10.$keyCode
            androidx.collection.MutableLongObjectMap r11 = androidx.compose.foundation.CombinedClickableNode.access$getDoubleKeyClickStates$p(r11)
            java.lang.Object r11 = r11.get(r8)
            androidx.compose.foundation.CombinedClickableNode$DoubleKeyClickState r11 = (androidx.compose.foundation.CombinedClickableNode.DoubleKeyClickState) r11
            if (r11 == 0) goto L5d
            r11.setDoubleTapMinTimeMillisElapsed(r3)
        L5d:
            long r4 = r4 - r6
            r11 = r10
            h.c.e r11 = (h.c.e) r11
            r10.label = r2
            java.lang.Object r11 = kotlinx.coroutines.aj.q(r4, r11)
            if (r11 != r0) goto L6a
            goto L76
        L6a:
            androidx.compose.foundation.CombinedClickableNode r10 = r10.this$0
            h.g.a.a r10 = r10.getOnClick()
            r10.invoke()
            h.ab r10 = h.ab.f48028a
            return r10
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
