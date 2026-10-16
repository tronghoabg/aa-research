package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {
    private final Context context;
    private final Density density;
    private final long glowColor;
    private final PaddingValues glowDrawPadding;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j2, PaddingValues paddingValues, int i2, o oVar) {
        this(context, density, (i2 & 4) != 0 ? AndroidOverscroll_androidKt.DefaultGlowColor : j2, (i2 & 8) != 0 ? AndroidOverscroll_androidKt.DefaultGlowPaddingValues : paddingValues, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public OverscrollEffect createOverscrollEffect() {
        return new AndroidEdgeEffectOverscrollEffect(this.context, this.density, this.glowColor, this.glowDrawPadding, null);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x.n(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        x.d(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return x.n(this.context, androidEdgeEffectOverscrollFactory.context) && x.n(this.density, androidEdgeEffectOverscrollFactory.density) && Color.m8229equalsimpl0(this.glowColor, androidEdgeEffectOverscrollFactory.glowColor) && x.n(this.glowDrawPadding, androidEdgeEffectOverscrollFactory.glowDrawPadding);
    }

    @Override // androidx.compose.foundation.OverscrollFactory
    public int hashCode() {
        return (((((this.context.hashCode() * 31) + this.density.hashCode()) * 31) + Color.m8235hashCodeimpl(this.glowColor)) * 31) + this.glowDrawPadding.hashCode();
    }

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j2, PaddingValues paddingValues, o oVar) {
        this(context, density, j2, paddingValues);
    }

    private AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j2, PaddingValues paddingValues) {
        this.context = context;
        this.density = density;
        this.glowColor = j2;
        this.glowDrawPadding = paddingValues;
    }
}
