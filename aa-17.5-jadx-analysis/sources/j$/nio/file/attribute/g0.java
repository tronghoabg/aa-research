package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g0 implements GroupPrincipal {
    public final /* synthetic */ h0 a;

    public /* synthetic */ g0(h0 h0Var) {
        this.a = h0Var;
    }

    public static /* synthetic */ GroupPrincipal a(h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var instanceof f0 ? ((f0) h0Var).a : new g0(h0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        h0 h0Var = this.a;
        if (obj instanceof g0) {
            obj = ((g0) obj).a;
        }
        return h0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((f0) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((f0) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((f0) this.a).toString();
    }
}
