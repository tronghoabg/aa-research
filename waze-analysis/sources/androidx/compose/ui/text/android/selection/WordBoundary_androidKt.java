package androidx.compose.ui.text.android.selection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(WordIterator wordIterator, int i2) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i2)) ? wordIterator.getPunctuationEnd(i2) : wordIterator.getNextWordEndOnTwoWordBoundary(i2);
        return punctuationEnd == -1 ? i2 : punctuationEnd;
    }

    public static final int getWordStart(WordIterator wordIterator, int i2) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i2)) ? wordIterator.getPunctuationBeginning(i2) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i2);
        return punctuationBeginning == -1 ? i2 : punctuationBeginning;
    }
}
