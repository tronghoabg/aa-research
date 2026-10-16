package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class y0 implements j$.nio.file.a1 {
    public final /* synthetic */ java.nio.file.Watchable a;

    public /* synthetic */ y0(java.nio.file.Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.a1
    public final /* synthetic */ j$.nio.file.u0 c(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr, j$.nio.file.o0[] o0VarArr) {
        return j$.nio.file.s0.b(this.a.register(j$.nio.file.w0.a(x0Var), j$.nio.file.i0.l(l0VarArr), j$.nio.file.i0.m(o0VarArr)));
    }

    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.Watchable watchable = this.a;
        if (obj instanceof j$.nio.file.y0) {
            obj = ((j$.nio.file.y0) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.a1
    public final /* synthetic */ j$.nio.file.u0 f(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr) {
        return j$.nio.file.s0.b(this.a.register(j$.nio.file.w0.a(x0Var), j$.nio.file.i0.l(l0VarArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
