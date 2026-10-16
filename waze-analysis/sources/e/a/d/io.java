package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class io implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.cm f47171a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iv f47172b;

    io(iv ivVar, e.a.cm cmVar) {
        this.f47171a = cmVar;
        Objects.requireNonNull(ivVar);
        this.f47172b = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47172b.f47185b.C.d(this.f47171a);
    }
}
