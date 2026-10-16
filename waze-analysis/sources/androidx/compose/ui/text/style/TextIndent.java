package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    public /* synthetic */ TextIndent(long j2, long j3, int i2, o oVar) {
        this((i2 & 1) != 0 ? TextUnitKt.getSp(0) : j2, (i2 & 2) != 0 ? TextUnitKt.getSp(0) : j3, null);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m11039copyNB67dxo$default(TextIndent textIndent, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = textIndent.firstLine;
        }
        if ((i2 & 2) != 0) {
            j3 = textIndent.restLine;
        }
        return textIndent.m11040copyNB67dxo(j2, j3);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m11040copyNB67dxo(long j2, long j3) {
        return new TextIndent(j2, j3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m11359equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m11359equalsimpl0(this.restLine, textIndent.restLine);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m11041getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m11042getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m11363hashCodeimpl(this.firstLine) * 31) + TextUnit.m11363hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m11369toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m11369toStringimpl(this.restLine)) + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public /* synthetic */ TextIndent(long j2, long j3, o oVar) {
        this(j2, j3);
    }

    private TextIndent(long j2, long j3) {
        this.firstLine = j2;
        this.restLine = j3;
    }
}
