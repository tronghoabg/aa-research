package androidx.compose.ui.text.input;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class KeyboardCapitalization {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Unspecified = -1;
    private static final int None = 0;
    private static final int Characters = 1;
    private static final int Words = 2;
    private static final int Sentences = 3;

    private /* synthetic */ KeyboardCapitalization(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyboardCapitalization m10750boximpl(int i2) {
        return new KeyboardCapitalization(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10752equalsimpl(int i2, Object obj) {
        return (obj instanceof KeyboardCapitalization) && i2 == ((KeyboardCapitalization) obj).m10756unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10753equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10755toStringimpl(int i2) {
        return m10753equalsimpl0(i2, Unspecified) ? "Unspecified" : m10753equalsimpl0(i2, None) ? "None" : m10753equalsimpl0(i2, Characters) ? "Characters" : m10753equalsimpl0(i2, Words) ? "Words" : m10753equalsimpl0(i2, Sentences) ? "Sentences" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10752equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10755toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10756unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCharacters-IUNYP9k, reason: not valid java name */
        public final int m10762getCharactersIUNYP9k() {
            return KeyboardCapitalization.Characters;
        }

        /* renamed from: getNone-IUNYP9k, reason: not valid java name */
        public final int m10763getNoneIUNYP9k() {
            return KeyboardCapitalization.None;
        }

        /* renamed from: getSentences-IUNYP9k, reason: not valid java name */
        public final int m10764getSentencesIUNYP9k() {
            return KeyboardCapitalization.Sentences;
        }

        /* renamed from: getUnspecified-IUNYP9k, reason: not valid java name */
        public final int m10765getUnspecifiedIUNYP9k() {
            return KeyboardCapitalization.Unspecified;
        }

        /* renamed from: getWords-IUNYP9k, reason: not valid java name */
        public final int m10766getWordsIUNYP9k() {
            return KeyboardCapitalization.Words;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getCharacters-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10757getCharactersIUNYP9k$annotations() {
        }

        /* renamed from: getNone-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10758getNoneIUNYP9k$annotations() {
        }

        /* renamed from: getSentences-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10759getSentencesIUNYP9k$annotations() {
        }

        /* renamed from: getUnspecified-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10760getUnspecifiedIUNYP9k$annotations() {
        }

        /* renamed from: getWords-IUNYP9k$annotations, reason: not valid java name */
        public static /* synthetic */ void m10761getWordsIUNYP9k$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10751constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10754hashCodeimpl(int i2) {
        return i2;
    }
}
