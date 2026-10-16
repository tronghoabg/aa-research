package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Rect;
import androidx.media3.muxer.MuxerUtil;
import h.d.a;
import h.d.b;
import h.g.b.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class SelectionMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            o oVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation */
        public int mo3904compare3MmeM6k$foundation(long j2, Rect rect) {
            if (SelectionManagerKt.m3898containsInclusiveUv8p0NA(rect, j2)) {
                return 0;
            }
            int i2 = (int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2);
            if (Float.intBitsToFloat(i2) < rect.getTop()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j2 >> 32)) >= rect.getLeft() || Float.intBitsToFloat(i2) >= rect.getBottom()) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            o oVar = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation */
        public int mo3904compare3MmeM6k$foundation(long j2, Rect rect) {
            if (SelectionManagerKt.m3898containsInclusiveUv8p0NA(rect, j2)) {
                return 0;
            }
            int i2 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i2) < rect.getLeft()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) >= rect.getTop() || Float.intBitsToFloat(i2) >= rect.getRight()) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] selectionModeArr$values = $values();
        $VALUES = selectionModeArr$values;
        $ENTRIES = b.a(selectionModeArr$values);
    }

    public /* synthetic */ SelectionMode(String str, int i2, o oVar) {
        this(str, i2);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m3903containsInclusiveUv8p0NA(Rect rect, long j2) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
        return top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    public static a<SelectionMode> getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation, reason: not valid java name */
    public abstract int mo3904compare3MmeM6k$foundation(long j2, Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation, reason: not valid java name */
    public final boolean m3905isSelected2x9bVx0$foundation(Rect rect, long j2, long j3) {
        if (m3903containsInclusiveUv8p0NA(rect, j2) || m3903containsInclusiveUv8p0NA(rect, j3)) {
            return true;
        }
        return (mo3904compare3MmeM6k$foundation(j2, rect) > 0) ^ (mo3904compare3MmeM6k$foundation(j3, rect) > 0);
    }

    private SelectionMode(String str, int i2) {
    }
}
