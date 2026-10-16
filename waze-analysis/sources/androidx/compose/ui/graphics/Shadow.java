package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Shadow {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Shadow None = new Shadow(0, 0, 0.0f, 7, null);
    private final float blurRadius;
    private final long color;
    private final long offset;

    public /* synthetic */ Shadow(long j2, long j3, float f2, int i2, o oVar) {
        this((i2 & 1) != 0 ? ColorKt.Color(4278190080L) : j2, (i2 & 2) != 0 ? Offset.Companion.m7996getZeroF1C5BW0() : j3, (i2 & 4) != 0 ? 0.0f : f2, null);
    }

    /* renamed from: copy-qcb84PM$default, reason: not valid java name */
    public static /* synthetic */ Shadow m8598copyqcb84PM$default(Shadow shadow, long j2, long j3, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = shadow.color;
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = shadow.offset;
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            f2 = shadow.blurRadius;
        }
        return shadow.m8601copyqcb84PM(j4, j5, f2);
    }

    /* renamed from: copy-qcb84PM, reason: not valid java name */
    public final Shadow m8601copyqcb84PM(long j2, long j3, float f2) {
        return new Shadow(j2, j3, f2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) obj;
        return Color.m8229equalsimpl0(this.color, shadow.color) && Offset.m7977equalsimpl0(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m8602getColor0d7_KjU() {
        return this.color;
    }

    /* renamed from: getOffset-F1C5BW0, reason: not valid java name */
    public final long m8603getOffsetF1C5BW0() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m8235hashCodeimpl(this.color) * 31) + Offset.m7982hashCodeimpl(this.offset)) * 31) + Float.floatToIntBits(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m8236toStringimpl(this.color)) + ", offset=" + ((Object) Offset.m7988toStringimpl(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Shadow getNone() {
            return Shadow.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public static /* synthetic */ void getBlurRadius$annotations() {
    }

    /* renamed from: getColor-0d7_KjU$annotations, reason: not valid java name */
    public static /* synthetic */ void m8599getColor0d7_KjU$annotations() {
    }

    /* renamed from: getOffset-F1C5BW0$annotations, reason: not valid java name */
    public static /* synthetic */ void m8600getOffsetF1C5BW0$annotations() {
    }

    public /* synthetic */ Shadow(long j2, long j3, float f2, o oVar) {
        this(j2, j3, f2);
    }

    private Shadow(long j2, long j3, float f2) {
        this.color = j2;
        this.offset = j3;
        this.blurRadius = f2;
    }
}
