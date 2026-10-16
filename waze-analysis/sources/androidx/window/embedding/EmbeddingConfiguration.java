package androidx.window.embedding;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingConfiguration {
    private final DimAreaBehavior dimAreaBehavior;
    private final boolean isAutoSaveEmbeddingState;

    /* compiled from: WazeSource */
    public final class Builder {
        private DimAreaBehavior mDimAreaBehavior = DimAreaBehavior.UNDEFINED;
        private boolean mSaveEmbeddingState;

        public final EmbeddingConfiguration build() {
            return new EmbeddingConfiguration(this.mDimAreaBehavior, this.mSaveEmbeddingState, null);
        }

        public final Builder setAutoSaveEmbeddingState(boolean z) {
            this.mSaveEmbeddingState = z;
            return this;
        }

        public final Builder setDimAreaBehavior(DimAreaBehavior dimAreaBehavior) {
            x.f(dimAreaBehavior, "area");
            this.mDimAreaBehavior = dimAreaBehavior;
            return this;
        }
    }

    /* synthetic */ EmbeddingConfiguration(DimAreaBehavior dimAreaBehavior, boolean z, int i2, o oVar) {
        this((i2 & 1) != 0 ? DimAreaBehavior.UNDEFINED : dimAreaBehavior, z & ((i2 & 2) == 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmbeddingConfiguration)) {
            return false;
        }
        EmbeddingConfiguration embeddingConfiguration = (EmbeddingConfiguration) obj;
        return x.n(this.dimAreaBehavior, embeddingConfiguration.dimAreaBehavior) && this.isAutoSaveEmbeddingState == embeddingConfiguration.isAutoSaveEmbeddingState;
    }

    public final DimAreaBehavior getDimAreaBehavior() {
        return this.dimAreaBehavior;
    }

    public int hashCode() {
        return (this.dimAreaBehavior.hashCode() * 31) + EmbeddingConfiguration$$ExternalSyntheticBackport0.m(this.isAutoSaveEmbeddingState);
    }

    public final boolean isAutoSaveEmbeddingState() {
        return this.isAutoSaveEmbeddingState;
    }

    public String toString() {
        return "EmbeddingConfiguration{dimArea=" + this.dimAreaBehavior + ", saveState=" + this.isAutoSaveEmbeddingState + "}";
    }

    /* compiled from: WazeSource */
    public final class DimAreaBehavior {
        private final int value;
        public static final Companion Companion = new Companion(null);
        public static final DimAreaBehavior UNDEFINED = new DimAreaBehavior(0);
        public static final DimAreaBehavior ON_ACTIVITY_STACK = new DimAreaBehavior(1);
        public static final DimAreaBehavior ON_TASK = new DimAreaBehavior(2);

        private DimAreaBehavior(int i2) {
            this.value = i2;
        }

        public final int getValue$window() {
            return this.value;
        }

        public String toString() {
            int i2 = this.value;
            return "DimAreaBehavior=".concat(i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "ON_TASK" : "ON_ACTIVITY_STACK" : "UNDEFINED");
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    public /* synthetic */ EmbeddingConfiguration(DimAreaBehavior dimAreaBehavior, boolean z, o oVar) {
        this(dimAreaBehavior, z);
    }

    private EmbeddingConfiguration(DimAreaBehavior dimAreaBehavior, boolean z) {
        this.dimAreaBehavior = dimAreaBehavior;
        this.isAutoSaveEmbeddingState = z;
    }
}
