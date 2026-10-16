package androidx.compose.ui.text;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextGranularity {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Character = 0;
    private static final int Word = 1;

    private /* synthetic */ TextGranularity(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextGranularity m10501boximpl(int i2) {
        return new TextGranularity(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10503equalsimpl(int i2, Object obj) {
        return (obj instanceof TextGranularity) && i2 == ((TextGranularity) obj).m10507unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10504equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10506toStringimpl(int i2) {
        return "TextGranularity(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m10503equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10506toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10507unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCharacter-DRrd7Zo, reason: not valid java name */
        public final int m10508getCharacterDRrd7Zo() {
            return TextGranularity.Character;
        }

        /* renamed from: getWord-DRrd7Zo, reason: not valid java name */
        public final int m10509getWordDRrd7Zo() {
            return TextGranularity.Word;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m10502constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10505hashCodeimpl(int i2) {
        return i2;
    }
}
