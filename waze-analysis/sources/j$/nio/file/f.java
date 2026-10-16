package j$.nio.file;

import java.nio.file.FileStore;
import java.nio.file.attribute.FileStoreAttributeView;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class f extends FileStore {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f49747b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f49748a;

    public final /* synthetic */ boolean equals(Object obj) {
        a0 a0Var = this.f49748a;
        if (obj instanceof f) {
            obj = ((f) obj).f49748a;
        }
        return a0Var.equals(obj);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ Object getAttribute(String str) {
        return this.f49748a.a(str);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getBlockSize() {
        return this.f49748a.b();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ FileStoreAttributeView getFileStoreAttributeView(Class cls) {
        j$.nio.file.attribute.d0 d0VarC = this.f49748a.c(cls);
        if (d0VarC == null) {
            return null;
        }
        return d0VarC instanceof j$.nio.file.attribute.b0 ? ((j$.nio.file.attribute.b0) d0VarC).f49707a : new j$.nio.file.attribute.c0(d0VarC);
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getTotalSpace() {
        return this.f49748a.d();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUnallocatedSpace() {
        return this.f49748a.e();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ long getUsableSpace() {
        return this.f49748a.f();
    }

    public final /* synthetic */ int hashCode() {
        return this.f49748a.hashCode();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean isReadOnly() {
        return this.f49748a.g();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String name() {
        return this.f49748a.n();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(Class cls) {
        return this.f49748a.o(a.h(cls));
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ String type() {
        return this.f49748a.q();
    }

    @Override // java.nio.file.FileStore
    public final /* synthetic */ boolean supportsFileAttributeView(String str) {
        return this.f49748a.p(str);
    }
}
