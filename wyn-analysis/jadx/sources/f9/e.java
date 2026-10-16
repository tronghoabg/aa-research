package f9;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f35249a;

    public e(TaskCompletionSource taskCompletionSource) {
        this.f35249a = taskCompletionSource;
    }

    @Override // f9.d, f9.i
    public final void m(Status status, n nVar) {
        AbstractC1304a.J(status, nVar, this.f35249a);
    }
}
