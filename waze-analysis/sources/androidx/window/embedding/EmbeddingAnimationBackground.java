package androidx.window.embedding;

import android.graphics.Color;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class EmbeddingAnimationBackground {
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAnimationBackground DEFAULT = new DefaultBackground();

    /* compiled from: WazeSource */
    public final class ColorBackground extends EmbeddingAnimationBackground {
        private final int color;

        public ColorBackground(int i2) {
            super(null);
            this.color = i2;
            if (Color.alpha(i2) != 255) {
                throw new IllegalArgumentException("Background color must be opaque");
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return (obj instanceof ColorBackground) && this.color == ((ColorBackground) obj).color;
        }

        public final int getColor() {
            return this.color;
        }

        public int hashCode() {
            return this.color;
        }

        public String toString() {
            return "ColorBackground{color:" + Integer.toHexString(this.color) + "}";
        }
    }

    /* compiled from: WazeSource */
    final class DefaultBackground extends EmbeddingAnimationBackground {
        public DefaultBackground() {
            super(null);
        }

        public int hashCode() {
            return toString().hashCode();
        }

        public String toString() {
            return "DefaultBackground";
        }
    }

    private EmbeddingAnimationBackground() {
    }

    public static final ColorBackground createColorBackground(int i2) {
        return Companion.createColorBackground(i2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final EmbeddingAnimationBackground buildFromValue$window(int i2) {
            return Color.alpha(i2) != 255 ? EmbeddingAnimationBackground.DEFAULT : createColorBackground(i2);
        }

        public final ColorBackground createColorBackground(int i2) {
            return new ColorBackground(i2);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ EmbeddingAnimationBackground(o oVar) {
        this();
    }
}
