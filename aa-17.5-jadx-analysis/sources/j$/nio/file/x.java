package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ x(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path h(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof y ? ((y) path).a : new x(path);
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final /* synthetic */ u0 c(x0 x0Var, l0[] l0VarArr, o0[] o0VarArr) {
        return s0.b(this.a.register(w0.a(x0Var), i0.l(l0VarArr), i0.m(o0VarArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo((java.nio.file.Path) a.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof x) {
            obj = ((x) obj).a;
        }
        return path.equals(obj);
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final /* synthetic */ u0 f(x0 x0Var, l0[] l0VarArr) {
        return s0.b(this.a.register(w0.a(x0Var), i0.l(l0VarArr)));
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ i getFileSystem() {
        return g.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        return h(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        return h(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path i(Path path) {
        return h(this.a.resolve(y.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new c0(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path j(LinkOption[] linkOptionArr) {
        return h(this.a.toRealPath(i0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    /* renamed from: m */
    public final /* synthetic */ int compareTo(Path path) {
        return this.a.compareTo(y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean n(Path path) {
        return this.a.startsWith(y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        return h(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean o(Path path) {
        return this.a.endsWith(y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path q(Path path) {
        return h(this.a.resolveSibling(y.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        return h(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.l0.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path u(Path path) {
        return h(this.a.relativize(y.h(path)));
    }
}
