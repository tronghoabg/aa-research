package P9;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes4.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f9282a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f9283b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f9282a = jVar;
        this.f9283b = taskCompletionSource;
    }

    @Override // P9.i
    public final boolean a(Exception exc) {
        this.f9283b.trySetException(exc);
        return true;
    }

    @Override // P9.i
    public final boolean b(Q9.b bVar) {
        if (bVar.f9920b != 4 || this.f9282a.a(bVar)) {
            return false;
        }
        String str = bVar.f9921c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f9283b.setResult(new a(str, bVar.f9923e, bVar.f9924f));
        return true;
    }
}
