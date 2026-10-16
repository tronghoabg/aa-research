package com.google.d.b;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e extends p {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f7233a;

    e(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.f7233a = charArray;
        Arrays.sort(charArray);
    }

    @Override // com.google.d.b.p
    public final boolean a(char c2) {
        return Arrays.binarySearch(this.f7233a, c2) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c2 : this.f7233a) {
            sb.append(p.k(c2));
        }
        sb.append("\")");
        return sb.toString();
    }
}
