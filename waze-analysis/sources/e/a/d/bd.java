package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bd implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f46645a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bg f46646b;

    bd(bg bgVar, Object obj) {
        this.f46645a = obj;
        Objects.requireNonNull(bgVar);
        this.f46646b = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46646b.r(this.f46645a);
    }
}
