package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SecureTextFieldKt$SecureTextField$1 implements TextFieldDecorator {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ p<Composer, Integer, ab> $label;
    final /* synthetic */ p<Composer, Integer, ab> $leadingIcon;
    final /* synthetic */ p<Composer, Integer, ab> $placeholder;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ TextFieldState $state;
    final /* synthetic */ p<Composer, Integer, ab> $trailingIcon;

    /* JADX WARN: Multi-variable type inference failed */
    SecureTextFieldKt$SecureTextField$1(TextFieldState textFieldState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, Shape shape, TextFieldColors textFieldColors) {
        this.$state = textFieldState;
        this.$enabled = z;
        this.$interactionSource = mutableInteractionSource;
        this.$isError = z2;
        this.$label = pVar;
        this.$placeholder = pVar2;
        this.$leadingIcon = pVar3;
        this.$trailingIcon = pVar4;
        this.$shape = shape;
        this.$colors = textFieldColors;
    }

    static final ab Decoration$lambda$0(SecureTextFieldKt$SecureTextField$1 secureTextFieldKt$SecureTextField$1, p pVar, int i2, Composer composer, int i3) {
        secureTextFieldKt$SecureTextField$1.Decoration(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1564434043);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564434043, i3, -1, "androidx.compose.material.SecureTextField.<no name provided>.Decoration (SecureTextField.kt:148)");
            }
            TextFieldState textFieldState = this.$state;
            int i5 = i3;
            composer2 = composerStartRestartGroup;
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldState.getText().toString(), pVar, this.$enabled, true, VisualTransformation.Companion.getNone(), this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, null, composer2, ((i5 << 3) & 112) | 27648, 24576, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SecureTextFieldKt$SecureTextField$1$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SecureTextFieldKt$SecureTextField$1.Decoration$lambda$0(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
