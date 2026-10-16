package j$.nio.file;

import java.nio.file.Watchable;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements a1 {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ y0(Watchable watchable) {
        this.a = watchable;
    }

    @Override // j$.nio.file.a1
    public final /* synthetic */ u0 c(x0 x0Var, l0[] l0VarArr, o0[] o0VarArr) {
        return s0.b(this.a.register(w0.a(x0Var), i0.l(l0VarArr), i0.m(o0VarArr)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof y0) {
            obj = ((y0) obj).a;
        }
        return watchable.equals(obj);
    }

    @Override // j$.nio.file.a1
    public final /* synthetic */ u0 f(x0 x0Var, l0[] l0VarArr) {
        return s0.b(this.a.register(w0.a(x0Var), i0.l(l0VarArr)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
