package A7;

import N6.C0776a;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.measurement.zzr;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import ef.C2515C;
import java.io.IOException;
import java.util.concurrent.Callable;
import z4.C4613c;

/* renamed from: A7.h0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class CallableC0255h0 implements Callable, Le.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f886a;

    /* renamed from: b, reason: collision with root package name */
    public Object f887b;

    @Override // Le.c
    public Object apply(Object obj) {
        return this.f887b;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f886a) {
            case 0:
                return new zzr(((C0249f0) this.f887b).k);
            case 1:
                BinderC0287s0 binderC0287s0 = (BinderC0287s0) this.f887b;
                binderC0287s0.f1045a.Z();
                C0256h1 c0256h1 = binderC0287s0.f1045a.f574h;
                L1.m(c0256h1);
                c0256h1.c0();
                ((C0273n0) c0256h1.f421a).getClass();
                throw new IllegalStateException("Unexpected call on client side");
            case 2:
                G6.M m10 = G6.U.f4562l;
                G6.U u10 = C6.n.f1857D.f1863c;
                return G6.U.o((Uri) this.f887b);
            case 3:
                K1.a aVar = (K1.a) this.f887b;
                aVar.f6329d.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.f6330e.d();
                    Binder.flushPendingCommands();
                    return null;
                } finally {
                }
            case 4:
                return ((C0776a) this.f887b).getViewSignals();
            case 5:
                return this.f887b;
            case 6:
                com.moloco.sdk.acm.db.e eVar = (com.moloco.sdk.acm.db.e) this.f887b;
                S3.h hVar = eVar.f28365d;
                o3.g gVarA = hVar.a();
                MetricsDb_Impl metricsDb_Impl = eVar.f28362a;
                metricsDb_Impl.c();
                try {
                    gVarA.g();
                    metricsDb_Impl.n();
                    metricsDb_Impl.j();
                    hVar.q(gVarA);
                    return C2515C.f34653a;
                } catch (Throwable th) {
                    metricsDb_Impl.j();
                    hVar.q(gVarA);
                    throw th;
                }
            default:
                synchronized (((C4613c) this.f887b)) {
                    try {
                        C4613c c4613c = (C4613c) this.f887b;
                        if (c4613c.f48356i != null) {
                            c4613c.Q();
                            if (((C4613c) this.f887b).w()) {
                                ((C4613c) this.f887b).J();
                                ((C4613c) this.f887b).k = 0;
                            }
                        }
                    } finally {
                    }
                }
                return null;
        }
    }

    public /* synthetic */ CallableC0255h0(Object obj, int i5) {
        this.f886a = i5;
        this.f887b = obj;
    }

    public CallableC0255h0(BinderC0287s0 binderC0287s0, C0301x c0301x, String str) {
        this.f886a = 1;
        this.f887b = binderC0287s0;
    }
}
