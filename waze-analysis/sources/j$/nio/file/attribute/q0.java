package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class q0 implements UserDefinedFileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f49728a;

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ void delete(String str) throws IOException {
        ((p0) this.f49728a).c(str);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        r0 r0Var = this.f49728a;
        if (obj instanceof q0) {
            obj = ((q0) obj).f49728a;
        }
        return r0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49728a.hashCode();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ List list() {
        return ((p0) this.f49728a).d();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return ((p0) this.f49728a).name();
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int read(String str, ByteBuffer byteBuffer) {
        return ((p0) this.f49728a).e(str, byteBuffer);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int size(String str) {
        return ((p0) this.f49728a).f(str);
    }

    @Override // java.nio.file.attribute.UserDefinedFileAttributeView
    public final /* synthetic */ int write(String str, ByteBuffer byteBuffer) {
        return ((p0) this.f49728a).g(str, byteBuffer);
    }
}
