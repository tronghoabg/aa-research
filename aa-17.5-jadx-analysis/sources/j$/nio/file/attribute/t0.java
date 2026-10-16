package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t0 implements UserPrincipal {
    public final /* synthetic */ u0 a;

    public /* synthetic */ t0(u0 u0Var) {
        this.a = u0Var;
    }

    public static /* synthetic */ UserPrincipal a(u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        return u0Var instanceof s0 ? ((s0) u0Var).a : u0Var instanceof h0 ? g0.a((h0) u0Var) : new t0(u0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        u0 u0Var = this.a;
        if (obj instanceof t0) {
            obj = ((t0) obj).a;
        }
        return u0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }
}
