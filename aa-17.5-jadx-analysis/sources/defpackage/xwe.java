package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
final class xwe extends xwp {
    private final char[] a;

    public xwe(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.xwp
    public final boolean b(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(xwp.i(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
