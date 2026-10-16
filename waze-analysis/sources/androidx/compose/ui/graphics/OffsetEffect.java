package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class OffsetEffect extends RenderEffect {
    public static final int $stable = 0;
    private final long offset;
    private final RenderEffect renderEffect;

    private OffsetEffect(RenderEffect renderEffect, long j2) {
        super(null);
        this.renderEffect = renderEffect;
        this.offset = j2;
    }

    @Override // androidx.compose.ui.graphics.RenderEffect
    protected android.graphics.RenderEffect createRenderEffect() {
        return RenderEffectVerificationHelper.INSTANCE.m8585createOffsetEffectUv8p0NA(this.renderEffect, this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffsetEffect)) {
            return false;
        }
        OffsetEffect offsetEffect = (OffsetEffect) obj;
        return x.n(this.renderEffect, offsetEffect.renderEffect) && Offset.m7977equalsimpl0(this.offset, offsetEffect.offset);
    }

    public int hashCode() {
        RenderEffect renderEffect = this.renderEffect;
        return ((renderEffect != null ? renderEffect.hashCode() : 0) * 31) + Offset.m7982hashCodeimpl(this.offset);
    }

    public String toString() {
        return "OffsetEffect(renderEffect=" + this.renderEffect + ", offset=" + ((Object) Offset.m7988toStringimpl(this.offset)) + ')';
    }

    public /* synthetic */ OffsetEffect(RenderEffect renderEffect, long j2, o oVar) {
        this(renderEffect, j2);
    }
}
