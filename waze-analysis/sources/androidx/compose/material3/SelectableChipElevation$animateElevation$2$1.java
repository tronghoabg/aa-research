package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SelectableChipElevation$animateElevation$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Interaction $interaction;
    final /* synthetic */ MutableState<Interaction> $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectableChipElevation$animateElevation$2$1(Animatable<Dp, AnimationVector1D> animatable, float f2, boolean z, Interaction interaction, MutableState<Interaction> mutableState, e<? super SelectableChipElevation$animateElevation$2$1> eVar) {
        super(2, eVar);
        this.$animatable = animatable;
        this.$target = f2;
        this.$enabled = z;
        this.$interaction = interaction;
        this.$lastInteraction$delegate = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SelectableChipElevation$animateElevation$2$1(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SelectableChipElevation$animateElevation$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r6.$animatable.snapTo(androidx.compose.ui.unit.Dp.m11162boximpl(r6.$target), r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
    
        if (androidx.compose.material3.internal.ElevationKt.m6271animateElevationrAjV9yQ(r1, r3, androidx.compose.material3.SelectableChipElevation.animateElevation$lambda$2(r7), r4, r6) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
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
            if (r1 == 0) goto L19
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
            goto L60
        L19:
            e.b.c.b(r7)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            java.lang.Object r7 = r7.getTargetValue()
            androidx.compose.ui.unit.Dp r7 = (androidx.compose.ui.unit.Dp) r7
            float r7 = r7.m11178unboximpl()
            float r1 = r6.$target
            boolean r7 = androidx.compose.ui.unit.Dp.m11169equalsimpl0(r7, r1)
            if (r7 != 0) goto L67
            boolean r7 = r6.$enabled
            if (r7 != 0) goto L48
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r7 = r6.$animatable
            float r1 = r6.$target
            androidx.compose.ui.unit.Dp r1 = androidx.compose.ui.unit.Dp.m11162boximpl(r1)
            r2 = r6
            h.c.e r2 = (h.c.e) r2
            r6.label = r3
            java.lang.Object r7 = r7.snapTo(r1, r2)
            if (r7 != r0) goto L60
            goto L5f
        L48:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r7 = r6.$lastInteraction$delegate
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r6.$animatable
            float r3 = r6.$target
            androidx.compose.foundation.interaction.Interaction r4 = r6.$interaction
            androidx.compose.foundation.interaction.Interaction r7 = androidx.compose.material3.SelectableChipElevation.access$animateElevation$lambda$2(r7)
            r5 = r6
            h.c.e r5 = (h.c.e) r5
            r6.label = r2
            java.lang.Object r7 = androidx.compose.material3.internal.ElevationKt.m6271animateElevationrAjV9yQ(r1, r3, r7, r4, r5)
            if (r7 != r0) goto L60
        L5f:
            return r0
        L60:
            androidx.compose.runtime.MutableState<androidx.compose.foundation.interaction.Interaction> r7 = r6.$lastInteraction$delegate
            androidx.compose.foundation.interaction.Interaction r6 = r6.$interaction
            androidx.compose.material3.SelectableChipElevation.access$animateElevation$lambda$3(r7, r6)
        L67:
            h.ab r6 = h.ab.f48028a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SelectableChipElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
