package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CardKt {
    /* JADX WARN: Removed duplicated region for block: B:145:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Card(final h.g.a.a<h.ab> r29, androidx.compose.ui.Modifier r30, boolean r31, androidx.compose.ui.graphics.Shape r32, androidx.compose.material3.CardColors r33, androidx.compose.material3.CardElevation r34, androidx.compose.foundation.BorderStroke r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.Card(h.g.a.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab Card$lambda$0(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-97109725, i2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = CardKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Card$lambda$1(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, q qVar, int i2, int i3, Composer composer, int i4) {
        Card(modifier, shape, cardColors, cardElevation, borderStroke, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab Card$lambda$3(q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1347531112, i2, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iM = CardKt$$ExternalSyntheticBackport0.m(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iM), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab Card$lambda$4(a aVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, Composer composer, int i4) {
        Card(aVar, modifier, z, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ElevatedCard(final h.g.a.a<h.ab> r23, androidx.compose.ui.Modifier r24, boolean r25, androidx.compose.ui.graphics.Shape r26, androidx.compose.material3.CardColors r27, androidx.compose.material3.CardElevation r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(h.g.a.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ElevatedCard$lambda$0(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, q qVar, int i2, int i3, Composer composer, int i4) {
        ElevatedCard(modifier, shape, cardColors, cardElevation, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ElevatedCard$lambda$1(a aVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, Composer composer, int i4) {
        ElevatedCard(aVar, modifier, z, shape, cardColors, cardElevation, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedCard(final h.g.a.a<h.ab> r26, androidx.compose.ui.Modifier r27, boolean r28, androidx.compose.ui.graphics.Shape r29, androidx.compose.material3.CardColors r30, androidx.compose.material3.CardElevation r31, androidx.compose.foundation.BorderStroke r32, androidx.compose.foundation.interaction.MutableInteractionSource r33, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.OutlinedCard(h.g.a.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab OutlinedCard$lambda$0(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, q qVar, int i2, int i3, Composer composer, int i4) {
        OutlinedCard(modifier, shape, cardColors, cardElevation, borderStroke, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab OutlinedCard$lambda$1(a aVar, Modifier modifier, boolean z, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, q qVar, int i2, int i3, Composer composer, int i4) {
        OutlinedCard(aVar, modifier, z, shape, cardColors, cardElevation, borderStroke, mutableInteractionSource, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void ElevatedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Shape elevatedShape;
        CardColors cardColors2;
        CardElevation cardElevation2;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape2;
        final CardColors cardColors3;
        final CardElevation cardElevation3;
        CardColors cardColorsElevatedCardColors;
        Composer composer3;
        Modifier modifier4;
        CardColors cardColors4;
        CardElevation cardElevationM4468elevatedCardElevationaqJV_2Y;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1464672362);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0) {
                elevatedShape = shape;
                if (composerStartRestartGroup.changed(elevatedShape)) {
                    i6 = 32;
                }
            } else {
                elevatedShape = shape;
            }
            i4 |= i6;
        } else {
            elevatedShape = shape;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                if (composerStartRestartGroup.changed(cardColors2)) {
                    i7 = 256;
                }
            } else {
                cardColors2 = cardColors;
            }
            i4 |= i7;
        } else {
            cardColors2 = cardColors;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i8 = 1024;
            if ((i3 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (composerStartRestartGroup.changed(cardElevation2)) {
                    i8 = 2048;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i4 |= i8;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i2 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 9363) != 9362, i4 & 1)) {
            int i9 = i3 & 8;
            int i10 = i3 & 4;
            int i11 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i11 != 0) {
                    i4 &= -113;
                }
                if (i10 != 0) {
                    i4 &= -897;
                }
                if (i9 != 0) {
                    i4 &= -7169;
                }
                cardColors4 = cardColors2;
                cardElevationM4468elevatedCardElevationaqJV_2Y = cardElevation2;
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
            } else {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                if (i11 != 0) {
                    i4 &= -113;
                    elevatedShape = CardDefaults.INSTANCE.getElevatedShape(composerStartRestartGroup, 6);
                }
                if (i10 != 0) {
                    cardColorsElevatedCardColors = CardDefaults.INSTANCE.elevatedCardColors(composerStartRestartGroup, 6);
                    i4 &= -897;
                } else {
                    cardColorsElevatedCardColors = cardColors2;
                }
                if (i9 != 0) {
                    composer3 = composerStartRestartGroup;
                    i4 &= -7169;
                    modifier4 = companion;
                    cardElevationM4468elevatedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m4468elevatedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                    cardColors4 = cardColorsElevatedCardColors;
                } else {
                    composer3 = composerStartRestartGroup;
                    modifier4 = companion;
                    cardColors4 = cardColorsElevatedCardColors;
                    cardElevationM4468elevatedCardElevationaqJV_2Y = cardElevation2;
                }
            }
            Shape shape3 = elevatedShape;
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1464672362, i4, -1, "androidx.compose.material3.ElevatedCard (Card.kt:197)");
            }
            Composer composer4 = composer3;
            Card(modifier4, shape3, cardColors4, cardElevationM4468elevatedCardElevationaqJV_2Y, null, qVar, composer4, (i4 & 14) | 24576 | (i4 & 112) | (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | (i4 & 7168) | (458752 & (i4 << 3)), 0);
            composer2 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            shape2 = shape3;
            cardColors3 = cardColors4;
            cardElevation3 = cardElevationM4468elevatedCardElevationaqJV_2Y;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            shape2 = elevatedShape;
            cardColors3 = cardColors2;
            cardElevation3 = cardElevation2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CardKt$$ExternalSyntheticLambda7
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CardKt.ElevatedCard$lambda$0(modifier3, shape2, cardColors3, cardElevation3, qVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        Shape outlinedShape;
        CardColors cardColors2;
        CardElevation cardElevationM4470outlinedCardElevationaqJV_2Y;
        BorderStroke borderStroke2;
        Composer composer2;
        final Modifier modifier3;
        final Shape shape2;
        final CardColors cardColors3;
        final CardElevation cardElevation2;
        final BorderStroke borderStroke3;
        CardColors cardColorsOutlinedCardColors;
        boolean z;
        Composer composer3;
        BorderStroke borderStrokeOutlinedCardBorder;
        CardColors cardColors4;
        Shape shape3;
        CardElevation cardElevation3;
        Modifier modifier4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1945643296);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (true != composerStartRestartGroup.changed(modifier2) ? 2 : 4) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            int i6 = 16;
            if ((i3 & 2) == 0) {
                outlinedShape = shape;
                if (composerStartRestartGroup.changed(outlinedShape)) {
                    i6 = 32;
                }
            } else {
                outlinedShape = shape;
            }
            i4 |= i6;
        } else {
            outlinedShape = shape;
        }
        if ((i2 & 384) == 0) {
            int i7 = 128;
            if ((i3 & 4) == 0) {
                cardColors2 = cardColors;
                if (composerStartRestartGroup.changed(cardColors2)) {
                    i7 = 256;
                }
            } else {
                cardColors2 = cardColors;
            }
            i4 |= i7;
        } else {
            cardColors2 = cardColors;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            int i8 = 1024;
            if ((i3 & 8) == 0) {
                cardElevationM4470outlinedCardElevationaqJV_2Y = cardElevation;
                if (composerStartRestartGroup.changed(cardElevationM4470outlinedCardElevationaqJV_2Y)) {
                    i8 = 2048;
                }
            } else {
                cardElevationM4470outlinedCardElevationaqJV_2Y = cardElevation;
            }
            i4 |= i8;
        } else {
            cardElevationM4470outlinedCardElevationaqJV_2Y = cardElevation;
        }
        if ((i2 & 24576) == 0) {
            int i9 = 8192;
            if ((i3 & 16) == 0) {
                borderStroke2 = borderStroke;
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i9 = 16384;
                }
            } else {
                borderStroke2 = borderStroke;
            }
            i4 |= i9;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((196608 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(qVar) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            int i10 = i3 & 16;
            int i11 = i3 & 8;
            int i12 = i3 & 4;
            int i13 = i3 & 2;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if (i13 != 0) {
                    i4 &= -113;
                }
                if (i12 != 0) {
                    i4 &= -897;
                }
                if (i11 != 0) {
                    i4 &= -7169;
                }
                if (i10 != 0) {
                    i4 &= -57345;
                }
                cardColors4 = cardColors2;
                cardElevation3 = cardElevationM4470outlinedCardElevationaqJV_2Y;
                borderStrokeOutlinedCardBorder = borderStroke2;
                composer3 = composerStartRestartGroup;
                modifier4 = modifier2;
                shape3 = outlinedShape;
            } else {
                Modifier.Companion companion = i5 != 0 ? Modifier.Companion : modifier2;
                if (i13 != 0) {
                    i4 &= -113;
                    outlinedShape = CardDefaults.INSTANCE.getOutlinedShape(composerStartRestartGroup, 6);
                }
                if (i12 != 0) {
                    cardColorsOutlinedCardColors = CardDefaults.INSTANCE.outlinedCardColors(composerStartRestartGroup, 6);
                    i4 &= -897;
                } else {
                    cardColorsOutlinedCardColors = cardColors2;
                }
                if (i11 != 0) {
                    z = false;
                    composer3 = composerStartRestartGroup;
                    cardElevationM4470outlinedCardElevationaqJV_2Y = CardDefaults.INSTANCE.m4470outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, 1572864, 63);
                    i4 &= -7169;
                } else {
                    z = false;
                    composer3 = composerStartRestartGroup;
                }
                if (i10 != 0) {
                    i4 &= -57345;
                    borderStrokeOutlinedCardBorder = CardDefaults.INSTANCE.outlinedCardBorder(z, composer3, 48, 1);
                } else {
                    borderStrokeOutlinedCardBorder = borderStroke;
                }
                cardColors4 = cardColorsOutlinedCardColors;
                shape3 = outlinedShape;
                cardElevation3 = cardElevationM4470outlinedCardElevationaqJV_2Y;
                modifier4 = companion;
            }
            composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1945643296, i4, -1, "androidx.compose.material3.OutlinedCard (Card.kt:298)");
            }
            Composer composer4 = composer3;
            Card(modifier4, shape3, cardColors4, cardElevation3, borderStrokeOutlinedCardBorder, qVar, composer4, 524286 & i4, 0);
            composer2 = composer4;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            shape2 = shape3;
            cardColors3 = cardColors4;
            cardElevation2 = cardElevation3;
            borderStroke3 = borderStrokeOutlinedCardBorder;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
            shape2 = outlinedShape;
            cardColors3 = cardColors2;
            cardElevation2 = cardElevationM4470outlinedCardElevationaqJV_2Y;
            borderStroke3 = borderStroke;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.material3.CardKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CardKt.OutlinedCard$lambda$0(modifier3, shape2, cardColors3, cardElevation2, borderStroke3, qVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Card(androidx.compose.ui.Modifier r21, androidx.compose.ui.graphics.Shape r22, androidx.compose.material3.CardColors r23, androidx.compose.material3.CardElevation r24, androidx.compose.foundation.BorderStroke r25, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.Card(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }
}
