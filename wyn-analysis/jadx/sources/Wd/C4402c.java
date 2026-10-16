package wd;

import Ad.g;
import Cd.AbstractC0338f;
import Cd.AbstractC0345m;
import Cd.AbstractC0354w;
import Cd.C0333a;
import Cd.C0348p;
import Cd.F;
import Cd.H;
import Cd.N;
import Cd.S;
import Cd.T;
import Cd.k0;
import Cd.l0;
import Ef.C0499l0;
import Ef.C0505o0;
import Ef.E;
import Ef.InterfaceC0501m0;
import com.moloco.sdk.internal.publisher.C1915d;
import ff.o;
import java.io.Closeable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import tf.l;
import y3.C4552j;

/* renamed from: wd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4402c implements E, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f47464l = AtomicIntegerFieldUpdater.newUpdater(C4402c.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    public final Ad.e f47465a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47466b;

    /* renamed from: c, reason: collision with root package name */
    public final C0505o0 f47467c;

    @NotNull
    private volatile /* synthetic */ int closed = 0;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3108h f47468d;

    /* renamed from: e, reason: collision with root package name */
    public final Fd.f f47469e;

    /* renamed from: f, reason: collision with root package name */
    public final Gd.b f47470f;

    /* renamed from: g, reason: collision with root package name */
    public final Fd.f f47471g;

    /* renamed from: h, reason: collision with root package name */
    public final Gd.b f47472h;

    /* renamed from: i, reason: collision with root package name */
    public final Nd.d f47473i;

    /* renamed from: j, reason: collision with root package name */
    public final C4552j f47474j;
    public final C4403d k;

    public C4402c(Ad.e eVar, C4403d c4403d) {
        int i5 = 28;
        this.f47465a = eVar;
        C0505o0 c0505o0 = new C0505o0((InterfaceC0501m0) eVar.getCoroutineContext().get(C0499l0.f3748a));
        this.f47467c = c0505o0;
        this.f47468d = eVar.getCoroutineContext().plus(c0505o0);
        this.f47469e = new Fd.f(0);
        this.f47470f = new Gd.b(1);
        Fd.f fVar = new Fd.f(1);
        this.f47471g = fVar;
        this.f47472h = new Gd.b(0);
        this.f47473i = new Nd.d();
        this.f47474j = new C4552j(12);
        C4403d c4403d2 = new C4403d();
        this.k = c4403d2;
        if (this.f47466b) {
            c0505o0.invokeOnCompletion(new C4400a(this));
        }
        InterfaceC3103c interfaceC3103c = null;
        fVar.f(Fd.f.f4066o, new k0(this, eVar, null));
        fVar.f(Fd.f.f4067p, new C0333a(this, interfaceC3103c, 8));
        c4403d2.a(T.f2036b, new C1915d(i5));
        c4403d2.a(AbstractC0338f.f2101c, new C1915d(i5));
        c4403d2.a(AbstractC0354w.f2184d, new C1915d(i5));
        if (c4403d.f47480f) {
            c4403d2.f47477c.put("DefaultTransformers", new C1915d(27));
        }
        c4403d2.a(l0.f2133b, new C1915d(i5));
        Dd.c cVar = F.f2001b;
        c4403d2.a(cVar, new C1915d(i5));
        if (c4403d.f47479e) {
            c4403d2.a(S.f2034d, new C1915d(i5));
        }
        c4403d2.f47479e = c4403d.f47479e;
        c4403d2.f47480f = c4403d.f47480f;
        c4403d2.f47475a.putAll(c4403d.f47475a);
        c4403d2.f47476b.putAll(c4403d.f47476b);
        c4403d2.f47477c.putAll(c4403d.f47477c);
        if (c4403d.f47480f) {
            c4403d2.a(N.f2019b, new C1915d(i5));
        }
        Nd.a aVar = AbstractC0345m.f2136a;
        c4403d2.a(cVar, new g(c4403d2));
        Iterator it = c4403d2.f47475a.values().iterator();
        while (it.hasNext()) {
            ((l) it.next()).invoke(this);
        }
        Iterator it2 = c4403d2.f47477c.values().iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).invoke(this);
        }
        this.f47470f.f(Gd.b.f4715j, new C0348p(this, interfaceC3103c, 5));
        this.f47466b = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(Fd.c r5, lf.AbstractC3464c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wd.C4401b
            if (r0 == 0) goto L13
            r0 = r6
            wd.b r0 = (wd.C4401b) r0
            int r1 = r0.f47463c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47463c = r1
            goto L18
        L13:
            wd.b r0 = new wd.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f47461a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f47463c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            wa.a r6 = Hd.a.f5001a
            y3.j r2 = r4.f47474j
            r2.q(r6)
            java.lang.Object r6 = r5.f4048d
            r0.f47463c = r3
            Fd.f r2 = r4.f47469e
            java.lang.Object r6 = r2.a(r5, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r5 = "null cannot be cast to non-null type io.ktor.client.call.HttpClientCall"
            kotlin.jvm.internal.AbstractC3340k.c(r6, r5)
            xd.c r6 = (xd.C4511c) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.C4402c.a(Fd.c, lf.c):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Exception {
        if (f47464l.compareAndSet(this, 0, 1)) {
            Nd.d dVar = (Nd.d) this.f47473i.b(H.f2003a);
            for (Nd.a aVar : o.S0(dVar.c().keySet())) {
                AbstractC3340k.c(aVar, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
                Object objB = dVar.b(aVar);
                if (objB instanceof AutoCloseable) {
                    ((AutoCloseable) objB).close();
                }
            }
            this.f47467c.Y();
            if (this.f47466b) {
                this.f47465a.close();
            }
        }
    }

    @Override // Ef.E
    public final InterfaceC3108h getCoroutineContext() {
        return this.f47468d;
    }

    public final String toString() {
        return "HttpClient[" + this.f47465a + ']';
    }
}
