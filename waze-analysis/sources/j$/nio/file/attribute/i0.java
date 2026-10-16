package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PosixFileAttributeView f49716a;

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.f49716a.setTimes(u.c(fileTime), u.c(fileTime2), u.c(fileTime3));
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(u0 u0Var) throws IOException {
        this.f49716a.setOwner(t0.a(u0Var));
    }

    public final /* synthetic */ n0 c() throws IOException {
        PosixFileAttributes attributes = this.f49716a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof m0 ? ((m0) attributes).f49722a : new l0(attributes);
    }

    public final /* synthetic */ void d(h0 h0Var) throws IOException {
        this.f49716a.setGroup(g0.a(h0Var));
    }

    public final /* synthetic */ void e(Set set) throws IOException {
        this.f49716a.setPermissions(j$.nio.file.a.m(set));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.f49716a;
        if (obj instanceof i0) {
            obj = ((i0) obj).f49716a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ u0 getOwner() {
        return s0.a(this.f49716a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49716a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.f49716a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return h.a(this.f49716a.readAttributes());
    }
}
