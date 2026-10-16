package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ee implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ef f46861a;

    ee(ef efVar) {
        Objects.requireNonNull(efVar);
        this.f46861a = efVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ef efVar = this.f46861a;
        eh ehVar = efVar.f46864c;
        ehVar.s.remove(efVar.f46862a);
        if (ehVar.w.a() == e.a.w.f47855e && ehVar.s.isEmpty()) {
            ehVar.f46877l.execute(new dv(ehVar));
        }
    }
}
