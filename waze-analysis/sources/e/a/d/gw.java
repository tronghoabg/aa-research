package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gw implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hf f47060a;

    gw(hf hfVar) {
        Objects.requireNonNull(hfVar);
        this.f47060a = hfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hf hfVar = this.f47060a;
        hfVar.o = null;
        if (hfVar.f47086l.g()) {
            hfVar.c();
        }
    }
}
