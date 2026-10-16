package androidx.compose.ui.graphics;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SolidColor extends Brush implements Interpolatable {
    public static final int $stable = 0;
    private final long value;

    private SolidColor(long j2) {
        super(null);
        this.value = j2;
    }

    @Override // androidx.compose.ui.graphics.Brush
    /* renamed from: applyTo-Pq9zytI */
    public void mo8173applyToPq9zytI(long j2, Paint paint, float f2) {
        paint.setAlpha(1.0f);
        long jM8227copywmQWz5c$default = this.value;
        if (f2 != 1.0f) {
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default, Color.m8230getAlphaimpl(jM8227copywmQWz5c$default) * f2, 0.0f, 0.0f, 0.0f, 14, null);
        }
        paint.mo8104setColor8_81llA(jM8227copywmQWz5c$default);
        if (paint.getShader() != null) {
            paint.setShader(null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolidColor) && Color.m8229equalsimpl0(this.value, ((SolidColor) obj).value);
    }

    /* renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m8614getValue0d7_KjU() {
        return this.value;
    }

    public int hashCode() {
        return Color.m8235hashCodeimpl(this.value);
    }

    @Override // androidx.compose.ui.graphics.Interpolatable
    public Object lerp(Object obj, float f2) {
        o oVar = null;
        if (obj == null) {
            obj = new SolidColor(Color.Companion.m8263getTransparent0d7_KjU(), oVar);
        }
        if (obj instanceof SolidColor) {
            return new SolidColor(ColorKt.m8279lerpjxsXWHM(this.value, ((SolidColor) obj).value, f2), oVar);
        }
        return null;
    }

    public String toString() {
        return "SolidColor(value=" + ((Object) Color.m8236toStringimpl(this.value)) + ')';
    }

    public /* synthetic */ SolidColor(long j2, o oVar) {
        this(j2);
    }
}
