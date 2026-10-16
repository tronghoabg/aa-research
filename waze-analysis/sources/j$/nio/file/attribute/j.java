package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DosFileAttributeView f49717a;

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f49717a.setTimes(u.c(fileTime), u.c(fileTime2), u.c(fileTime3));
    }

    public final /* synthetic */ o c() throws IOException {
        DosFileAttributes attributes = this.f49717a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof n ? ((n) attributes).f49723a : new m(attributes);
    }

    public final /* synthetic */ void d(boolean z) throws IOException {
        this.f49717a.setArchive(z);
    }

    public final /* synthetic */ void e(boolean z) throws IOException {
        this.f49717a.setHidden(z);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.f49717a;
        if (obj instanceof j) {
            obj = ((j) obj).f49717a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ void f(boolean z) throws IOException {
        this.f49717a.setReadOnly(z);
    }

    public final /* synthetic */ void g(boolean z) throws IOException {
        this.f49717a.setSystem(z);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49717a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49717a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return h.a(this.f49717a.readAttributes());
    }
}
