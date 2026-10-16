package androidx.compose.ui.graphics.colorspace;

import h.g.a.l;
import h.g.b.y;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class Rgb$oetf$1 extends y implements l<Double, Double> {
    final /* synthetic */ Rgb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Rgb$oetf$1(Rgb rgb) {
        super(1);
        this.this$0 = rgb;
    }

    public final Double invoke(double d2) {
        return Double.valueOf(n.d(this.this$0.getOetfOrig$ui_graphics().invoke(d2), this.this$0.min, this.this$0.max));
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Double invoke(Double d2) {
        return invoke(d2.doubleValue());
    }
}
