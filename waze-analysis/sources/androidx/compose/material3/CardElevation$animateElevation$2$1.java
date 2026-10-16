package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CardElevation$animateElevation$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ CardElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f2, boolean z, CardElevation cardElevation, Interaction interaction, e<? super CardElevation$animateElevation$2$1> eVar) {
        super(2, eVar);
        this.$animatable = animatable;
        this.$target = f2;
        this.$enabled = z;
        this.this$0 = cardElevation;
        this.$interaction = interaction;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new CardElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((CardElevation$animateElevation$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1.snapTo(androidx.compose.ui.unit.Dp.m11162boximpl(r6.$target), r6) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m6271animateElevationrAjV9yQ(r6.$animatable, r6.$target, r3, r6.$interaction, r6) != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c0, code lost:
    
        return r0;
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
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L15:
            e.b.c.b(r7)
            goto Lc1
        L1a:
            e.b.c.b(r7)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.ui.unit.Dp) r7
            float r7 = r7.m11178unboximpl()
            float r1 = r6.$target
            boolean r7 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            if (r7 != 0) goto Lc1
            boolean r7 = r6.$enabled
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r6.$animatable
            if (r7 != 0) goto L4a
            float r7 = r6.$target
            androidx.compose.ui.unit.Dp r7 = androidx.compose.ui.unit.Dp.m11162boximpl(r7)
            r2 = r6
            h.c.e r2 = (h.c.e) r2
            r6.label = r3
            java.lang.Object r6 = r1.snapTo(r7, r2)
            if (r6 != r0) goto Lc1
            goto Lc0
        L4a:
            java.lang.Object r7 = r1.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.ui.unit.Dp) r7
            float r7 = r7.m11178unboximpl()
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getPressedElevation$p(r1)
            boolean r1 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            r3 = 0
            if (r1 == 0) goto L70
            androidx.compose.foundation.interaction.PressInteraction$Press r7 = new androidx.compose.foundation.interaction.PressInteraction$Press
            androidx.compose.ui.geometry.Offset$Companion r1 = androidx.compose.ui.geometry.Offset.Companion
            long r4 = r1.m7996getZeroF1C5BW0()
            r7.<init>(r4, r3)
            r3 = r7
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            goto Lae
        L70:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getHoveredElevation$p(r1)
            boolean r1 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            if (r1 == 0) goto L85
            androidx.compose.foundation.interaction.HoverInteraction$Enter r7 = new androidx.compose.foundation.interaction.HoverInteraction$Enter
            r7.<init>()
            r3 = r7
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            goto Lae
        L85:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getFocusedElevation$p(r1)
            boolean r1 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            if (r1 == 0) goto L9a
            androidx.compose.foundation.interaction.FocusInteraction$Focus r7 = new androidx.compose.foundation.interaction.FocusInteraction$Focus
            r7.<init>()
            r3 = r7
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
            goto Lae
        L9a:
            androidx.compose.material3.CardElevation r1 = r6.this$0
            float r1 = androidx.compose.material3.CardElevation.access$getDraggedElevation$p(r1)
            boolean r7 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            if (r7 == 0) goto Lae
            androidx.compose.foundation.interaction.DragInteraction$Start r7 = new androidx.compose.foundation.interaction.DragInteraction$Start
            r7.<init>()
            r3 = r7
            androidx.compose.foundation.interaction.Interaction r3 = (androidx.compose.foundation.interaction.Interaction) r3
        Lae:
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.foundation.interaction.Interaction r4 = r6.$interaction
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.label = r2
            java.lang.Object r6 = androidx.compose.material3.internal.ElevationKt.m6271animateElevationrAjV9yQ(r7, r1, r3, r4, r5)
            if (r6 == r0) goto Lc0
            goto Lc1
        Lc0:
            return r0
        Lc1:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
