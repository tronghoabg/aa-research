package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
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
final class SharedElement$momentumAnimationOffset$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ SpringSpec<Offset> $spring;
    int label;
    final /* synthetic */ SharedElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedElement$momentumAnimationOffset$1$2$1(SharedElement sharedElement, SpringSpec<Offset> springSpec, e<? super SharedElement$momentumAnimationOffset$1$2$1> eVar) {
        super(2, eVar);
        this.this$0 = sharedElement;
        this.$spring = springSpec;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SharedElement$momentumAnimationOffset$1$2$1(this.this$0, this.$spring, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SharedElement$momentumAnimationOffset$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (Animatable.animateTo$default(this.this$0.momentumAnimation, Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0()), this.$spring, null, null, this, 12, null) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
