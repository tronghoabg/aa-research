package defpackage;

import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class yrd extends ypp {
    private static volatile boolean a = false;
    private final Logger b;

    public yrd(Logger logger) {
        this.b = logger;
    }

    private static void d(Logger logger, LogRecord logRecord) {
        Logger parent;
        for (Handler handler : logger.getHandlers()) {
            handler.publish(logRecord);
        }
        if (!logger.getUseParentHandlers() || (parent = logger.getParent()) == null) {
            return;
        }
        d(parent, logRecord);
    }

    @Override // defpackage.ypp
    public final void a(ypo ypoVar) throws SecurityException {
        c(new yrf(ypoVar, yqn.f(), (byte[]) null), ypoVar.h());
    }

    @Override // defpackage.ypp
    public final boolean b(Level level) {
        return this.b.isLoggable(level);
    }

    public final void c(LogRecord logRecord, boolean z) throws SecurityException {
        if (z) {
            Logger logger = this.b;
            if (!logger.isLoggable(logRecord.getLevel())) {
                Filter filter = logger.getFilter();
                if (filter != null) {
                    filter.isLoggable(logRecord);
                }
                if (logger.getClass() == Logger.class || a) {
                    d(this.b, logRecord);
                    return;
                }
                Logger logger2 = Logger.getLogger(String.valueOf(logger.getName()).concat(".__forced__"));
                try {
                    logger2.setLevel(Level.ALL);
                    logger2.log(logRecord);
                    return;
                } catch (SecurityException unused) {
                    a = true;
                    Logger.getLogger("").logp(Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger subclasses.\n");
                    d(this.b, logRecord);
                    return;
                }
            }
        }
        this.b.log(logRecord);
    }

    @Override // defpackage.ypp
    public final String f() {
        return this.b.getName();
    }

    @Override // defpackage.ypp
    public final void g(RuntimeException runtimeException, ypo ypoVar) throws SecurityException {
        c(new yrf(runtimeException, ypoVar, yqn.f()), ypoVar.h());
    }
}
