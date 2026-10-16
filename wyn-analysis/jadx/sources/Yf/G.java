package Yf;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public class G extends J5.f {

    /* renamed from: f, reason: collision with root package name */
    public final String f16831f;

    public G(String source) {
        AbstractC3340k.e(source, "source");
        this.f16831f = source;
    }

    @Override // J5.f
    public final int A(int i5) {
        if (i5 < this.f16831f.length()) {
            return i5;
        }
        return -1;
    }

    @Override // J5.f
    public int E() {
        char cCharAt;
        int i5 = this.f5633b;
        if (i5 == -1) {
            return i5;
        }
        while (true) {
            String str = this.f16831f;
            if (i5 >= str.length() || !((cCharAt = str.charAt(i5)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i5++;
        }
        this.f5633b = i5;
        return i5;
    }

    @Override // J5.f
    public boolean c() {
        int i5 = this.f5633b;
        if (i5 == -1) {
            return false;
        }
        while (true) {
            String str = this.f16831f;
            if (i5 >= str.length()) {
                this.f5633b = i5;
                return false;
            }
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f5633b = i5;
                return J5.f.w(cCharAt);
            }
            i5++;
        }
    }

    @Override // J5.f
    public final String e() {
        h('\"');
        int i5 = this.f5633b;
        String str = this.f16831f;
        int iV0 = Bf.k.v0(str, '\"', i5, 4);
        if (iV0 == -1) {
            l();
            int i10 = this.f5633b;
            J5.f.r(this, AbstractC0279p0.l("Expected quotation mark '\"', but had '", (i10 == str.length() || i10 < 0) ? "EOF" : String.valueOf(str.charAt(i10)), "' instead"), i10, null, 4);
            throw null;
        }
        for (int i11 = i5; i11 < iV0; i11++) {
            if (str.charAt(i11) == '\\') {
                return k(str, this.f5633b, i11);
            }
        }
        this.f5633b = iV0 + 1;
        String strSubstring = str.substring(i5, iV0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.f5633b = r3.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        return 10;
     */
    @Override // J5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte f() {
        /*
            r4 = this;
            int r0 = r4.f5633b
        L2:
            r1 = -1
            r2 = 10
            java.lang.String r3 = r4.f16831f
            if (r0 == r1) goto L2d
            int r1 = r3.length()
            if (r0 >= r1) goto L2d
            int r1 = r0 + 1
            char r0 = r3.charAt(r0)
            r3 = 32
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L2b
            r2 = 13
            if (r0 == r2) goto L2b
            r2 = 9
            if (r0 != r2) goto L24
            goto L2b
        L24:
            r4.f5633b = r1
            byte r0 = Yf.r.f(r0)
            return r0
        L2b:
            r0 = r1
            goto L2
        L2d:
            int r0 = r3.length()
            r4.f5633b = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Yf.G.f():byte");
    }

    @Override // J5.f
    public void h(char c10) {
        int i5 = this.f5633b;
        if (i5 == -1) {
            H(c10);
            throw null;
        }
        while (true) {
            String str = this.f16831f;
            if (i5 >= str.length()) {
                this.f5633b = -1;
                H(c10);
                throw null;
            }
            int i10 = i5 + 1;
            char cCharAt = str.charAt(i5);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f5633b = i10;
                if (cCharAt == c10) {
                    return;
                }
                H(c10);
                throw null;
            }
            i5 = i10;
        }
    }

    @Override // J5.f
    public final CharSequence t() {
        return this.f16831f;
    }

    @Override // J5.f
    public final String x(String keyToMatch, boolean z2) {
        AbstractC3340k.e(keyToMatch, "keyToMatch");
        int i5 = this.f5633b;
        try {
            if (f() != 6) {
                return null;
            }
            if (!AbstractC3340k.a(z(z2), keyToMatch)) {
                return null;
            }
            this.f5635d = null;
            if (f() != 5) {
                return null;
            }
            return z(z2);
        } finally {
            this.f5633b = i5;
            this.f5635d = null;
        }
    }
}
