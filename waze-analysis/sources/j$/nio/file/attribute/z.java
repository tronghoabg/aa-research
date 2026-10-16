package j$.nio.file.attribute;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class z implements FileOwnerAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f49739a;

    public final /* synthetic */ boolean equals(Object obj) {
        a0 a0Var = this.f49739a;
        if (obj instanceof z) {
            obj = ((z) obj).f49739a;
        }
        return a0Var.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return t0.a(this.f49739a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49739a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f49739a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.f49739a.b(s0.a(userPrincipal));
    }
}
