package com.waze.bw.c.d;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements MutableInteractionSource {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MutableInteractionSource f18170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f18171b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ MutableInteractionSource f18172c;

    u(MutableInteractionSource mutableInteractionSource, h.g.a.l lVar) {
        this.f18170a = mutableInteractionSource;
        this.f18171b = lVar;
        this.f18172c = mutableInteractionSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(androidx.compose.foundation.interaction.Interaction r5, h.c.e<? super h.ab> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.waze.bw.c.d.t
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.bw.c.d.t r0 = (com.waze.bw.c.d.t) r0
            int r1 = r0.f18169d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18169d = r1
            goto L18
        L13:
            com.waze.bw.c.d.t r0 = new com.waze.bw.c.d.t
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18167b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f18169d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.f18166a
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            e.b.c.b(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r6)
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r4.f18170a
            r0.f18166a = r5
            r0.f18169d = r3
            java.lang.Object r6 = r6.emit(r5, r0)
            if (r6 == r1) goto L50
        L42:
            h.g.a.l r4 = r4.f18171b
            boolean r5 = r5 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r5 == 0) goto L4d
            com.waze.bw.c.d.ae r5 = com.waze.bw.c.d.ae.f17955a
            r4.invoke(r5)
        L4d:
            h.ab r4 = h.ab.f48028a
            return r4
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.d.u.emit(androidx.compose.foundation.interaction.Interaction, h.c.e):java.lang.Object");
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public final kotlinx.coroutines.b.k<Interaction> getInteractions() {
        return this.f18172c.getInteractions();
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public final boolean tryEmit(Interaction interaction) {
        h.g.b.x.f(interaction, "interaction");
        boolean z = interaction instanceof DragInteraction.Start;
        boolean zTryEmit = this.f18170a.tryEmit(interaction);
        if (z) {
            this.f18171b.invoke(ae.f17955a);
        }
        return zTryEmit;
    }
}
