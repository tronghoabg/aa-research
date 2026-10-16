package j$.desugar.sun.nio.fs;

import j$.nio.file.Path;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public final class i extends j$.nio.file.i {
    public final String a;
    public final m b;

    public i(m mVar, String str) {
        this.b = mVar;
        this.a = str;
    }

    @Override // j$.nio.file.i
    public final Path b(String str, String[] strArr) {
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
        return new o(this, str, this.a, "/");
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
    public final j$.nio.file.f0 c(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.desugar.sun.nio.fs.i.c(java.lang.String):j$.nio.file.f0");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.i
    public final Iterable d() {
        return g.A(new Object[]{new o(this, "/", this.a, "/")});
    }

    @Override // j$.nio.file.i
    public final j$.nio.file.spi.c i() {
        return this.b;
    }
}
