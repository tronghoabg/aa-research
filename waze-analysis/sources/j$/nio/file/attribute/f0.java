package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class f0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ GroupPrincipal f49712a;

    public /* synthetic */ f0(GroupPrincipal groupPrincipal) {
        this.f49712a = groupPrincipal;
    }

    public static /* synthetic */ h0 a(GroupPrincipal groupPrincipal) {
        if (groupPrincipal == null) {
            return null;
        }
        return groupPrincipal instanceof g0 ? ((g0) groupPrincipal).f49713a : new f0(groupPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        GroupPrincipal groupPrincipal = this.f49712a;
        if (obj instanceof f0) {
            obj = ((f0) obj).f49712a;
        }
        return groupPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f49712a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f49712a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f49712a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f49712a.toString();
    }
}
