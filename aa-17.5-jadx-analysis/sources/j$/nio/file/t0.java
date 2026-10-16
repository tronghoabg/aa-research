package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements WatchKey {
    public final /* synthetic */ u0 a;

    public /* synthetic */ t0(u0 u0Var) {
        this.a = u0Var;
    }

    public static /* synthetic */ WatchKey a(u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return u0Var instanceof s0 ? ((s0) u0Var).a : new t0(u0Var);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((s0) this.a).a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        u0 u0Var = this.a;
        if (obj instanceof t0) {
            obj = ((t0) obj).a;
        }
        return u0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((s0) this.a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return a.n(((s0) this.a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((s0) this.a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        a1 a1VarF = ((s0) this.a).f();
        if (a1VarF == null) {
            return null;
        }
        return a1VarF instanceof y0 ? ((y0) a1VarF).a : a1VarF instanceof Path ? y.h((Path) a1VarF) : new z0(a1VarF);
    }
}
