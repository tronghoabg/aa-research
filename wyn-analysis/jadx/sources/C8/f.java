package C8;

import L8.p;
import android.content.Context;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import z8.InterfaceC4621a;
import za.C4658a;

/* loaded from: classes4.dex */
public final class f implements E8.a {

    /* renamed from: a, reason: collision with root package name */
    public final s8.g f1918a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.b f1919b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1920c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1921d;

    /* renamed from: e, reason: collision with root package name */
    public final l f1922e;

    /* renamed from: f, reason: collision with root package name */
    public final n f1923f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f1924g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1925h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f1926i;

    /* renamed from: j, reason: collision with root package name */
    public final Task f1927j;
    public final C4658a k;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC4621a f1928l;

    /* renamed from: m, reason: collision with root package name */
    public b f1929m;

    /* renamed from: n, reason: collision with root package name */
    public Task f1930n;

    public f(s8.g gVar, O9.b bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        AbstractC1732v.i(gVar);
        AbstractC1732v.i(bVar);
        this.f1918a = gVar;
        this.f1919b = bVar;
        this.f1920c = new ArrayList();
        this.f1921d = new ArrayList();
        gVar.a();
        String strG = gVar.g();
        l lVar = new l();
        Context context = gVar.f45328a;
        AbstractC1732v.i(context);
        AbstractC1732v.f(strG);
        lVar.f1950a = new p(new k(context, 0, "com.google.firebase.appcheck.store." + strG));
        this.f1922e = lVar;
        gVar.a();
        this.f1923f = new n(context, this, executor2, scheduledExecutorService);
        this.f1924g = executor;
        this.f1925h = executor2;
        this.f1926i = executor3;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new d(0, this, taskCompletionSource));
        this.f1927j = taskCompletionSource.getTask();
        this.k = new C4658a(15);
    }

    public final Task a(boolean z2) {
        return this.f1927j.continueWithTask(this.f1925h, new e(0, this, z2));
    }

    public final boolean b() {
        b bVar = this.f1929m;
        if (bVar == null) {
            return false;
        }
        long j8 = bVar.f1908b + bVar.f1909c;
        this.k.getClass();
        return j8 - System.currentTimeMillis() > 300000;
    }
}
