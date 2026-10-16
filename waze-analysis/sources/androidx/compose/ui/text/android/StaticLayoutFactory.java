package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StaticLayoutFactory {
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();
    public static final int $stable = 8;

    private StaticLayoutFactory() {
    }

    public static /* synthetic */ StaticLayout create$default(StaticLayoutFactory staticLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z, boolean z2, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2, int i12, Object obj) {
        int[] iArr3;
        StaticLayoutFactory staticLayoutFactory2;
        CharSequence charSequence2;
        TextPaint textPaint2;
        int i13;
        int length = (i12 & 16) != 0 ? charSequence.length() : i4;
        TextDirectionHeuristic dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text = (i12 & 32) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text() : textDirectionHeuristic;
        Layout.Alignment dEFAULT_LAYOUT_ALIGNMENT$ui_text = (i12 & 64) != 0 ? LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text() : alignment;
        int i14 = (i12 & 8) != 0 ? 0 : i3;
        int i15 = (i12 & 128) != 0 ? Integer.MAX_VALUE : i5;
        TextUtils.TruncateAt truncateAt2 = (i12 & 256) != 0 ? null : truncateAt;
        int i16 = (i12 & 512) != 0 ? i2 : i6;
        float f4 = (i12 & 1024) != 0 ? 1.0f : f2;
        float f5 = (i12 & 2048) != 0 ? 0.0f : f3;
        int i17 = (i12 & 4096) != 0 ? 0 : i7;
        boolean z3 = ((i12 & 8192) == 0) & z;
        boolean z4 = (!((i12 & 16384) == 0)) | z2;
        int i18 = (32768 & i12) != 0 ? 0 : i8;
        int i19 = (65536 & i12) != 0 ? 0 : i9;
        int i20 = (131072 & i12) != 0 ? 0 : i10;
        int i21 = (262144 & i12) != 0 ? 0 : i11;
        int[] iArr4 = (524288 & i12) != 0 ? null : iArr;
        if ((i12 & 1048576) != 0) {
            iArr3 = null;
            staticLayoutFactory2 = staticLayoutFactory;
            textPaint2 = textPaint;
            i13 = i2;
            charSequence2 = charSequence;
        } else {
            iArr3 = iArr2;
            staticLayoutFactory2 = staticLayoutFactory;
            charSequence2 = charSequence;
            textPaint2 = textPaint;
            i13 = i2;
        }
        return staticLayoutFactory2.create(charSequence2, textPaint2, i13, i14, length, dEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text, dEFAULT_LAYOUT_ALIGNMENT$ui_text, i15, truncateAt2, i16, f4, f5, i17, z3, z4, i18, i19, i20, i21, iArr4, iArr3);
    }

    public final StaticLayout create(CharSequence charSequence, TextPaint textPaint, int i2, int i3, int i4, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i5, TextUtils.TruncateAt truncateAt, int i6, float f2, float f3, int i7, boolean z, boolean z2, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        return delegate.create(new StaticLayoutParams(charSequence, i3, i4, textPaint, i2, textDirectionHeuristic, alignment, i5, truncateAt, i6, f2, f3, i7, z, z2, i8, i9, i10, i11, iArr, iArr2));
    }

    public final boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        return delegate.isFallbackLineSpacingEnabled(staticLayout, z);
    }
}
