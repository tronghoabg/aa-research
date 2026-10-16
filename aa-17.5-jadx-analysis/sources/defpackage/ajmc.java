package defpackage;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes2.dex */
public final class ajmc extends Handler {
    public static final ajmc a = new ajmc();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        logRecord.getClass();
        int i = ajmb.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int i2 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        ajmb.a(loggerName, i2, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
