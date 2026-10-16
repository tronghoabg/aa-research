package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g0 implements java.nio.file.attribute.GroupPrincipal {
    public final /* synthetic */ j$.nio.file.attribute.h0 a;

    public /* synthetic */ g0(j$.nio.file.attribute.h0 h0Var) {
        this.a = h0Var;
    }

    public static /* synthetic */ java.nio.file.attribute.GroupPrincipal a(j$.nio.file.attribute.h0 h0Var) {
        if (h0Var == null) {
            return null;
        }
        return h0Var instanceof j$.nio.file.attribute.f0 ? ((j$.nio.file.attribute.f0) h0Var).a : new j$.nio.file.attribute.g0(h0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.h0 h0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.g0) {
            obj = ((j$.nio.file.attribute.g0) obj).a;
        }
        return h0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String getName() {
        return ((j$.nio.file.attribute.f0) this.a).getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(javax.security.auth.Subject subject) {
        return ((j$.nio.file.attribute.f0) this.a).implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String toString() {
        return ((j$.nio.file.attribute.f0) this.a).toString();
    }
}
