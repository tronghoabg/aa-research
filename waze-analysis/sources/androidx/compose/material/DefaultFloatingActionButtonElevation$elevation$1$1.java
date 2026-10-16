package androidx.compose.material;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DefaultFloatingActionButtonElevation$elevation$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FloatingActionButtonElevationAnimatable $animatable;
    int label;
    final /* synthetic */ DefaultFloatingActionButtonElevation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultFloatingActionButtonElevation$elevation$1$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation, e<? super DefaultFloatingActionButtonElevation$elevation$1$1> eVar) {
        super(2, eVar);
        this.$animatable = floatingActionButtonElevationAnimatable;
        this.this$0 = defaultFloatingActionButtonElevation;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DefaultFloatingActionButtonElevation$elevation$1$1(this.$animatable, this.this$0, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.$animatable;
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = this.this$0;
            this.label = 1;
            if (floatingActionButtonElevationAnimatable.m4104updateElevationlDy3nrA(defaultFloatingActionButtonElevation.defaultElevation, defaultFloatingActionButtonElevation.pressedElevation, defaultFloatingActionButtonElevation.hoveredElevation, defaultFloatingActionButtonElevation.focusedElevation, this) == aVar) {
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
