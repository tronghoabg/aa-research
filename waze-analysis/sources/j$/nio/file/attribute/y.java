package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class y implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileOwnerAttributeView f49738a;

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(u0 u0Var) throws IOException {
        this.f49738a.setOwner(t0.a(u0Var));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.f49738a;
        if (obj instanceof y) {
            obj = ((y) obj).f49738a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ u0 getOwner() {
        return s0.a(this.f49738a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49738a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49738a.name();
    }
}
