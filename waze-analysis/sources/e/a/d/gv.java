package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gv implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hf f47059a;

    gv(hf hfVar) {
        Objects.requireNonNull(hfVar);
        this.f47059a = hfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hf hfVar = this.f47059a;
        hfVar.s = null;
        hfVar.f47086l.e();
        hfVar.c();
    }
}
