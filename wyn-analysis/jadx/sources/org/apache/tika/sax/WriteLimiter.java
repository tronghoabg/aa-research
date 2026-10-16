package org.apache.tika.sax;

/* loaded from: classes5.dex */
public interface WriteLimiter {
    int getWriteLimit();

    boolean isThrowOnWriteLimitReached();
}
