package androidx.compose.foundation.text;

import android.content.res.Resources;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import h.ab;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    public static final void ContextMenuArea(final TextFieldSelectionState textFieldSelectionState, final boolean z, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-579239002);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579239002, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:43)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionState, z, pVar, composerStartRestartGroup, i3 & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenu_androidKt.ContextMenuArea$lambda$1(textFieldSelectionState, z, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ContextMenuArea$lambda$0(TextFieldSelectionManager textFieldSelectionManager, p pVar, int i2, Composer composer, int i3) {
        ContextMenuArea(textFieldSelectionManager, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ContextMenuArea$lambda$1(TextFieldSelectionState textFieldSelectionState, boolean z, p pVar, int i2, Composer composer, int i3) {
        ContextMenuArea(textFieldSelectionState, z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    static final ab ContextMenuArea$lambda$2(SelectionManager selectionManager, p pVar, int i2, Composer composer, int i3) {
        ContextMenuArea(selectionManager, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void textItem(TextContextMenuBuilderScope textContextMenuBuilderScope, Resources resources, TextContextMenuItems textContextMenuItems, boolean z, l<? super TextContextMenuSession, ab> lVar) {
        if (z) {
            TextContextMenuBuilderScope_androidKt.item(textContextMenuBuilderScope, textContextMenuItems.getKey(), resources.getString(textContextMenuItems.m3378getStringId9Hzcbyc()), textContextMenuItems.m3377getDrawableId3I4p1mQ(), lVar);
        }
    }

    public static final void ContextMenuArea(final SelectionManager selectionManager, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-954926513);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(selectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-954926513, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:49)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(selectionManager, pVar, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenu_androidKt.ContextMenuArea$lambda$2(selectionManager, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(2080741862);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2080741862, i3, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            CommonContextMenuAreaKt.CommonContextMenuArea(textFieldSelectionManager, pVar, composerStartRestartGroup, i3 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenu_androidKt.ContextMenuArea$lambda$0(textFieldSelectionManager, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
