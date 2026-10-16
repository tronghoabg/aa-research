package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements java.nio.file.attribute.UserPrincipal {
    public final /* synthetic */ j$.nio.file.attribute.u0 a;

    public /* synthetic */ t0(j$.nio.file.attribute.u0 u0Var) {
        this.a = u0Var;
    }

    public static /* synthetic */ java.nio.file.attribute.UserPrincipal a(j$.nio.file.attribute.u0 u0Var) {
        if (u0Var == null) {
            return null;
        }
        if (u0Var instanceof j$.nio.file.attribute.s0) {
            return ((j$.nio.file.attribute.s0) u0Var).a;
        }
        return u0Var instanceof j$.nio.file.attribute.h0 ? j$.nio.file.attribute.g0.a((j$.nio.file.attribute.h0) u0Var) : new j$.nio.file.attribute.t0(u0Var);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        j$.nio.file.attribute.u0 u0Var = this.a;
        if (obj instanceof j$.nio.file.attribute.t0) {
            obj = ((j$.nio.file.attribute.t0) obj).a;
        }
        return u0Var.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String getName() {
        return this.a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(javax.security.auth.Subject subject) {
        return this.a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ java.lang.String toString() {
        return this.a.toString();
    }
}
