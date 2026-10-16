package j$.nio.file.attribute;

import java.nio.file.attribute.FileStoreAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class c0 implements FileStoreAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f49708a;

    public final /* synthetic */ boolean equals(Object obj) {
        d0 d0Var = this.f49708a;
        if (obj instanceof c0) {
            obj = ((c0) obj).f49708a;
        }
        return d0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49708a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((b0) this.f49708a).name();
    }
}
