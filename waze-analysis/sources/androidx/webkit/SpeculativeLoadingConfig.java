package androidx.webkit;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes4.dex */
public class SpeculativeLoadingConfig {
    private final int mMaxPrefetches;
    private final int mMaxPrerenders;
    private final int mPrefetchTTLSeconds;

    /* compiled from: WazeSource */
    public final class Builder {
        private int mMaxPrefetches;
        private int mMaxPrerenders;
        private int mPrefetchTTLSeconds;

        public SpeculativeLoadingConfig build() {
            return new SpeculativeLoadingConfig(this.mPrefetchTTLSeconds, this.mMaxPrefetches, this.mMaxPrerenders);
        }

        public Builder setMaxPrefetches(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Max prefetches must be greater than 0");
            }
            this.mMaxPrefetches = i2;
            return this;
        }

        public Builder setMaxPrerenders(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Max prerenders must be greater than 0");
            }
            this.mMaxPrerenders = i2;
            return this;
        }

        public Builder setPrefetchTtlSeconds(int i2) {
            if (i2 <= 0) {
                throw new IllegalArgumentException("Prefetch TTL must be greater than 0");
            }
            this.mPrefetchTTLSeconds = i2;
            return this;
        }
    }

    private SpeculativeLoadingConfig(int i2, int i3, int i4) {
        this.mPrefetchTTLSeconds = i2;
        this.mMaxPrefetches = i3;
        this.mMaxPrerenders = i4;
    }

    public int getMaxPrefetches() {
        return this.mMaxPrefetches;
    }

    public int getMaxPrerenders() {
        return this.mMaxPrerenders;
    }

    public int getPrefetchTtlSeconds() {
        return this.mPrefetchTTLSeconds;
    }
}
