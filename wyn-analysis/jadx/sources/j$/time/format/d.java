package j$.time.format;

/* loaded from: classes2.dex */
final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final char f37572a;

    d(char c10) {
        this.f37572a = c10;
    }

    @Override // j$.time.format.f
    public final boolean o(t tVar, StringBuilder sb2) {
        sb2.append(this.f37572a);
        return true;
    }

    @Override // j$.time.format.f
    public final int q(q qVar, CharSequence charSequence, int i5) {
        if (i5 == charSequence.length()) {
            return ~i5;
        }
        char cCharAt = charSequence.charAt(i5);
        char c10 = this.f37572a;
        return (cCharAt == c10 || (!qVar.j() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c10) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c10)))) ? i5 + 1 : ~i5;
    }

    public final String toString() {
        char c10 = this.f37572a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
