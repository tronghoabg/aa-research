package m9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import w9.AbstractC4392k;

/* renamed from: m9.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3506e {

    /* renamed from: a, reason: collision with root package name */
    public final W f40475a;

    /* renamed from: b, reason: collision with root package name */
    public final V f40476b;

    public C3506e(W w2, V v2) {
        this.f40475a = w2;
        this.f40476b = v2;
    }

    public final Task a() {
        Task task;
        pd.f.o(1, "AggregateSource must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Dd.c cVar = this.f40475a.f40457b.k;
        synchronized (cVar) {
            cVar.C();
            p9.n nVar = (p9.n) cVar.f2643c;
            p9.u uVar = this.f40475a.f40456a;
            nVar.e();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            nVar.f43382d.a(new kd.V(nVar, uVar, this.f40476b, taskCompletionSource2, 2));
            task = taskCompletionSource2.getTask();
        }
        task.continueWith(AbstractC4392k.f47445b, new aa.f(12, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3506e)) {
            return false;
        }
        C3506e c3506e = (C3506e) obj;
        return this.f40475a.equals(c3506e.f40475a) && this.f40476b.equals(c3506e.f40476b);
    }

    public final int hashCode() {
        return Objects.hash(this.f40475a, this.f40476b);
    }
}
