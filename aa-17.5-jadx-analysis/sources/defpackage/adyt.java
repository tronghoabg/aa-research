package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
final class adyt extends adng {
    private static final Logger d = Logger.getLogger(adyt.class.getName());
    public final admf a;
    public final adjj b;
    public volatile boolean c;
    private final adzj e;
    private final byte[] f;
    private final adjt g;
    private final adrw h;
    private boolean i;
    private boolean j;
    private adje k;
    private boolean l;

    public adyt(adzj adzjVar, admf admfVar, admc admcVar, adjj adjjVar, adjt adjtVar, adrw adrwVar) {
        this.e = adzjVar;
        this.a = admfVar;
        this.b = adjjVar;
        this.f = (byte[]) admcVar.b(adue.d);
        this.g = adjtVar;
        this.h = adrwVar;
        adrwVar.b();
    }

    private final void h(Throwable th) {
        d.logp(Level.WARNING, "io.grpc.internal.ServerCallImpl", "handleInternalError", "Cancelling the stream because of internal error", th);
        this.e.c(th instanceof adnt ? ((adnt) th).a : adnq.l.d(th).e("Internal error so cancelling stream."));
        this.h.a(false);
    }

    private final void i(Object obj) {
        woy.aa(this.i, "sendHeaders has not been called");
        woy.aa(!this.j, "call is closed");
        admf admfVar = this.a;
        if (admfVar.a.b() && this.l) {
            h(new adnt(adnq.l.e("Too many responses"), null));
            return;
        }
        this.l = true;
        try {
            this.e.n(admfVar.e.a(obj));
        } catch (Error e) {
            d(adnq.c.e("Server sendMessage() failed with Error"), new admc());
            throw e;
        } catch (RuntimeException e2) {
            h(e2);
        }
    }

    @Override // defpackage.adng
    public final admf a() {
        return this.a;
    }

    @Override // defpackage.adng
    public final void b(Object obj) {
        int i = aeeb.a;
        i(obj);
    }

    @Override // defpackage.adng
    public final void d(adnq adnqVar, admc admcVar) {
        adrw adrwVar;
        int i = aeeb.a;
        woy.aa(!this.j, "call already closed");
        try {
            this.j = true;
            if (adnqVar.g() && this.a.a.b() && !this.l) {
                h(new adnt(adnq.l.e("Completed without a response"), null));
                adrwVar = this.h;
            } else {
                this.e.e(adnqVar, admcVar);
                adrwVar = this.h;
            }
            adrwVar.a(adnqVar.g());
        } catch (Throwable th) {
            this.h.a(adnqVar.g());
            throw th;
        }
    }

    @Override // defpackage.adng
    public final void e(admc admcVar) {
        byte[] bArr;
        int i = aeeb.a;
        woy.aa(!this.i, "sendHeaders has already been called");
        woy.aa(!this.j, "call is closed");
        admcVar.d(adue.g);
        adlx adlxVar = adue.c;
        admcVar.d(adlxVar);
        if (this.k != null && (bArr = this.f) != null) {
            Iterator it = adue.k.g(new String(bArr, adue.a)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.k = adjc.a;
                    break;
                } else if (Objects.equals(it.next(), "identity")) {
                    break;
                }
            }
        } else {
            this.k = adjc.a;
        }
        admcVar.f(adlxVar, "identity");
        adzj adzjVar = this.e;
        adlx adlxVar2 = adue.d;
        admcVar.d(adlxVar2);
        byte[] bArr2 = this.g.c;
        if (bArr2.length != 0) {
            admcVar.f(adlxVar2, bArr2);
        }
        this.i = true;
        adzjVar.j(admcVar);
    }

    @Override // defpackage.adng
    public final void f() {
        int i = aeeb.a;
        this.e.g(2);
    }

    @Override // defpackage.adng
    public final adis g() {
        return this.e.a();
    }
}
