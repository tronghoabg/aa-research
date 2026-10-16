package j$.desugar.sun.nio.fs;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.d0;
import j$.nio.file.g0;
import j$.nio.file.m0;
import j$.nio.file.p0;
import j$.util.DesugarArrays;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class o implements Path {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f49677h = Pattern.compile("/+");

    /* renamed from: a, reason: collision with root package name */
    public final j$.nio.file.i f49678a;

    /* renamed from: b, reason: collision with root package name */
    public final String f49679b;

    /* renamed from: c, reason: collision with root package name */
    public final List f49680c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f49681d;

    /* renamed from: e, reason: collision with root package name */
    public final String f49682e;

    /* renamed from: f, reason: collision with root package name */
    public final String f49683f;

    /* renamed from: g, reason: collision with root package name */
    public volatile byte[] f49684g;

    public o(j$.nio.file.i iVar, String str, String str2, String str3) {
        this(iVar, str.startsWith(DomExceptionUtils.SEPARATOR), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(f49677h.split(str)).filter(new n(0)).collect(new j$.util.stream.i(new n(14), new n(15), new n(16), new n(17), Collectors.f50308b)), str2, str3);
    }

    @Override // j$.nio.file.Path, j$.nio.file.s0
    public final m0 e(p0 p0Var, d0[] d0VarArr, g0... g0VarArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return q(new o(this.f49678a, str, this.f49682e, this.f49683f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    @Override // j$.nio.file.Path
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final o getName(int i2) {
        if (i2 >= 0) {
            List list = this.f49680c;
            if (i2 < list.size()) {
                return new o(this.f49678a, (String) list.get(i2), this.f49682e, this.f49683f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i2), this));
    }

    @Override // j$.nio.file.Path, j$.nio.file.s0
    public final m0 g(p0 p0Var, d0... d0VarArr) {
        e(p0Var, d0VarArr, new g0[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.f49680c;
        if (list.isEmpty()) {
            if (this.f49681d) {
                return null;
            }
            return this;
        }
        return new o(this.f49678a, (String) list.get(list.size() - 1), this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    public final j$.nio.file.i getFileSystem() {
        return this.f49678a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.f49680c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.f49681d) {
            return null;
        }
        String str = this.f49683f;
        return new o(this.f49678a, str, this.f49682e, str);
    }

    @Override // j$.nio.file.Path
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        List list = this.f49680c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.f49681d;
        if (size == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(DomExceptionUtils.SEPARATOR);
        }
        sb.append(j$.com.android.tools.r8.a.G(list.subList(0, size - 1)));
        return new o(this.f49678a, sb.toString(), this.f49682e, this.f49683f);
    }

    public final int hashCode() {
        return this.f49679b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.f49681d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.o(this);
    }

    @Override // j$.nio.file.Path
    public final Path j(LinkOption[] linkOptionArr) {
        j$.nio.file.i iVar = this.f49678a;
        iVar.v().a(this, j$.nio.file.b.READ);
        return Arrays.asList(linkOptionArr).contains(LinkOption.NOFOLLOW_LINKS) ? toAbsolutePath() : new o(iVar, toFile().getCanonicalPath(), this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final o i(Path path) {
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o oVar = (o) path;
        if (oVar.f49681d) {
            return oVar;
        }
        return new o(this.f49678a, this.f49679b + DomExceptionUtils.SEPARATOR + String.valueOf(path), this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final o r(Path path) {
        if (!(Objects.requireNonNull(path) instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.i(path);
    }

    @Override // java.lang.Comparable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.f49679b.compareTo(((o) path).f49679b);
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.f49680c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new o(this.f49678a, (this.f49681d ? DomExceptionUtils.SEPARATOR : "").concat(j$.com.android.tools.r8.a.G(arrayDeque)), this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    public final boolean p(Path path) {
        int size;
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            return false;
        }
        o oVar = (o) path;
        if (this.f49681d != oVar.f49681d || this.f49680c.size() < (size = oVar.f49680c.size())) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!getName(i2).equals(oVar.getName(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final boolean q(Path path) {
        Objects.requireNonNull(path);
        if (!(path instanceof o)) {
            return false;
        }
        o oVar = (o) path;
        if (oVar.f49681d) {
            return equals(path);
        }
        int size = oVar.f49680c.size();
        List list = this.f49680c;
        if (list.size() < size) {
            return false;
        }
        int size2 = list.size();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            if (!getName((i2 - size) + size2).equals(oVar.getName(i2))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return i(getFileSystem().g(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return r(new o(this.f49678a, str, this.f49682e, this.f49683f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return p(new o(this.f49678a, str, this.f49682e, this.f49683f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i2, int i3) {
        return new o(this.f49678a, j$.com.android.tools.r8.a.G(this.f49680c.subList(i2, i3)), this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.f49679b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.f49679b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.f49687c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.f49684g == null) {
            absolutePath.f49684g = absolutePath.f49679b.getBytes(q.f49688a);
        }
        byte[] bArr = absolutePath.f49684g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i2 = 1; i2 < bArr.length; i2++) {
            char c2 = (char) (bArr[i2] & 255);
            long j2 = p.f49685a;
            long j3 = p.f49686b;
            if (c2 >= '@' ? c2 >= 128 || ((1 << (c2 - '@')) & j3) == 0 : (j2 & (1 << c2)) == 0) {
                sb.append('%');
                char[] cArr2 = p.f49687c;
                sb.append(cArr2[(c2 >> 4) & 15]);
                sb.append(cArr2[c2 & 15]);
            } else {
                sb.append(c2);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // j$.nio.file.Path
    public final Path v(Path path) {
        int i2 = 0;
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o oVar = (o) path;
        if (this.f49681d != oVar.f49681d) {
            j$.time.f.b("'other' is different type of Path in absolute property.");
            return null;
        }
        List list = oVar.f49680c;
        List list2 = this.f49680c;
        int size = list2.size();
        int size2 = list.size();
        while (i2 < size && i2 < size2 && ((String) list2.get(i2)).equals(list.get(i2))) {
            i2++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = i2; i3 < size; i3++) {
            arrayList.add("..");
        }
        while (i2 < size2) {
            arrayList.add((String) list.get(i2));
            i2++;
        }
        return new o(this.f49678a, false, arrayList, this.f49682e, this.f49683f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.f49681d) {
            return this;
        }
        String str = this.f49682e;
        return new o(this.f49678a, str, str, this.f49683f).i(this);
    }

    public o(j$.nio.file.i iVar, boolean z, List list, String str, String str2) {
        this.f49678a = iVar;
        this.f49681d = z;
        this.f49680c = list;
        this.f49679b = (z ? DomExceptionUtils.SEPARATOR : "").concat(j$.com.android.tools.r8.a.G(list));
        this.f49682e = str;
        this.f49683f = str2;
    }
}
