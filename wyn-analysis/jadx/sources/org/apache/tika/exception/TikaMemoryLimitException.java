package org.apache.tika.exception;

import Va.M6;

/* loaded from: classes5.dex */
public class TikaMemoryLimitException extends TikaException {
    public TikaMemoryLimitException(String str) {
        super(str);
    }

    private static String msg(long j8, long j10) {
        return M6.s(M6.u(j8, "Tried to allocate ", " bytes, but "), j10, " is the maximum allowed. Please open an issue https://issues.apache.org/jira/projects/TIKA if you believe this file is not corrupt.");
    }

    public TikaMemoryLimitException(long j8, long j10) {
        super(msg(j8, j10));
    }
}
