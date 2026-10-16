package androidx.window.embedding;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayAttributes {
    private final EmbeddingBounds bounds;

    /* compiled from: WazeSource */
    public final class Builder {
        private EmbeddingBounds bounds = EmbeddingBounds.BOUNDS_EXPANDED;

        public final OverlayAttributes build() {
            return new OverlayAttributes(this.bounds);
        }

        public final Builder setBounds(EmbeddingBounds embeddingBounds) {
            x.f(embeddingBounds, "bounds");
            this.bounds = embeddingBounds;
            return this;
        }
    }

    public OverlayAttributes(EmbeddingBounds embeddingBounds) {
        x.f(embeddingBounds, "bounds");
        this.bounds = embeddingBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OverlayAttributes) {
            return x.n(this.bounds, ((OverlayAttributes) obj).bounds);
        }
        return false;
    }

    public final EmbeddingBounds getBounds() {
        return this.bounds;
    }

    public int hashCode() {
        return this.bounds.hashCode();
    }

    public String toString() {
        return "OverlayAttributes: {bounds=" + this.bounds + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayAttributes() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ OverlayAttributes(EmbeddingBounds embeddingBounds, int i2, o oVar) {
        this((i2 & 1) != 0 ? EmbeddingBounds.BOUNDS_EXPANDED : embeddingBounds);
    }
}
