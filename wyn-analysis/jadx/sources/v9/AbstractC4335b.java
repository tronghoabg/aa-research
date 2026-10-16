package v9;

import com.google.android.gms.tasks.Task;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import g5.RunnableC2707d;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import md.AbstractC3538f;
import md.j0;
import md.k0;
import me.C3558a;
import w9.C4386e;
import w9.C4393l;
import w9.EnumC4385d;

/* renamed from: v9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4335b {

    /* renamed from: m, reason: collision with root package name */
    public static final long f47043m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f47044n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f47045o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f47046p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f47047q;

    /* renamed from: a, reason: collision with root package name */
    public C3558a f47048a;

    /* renamed from: b, reason: collision with root package name */
    public C3558a f47049b;

    /* renamed from: c, reason: collision with root package name */
    public final m f47050c;

    /* renamed from: d, reason: collision with root package name */
    public final F6.r f47051d;

    /* renamed from: f, reason: collision with root package name */
    public final C4386e f47053f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC4385d f47054g;

    /* renamed from: j, reason: collision with root package name */
    public k f47057j;
    public final C4393l k;

    /* renamed from: l, reason: collision with root package name */
    public final s f47058l;

    /* renamed from: h, reason: collision with root package name */
    public r f47055h = r.f47105a;

    /* renamed from: i, reason: collision with root package name */
    public long f47056i = 0;

    /* renamed from: e, reason: collision with root package name */
    public final RunnableC2707d f47052e = new RunnableC2707d(this, 28);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f47043m = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f47044n = timeUnit2.toMillis(1L);
        f47045o = timeUnit2.toMillis(1L);
        f47046p = timeUnit.toMillis(10L);
        f47047q = timeUnit.toMillis(10L);
    }

    public AbstractC4335b(m mVar, F6.r rVar, C4386e c4386e, EnumC4385d enumC4385d, EnumC4385d enumC4385d2, s sVar) {
        this.f47050c = mVar;
        this.f47051d = rVar;
        this.f47053f = c4386e;
        this.f47054g = enumC4385d2;
        this.f47058l = sVar;
        this.k = new C4393l(c4386e, enumC4385d, f47043m, f47044n);
    }

    public final void a(r rVar, k0 k0Var) {
        A6.c.z(d(), "Only started streams should be closed.", new Object[0]);
        r rVar2 = r.f47109e;
        A6.c.z(rVar == rVar2 || k0Var.f(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f47053f.d();
        HashSet hashSet = g.f47065d;
        j0 j0Var = k0Var.f40685a;
        Throwable th = k0Var.f40687c;
        if (th instanceof SSLHandshakeException) {
            th.getMessage().contains("no ciphers available");
        }
        C3558a c3558a = this.f47049b;
        if (c3558a != null) {
            c3558a.n();
            this.f47049b = null;
        }
        C3558a c3558a2 = this.f47048a;
        if (c3558a2 != null) {
            c3558a2.n();
            this.f47048a = null;
        }
        C4393l c4393l = this.k;
        C3558a c3558a3 = c4393l.f47454h;
        if (c3558a3 != null) {
            c3558a3.n();
            c4393l.f47454h = null;
        }
        this.f47056i++;
        j0 j0Var2 = j0.OK;
        j0 j0Var3 = k0Var.f40685a;
        if (j0Var3 == j0Var2) {
            c4393l.f47452f = 0L;
        } else if (j0Var3 == j0.RESOURCE_EXHAUSTED) {
            Ba.c.p(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", 1, Integer.valueOf(System.identityHashCode(this)));
            c4393l.f47452f = c4393l.f47451e;
        } else if (j0Var3 == j0.UNAUTHENTICATED && this.f47055h != r.f47108d) {
            m mVar = this.f47050c;
            mVar.f47093b.Y();
            mVar.f47094c.X();
        } else if (j0Var3 == j0.UNAVAILABLE && ((th instanceof UnknownHostException) || (th instanceof ConnectException))) {
            c4393l.f47451e = f47047q;
        }
        if (rVar != rVar2) {
            Ba.c.p(getClass().getSimpleName(), "(%x) Performing stream teardown", 1, Integer.valueOf(System.identityHashCode(this)));
            h();
        }
        if (this.f47057j != null) {
            if (k0Var.f()) {
                Ba.c.p(getClass().getSimpleName(), "(%x) Closing stream client-side", 1, Integer.valueOf(System.identityHashCode(this)));
                this.f47057j.b();
            }
            this.f47057j = null;
        }
        this.f47055h = rVar;
        this.f47058l.a(k0Var);
    }

    public final void b() {
        A6.c.z(!d(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f47053f.d();
        this.f47055h = r.f47105a;
        this.k.f47452f = 0L;
    }

    public final boolean c() {
        this.f47053f.d();
        r rVar = this.f47055h;
        return rVar == r.f47107c || rVar == r.f47108d;
    }

    public final boolean d() {
        this.f47053f.d();
        r rVar = this.f47055h;
        return rVar == r.f47106b || rVar == r.f47110f || c();
    }

    public abstract void e(MessageLite messageLite);

    public abstract void f(MessageLite messageLite);

    public void g() {
        this.f47053f.d();
        int i5 = 0;
        A6.c.z(this.f47057j == null, "Last call still set", new Object[0]);
        A6.c.z(this.f47049b == null, "Idle timer still set", new Object[0]);
        r rVar = this.f47055h;
        r rVar2 = r.f47109e;
        if (rVar == rVar2) {
            A6.c.z(rVar == rVar2, "Should only perform backoff in an error state", new Object[0]);
            this.f47055h = r.f47110f;
            this.k.a(new RunnableC4334a(this, i5));
            return;
        }
        A6.c.z(rVar == r.f47105a, "Already started", new Object[0]);
        E4.n nVar = new E4.n(this, new A2.d(this, this.f47056i, 12));
        AbstractC3538f[] abstractC3538fArr = {null};
        m mVar = this.f47050c;
        X8.c cVar = mVar.f47095d;
        Task taskContinueWithTask = ((Task) cVar.f16184a).continueWithTask(((C4386e) cVar.f16185b).f47427a, new aa.f(26, cVar, this.f47051d));
        taskContinueWithTask.addOnCompleteListener(mVar.f47092a.f47427a, new A5.g(mVar, abstractC3538fArr, nVar, 22));
        this.f47057j = new k(mVar, abstractC3538fArr, taskContinueWithTask);
        this.f47055h = r.f47106b;
    }

    public final void i(GeneratedMessageLite generatedMessageLite) {
        this.f47053f.d();
        Ba.c.p(getClass().getSimpleName(), "(%x) Stream sending: %s", 1, Integer.valueOf(System.identityHashCode(this)), generatedMessageLite);
        C3558a c3558a = this.f47049b;
        if (c3558a != null) {
            c3558a.n();
            this.f47049b = null;
        }
        this.f47057j.d(generatedMessageLite);
    }

    public void h() {
    }
}
