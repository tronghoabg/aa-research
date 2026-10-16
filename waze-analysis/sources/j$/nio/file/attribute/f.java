package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class f implements BasicFileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f49711a;

    public final /* synthetic */ boolean equals(Object obj) {
        g gVar = this.f49711a;
        if (obj instanceof f) {
            obj = ((f) obj).f49711a;
        }
        return gVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49711a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f49711a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return i.a(this.f49711a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) {
        this.f49711a.a(u.b(fileTime), u.b(fileTime2), u.b(fileTime3));
    }
}
