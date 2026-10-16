package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46917a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fd f46918b;

    fc(fd fdVar, e.a.ee eeVar) {
        this.f46917a = eeVar;
        Objects.requireNonNull(fdVar);
        this.f46918b = fdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46918b.t(this.f46917a);
    }
}
