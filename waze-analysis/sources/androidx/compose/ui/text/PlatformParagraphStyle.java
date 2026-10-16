package androidx.compose.ui.text;

import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformParagraphStyle {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final PlatformParagraphStyle Default = new PlatformParagraphStyle();
    private final int emojiSupportMatch;
    private final boolean includeFontPadding;

    public /* synthetic */ PlatformParagraphStyle(int i2, boolean z, int i3, o oVar) {
        this((i3 & 1) != 0 ? EmojiSupportMatch.Companion.m10401getDefault_3YsG6Y() : i2, z & ((i3 & 2) == 0), (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) obj;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && EmojiSupportMatch.m10396equalsimpl0(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    /* renamed from: getEmojiSupportMatch-_3YsG6Y, reason: not valid java name */
    public final int m10474getEmojiSupportMatch_3YsG6Y() {
        return this.emojiSupportMatch;
    }

    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public int hashCode() {
        return (PlatformParagraphStyle$$ExternalSyntheticBackport0.m(this.includeFontPadding) * 31) + this.emojiSupportMatch;
    }

    public final PlatformParagraphStyle merge(PlatformParagraphStyle platformParagraphStyle) {
        return platformParagraphStyle == null ? this : platformParagraphStyle;
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) EmojiSupportMatch.m10398toStringimpl(this.emojiSupportMatch)) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final PlatformParagraphStyle getDefault() {
            return PlatformParagraphStyle.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getIncludeFontPadding$annotations() {
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, o oVar) {
        this(i2);
    }

    private PlatformParagraphStyle(int i2, boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = i2;
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, boolean z, o oVar) {
        this(i2, z);
    }

    public PlatformParagraphStyle() {
        this(EmojiSupportMatch.Companion.m10401getDefault_3YsG6Y(), false, (o) null);
    }

    public /* synthetic */ PlatformParagraphStyle(int i2, int i3, o oVar) {
        this((i3 & 1) != 0 ? EmojiSupportMatch.Companion.m10401getDefault_3YsG6Y() : i2, (o) null);
    }

    private PlatformParagraphStyle(int i2) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i2;
    }

    public PlatformParagraphStyle(boolean z) {
        this.includeFontPadding = z;
        this.emojiSupportMatch = EmojiSupportMatch.Companion.m10401getDefault_3YsG6Y();
    }

    public /* synthetic */ PlatformParagraphStyle(boolean z, int i2, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)));
    }
}
