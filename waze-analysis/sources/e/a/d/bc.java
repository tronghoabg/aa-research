package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46643a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bg f46644b;

    bc(bg bgVar, e.a.cm cmVar) {
        this.f46643a = cmVar;
        Objects.requireNonNull(bgVar);
        this.f46644b = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46644b.q(this.f46643a);
    }
}
