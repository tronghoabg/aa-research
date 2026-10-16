package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes2.dex */
public final class ajld implements ajkc {
    public static final List a = ajis.e(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List b = ajis.e(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    private final ajkb c;
    private final ajlc d;
    private volatile ajlj e;
    private final ajib f;
    private volatile boolean g;

    public ajld(ajia ajiaVar, ajkb ajkbVar, ajlc ajlcVar) {
        this.c = ajkbVar;
        this.d = ajlcVar;
        List list = ajiaVar.m;
        ajib ajibVar = ajib.e;
        this.f = list.contains(ajibVar) ? ajibVar : ajib.d;
    }

    @Override // defpackage.ajkc
    public final long a(ajif ajifVar) {
        if (ajkd.b(ajifVar)) {
            return ajis.a(ajifVar);
        }
        return 0L;
    }

    @Override // defpackage.ajkc
    public final ajkb b() {
        return this.c;
    }

    @Override // defpackage.ajkc
    public final ajob c() {
        ajlj ajljVar = this.e;
        ajljVar.getClass();
        return ajljVar;
    }

    @Override // defpackage.ajkc
    public final ajoc d(ajif ajifVar) {
        ajlj ajljVar = this.e;
        ajljVar.getClass();
        return ajljVar.g;
    }

    @Override // defpackage.ajkc
    public final void e() {
        this.g = true;
        ajlj ajljVar = this.e;
        if (ajljVar != null) {
            ajljVar.m(9);
        }
    }

    @Override // defpackage.ajkc
    public final void f() throws IOException {
        ajlj ajljVar = this.e;
        ajljVar.getClass();
        ajljVar.h.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0138  */
    @Override // defpackage.ajkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.ajid r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajld.g(ajid):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    @Override // defpackage.ajkc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() {
        /*
            r4 = this;
            ajlj r4 = r4.e
            r0 = 0
            if (r4 == 0) goto L1f
            monitor-enter(r4)
            ajlh r1 = r4.g     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.b     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            if (r2 == 0) goto L17
            ajmy r1 = r1.d     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.B()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r0
        L18:
            monitor-exit(r4)
            if (r1 != r3) goto L1f
            return r3
        L1c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajld.h():boolean");
    }

    @Override // defpackage.ajkc
    public final ajie i() throws IOException {
        ajkh ajkhVarA;
        ajhv ajhvVar;
        ajlj ajljVar = this.e;
        if (ajljVar == null) {
            throw new IOException("stream wasn't created");
        }
        synchronized (ajljVar) {
            while (ajljVar.f.isEmpty() && ajljVar.k() == 0) {
                boolean zH = ajljVar.h();
                if (zH) {
                    ajljVar.i.d();
                }
                try {
                    ajljVar.g();
                    if (zH) {
                        ajljVar.i.b();
                    }
                } catch (Throwable th) {
                    if (zH) {
                        ajljVar.i.b();
                    }
                    throw th;
                }
            }
            ArrayDeque arrayDeque = ajljVar.f;
            ajkhVarA = null;
            if (arrayDeque.isEmpty()) {
                IOException iOException = ajljVar.k;
                if (iOException != null) {
                    throw iOException;
                }
                int iK = ajljVar.k();
                if (iK != 0) {
                    throw new ajlq(iK);
                }
                throw null;
            }
            Object objRemoveFirst = arrayDeque.removeFirst();
            objRemoveFirst.getClass();
            ajhvVar = (ajhv) objRemoveFirst;
        }
        ajib ajibVar = this.f;
        erb erbVar = new erb((byte[]) null, (short[]) null);
        int iA = ajhvVar.a();
        for (int i = 0; i < iA; i++) {
            String strB = ahdw.b(ajhvVar, i);
            String strC = ahdw.c(ajhvVar, i);
            if (affa.f(strB, ":status")) {
                ajkhVarA = aheh.a("HTTP/1.1 ".concat(strC));
            } else if (!b.contains(strB)) {
                ahdw.l(erbVar, strB, strC);
            }
        }
        if (ajkhVarA == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        ajie ajieVar = new ajie();
        ajieVar.a = ajibVar;
        ajieVar.b = ajkhVarA.b;
        ajieVar.c = ajkhVarA.c;
        ajieVar.b(ahdw.k(erbVar));
        return ajieVar;
    }
}
