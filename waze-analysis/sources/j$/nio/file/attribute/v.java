package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class v implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FileAttributeView f49733a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.f49733a;
        if (obj instanceof v) {
            obj = ((v) obj).f49733a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49733a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49733a.name();
    }
}
