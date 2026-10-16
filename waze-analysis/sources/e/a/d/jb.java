package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class jb implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ jd f47215a;

    jb(jd jdVar) {
        Objects.requireNonNull(jdVar);
        this.f47215a = jdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47215a.b();
    }
}
