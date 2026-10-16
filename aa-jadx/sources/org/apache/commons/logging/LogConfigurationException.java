package org.apache.commons.logging;

/* JADX INFO: loaded from: classes2.dex */
public class LogConfigurationException extends java.lang.RuntimeException {
    private static final long serialVersionUID = 8486587136871052495L;
    protected java.lang.Throwable cause;

    public LogConfigurationException(java.lang.String str, java.lang.Throwable th) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(" (Caused by ");
        stringBuffer.append(th);
        stringBuffer.append(")");
        super(stringBuffer.toString());
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        return this.cause;
    }

    public LogConfigurationException(java.lang.String str) {
        super(str);
        this.cause = null;
    }

    public LogConfigurationException() {
        this.cause = null;
    }

    public LogConfigurationException(java.lang.Throwable th) {
        this(th == null ? null : th.toString(), th);
    }
}
