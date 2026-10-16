package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.text.BreakIterator;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AccessibilityIterators {
    public static final int $stable = 0;

    /* compiled from: WazeSource */
    public abstract class AbstractTextSegmentIterator implements TextSegmentIterator {
        public static final int $stable = 8;
        private final int[] segment = new int[2];
        protected String text;

        protected final int[] getRange(int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i2 == i3) {
                return null;
            }
            int[] iArr = this.segment;
            iArr[0] = i2;
            iArr[1] = i3;
            return iArr;
        }

        protected final String getText() {
            String str = this.text;
            if (str != null) {
                return str;
            }
            x.j("text");
            return null;
        }

        public void initialize(String str) {
            setText(str);
        }

        protected final void setText(String str) {
            this.text = str;
        }
    }

    /* compiled from: WazeSource */
    public interface TextSegmentIterator {
        int[] following(int i2);

        int[] preceding(int i2);
    }

    /* compiled from: WazeSource */
    public class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        private static CharacterTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private CharacterTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getCharacterInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int length = getText().length();
            if (length > 0 && i2 < length) {
                if (i2 < 0) {
                    i2 = 0;
                }
                while (true) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        x.j("impl");
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = this.impl;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            x.j("impl");
                            breakIterator2 = null;
                        }
                        int iFollowing = breakIterator2.following(i2);
                        if (iFollowing != -1) {
                            return getRange(i2, iFollowing);
                        }
                    } else {
                        if (breakIterator2 == null) {
                            x.j("impl");
                            breakIterator2 = null;
                        }
                        i2 = breakIterator2.following(i2);
                        if (i2 == -1) {
                            break;
                        }
                    }
                }
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                x.j("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length > 0 && i2 > 0) {
                if (i2 > length) {
                    i2 = length;
                }
                while (true) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        x.j("impl");
                        breakIterator = null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i2);
                    BreakIterator breakIterator2 = this.impl;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            x.j("impl");
                            breakIterator2 = null;
                        }
                        int iPreceding = breakIterator2.preceding(i2);
                        if (iPreceding != -1) {
                            return getRange(iPreceding, i2);
                        }
                    } else {
                        if (breakIterator2 == null) {
                            x.j("impl");
                            breakIterator2 = null;
                        }
                        i2 = breakIterator2.preceding(i2);
                        if (i2 == -1) {
                            break;
                        }
                    }
                }
            }
            return null;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final CharacterTextSegmentIterator getInstance(Locale locale) {
                if (CharacterTextSegmentIterator.instance == null) {
                    CharacterTextSegmentIterator.instance = new CharacterTextSegmentIterator(locale, null);
                }
                CharacterTextSegmentIterator characterTextSegmentIterator = CharacterTextSegmentIterator.instance;
                x.d(characterTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
                return characterTextSegmentIterator;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ CharacterTextSegmentIterator(Locale locale, o oVar) {
            this(locale);
        }
    }

    /* compiled from: WazeSource */
    public final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        private static LineTextSegmentIterator lineInstance;
        private TextLayoutResult layoutResult;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        public /* synthetic */ LineTextSegmentIterator(o oVar) {
            this();
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                x.j("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                x.j("layoutResult");
                textLayoutResult3 = null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult3.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult4 == null) {
                    x.j("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i2);
            }
            if (textLayoutResult4 == null) {
                x.j("layoutResult");
                textLayoutResult4 = null;
            }
            return textLayoutResult4.getLineEnd(i2, false & ((2 & 2) == 0)) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int lineForOffset;
            if (getText().length() > 0 && i2 < getText().length()) {
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (i2 < 0) {
                    if (textLayoutResult == null) {
                        x.j("layoutResult");
                        textLayoutResult = null;
                    }
                    lineForOffset = textLayoutResult.getLineForOffset(0);
                } else {
                    if (textLayoutResult == null) {
                        x.j("layoutResult");
                        textLayoutResult = null;
                    }
                    int lineForOffset2 = textLayoutResult.getLineForOffset(i2);
                    lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionStart) == i2 ? lineForOffset2 : lineForOffset2 + 1;
                }
                TextLayoutResult textLayoutResult2 = this.layoutResult;
                if (textLayoutResult2 == null) {
                    x.j("layoutResult");
                    textLayoutResult2 = null;
                }
                if (lineForOffset < textLayoutResult2.getLineCount()) {
                    return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
                }
            }
            return null;
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult) {
            setText(str);
            this.layoutResult = textLayoutResult;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int lineForOffset;
            if (getText().length() > 0 && i2 > 0) {
                int length = getText().length();
                TextLayoutResult textLayoutResult = this.layoutResult;
                if (i2 > length) {
                    if (textLayoutResult == null) {
                        x.j("layoutResult");
                        textLayoutResult = null;
                    }
                    lineForOffset = textLayoutResult.getLineForOffset(getText().length());
                } else {
                    if (textLayoutResult == null) {
                        x.j("layoutResult");
                        textLayoutResult = null;
                    }
                    int lineForOffset2 = textLayoutResult.getLineForOffset(i2);
                    lineForOffset = getLineEdgeIndex(lineForOffset2, DirectionEnd) + 1 == i2 ? lineForOffset2 : lineForOffset2 - 1;
                }
                if (lineForOffset >= 0) {
                    return getRange(getLineEdgeIndex(lineForOffset, DirectionStart), getLineEdgeIndex(lineForOffset, DirectionEnd) + 1);
                }
            }
            return null;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final LineTextSegmentIterator getInstance() {
                if (LineTextSegmentIterator.lineInstance == null) {
                    LineTextSegmentIterator.lineInstance = new LineTextSegmentIterator(null);
                }
                LineTextSegmentIterator lineTextSegmentIterator = LineTextSegmentIterator.lineInstance;
                x.d(lineTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
                return lineTextSegmentIterator;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        private LineTextSegmentIterator() {
        }
    }

    /* compiled from: WazeSource */
    public final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        private static PageTextSegmentIterator pageInstance;
        private TextLayoutResult layoutResult;
        private SemanticsNode node;
        private Rect tempRect;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;
        private static final ResolvedTextDirection DirectionStart = ResolvedTextDirection.Rtl;
        private static final ResolvedTextDirection DirectionEnd = ResolvedTextDirection.Ltr;

        private PageTextSegmentIterator() {
            this.tempRect = new Rect();
        }

        private final int getLineEdgeIndex(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.layoutResult;
            TextLayoutResult textLayoutResult2 = null;
            if (textLayoutResult == null) {
                x.j("layoutResult");
                textLayoutResult = null;
            }
            int lineStart = textLayoutResult.getLineStart(i2);
            TextLayoutResult textLayoutResult3 = this.layoutResult;
            if (textLayoutResult3 == null) {
                x.j("layoutResult");
                textLayoutResult3 = null;
            }
            ResolvedTextDirection paragraphDirection = textLayoutResult3.getParagraphDirection(lineStart);
            TextLayoutResult textLayoutResult4 = this.layoutResult;
            if (resolvedTextDirection != paragraphDirection) {
                if (textLayoutResult4 == null) {
                    x.j("layoutResult");
                } else {
                    textLayoutResult2 = textLayoutResult4;
                }
                return textLayoutResult2.getLineStart(i2);
            }
            if (textLayoutResult4 == null) {
                x.j("layoutResult");
                textLayoutResult4 = null;
            }
            return textLayoutResult4.getLineEnd(i2, false & ((2 & 2) == 0)) - 1;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int lineCount;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() > 0 && i2 < getText().length()) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    if (semanticsNode == null) {
                        x.j("node");
                        semanticsNode = null;
                    }
                    androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                    int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                    int iH = n.h(0, i2);
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        x.j("layoutResult");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(iH);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        x.j("layoutResult");
                        textLayoutResult3 = null;
                    }
                    float lineTop = textLayoutResult3.getLineTop(lineForOffset) + iRound;
                    TextLayoutResult textLayoutResult4 = this.layoutResult;
                    if (textLayoutResult4 == null) {
                        x.j("layoutResult");
                        textLayoutResult4 = null;
                    }
                    TextLayoutResult textLayoutResult5 = this.layoutResult;
                    if (textLayoutResult5 == null) {
                        x.j("layoutResult");
                        textLayoutResult5 = null;
                    }
                    float lineTop2 = textLayoutResult4.getLineTop(textLayoutResult5.getLineCount() - 1);
                    TextLayoutResult textLayoutResult6 = this.layoutResult;
                    if (lineTop < lineTop2) {
                        if (textLayoutResult6 == null) {
                            x.j("layoutResult");
                        } else {
                            textLayoutResult = textLayoutResult6;
                        }
                        lineCount = textLayoutResult.getLineForVerticalPosition(lineTop);
                    } else {
                        if (textLayoutResult6 == null) {
                            x.j("layoutResult");
                        } else {
                            textLayoutResult = textLayoutResult6;
                        }
                        lineCount = textLayoutResult.getLineCount();
                    }
                    return getRange(iH, getLineEdgeIndex(lineCount - 1, DirectionEnd) + 1);
                } catch (IllegalStateException unused) {
                }
            }
            return null;
        }

        public final void initialize(String str, TextLayoutResult textLayoutResult, SemanticsNode semanticsNode) {
            setText(str);
            this.layoutResult = textLayoutResult;
            this.node = semanticsNode;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int lineForVerticalPosition;
            TextLayoutResult textLayoutResult = null;
            if (getText().length() > 0 && i2 > 0) {
                try {
                    SemanticsNode semanticsNode = this.node;
                    if (semanticsNode == null) {
                        x.j("node");
                        semanticsNode = null;
                    }
                    androidx.compose.ui.geometry.Rect boundsInRoot = semanticsNode.getBoundsInRoot();
                    int iRound = Math.round(boundsInRoot.getBottom() - boundsInRoot.getTop());
                    int i3 = n.i(getText().length(), i2);
                    TextLayoutResult textLayoutResult2 = this.layoutResult;
                    if (textLayoutResult2 == null) {
                        x.j("layoutResult");
                        textLayoutResult2 = null;
                    }
                    int lineForOffset = textLayoutResult2.getLineForOffset(i3);
                    TextLayoutResult textLayoutResult3 = this.layoutResult;
                    if (textLayoutResult3 == null) {
                        x.j("layoutResult");
                        textLayoutResult3 = null;
                    }
                    float lineTop = textLayoutResult3.getLineTop(lineForOffset) - iRound;
                    if (lineTop > 0.0f) {
                        TextLayoutResult textLayoutResult4 = this.layoutResult;
                        if (textLayoutResult4 == null) {
                            x.j("layoutResult");
                        } else {
                            textLayoutResult = textLayoutResult4;
                        }
                        lineForVerticalPosition = textLayoutResult.getLineForVerticalPosition(lineTop);
                    } else {
                        lineForVerticalPosition = 0;
                    }
                    if (i3 == getText().length() && lineForVerticalPosition < lineForOffset) {
                        lineForVerticalPosition++;
                    }
                    return getRange(getLineEdgeIndex(lineForVerticalPosition, DirectionStart), i3);
                } catch (IllegalStateException unused) {
                }
            }
            return null;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final PageTextSegmentIterator getInstance() {
                if (PageTextSegmentIterator.pageInstance == null) {
                    PageTextSegmentIterator.pageInstance = new PageTextSegmentIterator(null);
                }
                PageTextSegmentIterator pageTextSegmentIterator = PageTextSegmentIterator.pageInstance;
                x.d(pageTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
                return pageTextSegmentIterator;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ PageTextSegmentIterator(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {
        private static ParagraphTextSegmentIterator instance;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ ParagraphTextSegmentIterator(o oVar) {
            this();
        }

        private final boolean isEndBoundary(int i2) {
            if (i2 <= 0 || getText().charAt(i2 - 1) == '\n') {
                return false;
            }
            return i2 == getText().length() || getText().charAt(i2) == '\n';
        }

        private final boolean isStartBoundary(int i2) {
            if (getText().charAt(i2) != '\n') {
                return i2 == 0 || getText().charAt(i2 + (-1)) == '\n';
            }
            return false;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (i2 < length && getText().charAt(i2) == '\n' && !isStartBoundary(i2)) {
                i2++;
            }
            if (i2 >= length) {
                return null;
            }
            int i3 = i2 + 1;
            while (i3 < length && !isEndBoundary(i3)) {
                i3++;
            }
            return getRange(i2, i3);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0) {
                int i3 = i2 - 1;
                if (getText().charAt(i3) != '\n' || isEndBoundary(i2)) {
                    break;
                }
                i2 = i3;
            }
            if (i2 <= 0) {
                return null;
            }
            int i4 = i2 - 1;
            while (i4 > 0 && !isStartBoundary(i4)) {
                i4--;
            }
            return getRange(i4, i2);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final ParagraphTextSegmentIterator getInstance() {
                if (ParagraphTextSegmentIterator.instance == null) {
                    ParagraphTextSegmentIterator.instance = new ParagraphTextSegmentIterator(null);
                }
                ParagraphTextSegmentIterator paragraphTextSegmentIterator = ParagraphTextSegmentIterator.instance;
                x.d(paragraphTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
                return paragraphTextSegmentIterator;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        private ParagraphTextSegmentIterator() {
        }
    }

    /* compiled from: WazeSource */
    public final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        private static WordTextSegmentIterator instance;
        private BreakIterator impl;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        private WordTextSegmentIterator(Locale locale) {
            onLocaleChanged(locale);
        }

        private final boolean isEndBoundary(int i2) {
            if (i2 <= 0 || !isLetterOrDigit(i2 - 1)) {
                return false;
            }
            return i2 == getText().length() || !isLetterOrDigit(i2);
        }

        private final boolean isLetterOrDigit(int i2) {
            if (i2 < 0 || i2 >= getText().length()) {
                return false;
            }
            return Character.isLetterOrDigit(getText().codePointAt(i2));
        }

        private final boolean isStartBoundary(int i2) {
            if (isLetterOrDigit(i2)) {
                return i2 == 0 || !isLetterOrDigit(i2 + (-1));
            }
            return false;
        }

        private final void onLocaleChanged(Locale locale) {
            this.impl = BreakIterator.getWordInstance(locale);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] following(int i2) {
            if (getText().length() > 0 && i2 < getText().length()) {
                if (i2 < 0) {
                    i2 = 0;
                }
                while (!isLetterOrDigit(i2) && !isStartBoundary(i2)) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        x.j("impl");
                        breakIterator = null;
                    }
                    i2 = breakIterator.following(i2);
                    if (i2 == -1) {
                        break;
                    }
                }
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    x.j("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i2);
                if (iFollowing != -1 && isEndBoundary(iFollowing)) {
                    return getRange(i2, iFollowing);
                }
            }
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.AbstractTextSegmentIterator
        public void initialize(String str) {
            super.initialize(str);
            BreakIterator breakIterator = this.impl;
            if (breakIterator == null) {
                x.j("impl");
                breakIterator = null;
            }
            breakIterator.setText(str);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public int[] preceding(int i2) {
            int length = getText().length();
            if (length > 0 && i2 > 0) {
                if (i2 > length) {
                    i2 = length;
                }
                while (i2 > 0 && !isLetterOrDigit(i2 - 1) && !isEndBoundary(i2)) {
                    BreakIterator breakIterator = this.impl;
                    if (breakIterator == null) {
                        x.j("impl");
                        breakIterator = null;
                    }
                    i2 = breakIterator.preceding(i2);
                    if (i2 == -1) {
                        break;
                    }
                }
                BreakIterator breakIterator2 = this.impl;
                if (breakIterator2 == null) {
                    x.j("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i2);
                if (iPreceding != -1 && isStartBoundary(iPreceding)) {
                    return getRange(iPreceding, i2);
                }
            }
            return null;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final WordTextSegmentIterator getInstance(Locale locale) {
                if (WordTextSegmentIterator.instance == null) {
                    WordTextSegmentIterator.instance = new WordTextSegmentIterator(locale, null);
                }
                WordTextSegmentIterator wordTextSegmentIterator = WordTextSegmentIterator.instance;
                x.d(wordTextSegmentIterator, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
                return wordTextSegmentIterator;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ WordTextSegmentIterator(Locale locale, o oVar) {
            this(locale);
        }
    }
}
