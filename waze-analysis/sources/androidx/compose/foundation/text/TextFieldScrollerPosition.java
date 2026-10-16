package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.text.TextRange;
import h.a.i;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k.n;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(new p() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$$ExternalSyntheticLambda0
        @Override // h.g.a.p
        public final Object invoke(Object obj, Object obj2) {
            TextFieldScrollerPosition textFieldScrollerPosition = (TextFieldScrollerPosition) obj2;
            return i.i(Float.valueOf(textFieldScrollerPosition.getOffset()), Boolean.valueOf(textFieldScrollerPosition.getOrientation() == Orientation.Vertical));
        }
    }, new l() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return TextFieldScrollerPosition.Saver$lambda$1((List) obj);
        }
    });
    private final MutableFloatState maximum$delegate;
    private final MutableFloatState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;
    private final MutableIntState viewportSize$delegate;

    public TextFieldScrollerPosition(Orientation orientation, float f2) {
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this.maximum$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize$delegate = SnapshotIntStateKt.mutableIntStateOf(0);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m10551getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    static final TextFieldScrollerPosition Saver$lambda$1(List list) {
        Object obj = list.get(1);
        x.d(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = list.get(0);
        x.d(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }

    private final void setMaximum(float f2) {
        this.maximum$delegate.setFloatValue(f2);
    }

    private final void setViewportSize(int i2) {
        this.viewportSize$delegate.setIntValue(i2);
    }

    public final void coerceOffset$foundation(float f2, float f3, int i2) {
        float offset = getOffset();
        float f4 = i2;
        float f5 = offset + f4;
        setOffset(getOffset() + ((f3 <= f5 && (f2 >= offset || f3 - f2 <= f4)) ? (f2 >= offset || f3 - f2 > f4) ? 0.0f : f2 - offset : f3 - f5));
    }

    public final float getMaximum() {
        return this.maximum$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m3413getOffsetToFollow5zctL8(long j2) {
        TextRange.Companion companion = TextRange.Companion;
        long j3 = this.previousSelection;
        return TextRange.m10546getStartimpl(j2) != TextRange.m10546getStartimpl(j3) ? TextRange.m10546getStartimpl(j2) : TextRange.m10541getEndimpl(j2) != TextRange.m10541getEndimpl(j3) ? TextRange.m10541getEndimpl(j2) : TextRange.m10544getMinimpl(j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name */
    public final long m3414getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final int getViewportSize() {
        return this.viewportSize$delegate.getIntValue();
    }

    public final void setOffset(float f2) {
        this.offset$delegate.setFloatValue(f2);
    }

    public final void setOrientation(Orientation orientation) {
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m3415setPreviousSelection5zctL8(long j2) {
        this.previousSelection = j2;
    }

    public final void update(Orientation orientation, Rect rect, int i2, int i3) {
        float f2 = i3 - i2;
        setMaximum(f2);
        if (rect.getLeft() != this.previousCursorRect.getLeft() || rect.getTop() != this.previousCursorRect.getTop()) {
            boolean z = orientation == Orientation.Vertical;
            coerceOffset$foundation(z ? rect.getTop() : rect.getLeft(), z ? rect.getBottom() : rect.getRight(), i2);
            this.previousCursorRect = rect;
        }
        setOffset(n.g(getOffset(), 0.0f, f2));
        setViewportSize(i2);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, null);
    }

    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f2, int i2, o oVar) {
        this(orientation, (i2 & 2) != 0 ? 0.0f : f2);
    }
}
