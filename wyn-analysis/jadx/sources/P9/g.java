package P9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f9284a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f9284a = taskCompletionSource;
    }

    @Override // P9.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // P9.i
    public final boolean b(Q9.b bVar) {
        int i5 = bVar.f9920b;
        if (i5 != 3 && i5 != 4 && i5 != 5) {
            return false;
        }
        this.f9284a.trySetResult(bVar.f9919a);
        return true;
    }
}
