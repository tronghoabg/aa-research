package androidx.window.embedding;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingAspectRatio {
    private final String description;
    private final float value;
    public static final Companion Companion = new Companion(null);
    public static final EmbeddingAspectRatio ALWAYS_ALLOW = new EmbeddingAspectRatio("ALWAYS_ALLOW", 0.0f);
    public static final EmbeddingAspectRatio ALWAYS_DISALLOW = new EmbeddingAspectRatio("ALWAYS_DISALLOW", -1.0f);

    private EmbeddingAspectRatio(String str, float f2) {
        this.description = str;
        this.value = f2;
    }

    public static final EmbeddingAspectRatio ratio(float f2) {
        return Companion.ratio(f2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmbeddingAspectRatio)) {
            return false;
        }
        EmbeddingAspectRatio embeddingAspectRatio = (EmbeddingAspectRatio) obj;
        return this.value == embeddingAspectRatio.value && x.n(this.description, embeddingAspectRatio.description);
    }

    public final String getDescription$window() {
        return this.description;
    }

    public final float getValue$window() {
        return this.value;
    }

    public int hashCode() {
        return this.description.hashCode() + (Float.floatToIntBits(this.value) * 31);
    }

    public String toString() {
        return "EmbeddingAspectRatio(" + this.description + ")";
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final EmbeddingAspectRatio buildAspectRatioFromValue$window(float f2) {
            return f2 == EmbeddingAspectRatio.ALWAYS_ALLOW.getValue$window() ? EmbeddingAspectRatio.ALWAYS_ALLOW : f2 == EmbeddingAspectRatio.ALWAYS_DISALLOW.getValue$window() ? EmbeddingAspectRatio.ALWAYS_DISALLOW : ratio(f2);
        }

        public final EmbeddingAspectRatio ratio(float f2) {
            if (f2 <= 1.0f) {
                throw new IllegalArgumentException("Ratio must be greater than 1.");
            }
            return new EmbeddingAspectRatio("ratio:" + f2, f2, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ EmbeddingAspectRatio(String str, float f2, o oVar) {
        this(str, f2);
    }
}
