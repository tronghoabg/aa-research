package androidx.webkit;

import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PrerenderParameters {
    private final Map<String, String> mAdditionalHeaders;
    private final NoVarySearchHeader mExpectedNoVarySearchHeader;
    private final Integer mVariationsId;

    /* compiled from: WazeSource */
    public final class Builder {
        private final Map<String, String> mAdditionalHeaders = new HashMap();
        private NoVarySearchHeader mExpectedNoVarySearchHeader;
        private Integer mVariationsId;

        public Builder addAdditionalHeader(String str, String str2) {
            this.mAdditionalHeaders.put(str, str2);
            return this;
        }

        public Builder addAdditionalHeaders(Map<String, String> map) {
            this.mAdditionalHeaders.putAll(map);
            return this;
        }

        public PrerenderParameters build() {
            return new PrerenderParameters(this.mAdditionalHeaders, this.mExpectedNoVarySearchHeader, this.mVariationsId);
        }

        @Deprecated
        public Builder setExpectedNoVarySearchData(NoVarySearchHeader noVarySearchHeader) {
            this.mExpectedNoVarySearchHeader = noVarySearchHeader;
            return this;
        }

        public Builder setExpectedNoVarySearchHeader(NoVarySearchHeader noVarySearchHeader) {
            this.mExpectedNoVarySearchHeader = noVarySearchHeader;
            return this;
        }

        public Builder setVariationsId(Integer num) {
            this.mVariationsId = num;
            return this;
        }
    }

    private PrerenderParameters(Map<String, String> map, NoVarySearchHeader noVarySearchHeader, Integer num) {
        this.mAdditionalHeaders = map;
        this.mExpectedNoVarySearchHeader = noVarySearchHeader;
        this.mVariationsId = num;
    }

    public Map<String, String> getAdditionalHeaders() {
        return this.mAdditionalHeaders;
    }

    @Deprecated
    public NoVarySearchHeader getExpectedNoVarySearchData() {
        return this.mExpectedNoVarySearchHeader;
    }

    public NoVarySearchHeader getExpectedNoVarySearchHeader() {
        return this.mExpectedNoVarySearchHeader;
    }

    public Integer getVariationsId() {
        return this.mVariationsId;
    }
}
