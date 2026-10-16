package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ip implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iw f47173a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iq f47174b;

    ip(iq iqVar, iw iwVar) {
        this.f47173a = iwVar;
        Objects.requireNonNull(iqVar);
        this.f47174b = iqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47174b.f47177c.f47185b.af(this.f47173a);
    }
}
