package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AbstractClickableNode$handlePressInteractionRelease$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ br $job;
    final /* synthetic */ long $offset;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteractionRelease$1$1(br brVar, long j2, MutableInteractionSource mutableInteractionSource, e<? super AbstractClickableNode$handlePressInteractionRelease$1$1> eVar) {
        super(2, eVar);
        this.$job = brVar;
        this.$offset = j2;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$1(this.$job, this.$offset, this.$interactionSource, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r7.$interactionSource.emit(r1, r7) == r0) goto L21;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r7.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            e.b.c.b(r8)
            goto L67
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1c:
            java.lang.Object r1 = r7.L$0
            androidx.compose.foundation.interaction.PressInteraction$Release r1 = (androidx.compose.foundation.interaction.PressInteraction.Release) r1
            e.b.c.b(r8)
            goto L56
        L24:
            e.b.c.b(r8)
            goto L39
        L28:
            e.b.c.b(r8)
            kotlinx.coroutines.br r8 = r7.$job
            r1 = r7
            h.c.e r1 = (h.c.e) r1
            r7.label = r5
            java.lang.Object r8 = r8.m(r1)
            if (r8 != r0) goto L39
            goto L6a
        L39:
            long r5 = r7.$offset
            androidx.compose.foundation.interaction.PressInteraction$Press r8 = new androidx.compose.foundation.interaction.PressInteraction$Press
            r8.<init>(r5, r2)
            androidx.compose.foundation.interaction.PressInteraction$Release r1 = new androidx.compose.foundation.interaction.PressInteraction$Release
            r1.<init>(r8)
            androidx.compose.foundation.interaction.MutableInteractionSource r5 = r7.$interactionSource
            androidx.compose.foundation.interaction.Interaction r8 = (androidx.compose.foundation.interaction.Interaction) r8
            r6 = r7
            h.c.e r6 = (h.c.e) r6
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = r5.emit(r8, r6)
            if (r8 == r0) goto L6a
        L56:
            androidx.compose.foundation.interaction.MutableInteractionSource r8 = r7.$interactionSource
            androidx.compose.foundation.interaction.Interaction r1 = (androidx.compose.foundation.interaction.Interaction) r1
            r4 = r7
            h.c.e r4 = (h.c.e) r4
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r7 = r8.emit(r1, r4)
            if (r7 == r0) goto L6a
        L67:
            h.ab r7 = h.ab.f48028a
            return r7
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionRelease$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
