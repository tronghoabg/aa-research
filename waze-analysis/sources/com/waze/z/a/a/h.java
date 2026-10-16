package com.waze.z.a.a;

import android.support.v4.app.ar;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.waze.gas.GasNativeManager;
import com.waze.location.q;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import l.a.bgb;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class h {
    /* JADX WARN: Removed duplicated region for block: B:104:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final java.lang.String r19, androidx.compose.ui.Modifier r20, boolean r21, boolean r22, long r23, final com.waze.z.a.a.a r25, final h.g.a.a r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.a.h.a(java.lang.String, androidx.compose.ui.Modifier, boolean, boolean, long, com.waze.z.a.a.a, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void b(String str, String str2, Modifier modifier, a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        a aVar3;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str2, "addText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1857969942);
        if ((i2 & 6) == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(false) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(true) ? 8192 : 16384;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            aVar3 = aVar;
            i4 |= true != composerStartRestartGroup.changed(aVar3) ? 524288 : 1048576;
        } else {
            aVar3 = aVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i4) != 4793490, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1857969942, i4, -1, "com.waze.design_components_compose.components.action_cell.ActionCellAdd (ActionCell.kt:217)");
            }
            int i5 = i4 >> 6;
            a aVar4 = aVar3;
            h(str, false, true, modifier, 0L, aVar2, aVar4, null, ComposableLambdaKt.rememberComposableLambda(813641992, true, new com.waze.ads.c.a(str2, 10), composerStartRestartGroup, 54), null, composerStartRestartGroup, (i4 & 14) | 100663296 | (i5 & 112) | (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 << 3) & 7168) | (i5 & 458752) | (3670016 & i4), (i4 >> 15) & 14, DisplayStrings.DS_CONFIRM);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, str2, modifier, aVar, aVar2, i2, 0));
        }
    }

    public static void c(String str, boolean z, h.g.a.a aVar, Modifier modifier, boolean z2, a aVar2, Composer composer, int i2) {
        int i3;
        Modifier modifier2;
        boolean z3;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(aVar, "onRadioClick");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1508828861);
        int i5 = 1;
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            modifier2 = modifier;
            i3 |= true != composerStartRestartGroup.changed(modifier2) ? 1024 : 2048;
        } else {
            modifier2 = modifier;
        }
        int i6 = i3 | 1794048;
        if ((i2 & 12582912) == 0) {
            i6 |= true != composerStartRestartGroup.changed(aVar2) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i6) != 4793490, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1508828861, i6, -1, "com.waze.design_components_compose.components.action_cell.ActionCellRadio (ActionCell.kt:336)");
            }
            h(str, false, true, modifier2, 0L, aVar, aVar2, ComposableLambdaKt.rememberComposableLambda(2017489402, true, new g(z, aVar, i5), composerStartRestartGroup, 54), null, null, composerStartRestartGroup, 12582912 | (i6 & 14) | ((i6 >> 12) & 112) | ((i6 >> 6) & DisplayStrings.DS_TAP_TO_VERIFY) | (i6 & 7168) | (458752 & (i6 << 9)) | (3670016 & (i6 >> 3)), (i6 >> 18) & 14, DisplayStrings.DS_SAVE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z3 = true;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            z3 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.main_screen.p.b(str, z, aVar, modifier, z3, aVar2, i2, 1));
        }
    }

    public static void d(String str, String str2, Modifier modifier, a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        a aVar3;
        x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        x.f(str2, "selectionText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1725544267);
        if ((i2 & 6) == 0) {
            i3 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(false) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changed(true) ? 8192 : 16384;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i2) == 0) {
            aVar3 = aVar;
            i4 |= true != composerStartRestartGroup.changed(aVar3) ? 524288 : 1048576;
        } else {
            aVar3 = aVar;
        }
        if ((12582912 & i2) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 4194304 : 8388608;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i4) != 4793490, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1725544267, i4, -1, "com.waze.design_components_compose.components.action_cell.ActionCellSelection (ActionCell.kt:246)");
            }
            int i5 = i4 >> 6;
            a aVar4 = aVar3;
            h(str, false, true, modifier, 0L, aVar2, aVar4, null, ComposableLambdaKt.rememberComposableLambda(-794965059, true, new com.waze.ads.c.a(str2, 11), composerStartRestartGroup, 54), null, composerStartRestartGroup, (i4 & 14) | 100663296 | (i5 & 112) | (i5 & DisplayStrings.DS_TAP_TO_VERIFY) | ((i4 << 3) & 7168) | (i5 & 458752) | (3670016 & i4), (i4 >> 15) & 14, DisplayStrings.DS_CONFIRM);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(str, str2, modifier, aVar, aVar2, i2, 2));
        }
    }

    public static h.f e(ar arVar) {
        x.f(arVar, "fragment");
        return h.g.a(new com.waze.aa.a(org.a.b.b.d.a(arVar), arVar, 0));
    }

    public static bgb f(com.waze.destination_cell.c.c cVar) {
        x.f(cVar, "<this>");
        com.waze.av.b.i iVar = com.waze.av.b.i.f15955a;
        com.waze.destination_cell.c.b bVar = com.waze.destination_cell.c.b.f23525a;
        com.waze.destination_cell.c.a aVar = com.waze.destination_cell.c.a.f23513a;
        com.waze.destination_cell.c.c cVar2 = com.waze.destination_cell.c.c.f23531a;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return bgb.CLICK;
        }
        if (iOrdinal == 1) {
            return bgb.LONG_PRESS;
        }
        if (iOrdinal == 2) {
            return bgb.OPTIONS_FROM_SWIPE;
        }
        throw new h.i();
    }

    public static q g(String str) {
        x.f(str, "descriptionText");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-4581188, 48, -1, "com.waze.design_components_compose.components.action_cell.DescriptionData.Companion.create (DescriptionData.kt:39)");
        }
        x.f(str, "descriptionText");
        i iVar = new i(str);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(final java.lang.String r29, final boolean r30, final boolean r31, androidx.compose.ui.Modifier r32, long r33, h.g.a.a r35, com.waze.z.a.a.a r36, h.g.a.p r37, h.g.a.q r38, com.waze.location.q r39, androidx.compose.runtime.Composer r40, final int r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.a.h.h(java.lang.String, boolean, boolean, androidx.compose.ui.Modifier, long, h.g.a.a, com.waze.z.a.a.a, h.g.a.p, h.g.a.q, com.waze.location.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static h.ab i(boolean r33, com.waze.z.a.a.a r34, h.g.a.p r35, h.g.a.q r36, java.lang.String r37, long r38, boolean r40, com.waze.location.q r41, androidx.compose.foundation.layout.RowScope r42, androidx.compose.runtime.Composer r43, int r44) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.a.h.i(boolean, com.waze.z.a.a.a, h.g.a.p, h.g.a.q, java.lang.String, long, boolean, com.waze.location.q, androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, int):h.ab");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(java.lang.String r21, boolean r22, h.g.a.l r23, androidx.compose.ui.Modifier r24, boolean r25, com.waze.location.q r26, com.waze.z.a.a.a r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.z.a.a.h.j(java.lang.String, boolean, h.g.a.l, androidx.compose.ui.Modifier, boolean, com.waze.location.q, com.waze.z.a.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    static ab k(q qVar, int i2, Composer composer) {
        l(qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    private static void l(final q qVar, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1396712535);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(qVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1396712535, i3, -1, "com.waze.design_components_compose.components.action_cell.Description (ActionCell.kt:383)");
            }
            TextKt.m4275Text4IGK_g(qVar.i(), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.w, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (l<? super TextLayoutResult, ab>) null, com.waze.bz.a.h(composerStartRestartGroup).c(), composerStartRestartGroup, 48, 0, 65532);
            composer2 = composerStartRestartGroup;
            if (qVar instanceof j) {
                throw null;
            }
            composer2.startReplaceGroup(180759609);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.z.a.a.f
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return h.k(qVar, i2, (Composer) obj);
                }
            });
        }
    }
}
