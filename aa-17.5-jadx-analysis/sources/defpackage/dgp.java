package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class dgp {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final BreakIterator d;

    public dgp(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() < 0) {
            dka.c("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            dka.c("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new dga(charSequence, i));
    }

    private final boolean i(int i) {
        CharSequence charSequence = this.a;
        int i2 = i - 1;
        if (affa.f(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.HIRAGANA) && affa.f(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return affa.f(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.HIRAGANA) && affa.f(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
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
            dka.c("Invalid offset: " + i + ". Valid range is [" + this.b + " , " + i2 + "]");
        }
    }

    public final boolean d(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        CharSequence charSequence = this.a;
        if (Character.isLetterOrDigit(Character.codePointBefore(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i - 1))) {
            return true;
        }
        emr emrVar = emr.b;
        return false;
    }

    public final boolean e(int i) {
        if (i > this.c || this.b + 1 > i) {
            return false;
        }
        return aclh.x(Character.codePointBefore(this.a, i));
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
        CharSequence charSequence = this.a;
        if (Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) || Character.isSurrogate(charSequence.charAt(i))) {
            return true;
        }
        emr emrVar = emr.b;
        return false;
    }

    public final boolean h(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return aclh.x(Character.codePointAt(this.a, i));
    }
}
