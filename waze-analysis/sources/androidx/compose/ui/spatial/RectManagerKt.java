package androidx.compose.ui.spatial;

import androidx.compose.ui.unit.IntOffset;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class RectManagerKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: analyzeComponents-58bKbWc, reason: not valid java name */
    public static final int m10343analyzeComponents58bKbWc(float[] fArr) {
        if (fArr.length < 16) {
            return 0;
        }
        int i2 = fArr[0] == 1.0f ? 1 : 0;
        int i3 = fArr[1] == 0.0f ? 1 : 0;
        int i4 = fArr[2] == 0.0f ? 1 : 0;
        int i5 = fArr[4] == 0.0f ? 1 : 0;
        int i6 = fArr[5] == 1.0f ? 1 : 0;
        int i7 = fArr[6] == 0.0f ? 1 : 0;
        int i8 = fArr[8] == 0.0f ? 1 : 0;
        int i9 = fArr[9] == 0.0f ? 1 : 0;
        int i10 = fArr[10] == 1.0f ? 1 : 0;
        int i11 = fArr[12] == 0.0f ? 1 : 0;
        int i12 = fArr[13] == 0.0f ? 1 : 0;
        int i13 = i2 & i3 & i4 & i5 & i6 & i7 & i8 & i9 & i10;
        return (i11 & i12 & (fArr[14] == 0.0f ? 1 : 0) & (fArr[15] == 1.0f ? 1 : 0)) | (i13 + i13);
    }

    private static final boolean getHasNonTranslationComponents(int i2) {
        return (i2 & 2) == 0;
    }

    private static final boolean isIdentity(int i2) {
        return i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isSet--gyyYBs, reason: not valid java name */
    public static final boolean m10344isSetgyyYBs(long j2) {
        return !IntOffset.m11295equalsimpl0(j2, IntOffset.Companion.m11306getMaxnOccac());
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    private static /* synthetic */ void getHasNonTranslationComponents$annotations(int i2) {
    }

    private static /* synthetic */ void isIdentity$annotations(int i2) {
    }
}
