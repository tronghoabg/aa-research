package com.waze.ui.af;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.R;
import com.waze.sound.gv;
import com.waze.strings.DisplayStrings;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41852a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final com.waze.z.a.a.a f41853b = new com.waze.z.a.a.a(new com.waze.ui.ac.d(R.drawable.t3_voice_directions_96px), (com.waze.z.a.s) null, 6);

    /* renamed from: c, reason: collision with root package name */
    private static final com.waze.z.a.ak f41854c = new com.waze.z.a.ak(h.a.i.d(as.f41865a));

    /* renamed from: d, reason: collision with root package name */
    private static final com.waze.z.a.ak f41855d = new com.waze.z.a.ak(h.a.i.i(aq.f41857a, as.f41865a));

    /* renamed from: e, reason: collision with root package name */
    private static final com.waze.z.a.ak f41856e = new com.waze.z.a.ak(h.a.i.i(ar.f41861a, as.f41865a));

    static final h.ab C(Modifier modifier, int i2, Composer composer) {
        N(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-708233796);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-708233796, i3, -1, "com.waze.ui.voices.BeExtraClearDialog (VoiceSettingsScreen.kt:610)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_BE_EXTRA_CLEAR_TITLE, composerStartRestartGroup, 0);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_BE_EXTRA_CLEAR_TEXT, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.GOT_IT, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.CANCEL, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12), true);
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar, aVar2, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.q.d(strB, strB2, aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar2, null, composerStartRestartGroup, (i3 << 9) & 57344, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ae(aVar, aVar2, i2, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064083647);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1064083647, i3, -1, "com.waze.ui.voices.BelowTitleText (VoiceSettingsScreen.kt:605)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(str, (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composer2, i3 & 14, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new af(str, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-851869126);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851869126, i3, -1, "com.waze.ui.voices.ShareDisclaimerDialog (VoiceSettingsScreen.kt:644)");
            }
            String strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_SHARE_DISCLAIMER_TITLE, composerStartRestartGroup, 0);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_SHARE_DISCLAIMER, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.SHARE, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(null, null, null, 7), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.CANCEL, composerStartRestartGroup, 0), com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6), false, null, 12), true);
            boolean z = (i3 & 14) == 4;
            boolean z2 = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar, aVar2, 14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.q.d(strB, strB2, aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar2, null, composerStartRestartGroup, (i3 << 9) & 57344, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ae(aVar, aVar2, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(Composer composer, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(81839892);
        if (composerStartRestartGroup.shouldExecute(i2 != 0, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81839892, i2, -1, "com.waze.ui.voices.TrailingSelectedIcon (VoiceSettingsScreen.kt:575)");
            }
            ImageKt.Image(com.waze.ui.r.a.a.t.e(new com.waze.ui.ac.f(R.drawable.settings_selected_icon), null, composerStartRestartGroup, 0, 6), "Selected", SizeKt.m2814requiredSize3ABfNKs(com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.o, null), 24.0f), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, ColorFilter.Companion.m8269tintxETnrds$default(ColorFilter.Companion, com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0, 2, null), composerStartRestartGroup, Painter.$stable | 25008, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.af.ah
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ap.t(i2, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(final q qVar, final int i2, final boolean z, final boolean z2, final boolean z3, final h.g.a.a aVar, Composer composer, final int i3) {
        int i4;
        int i5;
        boolean z4;
        h.g.a.a aVar2;
        Composer composer2;
        com.waze.ui.r.a.d.c cVar;
        int i6 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(590522564);
        if (i6 == 0) {
            i4 = (true != composerStartRestartGroup.changed(qVar) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= true != composerStartRestartGroup.changed(i5) ? 16 : 32;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            z4 = z;
            i4 |= true != composerStartRestartGroup.changed(z4) ? 128 : 256;
        } else {
            z4 = z;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z2) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z3) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            aVar2 = aVar;
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        } else {
            aVar2 = aVar;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i4) != 74898, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(590522564, i4, -1, "com.waze.ui.voices.VoiceCell (VoiceSettingsScreen.kt:561)");
            }
            Modifier.Companion companion = Modifier.Companion;
            x xVarA = qVar.a();
            x xVar = x.f41917a;
            c cVar2 = c.f41880a;
            int iOrdinal = xVarA.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                cVar = com.waze.ui.r.a.d.c.n;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                cVar = com.waze.ui.r.a.d.c.m;
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(companion, cVar, Integer.valueOf(i5));
            composer2 = composerStartRestartGroup;
            com.waze.z.a.a.h.h(qVar.d(), false, z4, modifierA, 0L, true != z2 ? aVar2 : null, (z2 && z3) ? f41853b : null, ComposableLambdaKt.rememberComposableLambda(2010623207, true, new h.g.a.p() { // from class: com.waze.ui.af.ab
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return ap.k(z2, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-455022538, true, new ad(qVar, 0), composerStartRestartGroup, 54), null, composer2, (i4 & DisplayStrings.DS_TAP_TO_VERIFY) | 113246256, 0, DisplayStrings.DS_MAP_POPUP_USER_MESSAGE_BUTTON);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.ui.af.ag
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return ap.u(qVar, i2, z, z2, z3, aVar, i3, (Composer) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(Modifier modifier, String str, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1915543295);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(modifier) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1915543295, i3, -1, "com.waze.ui.voices.VoiceSectionTitle (VoiceSettingsScreen.kt:588)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(str, PaddingKt.m2756paddingVpY3zN4(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).k(), null, 2, null), 16.0f, 16.0f), com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).m(), composer2, (i3 >> 3) & 14, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new ae(modifier, str, i2, 2));
        }
    }

    private static final void J(MutableState mutableState, y yVar) {
        mutableState.setValue(yVar);
    }

    private static final void K(LazyListScope lazyListScope, String str, List list, String str2, boolean z, h.g.a.l lVar) {
        lazyListScope.items(list.size(), new al(new com.waze.main_screen.o(str, 8), list, 0), new am(list, 0), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new an(list, list, str2, z, lVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h.ab L(h.g.a.a aVar, h.g.a.a aVar2, com.waze.z.a.c.c cVar, com.waze.z.a.c.d dVar) {
        h.g.b.x.f(cVar, "actions");
        h.g.b.x.f(dVar, "cta");
        com.waze.z.a.c.a aVar3 = (com.waze.z.a.c.a) cVar;
        if (h.g.b.x.n(dVar, aVar3.a())) {
            aVar.invoke();
        } else if (h.g.b.x.n(dVar, aVar3.b())) {
            aVar2.invoke();
        }
        return h.ab.f48028a;
    }

    private static final String M(q qVar, Composer composer) {
        String strB;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650381964, 0, -1, "com.waze.ui.voices.getDescription (VoiceSettingsScreen.kt:686)");
        }
        if (qVar instanceof y) {
            composer.startReplaceGroup(-2038314725);
            y yVar = (y) qVar;
            c cVarE = yVar.e();
            x xVar = x.f41917a;
            c cVar = c.f41880a;
            int iOrdinal = cVarE.ordinal();
            if (iOrdinal == 0) {
                composer.startReplaceGroup(-2038045893);
                if (yVar.f()) {
                    composer.startReplaceGroup(-1174121373);
                    strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_MY_RECORDING, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1174119355);
                    strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_SHARED_WITH_ME, composer, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else if (iOrdinal == 1) {
                composer.startReplaceGroup(-1174125086);
                strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_DOWNLOADING, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (iOrdinal != 2) {
                    composer.startReplaceGroup(-1174130745);
                    composer.endReplaceGroup();
                    throw new h.i();
                }
                composer.startReplaceGroup(-1174128346);
                strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPTS_TAP_TO_DOWNLOAD, composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else if (qVar instanceof w) {
            composer.startReplaceGroup(-1174110657);
            strB = com.waze.ui.r.a.c.c.b(R.string.INCLUDING_STREET_NAMES, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1174108491);
            composer.endReplaceGroup();
            strB = qVar.b();
            String str = strB;
            if (str == null || h.n.o.G(str)) {
                strB = null;
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(Modifier modifier, Composer composer, int i2) {
        Composer composer2;
        Modifier.Companion companion;
        int i3 = i2 | 6;
        boolean z = (i3 & 3) != 2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1732414311);
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1732414311, i3, -1, "com.waze.ui.voices.EmptySearchResultsItem (VoiceSettingsScreen.kt:729)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_SEARCH_NO_RESULTS, composerStartRestartGroup, 0), PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 16.0f, 28.0f, 16.0f, 0.0f, 8, null), com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composer2, 0, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            companion = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new af(companion, i2, 1));
        }
    }

    public static final /* synthetic */ y d(String str, String str2) {
        return new y(str, str2, c.f41882c, false, false);
    }

    public static /* synthetic */ h.ab e(h.g.a.l lVar, Toast toast, MutableState mutableState, MutableState mutableState2, y yVar) {
        h.g.b.x.f(yVar, "it");
        if (yVar.g()) {
            lVar.invoke(new n(yVar));
            mutableState.setValue(Boolean.valueOf(true));
            J(mutableState2, yVar);
        } else {
            toast.show();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab f(q qVar, ColumnScope columnScope, Composer composer, int i2) {
        h.g.b.x.f(columnScope, "$this$ActionCellBase");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(498484495, i2, -1, "com.waze.ui.voices.currentVoiceSection.<anonymous>.<anonymous> (VoiceSettingsScreen.kt:388)");
            }
            String strM = M(qVar, composer);
            if (strM == null) {
                composer.startReplaceGroup(-1645292424);
            } else {
                composer.startReplaceGroup(-1645292423);
                E(strM, composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.waze.ui.af.q] */
    /* JADX WARN: Type inference failed for: r3v16, types: [com.waze.ui.af.q] */
    /* JADX WARN: Type inference failed for: r3v18, types: [com.waze.ui.af.q] */
    public static /* synthetic */ h.ab h(final v vVar, final h.g.a.l lVar, final MutableState mutableState, MutableState mutableState2, Toast toast, MutableState mutableState3, MutableState mutableState4, SoftwareKeyboardController softwareKeyboardController, LazyListScope lazyListScope) {
        h.g.b.x.f(lazyListScope, "$this$LazyColumn");
        LazyListScope.CC.stickyHeader$default(lazyListScope, (Object) "SEARCH_FIELD", (Object) null, (h.g.a.r) ComposableLambdaKt.composableLambdaInstance(552426258, true, new h.g.a.r() { // from class: com.waze.ui.af.aa
            @Override // h.g.a.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                Object obj5;
                boolean z;
                ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                int i2 = ap.f41852a;
                h.g.b.x.f((LazyItemScope) obj, "$this$stickyHeader");
                if (composer.shouldExecute((iIntValue & 129) != 128, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(552426258, iIntValue, -1, "com.waze.ui.voices.VoiceSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VoiceSettingsScreen.kt:250)");
                    }
                    Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(Modifier.Companion, com.waze.bz.a.d(composer, 0).h(), null, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
                    int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1972backgroundbw27NRU$default);
                    h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    MutableState mutableState5 = mutableState;
                    v vVar2 = vVar;
                    Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.0f, 16.0f, 0.0f, 0.0f, 13, null);
                    if (vVar2.e() && ((Boolean) mutableState5.getValue()).booleanValue()) {
                        obj5 = null;
                        z = true;
                    } else {
                        obj5 = null;
                        z = false;
                    }
                    int i3 = b.f41869a;
                    Object obj6 = obj5;
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, modifierM2759paddingqDBjuR0$default, (EnterTransition) null, (ExitTransition) null, (String) null, (h.g.a.q<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, h.ab>) b.g(), composer, 1573254, 28);
                    Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, obj6), com.waze.bz.a.d(composer, 0).h(), null, 2, null), 16.0f);
                    String strB = com.waze.ui.r.a.c.c.b(R.string.VOICE_SETTINGS_SEARCH_FIELD_PLACEHOLDER, composer, 0);
                    String strB2 = vVar2 instanceof u ? ((u) vVar2).b() : "";
                    h.g.a.l lVar2 = lVar;
                    boolean zChanged = composer.changed(lVar2);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                        objRememberedValue = new gv(lVar2, 18);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                    boolean zChanged2 = composer.changed(lVar2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                        objRememberedValue2 = new com.waze.ui.x.p(lVar2, 9);
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    h.g.a.l lVar3 = (h.g.a.l) objRememberedValue2;
                    boolean zChanged3 = composer.changed(lVar2);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                        objRememberedValue3 = new com.waze.ui.u(lVar2, mutableState5, 5);
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    com.waze.z.a.d.ai.g(modifierM2755padding3ABfNKs, strB, strB2, null, aVar, lVar3, null, (h.g.a.l) objRememberedValue3, null, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, DisplayStrings.DS_YES);
                    SpacerKt.Spacer(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, obj6), 1.0f), com.waze.bz.a.d(composer, 0).K(), null, 2, null), composer, 0);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return h.ab.f48028a;
            }
        }), 2, (Object) null);
        byte[] bArr = null;
        bArr = null;
        if (vVar instanceof t) {
            t tVar = (t) vVar;
            String strA = tVar.a();
            if (strA != null && strA.length() != 0) {
                com.waze.ui.x.p pVar = new com.waze.ui.x.p(tVar, 10);
                ?? r3 = (q) pVar.invoke(tVar.b());
                bArr = r3;
                if (r3 == 0) {
                    bArr = (q) pVar.invoke(tVar.c());
                }
            }
            ?? r0 = bArr;
            if (r0 != null) {
                int i2 = b.f41869a;
                LazyListScope.CC.item$default(lazyListScope, "CURRENT_SECTION", null, b.e(), 2, null);
                LazyListScope.CC.item$default(lazyListScope, "CURRENT_ITEM", null, ComposableLambdaKt.composableLambdaInstance(404742045, true, new ad(r0, 1)), 2, null);
            }
            List listB = tVar.b();
            String strA2 = tVar.a();
            gv gvVar = new gv(mutableState2, 19);
            com.waze.ui.r.a.a.i iVar = new com.waze.ui.r.a.a.i(lVar, toast, mutableState3, mutableState4, 4);
            int i3 = b.f41869a;
            LazyListScope.CC.item$default(lazyListScope, "CUSTOM_SECTION", null, b.j(), 2, null);
            LazyListScope.CC.item$default(lazyListScope, "CUSTOM_NEW_VOICE", null, ComposableLambdaKt.composableLambdaInstance(403588429, true, new com.waze.main_screen.c.d.a(gvVar, 14)), 2, null);
            if (!listB.isEmpty()) {
                lazyListScope.items(listB.size(), new al(new com.waze.main_screen.o(9), listB, 1), new am(listB, 1), ComposableLambdaKt.composableLambdaInstance(2039820996, true, new ai(listB, lVar, iVar, listB, strA2)));
            }
            List listC = tVar.c();
            String strA3 = tVar.a();
            com.waze.ui.x.p pVar2 = new com.waze.ui.x.p(lVar, 11);
            LazyListScope.CC.item$default(lazyListScope, "PROMPT_TTS_SECTION", null, b.c(), 2, null);
            if (!listC.isEmpty()) {
                K(lazyListScope, "PROMPT_TTS_ITEM_", listC, strA3, false, pVar2);
            }
        } else {
            if (!(vVar instanceof u)) {
                throw new h.i();
            }
            u uVar = (u) vVar;
            if (uVar.c().isEmpty()) {
                int i4 = b.f41869a;
                LazyListScope.CC.item$default(lazyListScope, null, null, b.h(), 3, null);
            } else {
                K(lazyListScope, "FILTERED_ITEM_", uVar.c(), uVar.a(), true, new com.waze.ui.u(softwareKeyboardController, lVar, 6, bArr));
            }
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab j(MutableState mutableState, MutableState mutableState2) {
        mutableState.setValue(Boolean.valueOf(false));
        J(mutableState2, null);
        return h.ab.f48028a;
    }

    static final h.ab k(boolean z, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010623207, i2, -1, "com.waze.ui.voices.VoiceCell.<anonymous> (VoiceSettingsScreen.kt:570)");
            }
            if (z) {
                composer.startReplaceGroup(-526380675);
                G(composer, 0);
            } else {
                composer.startReplaceGroup(862089403);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab l(q qVar, ColumnScope columnScope, Composer composer, int i2) {
        h.g.b.x.f(columnScope, "$this$ActionCellBase");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455022538, i2, -1, "com.waze.ui.voices.VoiceCell.<anonymous> (VoiceSettingsScreen.kt:569)");
            }
            String strM = M(qVar, composer);
            if (strM == null) {
                composer.startReplaceGroup(-659616783);
            } else {
                composer.startReplaceGroup(-659616782);
                E(strM, composer, 0);
            }
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final h.ab m(final v vVar, final h.g.a.l lVar, final Toast toast, final SoftwareKeyboardController softwareKeyboardController, final MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, final MutableState mutableState4, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        t tVar;
        MutableState mutableState5;
        h.g.b.x.f(paddingValues, "padding");
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(paddingValues) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(538087793, i3, -1, "com.waze.ui.voices.VoiceSettingsScreen.<anonymous> (VoiceSettingsScreen.kt:242)");
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), paddingValues), com.waze.ui.r.a.d.c.f43321h, null);
            PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m2850onlybOOhFvg(WindowInsets_androidKt.getNavigationBars(WindowInsets.Companion, composer, 6), WindowInsetsSides.Companion.m2868getBottomJoeWqyM()), composer, 0);
            boolean zChangedInstance = composer.changedInstance(vVar) | composer.changed(lVar) | composer.changedInstance(toast) | composer.changed(softwareKeyboardController);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                h.g.a.l lVar2 = new h.g.a.l() { // from class: com.waze.ui.af.ac
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return ap.h(vVar, lVar, mutableState, mutableState2, toast, mutableState3, mutableState4, softwareKeyboardController, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(lVar2);
                objRememberedValue = lVar2;
            }
            LazyDslKt.LazyColumn(modifierA, null, paddingValuesAsPaddingValues, false, null, null, null, false, null, (h.g.a.l) objRememberedValue, composer, 0, 506);
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composer.startReplaceGroup(1359632767);
                boolean zChanged = composer.changed(lVar);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.ui.t(lVar, mutableState2, 16);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue2;
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = new gv(mutableState2, 20);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                D(aVar, (h.g.a.a) objRememberedValue3, composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1359865329);
                composer.endReplaceGroup();
            }
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composer.startReplaceGroup(1359915084);
                Object objRememberedValue4 = composer.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    mutableState5 = mutableState4;
                    tVar = null;
                    objRememberedValue4 = new com.waze.ui.t(mutableState3, mutableState5, 17, 0 == true ? 1 : 0);
                    composer.updateRememberedValue(objRememberedValue4);
                } else {
                    mutableState5 = mutableState4;
                    tVar = null;
                }
                h.g.a.a aVar2 = (h.g.a.a) objRememberedValue4;
                boolean zChanged2 = composer.changed(lVar);
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    com.waze.nav_connect.b.ab abVar = new com.waze.nav_connect.b.ab(aVar2, mutableState5, lVar, 8, (byte[]) null);
                    composer.updateRememberedValue(abVar);
                    objRememberedValue5 = abVar;
                }
                F((h.g.a.a) objRememberedValue5, aVar2, composer, 48);
                composer.endReplaceGroup();
            } else {
                tVar = null;
                composer.startReplaceGroup(1360288913);
                composer.endReplaceGroup();
            }
            t tVar2 = vVar instanceof t ? (t) vVar : tVar;
            if (tVar2 == null || !tVar2.d()) {
                composer.startReplaceGroup(1360428785);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1360362476);
                com.waze.ui.ai.b(com.waze.ui.r.a.c.c.b(R.string.PLEASE_WAIT___, composer, 0), composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab n(q qVar, LazyItemScope lazyItemScope, Composer composer, int i2) {
        h.g.b.x.f(lazyItemScope, "$this$item");
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(404742045, i2, -1, "com.waze.ui.voices.currentVoiceSection.<anonymous> (VoiceSettingsScreen.kt:383)");
            }
            String strD = qVar.d();
            com.waze.z.a.a.a aVar = f41853b;
            int i3 = b.f41869a;
            com.waze.z.a.a.h.h(strD, false, false, null, 0L, null, aVar, b.f(), ComposableLambdaKt.rememberComposableLambda(498484495, true, new com.waze.main_screen.c.d.a(qVar, 15), composer, 54), null, composer, 113246640, 0, DisplayStrings.DS_NAVIGATION_SETTINGS_AVOID_DANGEROUS_AREAS);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final void o(final v vVar, final h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        h.g.b.x.f(vVar, "uiState");
        h.g.b.x.f(lVar, "callback");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(599289139);
        if (i5 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(vVar) : composerStartRestartGroup.changedInstance(vVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(599289139, i3, -1, "com.waze.ui.voices.VoiceSettingsScreen (VoiceSettingsScreen.kt:203)");
            }
            ScaffoldState scaffoldStateRememberScaffoldState = ScaffoldKt.rememberScaffoldState(null, null, composerStartRestartGroup, 0, 3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final MutableState mutableState4 = (MutableState) objRememberedValue4;
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            final Toast toastMakeText = Toast.makeText((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), com.waze.ui.r.a.c.c.b(R.string.VOICE_PROMPT_CANT_SHARE_NOT_UPLOADED, composerStartRestartGroup, 0), 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            long jH = com.waze.bz.a.d(composerStartRestartGroup, 0).h();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1380503864, true, new com.waze.main_screen.o(lVar, 7), composerStartRestartGroup, 54);
            int i6 = b.f41869a;
            h.g.a.q qVarI = b.i();
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(538087793, true, new h.g.a.q() { // from class: com.waze.ui.af.z
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj3).intValue();
                    return ap.m(vVar, lVar, toastMakeText, softwareKeyboardController, mutableState4, mutableState, mutableState2, mutableState3, (PaddingValues) obj, (Composer) obj2, iIntValue);
                }
            }, composerStartRestartGroup, 54);
            composer2 = composerStartRestartGroup;
            i4 = 4;
            ScaffoldKt.m4175Scaffold27mzLpw(modifierFillMaxSize$default, scaffoldStateRememberScaffoldState, composableLambdaRememberComposableLambda, null, qVarI, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jH, 0L, composableLambdaRememberComposableLambda2, composer2, 24966, 12582912, 98280);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            i4 = 4;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.a.b.a(vVar, lVar, i2, i4));
        }
    }

    static final h.ab q(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        D(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab r(String str, int i2, Composer composer) {
        E(str, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab s(h.g.a.a aVar, h.g.a.a aVar2, int i2, Composer composer) {
        F(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab t(int i2, Composer composer) {
        G(composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab u(q qVar, int i2, boolean z, boolean z2, boolean z3, h.g.a.a aVar, int i3, Composer composer) {
        H(qVar, i2, z, z2, z3, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return h.ab.f48028a;
    }

    static final h.ab v(Modifier modifier, String str, int i2, Composer composer) {
        I(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }
}
