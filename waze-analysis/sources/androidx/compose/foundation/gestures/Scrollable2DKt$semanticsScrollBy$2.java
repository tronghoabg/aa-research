package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Scrollable2DKt$semanticsScrollBy$2 extends g implements p<NestedScrollScope, e<? super ab>, Object> {
    final /* synthetic */ long $offset;
    final /* synthetic */ ap $previousValue;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Scrollable2DKt$semanticsScrollBy$2(long j2, ap apVar, e<? super Scrollable2DKt$semanticsScrollBy$2> eVar) {
        super(2, eVar);
        this.$offset = j2;
        this.$previousValue = apVar;
    }

    static final ab invokeSuspend$lambda$0(ap apVar, NestedScrollScope nestedScrollScope, Offset offset, Offset offset2) {
        apVar.f48104a = Offset.m7985plusMKHz9U(apVar.f48104a, nestedScrollScope.mo2255scrollByOzD1aCk(Offset.m7984minusMKHz9U(offset.m7990unboximpl(), apVar.f48104a), NestedScrollSource.Companion.m9476getUserInputWNlRxjI()));
        return ab.f48028a;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        Scrollable2DKt$semanticsScrollBy$2 scrollable2DKt$semanticsScrollBy$2 = new Scrollable2DKt$semanticsScrollBy$2(this.$offset, this.$previousValue, eVar);
        scrollable2DKt$semanticsScrollBy$2.L$0 = obj;
        return scrollable2DKt$semanticsScrollBy$2;
    }

    @Override // h.g.a.p
    public final Object invoke(NestedScrollScope nestedScrollScope, e<? super ab> eVar) {
        return ((Scrollable2DKt$semanticsScrollBy$2) create(nestedScrollScope, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            TwoWayConverter<Offset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(Offset.Companion);
            Offset offsetM7969boximpl = Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0());
            long j2 = this.$offset;
            final ap apVar = this.$previousValue;
            this.label = 1;
            if (SuspendAnimationKt.animate$default(vectorConverter, offsetM7969boximpl, Offset.m7969boximpl(j2), null, null, new p() { // from class: androidx.compose.foundation.gestures.Scrollable2DKt$semanticsScrollBy$2$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj2, Object obj3) {
                    return Scrollable2DKt$semanticsScrollBy$2.invokeSuspend$lambda$0(apVar, nestedScrollScope, (Offset) obj2, (Offset) obj3);
                }
            }, this, 24, null) == aVar) {
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
