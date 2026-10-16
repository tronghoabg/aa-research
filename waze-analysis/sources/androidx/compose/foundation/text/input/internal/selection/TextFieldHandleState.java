package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldHandleState {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextFieldHandleState Hidden = new TextFieldHandleState(false, Offset.Companion.m7995getUnspecifiedF1C5BW0(), 0.0f, ResolvedTextDirection.Ltr, false, null);
    private final ResolvedTextDirection direction;
    private final boolean handlesCrossed;
    private final float lineHeight;
    private final long position;
    private final boolean visible;

    private TextFieldHandleState(boolean z, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        this.visible = z;
        this.position = j2;
        this.lineHeight = f2;
        this.direction = resolvedTextDirection;
        this.handlesCrossed = z2;
    }

    /* renamed from: copy-YqVAtuI$default, reason: not valid java name */
    public static /* synthetic */ TextFieldHandleState m3738copyYqVAtuI$default(TextFieldHandleState textFieldHandleState, boolean z, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = textFieldHandleState.visible;
        }
        if ((i2 & 2) != 0) {
            j2 = textFieldHandleState.position;
        }
        if ((i2 & 4) != 0) {
            f2 = textFieldHandleState.lineHeight;
        }
        if ((i2 & 8) != 0) {
            resolvedTextDirection = textFieldHandleState.direction;
        }
        if ((i2 & 16) != 0) {
            z2 = textFieldHandleState.handlesCrossed;
        }
        boolean z3 = z2;
        float f3 = f2;
        return textFieldHandleState.m3740copyYqVAtuI(z, j2, f3, resolvedTextDirection, z3);
    }

    public final boolean component1() {
        return this.visible;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m3739component2F1C5BW0() {
        return this.position;
    }

    public final float component3() {
        return this.lineHeight;
    }

    public final ResolvedTextDirection component4() {
        return this.direction;
    }

    public final boolean component5() {
        return this.handlesCrossed;
    }

    /* renamed from: copy-YqVAtuI, reason: not valid java name */
    public final TextFieldHandleState m3740copyYqVAtuI(boolean z, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z2) {
        return new TextFieldHandleState(z, j2, f2, resolvedTextDirection, z2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldHandleState)) {
            return false;
        }
        TextFieldHandleState textFieldHandleState = (TextFieldHandleState) obj;
        return this.visible == textFieldHandleState.visible && Offset.m7977equalsimpl0(this.position, textFieldHandleState.position) && Float.compare(this.lineHeight, textFieldHandleState.lineHeight) == 0 && this.direction == textFieldHandleState.direction && this.handlesCrossed == textFieldHandleState.handlesCrossed;
    }

    public final ResolvedTextDirection getDirection() {
        return this.direction;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3741getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (((((((TextFieldHandleState$$ExternalSyntheticBackport0.m(this.visible) * 31) + Offset.m7982hashCodeimpl(this.position)) * 31) + Float.floatToIntBits(this.lineHeight)) * 31) + this.direction.hashCode()) * 31) + TextFieldHandleState$$ExternalSyntheticBackport0.m(this.handlesCrossed);
    }

    public String toString() {
        return "TextFieldHandleState(visible=" + this.visible + ", position=" + ((Object) Offset.m7988toStringimpl(this.position)) + ", lineHeight=" + this.lineHeight + ", direction=" + this.direction + ", handlesCrossed=" + this.handlesCrossed + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextFieldHandleState getHidden() {
            return TextFieldHandleState.Hidden;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ TextFieldHandleState(boolean z, long j2, float f2, ResolvedTextDirection resolvedTextDirection, boolean z2, o oVar) {
        this(z, j2, f2, resolvedTextDirection, z2);
    }
}
