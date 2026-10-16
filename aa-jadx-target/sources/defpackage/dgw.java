package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dgw {
    private final java.lang.CharSequence a;
    private final int b;
    private final int c;
    private final java.text.BreakIterator d;

    public dgw(java.lang.CharSequence charSequence, int i, java.util.Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            defpackage.dki.c("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            defpackage.dki.c("input end index is outside the CharSequence");
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = 0;
        this.c = java.lang.Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new defpackage.dgh(charSequence, i));
    }

    private final boolean i(int i) {
        java.lang.CharSequence charSequence = this.a;
        int i2 = i - 1;
        if (defpackage.afga.f(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i2)), java.lang.Character.UnicodeBlock.HIRAGANA) && defpackage.afga.f(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i)), java.lang.Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return defpackage.afga.f(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i)), java.lang.Character.UnicodeBlock.HIRAGANA) && defpackage.afga.f(java.lang.Character.UnicodeBlock.of(charSequence.charAt(i2)), java.lang.Character.UnicodeBlock.KATAKANA);
    }

    public final int a(int i) {
        c(i);
        int iFollowing = this.d.following(i);
        return (g(iFollowing + (-1)) && g(iFollowing) && !i(iFollowing)) ? a(iFollowing) : iFollowing;
    }

    public final int b(int i) {
        c(i);
        int iPreceding = this.d.preceding(i);
        return (g(iPreceding) && d(iPreceding) && !i(iPreceding)) ? b(iPreceding) : iPreceding;
    }

    public final void c(int i) {
        int i2 = this.c;
        if (i > i2 || this.b > i) {
            defpackage.dki.c("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + i2 + "]");
        }
    }

    public final boolean d(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        java.lang.CharSequence charSequence = this.a;
        if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(charSequence, i)) || java.lang.Character.isSurrogate(charSequence.charAt(i - 1))) {
            return true;
        }
        defpackage.emx emxVar = defpackage.emx.b;
        return false;
    }

    public final boolean e(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        return defpackage.acmj.q(java.lang.Character.codePointBefore(this.a, i));
    }

    public final boolean f(int i) {
        c(i);
        if (!this.d.isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        if (i <= 0 || i >= this.a.length() - 1) {
            return true;
        }
        return (i(i) || i(i + 1)) ? false : true;
    }

    public final boolean g(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        java.lang.CharSequence charSequence = this.a;
        if (java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(charSequence, i)) || java.lang.Character.isSurrogate(charSequence.charAt(i))) {
            return true;
        }
        defpackage.emx emxVar = defpackage.emx.b;
        return false;
    }

    public final boolean h(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return defpackage.acmj.q(java.lang.Character.codePointAt(this.a, i));
    }
}
