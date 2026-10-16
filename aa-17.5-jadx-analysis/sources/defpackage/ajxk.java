package defpackage;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.logging.Log;

@Deprecated
/* loaded from: classes2.dex */
final class ajxk extends akav {
    public final ajtl a;
    private final Log e;

    public ajxk(Log log, String str, ajtg ajtgVar, ajxg ajxgVar, TimeUnit timeUnit) {
        super(str, ajtgVar, ajxgVar, timeUnit);
        this.e = log;
        this.a = new ajtl(ajtgVar);
    }

    public final void a() {
        try {
            ((ajvc) this.c).close();
        } catch (IOException e) {
            this.e.debug("I/O error closing connection", e);
        }
    }

    public final boolean b() {
        return !((ajvc) this.c).f;
    }

    @Override // defpackage.akav
    public final boolean c(long j) {
        boolean zC = super.c(j);
        if (zC) {
            Log log = this.e;
            if (log.isDebugEnabled()) {
                log.debug("Connection " + toString() + " expired @ " + new Date(d()).toString());
                return true;
            }
        }
        return zC;
    }
}
