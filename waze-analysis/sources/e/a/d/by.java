package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class by implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ce f46708a;

    by(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.f46708a = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46708a.f46730d.e();
    }
}
