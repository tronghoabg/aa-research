package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a.ee f46637a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f46638b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e.a.cm f46639c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f46640d;

    b(e eVar, e.a.ee eeVar, ag agVar, e.a.cm cmVar) {
        this.f46637a = eeVar;
        this.f46638b = agVar;
        this.f46639c = cmVar;
        Objects.requireNonNull(eVar);
        this.f46640d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46640d.y(this.f46637a, this.f46638b, this.f46639c);
    }
}
