package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    private Placeholder(long j2, long j3, int i2) {
        this.width = j2;
        this.height = j3;
        this.placeholderVerticalAlign = i2;
        if (TextUnit.m11360getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m11360getRawTypeimpl(j3) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m10455copyK8Q__8$default(Placeholder placeholder, long j2, long j3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = placeholder.width;
        }
        long j4 = j2;
        if ((i3 & 2) != 0) {
            j3 = placeholder.height;
        }
        long j5 = j3;
        if ((i3 & 4) != 0) {
            i2 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m10456copyK8Q__8(j4, j5, i2);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m10456copyK8Q__8(long j2, long j3, int i2) {
        return new Placeholder(j2, j3, i2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m11359equalsimpl0(this.width, placeholder.width) && TextUnit.m11359equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m10463equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m10457getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m10458getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m10459getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m11363hashCodeimpl(this.width) * 31) + TextUnit.m11363hashCodeimpl(this.height)) * 31) + this.placeholderVerticalAlign;
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m11369toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m11369toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m10465toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    public /* synthetic */ Placeholder(long j2, long j3, int i2, o oVar) {
        this(j2, j3, i2);
    }
}
