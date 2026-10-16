package B8;

import A5.f;
import C8.i;
import C8.j;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import s8.g;
import z8.InterfaceC4621a;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4621a {

    /* renamed from: a, reason: collision with root package name */
    public final i f1606a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f1607b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f1608c;

    /* renamed from: d, reason: collision with root package name */
    public final j f1609d;

    /* renamed from: e, reason: collision with root package name */
    public final Task f1610e;

    public d(g gVar, O9.b bVar, Executor executor, Executor executor2, Executor executor3) {
        AbstractC1732v.i(gVar);
        this.f1606a = new i(gVar);
        this.f1607b = executor;
        this.f1608c = executor3;
        this.f1609d = new j(0);
        if (bVar.get() != null) {
            bVar.get().getClass();
            throw new ClassCastException();
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor2.execute(new a(gVar, taskCompletionSource, 0));
        this.f1610e = taskCompletionSource.getTask();
    }

    @Override // z8.InterfaceC4621a
    public final Task getToken() {
        b bVar = new b(this, 0);
        Task task = this.f1610e;
        Executor executor = this.f1607b;
        return task.onSuccessTask(executor, bVar).onSuccessTask(executor, new f(1));
    }
}
