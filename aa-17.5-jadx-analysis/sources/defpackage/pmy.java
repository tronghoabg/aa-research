package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class pmy extends pmx {
    public static final yob a = yob.c("com/google/android/apps/gmm/systems/clientparam/ClientParametersBlockingReference");
    private volatile plz d;
    private final ygr e;
    private final tmb f;
    private final boolean g;
    private final Context h;
    private final Executor i;
    private final CountDownLatch c = new CountDownLatch(1);
    public xxh b = xvy.a;

    public pmy(Context context, tmb tmbVar, boolean z, Set set, Executor executor) {
        this.h = context;
        this.f = tmbVar;
        this.g = z;
        this.e = ygr.n(set);
        this.i = executor;
    }

    @Override // defpackage.plz
    public final aceg a(acef acefVar) {
        return e(acefVar).a(acefVar);
    }

    @Override // defpackage.plz
    @ResultIgnorabilityUnspecified
    public final Map c() {
        throw null;
    }

    @Override // defpackage.pnd
    public final long d() {
        return e(null).d();
    }

    public final plz e(acef acefVar) {
        if (this.d == null) {
            ojk ojkVar = new ojk(acefVar, 16);
            AutoCloseable autoCloseableA = fdi.b() ? xux.a(((vky) ojkVar.gu()).a) : xuw.a;
            try {
                ojkVar.gu();
                int i = 4;
                if (a.Z()) {
                    long jA = this.f.a();
                    vky vkyVarA = vky.a(new vky("ClientParametersBlockingReference.blockedOnMainThread: "), acefVar == null ? new vky("NO_GROUP") : vky.d(null, acefVar));
                    xuv xuvVarA = xuw.a(vkyVarA);
                    try {
                        yrm.aC(this.c);
                        xuvVarA.close();
                        long jA2 = this.f.a() - jA;
                        Long lValueOf = Long.valueOf(jA2);
                        this.b = xxh.h(lValueOf);
                        if (Log.isLoggable("ClientParamsBlocking", 4)) {
                            Log.i("ClientParamsBlocking", String.format("%s for %s ms.", vkyVarA, lValueOf), new Throwable());
                        }
                        if (pyn.a(this.h, pyo.ENABLE_CLIENT_ERROR_LOGGING_FOR_CLIENT_PARAMETERS_BLOCK_ON_MAIN_THREAD)) {
                            this.i.execute(new lma(new Exception(), jA2, 3));
                        }
                    } finally {
                    }
                } else if (pyn.a(this.h, pyo.ENABLE_CEL_FOR_BACKGROUND_THREAD_CLIENT_PARAMETERS_BLOCKS)) {
                    tmb tmbVar = this.f;
                    long jA3 = tmbVar.a();
                    yrm.aC(this.c);
                    this.i.execute(new lma(new Exception(), tmbVar.a() - jA3, i));
                } else {
                    yrm.aC(this.c);
                }
                autoCloseableA.close();
            } catch (Throwable th) {
                try {
                    autoCloseableA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.d;
    }

    public final synchronized pmz f() {
        plz plzVar;
        if (this.d == null) {
            yrm.aC(this.c);
        }
        if (this.d instanceof pmz) {
            plzVar = this.d;
        } else {
            synchronized (this) {
                pmz pmzVar = new pmz(e(null).h(), g(), d(), e(null).k(), new ArrayList(e(null).c().values()), this.e, this.g);
                j(pmzVar);
                plzVar = pmzVar;
            }
        }
        return (pmz) plzVar;
    }

    @Override // defpackage.pnd
    public final abms g() {
        return e(null).g();
    }

    @Override // defpackage.pnd
    public final String h() {
        throw null;
    }

    @Override // defpackage.pnd
    public final List i() {
        throw null;
    }

    final synchronized void j(plz plzVar) {
        this.d = plzVar;
        this.c.countDown();
    }

    @Override // defpackage.pnd
    public final int k() {
        if (this.d != null) {
            return e(null).k();
        }
        return 1;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized boolean l(String str, abms abmsVar, long j, int i, List list) {
        if (this.d == null) {
            j(new pmz(str, abmsVar, j, i, list, this.e, this.g));
            return true;
        }
        return f().m(str, abmsVar, j, i, list);
    }
}
