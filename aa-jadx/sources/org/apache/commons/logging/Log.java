package org.apache.commons.logging;

/* JADX INFO: loaded from: classes2.dex */
public interface Log {
    void debug(java.lang.Object obj);

    void debug(java.lang.Object obj, java.lang.Throwable th);

    void error(java.lang.Object obj);

    void error(java.lang.Object obj, java.lang.Throwable th);

    void fatal(java.lang.Object obj);

    void fatal(java.lang.Object obj, java.lang.Throwable th);

    void info(java.lang.Object obj);

    void info(java.lang.Object obj, java.lang.Throwable th);

    boolean isDebugEnabled();

    boolean isErrorEnabled();

    boolean isFatalEnabled();

    boolean isInfoEnabled();

    boolean isTraceEnabled();

    boolean isWarnEnabled();

    void trace(java.lang.Object obj);

    void trace(java.lang.Object obj, java.lang.Throwable th);

    void warn(java.lang.Object obj);

    void warn(java.lang.Object obj, java.lang.Throwable th);
}
