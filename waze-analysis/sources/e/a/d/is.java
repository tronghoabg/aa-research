package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class is implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ iw f47179a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iv f47180b;

    is(iv ivVar, iw iwVar) {
        this.f47179a = iwVar;
        Objects.requireNonNull(ivVar);
        this.f47180b = ivVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47180b.f47185b.af(this.f47179a);
    }
}
