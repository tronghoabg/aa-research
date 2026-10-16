package j$.nio.file.attribute;

import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import javax.security.auth.Subject;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class s0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserPrincipal f49730a;

    public /* synthetic */ s0(UserPrincipal userPrincipal) {
        this.f49730a = userPrincipal;
    }

    public static /* synthetic */ u0 a(UserPrincipal userPrincipal) {
        if (userPrincipal == null) {
            return null;
        }
        return userPrincipal instanceof t0 ? ((t0) userPrincipal).f49732a : userPrincipal instanceof GroupPrincipal ? f0.a((GroupPrincipal) userPrincipal) : new s0(userPrincipal);
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipal userPrincipal = this.f49730a;
        if (obj instanceof s0) {
            obj = ((s0) obj).f49730a;
        }
        return userPrincipal.equals(obj);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String getName() {
        return this.f49730a.getName();
    }

    @Override // java.security.Principal
    public final /* synthetic */ int hashCode() {
        return this.f49730a.hashCode();
    }

    @Override // java.security.Principal
    public final /* synthetic */ boolean implies(Subject subject) {
        return this.f49730a.implies(subject);
    }

    @Override // java.security.Principal
    public final /* synthetic */ String toString() {
        return this.f49730a.toString();
    }
}
