package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class adsz {
    static final java.util.logging.Logger a = java.util.logging.Logger.getLogger(defpackage.adjy.class.getName());
    public final java.lang.Object b = new java.lang.Object();
    public final defpackage.adlo c;

    public adsz(defpackage.adlo adloVar, long j, java.lang.String str) {
        adloVar.getClass();
        this.c = adloVar;
        defpackage.adlg adlgVar = new defpackage.adlg();
        adlgVar.a = str.concat(" created");
        adlgVar.b = defpackage.adlh.b;
        adlgVar.b(j);
        b(adlgVar.a());
    }

    static void a(defpackage.adlo adloVar, java.util.logging.Level level, java.lang.String str) {
        java.util.logging.Logger logger = a;
        if (logger.isLoggable(level)) {
            java.util.logging.LogRecord logRecord = new java.util.logging.LogRecord(level, "[" + adloVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(defpackage.adli adliVar) {
        java.util.logging.Level level;
        int iOrdinal = adliVar.b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? java.util.logging.Level.FINEST : java.util.logging.Level.FINE;
        } else {
            level = java.util.logging.Level.FINER;
        }
        synchronized (this.b) {
        }
        a(this.c, level, adliVar.a);
    }
}
