package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AbstractClickableNode$handlePressInteractionStart$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteractionStart$2$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, AbstractClickableNode abstractClickableNode, e<? super AbstractClickableNode$handlePressInteractionStart$2$1> eVar) {
        super(2, eVar);
        this.$interactionSource = mutableInteractionSource;
        this.$press = press;
        this.this$0 = abstractClickableNode;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AbstractClickableNode$handlePressInteractionStart$2$1(this.$interactionSource, this.$press, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AbstractClickableNode$handlePressInteractionStart$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6.$interactionSource.emit(r6.$press, r6) != r0) goto L15;
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
            goto L40
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L18:
            e.b.c.b(r7)
            goto L2f
        L1c:
            e.b.c.b(r7)
            long r4 = androidx.compose.foundation.Clickable_androidKt.getTapIndicationDelay()
            r7 = r6
            h.c.e r7 = (h.c.e) r7
            r6.label = r3
            java.lang.Object r7 = kotlinx.coroutines.aj.q(r4, r7)
            if (r7 != r0) goto L2f
            goto L4a
        L2f:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r6.$interactionSource
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r6.$press
            androidx.compose.foundation.interaction.Interaction r1 = (androidx.compose.foundation.interaction.Interaction) r1
            r3 = r6
            h.c.e r3 = (h.c.e) r3
            r6.label = r2
            java.lang.Object r7 = r7.emit(r1, r3)
            if (r7 == r0) goto L4a
        L40:
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            androidx.compose.foundation.interaction.PressInteraction$Press r6 = r6.$press
            androidx.compose.foundation.AbstractClickableNode.access$setPressInteraction$p(r7, r6)
            h.ab r6 = h.ab.f48028a
            return r6
        L4a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
