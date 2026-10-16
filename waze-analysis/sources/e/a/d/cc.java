package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46720a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f46721b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46722c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ cd f46723d;

    cc(cd cdVar, e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        this.f46720a = eeVar;
        this.f46721b = agVar;
        this.f46722c = cmVar;
        Objects.requireNonNull(cdVar);
        this.f46723d = cdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46723d.f46724a.c(this.f46720a, this.f46721b, this.f46722c);
    }
}
