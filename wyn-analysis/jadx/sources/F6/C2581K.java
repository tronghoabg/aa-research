package f6;

import a6.C1333b;
import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.Map;
import s8.C4026b;
import t6.InterfaceC4144l;
import u6.AbstractC4256a;

/* renamed from: f6.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2581K {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f34901a;

    /* renamed from: b, reason: collision with root package name */
    public final t6.J f34902b;

    /* renamed from: c, reason: collision with root package name */
    public final b7.k f34903c;

    /* renamed from: d, reason: collision with root package name */
    public final C2584N f34904d;

    /* renamed from: e, reason: collision with root package name */
    public final C4026b f34905e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f34907g;

    /* renamed from: i, reason: collision with root package name */
    public long f34909i;

    /* renamed from: j, reason: collision with root package name */
    public t6.n f34910j;
    public U k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34911l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2584N f34912m;

    /* renamed from: f, reason: collision with root package name */
    public final J5.n f34906f = new J5.n();

    /* renamed from: h, reason: collision with root package name */
    public boolean f34908h = true;

    public C2581K(C2584N c2584n, Uri uri, InterfaceC4144l interfaceC4144l, b7.k kVar, C2584N c2584n2, C4026b c4026b) {
        this.f34912m = c2584n;
        this.f34901a = uri;
        this.f34902b = new t6.J(interfaceC4144l);
        this.f34903c = kVar;
        this.f34904d = c2584n2;
        this.f34905e = c4026b;
        C2603p.f35087a.getAndIncrement();
        this.f34910j = a(0L);
    }

    public final t6.n a(long j8) {
        Map map = Collections.EMPTY_MAP;
        this.f34912m.getClass();
        Map map2 = C2584N.L;
        Uri uri = this.f34901a;
        AbstractC4256a.k(uri, "The uri must be set.");
        return new t6.n(uri, 1, null, map2, j8, -1L, 6);
    }

    public final void b() {
        InterfaceC4144l c2602o;
        int i5;
        int iG = 0;
        while (iG == 0 && !this.f34907g) {
            try {
                long j8 = this.f34906f.f5655a;
                t6.n nVarA = a(j8);
                this.f34910j = nVarA;
                long jT = this.f34902b.t(nVarA);
                if (jT != -1) {
                    jT += j8;
                    C2584N c2584n = this.f34912m;
                    c2584n.f34942o.post(new RunnableC2580J(c2584n, 2));
                }
                long j10 = jT;
                this.f34912m.f34944q = C1333b.c(this.f34902b.f45841a.d());
                t6.J j11 = this.f34902b;
                C1333b c1333b = this.f34912m.f34944q;
                if (c1333b == null || (i5 = c1333b.f17386f) == -1) {
                    c2602o = j11;
                } else {
                    c2602o = new C2602o(j11, i5, this);
                    C2584N c2584n2 = this.f34912m;
                    c2584n2.getClass();
                    U uA = c2584n2.A(new C2583M(0, true));
                    this.k = uA;
                    uA.a(C2584N.f34917M);
                }
                this.f34903c.y(c2602o, this.f34901a, this.f34902b.f45841a.d(), j8, j10, this.f34904d);
                if (this.f34912m.f34944q != null) {
                    J5.k kVar = (J5.k) this.f34903c.f19397c;
                    if (kVar instanceof Q5.d) {
                        ((Q5.d) kVar).f9871p = true;
                    }
                }
                if (this.f34908h) {
                    b7.k kVar2 = this.f34903c;
                    long j12 = this.f34909i;
                    J5.k kVar3 = (J5.k) kVar2.f19397c;
                    kVar3.getClass();
                    kVar3.a(j8, j12);
                    this.f34908h = false;
                }
                while (iG == 0 && !this.f34907g) {
                    try {
                        C4026b c4026b = this.f34905e;
                        synchronized (c4026b) {
                            while (!c4026b.f45322b) {
                                c4026b.wait();
                            }
                        }
                        b7.k kVar4 = this.f34903c;
                        J5.n nVar = this.f34906f;
                        J5.k kVar5 = (J5.k) kVar4.f19397c;
                        kVar5.getClass();
                        J5.h hVar = (J5.h) kVar4.f19398d;
                        hVar.getClass();
                        iG = kVar5.g(hVar, nVar);
                        J5.h hVar2 = (J5.h) this.f34903c.f19398d;
                        long j13 = hVar2 != null ? hVar2.f5646d : -1L;
                        if (j13 > this.f34912m.f34937i + j8) {
                            this.f34905e.b();
                            C2584N c2584n3 = this.f34912m;
                            c2584n3.f34942o.post(c2584n3.f34941n);
                            j8 = j13;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iG == 1) {
                    iG = 0;
                } else {
                    J5.h hVar3 = (J5.h) this.f34903c.f19398d;
                    if ((hVar3 != null ? hVar3.f5646d : -1L) != -1) {
                        this.f34906f.f5655a = hVar3 != null ? hVar3.f5646d : -1L;
                    }
                }
                t6.J j14 = this.f34902b;
                if (j14 != null) {
                    try {
                        j14.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (Throwable th) {
                if (iG != 1) {
                    J5.h hVar4 = (J5.h) this.f34903c.f19398d;
                    if ((hVar4 != null ? hVar4.f5646d : -1L) != -1) {
                        this.f34906f.f5655a = hVar4 != null ? hVar4.f5646d : -1L;
                    }
                }
                t6.J j15 = this.f34902b;
                if (j15 != null) {
                    try {
                        j15.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        }
    }
}
