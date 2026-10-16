package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class w implements FileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f49735a;

    public final /* synthetic */ boolean equals(Object obj) {
        x xVar = this.f49735a;
        if (obj instanceof w) {
            obj = ((w) obj).f49735a;
        }
        return xVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49735a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f49735a.name();
    }
}
