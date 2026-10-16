package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import h.g.b.o;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;
    public static final Companion Companion = new Companion(null);
    private static final TextDecoration None = new TextDecoration(0);
    private static final TextDecoration Underline = new TextDecoration(1);
    private static final TextDecoration LineThrough = new TextDecoration(2);

    public TextDecoration(int i2) {
        this.mask = i2;
    }

    public final boolean contains(TextDecoration textDecoration) {
        int i2 = this.mask;
        return (textDecoration.mask | i2) == i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public final TextDecoration plus(TextDecoration textDecoration) {
        return new TextDecoration(this.mask | textDecoration.mask);
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextDecoration combine(List<TextDecoration> list) {
            int iValueOf = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                iValueOf = Integer.valueOf(iValueOf.intValue() | list.get(i2).getMask());
            }
            return new TextDecoration(iValueOf.intValue());
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        public final TextDecoration valueOf(int i2) {
            if ((i2 | 3) != 3) {
                InlineClassHelperKt.throwIllegalArgumentException("The given mask=" + i2 + " is not recognized by TextDecoration.");
            }
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? new TextDecoration(i2) : getLineThrough() : getUnderline() : getNone();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getLineThrough$annotations() {
        }

        public static /* synthetic */ void getNone$annotations() {
        }

        public static /* synthetic */ void getUnderline$annotations() {
        }
    }
}
