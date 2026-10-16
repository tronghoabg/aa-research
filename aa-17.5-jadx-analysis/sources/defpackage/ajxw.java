package defpackage;

import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxw implements ajso {
    public final Log a = LogFactory.getLog(getClass());
    protected final ajtt b;
    protected final ajxt c;
    protected final ajxh d;

    @Deprecated
    public ajxw(akas akasVar, ajtt ajttVar) {
        this.b = ajttVar;
        new ajte();
        ajxh ajxhVar = new ajxh(ajttVar);
        this.d = ajxhVar;
        ajtd ajtdVar = (ajtd) akasVar.a("http.conn-manager.max-per-route");
        this.c = new ajxt(ajxhVar, ajtdVar == null ? ajtc.a : ajtdVar, akasVar.c("http.conn-manager.max-total", 20));
    }

    @Override // defpackage.ajso
    public final ajsq a(ajtg ajtgVar, Object obj) {
        return new ajxv(this, new ajxs(this.c, new ajxy(), ajtgVar, obj), ajtgVar);
    }

    @Override // defpackage.ajso
    public final ajtt b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    @Override // defpackage.ajso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ajsy r9, long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ajxr
            java.lang.String r1 = "Connection class mismatch, connection not obtained from this manager"
            defpackage.ahgm.a(r0, r1)
            ajxr r9 = (defpackage.ajxr) r9
            ajxb r0 = r9.e
            if (r0 == 0) goto L19
            ajso r0 = r9.a
            if (r0 != r8) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            java.lang.String r1 = "Connection not obtained from this manager"
            defpackage.ahkp.b(r0, r1)
        L19:
            monitor-enter(r9)
            ajxb r1 = r9.e     // Catch: java.lang.Throwable -> Lae
            if (r1 != 0) goto L20
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            return
        L20:
            boolean r0 = r9.i()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57
            if (r0 == 0) goto L2d
            boolean r0 = r9.b     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57
            if (r0 != 0) goto L2d
            r9.h()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57
        L2d:
            boolean r4 = r9.b     // Catch: java.lang.Throwable -> Lae
            org.apache.commons.logging.Log r0 = r8.a     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r0.isDebugEnabled()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L44
            if (r4 == 0) goto L3f
            java.lang.String r2 = "Released connection is reusable."
            r0.debug(r2)     // Catch: java.lang.Throwable -> Lae
            goto L44
        L3f:
            java.lang.String r2 = "Released connection is not reusable."
            r0.debug(r2)     // Catch: java.lang.Throwable -> Lae
        L44:
            r9.w()     // Catch: java.lang.Throwable -> Lae
            ajxt r2 = r8.c     // Catch: java.lang.Throwable -> Lae
            r3 = r1
            ajxq r3 = (defpackage.ajxq) r3     // Catch: java.lang.Throwable -> Lae
            r5 = r10
            r7 = r12
            r2.b(r3, r4, r5, r7)     // Catch: java.lang.Throwable -> Lae
            goto L88
        L52:
            r0 = move-exception
            r3 = r10
            r5 = r12
        L55:
            r10 = r0
            goto L8c
        L57:
            r0 = move-exception
            r3 = r10
            r5 = r12
            org.apache.commons.logging.Log r10 = r8.a     // Catch: java.lang.Throwable -> L8a
            boolean r11 = r10.isDebugEnabled()     // Catch: java.lang.Throwable -> L8a
            if (r11 == 0) goto L67
            java.lang.String r11 = "Exception shutting down released connection."
            r10.debug(r11, r0)     // Catch: java.lang.Throwable -> L8a
        L67:
            boolean r2 = r9.b     // Catch: java.lang.Throwable -> Lae
            org.apache.commons.logging.Log r10 = r8.a     // Catch: java.lang.Throwable -> Lae
            boolean r11 = r10.isDebugEnabled()     // Catch: java.lang.Throwable -> Lae
            if (r11 == 0) goto L7e
            if (r2 == 0) goto L79
            java.lang.String r11 = "Released connection is reusable."
            r10.debug(r11)     // Catch: java.lang.Throwable -> Lae
            goto L7e
        L79:
            java.lang.String r11 = "Released connection is not reusable."
            r10.debug(r11)     // Catch: java.lang.Throwable -> Lae
        L7e:
            r9.w()     // Catch: java.lang.Throwable -> Lae
            ajxt r0 = r8.c     // Catch: java.lang.Throwable -> Lae
            ajxq r1 = (defpackage.ajxq) r1     // Catch: java.lang.Throwable -> Lae
            r0.b(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> Lae
        L88:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            return
        L8a:
            r0 = move-exception
            goto L55
        L8c:
            boolean r2 = r9.b     // Catch: java.lang.Throwable -> Lae
            org.apache.commons.logging.Log r11 = r8.a     // Catch: java.lang.Throwable -> Lae
            boolean r12 = r11.isDebugEnabled()     // Catch: java.lang.Throwable -> Lae
            if (r12 == 0) goto La3
            if (r2 == 0) goto L9e
            java.lang.String r12 = "Released connection is reusable."
            r11.debug(r12)     // Catch: java.lang.Throwable -> Lae
            goto La3
        L9e:
            java.lang.String r12 = "Released connection is not reusable."
            r11.debug(r12)     // Catch: java.lang.Throwable -> Lae
        La3:
            r9.w()     // Catch: java.lang.Throwable -> Lae
            ajxt r0 = r8.c     // Catch: java.lang.Throwable -> Lae
            ajxq r1 = (defpackage.ajxq) r1     // Catch: java.lang.Throwable -> Lae
            r0.b(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> Lae
            throw r10     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            r8 = r0
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lae
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxw.c(ajsy, long, java.util.concurrent.TimeUnit):void");
    }

    @Override // defpackage.ajso
    public final void d() {
        this.a.debug("Shutting down");
        ajxt ajxtVar = this.c;
        Lock lock = ajxtVar.d;
        lock.lock();
        try {
            if (ajxtVar.j) {
                lock.unlock();
                return;
            }
            ajxtVar.j = true;
            Iterator it = ajxtVar.f.iterator();
            while (it.hasNext()) {
                ajxq ajxqVar = (ajxq) it.next();
                it.remove();
                ajxtVar.a(ajxqVar);
            }
            Iterator it2 = ajxtVar.g.iterator();
            while (it2.hasNext()) {
                ajxq ajxqVar2 = (ajxq) it2.next();
                it2.remove();
                Log log = ajxtVar.c;
                if (log.isDebugEnabled()) {
                    log.debug("Closing connection [" + String.valueOf(ajxqVar2.a) + "][" + String.valueOf(ajxqVar2.b) + "]");
                }
                ajxtVar.a(ajxqVar2);
            }
            Iterator it3 = ajxtVar.h.iterator();
            while (it3.hasNext()) {
                ajxx ajxxVar = (ajxx) it3.next();
                it3.remove();
                ajxxVar.b();
            }
            ajxtVar.i.clear();
        } finally {
            ajxtVar.d.unlock();
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
