package okhttp3.internal.g.a;

import h.g.b.x;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f56258a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        x.f(logRecord, "record");
        int i2 = c.f56255a;
        String loggerName = logRecord.getLoggerName();
        x.e(loggerName, "getLoggerName(...)");
        int i3 = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        x.e(message, "getMessage(...)");
        c.b(loggerName, i3, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
