package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.geometry.Offset;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SharedElement$updateExitVelocity$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedElement$updateExitVelocity$1(SharedElement sharedElement, long j2, e<? super SharedElement$updateExitVelocity$1> eVar) {
        super(2, eVar);
        this.this$0 = sharedElement;
        this.$velocity = j2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SharedElement$updateExitVelocity$1(this.this$0, this.$velocity, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SharedElement$updateExitVelocity$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.this$0.momentumAnimation, Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), SharedElementKt.DefaultMomentumSpring, Offset.m7969boximpl(SharedElementKt.m1809toOffsetTH1AsA0(this.$velocity)), null, this, 8, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        this.this$0.animationSpecFinalized = true;
        return ab.f48028a;
    }
}
