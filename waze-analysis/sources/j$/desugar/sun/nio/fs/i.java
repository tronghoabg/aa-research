package j$.desugar.sun.nio.fs;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.nio.file.Path;
import j$.nio.file.p0;
import j$.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i extends j$.nio.file.i {

    /* renamed from: a, reason: collision with root package name */
    public final String f49666a;

    /* renamed from: b, reason: collision with root package name */
    public final m f49667b;

    public i(m mVar, String str) {
        this.f49667b = mVar;
        this.f49666a = str;
    }

    @Override // j$.nio.file.i
    public final Set H() {
        return j$.com.android.tools.r8.a.J(new Object[]{"basic"});
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.i
    public final Iterable e() {
        throw new UnsupportedOperationException("");
    }

    @Override // j$.nio.file.i
    public final Path g(String str, String[] strArr) {
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            for (String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new o(this, str, this.f49666a, DomExceptionUtils.SEPARATOR);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0120, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013b, code lost:
    
        if (r7 != ']') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013d, code lost:
    
        r1.append("]]");
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014d, code lost:
    
        throw new java.util.regex.PatternSyntaxException("Missing ']", r0, r4 - 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00fe A[SYNTHETIC] */
    @Override // j$.nio.file.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.nio.file.x i(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.i.i(java.lang.String):j$.nio.file.x");
    }

    @Override // j$.nio.file.i
    public final boolean isOpen() {
        return true;
    }

    @Override // j$.nio.file.i
    public final Iterable j() {
        return j$.com.android.tools.r8.a.I(new Object[]{new o(this, DomExceptionUtils.SEPARATOR, this.f49666a, DomExceptionUtils.SEPARATOR)});
    }

    @Override // j$.nio.file.i
    public final String n() {
        return DomExceptionUtils.SEPARATOR;
    }

    @Override // j$.nio.file.i
    public final j$.com.android.tools.r8.a p() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.i
    public final boolean q() {
        return false;
    }

    @Override // j$.nio.file.i
    public final p0 r() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.i
    public final FileSystemProvider v() {
        return this.f49667b;
    }
}
