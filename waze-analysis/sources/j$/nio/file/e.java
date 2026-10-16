package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class e extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FileStore f49745e;

    public e(FileStore fileStore) {
        this.f49745e = fileStore;
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ Object a(String str) {
        return this.f49745e.getAttribute(str);
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ long b() {
        return this.f49745e.getBlockSize();
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ j$.nio.file.attribute.d0 c(Class cls) {
        FileStoreAttributeView fileStoreAttributeView = this.f49745e.getFileStoreAttributeView(cls);
        if (fileStoreAttributeView == null) {
            return null;
        }
        return fileStoreAttributeView instanceof j$.nio.file.attribute.c0 ? ((j$.nio.file.attribute.c0) fileStoreAttributeView).f49708a : new j$.nio.file.attribute.b0(fileStoreAttributeView);
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ long d() {
        return this.f49745e.getTotalSpace();
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ long e() {
        return this.f49745e.getUnallocatedSpace();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.f49745e;
        if (obj instanceof e) {
            obj = ((e) obj).f49745e;
        }
        return fileStore.equals(obj);
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ long f() {
        return this.f49745e.getUsableSpace();
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ boolean g() {
        return this.f49745e.isReadOnly();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49745e.hashCode();
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ String n() {
        return this.f49745e.name();
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ boolean o(Class cls) {
        return this.f49745e.supportsFileAttributeView(a.h(cls));
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ boolean p(String str) {
        return this.f49745e.supportsFileAttributeView(str);
    }

    @Override // j$.nio.file.a0
    public final /* synthetic */ String q() {
        return this.f49745e.type();
    }
}
