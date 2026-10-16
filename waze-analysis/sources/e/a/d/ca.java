package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ca implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cd f46717a;

    ca(cd cdVar) {
        Objects.requireNonNull(cdVar);
        this.f46717a = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46717a.f46724a.f();
    }
}
