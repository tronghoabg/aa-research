package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AnimationData {
    private final float degrees;
    private final long offset;
    private final float zoom;

    private AnimationData(float f2, long j2, float f3) {
        this.zoom = f2;
        this.offset = j2;
        this.degrees = f3;
    }

    /* renamed from: copy-d-4ec7I$default, reason: not valid java name */
    public static /* synthetic */ AnimationData m2149copyd4ec7I$default(AnimationData animationData, float f2, long j2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = animationData.zoom;
        }
        if ((i2 & 2) != 0) {
            j2 = animationData.offset;
        }
        if ((i2 & 4) != 0) {
            f3 = animationData.degrees;
        }
        return animationData.m2151copyd4ec7I(f2, j2, f3);
    }

    public final float component1() {
        return this.zoom;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m2150component2F1C5BW0() {
        return this.offset;
    }

    public final float component3() {
        return this.degrees;
    }

    /* renamed from: copy-d-4ec7I, reason: not valid java name */
    public final AnimationData m2151copyd4ec7I(float f2, long j2, float f3) {
        return new AnimationData(f2, j2, f3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimationData)) {
            return false;
        }
        AnimationData animationData = (AnimationData) obj;
        return Float.compare(this.zoom, animationData.zoom) == 0 && Offset.m7977equalsimpl0(this.offset, animationData.offset) && Float.compare(this.degrees, animationData.degrees) == 0;
    }

    public final float getDegrees() {
        return this.degrees;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m2152getOffsetF1C5BW0() {
        return this.offset;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.zoom) * 31) + Offset.m7982hashCodeimpl(this.offset)) * 31) + Float.floatToIntBits(this.degrees);
    }

    public String toString() {
        return "AnimationData(zoom=" + this.zoom + ", offset=" + ((Object) Offset.m7988toStringimpl(this.offset)) + ", degrees=" + this.degrees + ')';
    }

    public /* synthetic */ AnimationData(float f2, long j2, float f3, o oVar) {
        this(f2, j2, f3);
    }
}
