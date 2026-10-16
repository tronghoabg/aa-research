package androidx.compose.foundation.text;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AutofillHighlightKt {
    private static final ProvidableCompositionLocal<Brush> LocalAutofillHighlightBrush = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            return AutofillHighlightKt.LocalAutofillHighlightBrush$lambda$0();
        }
    }, 1, null);
    private static final ProvidableCompositionLocal<Color> LocalAutofillHighlightColor = CompositionLocalKt.compositionLocalOf$default(null, new a<Color>() { // from class: androidx.compose.foundation.text.AutofillHighlightKt$LocalAutofillHighlightColor$1
        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m8218boximpl(m3206invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m3206invoke0d7_KjU() {
            return AutofillHighlight_androidKt.autofillHighlightColor();
        }
    }, 1, null);

    static final Brush LocalAutofillHighlightBrush$lambda$0() {
        return new SolidColor(AutofillHighlight_androidKt.autofillHighlightColor(), null);
    }

    public static final ProvidableCompositionLocal<Brush> getLocalAutofillHighlightBrush() {
        return LocalAutofillHighlightBrush;
    }

    public static final ProvidableCompositionLocal<Color> getLocalAutofillHighlightColor() {
        return LocalAutofillHighlightColor;
    }

    /* renamed from: resolveAutofillHighlight-WkMS-hQ, reason: not valid java name */
    public static final Brush m3205resolveAutofillHighlightWkMShQ(Brush brush, long j2, long j3) {
        return !Color.m8229equalsimpl0(j2, j3) ? new SolidColor(j2, null) : brush;
    }

    public static /* synthetic */ void getLocalAutofillHighlightColor$annotations() {
    }
}
