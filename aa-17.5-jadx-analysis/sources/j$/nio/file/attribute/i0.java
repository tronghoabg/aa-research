package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements k0 {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ i0(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ void a(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) throws IOException {
        this.a.setTimes(u.c(fileTime), u.c(fileTime2), u.c(fileTime3));
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ void b(u0 u0Var) throws IOException {
        this.a.setOwner(t0.a(u0Var));
    }

    public final /* synthetic */ n0 c() throws IOException {
        PosixFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes instanceof m0 ? ((m0) attributes).a : new l0(attributes);
    }

    public final /* synthetic */ void d(h0 h0Var) throws IOException {
        this.a.setGroup(g0.a(h0Var));
    }

    public final /* synthetic */ void e(Set set) throws IOException {
        this.a.setPermissions(j$.nio.file.a.m(set));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.a0
    public final /* synthetic */ u0 getOwner() {
        return s0.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.d
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // j$.nio.file.attribute.g
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return h.a(this.a.readAttributes());
    }
}
