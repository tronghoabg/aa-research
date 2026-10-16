package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import h.ab;
import h.g.a.a;
import h.g.a.p;
import h.g.a.q;
import h.g.a.v;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuScope {
    public static final int $stable = 0;
    private final SnapshotStateList<q<ContextMenuColors, Composer, Integer, ab>> composables = SnapshotStateKt.mutableStateListOf();
    private final v<Modifier, String, Boolean, ContextMenuColors, q<? super Color, ? super Composer, ? super Integer, ab>, a<ab>, Composer, Integer, ab> itemUi;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextMenuScope(v<? super Modifier, ? super String, ? super Boolean, ? super ContextMenuColors, ? super q<? super Color, ? super Composer, ? super Integer, ab>, ? super a<ab>, ? super Composer, ? super Integer, ab> vVar) {
        this.itemUi = vVar;
    }

    static final ab Content$lambda$1(ContextMenuScope contextMenuScope, ContextMenuColors contextMenuColors, int i2, Composer composer, int i3) {
        contextMenuScope.Content$foundation(contextMenuColors, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static /* synthetic */ void item$default(ContextMenuScope contextMenuScope, p pVar, Modifier modifier, boolean z, q qVar, a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        boolean z2 = (!((i2 & 4) == 0)) | z;
        if ((i2 & 8) != 0) {
            qVar = null;
        }
        contextMenuScope.item(pVar, modifier2, z2, qVar, aVar);
    }

    static final ab item$lambda$0(p pVar, ContextMenuScope contextMenuScope, Modifier modifier, boolean z, q qVar, a aVar, ContextMenuColors contextMenuColors, Composer composer, int i2) {
        int i3;
        if ((i2 & 6) == 0) {
            i3 = i2 | (true != composer.changed(contextMenuColors) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if (composer.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1789283891, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.kt:297)");
            }
            String str = (String) pVar.invoke(composer, 0);
            if (o.G(str)) {
                InlineClassHelperKt.throwIllegalStateException("Label must not be blank");
            }
            contextMenuScope.itemUi.invoke(modifier, str, Boolean.valueOf(z), contextMenuColors, qVar, aVar, composer, Integer.valueOf((i3 << 9) & 7168));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public final void Content$foundation(final ContextMenuColors contextMenuColors, Composer composer, final int i2) {
        int i3 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-798501095);
        int i4 = i3 == 0 ? (true != composerStartRestartGroup.changed(contextMenuColors) ? 2 : 4) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(this) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-798501095, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.kt:255)");
            }
            SnapshotStateList<q<ContextMenuColors, Composer, Integer, ab>> snapshotStateList = this.composables;
            int size = snapshotStateList.size();
            for (int i5 = 0; i5 < size; i5++) {
                snapshotStateList.get(i5).invoke(contextMenuColors, composerStartRestartGroup, Integer.valueOf(i4 & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$$ExternalSyntheticLambda1
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenuScope.Content$lambda$1(this.f$0, contextMenuColors, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void clear$foundation() {
        this.composables.clear();
    }

    public final void item(final p<? super Composer, ? super Integer, String> pVar, final Modifier modifier, final boolean z, final q<? super Color, ? super Composer, ? super Integer, ab> qVar, final a<ab> aVar) {
        this.composables.add(ComposableLambdaKt.composableLambdaInstance(-1789283891, true, new q() { // from class: androidx.compose.foundation.contextmenu.ContextMenuScope$$ExternalSyntheticLambda0
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContextMenuScope.item$lambda$0(pVar, this, modifier, z, qVar, aVar, (ContextMenuColors) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    public final void separator() {
        this.composables.add(ComposableSingletons$ContextMenuUiKt.INSTANCE.m2087getLambda$1455401925$foundation());
    }
}
