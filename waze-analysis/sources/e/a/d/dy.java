package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dy extends cv {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ af f46836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dz f46837b;

    dy(dz dzVar, af afVar) {
        this.f46836a = afVar;
        Objects.requireNonNull(dzVar);
        this.f46837b = dzVar;
    }

    @Override // e.a.d.cv, e.a.d.af
    public final void m(ah ahVar) {
        this.f46837b.f46839b.b();
        this.f46836a.m(new dx(this, ahVar));
    }

    @Override // e.a.d.cv
    protected final af p() {
        return this.f46836a;
    }
}
