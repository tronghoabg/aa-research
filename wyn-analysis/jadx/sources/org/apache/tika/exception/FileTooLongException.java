package org.apache.tika.exception;

import Va.M6;
import java.io.IOException;

/* loaded from: classes5.dex */
public class FileTooLongException extends IOException {
    public FileTooLongException(String str) {
        super(str);
    }

    private static String msg(long j8, long j10) {
        return M6.s(M6.u(j8, "File is ", " bytes, but "), j10, " is the maximum length allowed.  You can modify maxLength via the setter on the fetcher.");
    }

    public FileTooLongException(long j8, long j10) {
        super(msg(j8, j10));
    }
}
