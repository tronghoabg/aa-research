package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.b1;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class p implements Path, j$.lang.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.nio.file.Path f49764a;

    public /* synthetic */ p(java.nio.file.Path path) {
        this.f49764a = path;
    }

    public static /* synthetic */ Path f(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof q ? ((q) path).f49765a : new p(path);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.f49764a.compareTo((java.nio.file.Path) a.g(path));
    }

    @Override // j$.nio.file.Path, j$.nio.file.s0
    public final /* synthetic */ m0 e(p0 p0Var, d0[] d0VarArr, g0[] g0VarArr) {
        return k0.b(this.f49764a.register(o0.e(p0Var), a0.l(d0VarArr), a0.m(g0VarArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.f49764a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.f49764a;
        if (obj instanceof p) {
            obj = ((p) obj).f49764a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.f49764a, consumer);
    }

    @Override // j$.nio.file.Path, j$.nio.file.s0
    public final /* synthetic */ m0 g(p0 p0Var, d0[] d0VarArr) {
        return k0.b(this.f49764a.register(o0.e(p0Var), a0.l(d0VarArr)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return f(this.f49764a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ i getFileSystem() {
        return g.I(this.f49764a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i2) {
        return f(this.f49764a.getName(i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.f49764a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return f(this.f49764a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return f(this.f49764a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.f49764a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path i(Path path) {
        return f(this.f49764a.resolve(q.f(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.f49764a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this.f49764a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(LinkOption[] linkOptionArr) {
        return f(this.f49764a.toRealPath(a0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    /* renamed from: n */
    public final /* synthetic */ int compareTo(Path path) {
        return this.f49764a.compareTo(q.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return f(this.f49764a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean p(Path path) {
        return this.f49764a.startsWith(q.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean q(Path path) {
        return this.f49764a.endsWith(q.f(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path r(Path path) {
        return f(this.f49764a.resolveSibling(q.f(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return f(this.f49764a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return f(this.f49764a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return b1.a(this.f49764a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.f49764a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i2, int i3) {
        return f(this.f49764a.subpath(i2, i3));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return f(this.f49764a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.f49764a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.f49764a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.f49764a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path v(Path path) {
        return f(this.f49764a.relativize(q.f(path)));
    }
}
