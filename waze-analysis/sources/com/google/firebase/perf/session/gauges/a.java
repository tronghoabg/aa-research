package com.google.firebase.perf.session.gauges;

import android.os.Process;
import android.support.v4.app.ac;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.f.j;
import com.google.firebase.perf.f.k;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10562b = com.google.firebase.perf.c.a.a();

    /* renamed from: c, reason: collision with root package name */
    private static final long f10563c;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture f10568g = null;

    /* renamed from: h, reason: collision with root package name */
    private long f10569h = -1;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f10564a = new ConcurrentLinkedQueue();

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f10565d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: e, reason: collision with root package name */
    private final String f10566e = "/proc/" + Integer.toString(Process.myPid()) + "/stat";

    /* renamed from: f, reason: collision with root package name */
    private final long f10567f = Os.sysconf(OsConstants._SC_CLK_TCK);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10563c = 1000000L;
    }

    a() {
    }

    public static /* synthetic */ void a(a aVar, m mVar) throws IOException {
        k kVarH = aVar.h(mVar);
        if (kVarH != null) {
            aVar.f10564a.add(kVarH);
        }
    }

    public static /* synthetic */ void b(a aVar, m mVar) throws IOException {
        k kVarH = aVar.h(mVar);
        if (kVarH != null) {
            aVar.f10564a.add(kVarH);
        }
    }

    public static boolean f(long j2) {
        return j2 <= 0;
    }

    private final long g(long j2) {
        return Math.round((j2 / this.f10567f) * f10563c);
    }

    private final k h(m mVar) throws IOException {
        if (mVar == null) {
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f10566e));
            try {
                long jA = mVar.a();
                String[] strArrSplit = bufferedReader.readLine().split(" ");
                long j2 = Long.parseLong(strArrSplit[13]);
                long j3 = Long.parseLong(strArrSplit[15]);
                long j4 = Long.parseLong(strArrSplit[14]);
                long j5 = Long.parseLong(strArrSplit[16]);
                j jVarNewBuilder = k.newBuilder();
                jVarNewBuilder.a(jA);
                jVarNewBuilder.b(g(j4 + j5));
                jVarNewBuilder.c(g(j2 + j3));
                k kVarBuild = jVarNewBuilder.build();
                bufferedReader.close();
                return kVarBuild;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e2) {
            f10562b.i("Unable to read 'proc/[pid]/stat' file: ".concat(String.valueOf(e2.getMessage())));
            return null;
        } catch (ArrayIndexOutOfBoundsException e3) {
            e = e3;
            f10562b.i("Unexpected '/proc/[pid]/stat' file format encountered: ".concat(String.valueOf(e.getMessage())));
            return null;
        } catch (NullPointerException e4) {
            e = e4;
            f10562b.i("Unexpected '/proc/[pid]/stat' file format encountered: ".concat(String.valueOf(e.getMessage())));
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            f10562b.i("Unexpected '/proc/[pid]/stat' file format encountered: ".concat(String.valueOf(e.getMessage())));
            return null;
        }
    }

    private final synchronized void i(m mVar) {
        try {
            this.f10565d.schedule(new ac(this, mVar, 16, null), 0L, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            f10562b.i("Unable to collect Cpu Metric: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    private final synchronized void j(long j2, m mVar) {
        this.f10569h = j2;
        try {
            this.f10568g = this.f10565d.scheduleAtFixedRate(new ac(this, mVar, 15, null), 0L, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            f10562b.i("Unable to start collecting Cpu Metrics: ".concat(String.valueOf(e2.getMessage())));
        }
    }

    public final void c(m mVar) {
        i(mVar);
    }

    public final void d(long j2, m mVar) {
        long j3 = this.f10567f;
        if (j3 == -1 || j3 == 0 || f(j2)) {
            return;
        }
        if (this.f10568g == null) {
            j(j2, mVar);
        } else if (this.f10569h != j2) {
            e();
            j(j2, mVar);
        }
    }

    public final void e() {
        ScheduledFuture scheduledFuture = this.f10568g;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f10568g = null;
        this.f10569h = -1L;
    }
}
