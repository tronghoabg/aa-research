package androidx.compose.foundation.style;

import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.style.StyleAnimations;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class StyleAnimations$Entry$animateOut$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ StyleAnimations.Entry this$0;
    final /* synthetic */ StyleAnimations this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StyleAnimations$Entry$animateOut$1(StyleAnimations.Entry entry, StyleAnimations styleAnimations, e<? super StyleAnimations$Entry$animateOut$1> eVar) {
        super(2, eVar);
        this.this$0 = entry;
        this.this$1 = styleAnimations;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new StyleAnimations$Entry$animateOut$1(this.this$0, this.this$1, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((StyleAnimations$Entry$animateOut$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                obj = Animatable.animateTo$default(this.this$0.getAnimation(), new Float(0.0f), this.this$0.getFromSpec(), null, null, this, 12, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            this.this$1.cleanupAnimations();
            return ab.f48028a;
        } catch (Throwable th) {
            this.this$1.cleanupAnimations();
            throw th;
        }
    }
}
