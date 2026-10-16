package f9;

import a.AbstractC1304a;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.C2476b;

/* loaded from: classes4.dex */
public final class f extends d {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f35250a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.b f35251b;

    public f(O9.b bVar, TaskCompletionSource taskCompletionSource) {
        this.f35251b = bVar;
        this.f35250a = taskCompletionSource;
    }

    @Override // f9.d, f9.i
    public final void L(Status status, C2618a c2618a) {
        w8.d dVar;
        AbstractC1304a.J(status, c2618a == null ? null : new C2476b(c2618a), this.f35250a);
        if (c2618a == null) {
            return;
        }
        Bundle bundle = c2618a.f35246e;
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle.getBundle("scionData");
        if (bundle2 == null || bundle2.keySet() == null || (dVar = (w8.d) this.f35251b.get()) == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            dVar.b("fdl", str, bundle2.getBundle(str));
        }
    }
}
