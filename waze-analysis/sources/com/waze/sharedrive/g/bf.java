package com.waze.sharedrive.g;

import android.content.Context;
import android.content.res.Configuration;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.core.os.EnvironmentCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.media3.common.C;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.waze.R;
import com.waze.gas.GasNativeManager;
import com.waze.reports_v2.presentation.bq;
import com.waze.sharedrive.e.bx;
import com.waze.sharedrive.e.by;
import com.waze.sharedrive.e.bz;
import com.waze.sharedrive.e.ca;
import com.waze.sharedrive.e.cb;
import com.waze.strings.DisplayStrings;
import com.waze.ui.l.bh;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf {
    public static final com.waze.sharedrive.c.a.l A(com.waze.sharedrive.d.q qVar) {
        Object next;
        h.g.b.x.f(qVar, "<this>");
        Iterator it = ((com.waze.sharedrive.c.a.m) qVar.a().b()).d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((com.waze.sharedrive.c.a.l) next).f()) {
                break;
            }
        }
        return (com.waze.sharedrive.c.a.l) next;
    }

    public static final /* synthetic */ com.waze.sharedrive.c.a.m B(com.waze.sharedrive.d.p pVar) {
        com.waze.sharedrive.d.o oVarA = pVar.a();
        if (oVarA instanceof com.waze.sharedrive.d.m) {
            return ((com.waze.sharedrive.d.m) oVarA).a();
        }
        if (oVarA instanceof com.waze.sharedrive.d.n) {
            return ((com.waze.sharedrive.d.n) oVarA).a();
        }
        if (oVarA instanceof com.waze.sharedrive.d.k) {
            return ((com.waze.sharedrive.d.k) oVarA).b();
        }
        if (oVarA instanceof com.waze.sharedrive.d.l) {
            return ((com.waze.sharedrive.d.l) oVarA).a();
        }
        return null;
    }

    public static final com.waze.sharedrive.c.a.m C(com.waze.sharedrive.d.o oVar) {
        h.g.b.x.f(oVar, "<this>");
        if (oVar instanceof com.waze.sharedrive.d.m) {
            return ((com.waze.sharedrive.d.m) oVar).a();
        }
        if (oVar instanceof com.waze.sharedrive.d.n) {
            return ((com.waze.sharedrive.d.n) oVar).a();
        }
        if (oVar instanceof com.waze.sharedrive.d.k) {
            return ((com.waze.sharedrive.d.k) oVar).b();
        }
        if (oVar instanceof com.waze.sharedrive.d.l) {
            return ((com.waze.sharedrive.d.l) oVar).a();
        }
        if ((oVar instanceof com.waze.sharedrive.d.j) || (oVar instanceof com.waze.sharedrive.d.i)) {
            return null;
        }
        throw new h.i();
    }

    public static final /* synthetic */ com.waze.sharedrive.d.p D(com.waze.sharedrive.d.r rVar) {
        if (rVar instanceof com.waze.sharedrive.d.p) {
            return (com.waze.sharedrive.d.p) rVar;
        }
        if (rVar instanceof com.waze.sharedrive.d.q) {
            return ((com.waze.sharedrive.d.q) rVar).b();
        }
        return null;
    }

    public static final /* synthetic */ com.waze.sharedrive.d.r E(com.waze.sharedrive.d.r rVar, com.waze.sharedrive.d.p pVar) {
        return rVar instanceof com.waze.sharedrive.d.q ? com.waze.sharedrive.d.q.d((com.waze.sharedrive.d.q) rVar, null, false, pVar, 3) : pVar;
    }

    public static final /* synthetic */ String F(com.waze.sharedrive.d.r rVar) {
        if (rVar == null) {
            return "null";
        }
        if (!(rVar instanceof com.waze.sharedrive.d.q)) {
            Class<?> cls = rVar.getClass();
            int i2 = h.g.b.ar.f48106a;
            String strC = new h.g.b.m(cls).c();
            return strC == null ? EnvironmentCompat.MEDIA_UNKNOWN : strC;
        }
        com.waze.sharedrive.d.p pVarB = ((com.waze.sharedrive.d.q) rVar).b();
        StringBuilder sb = new StringBuilder("LiveDrive (");
        sb.append(pVarB != null ? JsonPOJOBuilder.DEFAULT_WITH_PREFIX : "without");
        sb.append(" pending)");
        return sb.toString();
    }

    private static final void G(final String str, final String str2, final com.waze.ui.r.a.d.c cVar, final com.waze.ui.r.a.d.c cVar2, Composer composer, final int i2) {
        String str3;
        int i3;
        Composer composer2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1427676067);
        if (i4 == 0) {
            str3 = str;
            i3 = (true != composerStartRestartGroup.changed(str3) ? 2 : 4) | i2;
        } else {
            str3 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cVar == null ? -1 : cVar.ordinal()) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changed(cVar2 == null ? -1 : cVar2.ordinal()) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427676067, i3, -1, "com.waze.sharedrive.ui.SheetHeader (ShareDrivePreviewSheet.kt:181)");
            }
            String str4 = str3;
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(str4, com.waze.ui.r.a.d.d.b(Modifier.Companion, cVar), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).f(), composer2, i3 & 14, 0, 65528);
            TextKt.m4275Text4IGK_g(str2, com.waze.ui.r.a.d.d.b(PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 0.0f, 4.0f, 0.0f, 0.0f, 13, null), cVar2), com.waze.bz.a.d(composerStartRestartGroup, 0).q(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).n(), composer2, (i3 >> 3) & 14, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.sharedrive.g.ao
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return bf.e(str, str2, cVar, cVar2, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void H(cb cbVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, Composer composer, int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1496617501);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(cbVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1496617501, i3, -1, "com.waze.sharedrive.ui.ShareDriveOverlayContent (ShareDriveOverlay.kt:30)");
            }
            if (cbVar instanceof bx) {
                composerStartRestartGroup.startReplaceGroup(-323266401);
                w(((bx) cbVar).a(), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (cbVar instanceof bz) {
                composerStartRestartGroup.startReplaceGroup(-323151205);
                r(((bz) cbVar).a(), aVar4, composerStartRestartGroup, (i3 >> 9) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else if (cbVar instanceof ca) {
                composerStartRestartGroup.startReplaceGroup(-322969638);
                bh.i(aVar2, aVar3, composerStartRestartGroup, (i3 >> 6) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else if (cbVar instanceof by) {
                composerStartRestartGroup.startReplaceGroup(-322819784);
                bh.j(((by) cbVar).a(), aVar, composerStartRestartGroup, i3 & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (cbVar != null) {
                    composerStartRestartGroup.startReplaceGroup(-564618661);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(-322732829);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new l(cbVar, aVar, aVar2, aVar3, aVar4, i2, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aa I(State state) {
        return (aa) state.getValue();
    }

    private static final void J(com.waze.main_screen.l.b.j jVar, h.g.a.l lVar, Composer composer, int i2) {
        int i3;
        com.waze.main_screen.l.b.j jVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1661285989);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(jVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 16 : 32;
        }
        int i5 = 0;
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1661285989, i3, -1, "com.waze.sharedrive.ui.LiveShareInstructionsList (LiveShareScreen.kt:181)");
            }
            int i6 = i3 & 112;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.r.d(lVar, 11);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            h.g.a.l lVar2 = (h.g.a.l) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i6 == 32 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.r.d(lVar, 12);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            jVar2 = jVar;
            com.waze.main_screen.l.b.c.c(jVar2, null, lVar2, (h.g.a.l) objRememberedValue2, composerStartRestartGroup, i3 & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            jVar2 = jVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(jVar2, lVar, i2, i5));
        }
    }

    private static final void K(final com.waze.main_screen.p.b.a.b.t tVar, Composer composer, final int i2) {
        int i3;
        Color colorM8218boximpl;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-254134092);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(tVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-254134092, i3, -1, "com.waze.sharedrive.ui.LiveShareNavigationBar (LiveShareScreen.kt:163)");
            }
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 6);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentHeight$default);
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
            if (((Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).orientation == 1) {
                composerStartRestartGroup.startReplaceGroup(1535055605);
                long jC = com.waze.bz.a.d(composerStartRestartGroup, 0).c();
                composerStartRestartGroup.endReplaceGroup();
                colorM8218boximpl = Color.m8218boximpl(jC);
            } else {
                composerStartRestartGroup.startReplaceGroup(342100147);
                composerStartRestartGroup.endReplaceGroup();
                colorM8218boximpl = null;
            }
            com.waze.main_screen.aa.c.b(colorM8218boximpl, composerStartRestartGroup, 0);
            com.waze.main_screen.p.b.a.a.c.c(tVar, SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), com.waze.main_screen.p.b.a.b.k.f27118a, composerStartRestartGroup, (i3 & 14) | DisplayStrings.DS_DIRT_ROADS);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.sharedrive.g.w
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    return bf.n(tVar, i2, (Composer) obj);
                }
            });
        }
    }

    private static final void L(com.waze.ui.p.i iVar, aa aaVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.l lVar2, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, Composer composer, int i2) {
        com.waze.ui.p.i iVar2;
        int i3;
        aa aaVar2;
        h.g.a.l lVar3;
        h.g.a.a aVar6;
        int i4;
        Composer composer2;
        int i5;
        ComposableLambda composableLambdaRememberComposableLambda;
        ComposableLambda composableLambda;
        int i6;
        ComposableLambda composableLambdaRememberComposableLambda2;
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1611269168);
        if (i7 == 0) {
            iVar2 = iVar;
            i3 = (true != composerStartRestartGroup.changed(iVar2) ? 2 : 4) | i2;
        } else {
            iVar2 = iVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            aaVar2 = aaVar;
            i3 |= true != composerStartRestartGroup.changed(aaVar2) ? 16 : 32;
        } else {
            aaVar2 = aaVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            lVar3 = lVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar3) ? 8192 : 16384;
        } else {
            lVar3 = lVar2;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 524288 : 1048576;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 4194304 : 8388608;
        }
        if ((100663296 & i2) == 0) {
            aVar6 = aVar5;
            i4 = 12582912;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar6) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        } else {
            aVar6 = aVar5;
            i4 = 12582912;
        }
        if (composerStartRestartGroup.shouldExecute((38347923 & i3) != 38347922, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1611269168, i3, -1, "com.waze.sharedrive.ui.LiveShareScreenImpl (LiveShareScreen.kt:133)");
            }
            int i8 = i3 & DisplayStrings.DS_TAP_TO_VERIFY;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i8 == 256 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bk.f(lVar, 18);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BackHandlerKt.BackHandler(false, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 1);
            if (aaVar2.f()) {
                composerStartRestartGroup.startReplaceGroup(765698698);
                bh.i(aVar2, aVar3, composerStartRestartGroup, (i3 >> 15) & 126);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(765798642);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.ui.z.d dVarB = aaVar2.b();
            com.waze.ui.z.f fVarC = aaVar2.c();
            z zVarA = aaVar2.a();
            com.waze.main_screen.p.b.a.b.t tVarB = zVarA != null ? zVarA.b() : null;
            if (tVarB == null) {
                composerStartRestartGroup.startReplaceGroup(766258154);
                composerStartRestartGroup.endReplaceGroup();
                i5 = i3;
                composableLambdaRememberComposableLambda = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(766258155);
                i5 = i3;
                composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-410719061, true, new com.waze.z.a.c.n(tVarB, 7), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
            }
            z zVarA2 = aaVar.a();
            com.waze.main_screen.l.b.j jVarA = zVarA2 != null ? zVarA2.a() : null;
            if (jVarA == null) {
                composerStartRestartGroup.startReplaceGroup(766453857);
                composerStartRestartGroup.endReplaceGroup();
                composableLambda = composableLambdaRememberComposableLambda;
                i6 = 1;
                composableLambdaRememberComposableLambda2 = null;
            } else {
                composerStartRestartGroup.startReplaceGroup(766453858);
                composableLambda = composableLambdaRememberComposableLambda;
                i6 = 1;
                composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(69420225, true, new com.waze.parking.f(jVarA, lVar, 7, null), composerStartRestartGroup, 54);
                composerStartRestartGroup.endReplaceGroup();
            }
            ComposableLambda composableLambda2 = composableLambdaRememberComposableLambda2;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, i6, null);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i8 == 256 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.bk.f(lVar, 19);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i9 = i5 << 3;
            composer2 = composerStartRestartGroup;
            com.waze.ui.z.as.t(dVarB, fVarC, iVar2, (h.g.a.a) objRememberedValue2, aVar, composableLambda, composableLambda2, modifierFillMaxSize$default, lVar3, aVar6, aVar4, composer2, ((i5 << 6) & DisplayStrings.DS_TAP_TO_VERIFY) | i4 | (i9 & 57344) | ((i5 << 12) & 234881024) | (i9 & C.ENCODING_PCM_DOUBLE), (i5 >> 21) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new u(iVar, aaVar, lVar, aVar, lVar2, aVar2, aVar3, aVar4, aVar5, i2, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t M(State state) {
        return (t) state.getValue();
    }

    private static final void N(t tVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, Composer composer, int i2) {
        t tVar2;
        int i3;
        h.g.a.l lVar2;
        h.g.a.a aVar4;
        String strB;
        String strD;
        h.g.a.a aVar5 = aVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-44651447);
        if (i4 == 0) {
            tVar2 = tVar;
            i3 = (true != composerStartRestartGroup.changed(tVar2) ? 2 : 4) | i2;
        } else {
            tVar2 = tVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            lVar2 = lVar;
            i3 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 128 : 256;
        } else {
            lVar2 = lVar;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            aVar4 = aVar3;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        } else {
            aVar4 = aVar3;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-44651447, i3, -1, "com.waze.sharedrive.ui.JoinSharePreviewSheetContent (JoinSharePreviewSheet.kt:74)");
            }
            s sVarA = tVar2.a();
            if (sVarA instanceof n) {
                composerStartRestartGroup.startReplaceGroup(1228906652);
                com.waze.ui.ai.b(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_LOADER_TEXT, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new l(tVar2, aVar, lVar2, aVar5, aVar4, i2, 1));
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1228996025);
            composerStartRestartGroup.endReplaceGroup();
            if (sVarA instanceof m) {
                composerStartRestartGroup.startReplaceGroup(1229058335);
                bh.j(((m) sVarA).a(), aVar5, composerStartRestartGroup, (i3 >> 6) & 112);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new l(tVar, aVar, lVar, aVar5, aVar3, i2, 0));
                    return;
                }
                return;
            }
            composerStartRestartGroup.startReplaceGroup(1229144825);
            composerStartRestartGroup.endReplaceGroup();
            if (tVar.b().a().size() > 1) {
                composerStartRestartGroup.startReplaceGroup(1229207724);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_GROUP_DRIVE_TITLE, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1229289688);
                strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_TITLE, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str = strB;
            ah ahVar = (ah) h.a.i.R(tVar.b().a());
            String strC = tVar.c();
            String strF = null;
            if (strC == null) {
                composerStartRestartGroup.startReplaceGroup(1229476896);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1229476897);
                if (tVar.b().a().size() > 1) {
                    composerStartRestartGroup.startReplaceGroup(-753859386);
                    strD = com.waze.ui.r.a.c.c.d(R.string.SHARE_DRIVE_JOIN_PREVIEW_SUBTITLE_MULTIPLE_PARTICIPANTS_PS_PD, new Object[]{strC, Integer.valueOf(tVar.b().a().size())}, composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-753672673);
                    am amVarA = ahVar != null ? ahVar.a() : null;
                    if (amVarA == null) {
                        composerStartRestartGroup.startReplaceGroup(-753627693);
                    } else {
                        composerStartRestartGroup.startReplaceGroup(806973422);
                        strF = f(amVarA, false, composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (strF == null) {
                        strF = "";
                    }
                    strD = com.waze.ui.r.a.c.c.d(R.string.SHARE_DRIVE_JOIN_PREVIEW_SUBTITLE_SINGLE_PARTICIPANT_PS_PS, new Object[]{strC, strF}, composerStartRestartGroup);
                    composerStartRestartGroup.endReplaceGroup();
                }
                strF = strD;
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dz, null);
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_CANCEL_BUTTON, composerStartRestartGroup, 0);
            String strB3 = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_JOIN_PREVIEW_VIEW_BUTTON, composerStartRestartGroup, 0);
            com.waze.ui.r.a.d.c cVar = com.waze.ui.r.a.d.c.dA;
            com.waze.ui.r.a.d.c cVar2 = com.waze.ui.r.a.d.c.dB;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.settings.ao(14);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            int i5 = i3;
            d(str, strF == null ? "" : strF, strB2, strB3, (h.g.a.a) objRememberedValue, aVar, aVar3, modifierA, cVar, cVar2, ComposableLambdaKt.rememberComposableLambda(-329480781, true, new com.waze.z.a.g.u(tVar, ahVar, lVar, 9, (byte[]) null), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 12) & 458752) | 918577152 | ((i3 << 6) & 3670016), 6, 0);
            if (sVarA instanceof p) {
                composerStartRestartGroup.startReplaceGroup(1231525191);
                com.waze.ui.ai.b(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_LOADER_TEXT, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                aVar5 = aVar2;
            } else if (sVarA instanceof o) {
                composerStartRestartGroup.startReplaceGroup(1231667946);
                aVar5 = aVar2;
                bh.j(((o) sVarA).a(), aVar5, composerStartRestartGroup, (i5 >> 6) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                aVar5 = aVar2;
                composerStartRestartGroup.startReplaceGroup(1231743865);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new l(tVar, aVar, lVar, aVar5, aVar3, i2, 2));
        }
    }

    private static final void O(final k kVar, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, final h.g.a.a aVar4, final h.g.a.a aVar5, Composer composer, final int i2) {
        int i3;
        h.g.a.a aVar6;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-326669958);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(kVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            aVar6 = aVar2;
            i3 |= true != composerStartRestartGroup.changedInstance(aVar6) ? 128 : 256;
        } else {
            aVar6 = aVar2;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar4) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar5) ? 65536 : 131072;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-326669958, i3, -1, "com.waze.sharedrive.ui.CreateSharePreviewSheetContent (CreateSharePreviewSheet.kt:85)");
            }
            if (kVar.b() == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final int i5 = 0;
                    final h.g.a.a aVar7 = aVar6;
                    scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.sharedrive.g.d
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            if (i5 != 0) {
                                ((Integer) obj2).intValue();
                                int i6 = i2;
                                h.g.a.a aVar8 = aVar5;
                                h.g.a.a aVar9 = aVar4;
                                h.g.a.a aVar10 = aVar3;
                                h.g.a.a aVar11 = aVar7;
                                h.g.a.a aVar12 = aVar;
                                return bf.y(kVar, aVar12, aVar11, aVar10, aVar9, aVar8, i6, (Composer) obj);
                            }
                            ((Integer) obj2).intValue();
                            int i7 = i2;
                            h.g.a.a aVar13 = aVar5;
                            h.g.a.a aVar14 = aVar4;
                            h.g.a.a aVar15 = aVar3;
                            h.g.a.a aVar16 = aVar7;
                            h.g.a.a aVar17 = aVar;
                            return bf.x(kVar, aVar17, aVar16, aVar15, aVar14, aVar13, i7, (Composer) obj);
                        }
                    });
                    return;
                }
                return;
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
            int i6 = i3 & 458752;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 131072 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.r.d(aVar5, 10);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (h.g.a.l) objRememberedValue, composerStartRestartGroup, 0);
            com.waze.z.a.f.e eVarD = com.waze.z.a.e.b.d(composerStartRestartGroup);
            String strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_MESSAGE_TEXT, composerStartRestartGroup, 0);
            j jVarA = kVar.a();
            if (jVarA instanceof i) {
                composerStartRestartGroup.startReplaceGroup(571914302);
                i iVar = (i) jVarA;
                com.waze.ui.z.as.a(h.n.o.ac(h.n.o.ac(h.n.o.ac(strB, "<LINK>", iVar.c()), "<ADDRESS>", iVar.a()), "<ETA>", iVar.b()), aVar3, composerStartRestartGroup, (i3 >> 6) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else if (jVarA instanceof g) {
                composerStartRestartGroup.startReplaceGroup(572221109);
                bh.j(((g) jVarA).a(), aVar4, composerStartRestartGroup, (i3 >> 9) & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else if (h.g.b.x.n(jVarA, f.f38708a)) {
                composerStartRestartGroup.startReplaceGroup(572353262);
                com.waze.ui.ai.b(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_LOADER_TEXT, composerStartRestartGroup, 0), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!h.g.b.x.n(jVarA, h.f38710a)) {
                    composerStartRestartGroup.startReplaceGroup(-397195392);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new h.i();
                }
                composerStartRestartGroup.startReplaceGroup(572521158);
                composerStartRestartGroup.endReplaceGroup();
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), com.waze.ui.r.a.d.c.dr, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierA);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String strB2 = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_TITLE, composerStartRestartGroup, 0);
            String strC = kVar.c();
            if (strC == null) {
                composerStartRestartGroup.startReplaceGroup(738476225);
                strC = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_UNNAMED_ROAD, composerStartRestartGroup, 0);
            } else {
                composerStartRestartGroup.startReplaceGroup(738475574);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strD = com.waze.ui.r.a.c.c.d(R.string.SHARE_DRIVE_PREVIEW_DESTINATION_PS, new Object[]{strC}, composerStartRestartGroup);
            String strB3 = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_CANCEL_BUTTON, composerStartRestartGroup, 0);
            String strB4 = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_SHARE_BUTTON, composerStartRestartGroup, 0);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.settings.ao(13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i7 = i3 << 12;
            d(strB2, strD, strB3, strB4, (h.g.a.a) objRememberedValue2, aVar, aVar2, null, com.waze.ui.r.a.d.c.ds, com.waze.ui.r.a.d.c.dt, ComposableLambdaKt.rememberComposableLambda(1572917534, true, new com.waze.z.a.g.u(kVar, context, managedActivityResultLauncherRememberLauncherForActivityResult, 7), composerStartRestartGroup, 54), composerStartRestartGroup, (i7 & 3670016) | (i7 & 458752) | 905994240, 6, 128);
            com.waze.z.a.e.b.c(eVarD, WindowInsetsPadding_androidKt.navigationBarsPadding(boxScopeInstance.align(Modifier.Companion, Alignment.Companion.getBottomCenter())), composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final int i8 = 1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new h.g.a.p() { // from class: com.waze.sharedrive.g.d
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    if (i8 != 0) {
                        ((Integer) obj2).intValue();
                        int i62 = i2;
                        h.g.a.a aVar8 = aVar5;
                        h.g.a.a aVar9 = aVar4;
                        h.g.a.a aVar10 = aVar3;
                        h.g.a.a aVar11 = aVar2;
                        h.g.a.a aVar12 = aVar;
                        return bf.y(kVar, aVar12, aVar11, aVar10, aVar9, aVar8, i62, (Composer) obj);
                    }
                    ((Integer) obj2).intValue();
                    int i72 = i2;
                    h.g.a.a aVar13 = aVar5;
                    h.g.a.a aVar14 = aVar4;
                    h.g.a.a aVar15 = aVar3;
                    h.g.a.a aVar16 = aVar2;
                    h.g.a.a aVar17 = aVar;
                    return bf.x(kVar, aVar17, aVar16, aVar15, aVar14, aVar13, i72, (Composer) obj);
                }
            });
        }
    }

    private static final void P(h.g.a.a aVar, Modifier modifier, Composer composer, int i2) {
        int i3;
        int i4;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-4086634);
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(aVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(modifier) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-4086634, i3, -1, "com.waze.sharedrive.ui.EditButton (CreateSharePreviewSheet.kt:183)");
            }
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(com.waze.design_components.d.b.h(OffsetKt.m2714offsetVpY3zN4(modifier, -10.0f, 10.0f), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(32.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), null, 2, null);
            int i6 = i3 & 14;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (i6 == 4 || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.bk.f(aVar, 15);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM2756paddingVpY3zN4 = PaddingKt.m2756paddingVpY3zN4(com.waze.z.a.be.J(modifierM1972backgroundbw27NRU$default, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 15), 12.0f, 8.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2756paddingVpY3zN4);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            i4 = 1;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_PREVIEW_EDIT_BUTTON, composerStartRestartGroup, 0), (Modifier) null, com.waze.bz.a.d(composerStartRestartGroup, 0).G(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).j(), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i4 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new v(aVar, modifier, i2, i4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.waze.sharedrive.g.ah r17, h.g.a.q r18, androidx.compose.runtime.Composer r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.g.bf.b(com.waze.sharedrive.g.ah, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final h.ab c(Modifier modifier, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, String str, String str2, h.g.a.q qVar, String str3, String str4, com.waze.ui.r.a.d.c cVar, com.waze.ui.r.a.d.c cVar2, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1051669663, i2, -1, "com.waze.sharedrive.ui.ShareDrivePreviewSheet.<anonymous> (ShareDrivePreviewSheet.kt:123)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
            Modifier modifierM1972backgroundbw27NRU$default = BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), com.waze.bz.a.d(composer, 0).h(), null, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
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
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new com.waze.settings.ao(15);
                composer.updateRememberedValue(objRememberedValue);
            }
            com.waze.z.a.b.y.e((h.g.a.a) objRememberedValue, composer, 6);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(columnScopeInstance.weight(Modifier.Companion, 1.0f, false), scrollStateRememberScrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierVerticalScroll$default);
            h.g.a.a<ComposeUiNode> constructor2 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy2, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 16.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM2759paddingqDBjuR0$default);
            h.g.a.a<ComposeUiNode> constructor3 = ComposeUiNode.Companion.getConstructor();
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Updater.m7351setimpl(composer, measurePolicyColumnMeasurePolicy3, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composer, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composer, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composer, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composer, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            G(str3, str4, cVar, cVar2, composer, 0);
            composer.endNode();
            qVar.invoke(columnScopeInstance2, composer, 6);
            composer.endNode();
            if (scrollStateRememberScrollState.getCanScrollForward()) {
                composer.startReplaceGroup(405317293);
                BoxKt.Box(BackgroundKt.m1972backgroundbw27NRU$default(SizeKt.m2808height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 1.0f), com.waze.bz.a.d(composer, 0).K(), null, 2, null), composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(405513337);
                composer.endReplaceGroup();
            }
            Modifier modifierM2759paddingqDBjuR0$default2 = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 16.0f, 16.0f, 2, null);
            com.waze.z.a.d dVarG = com.waze.z.a.b.n.g(2.0f, 1);
            com.waze.z.a.ar arVarE = com.waze.z.a.b.n.e(com.waze.design_components.button.g.f23359b, null, null, 6);
            boolean zChanged = composer.changed(aVar) | composer.changed(aVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new com.waze.search.h.az(aVar, aVar2, 8);
                composer.updateRememberedValue(objRememberedValue2);
            }
            com.waze.design_components.g.b.i((h.g.a.a) objRememberedValue2, aVar3, str, str2, dVarG, modifierM2759paddingqDBjuR0$default2, null, arVarE, null, false, null, null, null, false, composer, 196608, 0, 16192);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static final void d(final String str, final String str2, final String str3, final String str4, final h.g.a.a aVar, final h.g.a.a aVar2, final h.g.a.a aVar3, Modifier modifier, final com.waze.ui.r.a.d.c cVar, final com.waze.ui.r.a.d.c cVar2, final h.g.a.q qVar, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        final Modifier modifier2;
        int i6;
        Composer composer2;
        ay ayVar;
        h.g.b.x.f(str, GasNativeManager.KEY_GAS_PRICE_UPDATE_TITLE);
        h.g.b.x.f(str2, "subtitle");
        h.g.b.x.f(str3, "cancelButtonText");
        h.g.b.x.f(str4, "actionButtonText");
        h.g.b.x.f(aVar, "onCancel");
        h.g.b.x.f(aVar2, "onAction");
        h.g.b.x.f(aVar3, "onDismiss");
        h.g.b.x.f(qVar, "previewContent");
        int i7 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1908158452);
        if (i7 == 0) {
            i5 = (true != composerStartRestartGroup.changed(str) ? 2 : 4) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str2) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str3) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i5 |= true != composerStartRestartGroup.changed(str4) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changedInstance(aVar3) ? 524288 : 1048576;
        }
        int i8 = i4 & 128;
        if (i8 != 0) {
            i5 |= 12582912;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i2 & 12582912) == 0) {
                i5 |= true != composerStartRestartGroup.changed(modifier2) ? 4194304 : 8388608;
            }
        }
        if ((100663296 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changed(cVar == null ? -1 : cVar.ordinal()) ? GroupFlagsKt.HasAuxSlotFlag : 67108864;
        }
        if ((805306368 & i2) == 0) {
            i5 |= true != composerStartRestartGroup.changed(cVar2 != null ? cVar2.ordinal() : -1) ? 268435456 : 536870912;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (true != composerStartRestartGroup.changedInstance(qVar) ? 2 : 4);
        } else {
            i6 = i3;
        }
        int i9 = 0;
        if (composerStartRestartGroup.shouldExecute(((i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true, i5 & 1)) {
            final Modifier.Companion companion = i8 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1908158452, i5, i6, "com.waze.sharedrive.ui.ShareDrivePreviewSheet (ShareDrivePreviewSheet.kt:97)");
            }
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, com.waze.z.a.aa.c(com.waze.z.a.y.f46211a), null, true, composerStartRestartGroup, DisplayStrings.DS_AAOS_SOUND_OFF, 4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(h.c.k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            kotlinx.coroutines.af afVar = (kotlinx.coroutines.af) objRememberedValue;
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar3, composerStartRestartGroup, (i5 >> 18) & 14);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ap(afVar, modalBottomSheetStateRememberModalBottomSheetState, i9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final h.g.a.a aVar4 = (h.g.a.a) objRememberedValue2;
            boolean zIsVisible = modalBottomSheetStateRememberModalBottomSheetState.isVisible();
            boolean zChanged = composerStartRestartGroup.changed(aVar4);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new bq(aVar4, 9);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            BackHandlerKt.BackHandler(zIsVisible, (h.g.a.a) objRememberedValue3, composerStartRestartGroup, 0, 0);
            h.ab abVar = h.ab.f48028a;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                ayVar = new ay(modalBottomSheetStateRememberModalBottomSheetState, null, 1, null);
                composerStartRestartGroup.updateRememberedValue(ayVar);
            } else {
                ayVar = objRememberedValue4;
            }
            EffectsKt.LaunchedEffect(abVar, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) ayVar, composerStartRestartGroup, 6);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changed(stateRememberUpdatedState);
            ax axVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || axVarRememberedValue == Composer.Companion.getEmpty()) {
                axVarRememberedValue = new ax(modalBottomSheetStateRememberModalBottomSheetState, stateRememberUpdatedState, null);
                composerStartRestartGroup.updateRememberedValue(axVarRememberedValue);
            }
            EffectsKt.LaunchedEffect(modalBottomSheetStateRememberModalBottomSheetState, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) axVarRememberedValue, composerStartRestartGroup, ModalBottomSheetState.$stable);
            com.waze.z.a.be.c(null, modalBottomSheetStateRememberModalBottomSheetState, ComposableLambdaKt.rememberComposableLambda(1051669663, true, new h.g.a.p() { // from class: com.waze.sharedrive.g.aq
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return bf.c(companion, aVar, aVar4, aVar2, str3, str4, qVar, str, str2, cVar, cVar2, (Composer) obj, iIntValue);
                }
            }, composerStartRestartGroup, 54), false, null, composerStartRestartGroup, (ModalBottomSheetState.$stable << 3) | DisplayStrings.DS_CATEGORY_SEARCH_AMENITIES_FILTER_CHARGING_STATION, 17);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h.g.a.p() { // from class: com.waze.sharedrive.g.ar
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    h.g.a.a aVar5 = aVar;
                    h.g.a.a aVar6 = aVar2;
                    h.g.a.a aVar7 = aVar3;
                    Modifier modifier3 = modifier2;
                    com.waze.ui.r.a.d.c cVar3 = cVar;
                    com.waze.ui.r.a.d.c cVar4 = cVar2;
                    int i10 = i2;
                    bf.d(str5, str6, str7, str8, aVar5, aVar6, aVar7, modifier3, cVar3, cVar4, qVar, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                    return h.ab.f48028a;
                }
            });
        }
    }

    static final h.ab e(String str, String str2, com.waze.ui.r.a.d.c cVar, com.waze.ui.r.a.d.c cVar2, int i2, Composer composer) {
        G(str, str2, cVar, cVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final String f(am amVar, boolean z, Composer composer) {
        String strB;
        h.g.b.x.f(amVar, "<this>");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(338533758, 48, -1, "com.waze.sharedrive.ui.getDisplayString (ShareDrivePreviewSheet.kt:62)");
        }
        if (amVar instanceof ak) {
            composer.startReplaceGroup(676109910);
            strB = com.waze.ui.r.a.c.c.d(true != z ? R.string.SHARE_DRIVE_PREVIEW_ETA_PS : R.string.SHARE_DRIVE_LIVE_DRIVE_MULTIPLE_PARTICIPANTS_DRIVER_SUBTITLE_PS, new Object[]{((ak) amVar).a()}, composer);
            composer.endReplaceGroup();
        } else if (h.g.b.x.n(amVar, al.f38631a)) {
            composer.startReplaceGroup(-1086559932);
            strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_VIEWING, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!h.g.b.x.n(amVar, aj.f38629a)) {
                composer.startReplaceGroup(-1086569955);
                composer.endReplaceGroup();
                throw new h.i();
            }
            composer.startReplaceGroup(-1086556412);
            strB = com.waze.ui.r.a.c.c.b(R.string.SHARE_DRIVE_LIVE_DRIVE_PARTICIPANT_STATUS_ARRIVED, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strB;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.waze.sharedrive.e.cc r10, h.g.a.a r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.g.bf.g(com.waze.sharedrive.e.cc, h.g.a.a, androidx.compose.runtime.Composer, int):void");
    }

    static final h.ab h(cb cbVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, int i2, Composer composer) {
        H(cbVar, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void i(com.waze.sharedrive.e.n nVar, h.g.a.a aVar, h.g.a.a aVar2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        h.g.b.x.f(nVar, "stateHolder");
        h.g.b.x.f(aVar, "onOpenLiveDrive");
        h.g.b.x.f(aVar2, "onCreateShareDrive");
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1818971264);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changed(nVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar2) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818971264, i3, -1, "com.waze.sharedrive.ui.ShareDriveButton (ShareDriveButton.kt:56)");
            }
            State stateCollectAsState = SnapshotStateKt.collectAsState(nVar.a(), null, composerStartRestartGroup, 0, 1);
            Modifier modifierA = com.waze.ui.r.a.d.d.a(BackgroundKt.m1972backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(PaddingKt.m2756paddingVpY3zN4(Modifier.Companion, 16.0f, 10.0f), 0.0f, 1, null), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(24.0f)), com.waze.bz.a.d(composerStartRestartGroup, 0).M(), null, 2, null), com.waze.ui.r.a.d.c.dn, null);
            boolean zChanged = ((i3 & 14) == 4) | composerStartRestartGroup.changed(stateCollectAsState);
            boolean z = (i3 & 112) == 32;
            boolean z2 = (i3 & DisplayStrings.DS_TAP_TO_VERIFY) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z2 | zChanged | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                an anVar = new an(nVar, aVar, aVar2, stateCollectAsState, 0);
                composerStartRestartGroup.updateRememberedValue(anVar);
                objRememberedValue = anVar;
            }
            Modifier modifierM2755padding3ABfNKs = PaddingKt.m2755padding3ABfNKs(com.waze.z.a.be.J(modifierA, false, null, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0, 15), 16.0f);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int iB = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2755padding3ABfNKs);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int iB2 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyRowMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap2, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB2), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier2, ComposeUiNode.Companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_t2_share, composerStartRestartGroup, 0), (String) null, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dq, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, Painter.$stable | DisplayStrings.DS_DIRT_ROADS, 120);
            Modifier modifierM2759paddingqDBjuR0$default = PaddingKt.m2759paddingqDBjuR0$default(Modifier.Companion, 16.0f, 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composerStartRestartGroup, 0);
            int iB3 = a.a.b(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM2759paddingqDBjuR0$default);
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
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap3, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            Updater.m7351setimpl(composerStartRestartGroup, Integer.valueOf(iB3), ComposeUiNode.Companion.getSetCompositeKeyHash());
            Updater.m7349reconcileimpl(composerStartRestartGroup, ComposeUiNode.Companion.getApplyOnDeactivatedNodeAssertion());
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier3, ComposeUiNode.Companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(true != ((Boolean) stateCollectAsState.getValue()).booleanValue() ? R.string.SHARE_DRIVE_ETA_BAR_SHARE_BUTTON_TITLE_UNSHARED : R.string.SHARE_DRIVE_ETA_BAR_SHARE_BUTTON_TITLE_SHARED, composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.f64do, null), com.waze.bz.a.d(composerStartRestartGroup, 0).o(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).g(), composerStartRestartGroup, 48, 0, 65528);
            composer2 = composerStartRestartGroup;
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(true != ((Boolean) stateCollectAsState.getValue()).booleanValue() ? R.string.SHARE_DRIVE_ETA_BAR_SHARE_BUTTON_SUBTITLE_UNSHARED : R.string.SHARE_DRIVE_ETA_BAR_SHARE_BUTTON_SUBTITLE_SHARED, composerStartRestartGroup, 0), com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.dp, null), com.waze.bz.a.d(composerStartRestartGroup, 0).p(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composerStartRestartGroup).n(), composer2, 48, 0, 65528);
            composer2.endNode();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.c.e.w(nVar, aVar, aVar2, i2, 20, null));
        }
    }

    public static /* synthetic */ h.ab k(com.waze.main_screen.l.b.j jVar, h.g.a.l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(69420225, i2, -1, "com.waze.sharedrive.ui.LiveShareScreenImpl.<anonymous>.<anonymous> (LiveShareScreen.kt:156)");
            }
            J(jVar, lVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab l(com.waze.main_screen.p.b.a.b.t tVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-410719061, i2, -1, "com.waze.sharedrive.ui.LiveShareScreenImpl.<anonymous>.<anonymous> (LiveShareScreen.kt:152)");
            }
            K(tVar, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab m(com.waze.main_screen.l.b.j jVar, h.g.a.l lVar, int i2, Composer composer) {
        J(jVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab n(com.waze.main_screen.p.b.a.b.t tVar, int i2, Composer composer) {
        K(tVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab o(com.waze.ui.p.i iVar, aa aaVar, h.g.a.l lVar, h.g.a.a aVar, h.g.a.l lVar2, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, int i2, Composer composer) {
        L(iVar, aaVar, lVar, aVar, lVar2, aVar2, aVar3, aVar4, aVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static final void p(h.g.a.l lVar, com.waze.sharedrive.e.at atVar, Composer composer, int i2) {
        int i3;
        com.waze.sharedrive.e.at atVar2;
        int i4;
        com.waze.sharedrive.e.at atVar3;
        int i5;
        State state;
        h.g.b.x.f(lVar, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(827769579);
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composerStartRestartGroup.changedInstance(lVar) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                i4 = i3 & (-113);
                CreationExtras creationExtrasF = org.chromium.support_lib_boundary.a.b.f(current);
                org.a.d.k.b bVarA = org.a.c.a.a(composerStartRestartGroup);
                int i6 = h.g.b.ar.f48106a;
                atVar3 = (com.waze.sharedrive.e.at) org.a.b.c.a.a(new h.g.b.m(com.waze.sharedrive.e.at.class), current.getViewModelStore(), creationExtrasF, bVarA, null);
            } else {
                i4 = i3 & (-113);
                composerStartRestartGroup.skipToGroupEnd();
                atVar3 = atVar;
            }
            int i7 = i4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(827769579, i7, -1, "com.waze.sharedrive.ui.LiveShareScreen (LiveShareScreen.kt:79)");
            }
            int i8 = i7 & 14;
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(atVar3.i(), (LifecycleOwner) null, (Lifecycle.State) null, (h.c.j) null, composerStartRestartGroup, 0, 7);
            com.waze.ui.z.at atVarD = I(stateCollectAsStateWithLifecycle).d();
            if (atVarD == null) {
                composerStartRestartGroup.startReplaceGroup(-1618431473);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1618431472);
                boolean zChanged = composerStartRestartGroup.changed(atVar3);
                boolean z = i8 == 4;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if ((zChanged | z) || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new com.waze.search.h.az(atVar3, lVar, 7);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                bh.j(atVarD, (h.g.a.a) objRememberedValue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            com.waze.ui.z.d dVarB = I(stateCollectAsStateWithLifecycle).b();
            String strB = dVarB != null ? dVarB.b() : null;
            if (strB == null) {
                composerStartRestartGroup.startReplaceGroup(-1618187286);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1618187285);
                boolean zChanged2 = composerStartRestartGroup.changed(atVar3);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new com.waze.bk.f(atVar3, 16);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                com.waze.ui.z.as.a(strB, (h.g.a.a) objRememberedValue2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composerStartRestartGroup, i8);
            Boolean boolValueOf = Boolean.valueOf(I(stateCollectAsStateWithLifecycle).e());
            boolean zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | composerStartRestartGroup.changed(stateRememberUpdatedState) | composerStartRestartGroup.changed(atVar3);
            x xVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || xVarRememberedValue == Composer.Companion.getEmpty()) {
                i5 = i7;
                state = stateCollectAsStateWithLifecycle;
                xVarRememberedValue = new x(atVar3, state, stateRememberUpdatedState, (h.c.e) null, 0);
                composerStartRestartGroup.updateRememberedValue(xVarRememberedValue);
            } else {
                state = stateCollectAsStateWithLifecycle;
                i5 = i7;
            }
            EffectsKt.LaunchedEffect(boolValueOf, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) xVarRememberedValue, composerStartRestartGroup, 0);
            aa aaVarI = I(state);
            com.waze.ui.p.i iVarF = com.waze.ui.p.t.f(atVar3.d().a(), null, composerStartRestartGroup, 2);
            boolean zChanged4 = composerStartRestartGroup.changed(atVar3);
            e eVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged4 || eVarRememberedValue == Composer.Companion.getEmpty()) {
                eVarRememberedValue = new e((Object) atVar3, 8, (char[][]) null);
                composerStartRestartGroup.updateRememberedValue(eVarRememberedValue);
            }
            h.l.f fVar = (h.l.f) eVarRememberedValue;
            boolean zChanged5 = composerStartRestartGroup.changed(atVar3);
            y yVarRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged5 || yVarRememberedValue == Composer.Companion.getEmpty()) {
                yVarRememberedValue = new y(atVar3, 0);
                composerStartRestartGroup.updateRememberedValue(yVarRememberedValue);
            }
            h.l.f fVar2 = (h.l.f) yVarRememberedValue;
            boolean zChanged6 = composerStartRestartGroup.changed(atVar3);
            e eVarRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged6 || eVarRememberedValue2 == Composer.Companion.getEmpty()) {
                eVarRememberedValue2 = new e((Object) atVar3, 9, (short[][]) null);
                composerStartRestartGroup.updateRememberedValue(eVarRememberedValue2);
            }
            h.l.f fVar3 = (h.l.f) eVarRememberedValue2;
            boolean zChanged7 = composerStartRestartGroup.changed(atVar3);
            e eVarRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged7 || eVarRememberedValue3 == Composer.Companion.getEmpty()) {
                eVarRememberedValue3 = new e((Object) atVar3, 10, (int[][]) null);
                composerStartRestartGroup.updateRememberedValue(eVarRememberedValue3);
            }
            h.l.f fVar4 = (h.l.f) eVarRememberedValue3;
            boolean zChanged8 = composerStartRestartGroup.changed(atVar3);
            e eVarRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged8 || eVarRememberedValue4 == Composer.Companion.getEmpty()) {
                eVarRememberedValue4 = new e(atVar3, 11, (boolean[][]) null);
                composerStartRestartGroup.updateRememberedValue(eVarRememberedValue4);
            }
            h.l.f fVar5 = (h.l.f) eVarRememberedValue4;
            h.g.a.a aVar = (h.g.a.a) fVar;
            h.g.a.l lVar2 = (h.g.a.l) fVar2;
            h.g.a.a aVar2 = (h.g.a.a) fVar3;
            h.g.a.a aVar3 = (h.g.a.a) fVar4;
            boolean zChanged9 = composerStartRestartGroup.changed(atVar3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged9 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = new com.waze.bk.f(atVar3, 17);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            L(iVarF, aaVarI, lVar, aVar, lVar2, aVar2, aVar3, (h.g.a.a) objRememberedValue3, (h.g.a.a) fVar5, composerStartRestartGroup, (i5 << 6) & DisplayStrings.DS_TAP_TO_VERIFY);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            atVar2 = atVar3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            atVar2 = atVar;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(lVar, atVar2, i2, 5, null));
        }
    }

    public static final void r(com.waze.sharedrive.e.r rVar, h.g.a.a aVar, Composer composer, int i2) {
        int i3;
        Composer composer2;
        State state;
        int i4;
        h.g.b.x.f(rVar, "stateHolder");
        h.g.b.x.f(aVar, "onOpenLiveShareDrive");
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-690713177);
        int i6 = 4;
        if (i5 == 0) {
            i3 = (true != composerStartRestartGroup.changed(rVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-690713177, i3, -1, "com.waze.sharedrive.ui.JoinSharePreviewSheet (JoinSharePreviewSheet.kt:48)");
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(rVar.a(), (LifecycleOwner) null, (Lifecycle.State) null, (h.c.j) null, composerStartRestartGroup, 0, 7);
            s sVarA = M(stateCollectAsStateWithLifecycle).a();
            int i7 = i3 & 14;
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle) | (i7 == 4);
            boolean z = (i3 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((z || zChanged) || objRememberedValue == Composer.Companion.getEmpty()) {
                state = stateCollectAsStateWithLifecycle;
                i4 = 0;
                objRememberedValue = (h.g.a.p) new x(rVar, aVar, state, (h.c.e) null, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                i4 = 0;
                state = stateCollectAsStateWithLifecycle;
            }
            EffectsKt.LaunchedEffect(sVarA, (h.g.a.p<? super kotlinx.coroutines.af, ? super h.c.e<? super h.ab>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4);
            t tVarM = M(state);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.l.f) new e(rVar, 5, (boolean[]) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (h.l.f) new y(rVar, 1, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            h.g.a.l lVar = (h.g.a.l) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (h.l.f) new e(rVar, 6, (float[]) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i7 == 4 || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = (h.l.f) new e((Object) rVar, 7, (byte[][]) null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            N(tVarM, aVar2, lVar, aVar3, (h.g.a.a) objRememberedValue5, composerStartRestartGroup, 0);
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new com.waze.copilot.presentation.c(rVar, aVar, i2, i6));
        }
    }

    static final h.ab s(t tVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        N(tVar, aVar, lVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab t(t tVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        N(tVar, aVar, lVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab u(t tVar, h.g.a.a aVar, h.g.a.l lVar, h.g.a.a aVar2, h.g.a.a aVar3, int i2, Composer composer) {
        N(tVar, aVar, lVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    public static /* synthetic */ h.ab v(k kVar, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, BoxScope boxScope, Composer composer, int i2) {
        h.g.b.x.f(boxScope, "$this$SingleParticipantPreviewContent");
        if ((i2 & 6) == 0) {
            i2 |= true != composer.changed(boxScope) ? 2 : 4;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1297614295, i2, -1, "com.waze.sharedrive.ui.CreateSharePreviewSheetContent.<anonymous>.<anonymous>.<anonymous> (CreateSharePreviewSheet.kt:139)");
            }
            boolean zChanged = composer.changed(kVar) | composer.changedInstance(context) | composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                com.waze.nav_connect.b.ab abVar = new com.waze.nav_connect.b.ab(kVar, context, managedActivityResultLauncher, 5, (char[]) null);
                composer.updateRememberedValue(abVar);
                objRememberedValue = abVar;
            }
            P((h.g.a.a) objRememberedValue, com.waze.ui.r.a.d.d.a(boxScope.align(Modifier.Companion, Alignment.Companion.getTopEnd()), com.waze.ui.r.a.d.c.du, null), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(com.waze.sharedrive.e.f r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sharedrive.g.bf.w(com.waze.sharedrive.e.f, androidx.compose.runtime.Composer, int):void");
    }

    static final h.ab x(k kVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, int i2, Composer composer) {
        O(kVar, aVar, aVar2, aVar3, aVar4, aVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab y(k kVar, h.g.a.a aVar, h.g.a.a aVar2, h.g.a.a aVar3, h.g.a.a aVar4, h.g.a.a aVar5, int i2, Composer composer) {
        O(kVar, aVar, aVar2, aVar3, aVar4, aVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }

    static final h.ab z(h.g.a.a aVar, Modifier modifier, int i2, Composer composer) {
        P(aVar, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return h.ab.f48028a;
    }
}
