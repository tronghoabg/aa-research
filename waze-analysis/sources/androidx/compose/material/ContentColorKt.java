package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContentColorKt {
    private static final ProvidableCompositionLocal<Color> LocalContentColor = CompositionLocalKt.compositionLocalOf$default(null, new a<Color>() { // from class: androidx.compose.material.ContentColorKt$LocalContentColor$1
        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m8218boximpl(m4057invoke0d7_KjU());
        }

        /* renamed from: invoke-0d7_KjU, reason: not valid java name */
        public final long m4057invoke0d7_KjU() {
            return Color.Companion.m8254getBlack0d7_KjU();
        }
    }, 1, null);

    public static final ProvidableCompositionLocal<Color> getLocalContentColor() {
        return LocalContentColor;
    }
}
