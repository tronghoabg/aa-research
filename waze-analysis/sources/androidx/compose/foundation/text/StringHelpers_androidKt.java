package androidx.compose.foundation.text;

import androidx.emoji2.text.EmojiCompat;
import java.text.BreakIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    private static final int findCodePointBefore(CharSequence charSequence, int i2, int i3) {
        return i2 <= 0 ? i3 : Character.offsetByCodePoints(charSequence, i2, -1);
    }

    public static final int findCodePointOrEmojiStartBefore(String str, int i2, int i3) {
        if (i2 <= 0) {
            return i3;
        }
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        if (emojiCompatIfLoaded == null) {
            return findCodePointBefore(str, i2, i3);
        }
        String str2 = str;
        int emojiStart = emojiCompatIfLoaded.getEmojiStart(str2, i2 - 1);
        return emojiStart < 0 ? findCodePointBefore(str2, i2, i3) : emojiStart;
    }

    public static final int findFollowingBreak(String str, int i2) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer numValueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiEnd(str, i2));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i2);
    }

    public static final int findPrecedingBreak(String str, int i2) {
        EmojiCompat emojiCompatIfLoaded = getEmojiCompatIfLoaded();
        Integer num = null;
        if (emojiCompatIfLoaded != null) {
            Integer numValueOf = Integer.valueOf(emojiCompatIfLoaded.getEmojiStart(str, Math.max(0, i2 - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    private static final EmojiCompat getEmojiCompatIfLoaded() {
        if (!EmojiCompat.isConfigured()) {
            return null;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        if (emojiCompat.getLoadState() == 1) {
            return emojiCompat;
        }
        return null;
    }
}
