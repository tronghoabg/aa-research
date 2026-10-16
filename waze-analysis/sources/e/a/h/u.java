package e.a.h;

import e.a.am;
import e.a.cm;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class u extends am {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f47803a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(v vVar, e.a.k kVar) {
        super(kVar);
        Objects.requireNonNull(vVar);
        this.f47803a = vVar;
    }

    @Override // e.a.an, e.a.k
    public final void e(com.waze.uid.f fVar, cm cmVar) {
        cmVar.h(this.f47803a.f47804a);
        super.e(fVar, cmVar);
    }
}
