package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class s implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f33701g = new Handler(Looper.getMainLooper());

    /* renamed from: h, reason: collision with root package name */
    public static final String f33702h = "s";

    /* renamed from: a, reason: collision with root package name */
    public final e f33703a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f33704b;

    /* renamed from: c, reason: collision with root package name */
    public final n f33705c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f33706d;

    /* renamed from: e, reason: collision with root package name */
    public final r f33707e;

    /* renamed from: f, reason: collision with root package name */
    public long f33708f;

    public s(e creator, com.vungle.ads.internal.executor.j executor, i iVar) {
        AbstractC3340k.e(creator, "creator");
        AbstractC3340k.e(executor, "executor");
        this.f33703a = creator;
        this.f33704b = executor;
        this.f33705c = iVar;
        this.f33708f = Long.MAX_VALUE;
        this.f33706d = new CopyOnWriteArrayList();
        this.f33707e = new r(new WeakReference(this));
    }

    public final synchronized void a(f jobInfo) {
        try {
            AbstractC3340k.e(jobInfo, "jobInfo");
            f fVarA = jobInfo.a();
            if (fVarA != null) {
                String strD = fVarA.d();
                long jB = fVarA.b();
                fVarA.g();
                if (fVarA.f()) {
                    Iterator it = this.f33706d.iterator();
                    while (it.hasNext()) {
                        q qVar = (q) it.next();
                        f fVarA2 = qVar.a();
                        if (AbstractC3340k.a(fVarA2 != null ? fVarA2.d() : null, strD)) {
                            boolean z2 = u.f33874a;
                            String TAG = f33702h;
                            AbstractC3340k.d(TAG, "TAG");
                            t.a(TAG, "replacing pending job with new " + strD);
                            this.f33706d.remove(qVar);
                        }
                    }
                }
                this.f33706d.add(new q(SystemClock.uptimeMillis() + jB, fVarA));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator it = this.f33706d.iterator();
            long jMin = Long.MAX_VALUE;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                long j8 = qVar.f33698a;
                if (jUptimeMillis >= j8) {
                    this.f33706d.remove(qVar);
                    f fVar = qVar.f33699b;
                    if (fVar != null) {
                        this.f33704b.execute(new g(fVar, this.f33703a, this, this.f33705c));
                    }
                } else {
                    jMin = Math.min(jMin, j8);
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.f33708f) {
                Handler handler = f33701g;
                handler.removeCallbacks(this.f33707e);
                handler.postAtTime(this.f33707e, f33702h, jMin);
            }
            this.f33708f = jMin;
        } catch (Throwable th) {
            throw th;
        }
    }
}
