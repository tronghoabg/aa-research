package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasicFileAttributeView f49709a;

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f49709a.setTimes(u.c(fileTime), u.c(fileTime2), u.c(fileTime3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.f49709a;
        if (obj instanceof e) {
            obj = ((e) obj).f49709a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49709a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49709a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return h.a(this.f49709a.readAttributes());
    }
}
