package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class br implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46697b;

    br(ce ceVar, int i2) {
        this.f46696a = i2;
        Objects.requireNonNull(ceVar);
        this.f46697b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46697b.f46730d.k(this.f46696a);
    }
}
