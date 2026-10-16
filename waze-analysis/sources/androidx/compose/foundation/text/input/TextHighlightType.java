package androidx.compose.foundation.text.input;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextHighlightType {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int HandwritingSelectPreview = 0;
    private static final int HandwritingDeletePreview = 1;

    private /* synthetic */ TextHighlightType(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextHighlightType m3490boximpl(int i2) {
        return new TextHighlightType(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3492equalsimpl(int i2, Object obj) {
        return (obj instanceof TextHighlightType) && i2 == ((TextHighlightType) obj).m3496unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3493equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3495toStringimpl(int i2) {
        return "TextHighlightType(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m3492equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m3495toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m3496unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m3497getHandwritingDeletePreviewsxJuwY() {
            return TextHighlightType.HandwritingDeletePreview;
        }

        /* renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m3498getHandwritingSelectPreviewsxJuwY() {
            return TextHighlightType.HandwritingSelectPreview;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m3491constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3494hashCodeimpl(int i2) {
        return i2;
    }
}
