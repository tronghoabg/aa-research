package E4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final U4.d f2952a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f2953b;

    public q(U4.d dVar, Executor executor) {
        this.f2952a = dVar;
        this.f2953b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f2952a.equals(((q) obj).f2952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2952a.hashCode();
    }
}
