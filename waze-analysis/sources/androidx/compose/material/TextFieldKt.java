package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.TextFieldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = 20.0f;
    private static final float TextFieldBottomPadding = 10.0f;
    private static final float TextFieldTopPadding = 2.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.TextFieldKt$TextField$1, reason: invalid class name */
    final class AnonymousClass1 implements TextFieldDecorator {
        final /* synthetic */ TextFieldColors $colors;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ MutableInteractionSource $interactionSource;
        final /* synthetic */ boolean $isError;
        final /* synthetic */ p<Composer, Integer, ab> $label;
        final /* synthetic */ p<Composer, Integer, ab> $leadingIcon;
        final /* synthetic */ TextFieldLineLimits $lineLimits;
        final /* synthetic */ OutputTransformation $outputTransformation;
        final /* synthetic */ p<Composer, Integer, ab> $placeholder;
        final /* synthetic */ Shape $shape;
        final /* synthetic */ TextFieldState $state;
        final /* synthetic */ p<Composer, Integer, ab> $trailingIcon;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(OutputTransformation outputTransformation, TextFieldState textFieldState, TextFieldLineLimits textFieldLineLimits, boolean z, MutableInteractionSource mutableInteractionSource, boolean z2, p<? super Composer, ? super Integer, ab> pVar, p<? super Composer, ? super Integer, ab> pVar2, p<? super Composer, ? super Integer, ab> pVar3, p<? super Composer, ? super Integer, ab> pVar4, Shape shape, TextFieldColors textFieldColors) {
            this.$outputTransformation = outputTransformation;
            this.$state = textFieldState;
            this.$lineLimits = textFieldLineLimits;
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

        static final ab Decoration$lambda$2(AnonymousClass1 anonymousClass1, p pVar, int i2, Composer composer, int i3) {
            anonymousClass1.Decoration(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
            return ab.f48028a;
        }

        @Override // androidx.compose.foundation.text.input.TextFieldDecorator
        public final void Decoration(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
            int i3;
            Composer composer2;
            String string;
            int i4 = i2 & 6;
            Composer composerStartRestartGroup = composer.startRestartGroup(-1516988351);
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
                    ComposerKt.traceEventStart(-1516988351, i3, -1, "androidx.compose.material.TextField.<no name provided>.Decoration (TextField.kt:226)");
                }
                OutputTransformation outputTransformation = this.$outputTransformation;
                TextFieldState textFieldState = this.$state;
                if (outputTransformation == null) {
                    string = textFieldState.getText().toString();
                } else {
                    TextFieldBuffer textFieldBufferStartEdit = textFieldState.startEdit();
                    try {
                        textFieldState.commitEdit(textFieldBufferStartEdit);
                        textFieldState.finishEditing();
                        this.$outputTransformation.transformOutput(textFieldBufferStartEdit);
                        string = textFieldBufferStartEdit.asCharSequence().toString();
                    } catch (Throwable th) {
                        textFieldState.finishEditing();
                        throw th;
                    }
                }
                int i5 = i3;
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.INSTANCE;
                VisualTransformation none = VisualTransformation.Companion.getNone();
                composer2 = composerStartRestartGroup;
                textFieldDefaults.TextFieldDecorationBox(string, pVar, this.$enabled, x.n(this.$lineLimits, TextFieldLineLimits.SingleLine.INSTANCE), none, this.$interactionSource, this.$isError, this.$label, this.$placeholder, this.$leadingIcon, this.$trailingIcon, this.$shape, this.$colors, null, composer2, ((i5 << 3) & 112) | 24576, 24576, 8192);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TextFieldKt$TextField$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TextFieldKt.AnonymousClass1.Decoration$lambda$2(this.f$0, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final androidx.compose.ui.text.input.TextFieldValue r77, final h.g.a.l<? super androidx.compose.ui.text.input.TextFieldValue, h.ab> r78, androidx.compose.ui.Modifier r79, boolean r80, boolean r81, androidx.compose.ui.text.TextStyle r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r84, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r85, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r86, boolean r87, androidx.compose.ui.text.input.VisualTransformation r88, androidx.compose.foundation.text.KeyboardOptions r89, androidx.compose.foundation.text.KeyboardActions r90, boolean r91, int r92, int r93, androidx.compose.foundation.interaction.MutableInteractionSource r94, androidx.compose.ui.graphics.Shape r95, androidx.compose.material.TextFieldColors r96, androidx.compose.runtime.Composer r97, final int r98, final int r99, final int r100) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    static final ab TextField$lambda$11(TextFieldValue textFieldValue, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, p pVar, p pVar2, p pVar3, p pVar4, Shape shape, TextFieldColors textFieldColors, p pVar5, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changedInstance(pVar5) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1565379926, i3, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:566)");
            }
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(textFieldValue.getText(), pVar5, z, z2, visualTransformation, mutableInteractionSource, z3, pVar, pVar2, pVar3, pVar4, shape, textFieldColors, null, composer, (i3 << 3) & 112, 24576, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TextField$lambda$12(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, Composer composer, int i7) {
        TextField(textFieldValue, (l<? super TextFieldValue, ab>) lVar, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    static final ab TextField$lambda$14(TextFieldValue textFieldValue, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        TextField(textFieldValue, lVar, modifier, z, z2, textStyle, pVar, pVar2, pVar3, pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    static final ab TextField$lambda$2(TextFieldState textFieldState, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, InputTransformation inputTransformation, OutputTransformation outputTransformation, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, TextFieldLineLimits textFieldLineLimits, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4, Composer composer, int i5) {
        TextField(textFieldState, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, inputTransformation, outputTransformation, keyboardOptions, keyboardActionHandler, textFieldLineLimits, scrollState, shape, textFieldColors, mutableInteractionSource, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return ab.f48028a;
    }

    static final ab TextField$lambda$5(String str, boolean z, boolean z2, VisualTransformation visualTransformation, MutableInteractionSource mutableInteractionSource, boolean z3, p pVar, p pVar2, p pVar3, p pVar4, Shape shape, TextFieldColors textFieldColors, p pVar5, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changedInstance(pVar5) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-83351293, i3, -1, "androidx.compose.material.TextField.<anonymous> (TextField.kt:376)");
            }
            TextFieldDefaults.INSTANCE.TextFieldDecorationBox(str, pVar5, z, z2, visualTransformation, mutableInteractionSource, z3, pVar, pVar2, pVar3, pVar4, shape, textFieldColors, null, composer, (i3 << 3) & 112, 24576, 8192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TextField$lambda$6(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, int i3, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i4, int i5, int i6, Composer composer, int i7) {
        TextField(str, (l<? super String, ab>) lVar, modifier, z, z2, textStyle, (p<? super Composer, ? super Integer, ab>) pVar, (p<? super Composer, ? super Integer, ab>) pVar2, (p<? super Composer, ? super Integer, ab>) pVar3, (p<? super Composer, ? super Integer, ab>) pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, i3, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), RecomposeScopeImplKt.updateChangedFlags(i5), i6);
        return ab.f48028a;
    }

    static final ab TextField$lambda$8(String str, l lVar, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, p pVar, p pVar2, p pVar3, p pVar4, boolean z3, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, boolean z4, int i2, MutableInteractionSource mutableInteractionSource, Shape shape, TextFieldColors textFieldColors, int i3, int i4, int i5, Composer composer, int i6) {
        TextField(str, lVar, modifier, z, z2, textStyle, pVar, pVar2, pVar3, pVar4, z3, visualTransformation, keyboardOptions, keyboardActions, z4, i2, mutableInteractionSource, shape, textFieldColors, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return ab.f48028a;
    }

    public static final void TextFieldLayout(final Modifier modifier, final p<? super Composer, ? super Integer, ab> pVar, final p<? super Composer, ? super Integer, ab> pVar2, final q<? super Modifier, ? super Composer, ? super Integer, ab> qVar, final p<? super Composer, ? super Integer, ab> pVar3, final p<? super Composer, ? super Integer, ab> pVar4, final boolean z, final float f2, final PaddingValues paddingValues, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1595074580);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(qVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar4) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 524288 : 1048576;
        }
        if ((12582912 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(f2) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changed(paddingValues) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1595074580, i3, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:650)");
            }
            boolean z2 = (3670016 & i3) == 1048576;
            boolean z3 = (29360128 & i3) == 8388608;
            boolean z4 = (234881024 & i3) == 67108864;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | z3 | z4) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z, f2, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            int i5 = i3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, textFieldMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            if (pVar3 != null) {
                composerStartRestartGroup.startReplaceGroup(-1444611617);
                Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Leading"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize);
                a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash2 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    Integer numValueOf2 = Integer.valueOf(currentCompositeKeyHash2);
                    composerStartRestartGroup.updateRememberedValue(numValueOf2);
                    composerStartRestartGroup.apply(numValueOf2, setCompositeKeyHash2);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar3.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 12) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1444365601);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                composerStartRestartGroup.startReplaceGroup(-1444322883);
                Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, "Trailing"));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierMinimumInteractiveComponentSize2);
                a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash3 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    Integer numValueOf3 = Integer.valueOf(currentCompositeKeyHash3);
                    composerStartRestartGroup.updateRememberedValue(numValueOf3);
                    composerStartRestartGroup.apply(numValueOf3, setCompositeKeyHash3);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar4.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 15) & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1444074945);
                composerStartRestartGroup.endReplaceGroup();
            }
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion = Modifier.Companion;
            if (pVar3 != null) {
                fCalculateStartPadding = n.e(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding(), 0.0f);
            }
            float f3 = fCalculateStartPadding;
            if (pVar4 != null) {
                fCalculateEndPadding = n.e(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding(), 0.0f);
            }
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(companion, f3, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
            if (qVar != null) {
                composerStartRestartGroup.startReplaceGroup(-1443222972);
                qVar.invoke(LayoutIdKt.layoutId(Modifier.Companion, "Hint").then(modifierM2759paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i5 >> 6) & 112));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1443135521);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (pVar2 != null) {
                int i6 = i5 >> 6;
                composerStartRestartGroup.startReplaceGroup(-1443101018);
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.Companion, "Label").then(modifierM2759paddingqDBjuR0$default);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                a<ComposeUiNode> constructor4 = ComposeUiNode.Companion.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap4, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, ab> setCompositeKeyHash4 = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    Integer numValueOf4 = Integer.valueOf(currentCompositeKeyHash4);
                    composerStartRestartGroup.updateRememberedValue(numValueOf4);
                    composerStartRestartGroup.apply(numValueOf4, setCompositeKeyHash4);
                }
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier4, ComposeUiNode.Companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                pVar2.invoke(composerStartRestartGroup, Integer.valueOf(i6 & 14));
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1443015489);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.Companion, "TextField").then(modifierM2759paddingqDBjuR0$default);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
            a<ComposeUiNode> constructor5 = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap5, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash5 = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                Integer numValueOf5 = Integer.valueOf(currentCompositeKeyHash5);
                composerStartRestartGroup.updateRememberedValue(numValueOf5);
                composerStartRestartGroup.apply(numValueOf5, setCompositeKeyHash5);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier5, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i5 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return TextFieldKt.TextFieldLayout$lambda$2(modifier, pVar, pVar2, qVar, pVar3, pVar4, z, f2, paddingValues, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab TextFieldLayout$lambda$2(Modifier modifier, p pVar, p pVar2, q qVar, p pVar3, p pVar4, boolean z, float f2, PaddingValues paddingValues, int i2, Composer composer, int i3) {
        TextFieldLayout(modifier, pVar, pVar2, qVar, pVar3, pVar4, z, f2, paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m4270calculateHeightO3s9Psw(int i2, boolean z, int i3, int i4, int i5, int i6, long j2, float f2, PaddingValues paddingValues) {
        float f3 = TextFieldTopPadding * f2;
        float fMo2707calculateTopPaddingD9Ej5fM = paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f2;
        float fMo2704calculateBottomPaddingD9Ej5fM = paddingValues.mo2704calculateBottomPaddingD9Ej5fM() * f2;
        float fMax = Math.max(i2, i6);
        return ConstraintsKt.m11123constrainHeightK40F9xA(j2, Math.max(h.h.a.b(z ? i3 + f3 + fMax + fMo2704calculateBottomPaddingD9Ej5fM : fMo2707calculateTopPaddingD9Ej5fM + fMax + fMo2704calculateBottomPaddingD9Ej5fM), Math.max(i4, i5)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m4271calculateWidthVsPV1Ek(int i2, int i3, int i4, int i5, int i6, long j2) {
        return ConstraintsKt.m11124constrainWidthK40F9xA(j2, i2 + Math.max(i4, Math.max(i5, i6)) + i3);
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke borderStroke) {
        final float fM1997getWidthD9Ej5fM = borderStroke.m1997getWidthD9Ej5fM();
        return DrawModifierKt.drawWithContent(modifier, new l() { // from class: androidx.compose.material.TextFieldKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldKt.drawIndicatorLine$lambda$0(fM1997getWidthD9Ej5fM, borderStroke, (ContentDrawScope) obj);
            }
        });
    }

    static final ab drawIndicatorLine$lambda$0(float f2, BorderStroke borderStroke, ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (Dp.m11169equalsimpl0(f2, Dp.Companion.m11182getHairlineD9Ej5fM())) {
            return ab.f48028a;
        }
        float density = f2 * contentDrawScope.getDensity();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) - (density / 2.0f);
        Brush brush = borderStroke.getBrush();
        long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)));
        DrawScope.CC.m8827drawLine1RTmtNc$default(contentDrawScope, brush, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fIntBitsToFloat)) | (jFloatToRawIntBits3 << 32), density, 0, null, 0.0f, null, 0, DisplayStrings.DS_REPORT_MENU_V2_CRASH_REPORT_LABEL, null);
        return ab.f48028a;
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z, int i4, int i5, float f2, float f3) {
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i2 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z ? Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3) : h.h.a.b(TextFieldImplKt.getTextFieldPadding() * f3)) - h.h.a.b((r0 - i4) * f2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i5, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i2, int i3, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z, float f2, PaddingValues paddingValues) {
        int iB = h.h.a.b(paddingValues.mo2707calculateTopPaddingD9Ej5fM() * f2);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i3), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i2 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i3), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i3) : iB, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z) {
                iB = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i3);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iB, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final androidx.compose.foundation.text.input.TextFieldState r75, androidx.compose.ui.Modifier r76, boolean r77, boolean r78, androidx.compose.ui.text.TextStyle r79, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r80, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r81, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, boolean r84, androidx.compose.foundation.text.input.InputTransformation r85, androidx.compose.foundation.text.input.OutputTransformation r86, androidx.compose.foundation.text.KeyboardOptions r87, androidx.compose.foundation.text.input.KeyboardActionHandler r88, androidx.compose.foundation.text.input.TextFieldLineLimits r89, androidx.compose.foundation.ScrollState r90, androidx.compose.ui.graphics.Shape r91, androidx.compose.material.TextFieldColors r92, androidx.compose.foundation.interaction.MutableInteractionSource r93, androidx.compose.runtime.Composer r94, final int r95, final int r96, final int r97) {
        /*
            Method dump skipped, instructions count: 1597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, androidx.compose.foundation.ScrollState, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TextField(final androidx.compose.ui.text.input.TextFieldValue r73, final h.g.a.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, h.g.a.p r79, h.g.a.p r80, h.g.a.p r81, h.g.a.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final java.lang.String r77, final h.g.a.l<? super java.lang.String, h.ab> r78, androidx.compose.ui.Modifier r79, boolean r80, boolean r81, androidx.compose.ui.text.TextStyle r82, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r83, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r84, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r85, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r86, boolean r87, androidx.compose.ui.text.input.VisualTransformation r88, androidx.compose.foundation.text.KeyboardOptions r89, androidx.compose.foundation.text.KeyboardActions r90, boolean r91, int r92, int r93, androidx.compose.foundation.interaction.MutableInteractionSource r94, androidx.compose.ui.graphics.Shape r95, androidx.compose.material.TextFieldColors r96, androidx.compose.runtime.Composer r97, final int r98, final int r99, final int r100) {
        /*
            Method dump skipped, instructions count: 1682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void TextField(final java.lang.String r73, final h.g.a.l r74, androidx.compose.ui.Modifier r75, boolean r76, boolean r77, androidx.compose.ui.text.TextStyle r78, h.g.a.p r79, h.g.a.p r80, h.g.a.p r81, h.g.a.p r82, boolean r83, androidx.compose.ui.text.input.VisualTransformation r84, androidx.compose.foundation.text.KeyboardOptions r85, androidx.compose.foundation.text.KeyboardActions r86, boolean r87, int r88, androidx.compose.foundation.interaction.MutableInteractionSource r89, androidx.compose.ui.graphics.Shape r90, androidx.compose.material.TextFieldColors r91, androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, h.g.a.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, h.g.a.p, h.g.a.p, h.g.a.p, h.g.a.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
