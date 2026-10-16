package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Stroke extends DrawStyle {
    public static final float DefaultMiter = 4.0f;
    public static final float HairlineWidth = 0.0f;
    private final int cap;
    private final int join;
    private final float miter;
    private final PathEffect pathEffect;
    private final float width;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DefaultCap = StrokeCap.Companion.m8632getButtKaPHkGw();
    private static final int DefaultJoin = StrokeJoin.Companion.m8643getMiterLxFBmk8();

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, int i4, o oVar) {
        int i5 = (i4 & 4) != 0 ? DefaultCap : i2;
        int i6 = (i4 & 8) != 0 ? DefaultJoin : i3;
        int i7 = i4 & 1;
        this(1 == i7 ? 0.0f : f2, (i4 & 2) != 0 ? 4.0f : f3, i5, i6, (i4 & 16) != 0 ? null : pathEffect, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) obj;
        return this.width == stroke.width && this.miter == stroke.miter && StrokeCap.m8628equalsimpl0(this.cap, stroke.cap) && StrokeJoin.m8638equalsimpl0(this.join, stroke.join) && x.n(this.pathEffect, stroke.pathEffect);
    }

    /* renamed from: getCap-KaPHkGw, reason: not valid java name */
    public final int m8908getCapKaPHkGw() {
        return this.cap;
    }

    /* renamed from: getJoin-LxFBmk8, reason: not valid java name */
    public final int m8909getJoinLxFBmk8() {
        return this.join;
    }

    public final float getMiter() {
        return this.miter;
    }

    public final PathEffect getPathEffect() {
        return this.pathEffect;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iFloatToIntBits = (Float.floatToIntBits(this.width) * 31) + Float.floatToIntBits(this.miter);
        PathEffect pathEffect = this.pathEffect;
        return (((((iFloatToIntBits * 31) + this.cap) * 31) + this.join) * 31) + (pathEffect != null ? pathEffect.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) StrokeCap.m8630toStringimpl(this.cap)) + ", join=" + ((Object) StrokeJoin.m8640toStringimpl(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getDefaultCap-KaPHkGw, reason: not valid java name */
        public final int m8910getDefaultCapKaPHkGw() {
            return Stroke.DefaultCap;
        }

        /* renamed from: getDefaultJoin-LxFBmk8, reason: not valid java name */
        public final int m8911getDefaultJoinLxFBmk8() {
            return Stroke.DefaultJoin;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect, o oVar) {
        this(f2, f3, i2, i3, pathEffect);
    }

    private Stroke(float f2, float f3, int i2, int i3, PathEffect pathEffect) {
        super(null);
        this.width = f2;
        this.miter = f3;
        this.cap = i2;
        this.join = i3;
        this.pathEffect = pathEffect;
    }
}
