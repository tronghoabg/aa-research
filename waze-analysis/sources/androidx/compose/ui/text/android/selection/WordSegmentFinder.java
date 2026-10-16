package androidx.compose.ui.text.android.selection;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;
    private final CharSequence text;
    private final WordIterator wordIterator;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i2) {
        do {
            i2 = this.wordIterator.nextBoundary(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2 - 1)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i2) {
        do {
            i2 = this.wordIterator.nextBoundary(i2);
            if (i2 == -1 || i2 == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i2) {
        do {
            i2 = this.wordIterator.prevBoundary(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2 - 1)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i2) {
        do {
            i2 = this.wordIterator.prevBoundary(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i2)));
        return i2;
    }
}
