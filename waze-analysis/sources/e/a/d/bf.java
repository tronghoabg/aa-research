package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bg f46650a;

    bf(bg bgVar) {
        Objects.requireNonNull(bgVar);
        this.f46650a = bgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46650a.s();
    }
}
