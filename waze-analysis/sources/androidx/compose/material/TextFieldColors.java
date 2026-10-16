package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface TextFieldColors {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.TextFieldColors$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static State $default$leadingIconColor(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
            composer.startReplaceGroup(-1036335134);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1036335134, i2, -1, "androidx.compose.material.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:123)");
            }
            State<Color> stateLeadingIconColor = textFieldColors.leadingIconColor(z, z2, composer, ((i2 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stateLeadingIconColor;
        }

        public static State $default$trailingIconColor(TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2) {
            composer.startReplaceGroup(454310320);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(454310320, i2, -1, "androidx.compose.material.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:155)");
            }
            State<Color> stateTrailingIconColor = textFieldColors.trailingIconColor(z, z2, composer, ((i2 >> 3) & DisplayStrings.DS_TAP_TO_VERIFY) | (i2 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return stateTrailingIconColor;
        }
    }

    State<Color> backgroundColor(boolean z, Composer composer, int i2);

    State<Color> cursorColor(boolean z, Composer composer, int i2);

    State<Color> indicatorColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2);

    State<Color> labelColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2);

    State<Color> leadingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2);

    State<Color> leadingIconColor(boolean z, boolean z2, Composer composer, int i2);

    State<Color> placeholderColor(boolean z, Composer composer, int i2);

    State<Color> textColor(boolean z, Composer composer, int i2);

    State<Color> trailingIconColor(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i2);

    State<Color> trailingIconColor(boolean z, boolean z2, Composer composer, int i2);
}
