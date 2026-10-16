package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AclFileAttributeView f49705a;

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(u0 u0Var) throws IOException {
        this.f49705a.setOwner(t0.a(u0Var));
    }

    public final /* synthetic */ List c() {
        return this.f49705a.getAcl();
    }

    public final /* synthetic */ void d(List list) throws IOException {
        this.f49705a.setAcl(list);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.f49705a;
        if (obj instanceof a) {
            obj = ((a) obj).f49705a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ u0 getOwner() {
        return s0.a(this.f49705a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49705a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49705a.name();
    }
}
