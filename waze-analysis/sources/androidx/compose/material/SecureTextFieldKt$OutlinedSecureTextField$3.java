package androidx.compose.material;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class SecureTextFieldKt$OutlinedSecureTextField$3 implements TextFieldDecorator {
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
    SecureTextFieldKt$OutlinedSecureTextField$3(TextFieldState textFieldState, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, Shape shape, TextFieldColors textFieldColors) {
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

    static final ab Decoration$lambda$0(boolean z, boolean z2, MutableInteractionSource mutableInteractionSource, TextFieldColors textFieldColors, Shape shape, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910489071, i2, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration.<anonymous> (SecureTextField.kt:297)");
            }
            TextFieldDefaults.INSTANCE.m4252BorderBoxnbWgWpA(z, z2, mutableInteractionSource, textFieldColors, shape, 0.0f, 0.0f, composer, 12582912, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Decoration$lambda$1(SecureTextFieldKt$OutlinedSecureTextField$3 secureTextFieldKt$OutlinedSecureTextField$3, p pVar, int i2, Composer composer, int i3) {
        secureTextFieldKt$OutlinedSecureTextField$3.Decoration(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    @Override // androidx.compose.foundation.text.input.TextFieldDecorator
    public final void Decoration(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-741592697);
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
                ComposerKt.traceEventStart(-741592697, i3, -1, "androidx.compose.material.OutlinedSecureTextField.<no name provided>.Decoration (SecureTextField.kt:282)");
            }
            TextFieldState textFieldState = this.$state;
            int i5 = i3;
            TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
            String string = textFieldState.getText().toString();
            VisualTransformation none = VisualTransformation.Companion.getNone();
            final boolean z = this.$enabled;
            final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            final boolean z2 = this.$isError;
            p<Composer, Integer, ab> pVar2 = this.$label;
            p<Composer, Integer, ab> pVar3 = this.$placeholder;
            p<Composer, Integer, ab> pVar4 = this.$leadingIcon;
            p<Composer, Integer, ab> pVar5 = this.$trailingIcon;
            final Shape shape = this.$shape;
            final TextFieldColors textFieldColors = this.$colors;
            composer2 = composerStartRestartGroup;
            textFieldDefaults.OutlinedTextFieldDecorationBox(string, pVar, z, true, none, mutableInteractionSource, z2, pVar2, pVar3, pVar4, pVar5, shape, textFieldColors, null, ComposableLambdaKt.rememberComposableLambda(910489071, true, new p() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SecureTextFieldKt$OutlinedSecureTextField$3.Decoration$lambda$0(z, z2, mutableInteractionSource, textFieldColors, shape, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i5 << 3) & 112) | 27648, 221184, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.SecureTextFieldKt$OutlinedSecureTextField$3$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SecureTextFieldKt$OutlinedSecureTextField$3.Decoration$lambda$1(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
