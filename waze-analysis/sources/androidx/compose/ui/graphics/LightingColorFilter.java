package androidx.compose.ui.graphics;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LightingColorFilter extends ColorFilter {
    public static final int $stable = 0;
    private final long add;
    private final long multiply;

    private LightingColorFilter(long j2, long j3) {
        this(j2, j3, AndroidColorFilter_androidKt.m8087actualLightingColorFilterOWjLjI(j2, j3), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LightingColorFilter)) {
            return false;
        }
        LightingColorFilter lightingColorFilter = (LightingColorFilter) obj;
        return Color.m8229equalsimpl0(this.multiply, lightingColorFilter.multiply) && Color.m8229equalsimpl0(this.add, lightingColorFilter.add);
    }

    /* renamed from: getAdd-0d7_KjU, reason: not valid java name */
    public final long m8485getAdd0d7_KjU() {
        return this.add;
    }

    /* renamed from: getMultiply-0d7_KjU, reason: not valid java name */
    public final long m8486getMultiply0d7_KjU() {
        return this.multiply;
    }

    public int hashCode() {
        return (Color.m8235hashCodeimpl(this.multiply) * 31) + Color.m8235hashCodeimpl(this.add);
    }

    public String toString() {
        return "LightingColorFilter(multiply=" + ((Object) Color.m8236toStringimpl(this.multiply)) + ", add=" + ((Object) Color.m8236toStringimpl(this.add)) + ')';
    }

    public /* synthetic */ LightingColorFilter(long j2, long j3, o oVar) {
        this(j2, j3);
    }

    public /* synthetic */ LightingColorFilter(long j2, long j3, android.graphics.ColorFilter colorFilter, o oVar) {
        this(j2, j3, colorFilter);
    }

    private LightingColorFilter(long j2, long j3, android.graphics.ColorFilter colorFilter) {
        super(colorFilter);
        this.multiply = j2;
        this.add = j3;
    }
}
