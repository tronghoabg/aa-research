package A2;

import s2.r;
import s2.v;
import s2.w;
import s2.x;

/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f274c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, w wVar, w wVar2) {
        super(wVar);
        this.f274c = dVar;
        this.f273b = wVar2;
    }

    @Override // s2.r, s2.w
    public final v c(long j8) {
        v vVarC = this.f273b.c(j8);
        x xVar = vVarC.f44935a;
        long j10 = xVar.f44938a;
        long j11 = this.f274c.f271b;
        x xVar2 = new x(j10, xVar.f44939b + j11);
        x xVar3 = vVarC.f44936b;
        return new v(xVar2, new x(xVar3.f44938a, xVar3.f44939b + j11));
    }
}
