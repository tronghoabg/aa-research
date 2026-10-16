package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class p implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttribute f49725a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f49725a;
        if (obj instanceof p) {
            obj = ((p) obj).f49725a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49725a.hashCode();
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ String name() {
        return this.f49725a.name();
    }

    @Override // j$.nio.file.attribute.r
    public final /* synthetic */ Object value() {
        return this.f49725a.value();
    }
}
