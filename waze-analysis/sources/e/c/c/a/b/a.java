package e.c.c.a.b;

import e.c.f;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a<T> extends f<T> implements Callable<T> {

    /* renamed from: a, reason: collision with root package name */
    final Callable f47870a;

    public a(Callable callable) {
        this.f47870a = callable;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        return (T) this.f47870a.call();
    }
}
