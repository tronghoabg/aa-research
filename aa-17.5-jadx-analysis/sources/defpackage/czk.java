package defpackage;

import java.text.BreakIterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class czk extends cze {
    public static czk b;
    public final BreakIterator c;

    public czk(Locale locale) {
        this.c = BreakIterator.getWordInstance(locale);
    }

    private final boolean e(int i) {
        if (i <= 0 || !f(i - 1)) {
            return false;
        }
        return i == a().length() || !f(i);
    }

    private final boolean f(int i) {
        if (i < 0 || i >= a().length()) {
            return false;
        }
        return Character.isLetterOrDigit(a().codePointAt(i));
    }

    private final boolean g(int i) {
        if (f(i)) {
            return i == 0 || !f(i + (-1));
        }
        return false;
    }

    @Override // defpackage.czj
    public final int[] c(int i) {
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                i = 0;
            }
            while (!f(i) && !g(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    affa.d("impl");
                    breakIterator = null;
                }
                i = breakIterator.following(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                affa.d("impl");
                breakIterator2 = null;
            }
            int iFollowing = breakIterator2.following(i);
            if (iFollowing != -1 && e(iFollowing)) {
                return b(i, iFollowing);
            }
        }
        return null;
    }

    @Override // defpackage.czj
    public final int[] d(int i) {
        int length = a().length();
        if (length > 0 && i > 0) {
            if (i > length) {
                i = length;
            }
            while (i > 0 && !f(i - 1) && !e(i)) {
                BreakIterator breakIterator = this.c;
                if (breakIterator == null) {
                    affa.d("impl");
                    breakIterator = null;
                }
                i = breakIterator.preceding(i);
                if (i == -1) {
                    break;
                }
            }
            BreakIterator breakIterator2 = this.c;
            if (breakIterator2 == null) {
                affa.d("impl");
                breakIterator2 = null;
            }
            int iPreceding = breakIterator2.preceding(i);
            if (iPreceding != -1 && g(iPreceding)) {
                return b(iPreceding, i);
            }
        }
        return null;
    }
}
