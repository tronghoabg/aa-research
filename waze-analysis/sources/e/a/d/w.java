package e.a.d;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f47305a = Logger.getLogger(e.a.j.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final Object f47306b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final e.a.az f47307c;

    w(e.a.az azVar, long j2, String str) {
        com.google.d.b.an.C(azVar, "logId");
        this.f47307c = azVar;
        e.a.ar arVar = new e.a.ar();
        arVar.b(str.concat(" created"));
        arVar.c(e.a.as.f46280b);
        arVar.e(j2);
        c(arVar.a());
    }

    static void b(e.a.az azVar, Level level, String str) {
        Logger logger = f47305a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + String.valueOf(azVar) + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final e.a.az a() {
        return this.f47307c;
    }

    final void c(e.a.at atVar) {
        int iOrdinal = atVar.f46285b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f47306b) {
        }
        b(this.f47307c, level, atVar.f46284a);
    }

    final void d() {
        synchronized (this.f47306b) {
        }
    }
}
