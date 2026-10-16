package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import h.g.b.o;
import h.g.b.x;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WordIterator(CharSequence charSequence, int i2, int i3, Locale locale) {
        this.charSequence = charSequence;
        if (i2 < 0 || i2 > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (i3 < 0 || i3 > charSequence.length()) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i2 - 50);
        this.end = Math.min(charSequence.length(), i3 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2, i3));
    }

    private final void checkOffsetIsValid(int i2) {
        if (i2 > this.end || this.start > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("Invalid offset: " + i2 + ". Valid range is [" + this.start + " , " + this.end + ']');
        }
    }

    private final int getBeginning(int i2, boolean z) {
        checkOffsetIsValid(i2);
        if (isOnLetterOrDigitOrEmoji(i2)) {
            return (!isBoundary(i2) || (isAfterLetterOrDigitOrEmoji(i2) && z)) ? prevBoundary(i2) : i2;
        }
        if (isAfterLetterOrDigitOrEmoji(i2)) {
            return prevBoundary(i2);
        }
        return -1;
    }

    private final int getEnd(int i2, boolean z) {
        checkOffsetIsValid(i2);
        if (isAfterLetterOrDigitOrEmoji(i2)) {
            return (!isBoundary(i2) || (isOnLetterOrDigitOrEmoji(i2) && z)) ? nextBoundary(i2) : i2;
        }
        if (isOnLetterOrDigitOrEmoji(i2)) {
            return nextBoundary(i2);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int i2) {
        if (i2 > this.end || this.start + 1 > i2) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i2))) {
            return true;
        }
        int i3 = i2 - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i3))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i3) != -1;
    }

    private final boolean isBoundary(int i2) {
        checkOffsetIsValid(i2);
        if (!this.iterator.isBoundary(i2)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i2) && isOnLetterOrDigitOrEmoji(i2 - 1) && isOnLetterOrDigitOrEmoji(i2 + 1)) {
            return false;
        }
        if (i2 <= 0 || i2 >= this.charSequence.length() - 1) {
            return true;
        }
        return (isHiraganaKatakanaBoundary(i2) || isHiraganaKatakanaBoundary(i2 + 1)) ? false : true;
    }

    private final boolean isHiraganaKatakanaBoundary(int i2) {
        int i3 = i2 - 1;
        if (x.n(Character.UnicodeBlock.of(this.charSequence.charAt(i3)), Character.UnicodeBlock.HIRAGANA) && x.n(Character.UnicodeBlock.of(this.charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return x.n(Character.UnicodeBlock.of(this.charSequence.charAt(i2)), Character.UnicodeBlock.HIRAGANA) && x.n(Character.UnicodeBlock.of(this.charSequence.charAt(i3)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean isOnLetterOrDigitOrEmoji(int i2) {
        if (i2 >= this.end || this.start > i2) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i2)) || Character.isSurrogate(this.charSequence.charAt(i2))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i2) != -1;
    }

    private final boolean isPunctuationEndBoundary(int i2) {
        return !isOnPunctuation(i2) && isAfterPunctuation(i2);
    }

    private final boolean isPunctuationStartBoundary(int i2) {
        return isOnPunctuation(i2) && !isAfterPunctuation(i2);
    }

    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i2) {
        return getEnd(i2, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i2) {
        return getBeginning(i2, true);
    }

    public final int getPunctuationBeginning(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationStartBoundary(i2)) {
            i2 = prevBoundary(i2);
        }
        return i2;
    }

    public final int getPunctuationEnd(int i2) {
        checkOffsetIsValid(i2);
        while (i2 != -1 && !isPunctuationEndBoundary(i2)) {
            i2 = nextBoundary(i2);
        }
        return i2;
    }

    public final boolean isAfterPunctuation(int i2) {
        if (i2 > this.end || this.start + 1 > i2) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointBefore(this.charSequence, i2));
    }

    public final boolean isOnPunctuation(int i2) {
        if (i2 >= this.end || this.start > i2) {
            return false;
        }
        return Companion.isPunctuation$ui_text(Character.codePointAt(this.charSequence, i2));
    }

    public final int nextBoundary(int i2) {
        checkOffsetIsValid(i2);
        int iFollowing = this.iterator.following(i2);
        return (isOnLetterOrDigitOrEmoji(iFollowing + (-1)) && isOnLetterOrDigitOrEmoji(iFollowing) && !isHiraganaKatakanaBoundary(iFollowing)) ? nextBoundary(iFollowing) : iFollowing;
    }

    public final int prevBoundary(int i2) {
        checkOffsetIsValid(i2);
        int iPreceding = this.iterator.preceding(i2);
        return (isOnLetterOrDigitOrEmoji(iPreceding) && isAfterLetterOrDigitOrEmoji(iPreceding) && !isHiraganaKatakanaBoundary(iPreceding)) ? prevBoundary(iPreceding) : iPreceding;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isPunctuation$ui_text(int i2) {
            int type = Character.getType(i2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
