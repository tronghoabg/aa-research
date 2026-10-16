package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NavigationParameters {
    private final Map<String, String> mAdditionalHeaders;
    private final boolean mShouldReplaceCurrentEntry;

    /* compiled from: WazeSource */
    public final class Builder {
        private boolean mShouldReplaceCurrentEntry = false;
        private final Map<String, String> mAdditionalHeaders = new HashMap();

        public Builder addAdditionalHeader(String str, String str2) {
            this.mAdditionalHeaders.put(str, str2);
            return this;
        }

        public Builder addAdditionalHeaders(Map<String, String> map) {
            this.mAdditionalHeaders.putAll(map);
            return this;
        }

        public NavigationParameters build() {
            return new NavigationParameters(this);
        }

        public Builder setShouldReplaceCurrentEntry(boolean z) {
            this.mShouldReplaceCurrentEntry = z;
            return this;
        }
    }

    private NavigationParameters(Builder builder) {
        this.mShouldReplaceCurrentEntry = builder.mShouldReplaceCurrentEntry;
        this.mAdditionalHeaders = builder.mAdditionalHeaders;
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.mAdditionalHeaders;
    }

    public boolean shouldReplaceCurrentEntry() {
        return this.mShouldReplaceCurrentEntry;
    }
}
