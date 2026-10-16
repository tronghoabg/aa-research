package j$.nio.file;

import java.nio.file.WatchKey;
import java.nio.file.Watchable;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class l0 implements WatchKey {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f49758a;

    public /* synthetic */ l0(m0 m0Var) {
        this.f49758a = m0Var;
    }

    public static /* synthetic */ WatchKey a(m0 m0Var) {
        if (m0Var == null) {
            return null;
        }
        return m0Var instanceof k0 ? ((k0) m0Var).f49756a : new l0(m0Var);
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ void cancel() {
        ((k0) this.f49758a).a();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        m0 m0Var = this.f49758a;
        if (obj instanceof l0) {
            obj = ((l0) obj).f49758a;
        }
        return m0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49758a.hashCode();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean isValid() {
        return ((k0) this.f49758a).c();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ List pollEvents() {
        return a.n(((k0) this.f49758a).d());
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ boolean reset() {
        return ((k0) this.f49758a).e();
    }

    @Override // java.nio.file.WatchKey
    public final /* synthetic */ Watchable watchable() {
        s0 s0VarF = ((k0) this.f49758a).f();
        if (s0VarF == null) {
            return null;
        }
        return s0VarF instanceof q0 ? ((q0) s0VarF).f49766a : s0VarF instanceof Path ? q.f((Path) s0VarF) : new r0(s0VarF);
    }
}
