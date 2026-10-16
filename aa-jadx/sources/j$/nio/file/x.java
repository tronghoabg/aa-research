package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements j$.nio.file.Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    public /* synthetic */ x(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ j$.nio.file.Path h(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof j$.nio.file.y ? ((j$.nio.file.y) path).a : new j$.nio.file.x(path);
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final /* synthetic */ j$.nio.file.u0 c(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr, j$.nio.file.o0[] o0VarArr) {
        return j$.nio.file.s0.b(this.a.register(j$.nio.file.w0.a(x0Var), j$.nio.file.i0.l(l0VarArr), j$.nio.file.i0.m(o0VarArr)));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(j$.nio.file.Path path) {
        return this.a.compareTo(j$.nio.file.a.g(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(java.lang.String str) {
        return this.a.endsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(java.lang.Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof j$.nio.file.x) {
            obj = ((j$.nio.file.x) obj).a;
        }
        return path.equals(obj);
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final /* synthetic */ j$.nio.file.u0 f(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr) {
        return j$.nio.file.s0.b(this.a.register(j$.nio.file.w0.a(x0Var), j$.nio.file.i0.l(l0VarArr)));
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        j$.lang.Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path getFileName() {
        return h(this.a.getFileName());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.i getFileSystem() {
        return j$.nio.file.g.k(this.a.getFileSystem());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path getName(int i) {
        return h(this.a.getName(i));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        return this.a.getNameCount();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path getParent() {
        return h(this.a.getParent());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path getRoot() {
        return h(this.a.getRoot());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path i(j$.nio.file.Path path) {
        return h(this.a.resolve(j$.nio.file.y.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        return this.a.isAbsolute();
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.c0(this.a.iterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path j(j$.nio.file.LinkOption[] linkOptionArr) {
        return h(this.a.toRealPath(j$.nio.file.i0.k(linkOptionArr)));
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int compareTo(j$.nio.file.Path path) {
        return this.a.compareTo(j$.nio.file.y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean n(j$.nio.file.Path path) {
        return this.a.startsWith(j$.nio.file.y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path normalize() {
        return h(this.a.normalize());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean o(j$.nio.file.Path path) {
        return this.a.endsWith(j$.nio.file.y.h(path));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path q(j$.nio.file.Path path) {
        return h(this.a.resolveSibling(j$.nio.file.y.h(path)));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path resolve(java.lang.String str) {
        return h(this.a.resolve(str));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path resolveSibling(java.lang.String str) {
        return h(this.a.resolveSibling(str));
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ j$.util.Spliterator spliterator() {
        return j$.util.l0.a(this.a.spliterator());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(java.lang.String str) {
        return this.a.startsWith(str);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path subpath(int i, int i2) {
        return h(this.a.subpath(i, i2));
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path toAbsolutePath() {
        return h(this.a.toAbsolutePath());
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ java.io.File toFile() {
        return this.a.toFile();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ java.lang.String toString() {
        return this.a.toString();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ java.net.URI toUri() {
        return this.a.toUri();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ j$.nio.file.Path u(j$.nio.file.Path path) {
        return h(this.a.relativize(j$.nio.file.y.h(path)));
    }
}
