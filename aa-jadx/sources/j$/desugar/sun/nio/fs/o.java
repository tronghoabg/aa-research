package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements j$.nio.file.Path {
    public static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("/+");
    public final j$.nio.file.i a;
    public final java.lang.String b;
    public final java.util.List c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public volatile byte[] g;

    public o(j$.nio.file.i iVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this(iVar, str.startsWith("/"), str.isEmpty() ? java.util.Collections.singletonList("") : (java.util.List) j$.util.DesugarArrays.stream(h.split(str)).filter(new j$.desugar.sun.nio.fs.n((byte) 0)).collect(new j$.util.stream.f(new j$.desugar.sun.nio.fs.n((byte) 18), new j$.desugar.sun.nio.fs.n((byte) 19), new j$.desugar.sun.nio.fs.n((byte) 20), new j$.desugar.sun.nio.fs.n((byte) 21), j$.util.stream.Collectors.c)), str2, str3);
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final j$.nio.file.u0 c(j$.nio.file.x0 x0Var, j$.nio.file.l0[] l0VarArr, j$.nio.file.o0... o0VarArr) {
        throw new java.lang.UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(java.lang.String str) {
        return o(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof j$.desugar.sun.nio.fs.o) && compareTo((j$.desugar.sun.nio.fs.o) obj) == 0;
    }

    @Override // j$.nio.file.Path, j$.nio.file.a1
    public final j$.nio.file.u0 f(j$.nio.file.x0 x0Var, j$.nio.file.l0... l0VarArr) {
        c(x0Var, l0VarArr, new j$.nio.file.o0[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path getFileName() {
        java.util.List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, (java.lang.String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.i getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path getRoot() {
        if (!this.d) {
            return null;
        }
        java.lang.String str = this.f;
        return new j$.desugar.sun.nio.fs.o(this.a, str, this.e, str);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o getName(int i) {
        if (i >= 0) {
            java.util.List list = this.c;
            if (i < list.size()) {
                return new j$.desugar.sun.nio.fs.o(this.a, (java.lang.String) list.get(i), this.e, this.f);
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Requested name for index (%d) is out of bound in \n%s.", java.lang.Integer.valueOf(i), this));
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new j$.nio.file.w(this);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path j(j$.nio.file.LinkOption[] linkOptionArr) {
        j$.nio.file.i iVar = this.a;
        iVar.i().a(this, j$.nio.file.b.READ);
        return java.util.Arrays.asList(linkOptionArr).contains(j$.nio.file.LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new j$.desugar.sun.nio.fs.o(iVar, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o getParent() {
        java.util.List list = this.c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.d;
        if (size == 1 && !z) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(j$.desugar.sun.nio.fs.g.z(list.subList(0, size - 1)));
        return new j$.desugar.sun.nio.fs.o(this.a, sb.toString(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o i(j$.nio.file.Path path) {
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (oVar.d) {
            return oVar;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, this.b + "/" + java.lang.String.valueOf(path), this.e, this.f);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j$.nio.file.Path path) {
        return this.b.compareTo(((j$.desugar.sun.nio.fs.o) path).b);
    }

    @Override // j$.nio.file.Path
    public final boolean n(j$.nio.file.Path path) {
        int nameCount;
        path.getClass();
        if (!(path instanceof j$.desugar.sun.nio.fs.o) || this.d != path.isAbsolute() || this.c.size() < (nameCount = path.getNameCount())) {
            return false;
        }
        for (int i = 0; i < nameCount; i++) {
            if (!getName(i).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path normalize() {
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        for (java.lang.String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new j$.desugar.sun.nio.fs.o(this.a, (this.d ? "/" : "").concat(j$.desugar.sun.nio.fs.g.z(arrayDeque)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean o(j$.nio.file.Path path) {
        path.getClass();
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        java.util.List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o q(j$.nio.file.Path path) {
        path.getClass();
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o parent = getParent();
        return parent == null ? (j$.desugar.sun.nio.fs.o) path : parent.i(path);
    }

    @Override // j$.nio.file.Path
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final j$.desugar.sun.nio.fs.o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        java.lang.String str = this.e;
        return new j$.desugar.sun.nio.fs.o(this.a, str, str, this.f).i(this);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path resolve(java.lang.String str) {
        return i(getFileSystem().b(str, new java.lang.String[0]));
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path resolveSibling(java.lang.String str) {
        return q(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(java.lang.String str) {
        return n(new j$.desugar.sun.nio.fs.o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path subpath(int i, int i2) {
        return new j$.desugar.sun.nio.fs.o(this.a, j$.desugar.sun.nio.fs.g.z(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final java.io.File toFile() {
        return new java.io.File(this.b);
    }

    @Override // j$.nio.file.Path
    public final java.lang.String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final java.net.URI toUri() {
        char[] cArr = j$.desugar.sun.nio.fs.p.c;
        j$.desugar.sun.nio.fs.o absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(j$.desugar.sun.nio.fs.q.a);
        }
        byte[] bArr = absolutePath.g;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = j$.desugar.sun.nio.fs.p.a;
            long j2 = j$.desugar.sun.nio.fs.p.b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : (j & (1 << c)) == 0) {
                sb.append('%');
                char[] cArr2 = j$.desugar.sun.nio.fs.p.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new java.net.URI(sb.toString());
        } catch (java.net.URISyntaxException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.Path u(j$.nio.file.Path path) {
        int i = 0;
        if (!(path instanceof j$.desugar.sun.nio.fs.o)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        j$.desugar.sun.nio.fs.o oVar = (j$.desugar.sun.nio.fs.o) path;
        if (this.d != oVar.d) {
            j$.time.g.a("'other' is different type of Path in absolute property.");
            return null;
        }
        java.util.List list = oVar.c;
        java.util.List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((java.lang.String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((java.lang.String) list.get(i));
            i++;
        }
        return new j$.desugar.sun.nio.fs.o(this.a, false, arrayList, this.e, this.f);
    }

    public o(j$.nio.file.i iVar, boolean z, java.util.List list, java.lang.String str, java.lang.String str2) {
        this.a = iVar;
        this.d = z;
        this.c = list;
        this.b = (z ? "/" : "").concat(j$.desugar.sun.nio.fs.g.z(list));
        this.e = str;
        this.f = str2;
    }
}
