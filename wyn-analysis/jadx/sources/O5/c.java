package O5;

import J5.s;
import J5.t;
import J5.u;

/* loaded from: classes3.dex */
public final class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f8870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A2.d f8871b;

    public c(A2.d dVar, t tVar) {
        this.f8871b = dVar;
        this.f8870a = tVar;
    }

    @Override // J5.t
    public final s c(long j8) {
        s sVarC = this.f8870a.c(j8);
        u uVar = sVarC.f5678a;
        long j10 = uVar.f5681a;
        long j11 = uVar.f5682b;
        long j12 = this.f8871b.f271b;
        u uVar2 = new u(j10, j11 + j12);
        u uVar3 = sVarC.f5679b;
        return new s(uVar2, new u(uVar3.f5681a, uVar3.f5682b + j12));
    }

    @Override // J5.t
    public final boolean e() {
        return this.f8870a.e();
    }

    @Override // J5.t
    public final long f() {
        return this.f8870a.f();
    }
}
