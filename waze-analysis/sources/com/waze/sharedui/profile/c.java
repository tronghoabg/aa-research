package com.waze.sharedui.profile;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.media3.common.util.WavUtil;
import com.waze.R;
import com.waze.bw.c.d.a.ca;
import com.waze.bw.c.d.a.cb;
import com.waze.bw.c.d.a.cg;
import com.waze.bw.c.d.cw;
import com.waze.bw.c.d.da;
import com.waze.bw.c.d.db;
import com.waze.bw.c.d.dc;
import com.waze.copilot.an;
import com.waze.copilot.aq;
import com.waze.copilot.d;
import com.waze.copilot.data.ag;
import com.waze.copilot.data.ah;
import com.waze.design_components.button.e;
import com.waze.design_components.button.g;
import com.waze.gas.GasNativeManager;
import com.waze.jni.protos.network.TransactionQueueId;
import com.waze.navigate.location_preview.k;
import com.waze.shared_infra.i.h;
import com.waze.sharedui.f.q;
import com.waze.sharedui.utils.f;
import com.waze.strings.DisplayStrings;
import com.waze.t.b.bz;
import com.waze.z.a.b.n;
import com.waze.z.a.s;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.i;
import h.n.o;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {
    public static final q a(TransactionQueueId transactionQueueId) {
        x.f(transactionQueueId, "<this>");
        TransactionQueueId transactionQueueId2 = TransactionQueueId.General;
        q qVar = q.f38922a;
        switch (transactionQueueId) {
            case General:
                return q.f38922a;
            case Routing:
                return q.f38923b;
            case Background:
                return q.f38925d;
            case Register:
                return q.f38926e;
            case DriveSuggestions:
                return q.f38927f;
            case GeoConfig:
                return q.f38928g;
            case Username:
                return q.f38929h;
            case RoutingUpdate:
                return q.f38924c;
            case UNRECOGNIZED:
                Objects.toString(transactionQueueId);
                h.c("invalid transaction queue: ".concat(String.valueOf(transactionQueueId)));
                return q.f38922a;
            default:
                throw new i();
        }
    }

    public static /* synthetic */ String b(int i2) {
        return i2 != 1 ? i2 != 2 ? "null" : "GOOGLE_ASSISTANT" : "DICTATION";
    }

    public static final ag c(an anVar) {
        x.f(anVar, "<this>");
        String id = anVar.getId();
        x.e(id, "getId(...)");
        int version = anVar.getVersion();
        String name = anVar.getName();
        x.e(name, "getName(...)");
        aq voiceType = anVar.getVoiceType();
        x.e(voiceType, "getVoiceType(...)");
        ah ahVarJ = bz.j(voiceType);
        com.waze.copilot.b downloadable = anVar.getDownloadable();
        x.e(downloadable, "getDownloadable(...)");
        com.waze.copilot.data.a aVarG = bz.g(downloadable);
        d preview = anVar.getPreview();
        x.e(preview, "getPreview(...)");
        com.waze.copilot.data.b bVarH = bz.h(preview);
        String description = anVar.getDescription();
        x.e(description, "getDescription(...)");
        String lang = anVar.getLang();
        x.e(lang, "getLang(...)");
        String locale = anVar.getLocale();
        x.e(locale, "getLocale(...)");
        return new ag(id, version, name, description, lang, locale, aVarG, bVarH, ahVarJ, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.waze.bw.c.d.cw r38, boolean r39, com.waze.bw.c.d.dh r40, h.g.a.l r41, androidx.compose.runtime.Composer r42, int r43) {
        /*
            Method dump skipped, instructions count: 1079
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.profile.c.d(com.waze.bw.c.d.cw, boolean, com.waze.bw.c.d.dh, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public static final void e(cw cwVar, dc dcVar, boolean z, l lVar, Composer composer, int i2) {
        int i3;
        x.f(cwVar, "wazeUIDrive");
        x.f(dcVar, "upcomingUIDriveType");
        x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1644852769);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cwVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(dcVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1644852769, i3, -1, "com.waze.startstate.mobile.ui.options.UpcomingCellOptionsMenu (UpcomingCellOptionsMenu.kt:20)");
            }
            if (dcVar instanceof da) {
                int i5 = i3 >> 3;
                int i6 = i5 & 14;
                composerStartRestartGroup.startReplaceGroup(-526650841);
                da daVar = (da) dcVar;
                if (daVar.d()) {
                    composerStartRestartGroup.startReplaceGroup(-526596498);
                    f(daVar, z, cwVar.a().b(), lVar, composerStartRestartGroup, (i3 & 7168) | (i5 & 126));
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-526373298);
                    f.n(daVar, lVar, composerStartRestartGroup, ((i3 >> 6) & 112) | i6);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(dcVar instanceof db)) {
                    composerStartRestartGroup.startReplaceGroup(-155538529);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new i();
                }
                composerStartRestartGroup.startReplaceGroup(-526164079);
                d(cwVar, z, cwVar.a().b(), lVar, composerStartRestartGroup, (i3 & 14) | ((i3 >> 3) & 112) | (i3 & 7168));
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.c.b.b(cwVar, dcVar, z, lVar, i2, 8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.waze.bw.c.d.da r39, boolean r40, com.waze.bw.c.d.dh r41, h.g.a.l r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedui.profile.c.f(com.waze.bw.c.d.da, boolean, com.waze.bw.c.d.dh, h.g.a.l, androidx.compose.runtime.Composer, int):void");
    }

    public static /* synthetic */ ab g(MutableState mutableState, String str) {
        x.f(str, "it");
        o(mutableState, str);
        return ab.f48028a;
    }

    public static /* synthetic */ ab h(MutableState mutableState) {
        o(mutableState, "");
        return ab.f48028a;
    }

    public static final void i(String str, String str2, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str2, "description");
        x.f(aVar, "onCancel");
        x.f(aVar2, "onRemove");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1106628315);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1106628315, i3, -1, "com.waze.startstate.mobile.ui.options.RemoveDestinationDialog (StartStateOptionsMenu.kt:271)");
            }
            com.waze.z.a.c.a aVar3 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_REMOVE_BUTTON, composerStartRestartGroup, 0), n.e(g.f23358a, null, e.f23350b, 2), false, null, 12), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DESTINATION_REMOVE_DIALOG_CANCEL_BUTTON, composerStartRestartGroup, 0), n.e(g.f23359b, null, null, 6), false, null, 12));
            boolean z = (i3 & 7168) == 2048;
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.l.g(aVar2, aVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.c.q.c(str, aVar3, (com.waze.z.a.c.g) objRememberedValue, aVar, null, ComposableLambdaKt.rememberComposableLambda(1461821974, true, new com.waze.z.a.c.n(str2, 12), composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 196608 | ((i3 << 3) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b((Object) str, (Object) str2, (Object) aVar, (Object) aVar2, i2, 14));
        }
    }

    public static final void j(AnnotatedString annotatedString, Modifier modifier, Composer composer, int i2) {
        int i3;
        Composer composer2;
        x.f(annotatedString, "annotatedString");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1316690771);
        if (i4 == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changed(annotatedString) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316690771, i3, -1, "com.waze.startstate.mobile.ui.options.OptionsMenuFooter (StartStateOptionsMenu.kt:406)");
            }
            composer2 = composerStartRestartGroup;
            TextKt.m4276TextIbK3jfQ(annotatedString, com.waze.ui.r.a.d.d.a(PaddingKt.m2756paddingVpY3zN4(modifier, 16.0f, 28.0f), com.waze.ui.r.a.d.c.ax, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer2, i3 & 14, 0, 262140);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(annotatedString, modifier, i2, 12, null));
        }
    }

    public static final AnnotatedString k(int i2, int i3, h.g.a.a aVar, Composer composer) {
        String strD;
        x.f(aVar, "onParameterTextClicked");
        int i4 = 0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1060246587, 0, -1, "com.waze.startstate.mobile.ui.options.optionsMenuFooterText (StartStateOptionsMenu.kt:423)");
        }
        composer.startReplaceGroup(-989713866);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(i4, 1, null);
        String strB = com.waze.ui.r.a.c.c.b(i2, composer, 0);
        String strB2 = com.waze.ui.r.a.c.c.b(i3, composer, 0);
        int iX = o.X(strB, "%s", 0, false, 6);
        if (iX == -1) {
            composer.startReplaceGroup(-310746559);
            composer.endReplaceGroup();
            iX = strB.length() + 1;
            strD = strB + " " + strB2;
        } else {
            composer.startReplaceGroup(-310639485);
            strD = com.waze.ui.r.a.c.c.d(i2, new Object[]{strB2}, composer);
            composer.endReplaceGroup();
        }
        int iPushStyle = builder.pushStyle(SpanStyle.m10478copyGSF8kmg$default(com.waze.bz.a.h(composer).c().toSpanStyle(), com.waze.bz.a.d(composer, 0).q(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
        try {
            String str = strD;
            builder.append((CharSequence) str, 0, iX);
            builder.pop(iPushStyle);
            TextLinkStyles textLinkStyles = new TextLinkStyles(SpanStyle.m10478copyGSF8kmg$default(com.waze.bz.a.h(composer).c().toSpanStyle(), com.waze.bz.a.d(composer, 0).G(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null), null, null, null, 14, null);
            boolean zChanged = composer.changed(aVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new cg(aVar, i4);
                composer.updateRememberedValue(objRememberedValue);
            }
            int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("", textLinkStyles, (LinkInteractionListener) objRememberedValue));
            try {
                builder.append((CharSequence) str, iX, strB2.length() + iX);
                builder.pop(iPushLink);
                iPushStyle = builder.pushStyle(SpanStyle.m10478copyGSF8kmg$default(com.waze.bz.a.h(composer).c().toSpanStyle(), com.waze.bz.a.d(composer, 0).q(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, null));
                try {
                    builder.append((CharSequence) str, iX + strB2.length(), strD.length());
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    return annotatedString;
                } finally {
                }
            } catch (Throwable th) {
                builder.pop(iPushLink);
                throw th;
            }
        } finally {
        }
    }

    public static final void l(String str, int i2, Modifier modifier, h.g.a.a aVar, Composer composer, int i3) {
        int i4;
        Modifier modifier2;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(aVar, "onClick");
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-83025875);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(i2) ? 16 : 32;
        }
        int i6 = i4 | 384;
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i6 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i6 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i6 & 1)) {
            Modifier.Companion companion = Modifier.Companion;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-83025875, i6, -1, "com.waze.startstate.mobile.ui.options.OptionCell (StartStateOptionsMenu.kt:393)");
            }
            com.waze.z.a.a.h.a(str, com.waze.ui.r.a.d.d.a(companion, com.waze.ui.r.a.d.c.aw, null), false, false, 0L, new com.waze.z.a.a.a(new com.waze.ui.ac.b(i2), (s) null, 6), aVar, composerStartRestartGroup, (i6 & 14) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION | ((i6 << 12) & 29360128), 80);
            DividerKt.m4060DivideroMI9zvI(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.bz.a.d(composerStartRestartGroup, 0).K(), 0.0f, 16.0f, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new k(str, i2, modifier2, aVar, i3, 2));
        }
    }

    public static final void m(String str, String str2, h.g.a.a aVar, l lVar, Composer composer, int i2) {
        String str3;
        String strB;
        x.f(str2, "initialName");
        x.f(aVar, "onCancel");
        x.f(lVar, "onSave");
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-161550531);
        int i4 = i3 == 0 ? i2 | 2 : i2;
        int i5 = 1;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            int i6 = i4 & (-15);
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                strB = com.waze.ui.r.a.c.c.b(R.string.ADD_FAVORITES_POP_UP_TITLE, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                strB = str;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161550531, i6, -1, "com.waze.startstate.mobile.ui.options.SaveDestinationDialog (StartStateOptionsMenu.kt:311)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            com.waze.z.a.c.a aVar2 = new com.waze.z.a.c.a(new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.DONE, composerStartRestartGroup, 0), n.e(g.f23358a, null, null, 6), !o.G(a.a.i(mutableState)), null, 8), new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.CANCEL, composerStartRestartGroup, 0), n.e(g.f23359b, null, null, 6), false, null, 12), true);
            boolean z = (i4 & 7168) == 2048;
            boolean z2 = (i4 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z | z2) || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.ui.aa.b(lVar, aVar, mutableState, i5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            str3 = strB;
            com.waze.z.a.c.q.c(str3, aVar2, (com.waze.z.a.c.g) objRememberedValue2, aVar, null, ComposableLambdaKt.rememberComposableLambda(667936878, true, new com.waze.z.a.c.n(mutableState, 11), composerStartRestartGroup, 54), composerStartRestartGroup, 196608 | ((i6 << 3) & 7168), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.closure.d.b(str3, str2, aVar, lVar, i2, 15));
        }
    }

    public static final void n(com.waze.tide.s sVar, l lVar, Composer composer, int i2) {
        int i3;
        x.f(sVar, "state");
        x.f(lVar, "callback");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(656815695);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(sVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(656815695, i3, -1, "com.waze.startstate.mobile.ui.options.StartStateOptionsMenu (StartStateOptionsMenu.kt:236)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Modifier.Companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), true, null, false, 12, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (sVar instanceof com.waze.bw.c.d.a.bz) {
                int i5 = (i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY;
                composerStartRestartGroup.startReplaceGroup(-1614460831);
                com.waze.bw.c.d.a.bz bzVar = (com.waze.bw.c.d.a.bz) sVar;
                com.waze.sharedui.e.e.l(bzVar.b(), bzVar.c(), lVar, composerStartRestartGroup, i5);
                composerStartRestartGroup.endReplaceGroup();
            } else if (sVar instanceof cb) {
                composerStartRestartGroup.startReplaceGroup(-1614239243);
                cb cbVar = (cb) sVar;
                e(cbVar.a(), cbVar.b(), cbVar.c(), lVar, composerStartRestartGroup, (i3 << 6) & 7168);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                int i6 = i3;
                if (!(sVar instanceof ca)) {
                    composerStartRestartGroup.startReplaceGroup(-1437554196);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new i();
                }
                int i7 = (i6 << 3) & DisplayStrings.DS_TAP_TO_VERIFY;
                composerStartRestartGroup.startReplaceGroup(-1613982594);
                ca caVar = (ca) sVar;
                com.waze.sharedui.f.n.f(caVar.a(), caVar.b(), lVar, composerStartRestartGroup, i7);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(sVar, lVar, i2, 13));
        }
    }

    private static final void o(MutableState mutableState, String str) {
        mutableState.setValue(str);
    }
}
