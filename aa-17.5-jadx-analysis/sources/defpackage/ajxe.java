package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxe implements ajso {
    public static final AtomicLong a = new AtomicLong();
    public final Log b = LogFactory.getLog(getClass());
    public ajxk c;
    public ajxn d;
    public volatile boolean e;
    public final ajxh f;
    private final ajtt g;

    public ajxe(ajtt ajttVar) {
        this.g = ajttVar;
        this.f = new ajxh(ajttVar);
    }

    private final void e(ajoz ajozVar) {
        try {
            ajxk ajxkVar = ((ajxn) ajozVar).b;
            if (ajxkVar != null) {
                Object obj = ajxkVar.c;
                ajxkVar.a.l();
                ((ajvc) obj).h();
            }
        } catch (IOException e) {
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug("I/O exception shutting down connection", e);
            }
        }
    }

    @Override // defpackage.ajso
    public final ajsq a(ajtg ajtgVar, Object obj) {
        return new ajxd(this, ajtgVar);
    }

    @Override // defpackage.ajso
    public final ajtt b() {
        return this.g;
    }

    @Override // defpackage.ajso
    public final void c(ajsy ajsyVar, long j, TimeUnit timeUnit) {
        String str;
        synchronized (ajsyVar) {
            Log log = this.b;
            if (log.isDebugEnabled()) {
                log.debug(a.bX(ajsyVar, "Releasing connection "));
            }
            if (((ajxn) ajsyVar).b == null) {
                return;
            }
            ahkp.b(((ajxn) ajsyVar).a == this, "Connection not obtained from this manager");
            synchronized (this) {
                if (this.e) {
                    e(ajsyVar);
                    return;
                }
                try {
                    if (((ajxn) ajsyVar).i() && !((ajxn) ajsyVar).c) {
                        e(ajsyVar);
                    }
                    if (((ajxn) ajsyVar).c) {
                        this.c.e(j, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                        Log log2 = this.b;
                        if (log2.isDebugEnabled()) {
                            if (j > 0) {
                                str = "for " + j + " " + String.valueOf(timeUnit);
                            } else {
                                str = "indefinitely";
                            }
                            log2.debug(a.bz(str, "Connection can be kept alive "));
                        }
                    }
                    ((ajxn) ajsyVar).v();
                    this.d = null;
                    if (this.c.b()) {
                        this.c = null;
                    }
                } catch (Throwable th) {
                    ((ajxn) ajsyVar).v();
                    this.d = null;
                    if (this.c.b()) {
                        this.c = null;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ajso
    public final void d() {
        synchronized (this) {
            this.e = true;
            try {
                ajxk ajxkVar = this.c;
                if (ajxkVar != null) {
                    ajxkVar.a();
                }
            } finally {
                this.c = null;
                this.d = null;
            }
        }
    }

    protected final void finalize() throws Throwable {
        try {
            d();
        } finally {
            super.finalize();
        }
    }
}
