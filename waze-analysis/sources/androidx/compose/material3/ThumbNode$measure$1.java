package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SnapSpec;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ThumbNode$measure$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ float $size;
    int label;
    final /* synthetic */ ThumbNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThumbNode$measure$1(ThumbNode thumbNode, float f2, e<? super ThumbNode$measure$1> eVar) {
        super(2, eVar);
        this.this$0 = thumbNode;
        this.$size = f2;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ThumbNode$measure$1(this.this$0, this.$size, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ThumbNode$measure$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Animatable animatable = this.this$0.sizeAnim;
            if (animatable != null) {
                Float f2 = new Float(this.$size);
                SnapSpec animationSpec = this.this$0.isPressed ? SwitchKt.SnapSpec : this.this$0.getAnimationSpec();
                this.label = 1;
                obj = Animatable.animateTo$default(animatable, f2, animationSpec, null, null, this, 12, null);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        return ab.f48028a;
    }
}
