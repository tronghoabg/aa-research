package com.waze.ui.ae;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import com.bumptech.glide.e.i;
import com.waze.R;
import com.waze.design_components.button.g;
import com.waze.main_screen.o;
import com.waze.strings.DisplayStrings;
import com.waze.ui.ac.f;
import com.waze.web.r;
import com.waze.z.a.b.n;
import com.waze.z.a.c.h;
import com.waze.z.a.c.q;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static void b(String str, Modifier modifier, Composer composer, int i2) {
        int i3;
        String str2;
        Modifier modifier2;
        Painter painter;
        x.f(str, "url");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1549310400);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed((Object) null) ? 128 : 256;
        }
        int i5 = i3;
        int i6 = 3;
        if (composerStartRestartGroup.shouldExecute((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1549310400, i5, -1, "com.waze.ui.utils.NetworkImage (NetworkImage.kt:49)");
            }
            int i7 = (i5 & 14) | 48;
            x.f(str, "url");
            composerStartRestartGroup.startReplaceGroup(54884165);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(54884165, i7, -1, "com.waze.ui.utils.loadPicture (NetworkImage.kt:18)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            i iVarA = i.a();
            x.e(iVarA, "centerCropTransform(...)");
            if (((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
                painter = null;
                str2 = str;
            } else {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                c cVar = new c(mutableState);
                int i8 = i7 & 14;
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | (((i8 ^ 6) > 4 && composerStartRestartGroup.changed(str)) || (i7 & 6) == 4) | composerStartRestartGroup.changedInstance(iVarA) | composerStartRestartGroup.changedInstance(cVar);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    com.waze.ui.r.a.a.i iVar = new com.waze.ui.r.a.a.i(context, str, iVarA, cVar, 3);
                    str2 = str;
                    composerStartRestartGroup.updateRememberedValue(iVar);
                    objRememberedValue2 = iVar;
                } else {
                    str2 = str;
                }
                EffectsKt.DisposableEffect(str2, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, i8);
                painter = (Painter) mutableState.getValue();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composerStartRestartGroup.endReplaceGroup();
            }
            if (painter != null) {
                composerStartRestartGroup.startReplaceGroup(-1787388990);
                modifier2 = modifier;
                ImageKt.Image(painter, (String) null, modifier2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i5 >> 3) & 112) | Painter.$stable | ((i5 << 3) & DisplayStrings.DS_TAP_TO_VERIFY), 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier2 = modifier;
                composerStartRestartGroup.startReplaceGroup(-1787327486);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str2 = str;
            modifier2 = modifier;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.a.b.a(str2, modifier2, i2, i6));
        }
    }

    public static void c(h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, String str, String str2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        String strD;
        x.f(aVar, "dismiss");
        x.f(aVar2, "onPrimaryAction");
        x.f(aVar3, "onSecondaryAction");
        x.f(str, "venueName");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2096095812);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2096095812, i3, -1, "com.waze.ui.venue_freshness.UpdateVenueLocationPopupDialog (VenueFreshnessPopupDialogUI.kt:29)");
            }
            com.waze.z.a.c.d dVar = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.VENUE_FRESHNESS_POPUP_CONFIRM_BUTTON, composerStartRestartGroup, 0), n.e(null, null, null, 7), false, null, 12);
            com.waze.z.a.c.d dVar2 = new com.waze.z.a.c.d(com.waze.ui.r.a.c.c.b(R.string.VENUE_FRESHNESS_POPUP_CANCEL_BUTTON, composerStartRestartGroup, 0), n.e(g.f23359b, null, null, 6), false, null, 12);
            h hVar = new h(new f(R.drawable.icon_tier3_venue_info_96px), null, com.waze.z.a.c.i.f45844b, 14);
            String str3 = str2;
            if (str3 == null || str3.length() == 0) {
                composerStartRestartGroup.startReplaceGroup(-259867635);
                strD = com.waze.ui.r.a.c.c.d(R.string.VENUE_FRESHNESS_POPUP_MESSAGE_NO_ADDRESS_PS, new Object[]{str}, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-260017613);
                strD = com.waze.ui.r.a.c.c.d(R.string.VENUE_FRESHNESS_POPUP_MESSAGE_WITH_ADDRESS_PS_PS, new Object[]{str, str2}, composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str4 = strD;
            String strB = com.waze.ui.r.a.c.c.b(R.string.VENUE_FRESHNESS_POPUP_TITLE, composerStartRestartGroup, 0);
            com.waze.z.a.c.a aVar4 = new com.waze.z.a.c.a(dVar, dVar2);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(dVar) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(dVar2);
            boolean z = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z | z2) || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.z.a.c.l(dVar, aVar2, dVar2, aVar3, aVar, 8);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composer2 = composerStartRestartGroup;
            q.f(strB, aVar4, null, hVar, null, (p) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(1697811505, true, new o(str4, 6), composerStartRestartGroup, 54), composer2, 1572864, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.a.b(aVar, aVar2, aVar3, str, str2, i2, 11));
        }
    }

    public static void d(Object obj, List list) {
        r.f(obj, "Set contributions cannot be null");
        list.add(obj);
    }
}
