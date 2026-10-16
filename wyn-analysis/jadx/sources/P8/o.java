package p8;

import java.util.logging.Logger;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final Object f43300a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f43301b = m.class.getName();

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f43302c;

    public final Logger a() {
        Logger logger = this.f43302c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f43300a) {
            try {
                Logger logger2 = this.f43302c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f43301b);
                this.f43302c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
