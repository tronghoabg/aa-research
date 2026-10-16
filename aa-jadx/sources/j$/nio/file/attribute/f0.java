package j$.nio.file.attribute;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0 implements j$.nio.file.attribute.h0 {
    public final /* synthetic */ java.nio.file.attribute.GroupPrincipal a;

    public /* synthetic */ f0(java.nio.file.attribute.GroupPrincipal groupPrincipal) {
        this.a = groupPrincipal;
    }

    public static /* synthetic */ j$.nio.file.attribute.h0 a(java.nio.file.attribute.GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return groupPrincipal instanceof j$.nio.file.attribute.g0 ? ((j$.nio.file.attribute.g0) groupPrincipal).a : new j$.nio.file.attribute.f0(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.attribute.GroupPrincipal groupPrincipal = this.a;
        if (obj instanceof j$.nio.file.attribute.f0) {
            obj = ((j$.nio.file.attribute.f0) obj).a;
        }
        return groupPrincipal.equals(obj);
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
