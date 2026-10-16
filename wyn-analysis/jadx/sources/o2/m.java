package o2;

import Q1.w;
import Q1.x;
import R8.v;
import android.os.Looper;
import android.os.SystemClock;
import g5.RunnableC2707d;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m9.B;
import p2.ExecutorC3758a;

/* loaded from: classes.dex */
public final class m implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final U5.f f41317d = new U5.f(-9223372036854775807L, 0, false);

    /* renamed from: e, reason: collision with root package name */
    public static final U5.f f41318e = new U5.f(-9223372036854775807L, 2, false);

    /* renamed from: f, reason: collision with root package name */
    public static final U5.f f41319f = new U5.f(-9223372036854775807L, 3, false);

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorC3758a f41320a;

    /* renamed from: b, reason: collision with root package name */
    public i f41321b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f41322c;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(String str) {
        String strF = v.f("ExoPlayer:Loader:", str);
        int i5 = x.f9724a;
        this(new ExecutorC3758a(Executors.newSingleThreadExecutor(new w(strF, 0)), new B(12)));
    }

    @Override // o2.n
    public final void a() {
        IOException iOException;
        IOException iOException2 = this.f41322c;
        if (iOException2 != null) {
            throw iOException2;
        }
        i iVar = this.f41321b;
        if (iVar != null && (iOException = iVar.f41311e) != null && iVar.f41312f > iVar.f41307a) {
            throw iOException;
        }
    }

    public final void b() {
        i iVar = this.f41321b;
        Q1.k.h(iVar);
        iVar.a(false);
    }

    public final boolean c() {
        return this.f41322c != null;
    }

    public final boolean d() {
        return this.f41321b != null;
    }

    public final void e(k kVar) {
        i iVar = this.f41321b;
        if (iVar != null) {
            iVar.a(true);
        }
        ExecutorC3758a executorC3758a = this.f41320a;
        if (kVar != null) {
            executorC3758a.execute(new RunnableC2707d(kVar, 4));
        }
        Object obj = executorC3758a.f43197c;
        ((ExecutorService) executorC3758a.f43196b).shutdown();
    }

    public final long f(j jVar, h hVar, int i5) {
        Looper looperMyLooper = Looper.myLooper();
        Q1.k.h(looperMyLooper);
        this.f41322c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        i iVar = new i(this, looperMyLooper, jVar, hVar, i5, jElapsedRealtime);
        Q1.k.g(this.f41321b == null);
        this.f41321b = iVar;
        iVar.b();
        return jElapsedRealtime;
    }

    public m(ExecutorC3758a executorC3758a) {
        this.f41320a = executorC3758a;
    }
}
