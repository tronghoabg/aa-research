package org.apache.tika.exception;

import A7.AbstractC0279p0;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class WriteLimitReachedException extends SAXException {
    private static final int MAX_DEPTH = 100;
    private final int writeLimit;

    public WriteLimitReachedException(int i5) {
        this.writeLimit = i5;
    }

    public static boolean isWriteLimitReached(Throwable th) {
        return isWriteLimitReached(th, 0);
    }

    public static void throwIfWriteLimitReached(Exception exc) throws SAXException {
        throwIfWriteLimitReached(exc, 0);
    }

    @Override // org.xml.sax.SAXException, java.lang.Throwable
    public String getMessage() {
        return AbstractC0279p0.i(this.writeLimit, "Your document contained more than ", " characters, and so your requested limit has been reached. To receive the full text of the document, increase your limit. (Text up to the limit is however available).");
    }

    private static boolean isWriteLimitReached(Throwable th, int i5) {
        if (th == null || i5 > 100) {
            return false;
        }
        if (th instanceof WriteLimitReachedException) {
            return true;
        }
        return isWriteLimitReached(th.getCause(), i5 + 1);
    }

    private static void throwIfWriteLimitReached(Throwable th, int i5) throws SAXException {
        if (th != null && i5 <= 100) {
            if (th instanceof WriteLimitReachedException) {
                throw ((SAXException) th);
            }
            throwIfWriteLimitReached(th.getCause(), i5 + 1);
        }
    }
}
