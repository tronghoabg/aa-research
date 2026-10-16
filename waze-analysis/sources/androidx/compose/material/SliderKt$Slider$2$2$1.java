package androidx.compose.material;

import h.g.a.l;
import h.g.b.an;
import h.g.b.u;
import h.g.b.w;
import h.k.e;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final /* synthetic */ class SliderKt$Slider$2$2$1 extends u implements l<Float, Float> {
    final /* synthetic */ an $maxPx;
    final /* synthetic */ an $minPx;
    final /* synthetic */ e<Float> $valueRange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$Slider$2$2$1(e<Float> eVar, an anVar, an anVar2) {
        super(1, w.class, "scaleToOffset", "Slider$lambda$3$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.$valueRange = eVar;
        this.$minPx = anVar;
        this.$maxPx = anVar2;
    }

    public final Float invoke(float f2) {
        return Float.valueOf(SliderKt.Slider$lambda$3$scaleToOffset(this.$valueRange, this.$minPx, this.$maxPx, f2));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Float invoke(Float f2) {
        return invoke(f2.floatValue());
    }
}
