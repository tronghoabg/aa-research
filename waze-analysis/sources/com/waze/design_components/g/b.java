package com.waze.design_components.g;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.waze.c.e.t;
import com.waze.location.q;
import com.waze.strings.DisplayStrings;
import com.waze.ui.a.l;
import com.waze.ui.ac.i;
import com.waze.ui.ac.n;
import com.waze.z.a.am;
import com.waze.z.a.ar;
import com.waze.z.a.be;
import com.waze.z.a.e;
import com.waze.z.a.f;
import com.waze.z.a.g.s;
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b {
    public /* synthetic */ b(byte[] bArr) {
    }

    private static TextStyle a(com.waze.z.a.c cVar, Composer composer, int i2) {
        TextStyle textStyleJ;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1652995219, i2, -1, "com.waze.design_components_compose.components.toStyle (Badge.kt:328)");
        }
        if (cVar == com.waze.z.a.c.f45821g) {
            composer.startReplaceGroup(609497429);
            textStyleJ = com.waze.bz.a.h(composer).n();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(609498614);
            textStyleJ = com.waze.bz.a.h(composer).j();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyleJ;
    }

    public static int c(Context context, int i2) {
        x.f(context, "<this>");
        return h.h.a.b(i2 * context.getResources().getDisplayMetrics().density);
    }

    public static com.waze.shared_infra.o.a d(View view) {
        x.f(view, "<this>");
        if (!view.isInEditMode()) {
            return com.waze.shared_infra.o.b.a();
        }
        Context context = view.getContext();
        x.e(context, "getContext(...)");
        return new a(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012a  */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v55 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(final java.lang.String r52, com.waze.z.a.c r53, androidx.compose.ui.Modifier r54, com.waze.ui.ac.i r55, boolean r56, com.waze.ui.ac.i r57, java.lang.String r58, java.lang.String r59, com.waze.z.a.v r60, h.g.a.a r61, androidx.compose.runtime.Composer r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 2032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.design_components.g.b.e(java.lang.String, com.waze.z.a.c, androidx.compose.ui.Modifier, com.waze.ui.ac.i, boolean, com.waze.ui.ac.i, java.lang.String, java.lang.String, com.waze.z.a.v, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static void f(com.waze.z.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        String strO;
        x.f(aVar, "definition");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-675606727);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? composerStartRestartGroup.changed(aVar) : composerStartRestartGroup.changedInstance(aVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-675606727, i3, -1, "com.waze.design_components_compose.components.Badge (Badge.kt:97)");
            }
            String strO2 = l.o(aVar.e(), composerStartRestartGroup, 0);
            i iVarB = aVar.b();
            boolean zG = aVar.g();
            i iVarC = aVar.c();
            n nVarF = aVar.f();
            String strO3 = null;
            if (nVarF == null) {
                composerStartRestartGroup.startReplaceGroup(1707245015);
                composerStartRestartGroup.endReplaceGroup();
                strO = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(1707245016);
                strO = l.o(nVarF, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            n nVarD = aVar.d();
            if (nVarD == null) {
                composerStartRestartGroup.startReplaceGroup(1707299575);
            } else {
                composerStartRestartGroup.startReplaceGroup(1707299576);
                strO3 = l.o(nVarD, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            e(strO2, aVar.a(), modifier, iVarB, zG, iVarC, strO3, strO, null, null, composerStartRestartGroup, (i3 << 3) & DisplayStrings.DS_TAP_TO_VERIFY, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new t(aVar, modifier, i2, 10));
        }
    }

    public static void g(List list, Composer composer, int i2, int i3) {
        int i4;
        x.f(list, "badges");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1095982860);
        int i6 = 1;
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changedInstance(list) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed((Object) null) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1095982860, i4, -1, "com.waze.design_components_compose.components.BadgePack (Badge.kt:209)");
            }
            FlowLayoutKt.FlowRow(null, Arrangement.INSTANCE.m2440spacedBy0680j_4(8.0f), Arrangement.INSTANCE.getCenter(), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-109328849, true, new com.waze.ads.c.a(list, 6), composerStartRestartGroup, 54), composerStartRestartGroup, 1573296, 57);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.z.a.b.i(list, i2, i3, i6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(final h.g.a.a r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, com.waze.z.a.am r23, com.waze.z.a.ar r24, com.waze.z.a.g.s r25, boolean r26, com.waze.ui.r.a.d.c r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.design_components.g.b.h(h.g.a.a, java.lang.String, androidx.compose.ui.Modifier, com.waze.z.a.am, com.waze.z.a.ar, com.waze.z.a.g.s, boolean, com.waze.ui.r.a.d.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.waze.design_components.button.e, com.waze.design_components.button.f, com.waze.design_components.button.g] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.waze.design_components.button.e, com.waze.design_components.button.f, com.waze.design_components.button.g] */
    /* JADX WARN: Type inference failed for: r10v6 */
    public static void i(final h.g.a.a aVar, final h.g.a.a aVar2, final String str, final String str2, final q qVar, Modifier modifier, am amVar, ar arVar, s sVar, boolean z, am amVar2, ar arVar2, s sVar2, boolean z2, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier.Companion companion;
        am amVar3;
        ar arVar3;
        s sVar3;
        int i6;
        int i7;
        final am amVar4;
        final ar arVar4;
        final s sVar4;
        final boolean z3;
        Composer composer2;
        final am amVar5;
        final ar arVar5;
        final boolean z4;
        final s sVar5;
        final Modifier modifier2;
        int i8;
        ?? r0;
        am amVarD;
        ar arVarE;
        int i9;
        s sVarF;
        boolean z5;
        ?? r10;
        am amVarD2;
        ar arVarE2;
        s sVarF2;
        boolean z6;
        ar arVar6;
        s sVar6;
        am amVar6;
        int i10;
        Modifier modifier3;
        s sVar7;
        ar arVar7;
        Modifier modifier4;
        am amVar7;
        ar arVar8;
        s sVar8;
        boolean z7;
        ar arVar9;
        s sVar9;
        am amVar8;
        boolean z8;
        int i11;
        x.f(aVar, "firstOnClick");
        x.f(aVar2, "secondOnClick");
        x.f(str, "firstText");
        x.f(str2, "secondText");
        x.f(qVar, "callToActionBarProperties");
        int i12 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1895473843);
        if (i12 == 0) {
            i5 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changed(qVar) ? 8192 : 16384;
        }
        int i13 = i4 & 32;
        if (i13 != 0) {
            i5 |= 196608;
            companion = modifier;
        } else {
            companion = modifier;
            if ((i2 & 196608) == 0) {
                i5 |= true != composerStartRestartGroup.changed(companion) ? 65536 : 131072;
            }
        }
        if ((1572864 & i2) == 0) {
            if ((i4 & 64) == 0) {
                amVar3 = amVar;
                int i14 = composerStartRestartGroup.changed(amVar3) ? 1048576 : 524288;
                i5 |= i14;
            } else {
                amVar3 = amVar;
            }
            i5 |= i14;
        } else {
            amVar3 = amVar;
        }
        if ((i2 & 12582912) == 0) {
            if ((i4 & 128) == 0) {
                arVar3 = arVar;
                int i15 = composerStartRestartGroup.changed(arVar3) ? 8388608 : 4194304;
                i5 |= i15;
            } else {
                arVar3 = arVar;
            }
            i5 |= i15;
        } else {
            arVar3 = arVar;
        }
        if ((i2 & 100663296) == 0) {
            if ((i4 & 256) == 0) {
                sVar3 = sVar;
                if (composerStartRestartGroup.changed(sVar3)) {
                    i11 = 67108864;
                }
                i5 |= i11;
            } else {
                sVar3 = sVar;
            }
            i11 = GroupFlagsKt.HasAuxSlotFlag;
            i5 |= i11;
        } else {
            sVar3 = sVar;
        }
        int i16 = i4 & 512;
        boolean z9 = i16 == 0;
        if (i16 != 0) {
            i5 |= 805306368;
        } else if ((i2 & 805306368) == 0) {
            i5 |= true != composerStartRestartGroup.changed(z) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i6 = (((i4 & 1024) == 0 && composerStartRestartGroup.changed(amVar2)) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= ((i4 & 2048) == 0 && composerStartRestartGroup.changed(arVar2)) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= ((i4 & 4096) == 0 && composerStartRestartGroup.changed(sVar2)) ? 256 : 128;
        }
        int i17 = i4 & 8192;
        if (i17 != 0) {
            i6 |= DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS;
            i7 = i17;
        } else {
            i7 = i17;
            if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
                i6 |= true == composerStartRestartGroup.changed(z2) ? 2048 : 1024;
            }
        }
        if (composerStartRestartGroup.shouldExecute(((306783379 & i5) == 306783378 && (i6 & DisplayStrings.DS_DONT_SHOW_AGAIN) == 1170) ? false : true, i5 & 1)) {
            int i18 = i4 & 4096;
            int i19 = i4 & 2048;
            int i20 = i4 & 1024;
            int i21 = i4 & 256;
            int i22 = i4 & 128;
            int i23 = i4 & 64;
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i13 != 0) {
                    companion = Modifier.Companion;
                }
                if (i23 != 0) {
                    i5 &= -3670017;
                    amVarD = com.waze.z.a.b.n.d(null, 7);
                    i8 = i22;
                    r0 = 0;
                } else {
                    i8 = i22;
                    r0 = 0;
                    amVarD = amVar3;
                }
                if (i8 != 0) {
                    arVarE = com.waze.z.a.b.n.e(r0, r0, r0, 7);
                    i5 &= -29360129;
                } else {
                    arVarE = arVar3;
                }
                if (i21 != 0) {
                    i9 = (-234881025) & i5;
                    sVarF = com.waze.z.a.b.n.f();
                } else {
                    i9 = i5;
                    sVarF = sVar3;
                }
                z5 = (!z9) | z;
                if (i20 != 0) {
                    i6 &= -15;
                    r10 = 0;
                    amVarD2 = com.waze.z.a.b.n.d(null, 7);
                } else {
                    r10 = 0;
                    amVarD2 = amVar2;
                }
                if (i19 != 0) {
                    arVarE2 = com.waze.z.a.b.n.e(r10, r10, r10, 7);
                    i6 &= -113;
                } else {
                    arVarE2 = arVar2;
                }
                if (i18 != 0) {
                    i6 &= -897;
                    sVarF2 = com.waze.z.a.b.n.f();
                } else {
                    sVarF2 = sVar2;
                }
                if (i7 != 0) {
                    arVar6 = arVarE2;
                    sVar6 = sVarF2;
                    amVar6 = amVarD;
                    z6 = true;
                } else {
                    z6 = z2;
                    arVar6 = arVarE2;
                    sVar6 = sVarF2;
                    amVar6 = amVarD;
                }
                i10 = i9;
                modifier3 = companion;
                sVar7 = sVarF;
                arVar7 = arVarE;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i23 != 0) {
                    i5 &= -3670017;
                }
                if (i22 != 0) {
                    i5 &= -29360129;
                }
                if (i21 != 0) {
                    i5 &= -234881025;
                }
                if (i20 != 0) {
                    i6 &= -15;
                }
                if (i19 != 0) {
                    i6 &= -113;
                }
                if (i18 != 0) {
                    i6 &= -897;
                }
                amVarD2 = amVar2;
                arVar6 = arVar2;
                sVar6 = sVar2;
                z6 = z2;
                i10 = i5;
                modifier3 = companion;
                sVar7 = sVar3;
                amVar6 = amVar3;
                arVar7 = arVar3;
                z5 = z;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1895473843, i10, i6, "com.waze.design_components_compose.components.CallToActionBar (CallToActionBar.kt:70)");
            }
            if (qVar instanceof com.waze.z.a.d) {
                int i24 = i6 << 9;
                int i25 = i10 >> 3;
                int i26 = i10 >> 9;
                int i27 = i10 & DisplayStrings.DS_TAP_TO_VERIFY;
                int i28 = i10 & 14;
                int i29 = i24 & 3670016;
                int i30 = i24 & 458752;
                int i31 = i24 & 57344;
                int i32 = i24 & 7168;
                int i33 = i25 & DisplayStrings.DS_TAP_TO_VERIFY;
                int i34 = i25 & 14;
                int i35 = i26 & 3670016;
                int i36 = i26 & 458752;
                int i37 = i26 & 57344;
                int i38 = i26 & 7168;
                composerStartRestartGroup.startReplaceGroup(2127055659);
                am amVar9 = amVar6;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
                int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
                Modifier modifier5 = modifier3;
                h.g.a.a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
                ar arVar10 = arVar7;
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
                Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                com.waze.z.a.d dVar = (com.waze.z.a.d) qVar;
                modifier4 = modifier5;
                be.o(aVar, com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance, SizeKt.m2811requiredHeight3ABfNKs(Modifier.Companion, 48.0f), dVar.a(), false, 2, null), com.waze.ui.r.a.d.c.ci, null), str, amVar9, arVar10, sVar7, z5, true, composerStartRestartGroup, i28 | 12582912 | i27 | i38 | i37 | i36 | i35, 0);
                amVar7 = amVar9;
                arVar8 = arVar10;
                sVar8 = sVar7;
                z7 = z5;
                SpacerKt.Spacer(SizeKt.m2827width3ABfNKs(Modifier.Companion, 8.0f), composerStartRestartGroup, 6);
                arVar9 = arVar6;
                sVar9 = sVar6;
                amVar8 = amVarD2;
                z8 = z6;
                be.o(aVar2, com.waze.ui.r.a.d.d.a(RowScope.CC.weight$default(rowScopeInstance, SizeKt.m2811requiredHeight3ABfNKs(Modifier.Companion, 48.0f), dVar.b(), false, 2, null), com.waze.ui.r.a.d.c.cj, null), str2, amVar8, arVar9, sVar9, z8, true, composerStartRestartGroup, i34 | 12582912 | i33 | i32 | i31 | i30 | i29, 0);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceGroup();
            } else {
                modifier4 = modifier3;
                amVar7 = amVar6;
                arVar8 = arVar7;
                sVar8 = sVar7;
                z7 = z5;
                if (x.n(qVar, f.f46033a)) {
                    int i39 = i6 << 9;
                    int i40 = i10 >> 3;
                    int i41 = i10 >> 9;
                    int i42 = i10 & DisplayStrings.DS_TAP_TO_VERIFY;
                    int i43 = i39 & 3670016;
                    int i44 = i39 & 458752;
                    int i45 = i39 & 57344;
                    int i46 = i39 & 7168;
                    int i47 = i40 & DisplayStrings.DS_TAP_TO_VERIFY;
                    int i48 = i41 & 3670016;
                    int i49 = i41 & 458752;
                    int i50 = i41 & 57344;
                    int i51 = i41 & 7168;
                    int i52 = (i10 & 14) | 48;
                    int i53 = (i40 & 14) | 48;
                    composerStartRestartGroup.startReplaceGroup(2128188337);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
                    int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                    h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    be.o(aVar, com.waze.ui.r.a.d.d.a(SizeKt.m2811requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 48.0f), com.waze.ui.r.a.d.c.ci, null), str, amVar7, arVar8, sVar8, z7, false, composerStartRestartGroup, i52 | i42 | i51 | i50 | i49 | i48, 128);
                    SpacerKt.Spacer(SizeKt.m2808height3ABfNKs(Modifier.Companion, 12.0f), composerStartRestartGroup, 6);
                    int i54 = i53 | i47 | i46 | i45 | i44 | i43;
                    arVar9 = arVar6;
                    sVar9 = sVar6;
                    amVar8 = amVarD2;
                    z8 = z6;
                    be.o(aVar2, com.waze.ui.r.a.d.d.a(SizeKt.m2811requiredHeight3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 48.0f), com.waze.ui.r.a.d.c.cj, null), str2, amVar8, arVar9, sVar9, z8, false, composerStartRestartGroup, i54, 128);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!x.n(qVar, e.f46015a)) {
                        composerStartRestartGroup.startReplaceGroup(484255633);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new h.i();
                    }
                    int i55 = i6 << 9;
                    int i56 = i10 >> 3;
                    int i57 = i10 >> 9;
                    int i58 = i10 & DisplayStrings.DS_TAP_TO_VERIFY;
                    int i59 = i55 & 3670016;
                    int i60 = i55 & 458752;
                    int i61 = i55 & 57344;
                    int i62 = i55 & 7168;
                    int i63 = i56 & DisplayStrings.DS_TAP_TO_VERIFY;
                    int i64 = i57 & 3670016;
                    int i65 = i57 & 458752;
                    int i66 = i57 & 57344;
                    int i67 = i57 & 7168;
                    int i68 = (i10 & 14) | 48;
                    int i69 = (i56 & 14) | 48;
                    composerStartRestartGroup.startReplaceGroup(2129159877);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composerStartRestartGroup, 48);
                    int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
                    h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
                    Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
                    Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
                    Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    be.o(aVar, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.ci, null), str, amVar7, arVar8, sVar8, z7, false, composerStartRestartGroup, i68 | i58 | i67 | i66 | i65 | i64, 128);
                    int i70 = i69 | i63 | i62 | i61 | i60 | i59;
                    arVar9 = arVar6;
                    sVar9 = sVar6;
                    amVar8 = amVarD2;
                    z8 = z6;
                    be.o(aVar2, com.waze.ui.r.a.d.d.a(PaddingKt.m2759paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 8.0f, 0.0f, 0.0f, 0.0f, 14, null), com.waze.ui.r.a.d.c.cj, null), str2, amVar8, arVar9, sVar9, z8, false, composerStartRestartGroup, i70, 128);
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            arVar4 = arVar9;
            sVar4 = sVar9;
            z3 = z8;
            composer2 = composerStartRestartGroup;
            modifier2 = modifier4;
            amVar5 = amVar7;
            arVar5 = arVar8;
            sVar5 = sVar8;
            z4 = z7;
            amVar4 = amVar8;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            amVar4 = amVar2;
            arVar4 = arVar2;
            sVar4 = sVar2;
            z3 = z2;
            composer2 = composerStartRestartGroup;
            amVar5 = amVar3;
            arVar5 = arVar3;
            z4 = z;
            sVar5 = sVar3;
            modifier2 = companion;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: com.waze.z.a.g
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    h.g.a.a aVar3 = aVar;
                    h.g.a.a aVar4 = aVar2;
                    String str3 = str;
                    String str4 = str2;
                    com.waze.location.q qVar2 = qVar;
                    Modifier modifier6 = modifier2;
                    am amVar10 = amVar5;
                    ar arVar11 = arVar5;
                    com.waze.z.a.g.s sVar10 = sVar5;
                    boolean z10 = z4;
                    am amVar11 = amVar4;
                    ar arVar12 = arVar4;
                    com.waze.z.a.g.s sVar11 = sVar4;
                    int i71 = i2;
                    com.waze.design_components.g.b.i(aVar3, aVar4, str3, str4, qVar2, modifier6, amVar10, arVar11, sVar10, z10, amVar11, arVar12, sVar11, z3, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i71 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    return h.ab.f48028a;
                }
            });
        }
    }

    private b() {
        throw null;
    }
}
