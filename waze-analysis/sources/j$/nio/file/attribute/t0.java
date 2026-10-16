package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class t0 implements UserPrincipal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f49732a;

    public /* synthetic */ t0(u0 u0Var) {
        this.f49732a = u0Var;
    }

    public static /* synthetic */ UserPrincipal a(u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return u0Var instanceof s0 ? ((s0) u0Var).f49730a : u0Var instanceof h0 ? g0.a((h0) u0Var) : new t0(u0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        u0 u0Var = this.f49732a;
        if (obj instanceof t0) {
            obj = ((t0) obj).f49732a;
        }
        return u0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f49732a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f49732a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f49732a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f49732a.toString();
    }
}
