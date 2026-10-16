package com.google.d.f.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class f extends d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7839a;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (SecurityException unused) {
        }
        if (!property.matches("\\n|\\r(?:\\n)?")) {
            property = "\n";
        }
        f7839a = property;
    }

    static int e(String str, int i2) {
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            if (str.charAt(i2) != '%') {
                i2 = i3;
            } else {
                if (i3 >= str.length()) {
                    throw e.c("trailing unquoted '%' character", str, i2);
                }
                char cCharAt = str.charAt(i3);
                if (cCharAt != '%' && cCharAt != 'n') {
                    return i2;
                }
                i2 += 2;
            }
        }
        return -1;
    }

    abstract int a(c cVar, int i2, String str, int i3, int i4, int i5);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        r0 = r14;
        r4 = e(r3, r0.a(r15, r2, r3, r4, r5, r6));
        r14 = r0;
        r1 = r2;
        r0 = r9;
     */
    @Override // com.google.d.f.e.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c(com.google.d.f.e.c r15) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.d.f.e.f.c(com.google.d.f.e.c):void");
    }

    @Override // com.google.d.f.e.d
    public final void d(StringBuilder sb, String str, int i2, int i3) {
        int i4 = i2;
        while (i2 < i3) {
            int i5 = i2 + 1;
            if (str.charAt(i2) == '%') {
                if (i5 == i3) {
                    break;
                }
                char cCharAt = str.charAt(i5);
                if (cCharAt == '%') {
                    sb.append((CharSequence) str, i4, i5);
                } else if (cCharAt == 'n') {
                    sb.append((CharSequence) str, i4, i2);
                    sb.append(f7839a);
                }
                i4 = i2 + 2;
                i2 = i4;
            }
            i2 = i5;
        }
        if (i4 < i3) {
            sb.append((CharSequence) str, i4, i3);
        }
    }
}
