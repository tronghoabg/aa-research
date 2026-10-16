package com.google.l.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    private char[] f12330a;

    /* renamed from: b, reason: collision with root package name */
    private String f12331b;

    final void a(char[] cArr) {
        this.f12330a = cArr;
        this.f12331b = null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f12330a[i2];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f12330a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new String(this.f12330a, i2, i3 - i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f12331b;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f12330a);
        this.f12331b = str2;
        return str2;
    }
}
