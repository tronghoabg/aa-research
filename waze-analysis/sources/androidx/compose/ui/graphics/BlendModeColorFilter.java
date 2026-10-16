package androidx.compose.ui.graphics;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class BlendModeColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final int blendMode;
    private final long color;

    private BlendModeColorFilter(long j2, int i2) {
        this(j2, i2, AndroidColorFilter_androidKt.m8088actualTintColorFilterxETnrds(j2, i2), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) obj;
        return Color.m8229equalsimpl0(this.color, blendModeColorFilter.color) && BlendMode.m8137equalsimpl0(this.blendMode, blendModeColorFilter.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m8170getBlendMode0nO6VwU() {
        return this.blendMode;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m8171getColor0d7_KjU() {
        return this.color;
    }

    public int hashCode() {
        return (Color.m8235hashCodeimpl(this.color) * 31) + this.blendMode;
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m8236toStringimpl(this.color)) + ", blendMode=" + ((Object) BlendMode.m8139toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, o oVar) {
        this(j2, i2);
    }

    public /* synthetic */ BlendModeColorFilter(long j2, int i2, android.graphics.ColorFilter colorFilter, o oVar) {
        this(j2, i2, colorFilter);
    }

    private BlendModeColorFilter(long j2, int i2, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j2;
        this.blendMode = i2;
    }
}
