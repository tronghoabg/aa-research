package androidx.compose.ui.text;

import java.text.BreakIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CharHelpers_androidKt {
    public static final int findFollowingBreak(String str, int i2) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i2);
    }

    public static final int findPrecedingBreak(String str, int i2) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }
}
