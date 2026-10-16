package j$.nio.file;

import java.nio.file.Watchable;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class q0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Watchable f49766a;

    public /* synthetic */ q0(Watchable watchable) {
        this.f49766a = watchable;
    }

    @Override // j$.nio.file.s0
    public final /* synthetic */ m0 e(p0 p0Var, d0[] d0VarArr, g0[] g0VarArr) {
        return k0.b(this.f49766a.register(o0.e(p0Var), a0.l(d0VarArr), a0.m(g0VarArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.f49766a;
        if (obj instanceof q0) {
            obj = ((q0) obj).f49766a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.s0
    public final /* synthetic */ m0 g(p0 p0Var, d0[] d0VarArr) {
        return k0.b(this.f49766a.register(o0.e(p0Var), a0.l(d0VarArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.f49766a.hashCode();
    }
}
