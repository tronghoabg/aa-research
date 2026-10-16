package od;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import md.AbstractC3537e;
import md.C3530B;
import md.EnumC3529A;

/* renamed from: od.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3704m {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f42010c = Logger.getLogger(AbstractC3537e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Object f42011a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final md.F f42012b;

    public C3704m(md.F f10, long j8, String str) {
        Fe.e.t(str, "description");
        this.f42012b = f10;
        String strConcat = str.concat(" created");
        EnumC3529A enumC3529A = EnumC3529A.f40558a;
        Fe.e.t(strConcat, "description");
        b(new C3530B(strConcat, enumC3529A, j8, null));
    }

    public static void a(md.F f10, Level level, String str) {
        Logger logger = f42010c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + f10 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(C3530B c3530b) {
        int iOrdinal = c3530b.f40563b.ordinal();
        Level level = iOrdinal != 2 ? iOrdinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.f42011a) {
        }
        a(this.f42012b, level, c3530b.f40562a);
    }
}
