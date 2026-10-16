package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SpeculativeLoadingParameters {
    private final Map<String, String> mAdditionalHeaders;
    private final NoVarySearchHeader mExpectedNoVarySearchHeader;
    private final boolean mIsJavaScriptEnabled;
    private final Integer mVariationsId;

    /* compiled from: WazeSource */
    @Deprecated
    public final class Builder {
        private final Map<String, String> mAdditionalHeaders = new HashMap();
        private NoVarySearchHeader mExpectedNoVarySearchHeader;
        private boolean mIsJavaScriptEnabled;
        private Integer mVariationsId;

        public Builder addAdditionalHeader(String str, String str2) {
            this.mAdditionalHeaders.put(str, str2);
            return this;
        }

        public Builder addAdditionalHeaders(Map<String, String> map) {
            this.mAdditionalHeaders.putAll(map);
            return this;
        }

        public SpeculativeLoadingParameters build() {
            return new SpeculativeLoadingParameters(this.mAdditionalHeaders, this.mExpectedNoVarySearchHeader, this.mIsJavaScriptEnabled, this.mVariationsId);
        }

        public Builder setExpectedNoVarySearchData(NoVarySearchHeader noVarySearchHeader) {
            this.mExpectedNoVarySearchHeader = noVarySearchHeader;
            return this;
        }

        public Builder setJavaScriptEnabled(boolean z) {
            this.mIsJavaScriptEnabled = z;
            return this;
        }

        public Builder setVariationsId(Integer num) {
            this.mVariationsId = num;
            return this;
        }
    }

    public SpeculativeLoadingParameters(PrefetchParameters prefetchParameters) {
        this(prefetchParameters.getAdditionalHeaders(), prefetchParameters.getExpectedNoVarySearchHeader(), prefetchParameters.isJavaScriptEnabled(), prefetchParameters.getVariationsId());
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.mAdditionalHeaders;
    }

    public NoVarySearchHeader getExpectedNoVarySearchData() {
        return this.mExpectedNoVarySearchHeader;
    }

    public Integer getVariationsId() {
        return this.mVariationsId;
    }

    public boolean isJavaScriptEnabled() {
        return this.mIsJavaScriptEnabled;
    }

    private SpeculativeLoadingParameters(Map<String, String> map, NoVarySearchHeader noVarySearchHeader, boolean z, Integer num) {
        this.mAdditionalHeaders = map;
        this.mExpectedNoVarySearchHeader = noVarySearchHeader;
        this.mIsJavaScriptEnabled = z;
        this.mVariationsId = num;
    }

    public SpeculativeLoadingParameters(PrerenderParameters prerenderParameters) {
        this(prerenderParameters.getAdditionalHeaders(), prerenderParameters.getExpectedNoVarySearchHeader(), false, prerenderParameters.getVariationsId());
    }
}
