package k8;

/* renamed from: k8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3194c extends AbstractC3193b {

    /* renamed from: a, reason: collision with root package name */
    public final char f39294a;

    public C3194c(char c10) {
        this.f39294a = c10;
    }

    @Override // k8.AbstractC3193b
    public final boolean a(char c10) {
        return c10 == this.f39294a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c10 = this.f39294a;
        for (int i5 = 0; i5 < 4; i5++) {
            cArr[5 - i5] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
