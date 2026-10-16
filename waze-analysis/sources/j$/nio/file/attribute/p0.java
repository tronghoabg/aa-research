package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class p0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UserDefinedFileAttributeView f49726a;

    public final /* synthetic */ void c(String str) throws IOException {
        this.f49726a.delete(str);
    }

    public final /* synthetic */ List d() {
        return this.f49726a.list();
    }

    public final /* synthetic */ int e(String str, ByteBuffer byteBuffer) {
        return this.f49726a.read(str, byteBuffer);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserDefinedFileAttributeView userDefinedFileAttributeView = this.f49726a;
        if (obj instanceof p0) {
            obj = ((p0) obj).f49726a;
        }
        return userDefinedFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int f(String str) {
        return this.f49726a.size(str);
    }

    public final /* synthetic */ int g(String str, ByteBuffer byteBuffer) {
        return this.f49726a.write(str, byteBuffer);
    }

    public final /* synthetic */ int hashCode() {
        return this.f49726a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49726a.name();
    }
}
