package androidx.compose.ui.text;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class EmojiSupportMatch {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Default = 0;
    private static final int None = 1;
    private static final int All = 2;

    private /* synthetic */ EmojiSupportMatch(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EmojiSupportMatch m10393boximpl(int i2) {
        return new EmojiSupportMatch(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10395equalsimpl(int i2, Object obj) {
        return (obj instanceof EmojiSupportMatch) && i2 == ((EmojiSupportMatch) obj).m10399unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10396equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10398toStringimpl(int i2) {
        if (i2 == Default) {
            return "EmojiSupportMatch.Default";
        }
        if (i2 == None) {
            return "EmojiSupportMatch.None";
        }
        if (i2 == All) {
            return "EmojiSupportMatch.All";
        }
        return "Invalid(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m10395equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10398toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10399unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-_3YsG6Y, reason: not valid java name */
        public final int m10400getAll_3YsG6Y() {
            return EmojiSupportMatch.All;
        }

        /* renamed from: getDefault-_3YsG6Y, reason: not valid java name */
        public final int m10401getDefault_3YsG6Y() {
            return EmojiSupportMatch.Default;
        }

        /* renamed from: getNone-_3YsG6Y, reason: not valid java name */
        public final int m10402getNone_3YsG6Y() {
            return EmojiSupportMatch.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10394constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10397hashCodeimpl(int i2) {
        return i2;
    }
}
