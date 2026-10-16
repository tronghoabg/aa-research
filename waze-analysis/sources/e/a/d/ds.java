package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ds implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dt f46825a;

    ds(dt dtVar) {
        Objects.requireNonNull(dtVar);
        this.f46825a = dtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh ehVar = this.f46825a.f46827b;
        ge geVar = ehVar.r;
        ehVar.q = null;
        ehVar.r = null;
        geVar.t(e.a.ee.f47411k.g("InternalSubchannel closed transport due to address change"));
    }
}
