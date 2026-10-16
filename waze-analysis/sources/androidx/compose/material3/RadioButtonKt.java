package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.unit.Dp;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RadioButtonKt {
    private static final float RadioButtonDotSize = 12.0f;
    private static final float RadioButtonPadding = 2.0f;
    private static final float RadioStrokeWidth = 2.0f;

    /* JADX WARN: Removed duplicated region for block: B:103:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RadioButton(final boolean r29, final h.g.a.a<h.ab> r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.material3.RadioButtonColors r33, androidx.compose.foundation.interaction.MutableInteractionSource r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.RadioButtonKt.RadioButton(boolean, h.g.a.a, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.RadioButtonColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab RadioButton$lambda$0$0(State state, State state2, DrawScope drawScope) {
        float f2 = drawScope.mo2127toPx0680j_4(RadioStrokeWidth);
        float f3 = f2 / 2.0f;
        DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m8238unboximpl(), drawScope.mo2127toPx0680j_4(RadioButtonTokens.INSTANCE.m7021getIconSizeD9Ej5fM() / 2.0f) - f3, 0L, 0.0f, new Stroke(f2, 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
        if (Dp.m11163compareTo0680j_4(((Dp) state2.getValue()).m11178unboximpl(), 0.0f) > 0) {
            DrawScope.CC.m8823drawCircleVaOC9Bg$default(drawScope, ((Color) state.getValue()).m8238unboximpl(), drawScope.mo2127toPx0680j_4(((Dp) state2.getValue()).m11178unboximpl()) - f3, 0L, 0.0f, Fill.INSTANCE, null, 0, 108, null);
        }
        return ab.f48028a;
    }

    static final ab RadioButton$lambda$1(boolean z, a aVar, Modifier modifier, boolean z2, RadioButtonColors radioButtonColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, Composer composer, int i4) {
        RadioButton(z, aVar, modifier, z2, radioButtonColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }
}
