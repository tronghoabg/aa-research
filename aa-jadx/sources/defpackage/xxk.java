package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class xxk extends defpackage.xxv {
    private final char[] a;

    public xxk(java.lang.CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        java.util.Arrays.sort(charArray);
    }

    @Override // defpackage.xxv
    public final boolean b(char c) {
        return java.util.Arrays.binarySearch(this.a, c) >= 0;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(defpackage.xxv.i(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
