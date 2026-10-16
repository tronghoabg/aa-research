package e.a.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ic implements ig {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f47141a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ iy f47142b;

    ic(iy iyVar, Object obj) {
        this.f47141a = obj;
        Objects.requireNonNull(iyVar);
        this.f47142b = iyVar;
    }

    @Override // e.a.d.ig
    public final void a(iw iwVar) {
        iwVar.f47186a.n(this.f47142b.f47203j.c(this.f47141a));
        iwVar.f47186a.d();
    }
}
