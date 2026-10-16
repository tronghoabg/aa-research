package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ck implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f46743a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cl f46744b;

    ck(cl clVar, boolean z) {
        this.f46743a = z;
        Objects.requireNonNull(clVar);
        this.f46744b = clVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f46743a) {
            co coVar = this.f46744b.f46745a;
            coVar.f46757g = true;
            if (coVar.u > 0) {
                com.google.d.b.ai aiVar = coVar.x;
                aiVar.d();
                aiVar.e();
            }
        }
        this.f46744b.f46745a.A = false;
    }
}
