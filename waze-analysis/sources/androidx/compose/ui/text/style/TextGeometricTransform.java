package androidx.compose.ui.text.style;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextGeometricTransform {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextGeometricTransform None = new TextGeometricTransform(1.0f, 0.0f);
    private final float scaleX;
    private final float skewX;

    public /* synthetic */ TextGeometricTransform(float f2, float f3, int i2, o oVar) {
        this(1 == (i2 & 1) ? 1.0f : f2, (i2 & 2) != 0 ? 0.0f : f3);
    }

    public static /* synthetic */ TextGeometricTransform copy$default(TextGeometricTransform textGeometricTransform, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = textGeometricTransform.scaleX;
        }
        if ((i2 & 2) != 0) {
            f3 = textGeometricTransform.skewX;
        }
        return textGeometricTransform.copy(f2, f3);
    }

    public final TextGeometricTransform copy(float f2, float f3) {
        return new TextGeometricTransform(f2, f3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextGeometricTransform)) {
            return false;
        }
        TextGeometricTransform textGeometricTransform = (TextGeometricTransform) obj;
        return this.scaleX == textGeometricTransform.scaleX && this.skewX == textGeometricTransform.skewX;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.scaleX) * 31) + Float.floatToIntBits(this.skewX);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.scaleX + ", skewX=" + this.skewX + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextGeometricTransform getNone$ui_text() {
            return TextGeometricTransform.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getNone$ui_text$annotations() {
        }
    }

    public TextGeometricTransform(float f2, float f3) {
        this.scaleX = f2;
        this.skewX = f3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextGeometricTransform() {
        float f2 = 0.0f;
        this(f2, f2, 3, null);
    }
}
