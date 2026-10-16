package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajwm {
    private final org.apache.commons.logging.Log a;

    public ajwm(org.apache.commons.logging.Log log) {
        this.a = log == null ? org.apache.commons.logging.LogFactory.getLog(getClass()) : log;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[Catch: ajrm -> 0x00c6, TryCatch #0 {ajrm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0074 A[Catch: ajrm -> 0x00c6, TryCatch #0 {ajrm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: ajrm -> 0x00c6, TryCatch #0 {ajrm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0094 A[Catch: ajrm -> 0x00c6, TryCatch #0 {ajrm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[Catch: ajrm -> 0x00c6, TryCatch #0 {ajrm -> 0x00c6, blocks: (B:3:0x0001, B:5:0x0009, B:6:0x0021, B:8:0x002b, B:10:0x0031, B:35:0x009c, B:37:0x00a6, B:39:0x00ac, B:40:0x00b5, B:20:0x0049, B:23:0x0050, B:26:0x0062, B:28:0x0074, B:30:0x0082, B:32:0x0094, B:34:0x0099), top: B:49:0x0001 }] */
    public final boolean a(defpackage.ajqe ajqeVar, defpackage.ajqj ajqjVar, defpackage.ajrr ajrrVar, defpackage.ajre ajreVar, defpackage.akca akcaVar) {
        defpackage.ajpy ajpyVar;
        try {
            org.apache.commons.logging.Log log = this.a;
            if (log.isDebugEnabled()) {
                log.debug(ajqeVar.a() + " requested authentication");
            }
            java.util.Map mapD = ajrrVar.d(ajqjVar);
            if (mapD.isEmpty()) {
                log.debug("Response contains no authentication challenges");
                return false;
            }
            defpackage.ajqy ajqyVar = ajreVar.b;
            int iOrdinal = ajreVar.a.ordinal();
            if (iOrdinal == 0) {
                if (ajqyVar != null) {
                    ajpyVar = (defpackage.ajpy) mapD.get(ajqyVar.b().toLowerCase(java.util.Locale.ROOT));
                    if (ajpyVar != null) {
                        log.debug("Authorization challenge processed");
                        ajqyVar.d(ajpyVar);
                        if (ajqyVar.e()) {
                            ajreVar.a = defpackage.ajqx.c;
                            return true;
                        }
                        log.debug("Authentication failed");
                        ajrrVar.b(ajqeVar, ajreVar.b, akcaVar);
                        ajreVar.a();
                        ajreVar.a = defpackage.ajqx.d;
                        return false;
                    }
                    ajreVar.a();
                }
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                if (ajqyVar == null) {
                    log.debug("Auth scheme is null");
                    ajrrVar.b(ajqeVar, null, akcaVar);
                    ajreVar.a();
                    ajreVar.a = defpackage.ajqx.d;
                    return false;
                }
                if (ajqyVar != null) {
                    ajpyVar = (defpackage.ajpy) mapD.get(ajqyVar.b().toLowerCase(java.util.Locale.ROOT));
                    if (ajpyVar != null) {
                        log.debug("Authorization challenge processed");
                        ajqyVar.d(ajpyVar);
                        if (ajqyVar.e()) {
                            ajreVar.a = defpackage.ajqx.c;
                            return true;
                        }
                        log.debug("Authentication failed");
                        ajrrVar.b(ajqeVar, ajreVar.b, akcaVar);
                        ajreVar.a();
                        ajreVar.a = defpackage.ajqx.d;
                        return false;
                    }
                    ajreVar.a();
                }
            } else {
                if (iOrdinal == 3) {
                    return false;
                }
                if (iOrdinal == 4) {
                    ajreVar.a();
                }
            }
            java.util.Queue queueA = ajrrVar.a(mapD, ajqeVar, ajqjVar, akcaVar);
            if (queueA.isEmpty()) {
                return false;
            }
            if (log.isDebugEnabled()) {
                log.debug(defpackage.a.bW(queueA, "Selected authentication options: "));
            }
            ajreVar.a = defpackage.ajqx.b;
            defpackage.aguw.c(queueA, "Queue of auth options");
            ajreVar.d = queueA;
            ajreVar.b = null;
            ajreVar.c = null;
            return true;
        } catch (defpackage.ajrm e) {
            org.apache.commons.logging.Log log2 = this.a;
            if (log2.isWarnEnabled()) {
                log2.warn("Malformed challenge: ".concat(java.lang.String.valueOf(e.getMessage())));
            }
            ajreVar.a();
            return false;
        }
    }

    public final boolean b(defpackage.ajqe ajqeVar, defpackage.ajqj ajqjVar, defpackage.ajrr ajrrVar, defpackage.ajre ajreVar, defpackage.akca akcaVar) {
        if (ajrrVar.e(ajqjVar)) {
            this.a.debug("Authentication required");
            if (ajreVar.a == defpackage.ajqx.e) {
                ajrrVar.b(ajqeVar, ajreVar.b, akcaVar);
            }
            return true;
        }
        int iOrdinal = ajreVar.a.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            this.a.debug("Authentication succeeded");
            ajreVar.a = defpackage.ajqx.e;
            ajrrVar.c(ajqeVar, ajreVar.b, akcaVar);
            return false;
        }
        if (iOrdinal == 4) {
            return false;
        }
        ajreVar.a = defpackage.ajqx.a;
        return false;
    }
}
