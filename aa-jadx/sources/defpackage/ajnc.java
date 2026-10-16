package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajnc extends java.util.logging.Handler {
    public static final defpackage.ajnc a = new defpackage.ajnc();

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord logRecord) {
        int i;
        logRecord.getClass();
        int i2 = defpackage.ajnb.a;
        java.lang.String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        if (logRecord.getLevel().intValue() > java.util.logging.Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == java.util.logging.Level.INFO.intValue() ? 4 : 3;
        }
        java.lang.String message = logRecord.getMessage();
        message.getClass();
        defpackage.ajnb.a(loggerName, i, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
