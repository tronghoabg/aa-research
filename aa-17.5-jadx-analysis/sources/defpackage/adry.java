package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class adry {
    static final Logger a = Logger.getLogger(adiy.class.getName());
    public final Object b = new Object();
    public final adkn c;

    public adry(adkn adknVar, long j, String str) {
        adknVar.getClass();
        this.c = adknVar;
        adkf adkfVar = new adkf();
        adkfVar.a = str.concat(" created");
        adkfVar.b = adkg.b;
        adkfVar.b(j);
        b(adkfVar.a());
    }

    static void a(adkn adknVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + adknVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(adkh adkhVar) {
        int iOrdinal = adkhVar.b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, adkhVar.a);
    }
}
