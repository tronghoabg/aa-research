package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttribute;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class q implements FileAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f49727a;

    public final /* synthetic */ boolean equals(Object obj) {
        r rVar = this.f49727a;
        if (obj instanceof q) {
            obj = ((q) obj).f49727a;
        }
        return rVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49727a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f49727a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f49727a.value();
    }
}
