package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bn implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46689a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46690b;

    bn(ce ceVar, int i2) {
        this.f46689a = i2;
        Objects.requireNonNull(ceVar);
        this.f46690b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46690b.f46730d.g(this.f46689a);
    }
}
