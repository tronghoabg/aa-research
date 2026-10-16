package j$.nio.file.attribute;

import java.io.IOException;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class j0 implements PosixFileAttributeView {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f49718a;

    public final /* synthetic */ boolean equals(Object obj) {
        k0 k0Var = this.f49718a;
        if (obj instanceof j0) {
            obj = ((j0) obj).f49718a;
        }
        return k0Var.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return t0.a(((i0) this.f49718a).getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49718a.hashCode();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView, java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ String name() {
        return ((i0) this.f49718a).name();
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ PosixFileAttributes readAttributes() throws IOException {
        n0 n0VarC = ((i0) this.f49718a).c();
        if (n0VarC == null) {
            return null;
        }
        return n0VarC instanceof l0 ? ((l0) n0VarC).f49720a : new m0(n0VarC);
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setGroup(GroupPrincipal groupPrincipal) throws IOException {
        ((i0) this.f49718a).d(f0.a(groupPrincipal));
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) throws IOException {
        ((i0) this.f49718a).b(s0.a(userPrincipal));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView
    public final /* synthetic */ void setPermissions(Set set) throws IOException {
        ((i0) this.f49718a).e(j$.nio.file.a.m(set));
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(java.nio.file.attribute.FileTime fileTime, java.nio.file.attribute.FileTime fileTime2, java.nio.file.attribute.FileTime fileTime3) throws IOException {
        ((i0) this.f49718a).a(u.b(fileTime), u.b(fileTime2), u.b(fileTime3));
    }

    @Override // java.nio.file.attribute.PosixFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ java.nio.file.attribute.BasicFileAttributes readAttributes() {
        return i.a(((i0) this.f49718a).readAttributes());
    }
}
