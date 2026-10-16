package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuAreaKt {
    public static final void ContextMenu(final ContextMenuState contextMenuState, final a<ab> aVar, Modifier modifier, final l<? super ContextMenuScope, ab> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        final l<? super ContextMenuScope, ab> lVar2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        p<? super Composer, ? super Integer, ab> pVar;
        int i5 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-195055274);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(contextMenuState) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(aVar) ? 16 : 32;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(modifier) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            lVar2 = lVar;
            i4 |= true != composerStartRestartGroup.changedInstance(lVar2) ? 1024 : 2048;
        } else {
            lVar2 = lVar;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i6 != 0) {
                modifier = Modifier.Companion;
            }
            final Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-195055274, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.kt:73)");
            }
            ContextMenuState.Status status = contextMenuState.getStatus();
            if (!(status instanceof ContextMenuState.Status.Open)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    pVar = new p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuAreaKt$$ExternalSyntheticLambda4
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return ContextMenuAreaKt.ContextMenu$lambda$0(contextMenuState, aVar, modifier3, lVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(pVar);
                }
                return;
            }
            ContextMenuState.Status.Open open = (ContextMenuState.Status.Open) status;
            boolean zChanged = composerStartRestartGroup.changed(open);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                ContextMenuPopupPositionProvider contextMenuPopupPositionProvider = new ContextMenuPopupPositionProvider(IntOffsetKt.m11313roundk4lQ0M(open.m2110getOffsetF1C5BW0()), (p) null, 2, (o) null);
                composerStartRestartGroup.updateRememberedValue(contextMenuPopupPositionProvider);
                objRememberedValue = contextMenuPopupPositionProvider;
            }
            ContextMenuUiKt.ContextMenuPopup((ContextMenuPopupPositionProvider) objRememberedValue, aVar, modifier3, lVar, composerStartRestartGroup, i4 & 8176, 0);
            modifier2 = modifier3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            pVar = new p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuAreaKt$$ExternalSyntheticLambda5
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenuAreaKt.ContextMenu$lambda$2(contextMenuState, aVar, modifier2, lVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(pVar);
        }
    }

    static final ab ContextMenu$lambda$0(ContextMenuState contextMenuState, a aVar, Modifier modifier, l lVar, int i2, int i3, Composer composer, int i4) {
        ContextMenu(contextMenuState, aVar, modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ContextMenu$lambda$2(ContextMenuState contextMenuState, a aVar, Modifier modifier, l lVar, int i2, int i3, Composer composer, int i4) {
        ContextMenu(contextMenuState, aVar, modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuArea(final androidx.compose.foundation.contextmenu.ContextMenuState r18, final h.g.a.a<h.ab> r19, final h.g.a.l<? super androidx.compose.foundation.contextmenu.ContextMenuScope, h.ab> r20, androidx.compose.ui.Modifier r21, boolean r22, h.g.a.a<h.ab> r23, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuAreaKt.ContextMenuArea(androidx.compose.foundation.contextmenu.ContextMenuState, h.g.a.a, h.g.a.l, androidx.compose.ui.Modifier, boolean, h.g.a.a, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ContextMenuArea$lambda$1$0(a aVar, ContextMenuState contextMenuState, Offset offset) {
        aVar.invoke();
        contextMenuState.setStatus(new ContextMenuState.Status.Open(offset.m7990unboximpl(), null));
        return ab.f48028a;
    }

    static final ab ContextMenuArea$lambda$3(ContextMenuState contextMenuState, a aVar, l lVar, Modifier modifier, boolean z, a aVar2, p pVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuArea(contextMenuState, aVar, lVar, modifier, z, aVar2, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }
}
