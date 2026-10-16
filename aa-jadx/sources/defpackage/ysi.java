package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ysi extends defpackage.yqu {
    private static volatile boolean a = false;
    private final java.util.logging.Logger b;

    public ysi(java.util.logging.Logger logger) {
        this.b = logger;
    }

    private static void d(java.util.logging.Logger logger, java.util.logging.LogRecord logRecord) {
        java.util.logging.Logger parent;
        for (java.util.logging.Handler handler : logger.getHandlers()) {
            handler.publish(logRecord);
        }
        if (!logger.getUseParentHandlers() || (parent = logger.getParent()) == null) {
            return;
        }
        d(parent, logRecord);
    }

    @Override // defpackage.yqu
    public final void a(defpackage.yqt yqtVar) {
        c(new defpackage.ysk(yqtVar, defpackage.yrs.f(), (byte[]) null), yqtVar.h());
    }

    @Override // defpackage.yqu
    public final boolean b(java.util.logging.Level level) {
        return this.b.isLoggable(level);
    }

    public final void c(java.util.logging.LogRecord logRecord, boolean z) {
        if (z) {
            java.util.logging.Logger logger = this.b;
            if (!logger.isLoggable(logRecord.getLevel())) {
                java.util.logging.Filter filter = logger.getFilter();
                if (filter != null) {
                    filter.isLoggable(logRecord);
                }
                if (logger.getClass() == java.util.logging.Logger.class || a) {
                    d(this.b, logRecord);
                    return;
                }
                java.util.logging.Logger logger2 = java.util.logging.Logger.getLogger(java.lang.String.valueOf(logger.getName()).concat(".__forced__"));
                try {
                    logger2.setLevel(java.util.logging.Level.ALL);
                    logger2.log(logRecord);
                    return;
                } catch (java.lang.SecurityException unused) {
                    a = true;
                    java.util.logging.Logger.getLogger("").logp(java.util.logging.Level.SEVERE, "com.google.common.flogger.backend.system.AbstractBackend", "forceLoggingViaChildLogger", "Forcing log statements with Flogger has been partially disabled.\nThe Flogger library cannot modify logger log levels, which is necessary to force log statements. This is likely due to an installed SecurityManager.\nForced log statements will still be published directly to log handlers, but will not be visible to the 'log(LogRecord)' method of Logger subclasses.\n");
                    d(this.b, logRecord);
                    return;
                }
            }
        }
        this.b.log(logRecord);
    }

    @Override // defpackage.yqu
    public final java.lang.String f() {
        return this.b.getName();
    }

    @Override // defpackage.yqu
    public final void g(java.lang.RuntimeException runtimeException, defpackage.yqt yqtVar) {
        c(new defpackage.ysk(runtimeException, yqtVar, defpackage.yrs.f()), yqtVar.h());
    }
}
