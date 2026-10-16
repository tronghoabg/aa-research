package com.google.d.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class p implements ab {
    protected p() {
    }

    public static p f(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new e(charSequence) : new i(charSequence.charAt(0), charSequence.charAt(1)) : new h(charSequence.charAt(0)) : n.f7242a;
    }

    public static p g() {
        return f.f7234a;
    }

    public static p h(char c2) {
        return new h(c2);
    }

    public static p i() {
        return k.f7239a;
    }

    public static p j(CharSequence charSequence) {
        return f(charSequence).b();
    }

    static /* bridge */ /* synthetic */ String k(char c2) {
        char[] cArr = new char[6];
        int i2 = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i3 = c2;
        while (i2 < 4) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i3 & 15);
            i2++;
            i3 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    public static p m() {
        return new j(' ');
    }

    public abstract boolean a(char c2);

    @Override // com.google.d.b.ab
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }

    public p b() {
        return new m(this);
    }

    public final int c(CharSequence charSequence) {
        int i2 = 0;
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (a(charSequence.charAt(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public int d(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        an.E(i2, length);
        while (i2 < length) {
            if (a(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final p e(p pVar) {
        return new c(this, pVar);
    }

    public boolean l(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (a(charSequence.charAt(length)));
        return false;
    }
}
