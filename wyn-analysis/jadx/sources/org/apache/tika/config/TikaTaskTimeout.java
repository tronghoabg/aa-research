package org.apache.tika.config;

import org.apache.tika.parser.ParseContext;

/* loaded from: classes5.dex */
public class TikaTaskTimeout {
    private final long timeoutMillis;

    public TikaTaskTimeout(long j8) {
        this.timeoutMillis = j8;
    }

    public long getTimeoutMillis() {
        return this.timeoutMillis;
    }

    public static long getTimeoutMillis(ParseContext parseContext, long j8) {
        TikaTaskTimeout tikaTaskTimeout = (TikaTaskTimeout) parseContext.get(TikaTaskTimeout.class);
        return tikaTaskTimeout == null ? j8 : tikaTaskTimeout.getTimeoutMillis();
    }
}
