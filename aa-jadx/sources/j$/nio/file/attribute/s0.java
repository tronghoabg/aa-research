package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s0 implements j$.nio.file.attribute.u0 {
    public final /* synthetic */ java.nio.file.attribute.UserPrincipal a;

    public /* synthetic */ s0(java.nio.file.attribute.UserPrincipal userPrincipal) {
        this.a = userPrincipal;
    }

    public static /* synthetic */ j$.nio.file.attribute.u0 a(java.nio.file.attribute.UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        if (userPrincipal instanceof j$.nio.file.attribute.t0) {
            return ((j$.nio.file.attribute.t0) userPrincipal).a;
        }
        return userPrincipal instanceof java.nio.file.attribute.GroupPrincipal ? j$.nio.file.attribute.f0.a((java.nio.file.attribute.GroupPrincipal) userPrincipal) : new j$.nio.file.attribute.s0(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.UserPrincipal userPrincipal = this.a;
        if (obj instanceof j$.nio.file.attribute.s0) {
            obj = ((j$.nio.file.attribute.s0) obj).a;
        }
        return userPrincipal.equals(obj);
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
