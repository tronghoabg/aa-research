package g2;

import Va.C1062m8;
import ac.C1346a;
import android.net.Uri;
import android.util.SparseArray;
import io.ktor.utils.io.T;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import l8.AbstractC3437s;
import l8.j0;

/* renamed from: g2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2693n implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final C1346a f35628a;

    /* renamed from: b, reason: collision with root package name */
    public final C1346a f35629b;

    /* renamed from: c, reason: collision with root package name */
    public final String f35630c;

    /* renamed from: d, reason: collision with root package name */
    public final SocketFactory f35631d;

    /* renamed from: h, reason: collision with root package name */
    public Uri f35635h;

    /* renamed from: j, reason: collision with root package name */
    public Y1.t f35637j;
    public String k;

    /* renamed from: m, reason: collision with root package name */
    public RunnableC2692m f35639m;

    /* renamed from: n, reason: collision with root package name */
    public C1062m8 f35640n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f35642p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35643q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f35644r;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f35632e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f35633f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final E4.n f35634g = new E4.n(this);

    /* renamed from: i, reason: collision with root package name */
    public z f35636i = new z(new Y2.B(this));

    /* renamed from: l, reason: collision with root package name */
    public long f35638l = 60000;

    /* renamed from: s, reason: collision with root package name */
    public long f35645s = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    public int f35641o = -1;

    public C2693n(C1346a c1346a, C1346a c1346a2, String str, Uri uri, SocketFactory socketFactory) {
        this.f35628a = c1346a;
        this.f35629b = c1346a2;
        this.f35630c = str;
        this.f35631d = socketFactory;
        this.f35635h = AbstractC2671A.f(uri);
        this.f35637j = AbstractC2671A.d(uri);
    }

    public static void a(C2693n c2693n, T t10) {
        c2693n.getClass();
        if (c2693n.f35642p) {
            c2693n.f35629b.L(t10);
            return;
        }
        String message = t10.getMessage();
        if (message == null) {
            message = "";
        }
        c2693n.f35628a.N(message, t10);
    }

    public final void b() {
        long jW;
        q qVar = (q) this.f35632e.pollFirst();
        if (qVar == null) {
            s sVar = (s) this.f35629b.f17489b;
            long j8 = sVar.f35671n;
            if (j8 != -9223372036854775807L) {
                jW = Q1.x.W(j8);
            } else {
                long j10 = sVar.f35672o;
                jW = j10 != -9223372036854775807L ? Q1.x.W(j10) : 0L;
            }
            sVar.f35662d.i(jW);
            return;
        }
        Uri uri = qVar.f35650b.f35578b.f35690b;
        Q1.k.h(qVar.f35651c);
        String str = qVar.f35651c;
        String str2 = this.k;
        E4.n nVar = this.f35634g;
        ((C2693n) nVar.f2940d).f35641o = 0;
        AbstractC3437s.c("Transport", str);
        nVar.y(nVar.k(10, str2, j0.c(1, new Object[]{"Transport", str}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws NumberFormatException {
        RunnableC2692m runnableC2692m = this.f35639m;
        if (runnableC2692m != null) {
            runnableC2692m.close();
            this.f35639m = null;
            Uri uri = this.f35635h;
            String str = this.k;
            str.getClass();
            E4.n nVar = this.f35634g;
            C2693n c2693n = (C2693n) nVar.f2940d;
            int i5 = c2693n.f35641o;
            if (i5 != -1 && i5 != 0) {
                c2693n.f35641o = 0;
                nVar.y(nVar.k(12, str, j0.f40119g, uri));
            }
        }
        this.f35636i.close();
    }

    public final Socket d(Uri uri) {
        Q1.k.c(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f35631d.createSocket(host, port);
    }

    public final void h(long j8) throws NumberFormatException {
        if (this.f35641o == 2 && !this.f35644r) {
            Uri uri = this.f35635h;
            String str = this.k;
            str.getClass();
            E4.n nVar = this.f35634g;
            C2693n c2693n = (C2693n) nVar.f2940d;
            Q1.k.g(c2693n.f35641o == 2);
            nVar.y(nVar.k(5, str, j0.f40119g, uri));
            c2693n.f35644r = true;
        }
        this.f35645s = j8;
    }

    public final void i(long j8) {
        Uri uri = this.f35635h;
        String str = this.k;
        str.getClass();
        E4.n nVar = this.f35634g;
        int i5 = ((C2693n) nVar.f2940d).f35641o;
        Q1.k.g(i5 == 1 || i5 == 2);
        C2673C c2673c = C2673C.f35515c;
        Object[] objArr = {Double.valueOf(j8 / 1000.0d)};
        int i10 = Q1.x.f9724a;
        nVar.y(nVar.k(6, str, j0.c(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }
}
