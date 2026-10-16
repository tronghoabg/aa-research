package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class g0 implements GroupPrincipal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f49713a;

    public /* synthetic */ g0(h0 h0Var) {
        this.f49713a = h0Var;
    }

    public static /* synthetic */ GroupPrincipal a(h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var instanceof f0 ? ((f0) h0Var).f49712a : new g0(h0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        h0 h0Var = this.f49713a;
        if (obj instanceof g0) {
            obj = ((g0) obj).f49713a;
        }
        return h0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return ((f0) this.f49713a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f49713a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return ((f0) this.f49713a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return ((f0) this.f49713a).toString();
    }
}
