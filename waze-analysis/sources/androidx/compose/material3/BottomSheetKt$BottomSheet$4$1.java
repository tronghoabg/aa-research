package androidx.compose.material3;

import androidx.activity.BackEventCompat;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BottomSheetKt$BottomSheet$4$1 extends g implements p<k<? extends BackEventCompat>, e<? super ab>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $predictiveBackProgress;
    final /* synthetic */ a<ab> $settleToDismiss;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomSheetKt$BottomSheet$4$1(a<ab> aVar, Animatable<Float, AnimationVector1D> animatable, e<? super BottomSheetKt$BottomSheet$4$1> eVar) {
        super(2, eVar);
        this.$settleToDismiss = aVar;
        this.$predictiveBackProgress = animatable;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        BottomSheetKt$BottomSheet$4$1 bottomSheetKt$BottomSheet$4$1 = new BottomSheetKt$BottomSheet$4$1(this.$settleToDismiss, this.$predictiveBackProgress, eVar);
        bottomSheetKt$BottomSheet$4$1.L$0 = obj;
        return bottomSheetKt$BottomSheet$4$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(k<BackEventCompat> kVar, e<? super ab> eVar) {
        return ((BottomSheetKt$BottomSheet$4$1) create(kVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r11.$predictiveBackProgress, new java.lang.Float(0.0f), null, null, null, r11, 14, null) != r0) goto L20;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            e.b.c.b(r12)
            goto L58
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L18:
            e.b.c.b(r12)     // Catch: java.util.concurrent.CancellationException -> L3e
            goto L38
        L1c:
            e.b.c.b(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.b.k r12 = (kotlinx.coroutines.b.k) r12
            androidx.compose.material3.BottomSheetKt$BottomSheet$4$1$1 r1 = new androidx.compose.material3.BottomSheetKt$BottomSheet$4$1$1     // Catch: java.util.concurrent.CancellationException -> L3e
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r4 = r11.$predictiveBackProgress     // Catch: java.util.concurrent.CancellationException -> L3e
            r1.<init>()     // Catch: java.util.concurrent.CancellationException -> L3e
            kotlinx.coroutines.b.l r1 = (kotlinx.coroutines.b.l) r1     // Catch: java.util.concurrent.CancellationException -> L3e
            r4 = r11
            h.c.e r4 = (h.c.e) r4     // Catch: java.util.concurrent.CancellationException -> L3e
            r11.label = r3     // Catch: java.util.concurrent.CancellationException -> L3e
            java.lang.Object r12 = r12.collect(r1, r4)     // Catch: java.util.concurrent.CancellationException -> L3e
            if (r12 != r0) goto L38
            goto L57
        L38:
            h.g.a.a<h.ab> r12 = r11.$settleToDismiss     // Catch: java.util.concurrent.CancellationException -> L3e
            r12.invoke()     // Catch: java.util.concurrent.CancellationException -> L3e
            goto L58
        L3e:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r3 = r11.$predictiveBackProgress
            java.lang.Float r4 = new java.lang.Float
            r12 = 0
            r4.<init>(r12)
            r8 = r11
            h.c.e r8 = (h.c.e) r8
            r11.label = r2
            r9 = 14
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r11 = androidx.compose.animation.core.Animatable.animateTo$default(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r11 != r0) goto L58
        L57:
            return r0
        L58:
            h.ab r11 = h.ab.f48028a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.BottomSheetKt$BottomSheet$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(k<? extends BackEventCompat> kVar, e<? super ab> eVar) {
        return invoke2((k<BackEventCompat>) kVar, eVar);
    }
}
