package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bs implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f46698a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ce f46699b;

    bs(ce ceVar, int i2) {
        this.f46698a = i2;
        Objects.requireNonNull(ceVar);
        this.f46699b = ceVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46699b.f46730d.l(this.f46698a);
    }
}
