package org.apache.tika.pipes.fetcher;

import A7.AbstractC0279p0;
import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class FetchKey implements Serializable {
    private static final long serialVersionUID = -3861669115439125268L;
    private String fetchKey;
    private String fetcherName;
    private long rangeEnd;
    private long rangeStart;

    public FetchKey() {
        this.rangeStart = -1L;
        this.rangeEnd = -1L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FetchKey fetchKey = (FetchKey) obj;
            if (this.rangeStart == fetchKey.rangeStart && this.rangeEnd == fetchKey.rangeEnd && Objects.equals(this.fetcherName, fetchKey.fetcherName) && Objects.equals(this.fetchKey, fetchKey.fetchKey)) {
                return true;
            }
        }
        return false;
    }

    public String getFetchKey() {
        return this.fetchKey;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public long getRangeEnd() {
        return this.rangeEnd;
    }

    public long getRangeStart() {
        return this.rangeStart;
    }

    public boolean hasRange() {
        return this.rangeStart > -1 && this.rangeEnd > -1;
    }

    public int hashCode() {
        return Objects.hash(this.fetcherName, this.fetchKey, Long.valueOf(this.rangeStart), Long.valueOf(this.rangeEnd));
    }

    public String toString() {
        String str = this.fetcherName;
        String str2 = this.fetchKey;
        long j8 = this.rangeStart;
        long j10 = this.rangeEnd;
        StringBuilder sbR = AbstractC0279p0.r("FetchKey{fetcherName='", str, "', fetchKey='", str2, "', rangeStart=");
        sbR.append(j8);
        sbR.append(", rangeEnd=");
        sbR.append(j10);
        sbR.append("}");
        return sbR.toString();
    }

    public FetchKey(String str, String str2) {
        this(str, str2, -1L, -1L);
    }

    public FetchKey(String str, String str2, long j8, long j10) {
        this.fetcherName = str;
        this.fetchKey = str2;
        this.rangeStart = j8;
        this.rangeEnd = j10;
    }
}
