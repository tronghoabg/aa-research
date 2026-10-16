package androidx.compose.material;

import androidx.compose.material.internal.Icons;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TrailingIcon$lambda$1$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return ab.f48028a;
    }

    static final ab TrailingIcon$lambda$2(boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(726122713, i2, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon.<anonymous> (ExposedDropdownMenu.kt:241)");
            }
            IconKt.m4111Iconww6aTOc(Icons.Filled.INSTANCE.getArrowDropDown$material(), "Trailing icon for exposed dropdown menu", RotateKt.rotate(Modifier.Companion, true != z ? 360.0f : 180.0f), 0L, composer, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TrailingIcon$lambda$3(ExposedDropdownMenuDefaults exposedDropdownMenuDefaults, boolean z, a aVar, int i2, int i3, Composer composer, int i4) {
        exposedDropdownMenuDefaults.TrailingIcon(z, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public final void TrailingIcon(final boolean z, a<ab> aVar, Composer composer, final int i2, final int i3) {
        int i4;
        final a<ab> aVar2;
        a<ab> aVar3;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(876077373);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(z) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (i6 != 0) {
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new a() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return ab.f48028a;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                aVar3 = (a) objRememberedValue;
            } else {
                aVar3 = aVar;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i4, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:235)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$$ExternalSyntheticLambda1
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ExposedDropdownMenuDefaults.TrailingIcon$lambda$1$0((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            aVar2 = aVar3;
            IconButtonKt.IconButton(aVar2, SemanticsModifierKt.clearAndSetSemantics(companion, (l) objRememberedValue2), false, null, ComposableLambdaKt.rememberComposableLambda(726122713, true, new p() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ExposedDropdownMenuDefaults.TrailingIcon$lambda$2(z, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            aVar2 = aVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material.ExposedDropdownMenuDefaults$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ExposedDropdownMenuDefaults.TrailingIcon$lambda$3(this.f$0, z, aVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m4085outlinedTextFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i2, int i3, int i4, int i5) {
        long j24;
        long jM8227copywmQWz5c$default;
        long j25;
        long jM8227copywmQWz5c$default2;
        long j26;
        long jM8227copywmQWz5c$default3;
        long j27;
        long jM8227copywmQWz5c$default4;
        long j28;
        long jM8227copywmQWz5c$default5 = (i5 & 1) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM8227copywmQWz5c$default6 = (i5 & 2) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8263getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.Companion.m8263getTransparent0d7_KjU() : j4;
        long jM4027getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j5;
        long jM4021getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j6;
        long jM8227copywmQWz5c$default7 = (i5 & 32) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM8227copywmQWz5c$default8 = (i5 & 64) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if ((i5 & 128) != 0) {
            long j29 = jM8227copywmQWz5c$default8;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM8227copywmQWz5c$default8;
            jM8227copywmQWz5c$default = j9;
        }
        long jM4021getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j10;
        long jM8227copywmQWz5c$default9 = (i5 & 512) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i5 & 1024) != 0) {
            long j30 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default2 = j12;
        }
        long j31 = (i5 & 2048) != 0 ? j25 : j13;
        long jM8227copywmQWz5c$default10 = (i5 & 4096) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM8227copywmQWz5c$default11 = (i5 & 8192) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i5 & 16384) != 0) {
            long j32 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default3 = Color.m8227copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default3 = j16;
        }
        long jM4021getError0d7_KjU3 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j17;
        long jM8227copywmQWz5c$default12 = (65536 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM8227copywmQWz5c$default13 = (131072 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((262144 & i5) != 0) {
            long j33 = jM8227copywmQWz5c$default13;
            jM8227copywmQWz5c$default4 = Color.m8227copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j33;
        } else {
            j27 = jM8227copywmQWz5c$default13;
            jM8227copywmQWz5c$default4 = j20;
        }
        long jM4021getError0d7_KjU4 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j21;
        long jM8227copywmQWz5c$default14 = (1048576 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM8227copywmQWz5c$default15 = (i5 & 2097152) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if (ComposerKt.isTraceInProgress()) {
            j28 = jM8227copywmQWz5c$default15;
            ComposerKt.traceEventStart(1162641182, i2, i3, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:417)");
        } else {
            j28 = jM8227copywmQWz5c$default15;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM8227copywmQWz5c$default5, jM8227copywmQWz5c$default6, jM4027getPrimary0d7_KjU, jM4021getError0d7_KjU, jM8227copywmQWz5c$default7, j24, jM4021getError0d7_KjU2, jM8227copywmQWz5c$default, j25, jM8227copywmQWz5c$default2, j31, j26, jM8227copywmQWz5c$default11, jM8227copywmQWz5c$default3, jM4021getError0d7_KjU3, jM8263getTransparent0d7_KjU, jM8227copywmQWz5c$default12, j27, jM8227copywmQWz5c$default4, jM4021getError0d7_KjU4, jM8227copywmQWz5c$default14, j28, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m4086textFieldColorsDlUQjxs(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, Composer composer, int i2, int i3, int i4, int i5) {
        long j24;
        long jM8227copywmQWz5c$default;
        long j25;
        long jM8227copywmQWz5c$default2;
        long j26;
        long jM8227copywmQWz5c$default3;
        long j27;
        long jM8227copywmQWz5c$default4;
        long j28;
        long jM8227copywmQWz5c$default5 = (i5 & 1) != 0 ? Color.m8227copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m8238unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j2;
        long jM8227copywmQWz5c$default6 = (i5 & 2) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long jM8227copywmQWz5c$default7 = (i5 & 4) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j4;
        long jM4027getPrimary0d7_KjU = (i5 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU() : j5;
        long jM4021getError0d7_KjU = (i5 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j6;
        long jM8227copywmQWz5c$default8 = (i5 & 32) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j7;
        long jM8227copywmQWz5c$default9 = (i5 & 64) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j8;
        if ((i5 & 128) != 0) {
            long j29 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default = Color.m8227copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j24 = j29;
        } else {
            j24 = jM8227copywmQWz5c$default9;
            jM8227copywmQWz5c$default = j9;
        }
        long jM4021getError0d7_KjU2 = (i5 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j10;
        long jM8227copywmQWz5c$default10 = (i5 & 512) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if ((i5 & 1024) != 0) {
            long j30 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default2 = Color.m8227copywmQWz5c$default(j30, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j30;
        } else {
            j25 = jM8227copywmQWz5c$default10;
            jM8227copywmQWz5c$default2 = j12;
        }
        long j31 = (i5 & 2048) != 0 ? j25 : j13;
        long jM8227copywmQWz5c$default11 = (i5 & 4096) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM8227copywmQWz5c$default12 = (i5 & 8192) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i5 & 16384) != 0) {
            long j32 = jM8227copywmQWz5c$default11;
            jM8227copywmQWz5c$default3 = Color.m8227copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j26 = j32;
        } else {
            j26 = jM8227copywmQWz5c$default11;
            jM8227copywmQWz5c$default3 = j16;
        }
        long jM4021getError0d7_KjU3 = (32768 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j17;
        long jM8227copywmQWz5c$default13 = (65536 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4027getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM8227copywmQWz5c$default14 = (131072 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if ((262144 & i5) != 0) {
            long j33 = jM8227copywmQWz5c$default14;
            jM8227copywmQWz5c$default4 = Color.m8227copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j33;
        } else {
            j27 = jM8227copywmQWz5c$default14;
            jM8227copywmQWz5c$default4 = j20;
        }
        long jM4021getError0d7_KjU4 = (524288 & i5) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m4021getError0d7_KjU() : j21;
        long jM8227copywmQWz5c$default15 = (1048576 & i5) != 0 ? Color.m8227copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m4026getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long jM8227copywmQWz5c$default16 = (i5 & 2097152) != 0 ? Color.m8227copywmQWz5c$default(jM8227copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j23;
        if (ComposerKt.isTraceInProgress()) {
            j28 = jM8227copywmQWz5c$default16;
            ComposerKt.traceEventStart(1208167904, i2, i3, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:322)");
        } else {
            j28 = jM8227copywmQWz5c$default16;
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(jM8227copywmQWz5c$default5, jM8227copywmQWz5c$default6, jM4027getPrimary0d7_KjU, jM4021getError0d7_KjU, jM8227copywmQWz5c$default8, j24, jM4021getError0d7_KjU2, jM8227copywmQWz5c$default, j25, jM8227copywmQWz5c$default2, j31, j26, jM8227copywmQWz5c$default12, jM8227copywmQWz5c$default3, jM4021getError0d7_KjU3, jM8227copywmQWz5c$default7, jM8227copywmQWz5c$default13, j27, jM8227copywmQWz5c$default4, jM4021getError0d7_KjU4, jM8227copywmQWz5c$default15, j28, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
