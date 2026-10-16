package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class it implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jv f47181a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iv f47182b;

    it(iv ivVar, jv jvVar) {
        this.f47181a = jvVar;
        Objects.requireNonNull(ivVar);
        this.f47182b = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47182b.f47185b.C.e(this.f47181a);
    }
}
